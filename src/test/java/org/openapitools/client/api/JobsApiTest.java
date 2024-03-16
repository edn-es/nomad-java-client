/*
 * Nomad
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.7.6
 * Contact: support@hashicorp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.AllocationListStub;
import org.openapitools.client.model.Deployment;
import org.openapitools.client.model.Evaluation;
import org.openapitools.client.model.Job;
import org.openapitools.client.model.JobDeregisterResponse;
import org.openapitools.client.model.JobDispatchRequest;
import org.openapitools.client.model.JobDispatchResponse;
import org.openapitools.client.model.JobEvaluateRequest;
import org.openapitools.client.model.JobListStub;
import org.openapitools.client.model.JobPlanRequest;
import org.openapitools.client.model.JobPlanResponse;
import org.openapitools.client.model.JobRegisterRequest;
import org.openapitools.client.model.JobRegisterResponse;
import org.openapitools.client.model.JobRevertRequest;
import org.openapitools.client.model.JobScaleStatusResponse;
import org.openapitools.client.model.JobStabilityRequest;
import org.openapitools.client.model.JobStabilityResponse;
import org.openapitools.client.model.JobSummary;
import org.openapitools.client.model.JobValidateRequest;
import org.openapitools.client.model.JobValidateResponse;
import org.openapitools.client.model.JobVersionsResponse;
import org.openapitools.client.model.JobsParseRequest;
import org.openapitools.client.model.PeriodicForceResponse;
import org.openapitools.client.model.ScalingRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobsApi
 */
@Ignore
public class JobsApiTest {

    private final JobsApi api = new JobsApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteJobTest() throws ApiException {
        String jobName = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        Boolean purge = null;
        Boolean global = null;
        JobDeregisterResponse response = api.deleteJob(jobName, region, namespace, xNomadToken, idempotencyToken, purge, global);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobTest() throws ApiException {
        String jobName = null;
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        Job response = api.getJob(jobName, region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobAllocationsTest() throws ApiException {
        String jobName = null;
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        Boolean all = null;
        List<AllocationListStub> response = api.getJobAllocations(jobName, region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken, all);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobDeploymentTest() throws ApiException {
        String jobName = null;
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        Deployment response = api.getJobDeployment(jobName, region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobDeploymentsTest() throws ApiException {
        String jobName = null;
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        Integer all = null;
        List<Deployment> response = api.getJobDeployments(jobName, region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken, all);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobEvaluationsTest() throws ApiException {
        String jobName = null;
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        List<Evaluation> response = api.getJobEvaluations(jobName, region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobScaleStatusTest() throws ApiException {
        String jobName = null;
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        JobScaleStatusResponse response = api.getJobScaleStatus(jobName, region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobSummaryTest() throws ApiException {
        String jobName = null;
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        JobSummary response = api.getJobSummary(jobName, region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobVersionsTest() throws ApiException {
        String jobName = null;
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        Boolean diffs = null;
        JobVersionsResponse response = api.getJobVersions(jobName, region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken, diffs);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobsTest() throws ApiException {
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        List<JobListStub> response = api.getJobs(region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postJobTest() throws ApiException {
        String jobName = null;
        JobRegisterRequest jobRegisterRequest = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        JobRegisterResponse response = api.postJob(jobName, jobRegisterRequest, region, namespace, xNomadToken, idempotencyToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postJobDispatchTest() throws ApiException {
        String jobName = null;
        JobDispatchRequest jobDispatchRequest = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        JobDispatchResponse response = api.postJobDispatch(jobName, jobDispatchRequest, region, namespace, xNomadToken, idempotencyToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postJobEvaluateTest() throws ApiException {
        String jobName = null;
        JobEvaluateRequest jobEvaluateRequest = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        JobRegisterResponse response = api.postJobEvaluate(jobName, jobEvaluateRequest, region, namespace, xNomadToken, idempotencyToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postJobParseTest() throws ApiException {
        JobsParseRequest jobsParseRequest = null;
        Job response = api.postJobParse(jobsParseRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postJobPeriodicForceTest() throws ApiException {
        String jobName = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        PeriodicForceResponse response = api.postJobPeriodicForce(jobName, region, namespace, xNomadToken, idempotencyToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postJobPlanTest() throws ApiException {
        String jobName = null;
        JobPlanRequest jobPlanRequest = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        JobPlanResponse response = api.postJobPlan(jobName, jobPlanRequest, region, namespace, xNomadToken, idempotencyToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postJobRevertTest() throws ApiException {
        String jobName = null;
        JobRevertRequest jobRevertRequest = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        JobRegisterResponse response = api.postJobRevert(jobName, jobRevertRequest, region, namespace, xNomadToken, idempotencyToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postJobScalingRequestTest() throws ApiException {
        String jobName = null;
        ScalingRequest scalingRequest = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        JobRegisterResponse response = api.postJobScalingRequest(jobName, scalingRequest, region, namespace, xNomadToken, idempotencyToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postJobStabilityTest() throws ApiException {
        String jobName = null;
        JobStabilityRequest jobStabilityRequest = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        JobStabilityResponse response = api.postJobStability(jobName, jobStabilityRequest, region, namespace, xNomadToken, idempotencyToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postJobValidateRequestTest() throws ApiException {
        JobValidateRequest jobValidateRequest = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        JobValidateResponse response = api.postJobValidateRequest(jobValidateRequest, region, namespace, xNomadToken, idempotencyToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerJobTest() throws ApiException {
        JobRegisterRequest jobRegisterRequest = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        JobRegisterResponse response = api.registerJob(jobRegisterRequest, region, namespace, xNomadToken, idempotencyToken);

        // TODO: test validations
    }
    
}