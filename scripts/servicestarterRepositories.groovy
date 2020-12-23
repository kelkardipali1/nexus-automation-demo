import org.sonatype.nexus.blobstore.api.BlobStoreManager


repository.createDockerProxy('service-starter-demo-docker',                   // name
        'https://docker.io', // remoteUrl
        'HUB',                          // indexType
        null,                           // indexUrl
        5000,                           // httpPort
        null,                           // httpsPort
        BlobStoreManager.DEFAULT_BLOBSTORE_NAME, // blobStoreName
        true, // strictContentTypeValidation
        true  // v1Enabled
)

//// create group and allow access via https
//def groupMembers = ['service-starter-demo-docker']
//repository.createDockerGroup('my-docker-all', null, 63585, groupMembers, true)


log.info('Script dockerRepositories completed successfully')