package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEModelExporterListenerParamBody {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEModelExporterListenerParamBody(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getStrParam() {
        return NLEMediaJniJNI.NLEModelExporterListenerParamBody_strParam_get(this.swigCPtr, this);
    }

    public String getVideoUrl() {
        return NLEMediaJniJNI.NLEModelExporterListenerParamBody_videoUrl_get(this.swigCPtr, this);
    }

    public NLEModelExporterListenerParamBody() {
        this(NLEMediaJniJNI.new_NLEModelExporterListenerParamBody(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEModelExporterListenerParamBody nLEModelExporterListenerParamBody) {
        if (nLEModelExporterListenerParamBody == null) {
            return 0L;
        }
        return nLEModelExporterListenerParamBody.swigCPtr;
    }

    public void setStrParam(String str) {
        NLEMediaJniJNI.NLEModelExporterListenerParamBody_strParam_set(this.swigCPtr, this, str);
    }

    public void setVideoUrl(String str) {
        NLEMediaJniJNI.NLEModelExporterListenerParamBody_videoUrl_set(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEModelExporterListenerParamBody(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
