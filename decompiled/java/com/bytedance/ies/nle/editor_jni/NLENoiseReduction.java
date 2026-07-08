package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLENoiseReduction extends NLETimeSpaceNode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLENoiseReduction(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLENoiseReduction_clone = NLEEditorJniJNI.NLENoiseReduction_clone(this.swigCPtr, this);
        if (jNLENoiseReduction_clone == 0) {
            return null;
        }
        return new NLENode(jNLENoiseReduction_clone, true);
    }

    public NLENoiseReduction() {
        this(NLEEditorJniJNI.new_NLENoiseReduction(), true);
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

    public static NLENoiseReduction dynamicCast(NLENode nLENode) {
        long jNLENoiseReduction_dynamicCast = NLEEditorJniJNI.NLENoiseReduction_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLENoiseReduction_dynamicCast == 0) {
            return null;
        }
        return new NLENoiseReduction(jNLENoiseReduction_dynamicCast, true);
    }

    public static long getCPtr(NLENoiseReduction nLENoiseReduction) {
        if (nLENoiseReduction == null) {
            return 0L;
        }
        return nLENoiseReduction.swigCPtr;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLENoiseReduction(long j, boolean z) {
        super(NLEEditorJniJNI.NLENoiseReduction_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
