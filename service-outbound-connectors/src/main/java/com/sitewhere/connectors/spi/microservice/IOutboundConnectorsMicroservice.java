/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.connectors.spi.microservice;

import com.sitewhere.grpc.client.spi.client.IDeviceEventManagementApiDemux;
import com.sitewhere.grpc.client.spi.client.IDeviceManagementApiDemux;
import com.sitewhere.spi.microservice.MicroserviceIdentifier;
import com.sitewhere.spi.microservice.multitenant.IMultitenantMicroservice;

/**
 * Microservice that provides outbound event connectors functionality.
 * 
 * @author Derek
 */
public interface IOutboundConnectorsMicroservice
	extends IMultitenantMicroservice<MicroserviceIdentifier, IOutboundConnectorsTenantEngine> {

    /**
     * Get device management API demux.
     * 
     * @return
     */
    public IDeviceManagementApiDemux getDeviceManagementApiDemux();

    /**
     * Get event management API demux.
     * 
     * @return
     */
    public IDeviceEventManagementApiDemux getDeviceEventManagementApiDemux();
}