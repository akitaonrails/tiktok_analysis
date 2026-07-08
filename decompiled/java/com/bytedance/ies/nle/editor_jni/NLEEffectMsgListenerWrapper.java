package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEEffectMsgListenerWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEEffectMsgListenerWrapper(j);
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
        NLEMediaPublicJniJNI.NLEEffectMsgListenerWrapper_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.NLEEffectMsgListenerWrapper_change_ownership(this, this.swigCPtr, true);
    }

    public NLEEffectMsgListenerWrapper() {
        this(NLEMediaPublicJniJNI.new_NLEEffectMsgListenerWrapper(), true);
        NLEMediaPublicJniJNI.NLEEffectMsgListenerWrapper_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEEffectMsgListenerWrapper nLEEffectMsgListenerWrapper) {
        if (nLEEffectMsgListenerWrapper == null) {
            return 0L;
        }
        return nLEEffectMsgListenerWrapper.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEEffectMsgListenerWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onMessageReceived(int i, int i2, int i3, String str) {
        if (getClass() == NLEEffectMsgListenerWrapper.class) {
            NLEMediaPublicJniJNI.NLEEffectMsgListenerWrapper_onMessageReceived(this.swigCPtr, this, i, i2, i3, str);
        } else {
            NLEMediaPublicJniJNI.NLEEffectMsgListenerWrapper_onMessageReceivedSwigExplicitNLEEffectMsgListenerWrapper(this.swigCPtr, this, i, i2, i3, str);
        }
    }
}
