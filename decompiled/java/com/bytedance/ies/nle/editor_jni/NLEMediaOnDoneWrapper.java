package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEMediaOnDoneWrapper extends INLEMediaOnDone {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaOnDone
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEMediaPublicJniJNI.delete_NLEMediaOnDoneWrapper(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaOnDone
    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaOnDone
    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        NLEMediaPublicJniJNI.NLEMediaOnDoneWrapper_change_ownership(this, this.swigCPtr, false);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaOnDone
    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.NLEMediaOnDoneWrapper_change_ownership(this, this.swigCPtr, true);
    }

    public NLEMediaOnDoneWrapper() {
        this(NLEMediaPublicJniJNI.new_NLEMediaOnDoneWrapper(), true);
        NLEMediaPublicJniJNI.NLEMediaOnDoneWrapper_director_connect(this, this.swigCPtr, true, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaOnDone
    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMediaOnDoneWrapper nLEMediaOnDoneWrapper) {
        if (nLEMediaOnDoneWrapper == null) {
            return 0L;
        }
        return nLEMediaOnDoneWrapper.swigCPtr;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaOnDone
    public void onDone(int i) {
        if (getClass() == NLEMediaOnDoneWrapper.class) {
            NLEMediaPublicJniJNI.NLEMediaOnDoneWrapper_onDone(this.swigCPtr, this, i);
        } else {
            NLEMediaPublicJniJNI.NLEMediaOnDoneWrapper_onDoneSwigExplicitNLEMediaOnDoneWrapper(this.swigCPtr, this, i);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaOnDone
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEMediaOnDoneWrapper(long j, boolean z) {
        super(NLEMediaPublicJniJNI.NLEMediaOnDoneWrapper_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
