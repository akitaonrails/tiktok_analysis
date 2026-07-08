package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEListenerCompileTargetFileInfoPredictWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEListenerCompileTargetFileInfoPredictWrapper(j);
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
        NLEMediaPublicJniJNI.NLEListenerCompileTargetFileInfoPredictWrapper_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.NLEListenerCompileTargetFileInfoPredictWrapper_change_ownership(this, this.swigCPtr, true);
    }

    public NLEListenerCompileTargetFileInfoPredictWrapper() {
        this(NLEMediaPublicJniJNI.new_NLEListenerCompileTargetFileInfoPredictWrapper(), true);
        NLEMediaPublicJniJNI.NLEListenerCompileTargetFileInfoPredictWrapper_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEListenerCompileTargetFileInfoPredictWrapper nLEListenerCompileTargetFileInfoPredictWrapper) {
        if (nLEListenerCompileTargetFileInfoPredictWrapper == null) {
            return 0L;
        }
        return nLEListenerCompileTargetFileInfoPredictWrapper.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEListenerCompileTargetFileInfoPredictWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onCompileTargetFileInfoPredict(long j, long j2, boolean z, boolean z2) {
        if (getClass() == NLEListenerCompileTargetFileInfoPredictWrapper.class) {
            NLEMediaPublicJniJNI.NLEListenerCompileTargetFileInfoPredictWrapper_onCompileTargetFileInfoPredict(this.swigCPtr, this, j, j2, z, z2);
        } else {
            NLEMediaPublicJniJNI.NLEListenerCompileTargetFileInfoPredictWrapper_onCompileTargetFileInfoPredictSwigExplicitNLEListenerCompileTargetFileInfoPredictWrapper(this.swigCPtr, this, j, j2, z, z2);
        }
    }
}
