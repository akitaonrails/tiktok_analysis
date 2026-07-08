package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEVideoAnimation extends NLETimeSpaceNode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEVideoAnimation(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEVideoAnimation_clone = NLEEditorJniJNI.NLEVideoAnimation_clone(this.swigCPtr, this);
        if (jNLEVideoAnimation_clone == 0) {
            return null;
        }
        return new NLENode(jNLEVideoAnimation_clone, true);
    }

    public boolean getIsNewAnim() {
        return NLEEditorJniJNI.NLEVideoAnimation_getIsNewAnim(this.swigCPtr, this);
    }

    public NLESegmentVideoAnimation getSegment() {
        long jNLEVideoAnimation_getSegment = NLEEditorJniJNI.NLEVideoAnimation_getSegment(this.swigCPtr, this);
        if (jNLEVideoAnimation_getSegment == 0) {
            return null;
        }
        return new NLESegmentVideoAnimation(jNLEVideoAnimation_getSegment, true);
    }

    public boolean hasIsNewAnim() {
        return NLEEditorJniJNI.NLEVideoAnimation_hasIsNewAnim(this.swigCPtr, this);
    }

    public NLEVideoAnimation() {
        this(NLEEditorJniJNI.new_NLEVideoAnimation(), true);
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

    public static NLEVideoAnimation dynamicCast(NLENode nLENode) {
        long jNLEVideoAnimation_dynamicCast = NLEEditorJniJNI.NLEVideoAnimation_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEVideoAnimation_dynamicCast == 0) {
            return null;
        }
        return new NLEVideoAnimation(jNLEVideoAnimation_dynamicCast, true);
    }

    public static long getCPtr(NLEVideoAnimation nLEVideoAnimation) {
        if (nLEVideoAnimation == null) {
            return 0L;
        }
        return nLEVideoAnimation.swigCPtr;
    }

    public void setIsNewAnim(boolean z) {
        NLEEditorJniJNI.NLEVideoAnimation_setIsNewAnim(this.swigCPtr, this, z);
    }

    public void setSegment(NLESegmentVideoAnimation nLESegmentVideoAnimation) {
        NLEEditorJniJNI.NLEVideoAnimation_setSegment(this.swigCPtr, this, NLESegmentVideoAnimation.getCPtr(nLESegmentVideoAnimation), nLESegmentVideoAnimation);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEVideoAnimation(long j, boolean z) {
        super(NLEEditorJniJNI.NLEVideoAnimation_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
