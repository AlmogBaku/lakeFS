/*
 * lakeFS API
 * lakeFS HTTP API
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.lakefs.clients.api;

import io.lakefs.clients.api.ApiException;
import io.lakefs.clients.api.model.CommitList;
import io.lakefs.clients.api.model.DiffList;
import io.lakefs.clients.api.model.Error;
import io.lakefs.clients.api.model.Merge;
import io.lakefs.clients.api.model.MergeResult;
import io.lakefs.clients.api.model.RefsDump;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RefsApi
 */
@Ignore
public class RefsApiTest {

    private final RefsApi api = new RefsApi();

    
    /**
     * diff references
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void diffRefsTest() throws ApiException {
        String repository = null;
        String leftRef = null;
        String rightRef = null;
        String after = null;
        Integer amount = null;
        String type = null;
        String diffType = null;
        DiffList response = api.diffRefs(repository, leftRef, rightRef, after, amount, type, diffType);

        // TODO: test validations
    }
    
    /**
     * Dump repository refs (tags, commits, branches) to object store
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dumpRefsTest() throws ApiException {
        String repository = null;
        RefsDump response = api.dumpRefs(repository);

        // TODO: test validations
    }
    
    /**
     * get commit log from ref
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void logCommitsTest() throws ApiException {
        String repository = null;
        String ref = null;
        String after = null;
        Integer amount = null;
        CommitList response = api.logCommits(repository, ref, after, amount);

        // TODO: test validations
    }
    
    /**
     * merge references
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeIntoBranchTest() throws ApiException {
        String repository = null;
        String sourceRef = null;
        String destinationBranch = null;
        Merge merge = null;
        MergeResult response = api.mergeIntoBranch(repository, sourceRef, destinationBranch, merge);

        // TODO: test validations
    }
    
    /**
     * Restore repository refs (tags, commits, branches) from object store
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void restoreRefsTest() throws ApiException {
        String repository = null;
        RefsDump refsDump = null;
        api.restoreRefs(repository, refsDump);

        // TODO: test validations
    }
    
}
