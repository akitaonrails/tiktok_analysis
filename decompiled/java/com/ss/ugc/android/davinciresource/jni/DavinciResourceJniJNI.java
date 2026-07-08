package com.ss.ugc.android.davinciresource.jni;

import com.ss.ugc.android.davinciresource.jni.AlgorithmResourceHandler;
import com.ss.ugc.android.davinciresource.jni.ArtistResourceHandler;
import com.ss.ugc.android.davinciresource.jni.LokiResourceHandler;
import com.ss.ugc.android.davinciresource.jni.MapStringString;

/* JADX INFO: loaded from: classes36.dex */
public class DavinciResourceJniJNI {
    public static final native String AlgorithmResourceFinder_resourceFinder(long j, String str, String str2);

    public static final native boolean AlgorithmResourceGlobalSettings_getAlgorithmModelMappingRuleValid();

    public static final native long AlgorithmResourceGlobalSettings_getResourceFinder();

    public static final native void AlgorithmResourceGlobalSettings_setAlgorithmModelMappingRuleValid(boolean z);

    public static final native void AlgorithmResourceGlobalSettings_setBuildInModelFinder(long j, IBuildInModelFinder iBuildInModelFinder);

    public static final native void AlgorithmResourceGlobalSettings_setRequirementsPeeker(long j, IRequirementsPeeker iRequirementsPeeker);

    public static final native long AlgorithmResourceHandler_Builder_accessKey(long j, AlgorithmResourceHandler.Builder builder, String str);

    public static final native long AlgorithmResourceHandler_Builder_appID(long j, AlgorithmResourceHandler.Builder builder, String str);

    public static final native long AlgorithmResourceHandler_Builder_appLanguage(long j, AlgorithmResourceHandler.Builder builder, String str);

    public static final native long AlgorithmResourceHandler_Builder_appVersion(long j, AlgorithmResourceHandler.Builder builder, String str);

    public static final native long AlgorithmResourceHandler_Builder_build(long j, AlgorithmResourceHandler.Builder builder);

    public static final native long AlgorithmResourceHandler_Builder_busiId(long j, AlgorithmResourceHandler.Builder builder, String str);

    public static final native long AlgorithmResourceHandler_Builder_cacheDir(long j, AlgorithmResourceHandler.Builder builder, String str);

    public static final native long AlgorithmResourceHandler_Builder_deviceId(long j, AlgorithmResourceHandler.Builder builder, String str);

    public static final native long AlgorithmResourceHandler_Builder_deviceInfo(long j, AlgorithmResourceHandler.Builder builder, String str);

    public static final native long AlgorithmResourceHandler_Builder_deviceType(long j, AlgorithmResourceHandler.Builder builder, String str);

    public static final native long AlgorithmResourceHandler_Builder_gpu(long j, AlgorithmResourceHandler.Builder builder, String str);

    public static final native long AlgorithmResourceHandler_Builder_host(long j, AlgorithmResourceHandler.Builder builder, String str);

    public static final native long AlgorithmResourceHandler_Builder_iopInfo(long j, AlgorithmResourceHandler.Builder builder, long j2, MapStringString mapStringString);

    public static final native long AlgorithmResourceHandler_Builder_osVersion(long j, AlgorithmResourceHandler.Builder builder, String str);

    public static final native long AlgorithmResourceHandler_Builder_platform(long j, AlgorithmResourceHandler.Builder builder, String str);

    public static final native long AlgorithmResourceHandler_Builder_platformSdkVersion(long j, AlgorithmResourceHandler.Builder builder, String str);

    public static final native long AlgorithmResourceHandler_Builder_region(long j, AlgorithmResourceHandler.Builder builder, String str);

    public static final native long AlgorithmResourceHandler_Builder_sdkVersion(long j, AlgorithmResourceHandler.Builder builder, String str);

    public static final native long AlgorithmResourceHandler_Builder_status(long j, AlgorithmResourceHandler.Builder builder, String str);

    public static final native long AlgorithmResourceHandler_SWIGSmartPtrUpcast(long j);

    public static final native boolean AlgorithmResourceHandler_canHandle(long j, AlgorithmResourceHandler algorithmResourceHandler, long j2, DAVResource dAVResource);

    public static final native long AlgorithmResourceHandler_fetchResource(long j, AlgorithmResourceHandler algorithmResourceHandler, long j2, DAVResource dAVResource, long j3, MapStringString mapStringString, long j4, DAVResourceFetchCallback dAVResourceFetchCallback);

    public static final native long AlgorithmResourceHandler_fetchResourceFromCache__SWIG_0(long j, AlgorithmResourceHandler algorithmResourceHandler, String str, long j2, MapStringString mapStringString);

    public static final native long AlgorithmResourceHandler_fetchResourceFromCache__SWIG_1(long j, AlgorithmResourceHandler algorithmResourceHandler, String str);

    public static final native String AlgorithmResourceHandler_findModelUri(long j, AlgorithmResourceHandler algorithmResourceHandler, String str);

    public static final native String AlgorithmResourceProtocol_EXTRA_PARAM_INCLUDE_BUILD_IN_RES();

    public static final native String AlgorithmResourceProtocol_PARAM_BUSI_ID();

    public static final native String AlgorithmResourceProtocol_PARAM_MODEL_NAME();

    public static final native String AlgorithmResourceProtocol_PARAM_MODEL_NAME_MAP_STRING();

    public static final native String AlgorithmResourceProtocol_PARAM_REQUIREMENTS();

    public static final native String AlgorithmResourceProtocol_PLATFORM_STRING();

    public static final native long AlgorithmResourceProtocol_SWIGUpcast(long j);

    public static final native long AlgorithmResourceProtocol_getParameters(long j, AlgorithmResourceProtocol algorithmResourceProtocol);

    public static final native String AlgorithmResourceProtocol_getSourceFrom(long j, AlgorithmResourceProtocol algorithmResourceProtocol);

    public static final native boolean AlgorithmResourceProtocol_isAlgorithmResource(String str);

    public static final native void AndroidExecutor_cancelById(long j, AndroidExecutor androidExecutor, long j2);

    public static final native void AndroidExecutor_change_ownership(AndroidExecutor androidExecutor, long j, boolean z);

    public static final native long AndroidExecutor_commit(long j, AndroidExecutor androidExecutor, long j2, Runnable runnable);

    public static final native void AndroidExecutor_director_connect(AndroidExecutor androidExecutor, long j, boolean z, boolean z2);

    public static final native long AndroidExecutor_postDelayed(long j, AndroidExecutor androidExecutor, long j2, Runnable runnable, long j3);

    public static final native long ArtistResourceHandler_Builder_appID(long j, ArtistResourceHandler.Builder builder, String str);

    public static final native long ArtistResourceHandler_Builder_appName(long j, ArtistResourceHandler.Builder builder, String str);

    public static final native long ArtistResourceHandler_Builder_appVersion(long j, ArtistResourceHandler.Builder builder, String str);

    public static final native long ArtistResourceHandler_Builder_artistSDKVersion(long j, ArtistResourceHandler.Builder builder, String str);

    public static final native long ArtistResourceHandler_Builder_build(long j, ArtistResourceHandler.Builder builder);

    public static final native long ArtistResourceHandler_Builder_cacheDir(long j, ArtistResourceHandler.Builder builder, String str);

    public static final native long ArtistResourceHandler_Builder_channel(long j, ArtistResourceHandler.Builder builder, String str);

    public static final native long ArtistResourceHandler_Builder_deviceId(long j, ArtistResourceHandler.Builder builder, String str);

    public static final native long ArtistResourceHandler_Builder_devicePlatform(long j, ArtistResourceHandler.Builder builder, String str);

    public static final native long ArtistResourceHandler_Builder_deviceType(long j, ArtistResourceHandler.Builder builder, String str);

    public static final native long ArtistResourceHandler_Builder_effectSDKVersion(long j, ArtistResourceHandler.Builder builder, String str);

    public static final native long ArtistResourceHandler_Builder_host(long j, ArtistResourceHandler.Builder builder, String str);

    public static final native long ArtistResourceHandler_Builder_language(long j, ArtistResourceHandler.Builder builder, String str);

    public static final native long ArtistResourceHandler_Builder_region(long j, ArtistResourceHandler.Builder builder, String str);

    public static final native long ArtistResourceHandler_Builder_resolution(long j, ArtistResourceHandler.Builder builder, String str);

    public static final native long ArtistResourceHandler_Builder_updateVersionCode(long j, ArtistResourceHandler.Builder builder, String str);

    public static final native long ArtistResourceHandler_Builder_versionCode(long j, ArtistResourceHandler.Builder builder, String str);

    public static final native long ArtistResourceHandler_SWIGSmartPtrUpcast(long j);

    public static final native boolean ArtistResourceHandler_canHandle(long j, ArtistResourceHandler artistResourceHandler, long j2, DAVResource dAVResource);

    public static final native void ArtistResourceHandler_fetchBatchResource(long j, ArtistResourceHandler artistResourceHandler, long j2, VecPtrDAVResource vecPtrDAVResource, long j3, MapStringString mapStringString, long j4, DAVBatchResourceFetchCallback dAVBatchResourceFetchCallback);

    public static final native long ArtistResourceHandler_fetchResource(long j, ArtistResourceHandler artistResourceHandler, long j2, DAVResource dAVResource, long j3, MapStringString mapStringString, long j4, DAVResourceFetchCallback dAVResourceFetchCallback);

    public static final native long ArtistResourceHandler_fetchResourceFromCache(long j, ArtistResourceHandler artistResourceHandler, String str, long j2, MapStringString mapStringString);

    public static final native String ArtistResourceProtocol_PARAM_RESOURCE_ID();

    public static final native String ArtistResourceProtocol_PLATFORM_STRING();

    public static final native long ArtistResourceProtocol_SWIGUpcast(long j);

    public static final native long ArtistResourceProtocol_getParameters(long j, ArtistResourceProtocol artistResourceProtocol);

    public static final native String ArtistResourceProtocol_getSourceFrom(long j, ArtistResourceProtocol artistResourceProtocol);

    public static final native boolean ArtistResourceProtocol_isArtistResource(String str);

    public static final native void DAVBatchResourceFetchCallback_change_ownership(DAVBatchResourceFetchCallback dAVBatchResourceFetchCallback, long j, boolean z);

    public static final native void DAVBatchResourceFetchCallback_director_connect(DAVBatchResourceFetchCallback dAVBatchResourceFetchCallback, long j, boolean z, boolean z2);

    public static final native void DAVBatchResourceFetchCallback_onError(long j, DAVBatchResourceFetchCallback dAVBatchResourceFetchCallback, long j2, DAVResource dAVResource, int i);

    public static final native void DAVBatchResourceFetchCallback_onSuccess(long j, DAVBatchResourceFetchCallback dAVBatchResourceFetchCallback, long j2, DAVResource dAVResource);

    public static final native long DAVCreator_createDefaultResourceManager();

    public static final native long DAVCreator_createDefaultTaskManager();

    public static final native void DAVDBManagerFactory_change_ownership(DAVDBManagerFactory dAVDBManagerFactory, long j, boolean z);

    public static final native void DAVDBManagerFactory_director_connect(DAVDBManagerFactory dAVDBManagerFactory, long j, boolean z, boolean z2);

    public static final native long DAVDBManagerFactory_getDBManager(long j, DAVDBManagerFactory dAVDBManagerFactory, String str);

    public static final native void DAVDBManagerWrapper_setDBManagerFactory(long j, DAVDBManagerFactory dAVDBManagerFactory);

    public static final native void DAVGcmCryptFunc_change_ownership(DAVGcmCryptFunc dAVGcmCryptFunc, long j, boolean z);

    public static final native String DAVGcmCryptFunc_decrypt(long j, DAVGcmCryptFunc dAVGcmCryptFunc, String str, String str2);

    public static final native void DAVGcmCryptFunc_director_connect(DAVGcmCryptFunc dAVGcmCryptFunc, long j, boolean z, boolean z2);

    public static final native void DAVGcmCrypt_enable(boolean z);

    public static final native boolean DAVGcmCrypt_isEnabled();

    public static final native void DAVGcmCrypt_setGcmCrypt(long j, DAVGcmCryptFunc dAVGcmCryptFunc);

    public static final native void DAVLoggerFunc_onLog(long j, DAVLoggerFunc dAVLoggerFunc, int i, String str, long j2);

    public static final native long DAVLoggerListener_SWIGSmartPtrUpcast(long j);

    public static final native void DAVLoggerListener_change_ownership(DAVLoggerListener dAVLoggerListener, long j, boolean z);

    public static final native void DAVLoggerListener_director_connect(DAVLoggerListener dAVLoggerListener, long j, boolean z, boolean z2);

    public static final native void DAVLoggerListener_onLogSwigExplicitDAVLoggerListener__SWIG_0(long j, DAVLoggerListener dAVLoggerListener, int i, String str, long j2);

    public static final native void DAVLoggerListener_onLog__SWIG_0(long j, DAVLoggerListener dAVLoggerListener, int i, String str, long j2);

    public static final native void DAVLoggerListener_onLog__SWIG_1(long j, DAVLoggerListener dAVLoggerListener, int i, String str);

    public static final native void DAVLogger_d(long j, DAVLogger dAVLogger, String str);

    public static final native void DAVLogger_e(long j, DAVLogger dAVLogger, String str);

    public static final native void DAVLogger_i(long j, DAVLogger dAVLogger, String str);

    public static final native long DAVLogger_obtain();

    public static final native void DAVLogger_setDelegate(long j, DAVLogger dAVLogger, long j2, DAVLoggerFunc dAVLoggerFunc);

    public static final native void DAVLogger_setLogLevel(long j, DAVLogger dAVLogger, int i);

    public static final native void DAVLogger_v(long j, DAVLogger dAVLogger, String str);

    public static final native void DAVLogger_w(long j, DAVLogger dAVLogger, String str);

    public static final native void DAVNetworkClientDelegateWrapper_setHttpClientWrapper(long j, IDAVHTTPClientDelegateWrapper iDAVHTTPClientDelegateWrapper);

    public static final native void DAVResourceFetchCallback_change_ownership(DAVResourceFetchCallback dAVResourceFetchCallback, long j, boolean z);

    public static final native void DAVResourceFetchCallback_director_connect(DAVResourceFetchCallback dAVResourceFetchCallback, long j, boolean z, boolean z2);

    public static final native void DAVResourceFetchCallback_onError(long j, DAVResourceFetchCallback dAVResourceFetchCallback, int i);

    public static final native void DAVResourceFetchCallback_onProgress(long j, DAVResourceFetchCallback dAVResourceFetchCallback, int i);

    public static final native void DAVResourceFetchCallback_onSuccess(long j, DAVResourceFetchCallback dAVResourceFetchCallback, long j2, DAVResource dAVResource);

    public static final native boolean DAVResourceHandler_canHandle(long j, DAVResourceHandler dAVResourceHandler, long j2, DAVResource dAVResource);

    public static final native long DAVResourceHandler_deleteResource(long j, DAVResourceHandler dAVResourceHandler, long j2, DAVResource dAVResource, long j3, MapStringString mapStringString, long j4, DAVResourceFetchCallback dAVResourceFetchCallback);

    public static final native void DAVResourceHandler_fetchBatchResource(long j, DAVResourceHandler dAVResourceHandler, long j2, VecPtrDAVResource vecPtrDAVResource, long j3, MapStringString mapStringString, long j4, DAVBatchResourceFetchCallback dAVBatchResourceFetchCallback);

    public static final native long DAVResourceHandler_fetchResource(long j, DAVResourceHandler dAVResourceHandler, long j2, DAVResource dAVResource, long j3, MapStringString mapStringString, long j4, DAVResourceFetchCallback dAVResourceFetchCallback);

    public static final native long DAVResourceHandler_fetchResourceFromCache__SWIG_0(long j, DAVResourceHandler dAVResourceHandler, String str, long j2, MapStringString mapStringString);

    public static final native long DAVResourceHandler_fetchResourceFromCache__SWIG_1(long j, DAVResourceHandler dAVResourceHandler, String str);

    public static final native long DAVResourceHandler_pushResource(long j, DAVResourceHandler dAVResourceHandler, String str, long j2, MapStringString mapStringString, long j3, DAVResourceFetchCallback dAVResourceFetchCallback);

    public static final native long DAVResourceHandler_updateResource(long j, DAVResourceHandler dAVResourceHandler, long j2, DAVResource dAVResource, long j3, MapStringString mapStringString, long j4, DAVResourceFetchCallback dAVResourceFetchCallback);

    public static final native long DAVResourceManager_deleteResource(long j, DAVResourceManager dAVResourceManager, long j2, DAVResource dAVResource, long j3, MapStringString mapStringString, long j4, DAVResourceFetchCallback dAVResourceFetchCallback);

    public static final native void DAVResourceManager_fetchBatchResource(long j, DAVResourceManager dAVResourceManager, long j2, VecPtrDAVResource vecPtrDAVResource, long j3, MapStringString mapStringString, long j4, DAVBatchResourceFetchCallback dAVBatchResourceFetchCallback);

    public static final native long DAVResourceManager_fetchResource(long j, DAVResourceManager dAVResourceManager, long j2, DAVResource dAVResource, long j3, MapStringString mapStringString, long j4, DAVResourceFetchCallback dAVResourceFetchCallback);

    public static final native long DAVResourceManager_fetchResourceFromCache__SWIG_0(long j, DAVResourceManager dAVResourceManager, String str, long j2, MapStringString mapStringString);

    public static final native long DAVResourceManager_fetchResourceFromCache__SWIG_1(long j, DAVResourceManager dAVResourceManager, String str);

    public static final native long DAVResourceManager_getTaskManager(long j, DAVResourceManager dAVResourceManager);

    public static final native long DAVResourceManager_pushResource(long j, DAVResourceManager dAVResourceManager, String str, String str2, long j2, MapStringString mapStringString, long j3, DAVResourceFetchCallback dAVResourceFetchCallback);

    public static final native int DAVResourceManager_registerResourceHandler(long j, DAVResourceManager dAVResourceManager, long j2, DAVResourceHandler dAVResourceHandler);

    public static final native long DAVResourceManager_updateResource(long j, DAVResourceManager dAVResourceManager, long j2, DAVResource dAVResource, long j3, MapStringString mapStringString, long j4, DAVResourceFetchCallback dAVResourceFetchCallback);

    public static final native long DAVResourceProtocol_getParameters(long j, DAVResourceProtocol dAVResourceProtocol);

    public static final native String DAVResourceProtocol_getSourceFrom(long j, DAVResourceProtocol dAVResourceProtocol);

    public static final native String DAVResourceProtocol_toResourceId(long j, DAVResourceProtocol dAVResourceProtocol);

    public static final native int DAVResourceTaskManager_cancelTask(long j, DAVResourceTaskManager dAVResourceTaskManager, long j2);

    public static final native long DAVResource_getDependResource(long j, DAVResource dAVResource);

    public static final native long DAVResource_getExtraData(long j, DAVResource dAVResource);

    public static final native String DAVResource_getResourceFile(long j, DAVResource dAVResource);

    public static final native String DAVResource_getResourceId(long j, DAVResource dAVResource);

    public static final native void DAVResource_setDependResource(long j, DAVResource dAVResource, long j2, VecDAVResource vecDAVResource);

    public static final native void DAVResource_setExtraData(long j, DAVResource dAVResource, long j2, DavResourceExtraData davResourceExtraData);

    public static final native void DAVResource_setResourceFile(long j, DAVResource dAVResource, String str);

    public static final native void DAVResource_setResourceId(long j, DAVResource dAVResource, String str);

    public static final native String DAVResource_toString(long j, DAVResource dAVResource);

    public static final native void DAVUnZipFunc_change_ownership(DAVUnZipFunc dAVUnZipFunc, long j, boolean z);

    public static final native void DAVUnZipFunc_director_connect(DAVUnZipFunc dAVUnZipFunc, long j, boolean z, boolean z2);

    public static final native boolean DAVUnZipFunc_unZip(long j, DAVUnZipFunc dAVUnZipFunc, String str, String str2, boolean z);

    public static final native void DAVUnZipper_setUnZipper(long j, DAVUnZipFunc dAVUnZipFunc);

    public static final native String DavResourceExtraData_jsonData_get(long j, DavResourceExtraData davResourceExtraData);

    public static final native void DavResourceExtraData_jsonData_set(long j, DavResourceExtraData davResourceExtraData, String str);

    public static final native void ExecutorSettings_setExecutor(long j, AndroidExecutor androidExecutor);

    public static final native void HttpClientCallbackDelegate_onCallback(long j, HttpClientCallbackDelegate httpClientCallbackDelegate, long j2, int i, byte[] bArr, long j3, long j4, MsgExtParam msgExtParam);

    public static final native void IBuildInModelFinder_change_ownership(IBuildInModelFinder iBuildInModelFinder, long j, boolean z);

    public static final native void IBuildInModelFinder_director_connect(IBuildInModelFinder iBuildInModelFinder, long j, boolean z, boolean z2);

    public static final native String IBuildInModelFinder_findModelUri(long j, IBuildInModelFinder iBuildInModelFinder, String str);

    public static final native boolean IBuildInModelFinder_isBuildInModel(long j, IBuildInModelFinder iBuildInModelFinder, String str, String str2, int i);

    public static final native boolean IDAVDBManager_Close(long j, IDAVDBManager iDAVDBManager);

    public static final native boolean IDAVDBManager_CreateTable__SWIG_0(long j, IDAVDBManager iDAVDBManager, long j2, VecString vecString, String str);

    public static final native boolean IDAVDBManager_CreateTable__SWIG_1(long j, IDAVDBManager iDAVDBManager, long j2, VecString vecString);

    public static final native long IDAVDBManager_GetAllData__SWIG_0(long j, IDAVDBManager iDAVDBManager, String str);

    public static final native long IDAVDBManager_GetAllData__SWIG_1(long j, IDAVDBManager iDAVDBManager);

    public static final native long IDAVDBManager_GetDataByRange__SWIG_0(long j, IDAVDBManager iDAVDBManager, String str, String str2, String str3, long j2, VecPairStringString vecPairStringString, boolean z, String str4);

    public static final native long IDAVDBManager_GetDataByRange__SWIG_1(long j, IDAVDBManager iDAVDBManager, String str, String str2, String str3, long j2, VecPairStringString vecPairStringString, boolean z);

    public static final native long IDAVDBManager_GetDataByRange__SWIG_2(long j, IDAVDBManager iDAVDBManager, String str, String str2, String str3, long j2, VecPairStringString vecPairStringString);

    public static final native long IDAVDBManager_GetDataByRange__SWIG_3(long j, IDAVDBManager iDAVDBManager, String str, String str2, String str3);

    public static final native String IDAVDBManager_GetData__SWIG_0(long j, IDAVDBManager iDAVDBManager, String str, String str2, String str3);

    public static final native String IDAVDBManager_GetData__SWIG_1(long j, IDAVDBManager iDAVDBManager, String str, String str2);

    public static final native long IDAVDBManager_GetData__SWIG_2(long j, IDAVDBManager iDAVDBManager, long j2, PairStringString pairStringString, String str, String str2);

    public static final native long IDAVDBManager_GetData__SWIG_3(long j, IDAVDBManager iDAVDBManager, long j2, PairStringString pairStringString, String str);

    public static final native long IDAVDBManager_GetData__SWIG_4(long j, IDAVDBManager iDAVDBManager, long j2, PairStringString pairStringString, boolean z, String str);

    public static final native long IDAVDBManager_GetData__SWIG_5(long j, IDAVDBManager iDAVDBManager, long j2, PairStringString pairStringString, boolean z);

    public static final native long IDAVDBManager_GetData__SWIG_6(long j, IDAVDBManager iDAVDBManager, long j2, PairStringString pairStringString);

    public static final native long IDAVDBManager_GetData__SWIG_7(long j, IDAVDBManager iDAVDBManager, long j2, VecPairStringString vecPairStringString, boolean z, String str);

    public static final native long IDAVDBManager_GetData__SWIG_8(long j, IDAVDBManager iDAVDBManager, long j2, VecPairStringString vecPairStringString, boolean z);

    public static final native long IDAVDBManager_GetData__SWIG_9(long j, IDAVDBManager iDAVDBManager, long j2, VecPairStringString vecPairStringString);

    public static final native long IDAVDBManager_GetDatas__SWIG_0(long j, IDAVDBManager iDAVDBManager, String str, String str2);

    public static final native long IDAVDBManager_GetDatas__SWIG_1(long j, IDAVDBManager iDAVDBManager, String str);

    public static final native void IDAVDBManager_InitConfig(long j, IDAVDBManager iDAVDBManager, String str);

    public static final native boolean IDAVDBManager_InsertData__SWIG_0(long j, IDAVDBManager iDAVDBManager, String str, long j2, VecString vecString, String str2);

    public static final native boolean IDAVDBManager_InsertData__SWIG_1(long j, IDAVDBManager iDAVDBManager, String str, long j2, VecString vecString);

    public static final native boolean IDAVDBManager_InsertData__SWIG_2(long j, IDAVDBManager iDAVDBManager, String str, long j2, VecPairStringString vecPairStringString, String str2);

    public static final native boolean IDAVDBManager_InsertData__SWIG_3(long j, IDAVDBManager iDAVDBManager, String str, long j2, VecPairStringString vecPairStringString);

    public static final native boolean IDAVDBManager_Open(long j, IDAVDBManager iDAVDBManager);

    public static final native boolean IDAVDBManager_RemoveData__SWIG_0(long j, IDAVDBManager iDAVDBManager, String str, String str2);

    public static final native boolean IDAVDBManager_RemoveData__SWIG_1(long j, IDAVDBManager iDAVDBManager, String str);

    public static final native boolean IDAVDBManager_UpdateData__SWIG_0(long j, IDAVDBManager iDAVDBManager, String str, long j2, VecPairStringString vecPairStringString, String str2);

    public static final native boolean IDAVDBManager_UpdateData__SWIG_1(long j, IDAVDBManager iDAVDBManager, String str, long j2, VecPairStringString vecPairStringString);

    public static final native boolean IDAVDBManager_UpdateData__SWIG_2(long j, IDAVDBManager iDAVDBManager, String str, long j2, VecString vecString, String str2);

    public static final native boolean IDAVDBManager_UpdateData__SWIG_3(long j, IDAVDBManager iDAVDBManager, String str, long j2, VecString vecString);

    public static final native void IDAVDBManager_change_ownership(IDAVDBManager iDAVDBManager, long j, boolean z);

    public static final native void IDAVDBManager_director_connect(IDAVDBManager iDAVDBManager, long j, boolean z, boolean z2);

    public static final native void IDAVHTTPClientDelegateWrapper_change_ownership(IDAVHTTPClientDelegateWrapper iDAVHTTPClientDelegateWrapper, long j, boolean z);

    public static final native void IDAVHTTPClientDelegateWrapper_director_connect(IDAVHTTPClientDelegateWrapper iDAVHTTPClientDelegateWrapper, long j, boolean z, boolean z2);

    public static final native long IDAVHTTPClientDelegateWrapper_getContentLength(long j, IDAVHTTPClientDelegateWrapper iDAVHTTPClientDelegateWrapper, long j2);

    public static final native boolean IDAVHTTPClientDelegateWrapper_requestNet(long j, IDAVHTTPClientDelegateWrapper iDAVHTTPClientDelegateWrapper, String str, int i, long j2, long j3, MapStringString mapStringString, long j4, MapStringString mapStringString2, String str2, byte[] bArr, long j5, long j6, HttpClientCallbackDelegate httpClientCallbackDelegate);

    public static final native void IRequirementsPeeker_change_ownership(IRequirementsPeeker iRequirementsPeeker, long j, boolean z);

    public static final native void IRequirementsPeeker_director_connect(IRequirementsPeeker iRequirementsPeeker, long j, boolean z, boolean z2);

    public static final native long IRequirementsPeeker_peekRequirements(long j, IRequirementsPeeker iRequirementsPeeker, long j2, VecString vecString);

    public static final native long LokiResourceHandler_Builder_accessKey(long j, LokiResourceHandler.Builder builder, String str);

    public static final native long LokiResourceHandler_Builder_appID(long j, LokiResourceHandler.Builder builder, String str);

    public static final native long LokiResourceHandler_Builder_appLanguage(long j, LokiResourceHandler.Builder builder, String str);

    public static final native long LokiResourceHandler_Builder_appVersion(long j, LokiResourceHandler.Builder builder, String str);

    public static final native long LokiResourceHandler_Builder_build(long j, LokiResourceHandler.Builder builder);

    public static final native long LokiResourceHandler_Builder_channel(long j, LokiResourceHandler.Builder builder, String str);

    public static final native long LokiResourceHandler_Builder_deviceId(long j, LokiResourceHandler.Builder builder, String str);

    public static final native long LokiResourceHandler_Builder_deviceInfo(long j, LokiResourceHandler.Builder builder, String str);

    public static final native long LokiResourceHandler_Builder_deviceType(long j, LokiResourceHandler.Builder builder, String str);

    public static final native long LokiResourceHandler_Builder_effectCacheDir(long j, LokiResourceHandler.Builder builder, String str);

    public static final native long LokiResourceHandler_Builder_gpu(long j, LokiResourceHandler.Builder builder, String str);

    public static final native long LokiResourceHandler_Builder_host(long j, LokiResourceHandler.Builder builder, String str);

    public static final native long LokiResourceHandler_Builder_iopInfo(long j, LokiResourceHandler.Builder builder, long j2, MapStringString mapStringString);

    public static final native long LokiResourceHandler_Builder_osVersion(long j, LokiResourceHandler.Builder builder, String str);

    public static final native long LokiResourceHandler_Builder_platform(long j, LokiResourceHandler.Builder builder, String str);

    public static final native long LokiResourceHandler_Builder_platformSdkVersion(long j, LokiResourceHandler.Builder builder, String str);

    public static final native long LokiResourceHandler_Builder_region(long j, LokiResourceHandler.Builder builder, String str);

    public static final native long LokiResourceHandler_Builder_sdkVersion(long j, LokiResourceHandler.Builder builder, String str);

    public static final native long LokiResourceHandler_SWIGSmartPtrUpcast(long j);

    public static final native boolean LokiResourceHandler_canHandle(long j, LokiResourceHandler lokiResourceHandler, long j2, DAVResource dAVResource);

    public static final native void LokiResourceHandler_fetchBatchResource(long j, LokiResourceHandler lokiResourceHandler, long j2, VecPtrDAVResource vecPtrDAVResource, long j3, MapStringString mapStringString, long j4, DAVBatchResourceFetchCallback dAVBatchResourceFetchCallback);

    public static final native long LokiResourceHandler_fetchResource(long j, LokiResourceHandler lokiResourceHandler, long j2, DAVResource dAVResource, long j3, MapStringString mapStringString, long j4, DAVResourceFetchCallback dAVResourceFetchCallback);

    public static final native long LokiResourceHandler_fetchResourceFromCache(long j, LokiResourceHandler lokiResourceHandler, String str, long j2, MapStringString mapStringString);

    public static final native String LokiResourceProtocol_PARAM_EFFECT_ID();

    public static final native String LokiResourceProtocol_PARAM_NOT_DOWNLOAD_DEPENDENT_RES();

    public static final native String LokiResourceProtocol_PARAM_PANEL();

    public static final native String LokiResourceProtocol_PARAM_RESOURCE_ID();

    public static final native String LokiResourceProtocol_PLATFORM_STRING();

    public static final native long LokiResourceProtocol_SWIGUpcast(long j);

    public static final native long LokiResourceProtocol_getParameters(long j, LokiResourceProtocol lokiResourceProtocol);

    public static final native String LokiResourceProtocol_getSourceFrom(long j, LokiResourceProtocol lokiResourceProtocol);

    public static final native boolean LokiResourceProtocol_isLokiResource(String str);

    public static final native String MapStringString_Iterator_getKey(long j, MapStringString.Iterator iterator);

    public static final native long MapStringString_Iterator_getNextUnchecked(long j, MapStringString.Iterator iterator);

    public static final native String MapStringString_Iterator_getValue(long j, MapStringString.Iterator iterator);

    public static final native boolean MapStringString_Iterator_isNot(long j, MapStringString.Iterator iterator, long j2, MapStringString.Iterator iterator2);

    public static final native void MapStringString_Iterator_setValue(long j, MapStringString.Iterator iterator, String str);

    public static final native long MapStringString_begin(long j, MapStringString mapStringString);

    public static final native void MapStringString_clear(long j, MapStringString mapStringString);

    public static final native boolean MapStringString_containsImpl(long j, MapStringString mapStringString, String str);

    public static final native long MapStringString_end(long j, MapStringString mapStringString);

    public static final native long MapStringString_find(long j, MapStringString mapStringString, String str);

    public static final native boolean MapStringString_isEmpty(long j, MapStringString mapStringString);

    public static final native void MapStringString_putUnchecked(long j, MapStringString mapStringString, String str, String str2);

    public static final native void MapStringString_removeUnchecked(long j, MapStringString mapStringString, long j2, MapStringString.Iterator iterator);

    public static final native int MapStringString_sizeImpl(long j, MapStringString mapStringString);

    public static final native String MaterialResourceConfig_ac_get(long j, MaterialResourceConfig materialResourceConfig);

    public static final native void MaterialResourceConfig_ac_set(long j, MaterialResourceConfig materialResourceConfig, String str);

    public static final native String MaterialResourceConfig_accessKey_get(long j, MaterialResourceConfig materialResourceConfig);

    public static final native void MaterialResourceConfig_accessKey_set(long j, MaterialResourceConfig materialResourceConfig, String str);

    public static final native String MaterialResourceConfig_appId_get(long j, MaterialResourceConfig materialResourceConfig);

    public static final native void MaterialResourceConfig_appId_set(long j, MaterialResourceConfig materialResourceConfig, String str);

    public static final native String MaterialResourceConfig_appName_get(long j, MaterialResourceConfig materialResourceConfig);

    public static final native void MaterialResourceConfig_appName_set(long j, MaterialResourceConfig materialResourceConfig, String str);

    public static final native String MaterialResourceConfig_appVersion_get(long j, MaterialResourceConfig materialResourceConfig);

    public static final native void MaterialResourceConfig_appVersion_set(long j, MaterialResourceConfig materialResourceConfig, String str);

    public static final native String MaterialResourceConfig_cacheDir_get(long j, MaterialResourceConfig materialResourceConfig);

    public static final native void MaterialResourceConfig_cacheDir_set(long j, MaterialResourceConfig materialResourceConfig, String str);

    public static final native String MaterialResourceConfig_deviceId_get(long j, MaterialResourceConfig materialResourceConfig);

    public static final native void MaterialResourceConfig_deviceId_set(long j, MaterialResourceConfig materialResourceConfig, String str);

    public static final native String MaterialResourceConfig_devicePlatform_get(long j, MaterialResourceConfig materialResourceConfig);

    public static final native void MaterialResourceConfig_devicePlatform_set(long j, MaterialResourceConfig materialResourceConfig, String str);

    public static final native String MaterialResourceConfig_deviceType_get(long j, MaterialResourceConfig materialResourceConfig);

    public static final native void MaterialResourceConfig_deviceType_set(long j, MaterialResourceConfig materialResourceConfig, String str);

    public static final native String MaterialResourceConfig_host_get(long j, MaterialResourceConfig materialResourceConfig);

    public static final native void MaterialResourceConfig_host_set(long j, MaterialResourceConfig materialResourceConfig, String str);

    public static final native int MaterialResourceConfig_status_get(long j, MaterialResourceConfig materialResourceConfig);

    public static final native void MaterialResourceConfig_status_set(long j, MaterialResourceConfig materialResourceConfig, int i);

    public static final native String MaterialResourceConfig_tag_get(long j, MaterialResourceConfig materialResourceConfig);

    public static final native void MaterialResourceConfig_tag_set(long j, MaterialResourceConfig materialResourceConfig, String str);

    public static final native String MaterialResourceConfig_userId_get(long j, MaterialResourceConfig materialResourceConfig);

    public static final native void MaterialResourceConfig_userId_set(long j, MaterialResourceConfig materialResourceConfig, String str);

    public static final native long MaterialResourceHandler_SWIGSmartPtrUpcast(long j);

    public static final native boolean MaterialResourceHandler_canHandle(long j, MaterialResourceHandler materialResourceHandler, long j2, DAVResource dAVResource);

    public static final native void MaterialResourceHandler_fetchBatchResource(long j, MaterialResourceHandler materialResourceHandler, long j2, VecPtrDAVResource vecPtrDAVResource, long j3, MapStringString mapStringString, long j4, DAVBatchResourceFetchCallback dAVBatchResourceFetchCallback);

    public static final native long MaterialResourceHandler_fetchResource(long j, MaterialResourceHandler materialResourceHandler, long j2, DAVResource dAVResource, long j3, MapStringString mapStringString, long j4, DAVResourceFetchCallback dAVResourceFetchCallback);

    public static final native long MaterialResourceHandler_fetchResourceFromCache__SWIG_0(long j, MaterialResourceHandler materialResourceHandler, String str, long j2, MapStringString mapStringString);

    public static final native long MaterialResourceHandler_fetchResourceFromCache__SWIG_1(long j, MaterialResourceHandler materialResourceHandler, String str);

    public static final native String MaterialResourceProtocol_PARAM_RESOURCE_KEY();

    public static final native String MaterialResourceProtocol_PLATFORM_STRING();

    public static final native long MaterialResourceProtocol_SWIGUpcast(long j);

    public static final native long MaterialResourceProtocol_getParameters(long j, MaterialResourceProtocol materialResourceProtocol);

    public static final native String MaterialResourceProtocol_getSourceFrom(long j, MaterialResourceProtocol materialResourceProtocol);

    public static final native boolean MaterialResourceProtocol_isMaterialResource(String str);

    public static final native String MediaConstanceDefine_DB_KEY_EXTRA();

    public static final native String MediaConstanceDefine_DB_KEY_RESOURCE_PATH();

    public static final native String MediaConstanceDefine_PARAM_CURRENT_UPDATE_PROGRESS();

    public static final native String MediaConstanceDefine_PARAM_LOCAL_RESOURCE();

    public static final native String MediaConstanceDefine_PARAM_MEDIA_INFO();

    public static final native String MediaConstanceDefine_PARAM_UPDATE_MATERIAL_PARAMS();

    public static final native String MediaConstanceDefine_PARAM_UPLOAD_STATE();

    public static final native String MediaConstanceDefine_PARAM_UPLOAD_STATE_DATA_MODEL();

    public static final native boolean MediaResourceConfig_autoUnzip_get(long j, MediaResourceConfig mediaResourceConfig);

    public static final native void MediaResourceConfig_autoUnzip_set(long j, MediaResourceConfig mediaResourceConfig, boolean z);

    public static final native String MediaResourceConfig_biz_id_get(long j, MediaResourceConfig mediaResourceConfig);

    public static final native void MediaResourceConfig_biz_id_set(long j, MediaResourceConfig mediaResourceConfig, String str);

    public static final native String MediaResourceConfig_creativeCloudHost_get(long j, MediaResourceConfig mediaResourceConfig);

    public static final native void MediaResourceConfig_creativeCloudHost_set(long j, MediaResourceConfig mediaResourceConfig, String str);

    public static final native String MediaResourceConfig_defaultCacheDir_get(long j, MediaResourceConfig mediaResourceConfig);

    public static final native void MediaResourceConfig_defaultCacheDir_set(long j, MediaResourceConfig mediaResourceConfig, String str);

    public static final native String MediaResourceConfig_deviceId_get(long j, MediaResourceConfig mediaResourceConfig);

    public static final native void MediaResourceConfig_deviceId_set(long j, MediaResourceConfig mediaResourceConfig, String str);

    public static final native String MediaResourceConfig_host_get(long j, MediaResourceConfig mediaResourceConfig);

    public static final native void MediaResourceConfig_host_set(long j, MediaResourceConfig mediaResourceConfig, String str);

    public static final native String MediaResourceConfig_uploadHost_get(long j, MediaResourceConfig mediaResourceConfig);

    public static final native void MediaResourceConfig_uploadHost_set(long j, MediaResourceConfig mediaResourceConfig, String str);

    public static final native long MediaResourceHandler_SWIGSmartPtrUpcast(long j);

    public static final native boolean MediaResourceHandler_canHandle(long j, MediaResourceHandler mediaResourceHandler, long j2, DAVResource dAVResource);

    public static final native long MediaResourceHandler_create(long j, MediaResourceConfig mediaResourceConfig);

    public static final native long MediaResourceHandler_deleteResource(long j, MediaResourceHandler mediaResourceHandler, long j2, DAVResource dAVResource, long j3, MapStringString mapStringString, long j4, DAVResourceFetchCallback dAVResourceFetchCallback);

    public static final native void MediaResourceHandler_fetchBatchResource(long j, MediaResourceHandler mediaResourceHandler, long j2, VecPtrDAVResource vecPtrDAVResource, long j3, MapStringString mapStringString, long j4, DAVBatchResourceFetchCallback dAVBatchResourceFetchCallback);

    public static final native long MediaResourceHandler_fetchResource(long j, MediaResourceHandler mediaResourceHandler, long j2, DAVResource dAVResource, long j3, MapStringString mapStringString, long j4, DAVResourceFetchCallback dAVResourceFetchCallback);

    public static final native long MediaResourceHandler_fetchResourceFromCache(long j, MediaResourceHandler mediaResourceHandler, String str, long j2, MapStringString mapStringString);

    public static final native long MediaResourceHandler_pushResource(long j, MediaResourceHandler mediaResourceHandler, String str, long j2, MapStringString mapStringString, long j3, DAVResourceFetchCallback dAVResourceFetchCallback);

    public static final native long MediaResourceHandler_updateResource(long j, MediaResourceHandler mediaResourceHandler, long j2, DAVResource dAVResource, long j3, MapStringString mapStringString, long j4, DAVResourceFetchCallback dAVResourceFetchCallback);

    public static final native String MediaResourceParser_mediaId_get(long j, MediaResourceParser mediaResourceParser);

    public static final native void MediaResourceParser_mediaId_set(long j, MediaResourceParser mediaResourceParser, String str);

    public static final native String MediaResourceParser_storeId_get(long j, MediaResourceParser mediaResourceParser);

    public static final native void MediaResourceParser_storeId_set(long j, MediaResourceParser mediaResourceParser, String str);

    public static final native String MediaResourceProtocol_EXTRA_AUTO_UNZIP();

    public static final native String MediaResourceProtocol_EXTRA_EXTRA_INFO();

    public static final native String MediaResourceProtocol_EXTRA_FILE_URL();

    public static final native String MediaResourceProtocol_EXTRA_MD5();

    public static final native String MediaResourceProtocol_EXTRA_MEDIA_EXTENSION();

    public static final native String MediaResourceProtocol_EXTRA_PARAM_CACHE_DIR();

    public static final native String MediaResourceProtocol_EXTRA_PARAM_CHANNEL_ID();

    public static final native String MediaResourceProtocol_EXTRA_PARAM_DELETE_LOCAL_RES();

    public static final native String MediaResourceProtocol_EXTRA_PARAM_DELETE_LOCAL_RES_RECORD();

    public static final native String MediaResourceProtocol_EXTRA_PARAM_DELETE_REMOTE_RES();

    public static final native String MediaResourceProtocol_EXTRA_PARAM_MEDIA_ITEM();

    public static final native String MediaResourceProtocol_EXTRA_PARAM_SOURCE_PATH();

    public static final native String MediaResourceProtocol_EXTRA_PARAM_UPDATE_MEDIA_ITEM();

    public static final native String MediaResourceProtocol_KEY_MEDIA_ID();

    public static final native String MediaResourceProtocol_KEY_STORE_ID();

    public static final native String MediaResourceProtocol_PLATFORM_STRING();

    public static final native long MediaResourceProtocol_SWIGUpcast(long j);

    public static final native long MediaResourceProtocol_getParameters(long j, MediaResourceProtocol mediaResourceProtocol);

    public static final native String MediaResourceProtocol_getSourceFrom(long j, MediaResourceProtocol mediaResourceProtocol);

    public static final native boolean MediaResourceProtocol_isMediaResource(String str);

    public static final native int MsgExtParam_eHttpType_get(long j, MsgExtParam msgExtParam);

    public static final native void MsgExtParam_eHttpType_set(long j, MsgExtParam msgExtParam, int i);

    public static final native int MsgExtParam_errorCode_get(long j, MsgExtParam msgExtParam);

    public static final native void MsgExtParam_errorCode_set(long j, MsgExtParam msgExtParam, int i);

    public static final native long MsgExtParam_uiReqId_get(long j, MsgExtParam msgExtParam);

    public static final native void MsgExtParam_uiReqId_set(long j, MsgExtParam msgExtParam, long j2);

    public static final native String MusicResourceConfig_aid_get(long j, MusicResourceConfig musicResourceConfig);

    public static final native void MusicResourceConfig_aid_set(long j, MusicResourceConfig musicResourceConfig, String str);

    public static final native String MusicResourceConfig_cacheDir_get(long j, MusicResourceConfig musicResourceConfig);

    public static final native void MusicResourceConfig_cacheDir_set(long j, MusicResourceConfig musicResourceConfig, String str);

    public static final native long MusicResourceConfig_getRequestParam(long j, MusicResourceConfig musicResourceConfig);

    public static final native String MusicResourceConfig_host_get(long j, MusicResourceConfig musicResourceConfig);

    public static final native void MusicResourceConfig_host_set(long j, MusicResourceConfig musicResourceConfig, String str);

    public static final native String MusicResourceConfig_language_get(long j, MusicResourceConfig musicResourceConfig);

    public static final native void MusicResourceConfig_language_set(long j, MusicResourceConfig musicResourceConfig, String str);

    public static final native String MusicResourceConfig_regionKey_get(long j, MusicResourceConfig musicResourceConfig);

    public static final native void MusicResourceConfig_regionKey_set(long j, MusicResourceConfig musicResourceConfig, String str);

    public static final native boolean MusicResourceHandler_canHandle(long j, MusicResourceHandler musicResourceHandler, long j2, DAVResource dAVResource);

    public static final native long MusicResourceHandler_fetchResource(long j, MusicResourceHandler musicResourceHandler, long j2, DAVResource dAVResource, long j3, MapStringString mapStringString, long j4, DAVResourceFetchCallback dAVResourceFetchCallback);

    public static final native long MusicResourceHandler_fetchResourceFromCache__SWIG_0(long j, MusicResourceHandler musicResourceHandler, String str, long j2, MapStringString mapStringString);

    public static final native long MusicResourceHandler_fetchResourceFromCache__SWIG_1(long j, MusicResourceHandler musicResourceHandler, String str);

    public static final native String PairStringString_first_get(long j, PairStringString pairStringString);

    public static final native void PairStringString_first_set(long j, PairStringString pairStringString, String str);

    public static final native String PairStringString_second_get(long j, PairStringString pairStringString);

    public static final native void PairStringString_second_set(long j, PairStringString pairStringString, String str);

    public static final native void Runnable_change_ownership(Runnable runnable, long j, boolean z);

    public static final native void Runnable_director_connect(Runnable runnable, long j, boolean z, boolean z2);

    public static final native void Runnable_run(long j, Runnable runnable);

    public static final native long UrlResourceHandler_SWIGSmartPtrUpcast(long j);

    public static final native boolean UrlResourceHandler_canHandle(long j, UrlResourceHandler urlResourceHandler, long j2, DAVResource dAVResource);

    public static final native long UrlResourceHandler_create();

    public static final native long UrlResourceHandler_fetchResource(long j, UrlResourceHandler urlResourceHandler, long j2, DAVResource dAVResource, long j3, MapStringString mapStringString, long j4, DAVResourceFetchCallback dAVResourceFetchCallback);

    public static final native long UrlResourceHandler_fetchResourceFromCache(long j, UrlResourceHandler urlResourceHandler, String str, long j2, MapStringString mapStringString);

    public static final native String UrlResourceProtocol_EXTRA_CACHE_VALID_TIME();

    public static final native String UrlResourceProtocol_EXTRA_PARAM_MD5();

    public static final native String UrlResourceProtocol_EXTRA_PARAM_SAVE_PATH();

    public static final native String UrlResourceProtocol_KEY_URL();

    public static final native String UrlResourceProtocol_PLATFORM_STRING();

    public static final native long UrlResourceProtocol_SWIGUpcast(long j);

    public static final native long UrlResourceProtocol_getParameters(long j, UrlResourceProtocol urlResourceProtocol);

    public static final native String UrlResourceProtocol_getSourceFrom(long j, UrlResourceProtocol urlResourceProtocol);

    public static final native boolean UrlResourceProtocol_isUrlResource(String str);

    public static final native long VecDAVResource_capacity(long j, VecDAVResource vecDAVResource);

    public static final native void VecDAVResource_clear(long j, VecDAVResource vecDAVResource);

    public static final native void VecDAVResource_doAdd__SWIG_0(long j, VecDAVResource vecDAVResource, long j2, DAVResource dAVResource);

    public static final native void VecDAVResource_doAdd__SWIG_1(long j, VecDAVResource vecDAVResource, int i, long j2, DAVResource dAVResource);

    public static final native long VecDAVResource_doGet(long j, VecDAVResource vecDAVResource, int i);

    public static final native long VecDAVResource_doRemove(long j, VecDAVResource vecDAVResource, int i);

    public static final native void VecDAVResource_doRemoveRange(long j, VecDAVResource vecDAVResource, int i, int i2);

    public static final native long VecDAVResource_doSet(long j, VecDAVResource vecDAVResource, int i, long j2, DAVResource dAVResource);

    public static final native int VecDAVResource_doSize(long j, VecDAVResource vecDAVResource);

    public static final native boolean VecDAVResource_isEmpty(long j, VecDAVResource vecDAVResource);

    public static final native void VecDAVResource_reserve(long j, VecDAVResource vecDAVResource, long j2);

    public static final native long VecPairStringString_capacity(long j, VecPairStringString vecPairStringString);

    public static final native void VecPairStringString_clear(long j, VecPairStringString vecPairStringString);

    public static final native void VecPairStringString_doAdd__SWIG_0(long j, VecPairStringString vecPairStringString, long j2, PairStringString pairStringString);

    public static final native void VecPairStringString_doAdd__SWIG_1(long j, VecPairStringString vecPairStringString, int i, long j2, PairStringString pairStringString);

    public static final native long VecPairStringString_doGet(long j, VecPairStringString vecPairStringString, int i);

    public static final native long VecPairStringString_doRemove(long j, VecPairStringString vecPairStringString, int i);

    public static final native void VecPairStringString_doRemoveRange(long j, VecPairStringString vecPairStringString, int i, int i2);

    public static final native long VecPairStringString_doSet(long j, VecPairStringString vecPairStringString, int i, long j2, PairStringString pairStringString);

    public static final native int VecPairStringString_doSize(long j, VecPairStringString vecPairStringString);

    public static final native boolean VecPairStringString_isEmpty(long j, VecPairStringString vecPairStringString);

    public static final native void VecPairStringString_reserve(long j, VecPairStringString vecPairStringString, long j2);

    public static final native long VecPtrDAVResource_capacity(long j, VecPtrDAVResource vecPtrDAVResource);

    public static final native void VecPtrDAVResource_clear(long j, VecPtrDAVResource vecPtrDAVResource);

    public static final native void VecPtrDAVResource_doAdd__SWIG_0(long j, VecPtrDAVResource vecPtrDAVResource, long j2, DAVResource dAVResource);

    public static final native void VecPtrDAVResource_doAdd__SWIG_1(long j, VecPtrDAVResource vecPtrDAVResource, int i, long j2, DAVResource dAVResource);

    public static final native long VecPtrDAVResource_doGet(long j, VecPtrDAVResource vecPtrDAVResource, int i);

    public static final native long VecPtrDAVResource_doRemove(long j, VecPtrDAVResource vecPtrDAVResource, int i);

    public static final native void VecPtrDAVResource_doRemoveRange(long j, VecPtrDAVResource vecPtrDAVResource, int i, int i2);

    public static final native long VecPtrDAVResource_doSet(long j, VecPtrDAVResource vecPtrDAVResource, int i, long j2, DAVResource dAVResource);

    public static final native int VecPtrDAVResource_doSize(long j, VecPtrDAVResource vecPtrDAVResource);

    public static final native boolean VecPtrDAVResource_isEmpty(long j, VecPtrDAVResource vecPtrDAVResource);

    public static final native void VecPtrDAVResource_reserve(long j, VecPtrDAVResource vecPtrDAVResource, long j2);

    public static final native long VecString_capacity(long j, VecString vecString);

    public static final native void VecString_clear(long j, VecString vecString);

    public static final native void VecString_doAdd__SWIG_0(long j, VecString vecString, String str);

    public static final native void VecString_doAdd__SWIG_1(long j, VecString vecString, int i, String str);

    public static final native String VecString_doGet(long j, VecString vecString, int i);

    public static final native String VecString_doRemove(long j, VecString vecString, int i);

    public static final native void VecString_doRemoveRange(long j, VecString vecString, int i, int i2);

    public static final native String VecString_doSet(long j, VecString vecString, int i, String str);

    public static final native int VecString_doSize(long j, VecString vecString);

    public static final native boolean VecString_isEmpty(long j, VecString vecString);

    public static final native void VecString_reserve(long j, VecString vecString, long j2);

    public static final native long VecVecString_capacity(long j, VecVecString vecVecString);

    public static final native void VecVecString_clear(long j, VecVecString vecVecString);

    public static final native void VecVecString_doAdd__SWIG_0(long j, VecVecString vecVecString, long j2, VecString vecString);

    public static final native void VecVecString_doAdd__SWIG_1(long j, VecVecString vecVecString, int i, long j2, VecString vecString);

    public static final native long VecVecString_doGet(long j, VecVecString vecVecString, int i);

    public static final native long VecVecString_doRemove(long j, VecVecString vecVecString, int i);

    public static final native void VecVecString_doRemoveRange(long j, VecVecString vecVecString, int i, int i2);

    public static final native long VecVecString_doSet(long j, VecVecString vecVecString, int i, long j2, VecString vecString);

    public static final native int VecVecString_doSize(long j, VecVecString vecVecString);

    public static final native boolean VecVecString_isEmpty(long j, VecVecString vecVecString);

    public static final native void VecVecString_reserve(long j, VecVecString vecVecString, long j2);

    public static final native long ZipResourceHandler_SWIGSmartPtrUpcast(long j);

    public static final native boolean ZipResourceHandler_canHandle(long j, ZipResourceHandler zipResourceHandler, long j2, DAVResource dAVResource);

    public static final native long ZipResourceHandler_create();

    public static final native long ZipResourceHandler_fetchResource(long j, ZipResourceHandler zipResourceHandler, long j2, DAVResource dAVResource, long j3, MapStringString mapStringString, long j4, DAVResourceFetchCallback dAVResourceFetchCallback);

    public static final native long ZipResourceHandler_fetchResourceFromCache(long j, ZipResourceHandler zipResourceHandler, String str, long j2, MapStringString mapStringString);

    public static final native String ZipResourceProtocol_EXTRA_PARAM_AUTO_UNZIP();

    public static final native String ZipResourceProtocol_EXTRA_PARAM_MD5();

    public static final native String ZipResourceProtocol_EXTRA_PARAM_RELATIVE_PATH();

    public static final native String ZipResourceProtocol_EXTRA_PARAM_SAVE_PATH();

    public static final native String ZipResourceProtocol_KEY_URL();

    public static final native String ZipResourceProtocol_PLATFORM_STRING();

    public static final native long ZipResourceProtocol_SWIGUpcast(long j);

    public static final native long ZipResourceProtocol_getParameters(long j, ZipResourceProtocol zipResourceProtocol);

    public static final native String ZipResourceProtocol_getSourceFrom(long j, ZipResourceProtocol zipResourceProtocol);

    public static final native boolean ZipResourceProtocol_isZipResource(String str);

    public static final native void delete_AlgorithmResourceFinder(long j);

    public static final native void delete_AlgorithmResourceGlobalSettings(long j);

    public static final native void delete_AlgorithmResourceHandler(long j);

    public static final native void delete_AlgorithmResourceHandler_Builder(long j);

    public static final native void delete_AlgorithmResourceProtocol(long j);

    public static final native void delete_AndroidExecutor(long j);

    public static final native void delete_ArtistResourceHandler(long j);

    public static final native void delete_ArtistResourceHandler_Builder(long j);

    public static final native void delete_ArtistResourceProtocol(long j);

    public static final native void delete_DAVBatchResourceFetchCallback(long j);

    public static final native void delete_DAVCreator(long j);

    public static final native void delete_DAVDBManagerFactory(long j);

    public static final native void delete_DAVDBManagerWrapper(long j);

    public static final native void delete_DAVGcmCrypt(long j);

    public static final native void delete_DAVGcmCryptFunc(long j);

    public static final native void delete_DAVLogger(long j);

    public static final native void delete_DAVLoggerFunc(long j);

    public static final native void delete_DAVLoggerListener(long j);

    public static final native void delete_DAVNetworkClientDelegateWrapper(long j);

    public static final native void delete_DAVResource(long j);

    public static final native void delete_DAVResourceFetchCallback(long j);

    public static final native void delete_DAVResourceHandler(long j);

    public static final native void delete_DAVResourceManager(long j);

    public static final native void delete_DAVResourceProtocol(long j);

    public static final native void delete_DAVResourceTaskManager(long j);

    public static final native void delete_DAVUnZipFunc(long j);

    public static final native void delete_DAVUnZipper(long j);

    public static final native void delete_DavResourceExtraData(long j);

    public static final native void delete_ExecutorSettings(long j);

    public static final native void delete_HttpClientCallbackDelegate(long j);

    public static final native void delete_IBuildInModelFinder(long j);

    public static final native void delete_IDAVDBManager(long j);

    public static final native void delete_IDAVHTTPClientDelegateWrapper(long j);

    public static final native void delete_IRequirementsPeeker(long j);

    public static final native void delete_LokiResourceHandler(long j);

    public static final native void delete_LokiResourceHandler_Builder(long j);

    public static final native void delete_LokiResourceProtocol(long j);

    public static final native void delete_MapStringString(long j);

    public static final native void delete_MapStringString_Iterator(long j);

    public static final native void delete_MaterialResourceConfig(long j);

    public static final native void delete_MaterialResourceHandler(long j);

    public static final native void delete_MaterialResourceProtocol(long j);

    public static final native void delete_MediaConstanceDefine(long j);

    public static final native void delete_MediaResourceConfig(long j);

    public static final native void delete_MediaResourceHandler(long j);

    public static final native void delete_MediaResourceParser(long j);

    public static final native void delete_MediaResourceProtocol(long j);

    public static final native void delete_MsgExtParam(long j);

    public static final native void delete_MusicResourceConfig(long j);

    public static final native void delete_MusicResourceHandler(long j);

    public static final native void delete_PairStringString(long j);

    public static final native void delete_Runnable(long j);

    public static final native void delete_UrlResourceHandler(long j);

    public static final native void delete_UrlResourceProtocol(long j);

    public static final native void delete_VecDAVResource(long j);

    public static final native void delete_VecPairStringString(long j);

    public static final native void delete_VecPtrDAVResource(long j);

    public static final native void delete_VecString(long j);

    public static final native void delete_VecVecString(long j);

    public static final native void delete_ZipResourceHandler(long j);

    public static final native void delete_ZipResourceProtocol(long j);

    public static final native long new_AlgorithmResourceFinder();

    public static final native long new_AlgorithmResourceGlobalSettings();

    public static final native long new_AlgorithmResourceHandler_Builder();

    public static final native long new_AlgorithmResourceProtocol__SWIG_0(long j, VecString vecString, String str);

    public static final native long new_AlgorithmResourceProtocol__SWIG_1(String str);

    public static final native long new_AndroidExecutor();

    public static final native long new_ArtistResourceHandler_Builder();

    public static final native long new_ArtistResourceProtocol(String str);

    public static final native long new_DAVBatchResourceFetchCallback();

    public static final native long new_DAVCreator();

    public static final native long new_DAVDBManagerFactory();

    public static final native long new_DAVDBManagerWrapper();

    public static final native long new_DAVGcmCrypt();

    public static final native long new_DAVGcmCryptFunc();

    public static final native long new_DAVLogger();

    public static final native long new_DAVLoggerListener();

    public static final native long new_DAVNetworkClientDelegateWrapper();

    public static final native long new_DAVResourceFetchCallback();

    public static final native long new_DAVResource__SWIG_0();

    public static final native long new_DAVResource__SWIG_1(String str);

    public static final native long new_DAVUnZipFunc();

    public static final native long new_DAVUnZipper();

    public static final native long new_DavResourceExtraData();

    public static final native long new_ExecutorSettings();

    public static final native long new_IBuildInModelFinder();

    public static final native long new_IDAVDBManager(String str);

    public static final native long new_IDAVHTTPClientDelegateWrapper();

    public static final native long new_IRequirementsPeeker();

    public static final native long new_LokiResourceHandler_Builder();

    public static final native long new_LokiResourceProtocol__SWIG_0(String str);

    public static final native long new_LokiResourceProtocol__SWIG_1(String str, String str2);

    public static final native long new_MapStringString__SWIG_0();

    public static final native long new_MapStringString__SWIG_1(long j, MapStringString mapStringString);

    public static final native long new_MaterialResourceConfig();

    public static final native long new_MaterialResourceHandler(long j, MaterialResourceConfig materialResourceConfig);

    public static final native long new_MaterialResourceProtocol(String str);

    public static final native long new_MediaConstanceDefine();

    public static final native long new_MediaResourceConfig();

    public static final native long new_MediaResourceParser(String str);

    public static final native long new_MediaResourceProtocol__SWIG_0(String str);

    public static final native long new_MediaResourceProtocol__SWIG_1(String str, String str2);

    public static final native long new_MsgExtParam();

    public static final native long new_MusicResourceConfig();

    public static final native long new_MusicResourceHandler(long j, MusicResourceConfig musicResourceConfig);

    public static final native long new_PairStringString__SWIG_0();

    public static final native long new_PairStringString__SWIG_1(String str, String str2);

    public static final native long new_PairStringString__SWIG_2(long j, PairStringString pairStringString);

    public static final native long new_Runnable();

    public static final native long new_UrlResourceProtocol(String str);

    public static final native long new_VecDAVResource__SWIG_0();

    public static final native long new_VecDAVResource__SWIG_1(long j, VecDAVResource vecDAVResource);

    public static final native long new_VecDAVResource__SWIG_2(int i, long j, DAVResource dAVResource);

    public static final native long new_VecPairStringString__SWIG_0();

    public static final native long new_VecPairStringString__SWIG_1(long j, VecPairStringString vecPairStringString);

    public static final native long new_VecPairStringString__SWIG_2(int i, long j, PairStringString pairStringString);

    public static final native long new_VecPtrDAVResource__SWIG_0();

    public static final native long new_VecPtrDAVResource__SWIG_1(long j, VecPtrDAVResource vecPtrDAVResource);

    public static final native long new_VecPtrDAVResource__SWIG_2(int i, long j, DAVResource dAVResource);

    public static final native long new_VecString__SWIG_0();

    public static final native long new_VecString__SWIG_1(long j, VecString vecString);

    public static final native long new_VecString__SWIG_2(int i, String str);

    public static final native long new_VecVecString__SWIG_0();

    public static final native long new_VecVecString__SWIG_1(long j, VecVecString vecVecString);

    public static final native long new_VecVecString__SWIG_2(int i, long j, VecString vecString);

    public static final native long new_ZipResourceProtocol__SWIG_0(String str);

    public static final native long new_ZipResourceProtocol__SWIG_1(String str, String str2);

    public static final native void swig_module_init();

    static {
        swig_module_init();
    }

    public static boolean SwigDirector_IDAVDBManager_Close(IDAVDBManager iDAVDBManager) {
        return iDAVDBManager.Close();
    }

    public static long SwigDirector_IDAVDBManager_GetAllData__SWIG_1(IDAVDBManager iDAVDBManager) {
        return VecVecString.getCPtr(iDAVDBManager.GetAllData());
    }

    public static boolean SwigDirector_IDAVDBManager_Open(IDAVDBManager iDAVDBManager) {
        return iDAVDBManager.Open();
    }

    public static void SwigDirector_Runnable_run(Runnable runnable) {
        runnable.run();
    }

    public static void SwigDirector_AndroidExecutor_cancelById(AndroidExecutor androidExecutor, long j) {
        androidExecutor.cancelById(j);
    }

    public static long SwigDirector_AndroidExecutor_commit(AndroidExecutor androidExecutor, long j) {
        Runnable runnable;
        if (j == 0) {
            runnable = null;
        } else {
            runnable = new Runnable(j, true);
        }
        return androidExecutor.commit(runnable);
    }

    public static void SwigDirector_DAVBatchResourceFetchCallback_onSuccess(DAVBatchResourceFetchCallback dAVBatchResourceFetchCallback, long j) {
        DAVResource dAVResource;
        if (j == 0) {
            dAVResource = null;
        } else {
            dAVResource = new DAVResource(j, true);
        }
        dAVBatchResourceFetchCallback.onSuccess(dAVResource);
    }

    public static long SwigDirector_DAVDBManagerFactory_getDBManager(DAVDBManagerFactory dAVDBManagerFactory, String str) {
        return IDAVDBManager.getCPtr(dAVDBManagerFactory.getDBManager(str));
    }

    public static void SwigDirector_DAVResourceFetchCallback_onError(DAVResourceFetchCallback dAVResourceFetchCallback, int i) {
        dAVResourceFetchCallback.onError(i);
    }

    public static void SwigDirector_DAVResourceFetchCallback_onProgress(DAVResourceFetchCallback dAVResourceFetchCallback, int i) {
        dAVResourceFetchCallback.onProgress(i);
    }

    public static void SwigDirector_DAVResourceFetchCallback_onSuccess(DAVResourceFetchCallback dAVResourceFetchCallback, long j) {
        DAVResource dAVResource;
        if (j == 0) {
            dAVResource = null;
        } else {
            dAVResource = new DAVResource(j, true);
        }
        dAVResourceFetchCallback.onSuccess(dAVResource);
    }

    public static String SwigDirector_IBuildInModelFinder_findModelUri(IBuildInModelFinder iBuildInModelFinder, String str) {
        return iBuildInModelFinder.findModelUri(str);
    }

    public static boolean SwigDirector_IDAVDBManager_CreateTable__SWIG_1(IDAVDBManager iDAVDBManager, long j) {
        return iDAVDBManager.CreateTable(new VecString(j, false));
    }

    public static long SwigDirector_IDAVDBManager_GetAllData__SWIG_0(IDAVDBManager iDAVDBManager, String str) {
        return VecVecString.getCPtr(iDAVDBManager.GetAllData(str));
    }

    public static long SwigDirector_IDAVDBManager_GetData__SWIG_6(IDAVDBManager iDAVDBManager, long j) {
        return VecVecString.getCPtr(iDAVDBManager.GetData(new PairStringString(j, false)));
    }

    public static long SwigDirector_IDAVDBManager_GetData__SWIG_9(IDAVDBManager iDAVDBManager, long j) {
        return VecVecString.getCPtr(iDAVDBManager.GetData(new VecPairStringString(j, false)));
    }

    public static long SwigDirector_IDAVDBManager_GetDatas__SWIG_1(IDAVDBManager iDAVDBManager, String str) {
        return VecString.getCPtr(iDAVDBManager.GetDatas(str));
    }

    public static void SwigDirector_IDAVDBManager_InitConfig(IDAVDBManager iDAVDBManager, String str) {
        iDAVDBManager.InitConfig(str);
    }

    public static boolean SwigDirector_IDAVDBManager_RemoveData__SWIG_1(IDAVDBManager iDAVDBManager, String str) {
        return iDAVDBManager.RemoveData(str);
    }

    public static long SwigDirector_IDAVHTTPClientDelegateWrapper_getContentLength(IDAVHTTPClientDelegateWrapper iDAVHTTPClientDelegateWrapper, long j) {
        return iDAVHTTPClientDelegateWrapper.getContentLength(j);
    }

    public static long SwigDirector_IRequirementsPeeker_peekRequirements(IRequirementsPeeker iRequirementsPeeker, long j) {
        return VecString.getCPtr(iRequirementsPeeker.peekRequirements(new VecString(j, false)));
    }

    public static long SwigDirector_AndroidExecutor_postDelayed(AndroidExecutor androidExecutor, long j, long j2) {
        Runnable runnable;
        if (j == 0) {
            runnable = null;
        } else {
            runnable = new Runnable(j, true);
        }
        return androidExecutor.postDelayed(runnable, j2);
    }

    public static void SwigDirector_DAVBatchResourceFetchCallback_onError(DAVBatchResourceFetchCallback dAVBatchResourceFetchCallback, long j, int i) {
        DAVResource dAVResource;
        if (j == 0) {
            dAVResource = null;
        } else {
            dAVResource = new DAVResource(j, true);
        }
        dAVBatchResourceFetchCallback.onError(dAVResource, i);
    }

    public static String SwigDirector_DAVGcmCryptFunc_decrypt(DAVGcmCryptFunc dAVGcmCryptFunc, String str, String str2) {
        return dAVGcmCryptFunc.decrypt(str, str2);
    }

    public static void SwigDirector_DAVLoggerListener_onLog__SWIG_1(DAVLoggerListener dAVLoggerListener, int i, String str) {
        dAVLoggerListener.onLog(DAVLogLevel.swigToEnum(i), str);
    }

    public static boolean SwigDirector_IDAVDBManager_CreateTable__SWIG_0(IDAVDBManager iDAVDBManager, long j, String str) {
        return iDAVDBManager.CreateTable(new VecString(j, false), str);
    }

    public static String SwigDirector_IDAVDBManager_GetData__SWIG_1(IDAVDBManager iDAVDBManager, String str, String str2) {
        return iDAVDBManager.GetData(str, str2);
    }

    public static long SwigDirector_IDAVDBManager_GetData__SWIG_3(IDAVDBManager iDAVDBManager, long j, String str) {
        return VecString.getCPtr(iDAVDBManager.GetData(new PairStringString(j, false), str));
    }

    public static long SwigDirector_IDAVDBManager_GetData__SWIG_5(IDAVDBManager iDAVDBManager, long j, boolean z) {
        return VecVecString.getCPtr(iDAVDBManager.GetData(new PairStringString(j, false), z));
    }

    public static long SwigDirector_IDAVDBManager_GetData__SWIG_8(IDAVDBManager iDAVDBManager, long j, boolean z) {
        return VecVecString.getCPtr(iDAVDBManager.GetData(new VecPairStringString(j, false), z));
    }

    public static long SwigDirector_IDAVDBManager_GetDatas__SWIG_0(IDAVDBManager iDAVDBManager, String str, String str2) {
        return VecString.getCPtr(iDAVDBManager.GetDatas(str, str2));
    }

    public static boolean SwigDirector_IDAVDBManager_InsertData__SWIG_1(IDAVDBManager iDAVDBManager, String str, long j) {
        return iDAVDBManager.InsertData(str, new VecString(j, false));
    }

    public static boolean SwigDirector_IDAVDBManager_InsertData__SWIG_3(IDAVDBManager iDAVDBManager, String str, long j) {
        return iDAVDBManager.InsertData(str, new VecPairStringString(j, false));
    }

    public static boolean SwigDirector_IDAVDBManager_RemoveData__SWIG_0(IDAVDBManager iDAVDBManager, String str, String str2) {
        return iDAVDBManager.RemoveData(str, str2);
    }

    public static boolean SwigDirector_IDAVDBManager_UpdateData__SWIG_1(IDAVDBManager iDAVDBManager, String str, long j) {
        return iDAVDBManager.UpdateData(str, new VecPairStringString(j, false));
    }

    public static boolean SwigDirector_IDAVDBManager_UpdateData__SWIG_3(IDAVDBManager iDAVDBManager, String str, long j) {
        return iDAVDBManager.UpdateData(str, new VecString(j, false));
    }

    public static void SwigDirector_DAVLoggerListener_onLog__SWIG_0(DAVLoggerListener dAVLoggerListener, int i, String str, long j) {
        dAVLoggerListener.onLog(DAVLogLevel.swigToEnum(i), str, new SWIGTYPE_p_va_list(j, true));
    }

    public static boolean SwigDirector_DAVUnZipFunc_unZip(DAVUnZipFunc dAVUnZipFunc, String str, String str2, boolean z) {
        return dAVUnZipFunc.unZip(str, str2, z);
    }

    public static boolean SwigDirector_IBuildInModelFinder_isBuildInModel(IBuildInModelFinder iBuildInModelFinder, String str, String str2, int i) {
        return iBuildInModelFinder.isBuildInModel(str, str2, i);
    }

    public static long SwigDirector_IDAVDBManager_GetDataByRange__SWIG_3(IDAVDBManager iDAVDBManager, String str, String str2, String str3) {
        return VecVecString.getCPtr(iDAVDBManager.GetDataByRange(str, str2, str3));
    }

    public static String SwigDirector_IDAVDBManager_GetData__SWIG_0(IDAVDBManager iDAVDBManager, String str, String str2, String str3) {
        return iDAVDBManager.GetData(str, str2, str3);
    }

    public static long SwigDirector_IDAVDBManager_GetData__SWIG_2(IDAVDBManager iDAVDBManager, long j, String str, String str2) {
        return VecString.getCPtr(iDAVDBManager.GetData(new PairStringString(j, false), str, str2));
    }

    public static long SwigDirector_IDAVDBManager_GetData__SWIG_4(IDAVDBManager iDAVDBManager, long j, boolean z, String str) {
        return VecVecString.getCPtr(iDAVDBManager.GetData(new PairStringString(j, false), z, str));
    }

    public static long SwigDirector_IDAVDBManager_GetData__SWIG_7(IDAVDBManager iDAVDBManager, long j, boolean z, String str) {
        return VecVecString.getCPtr(iDAVDBManager.GetData(new VecPairStringString(j, false), z, str));
    }

    public static boolean SwigDirector_IDAVDBManager_InsertData__SWIG_0(IDAVDBManager iDAVDBManager, String str, long j, String str2) {
        return iDAVDBManager.InsertData(str, new VecString(j, false), str2);
    }

    public static boolean SwigDirector_IDAVDBManager_InsertData__SWIG_2(IDAVDBManager iDAVDBManager, String str, long j, String str2) {
        return iDAVDBManager.InsertData(str, new VecPairStringString(j, false), str2);
    }

    public static boolean SwigDirector_IDAVDBManager_UpdateData__SWIG_0(IDAVDBManager iDAVDBManager, String str, long j, String str2) {
        return iDAVDBManager.UpdateData(str, new VecPairStringString(j, false), str2);
    }

    public static boolean SwigDirector_IDAVDBManager_UpdateData__SWIG_2(IDAVDBManager iDAVDBManager, String str, long j, String str2) {
        return iDAVDBManager.UpdateData(str, new VecString(j, false), str2);
    }

    public static long SwigDirector_IDAVDBManager_GetDataByRange__SWIG_2(IDAVDBManager iDAVDBManager, String str, String str2, String str3, long j) {
        return VecVecString.getCPtr(iDAVDBManager.GetDataByRange(str, str2, str3, new VecPairStringString(j, false)));
    }

    public static long SwigDirector_IDAVDBManager_GetDataByRange__SWIG_1(IDAVDBManager iDAVDBManager, String str, String str2, String str3, long j, boolean z) {
        return VecVecString.getCPtr(iDAVDBManager.GetDataByRange(str, str2, str3, new VecPairStringString(j, false), z));
    }

    public static long SwigDirector_IDAVDBManager_GetDataByRange__SWIG_0(IDAVDBManager iDAVDBManager, String str, String str2, String str3, long j, boolean z, String str4) {
        return VecVecString.getCPtr(iDAVDBManager.GetDataByRange(str, str2, str3, new VecPairStringString(j, false), z, str4));
    }

    public static boolean SwigDirector_IDAVHTTPClientDelegateWrapper_requestNet(IDAVHTTPClientDelegateWrapper iDAVHTTPClientDelegateWrapper, String str, int i, long j, long j2, long j3, String str2, byte[] bArr, long j4, long j5) {
        SWIGTYPE_p_void sWIGTYPE_p_void;
        HTTP_TYPE http_typeSwigToEnum = HTTP_TYPE.swigToEnum(i);
        MapStringString mapStringString = new MapStringString(j2, true);
        MapStringString mapStringString2 = new MapStringString(j3, true);
        HttpClientCallbackDelegate httpClientCallbackDelegate = null;
        if (j4 == 0) {
            sWIGTYPE_p_void = null;
        } else {
            sWIGTYPE_p_void = new SWIGTYPE_p_void(j4, false);
        }
        if (j5 != 0) {
            httpClientCallbackDelegate = new HttpClientCallbackDelegate(j5, true);
        }
        return iDAVHTTPClientDelegateWrapper.requestNet(str, http_typeSwigToEnum, j, mapStringString, mapStringString2, str2, bArr, sWIGTYPE_p_void, httpClientCallbackDelegate);
    }
}
