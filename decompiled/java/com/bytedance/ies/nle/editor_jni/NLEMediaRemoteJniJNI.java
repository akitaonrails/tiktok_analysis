package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEMediaRemoteJniJNI {
    public static final native void INLEHTTPClientDelegateWrapper_change_ownership(INLEHTTPClientDelegateWrapper iNLEHTTPClientDelegateWrapper, long j, boolean z);

    public static final native void INLEHTTPClientDelegateWrapper_director_connect(INLEHTTPClientDelegateWrapper iNLEHTTPClientDelegateWrapper, long j, boolean z, boolean z2);

    public static final native boolean INLEHTTPClientDelegateWrapper_requestNet(long j, INLEHTTPClientDelegateWrapper iNLEHTTPClientDelegateWrapper, String str, int i, long j2, long j3, UnorderedMapStrStr unorderedMapStrStr, long j4, UnorderedMapStrStr unorderedMapStrStr2, String str2, byte[] bArr, long j5, long j6, NLEHttpClientCallbackDelegate nLEHttpClientCallbackDelegate);

    public static final native int MsgExtParam_eHttpType_get(long j, MsgExtParam msgExtParam);

    public static final native void MsgExtParam_eHttpType_set(long j, MsgExtParam msgExtParam, int i);

    public static final native int MsgExtParam_errorCode_get(long j, MsgExtParam msgExtParam);

    public static final native void MsgExtParam_errorCode_set(long j, MsgExtParam msgExtParam, int i);

    public static final native String MsgExtParam_errorMsg_get(long j, MsgExtParam msgExtParam);

    public static final native void MsgExtParam_errorMsg_set(long j, MsgExtParam msgExtParam, String str);

    public static final native long MsgExtParam_uiReqId_get(long j, MsgExtParam msgExtParam);

    public static final native void MsgExtParam_uiReqId_set(long j, MsgExtParam msgExtParam, long j2);

    public static final native void NLEHttpClientCallbackDelegate_onCallback(long j, NLEHttpClientCallbackDelegate nLEHttpClientCallbackDelegate, long j2, int i, byte[] bArr, long j3, long j4, MsgExtParam msgExtParam);

    public static final native int NLEMediaCloudEdit_cancelExport(long j, NLEMediaCloudEdit nLEMediaCloudEdit);

    public static final native String NLEMediaCloudEdit_cloudPreviewDemo(String str);

    public static final native int NLEMediaCloudEdit_exportNLEModel__SWIG_0(long j, NLEMediaCloudEdit nLEMediaCloudEdit, long j2, NLEModel nLEModel, long j3, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native int NLEMediaCloudEdit_exportNLEModel__SWIG_1(long j, NLEMediaCloudEdit nLEMediaCloudEdit, long j2, NLEModel nLEModel, long j3, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native int NLEMediaCloudEdit_setCompileListener(long j, NLEMediaCloudEdit nLEMediaCloudEdit, long j2, NLEModelExportListenerWrapper nLEModelExportListenerWrapper);

    public static final native String NLEMediaRemoteConfig_accessKey_get(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig);

    public static final native void NLEMediaRemoteConfig_accessKey_set(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig, String str);

    public static final native String NLEMediaRemoteConfig_application_get(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig);

    public static final native void NLEMediaRemoteConfig_application_set(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig, String str);

    public static final native String NLEMediaRemoteConfig_area_get(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig);

    public static final native void NLEMediaRemoteConfig_area_set(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig, String str);

    public static final native int NLEMediaRemoteConfig_cacheStrategy_get(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig);

    public static final native void NLEMediaRemoteConfig_cacheStrategy_set(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig, int i);

    public static final native long NLEMediaRemoteConfig_controlParams_get(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig);

    public static final native void NLEMediaRemoteConfig_controlParams_set(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig, long j2, MapStrStr mapStrStr);

    public static final native String NLEMediaRemoteConfig_date_get(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig);

    public static final native void NLEMediaRemoteConfig_date_set(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig, String str);

    public static final native String NLEMediaRemoteConfig_editAction_get(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig);

    public static final native void NLEMediaRemoteConfig_editAction_set(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig, String str);

    public static final native int NLEMediaRemoteConfig_getProgressTaskInternalMs_get(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig);

    public static final native void NLEMediaRemoteConfig_getProgressTaskInternalMs_set(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig, int i);

    public static final native String NLEMediaRemoteConfig_host_get(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig);

    public static final native void NLEMediaRemoteConfig_host_set(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig, String str);

    public static final native int NLEMediaRemoteConfig_requestTimeOutSecond_get(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig);

    public static final native void NLEMediaRemoteConfig_requestTimeOutSecond_set(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig, int i);

    public static final native String NLEMediaRemoteConfig_scene_get(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig);

    public static final native void NLEMediaRemoteConfig_scene_set(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig, String str);

    public static final native String NLEMediaRemoteConfig_secretAccessKey_get(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig);

    public static final native void NLEMediaRemoteConfig_secretAccessKey_set(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig, String str);

    public static final native String NLEMediaRemoteConfig_service_get(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig);

    public static final native void NLEMediaRemoteConfig_service_set(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig, String str);

    public static final native String NLEMediaRemoteConfig_sessionToken_get(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig);

    public static final native void NLEMediaRemoteConfig_sessionToken_set(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig, String str);

    public static final native String NLEMediaRemoteConfig_taskList_get(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig);

    public static final native void NLEMediaRemoteConfig_taskList_set(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig, String str);

    public static final native String NLEMediaRemoteConfig_uploadStoreType_get(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig);

    public static final native void NLEMediaRemoteConfig_uploadStoreType_set(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig, String str);

    public static final native String NLEMediaRemoteConfig_uploader_get(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig);

    public static final native void NLEMediaRemoteConfig_uploader_set(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig, String str);

    public static final native String NLEMediaRemoteConfig_user_get(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig);

    public static final native void NLEMediaRemoteConfig_user_set(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig, String str);

    public static final native int NLEMediaRemoteExporter_cancelExport(long j, NLEMediaRemoteExporter nLEMediaRemoteExporter);

    public static final native int NLEMediaRemoteExporter_exportModel(long j, NLEMediaRemoteExporter nLEMediaRemoteExporter, long j2, NLEModel nLEModel, String str, long j3, NLEVideoEncodeSettings nLEVideoEncodeSettings, String str2);

    public static final native int NLEMediaRemoteExporter_setCompileListener(long j, NLEMediaRemoteExporter nLEMediaRemoteExporter, long j2, NLEModelExportListenerWrapper nLEModelExportListenerWrapper);

    public static final native void NLEModelExportListenerWrapper_change_ownership(NLEModelExportListenerWrapper nLEModelExportListenerWrapper, long j, boolean z);

    public static final native void NLEModelExportListenerWrapper_director_connect(NLEModelExportListenerWrapper nLEModelExportListenerWrapper, long j, boolean z, boolean z2);

    public static final native void NLEModelExportListenerWrapper_onCompileDone(long j, NLEModelExportListenerWrapper nLEModelExportListenerWrapper, long j2, NLEModelExporterListenerParamBody nLEModelExporterListenerParamBody);

    public static final native void NLEModelExportListenerWrapper_onCompileDoneSwigExplicitNLEModelExportListenerWrapper(long j, NLEModelExportListenerWrapper nLEModelExportListenerWrapper, long j2, NLEModelExporterListenerParamBody nLEModelExporterListenerParamBody);

    public static final native void NLEModelExportListenerWrapper_onCompileError(long j, NLEModelExportListenerWrapper nLEModelExportListenerWrapper, int i, int i2, float f, String str);

    public static final native void NLEModelExportListenerWrapper_onCompileErrorSwigExplicitNLEModelExportListenerWrapper(long j, NLEModelExportListenerWrapper nLEModelExportListenerWrapper, int i, int i2, float f, String str);

    public static final native void NLEModelExportListenerWrapper_onCompileProgress(long j, NLEModelExportListenerWrapper nLEModelExportListenerWrapper, float f);

    public static final native void NLEModelExportListenerWrapper_onCompileProgressSwigExplicitNLEModelExportListenerWrapper(long j, NLEModelExportListenerWrapper nLEModelExportListenerWrapper, float f);

    public static final native void NLEModelExportListenerWrapper_onCompileStart(long j, NLEModelExportListenerWrapper nLEModelExportListenerWrapper, long j2, NLEModelExporterListenerParamBody nLEModelExporterListenerParamBody);

    public static final native void NLEModelExportListenerWrapper_onCompileStartSwigExplicitNLEModelExportListenerWrapper(long j, NLEModelExportListenerWrapper nLEModelExportListenerWrapper, long j2, NLEModelExporterListenerParamBody nLEModelExporterListenerParamBody);

    public static final native void NLENetworkClientDelegateWrapper_setHttpClientWrapper(long j, INLEHTTPClientDelegateWrapper iNLEHTTPClientDelegateWrapper);

    public static final native void delete_INLEHTTPClientDelegateWrapper(long j);

    public static final native void delete_MsgExtParam(long j);

    public static final native void delete_NLEHttpClientCallbackDelegate(long j);

    public static final native void delete_NLEMediaCloudEdit(long j);

    public static final native void delete_NLEMediaRemoteConfig(long j);

    public static final native void delete_NLEMediaRemoteExporter(long j);

    public static final native void delete_NLEModelExportListenerWrapper(long j);

    public static final native void delete_NLENetworkClientDelegateWrapper(long j);

    public static final native long new_INLEHTTPClientDelegateWrapper();

    public static final native long new_MsgExtParam();

    public static final native long new_NLEMediaCloudEdit(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig);

    public static final native long new_NLEMediaRemoteConfig();

    public static final native long new_NLEMediaRemoteExporter(long j, NLEMediaRemoteConfig nLEMediaRemoteConfig);

    public static final native long new_NLEModelExportListenerWrapper();

    public static final native long new_NLENetworkClientDelegateWrapper();

    public static final native void swig_module_init();

    static {
        swig_module_init();
    }

    public static void SwigDirector_NLEModelExportListenerWrapper_onCompileDone(NLEModelExportListenerWrapper nLEModelExportListenerWrapper, long j) {
        NLEModelExporterListenerParamBody nLEModelExporterListenerParamBody;
        if (j == 0) {
            nLEModelExporterListenerParamBody = null;
        } else {
            nLEModelExporterListenerParamBody = new NLEModelExporterListenerParamBody(j, true);
        }
        nLEModelExportListenerWrapper.onCompileDone(nLEModelExporterListenerParamBody);
    }

    public static void SwigDirector_NLEModelExportListenerWrapper_onCompileProgress(NLEModelExportListenerWrapper nLEModelExportListenerWrapper, float f) {
        nLEModelExportListenerWrapper.onCompileProgress(f);
    }

    public static void SwigDirector_NLEModelExportListenerWrapper_onCompileStart(NLEModelExportListenerWrapper nLEModelExportListenerWrapper, long j) {
        NLEModelExporterListenerParamBody nLEModelExporterListenerParamBody;
        if (j == 0) {
            nLEModelExporterListenerParamBody = null;
        } else {
            nLEModelExporterListenerParamBody = new NLEModelExporterListenerParamBody(j, true);
        }
        nLEModelExportListenerWrapper.onCompileStart(nLEModelExporterListenerParamBody);
    }

    public static void SwigDirector_NLEModelExportListenerWrapper_onCompileError(NLEModelExportListenerWrapper nLEModelExportListenerWrapper, int i, int i2, float f, String str) {
        nLEModelExportListenerWrapper.onCompileError(i, i2, f, str);
    }

    public static boolean SwigDirector_INLEHTTPClientDelegateWrapper_requestNet(INLEHTTPClientDelegateWrapper iNLEHTTPClientDelegateWrapper, String str, int i, long j, long j2, long j3, String str2, byte[] bArr, long j4, long j5) {
        SWIGTYPE_p_void sWIGTYPE_p_void;
        NLEHttpType nLEHttpTypeSwigToEnum = NLEHttpType.swigToEnum(i);
        UnorderedMapStrStr unorderedMapStrStr = new UnorderedMapStrStr(j2, true);
        UnorderedMapStrStr unorderedMapStrStr2 = new UnorderedMapStrStr(j3, true);
        NLEHttpClientCallbackDelegate nLEHttpClientCallbackDelegate = null;
        if (j4 == 0) {
            sWIGTYPE_p_void = null;
        } else {
            sWIGTYPE_p_void = new SWIGTYPE_p_void(j4, false);
        }
        if (j5 != 0) {
            nLEHttpClientCallbackDelegate = new NLEHttpClientCallbackDelegate(j5, true);
        }
        return iNLEHTTPClientDelegateWrapper.requestNet(str, nLEHttpTypeSwigToEnum, j, unorderedMapStrStr, unorderedMapStrStr2, str2, bArr, sWIGTYPE_p_void, nLEHttpClientCallbackDelegate);
    }
}
