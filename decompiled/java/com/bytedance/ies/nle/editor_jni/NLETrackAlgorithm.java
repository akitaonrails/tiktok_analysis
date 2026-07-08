package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLETrackAlgorithm extends NLETrack {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLETrackAlgorithm(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLETrackAlgorithm_clone = NLEEditorJniJNI.NLETrackAlgorithm_clone(this.swigCPtr, this);
        if (jNLETrackAlgorithm_clone == 0) {
            return null;
        }
        return new NLENode(jNLETrackAlgorithm_clone, true);
    }

    public float getVideoRatio() {
        return NLEEditorJniJNI.NLETrackAlgorithm_getVideoRatio(this.swigCPtr, this);
    }

    public boolean hasVideoRatio() {
        return NLEEditorJniJNI.NLETrackAlgorithm_hasVideoRatio(this.swigCPtr, this);
    }

    public NLETrackAlgorithm() {
        this(NLEEditorJniJNI.new_NLETrackAlgorithm(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLETrackAlgorithm dynamicCast(NLENode nLENode) {
        long jNLETrackAlgorithm_dynamicCast = NLEEditorJniJNI.NLETrackAlgorithm_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLETrackAlgorithm_dynamicCast == 0) {
            return null;
        }
        return new NLETrackAlgorithm(jNLETrackAlgorithm_dynamicCast, true);
    }

    public static long getCPtr(NLETrackAlgorithm nLETrackAlgorithm) {
        if (nLETrackAlgorithm == null) {
            return 0L;
        }
        return nLETrackAlgorithm.swigCPtr;
    }

    public void setVideoRatio(float f) {
        NLEEditorJniJNI.NLETrackAlgorithm_setVideoRatio(this.swigCPtr, this, f);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLETrackAlgorithm(long j, boolean z) {
        super(NLEEditorJniJNI.NLETrackAlgorithm_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
