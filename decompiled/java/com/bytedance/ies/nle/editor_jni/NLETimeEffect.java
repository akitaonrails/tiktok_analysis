package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLETimeEffect extends NLETimeSpaceNode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLETimeEffect(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLETimeEffect_clone = NLEEditorJniJNI.NLETimeEffect_clone(this.swigCPtr, this);
        if (jNLETimeEffect_clone == 0) {
            return null;
        }
        return new NLENode(jNLETimeEffect_clone, true);
    }

    public NLESegmentTimeEffect getSegment() {
        long jNLETimeEffect_getSegment = NLEEditorJniJNI.NLETimeEffect_getSegment(this.swigCPtr, this);
        if (jNLETimeEffect_getSegment == 0) {
            return null;
        }
        return new NLESegmentTimeEffect(jNLETimeEffect_getSegment, true);
    }

    public NLETimeEffect() {
        this(NLEEditorJniJNI.new_NLETimeEffect(), true);
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

    public static NLETimeEffect dynamicCast(NLENode nLENode) {
        long jNLETimeEffect_dynamicCast = NLEEditorJniJNI.NLETimeEffect_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLETimeEffect_dynamicCast == 0) {
            return null;
        }
        return new NLETimeEffect(jNLETimeEffect_dynamicCast, true);
    }

    public static long getCPtr(NLETimeEffect nLETimeEffect) {
        if (nLETimeEffect == null) {
            return 0L;
        }
        return nLETimeEffect.swigCPtr;
    }

    public void setSegment(NLESegmentTimeEffect nLESegmentTimeEffect) {
        NLEEditorJniJNI.NLETimeEffect_setSegment(this.swigCPtr, this, NLESegmentTimeEffect.getCPtr(nLESegmentTimeEffect), nLESegmentTimeEffect);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLETimeEffect(long j, boolean z) {
        super(NLEEditorJniJNI.NLETimeEffect_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
