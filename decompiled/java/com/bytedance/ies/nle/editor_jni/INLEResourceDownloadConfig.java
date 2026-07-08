package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class INLEResourceDownloadConfig {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_INLEResourceDownloadConfig(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int getConcurrentTaskNum() {
        return NLEMediaJniJNI.INLEResourceDownloadConfig_concurrentTaskNum_get(this.swigCPtr, this);
    }

    public int getMaxPauseCount() {
        return NLEMediaJniJNI.INLEResourceDownloadConfig_maxPauseCount_get(this.swigCPtr, this);
    }

    public NLEResourcePriorityRule getPriorityRule() {
        return NLEResourcePriorityRule.swigToEnum(NLEMediaJniJNI.INLEResourceDownloadConfig_priorityRule_get(this.swigCPtr, this));
    }

    public int getTimeThreshold() {
        return NLEMediaJniJNI.INLEResourceDownloadConfig_timeThreshold_get(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(INLEResourceDownloadConfig iNLEResourceDownloadConfig) {
        if (iNLEResourceDownloadConfig == null) {
            return 0L;
        }
        return iNLEResourceDownloadConfig.swigCPtr;
    }

    public void setConcurrentTaskNum(int i) {
        NLEMediaJniJNI.INLEResourceDownloadConfig_concurrentTaskNum_set(this.swigCPtr, this, i);
    }

    public void setMaxPauseCount(int i) {
        NLEMediaJniJNI.INLEResourceDownloadConfig_maxPauseCount_set(this.swigCPtr, this, i);
    }

    public void setPriorityRule(NLEResourcePriorityRule nLEResourcePriorityRule) {
        NLEMediaJniJNI.INLEResourceDownloadConfig_priorityRule_set(this.swigCPtr, this, nLEResourcePriorityRule.swigValue());
    }

    public void setResourcePriorityConfig(String str) {
        NLEMediaJniJNI.INLEResourceDownloadConfig_setResourcePriorityConfig(this.swigCPtr, this, str);
    }

    public void setTimeThreshold(int i) {
        NLEMediaJniJNI.INLEResourceDownloadConfig_timeThreshold_set(this.swigCPtr, this, i);
    }

    public INLEResourceDownloadConfig(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
