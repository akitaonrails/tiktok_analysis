package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEResourceDownloadConfig extends INLEResourceDownloadConfig {
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.INLEResourceDownloadConfig
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEResourceDownloadConfig(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public NLEResourceDownloadConfig() {
        this(NLEMediaPublicJniJNI.new_NLEResourceDownloadConfig(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEResourceDownloadConfig
    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEResourceDownloadConfig nLEResourceDownloadConfig) {
        if (nLEResourceDownloadConfig == null) {
            return 0L;
        }
        return nLEResourceDownloadConfig.swigCPtr;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEResourceDownloadConfig
    public void setResourcePriorityConfig(String str) {
        NLEMediaPublicJniJNI.NLEResourceDownloadConfig_setResourcePriorityConfig(this.swigCPtr, this, str);
    }

    public NLEResourceDownloadConfig(long j, boolean z) {
        super(NLEMediaPublicJniJNI.NLEResourceDownloadConfig_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
