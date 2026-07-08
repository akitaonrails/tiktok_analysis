package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEVideoEffect extends NLETimeSpaceNode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEVideoEffect(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEVideoEffect_clone = NLEEditorJniJNI.NLEVideoEffect_clone(this.swigCPtr, this);
        if (jNLEVideoEffect_clone == 0) {
            return null;
        }
        return new NLENode(jNLEVideoEffect_clone, true);
    }

    public NLESegmentEffect getSegment() {
        long jNLEVideoEffect_getSegment = NLEEditorJniJNI.NLEVideoEffect_getSegment(this.swigCPtr, this);
        if (jNLEVideoEffect_getSegment == 0) {
            return null;
        }
        return new NLESegmentEffect(jNLEVideoEffect_getSegment, true);
    }

    public NLEVideoEffect() {
        this(NLEEditorJniJNI.new_NLEVideoEffect(), true);
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

    public static NLEVideoEffect dynamicCast(NLENode nLENode) {
        long jNLEVideoEffect_dynamicCast = NLEEditorJniJNI.NLEVideoEffect_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEVideoEffect_dynamicCast == 0) {
            return null;
        }
        return new NLEVideoEffect(jNLEVideoEffect_dynamicCast, true);
    }

    public static long getCPtr(NLEVideoEffect nLEVideoEffect) {
        if (nLEVideoEffect == null) {
            return 0L;
        }
        return nLEVideoEffect.swigCPtr;
    }

    public void setSegment(NLESegmentEffect nLESegmentEffect) {
        NLEEditorJniJNI.NLEVideoEffect_setSegment(this.swigCPtr, this, NLESegmentEffect.getCPtr(nLESegmentEffect), nLESegmentEffect);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEVideoEffect(long j, boolean z) {
        super(NLEEditorJniJNI.NLEVideoEffect_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
