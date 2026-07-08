package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEStringStringPair extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEStringStringPair(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEStringStringPair_clone = NLEEditorJniJNI.NLEStringStringPair_clone(this.swigCPtr, this);
        if (jNLEStringStringPair_clone == 0) {
            return null;
        }
        return new NLENode(jNLEStringStringPair_clone, true);
    }

    public String getFirst() {
        return NLEEditorJniJNI.NLEStringStringPair_getFirst(this.swigCPtr, this);
    }

    public String getSecond() {
        return NLEEditorJniJNI.NLEStringStringPair_getSecond(this.swigCPtr, this);
    }

    public boolean hasFirst() {
        return NLEEditorJniJNI.NLEStringStringPair_hasFirst(this.swigCPtr, this);
    }

    public boolean hasSecond() {
        return NLEEditorJniJNI.NLEStringStringPair_hasSecond(this.swigCPtr, this);
    }

    public NLEStringStringPair() {
        this(NLEEditorJniJNI.new_NLEStringStringPair(), true);
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

    public static NLEStringStringPair dynamicCast(NLENode nLENode) {
        long jNLEStringStringPair_dynamicCast = NLEEditorJniJNI.NLEStringStringPair_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEStringStringPair_dynamicCast == 0) {
            return null;
        }
        return new NLEStringStringPair(jNLEStringStringPair_dynamicCast, true);
    }

    public static long getCPtr(NLEStringStringPair nLEStringStringPair) {
        if (nLEStringStringPair == null) {
            return 0L;
        }
        return nLEStringStringPair.swigCPtr;
    }

    public void setFirst(String str) {
        NLEEditorJniJNI.NLEStringStringPair_setFirst(this.swigCPtr, this, str);
    }

    public void setSecond(String str) {
        NLEEditorJniJNI.NLEStringStringPair_setSecond(this.swigCPtr, this, str);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEStringStringPair(long j, boolean z) {
        super(NLEEditorJniJNI.NLEStringStringPair_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
