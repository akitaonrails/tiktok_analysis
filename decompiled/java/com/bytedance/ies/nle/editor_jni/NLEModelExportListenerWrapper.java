package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEModelExportListenerWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaRemoteJniJNI.delete_NLEModelExportListenerWrapper(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_change_ownership(this, this.swigCPtr, true);
    }

    public NLEModelExportListenerWrapper() {
        this(NLEMediaRemoteJniJNI.new_NLEModelExportListenerWrapper(), true);
        NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_director_connect(this, this.swigCPtr, true, false);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEModelExportListenerWrapper nLEModelExportListenerWrapper) {
        if (nLEModelExportListenerWrapper == null) {
            return 0L;
        }
        return nLEModelExportListenerWrapper.swigCPtr;
    }

    public void onCompileDone(NLEModelExporterListenerParamBody nLEModelExporterListenerParamBody) {
        if (getClass() == NLEModelExportListenerWrapper.class) {
            NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_onCompileDone(this.swigCPtr, this, NLEModelExporterListenerParamBody.getCPtr(nLEModelExporterListenerParamBody), nLEModelExporterListenerParamBody);
        } else {
            NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_onCompileDoneSwigExplicitNLEModelExportListenerWrapper(this.swigCPtr, this, NLEModelExporterListenerParamBody.getCPtr(nLEModelExporterListenerParamBody), nLEModelExporterListenerParamBody);
        }
    }

    public void onCompileProgress(float f) {
        if (getClass() == NLEModelExportListenerWrapper.class) {
            NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_onCompileProgress(this.swigCPtr, this, f);
        } else {
            NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_onCompileProgressSwigExplicitNLEModelExportListenerWrapper(this.swigCPtr, this, f);
        }
    }

    public void onCompileStart(NLEModelExporterListenerParamBody nLEModelExporterListenerParamBody) {
        if (getClass() == NLEModelExportListenerWrapper.class) {
            NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_onCompileStart(this.swigCPtr, this, NLEModelExporterListenerParamBody.getCPtr(nLEModelExporterListenerParamBody), nLEModelExporterListenerParamBody);
        } else {
            NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_onCompileStartSwigExplicitNLEModelExportListenerWrapper(this.swigCPtr, this, NLEModelExporterListenerParamBody.getCPtr(nLEModelExporterListenerParamBody), nLEModelExporterListenerParamBody);
        }
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEModelExportListenerWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onCompileError(int i, int i2, float f, String str) {
        if (getClass() == NLEModelExportListenerWrapper.class) {
            NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_onCompileError(this.swigCPtr, this, i, i2, f, str);
        } else {
            NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_onCompileErrorSwigExplicitNLEModelExportListenerWrapper(this.swigCPtr, this, i, i2, f, str);
        }
    }
}
