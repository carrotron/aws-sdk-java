/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lightsail;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.lightsail.model.*;

/**
 * Interface for accessing Amazon Lightsail.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lightsail.AbstractAmazonLightsail} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Lightsail is the easiest way to get started with AWS for developers who just need virtual private servers.
 * Lightsail includes everything you need to launch your project quickly - a virtual machine, SSD-based storage, data
 * transfer, DNS management, and a static IP - for a low, predictable price. You manage those Lightsail servers through
 * the Lightsail console or by using the API or command-line interface (CLI).
 * </p>
 * <p>
 * For more information about Lightsail concepts and tasks, see the <a
 * href="https://lightsail.aws.amazon.com/ls/docs/all">Lightsail Dev Guide</a>.
 * </p>
 * <p>
 * To use the Lightsail API or the CLI, you will need to use AWS Identity and Access Management (IAM) to generate access
 * keys. For details about how to set this up, see the <a href=
 * "http://lightsail.aws.amazon.com/ls/docs/how-to/article/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonLightsail {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "lightsail";

    /**
     * Overrides the default endpoint for this client ("lightsail.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "lightsail.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "lightsail.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol
     * from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "lightsail.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "lightsail.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonLightsail#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See
     *        {@link com.amazonaws.regions.Region#getRegion(com.amazonaws.regions.Regions)} for accessing a given
     *        region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see com.amazonaws.regions.Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(com.amazonaws.regions.Region region);

    /**
     * <p>
     * Allocates a static IP address.
     * </p>
     * 
     * @param allocateStaticIpRequest
     * @return Result of the AllocateStaticIp operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.AllocateStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AllocateStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    AllocateStaticIpResult allocateStaticIp(AllocateStaticIpRequest allocateStaticIpRequest);

    /**
     * <p>
     * Attaches a static IP address to a specific Amazon Lightsail instance.
     * </p>
     * 
     * @param attachStaticIpRequest
     * @return Result of the AttachStaticIp operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.AttachStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    AttachStaticIpResult attachStaticIp(AttachStaticIpRequest attachStaticIpRequest);

    /**
     * <p>
     * Closes the public ports on a specific Amazon Lightsail instance.
     * </p>
     * 
     * @param closeInstancePublicPortsRequest
     * @return Result of the CloseInstancePublicPorts operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CloseInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CloseInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    CloseInstancePublicPortsResult closeInstancePublicPorts(CloseInstancePublicPortsRequest closeInstancePublicPortsRequest);

    /**
     * <p>
     * Creates a domain resource for the specified domain (e.g., example.com).
     * </p>
     * 
     * @param createDomainRequest
     * @return Result of the CreateDomain operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDomainResult createDomain(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * Creates one of the following entry records associated with the domain: A record, CNAME record, TXT record, or MX
     * record.
     * </p>
     * 
     * @param createDomainEntryRequest
     * @return Result of the CreateDomainEntry operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDomainEntryResult createDomainEntry(CreateDomainEntryRequest createDomainEntryRequest);

    /**
     * <p>
     * Creates a snapshot of a specific virtual private server, or <i>instance</i>. You can use a snapshot to create a
     * new instance that is based on that snapshot.
     * </p>
     * 
     * @param createInstanceSnapshotRequest
     * @return Result of the CreateInstanceSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstanceSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    CreateInstanceSnapshotResult createInstanceSnapshot(CreateInstanceSnapshotRequest createInstanceSnapshotRequest);

    /**
     * <p>
     * Creates one or more Amazon Lightsail virtual private servers, or <i>instances</i>.
     * </p>
     * 
     * @param createInstancesRequest
     * @return Result of the CreateInstances operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstances" target="_top">AWS API
     *      Documentation</a>
     */
    CreateInstancesResult createInstances(CreateInstancesRequest createInstancesRequest);

    /**
     * <p>
     * Uses a specific snapshot as a blueprint for creating one or more new instances that are based on that identical
     * configuration.
     * </p>
     * 
     * @param createInstancesFromSnapshotRequest
     * @return Result of the CreateInstancesFromSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateInstancesFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstancesFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    CreateInstancesFromSnapshotResult createInstancesFromSnapshot(CreateInstancesFromSnapshotRequest createInstancesFromSnapshotRequest);

    /**
     * <p>
     * Creates sn SSH key pair.
     * </p>
     * 
     * @param createKeyPairRequest
     * @return Result of the CreateKeyPair operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    CreateKeyPairResult createKeyPair(CreateKeyPairRequest createKeyPairRequest);

    /**
     * <p>
     * Deletes the specified domain recordset and all of its domain records.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return Result of the DeleteDomain operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDomainResult deleteDomain(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * Deletes a specific domain entry.
     * </p>
     * 
     * @param deleteDomainEntryRequest
     * @return Result of the DeleteDomainEntry operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDomainEntryResult deleteDomainEntry(DeleteDomainEntryRequest deleteDomainEntryRequest);

    /**
     * <p>
     * Deletes a specific Amazon Lightsail virtual private server, or <i>instance</i>.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @return Result of the DeleteInstance operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteInstanceResult deleteInstance(DeleteInstanceRequest deleteInstanceRequest);

    /**
     * <p>
     * Deletes a specific snapshot of a virtual private server (or <i>instance</i>).
     * </p>
     * 
     * @param deleteInstanceSnapshotRequest
     * @return Result of the DeleteInstanceSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteInstanceSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteInstanceSnapshotResult deleteInstanceSnapshot(DeleteInstanceSnapshotRequest deleteInstanceSnapshotRequest);

    /**
     * <p>
     * Deletes a specific SSH key pair.
     * </p>
     * 
     * @param deleteKeyPairRequest
     * @return Result of the DeleteKeyPair operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteKeyPairResult deleteKeyPair(DeleteKeyPairRequest deleteKeyPairRequest);

    /**
     * <p>
     * Detaches a static IP from the Amazon Lightsail instance to which it is attached.
     * </p>
     * 
     * @param detachStaticIpRequest
     * @return Result of the DetachStaticIp operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DetachStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    DetachStaticIpResult detachStaticIp(DetachStaticIpRequest detachStaticIpRequest);

    /**
     * <p>
     * Downloads the default SSH key pair from the user's account.
     * </p>
     * 
     * @param downloadDefaultKeyPairRequest
     * @return Result of the DownloadDefaultKeyPair operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DownloadDefaultKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DownloadDefaultKeyPair"
     *      target="_top">AWS API Documentation</a>
     */
    DownloadDefaultKeyPairResult downloadDefaultKeyPair(DownloadDefaultKeyPairRequest downloadDefaultKeyPairRequest);

    /**
     * <p>
     * Returns the names of all active (not deleted) resources.
     * </p>
     * 
     * @param getActiveNamesRequest
     * @return Result of the GetActiveNames operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetActiveNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetActiveNames" target="_top">AWS API
     *      Documentation</a>
     */
    GetActiveNamesResult getActiveNames(GetActiveNamesRequest getActiveNamesRequest);

    /**
     * <p>
     * Returns the list of available instance images, or <i>blueprints</i>. You can use a blueprint to create a new
     * virtual private server already running a specific operating system, as well as a preinstalled app or development
     * stack. The software each instance is running depends on the blueprint image you choose.
     * </p>
     * 
     * @param getBlueprintsRequest
     * @return Result of the GetBlueprints operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBlueprints" target="_top">AWS API
     *      Documentation</a>
     */
    GetBlueprintsResult getBlueprints(GetBlueprintsRequest getBlueprintsRequest);

    /**
     * <p>
     * Returns the list of bundles that are available for purchase. A bundle describes the specs for your virtual
     * private server (or <i>instance</i>).
     * </p>
     * 
     * @param getBundlesRequest
     * @return Result of the GetBundles operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBundles" target="_top">AWS API
     *      Documentation</a>
     */
    GetBundlesResult getBundles(GetBundlesRequest getBundlesRequest);

    /**
     * <p>
     * Returns information about a specific domain recordset.
     * </p>
     * 
     * @param getDomainRequest
     * @return Result of the GetDomain operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDomain" target="_top">AWS API
     *      Documentation</a>
     */
    GetDomainResult getDomain(GetDomainRequest getDomainRequest);

    /**
     * <p>
     * Returns a list of all domains in the user's account.
     * </p>
     * 
     * @param getDomainsRequest
     * @return Result of the GetDomains operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDomains" target="_top">AWS API
     *      Documentation</a>
     */
    GetDomainsResult getDomains(GetDomainsRequest getDomainsRequest);

    /**
     * <p>
     * Returns information about a specific Amazon Lightsail instance, which is a virtual private server.
     * </p>
     * 
     * @param getInstanceRequest
     * @return Result of the GetInstance operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstance" target="_top">AWS API
     *      Documentation</a>
     */
    GetInstanceResult getInstance(GetInstanceRequest getInstanceRequest);

    /**
     * <p>
     * Returns temporary SSH keys you can use to connect to a specific virtual private server, or <i>instance</i>.
     * </p>
     * 
     * @param getInstanceAccessDetailsRequest
     * @return Result of the GetInstanceAccessDetails operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstanceAccessDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceAccessDetails"
     *      target="_top">AWS API Documentation</a>
     */
    GetInstanceAccessDetailsResult getInstanceAccessDetails(GetInstanceAccessDetailsRequest getInstanceAccessDetailsRequest);

    /**
     * <p>
     * Returns the data points for the specified Amazon Lightsail instance metric, given an instance name.
     * </p>
     * 
     * @param getInstanceMetricDataRequest
     * @return Result of the GetInstanceMetricData operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstanceMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    GetInstanceMetricDataResult getInstanceMetricData(GetInstanceMetricDataRequest getInstanceMetricDataRequest);

    /**
     * <p>
     * Returns the port states for a specific virtual private server, or <i>instance</i>.
     * </p>
     * 
     * @param getInstancePortStatesRequest
     * @return Result of the GetInstancePortStates operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstancePortStates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstancePortStates"
     *      target="_top">AWS API Documentation</a>
     */
    GetInstancePortStatesResult getInstancePortStates(GetInstancePortStatesRequest getInstancePortStatesRequest);

    /**
     * <p>
     * Returns information about a specific instance snapshot.
     * </p>
     * 
     * @param getInstanceSnapshotRequest
     * @return Result of the GetInstanceSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    GetInstanceSnapshotResult getInstanceSnapshot(GetInstanceSnapshotRequest getInstanceSnapshotRequest);

    /**
     * <p>
     * Returns all instance snapshots for the user's account.
     * </p>
     * 
     * @param getInstanceSnapshotsRequest
     * @return Result of the GetInstanceSnapshots operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstanceSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceSnapshots" target="_top">AWS
     *      API Documentation</a>
     */
    GetInstanceSnapshotsResult getInstanceSnapshots(GetInstanceSnapshotsRequest getInstanceSnapshotsRequest);

    /**
     * <p>
     * Returns the state of a specific instance. Works on one instance at a time.
     * </p>
     * 
     * @param getInstanceStateRequest
     * @return Result of the GetInstanceState operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstanceState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceState" target="_top">AWS API
     *      Documentation</a>
     */
    GetInstanceStateResult getInstanceState(GetInstanceStateRequest getInstanceStateRequest);

    /**
     * <p>
     * Returns information about all Amazon Lightsail virtual private servers, or <i>instances</i>.
     * </p>
     * 
     * @param getInstancesRequest
     * @return Result of the GetInstances operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstances" target="_top">AWS API
     *      Documentation</a>
     */
    GetInstancesResult getInstances(GetInstancesRequest getInstancesRequest);

    /**
     * <p>
     * Returns information about a specific key pair.
     * </p>
     * 
     * @param getKeyPairRequest
     * @return Result of the GetKeyPair operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    GetKeyPairResult getKeyPair(GetKeyPairRequest getKeyPairRequest);

    /**
     * <p>
     * Returns information about all key pairs in the user's account.
     * </p>
     * 
     * @param getKeyPairsRequest
     * @return Result of the GetKeyPairs operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetKeyPairs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetKeyPairs" target="_top">AWS API
     *      Documentation</a>
     */
    GetKeyPairsResult getKeyPairs(GetKeyPairsRequest getKeyPairsRequest);

    /**
     * <p>
     * Returns information about a specific operation. Operations include events such as when you create an instance,
     * allocate a static IP, attach a static IP, and so on.
     * </p>
     * 
     * @param getOperationRequest
     * @return Result of the GetOperation operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperation" target="_top">AWS API
     *      Documentation</a>
     */
    GetOperationResult getOperation(GetOperationRequest getOperationRequest);

    /**
     * <p>
     * Returns information about all operations.
     * </p>
     * <p>
     * Results are returned from oldest to newest, up to a maximum of 200. Results can be paged by making each
     * subsequent call to <code>GetOperations</code> use the maximum (last) <code>statusChangedAt</code> value from the
     * previous request.
     * </p>
     * 
     * @param getOperationsRequest
     * @return Result of the GetOperations operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperations" target="_top">AWS API
     *      Documentation</a>
     */
    GetOperationsResult getOperations(GetOperationsRequest getOperationsRequest);

    /**
     * <p>
     * Gets operations for a specific resource (e.g., an instance or a static IP).
     * </p>
     * 
     * @param getOperationsForResourceRequest
     * @return Result of the GetOperationsForResource operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetOperationsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    GetOperationsForResourceResult getOperationsForResource(GetOperationsForResourceRequest getOperationsForResourceRequest);

    /**
     * <p>
     * Returns a list of all valid regions for Amazon Lightsail. Use the <code>include availability zones</code>
     * parameter to also return the availability zones in a region.
     * </p>
     * 
     * @param getRegionsRequest
     * @return Result of the GetRegions operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRegions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRegions" target="_top">AWS API
     *      Documentation</a>
     */
    GetRegionsResult getRegions(GetRegionsRequest getRegionsRequest);

    /**
     * <p>
     * Returns information about a specific static IP.
     * </p>
     * 
     * @param getStaticIpRequest
     * @return Result of the GetStaticIp operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    GetStaticIpResult getStaticIp(GetStaticIpRequest getStaticIpRequest);

    /**
     * <p>
     * Returns information about all static IPs in the user's account.
     * </p>
     * 
     * @param getStaticIpsRequest
     * @return Result of the GetStaticIps operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetStaticIps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetStaticIps" target="_top">AWS API
     *      Documentation</a>
     */
    GetStaticIpsResult getStaticIps(GetStaticIpsRequest getStaticIpsRequest);

    /**
     * <p>
     * Imports a public SSH key from a specific key pair.
     * </p>
     * 
     * @param importKeyPairRequest
     * @return Result of the ImportKeyPair operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.ImportKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ImportKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    ImportKeyPairResult importKeyPair(ImportKeyPairRequest importKeyPairRequest);

    /**
     * <p>
     * Returns a Boolean value indicating whether your Lightsail VPC is peered.
     * </p>
     * 
     * @param isVpcPeeredRequest
     * @return Result of the IsVpcPeered operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.IsVpcPeered
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/IsVpcPeered" target="_top">AWS API
     *      Documentation</a>
     */
    IsVpcPeeredResult isVpcPeered(IsVpcPeeredRequest isVpcPeeredRequest);

    /**
     * <p>
     * Adds public ports to an Amazon Lightsail instance.
     * </p>
     * 
     * @param openInstancePublicPortsRequest
     * @return Result of the OpenInstancePublicPorts operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.OpenInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/OpenInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    OpenInstancePublicPortsResult openInstancePublicPorts(OpenInstancePublicPortsRequest openInstancePublicPortsRequest);

    /**
     * <p>
     * Tries to peer the Lightsail VPC with the user's default VPC.
     * </p>
     * 
     * @param peerVpcRequest
     * @return Result of the PeerVpc operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.PeerVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PeerVpc" target="_top">AWS API
     *      Documentation</a>
     */
    PeerVpcResult peerVpc(PeerVpcRequest peerVpcRequest);

    /**
     * <p>
     * Sets the specified open ports for an Amazon Lightsail instance, and closes all ports for every protocol not
     * included in the current request.
     * </p>
     * 
     * @param putInstancePublicPortsRequest
     * @return Result of the PutInstancePublicPorts operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.PutInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PutInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    PutInstancePublicPortsResult putInstancePublicPorts(PutInstancePublicPortsRequest putInstancePublicPortsRequest);

    /**
     * <p>
     * Restarts a specific instance. When your Amazon Lightsail instance is finished rebooting, Lightsail assigns a new
     * public IP address. To use the same IP address after restarting, create a static IP address and attach it to the
     * instance.
     * </p>
     * 
     * @param rebootInstanceRequest
     * @return Result of the RebootInstance operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.RebootInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RebootInstance" target="_top">AWS API
     *      Documentation</a>
     */
    RebootInstanceResult rebootInstance(RebootInstanceRequest rebootInstanceRequest);

    /**
     * <p>
     * Deletes a specific static IP from your account.
     * </p>
     * 
     * @param releaseStaticIpRequest
     * @return Result of the ReleaseStaticIp operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.ReleaseStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ReleaseStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    ReleaseStaticIpResult releaseStaticIp(ReleaseStaticIpRequest releaseStaticIpRequest);

    /**
     * <p>
     * Starts a specific Amazon Lightsail instance from a stopped state. To restart an instance, use the reboot instance
     * operation.
     * </p>
     * 
     * @param startInstanceRequest
     * @return Result of the StartInstance operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.StartInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StartInstance" target="_top">AWS API
     *      Documentation</a>
     */
    StartInstanceResult startInstance(StartInstanceRequest startInstanceRequest);

    /**
     * <p>
     * Stops a specific Amazon Lightsail instance that is currently running.
     * </p>
     * 
     * @param stopInstanceRequest
     * @return Result of the StopInstance operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.StopInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StopInstance" target="_top">AWS API
     *      Documentation</a>
     */
    StopInstanceResult stopInstance(StopInstanceRequest stopInstanceRequest);

    /**
     * <p>
     * Attempts to unpeer the Lightsail VPC from the user's default VPC.
     * </p>
     * 
     * @param unpeerVpcRequest
     * @return Result of the UnpeerVpc operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UnpeerVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UnpeerVpc" target="_top">AWS API
     *      Documentation</a>
     */
    UnpeerVpcResult unpeerVpc(UnpeerVpcRequest unpeerVpcRequest);

    /**
     * <p>
     * Updates a domain recordset after it is created.
     * </p>
     * 
     * @param updateDomainEntryRequest
     * @return Result of the UpdateDomainEntry operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain-related APIs are only available in the N. Virginia (us-east-1) Region. Please set your Region
     *         configuration to us-east-1 to create, view, or edit these resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UpdateDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDomainEntryResult updateDomainEntry(UpdateDomainEntryRequest updateDomainEntryRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
