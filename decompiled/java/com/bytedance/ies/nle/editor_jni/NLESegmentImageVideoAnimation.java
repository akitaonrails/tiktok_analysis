package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentImageVideoAnimation extends NLESegmentVideoAnimation {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentImageVideoAnimation(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentImageVideoAnimation_clone = NLEEditorJniJNI.NLESegmentImageVideoAnimation_clone(this.swigCPtr, this);
        if (jNLESegmentImageVideoAnimation_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentImageVideoAnimation_clone, true);
    }

    public float getBeginScale() {
        return NLEEditorJniJNI.NLESegmentImageVideoAnimation_getBeginScale(this.swigCPtr, this);
    }

    public float getEndScale() {
        return NLEEditorJniJNI.NLESegmentImageVideoAnimation_getEndScale(this.swigCPtr, this);
    }

    public boolean hasBeginScale() {
        return NLEEditorJniJNI.NLESegmentImageVideoAnimation_hasBeginScale(this.swigCPtr, this);
    }

    public boolean hasEndScale() {
        return NLEEditorJniJNI.NLESegmentImageVideoAnimation_hasEndScale(this.swigCPtr, this);
    }

    public NLESegmentImageVideoAnimation() {
        this(NLEEditorJniJNI.new_NLESegmentImageVideoAnimation(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLESegmentImageVideoAnimation dynamicCast(NLENode nLENode) {
        long jNLESegmentImageVideoAnimation_dynamicCast = NLEEditorJniJNI.NLESegmentImageVideoAnimation_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentImageVideoAnimation_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentImageVideoAnimation(jNLESegmentImageVideoAnimation_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentImageVideoAnimation nLESegmentImageVideoAnimation) {
        if (nLESegmentImageVideoAnimation == null) {
            return 0L;
        }
        return nLESegmentImageVideoAnimation.swigCPtr;
    }

    public void setBeginScale(float f) {
        NLEEditorJniJNI.NLESegmentImageVideoAnimation_setBeginScale(this.swigCPtr, this, f);
    }

    public void setEndScale(float f) {
        NLEEditorJniJNI.NLESegmentImageVideoAnimation_setEndScale(this.swigCPtr, this, f);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentImageVideoAnimation(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentImageVideoAnimation_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
