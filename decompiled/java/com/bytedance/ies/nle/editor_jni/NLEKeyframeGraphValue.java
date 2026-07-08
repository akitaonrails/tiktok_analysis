package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEKeyframeGraphValue extends NLETimeSpaceNode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEKeyframeGraphValue(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public void clearKeyframeGraphPoint() {
        NLEEditorJniJNI.NLEKeyframeGraphValue_clearKeyframeGraphPoint(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEKeyframeGraphValue_clone = NLEEditorJniJNI.NLEKeyframeGraphValue_clone(this.swigCPtr, this);
        if (jNLEKeyframeGraphValue_clone == 0) {
            return null;
        }
        return new NLENode(jNLEKeyframeGraphValue_clone, true);
    }

    public VecNLEPointSPtr getKeyframeGraphPoints() {
        return new VecNLEPointSPtr(NLEEditorJniJNI.NLEKeyframeGraphValue_getKeyframeGraphPoints(this.swigCPtr, this), true);
    }

    public NLEKeyframeGraphValue() {
        this(NLEEditorJniJNI.new_NLEKeyframeGraphValue(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLEKeyframeGraphValue dynamicCast(NLENode nLENode) {
        long jNLEKeyframeGraphValue_dynamicCast = NLEEditorJniJNI.NLEKeyframeGraphValue_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEKeyframeGraphValue_dynamicCast == 0) {
            return null;
        }
        return new NLEKeyframeGraphValue(jNLEKeyframeGraphValue_dynamicCast, true);
    }

    public static long getCPtr(NLEKeyframeGraphValue nLEKeyframeGraphValue) {
        if (nLEKeyframeGraphValue == null) {
            return 0L;
        }
        return nLEKeyframeGraphValue.swigCPtr;
    }

    public void addKeyframeGraphPoint(NLEPoint nLEPoint) {
        NLEEditorJniJNI.NLEKeyframeGraphValue_addKeyframeGraphPoint(this.swigCPtr, this, NLEPoint.getCPtr(nLEPoint), nLEPoint);
    }

    public boolean removeKeyframeGraphPoint(NLEPoint nLEPoint) {
        return NLEEditorJniJNI.NLEKeyframeGraphValue_removeKeyframeGraphPoint(this.swigCPtr, this, NLEPoint.getCPtr(nLEPoint), nLEPoint);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEKeyframeGraphValue(long j, boolean z) {
        super(NLEEditorJniJNI.NLEKeyframeGraphValue_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
