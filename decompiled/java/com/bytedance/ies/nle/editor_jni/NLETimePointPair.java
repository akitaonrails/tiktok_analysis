package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLETimePointPair extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLETimePointPair(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLETimePointPair_clone = NLEEditorJniJNI.NLETimePointPair_clone(this.swigCPtr, this);
        if (jNLETimePointPair_clone == 0) {
            return null;
        }
        return new NLENode(jNLETimePointPair_clone, true);
    }

    public long getTime() {
        return NLEEditorJniJNI.NLETimePointPair_getTime(this.swigCPtr, this);
    }

    public VecDouble getValue() {
        return new VecDouble(NLEEditorJniJNI.NLETimePointPair_getValue(this.swigCPtr, this), true);
    }

    public boolean hasTime() {
        return NLEEditorJniJNI.NLETimePointPair_hasTime(this.swigCPtr, this);
    }

    public boolean hasValue() {
        return NLEEditorJniJNI.NLETimePointPair_hasValue(this.swigCPtr, this);
    }

    public NLETimePointPair() {
        this(NLEEditorJniJNI.new_NLETimePointPair(), true);
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

    public static NLETimePointPair dynamicCast(NLENode nLENode) {
        long jNLETimePointPair_dynamicCast = NLEEditorJniJNI.NLETimePointPair_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLETimePointPair_dynamicCast == 0) {
            return null;
        }
        return new NLETimePointPair(jNLETimePointPair_dynamicCast, true);
    }

    public static long getCPtr(NLETimePointPair nLETimePointPair) {
        if (nLETimePointPair == null) {
            return 0L;
        }
        return nLETimePointPair.swigCPtr;
    }

    public void setTime(long j) {
        NLEEditorJniJNI.NLETimePointPair_setTime(this.swigCPtr, this, j);
    }

    public void setValue(VecDouble vecDouble) {
        NLEEditorJniJNI.NLETimePointPair_setValue(this.swigCPtr, this, VecDouble.getCPtr(vecDouble), vecDouble);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLETimePointPair(long j, boolean z) {
        super(NLEEditorJniJNI.NLETimePointPair_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
