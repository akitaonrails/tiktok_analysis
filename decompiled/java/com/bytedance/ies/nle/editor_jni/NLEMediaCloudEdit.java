package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes23.dex */
public class NLEMediaCloudEdit {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaRemoteJniJNI.delete_NLEMediaCloudEdit(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLEError cancelExport() {
        return NLEError.swigToEnum(NLEMediaRemoteJniJNI.NLEMediaCloudEdit_cancelExport(this.swigCPtr, this));
    }

    public void finalize() {
        delete();
    }

    public NLEMediaCloudEdit(NLEMediaRemoteConfig nLEMediaRemoteConfig) {
        this(NLEMediaRemoteJniJNI.new_NLEMediaCloudEdit(NLEMediaRemoteConfig.getCPtr(nLEMediaRemoteConfig), nLEMediaRemoteConfig), true);
    }

    public static String cloudPreviewDemo(String str) {
        return NLEMediaRemoteJniJNI.NLEMediaCloudEdit_cloudPreviewDemo(str);
    }

    public static long getCPtr(NLEMediaCloudEdit nLEMediaCloudEdit) {
        if (nLEMediaCloudEdit == null) {
            return 0L;
        }
        return nLEMediaCloudEdit.swigCPtr;
    }

    public NLEError setCompileListener(NLEModelExportListenerWrapper nLEModelExportListenerWrapper) {
        return NLEError.swigToEnum(NLEMediaRemoteJniJNI.NLEMediaCloudEdit_setCompileListener(this.swigCPtr, this, NLEModelExportListenerWrapper.getCPtr(nLEModelExportListenerWrapper), nLEModelExportListenerWrapper));
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEMediaCloudEdit(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public NLEError exportNLEModel(NLEModel nLEModel, NLEVideoEncodeSettings nLEVideoEncodeSettings) {
        return NLEError.swigToEnum(NLEMediaRemoteJniJNI.NLEMediaCloudEdit_exportNLEModel__SWIG_1(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel, NLEVideoEncodeSettings.getCPtr(nLEVideoEncodeSettings), nLEVideoEncodeSettings));
    }

    public NLEError exportNLEModel(NLEModel nLEModel, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z) {
        return NLEError.swigToEnum(NLEMediaRemoteJniJNI.NLEMediaCloudEdit_exportNLEModel__SWIG_0(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel, NLEVideoEncodeSettings.getCPtr(nLEVideoEncodeSettings), nLEVideoEncodeSettings, z));
    }
}
