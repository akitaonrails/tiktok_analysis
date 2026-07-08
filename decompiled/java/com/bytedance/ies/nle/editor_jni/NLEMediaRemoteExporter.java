package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes23.dex */
public class NLEMediaRemoteExporter {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaRemoteJniJNI.delete_NLEMediaRemoteExporter(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLEError cancelExport() {
        return NLEError.swigToEnum(NLEMediaRemoteJniJNI.NLEMediaRemoteExporter_cancelExport(this.swigCPtr, this));
    }

    public void finalize() {
        delete();
    }

    public NLEMediaRemoteExporter(NLEMediaRemoteConfig nLEMediaRemoteConfig) {
        this(NLEMediaRemoteJniJNI.new_NLEMediaRemoteExporter(NLEMediaRemoteConfig.getCPtr(nLEMediaRemoteConfig), nLEMediaRemoteConfig), true);
    }

    public static long getCPtr(NLEMediaRemoteExporter nLEMediaRemoteExporter) {
        if (nLEMediaRemoteExporter == null) {
            return 0L;
        }
        return nLEMediaRemoteExporter.swigCPtr;
    }

    public NLEError setCompileListener(NLEModelExportListenerWrapper nLEModelExportListenerWrapper) {
        return NLEError.swigToEnum(NLEMediaRemoteJniJNI.NLEMediaRemoteExporter_setCompileListener(this.swigCPtr, this, NLEModelExportListenerWrapper.getCPtr(nLEModelExportListenerWrapper), nLEModelExportListenerWrapper));
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEMediaRemoteExporter(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public NLEError exportModel(NLEModel nLEModel, String str, NLEVideoEncodeSettings nLEVideoEncodeSettings, String str2) {
        return NLEError.swigToEnum(NLEMediaRemoteJniJNI.NLEMediaRemoteExporter_exportModel(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel, str, NLEVideoEncodeSettings.getCPtr(nLEVideoEncodeSettings), nLEVideoEncodeSettings, str2));
    }
}
