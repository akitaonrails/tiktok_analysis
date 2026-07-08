package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEStringFloatPair extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEStringFloatPair(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEStringFloatPair_clone = NLEEditorJniJNI.NLEStringFloatPair_clone(this.swigCPtr, this);
        if (jNLEStringFloatPair_clone == 0) {
            return null;
        }
        return new NLENode(jNLEStringFloatPair_clone, true);
    }

    public String getFirst() {
        return NLEEditorJniJNI.NLEStringFloatPair_getFirst(this.swigCPtr, this);
    }

    public float getSecond() {
        return NLEEditorJniJNI.NLEStringFloatPair_getSecond(this.swigCPtr, this);
    }

    public boolean hasFirst() {
        return NLEEditorJniJNI.NLEStringFloatPair_hasFirst(this.swigCPtr, this);
    }

    public boolean hasSecond() {
        return NLEEditorJniJNI.NLEStringFloatPair_hasSecond(this.swigCPtr, this);
    }

    public NLEStringFloatPair() {
        this(NLEEditorJniJNI.new_NLEStringFloatPair(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLEStringFloatPair dynamicCast(NLENode nLENode) {
        long jNLEStringFloatPair_dynamicCast = NLEEditorJniJNI.NLEStringFloatPair_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEStringFloatPair_dynamicCast == 0) {
            return null;
        }
        return new NLEStringFloatPair(jNLEStringFloatPair_dynamicCast, true);
    }

    public static long getCPtr(NLEStringFloatPair nLEStringFloatPair) {
        if (nLEStringFloatPair == null) {
            return 0L;
        }
        return nLEStringFloatPair.swigCPtr;
    }

    public void setFirst(String str) {
        NLEEditorJniJNI.NLEStringFloatPair_setFirst(this.swigCPtr, this, str);
    }

    public void setSecond(float f) {
        NLEEditorJniJNI.NLEStringFloatPair_setSecond(this.swigCPtr, this, f);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEStringFloatPair(long j, boolean z) {
        super(NLEEditorJniJNI.NLEStringFloatPair_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
