package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEDoActionListenerWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEDoActionListenerWrapper(j);
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
        NLEMediaPublicJniJNI.NLEDoActionListenerWrapper_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.NLEDoActionListenerWrapper_change_ownership(this, this.swigCPtr, true);
    }

    public NLEDoActionListenerWrapper() {
        this(NLEMediaPublicJniJNI.new_NLEDoActionListenerWrapper(), true);
        NLEMediaPublicJniJNI.NLEDoActionListenerWrapper_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEDoActionListenerWrapper nLEDoActionListenerWrapper) {
        if (nLEDoActionListenerWrapper == null) {
            return 0L;
        }
        return nLEDoActionListenerWrapper.swigCPtr;
    }

    public void onDoActionCompleted(MapStrStr mapStrStr) {
        if (getClass() == NLEDoActionListenerWrapper.class) {
            NLEMediaPublicJniJNI.NLEDoActionListenerWrapper_onDoActionCompleted(this.swigCPtr, this, MapStrStr.getCPtr(mapStrStr), mapStrStr);
        } else {
            NLEMediaPublicJniJNI.NLEDoActionListenerWrapper_onDoActionCompletedSwigExplicitNLEDoActionListenerWrapper(this.swigCPtr, this, MapStrStr.getCPtr(mapStrStr), mapStrStr);
        }
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEDoActionListenerWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
