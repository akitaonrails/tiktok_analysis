package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEMattingListenerWrapper extends INLEMattingListener {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEMediaPublicJniJNI.delete_NLEMattingListenerWrapper(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        NLEMediaPublicJniJNI.NLEMattingListenerWrapper_change_ownership(this, this.swigCPtr, false);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.NLEMattingListenerWrapper_change_ownership(this, this.swigCPtr, true);
    }

    public NLEMattingListenerWrapper() {
        this(NLEMediaPublicJniJNI.new_NLEMattingListenerWrapper(), true);
        NLEMediaPublicJniJNI.NLEMattingListenerWrapper_director_connect(this, this.swigCPtr, true, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMattingListenerWrapper nLEMattingListenerWrapper) {
        if (nLEMattingListenerWrapper == null) {
            return 0L;
        }
        return nLEMattingListenerWrapper.swigCPtr;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEMattingListenerWrapper(long j, boolean z) {
        super(NLEMediaPublicJniJNI.NLEMattingListenerWrapper_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
