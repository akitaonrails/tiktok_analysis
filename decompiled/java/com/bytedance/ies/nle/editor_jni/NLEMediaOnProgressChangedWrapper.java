package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEMediaOnProgressChangedWrapper extends INLEMediaOnProgressChanged {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaOnProgressChanged
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEMediaPublicJniJNI.delete_NLEMediaOnProgressChangedWrapper(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaOnProgressChanged
    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaOnProgressChanged
    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        NLEMediaPublicJniJNI.NLEMediaOnProgressChangedWrapper_change_ownership(this, this.swigCPtr, false);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaOnProgressChanged
    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.NLEMediaOnProgressChangedWrapper_change_ownership(this, this.swigCPtr, true);
    }

    public NLEMediaOnProgressChangedWrapper() {
        this(NLEMediaPublicJniJNI.new_NLEMediaOnProgressChangedWrapper(), true);
        NLEMediaPublicJniJNI.NLEMediaOnProgressChangedWrapper_director_connect(this, this.swigCPtr, true, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaOnProgressChanged
    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMediaOnProgressChangedWrapper nLEMediaOnProgressChangedWrapper) {
        if (nLEMediaOnProgressChangedWrapper == null) {
            return 0L;
        }
        return nLEMediaOnProgressChangedWrapper.swigCPtr;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaOnProgressChanged
    public void onChanged(double d) {
        if (getClass() == NLEMediaOnProgressChangedWrapper.class) {
            NLEMediaPublicJniJNI.NLEMediaOnProgressChangedWrapper_onChanged(this.swigCPtr, this, d);
        } else {
            NLEMediaPublicJniJNI.NLEMediaOnProgressChangedWrapper_onChangedSwigExplicitNLEMediaOnProgressChangedWrapper(this.swigCPtr, this, d);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaOnProgressChanged
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEMediaOnProgressChangedWrapper(long j, boolean z) {
        super(NLEMediaPublicJniJNI.NLEMediaOnProgressChangedWrapper_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
