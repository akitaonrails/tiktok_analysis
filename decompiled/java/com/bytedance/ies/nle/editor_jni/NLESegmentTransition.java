package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentTransition extends NLESegment {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentTransition(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentTransition_clone = NLEEditorJniJNI.NLESegmentTransition_clone(this.swigCPtr, this);
        if (jNLESegmentTransition_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentTransition_clone, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public long getDuration() {
        return NLEEditorJniJNI.NLESegmentTransition_getDuration(this.swigCPtr, this);
    }

    public NLEResourceNode getEffectSDKTransition() {
        long jNLESegmentTransition_getEffectSDKTransition = NLEEditorJniJNI.NLESegmentTransition_getEffectSDKTransition(this.swigCPtr, this);
        if (jNLESegmentTransition_getEffectSDKTransition == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentTransition_getEffectSDKTransition, true);
    }

    public NLEMediaTransType getMediaTransType() {
        return NLEMediaTransType.swigToEnum(NLEEditorJniJNI.NLESegmentTransition_getMediaTransType(this.swigCPtr, this));
    }

    public boolean getOverlap() {
        return NLEEditorJniJNI.NLESegmentTransition_getOverlap(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResourceNode getResource() {
        long jNLESegmentTransition_getResource = NLEEditorJniJNI.NLESegmentTransition_getResource(this.swigCPtr, this);
        if (jNLESegmentTransition_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentTransition_getResource, true);
    }

    public boolean getTimeChange() {
        return NLEEditorJniJNI.NLESegmentTransition_getTimeChange(this.swigCPtr, this);
    }

    public long getTransitionDuration() {
        return NLEEditorJniJNI.NLESegmentTransition_getTransitionDuration(this.swigCPtr, this);
    }

    public boolean hasMediaTransType() {
        return NLEEditorJniJNI.NLESegmentTransition_hasMediaTransType(this.swigCPtr, this);
    }

    public boolean hasOverlap() {
        return NLEEditorJniJNI.NLESegmentTransition_hasOverlap(this.swigCPtr, this);
    }

    public boolean hasTimeChange() {
        return NLEEditorJniJNI.NLESegmentTransition_hasTimeChange(this.swigCPtr, this);
    }

    public boolean hasTransitionDuration() {
        return NLEEditorJniJNI.NLESegmentTransition_hasTransitionDuration(this.swigCPtr, this);
    }

    public NLESegmentTransition() {
        this(NLEEditorJniJNI.new_NLESegmentTransition(), true);
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

    public static NLESegmentTransition dynamicCast(NLENode nLENode) {
        long jNLESegmentTransition_dynamicCast = NLEEditorJniJNI.NLESegmentTransition_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentTransition_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentTransition(jNLESegmentTransition_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentTransition nLESegmentTransition) {
        if (nLESegmentTransition == null) {
            return 0L;
        }
        return nLESegmentTransition.swigCPtr;
    }

    public void setEffectSDKTransition(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentTransition_setEffectSDKTransition(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setMediaTransType(NLEMediaTransType nLEMediaTransType) {
        NLEEditorJniJNI.NLESegmentTransition_setMediaTransType(this.swigCPtr, this, nLEMediaTransType.swigValue());
    }

    public void setOverlap(boolean z) {
        NLEEditorJniJNI.NLESegmentTransition_setOverlap(this.swigCPtr, this, z);
    }

    public void setTimeChange(boolean z) {
        NLEEditorJniJNI.NLESegmentTransition_setTimeChange(this.swigCPtr, this, z);
    }

    public void setTransitionDuration(long j) {
        NLEEditorJniJNI.NLESegmentTransition_setTransitionDuration(this.swigCPtr, this, j);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentTransition(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentTransition_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
