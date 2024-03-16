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
import org.openapitools.client.model.CSISnapshotCreateRequest;
import org.openapitools.client.model.CSISnapshotCreateResponse;
import org.openapitools.client.model.CSISnapshotListResponse;
import org.openapitools.client.model.CSIVolume;
import org.openapitools.client.model.CSIVolumeCreateRequest;
import org.openapitools.client.model.CSIVolumeListExternalResponse;
import org.openapitools.client.model.CSIVolumeListStub;
import org.openapitools.client.model.CSIVolumeRegisterRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VolumesApi
 */
@Ignore
public class VolumesApiTest {

    private final VolumesApi api = new VolumesApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createVolumeTest() throws ApiException {
        String volumeId = null;
        String action = null;
        CSIVolumeCreateRequest csIVolumeCreateRequest = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        api.createVolume(volumeId, action, csIVolumeCreateRequest, region, namespace, xNomadToken, idempotencyToken);

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
    public void deleteSnapshotTest() throws ApiException {
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        String pluginId = null;
        String snapshotId = null;
        api.deleteSnapshot(region, namespace, xNomadToken, idempotencyToken, pluginId, snapshotId);

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
    public void deleteVolumeRegistrationTest() throws ApiException {
        String volumeId = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        String force = null;
        api.deleteVolumeRegistration(volumeId, region, namespace, xNomadToken, idempotencyToken, force);

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
    public void detachOrDeleteVolumeTest() throws ApiException {
        String volumeId = null;
        String action = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        String node = null;
        api.detachOrDeleteVolume(volumeId, action, region, namespace, xNomadToken, idempotencyToken, node);

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
    public void getExternalVolumesTest() throws ApiException {
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        String pluginId = null;
        CSIVolumeListExternalResponse response = api.getExternalVolumes(region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken, pluginId);

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
    public void getSnapshotsTest() throws ApiException {
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        String pluginId = null;
        CSISnapshotListResponse response = api.getSnapshots(region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken, pluginId);

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
    public void getVolumeTest() throws ApiException {
        String volumeId = null;
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        CSIVolume response = api.getVolume(volumeId, region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken);

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
    public void getVolumesTest() throws ApiException {
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        String nodeId = null;
        String pluginId = null;
        String type = null;
        List<CSIVolumeListStub> response = api.getVolumes(region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken, nodeId, pluginId, type);

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
    public void postSnapshotTest() throws ApiException {
        CSISnapshotCreateRequest csISnapshotCreateRequest = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        CSISnapshotCreateResponse response = api.postSnapshot(csISnapshotCreateRequest, region, namespace, xNomadToken, idempotencyToken);

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
    public void postVolumeTest() throws ApiException {
        CSIVolumeRegisterRequest csIVolumeRegisterRequest = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        api.postVolume(csIVolumeRegisterRequest, region, namespace, xNomadToken, idempotencyToken);

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
    public void postVolumeRegistrationTest() throws ApiException {
        String volumeId = null;
        CSIVolumeRegisterRequest csIVolumeRegisterRequest = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        api.postVolumeRegistration(volumeId, csIVolumeRegisterRequest, region, namespace, xNomadToken, idempotencyToken);

        // TODO: test validations
    }
    
}