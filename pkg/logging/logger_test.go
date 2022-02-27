package logging

import (
	"io"
	"io/ioutil"
	"os"
	"path/filepath"
	"testing"
)

func TestSetOutputs(t *testing.T) {
	t.Run("default", func(t *testing.T) {
		SetOutputs(nil)
		if defaultLogger.Out != os.Stderr {
			t.Error("Logger output should be stderr by default")
		}
	})

	t.Run("stdout", func(t *testing.T) {
		SetOutputs([]string{"-"})
		if defaultLogger.Out != os.Stdout {
			t.Error("Logger output should be stdout")
		}
	})

	t.Run("stderr", func(t *testing.T) {
		SetOutputs([]string{"="})
		if defaultLogger.Out != os.Stderr {
			t.Error("Logger output should be stderr")
		}
	})

	t.Run("write_two_files", func(t *testing.T) {
		logDir := t.TempDir()
		log1 := filepath.Join(logDir, "file1.log")
		log2 := filepath.Join(logDir, "file2.log")
		SetOutputs([]string{log1, log2})
		const content = "hello log"
		_, err := io.WriteString(defaultLogger.Out, content)
		if err != nil {
			t.Fatal("Failed to write to log output with two outputs", err)
		}

		log1Content, err := ioutil.ReadFile(log1)
		if err != nil {
			t.Fatal("Failed to read log1 content", err)
		}
		if string(log1Content) != content {
			t.Fatalf("Log1 content '%s', is not as expected: '%s'", string(log1Content), content)
		}

		log2Content, err := ioutil.ReadFile(log2)
		if err != nil {
			t.Fatal("Failed to read log1 content", err)
		}
		if string(log2Content) != content {
			t.Fatalf("Log1 content '%s', is not as expected: '%s'", string(log2Content), content)
		}
	})
}
