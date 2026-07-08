package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentVideoAnimation extends NLESegment {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentVideoAnimation(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentVideoAnimation_clone = NLEEditorJniJNI.NLESegmentVideoAnimation_clone(this.swigCPtr, this);
        if (jNLESegmentVideoAnimation_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentVideoAnimation_clone, true);
    }

    public String getAnimJsonParam() {
        return NLEEditorJniJNI.NLESegmentVideoAnimation_getAnimJsonParam(this.swigCPtr, this);
    }

    public long getAnimationDuration() {
        return NLEEditorJniJNI.NLESegmentVideoAnimation_getAnimationDuration(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public long getDuration() {
        return NLEEditorJniJNI.NLESegmentVideoAnimation_getDuration(this.swigCPtr, this);
    }

    public NLEResourceNode getEffectSDKVideoAnimation() {
        long jNLESegmentVideoAnimation_getEffectSDKVideoAnimation = NLEEditorJniJNI.NLESegmentVideoAnimation_getEffectSDKVideoAnimation(this.swigCPtr, this);
        if (jNLESegmentVideoAnimation_getEffectSDKVideoAnimation == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentVideoAnimation_getEffectSDKVideoAnimation, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResourceNode getResource() {
        long jNLESegmentVideoAnimation_getResource = NLEEditorJniJNI.NLESegmentVideoAnimation_getResource(this.swigCPtr, this);
        if (jNLESegmentVideoAnimation_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentVideoAnimation_getResource, true);
    }

    public boolean hasAnimJsonParam() {
        return NLEEditorJniJNI.NLESegmentVideoAnimation_hasAnimJsonParam(this.swigCPtr, this);
    }

    public boolean hasAnimationDuration() {
        return NLEEditorJniJNI.NLESegmentVideoAnimation_hasAnimationDuration(this.swigCPtr, this);
    }

    public NLESegmentVideoAnimation() {
        this(NLEEditorJniJNI.new_NLESegmentVideoAnimation(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLESegmentVideoAnimation dynamicCast(NLENode nLENode) {
        long jNLESegmentVideoAnimation_dynamicCast = NLEEditorJniJNI.NLESegmentVideoAnimation_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentVideoAnimation_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentVideoAnimation(jNLESegmentVideoAnimation_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentVideoAnimation nLESegmentVideoAnimation) {
        if (nLESegmentVideoAnimation == null) {
            return 0L;
        }
        return nLESegmentVideoAnimation.swigCPtr;
    }

    public void setAnimJsonParam(String str) {
        NLEEditorJniJNI.NLESegmentVideoAnimation_setAnimJsonParam(this.swigCPtr, this, str);
    }

    public void setAnimationDuration(long j) {
        NLEEditorJniJNI.NLESegmentVideoAnimation_setAnimationDuration(this.swigCPtr, this, j);
    }

    public void setEffectSDKVideoAnimation(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentVideoAnimation_setEffectSDKVideoAnimation(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentVideoAnimation(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentVideoAnimation_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
