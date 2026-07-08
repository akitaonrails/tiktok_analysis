package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLETrackMV extends NLETrack {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLETrackMV(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public void clearMask() {
        NLEEditorJniJNI.NLETrackMV_clearMask(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLETrackMV_clone = NLEEditorJniJNI.NLETrackMV_clone(this.swigCPtr, this);
        if (jNLETrackMV_clone == 0) {
            return null;
        }
        return new NLENode(jNLETrackMV_clone, true);
    }

    public NLEResourceNode getAlgorithm() {
        long jNLETrackMV_getAlgorithm = NLEEditorJniJNI.NLETrackMV_getAlgorithm(this.swigCPtr, this);
        if (jNLETrackMV_getAlgorithm == 0) {
            return null;
        }
        return new NLEResourceNode(jNLETrackMV_getAlgorithm, true);
    }

    public String getAlgorithmConnectedAudioSlotName() {
        return NLEEditorJniJNI.NLETrackMV_getAlgorithmConnectedAudioSlotName(this.swigCPtr, this);
    }

    public int getCustomHeight() {
        return NLEEditorJniJNI.NLETrackMV_getCustomHeight(this.swigCPtr, this);
    }

    public int getCustomWidth() {
        return NLEEditorJniJNI.NLETrackMV_getCustomWidth(this.swigCPtr, this);
    }

    public String getExtraParams() {
        return NLEEditorJniJNI.NLETrackMV_getExtraParams(this.swigCPtr, this);
    }

    public NLEResourceNode getMV() {
        long jNLETrackMV_getMV = NLEEditorJniJNI.NLETrackMV_getMV(this.swigCPtr, this);
        if (jNLETrackMV_getMV == 0) {
            return null;
        }
        return new NLEResourceNode(jNLETrackMV_getMV, true);
    }

    public int getMVResolution() {
        return NLEEditorJniJNI.NLETrackMV_getMVResolution(this.swigCPtr, this);
    }

    public VecNLEMVExternalAlgorithmResultSPtr getMasks() {
        return new VecNLEMVExternalAlgorithmResultSPtr(NLEEditorJniJNI.NLETrackMV_getMasks(this.swigCPtr, this), true);
    }

    public boolean getSingleVideo() {
        return NLEEditorJniJNI.NLETrackMV_getSingleVideo(this.swigCPtr, this);
    }

    public boolean hasAlgorithmConnectedAudioSlotName() {
        return NLEEditorJniJNI.NLETrackMV_hasAlgorithmConnectedAudioSlotName(this.swigCPtr, this);
    }

    public boolean hasCustomHeight() {
        return NLEEditorJniJNI.NLETrackMV_hasCustomHeight(this.swigCPtr, this);
    }

    public boolean hasCustomWidth() {
        return NLEEditorJniJNI.NLETrackMV_hasCustomWidth(this.swigCPtr, this);
    }

    public boolean hasExtraParams() {
        return NLEEditorJniJNI.NLETrackMV_hasExtraParams(this.swigCPtr, this);
    }

    public boolean hasMVResolution() {
        return NLEEditorJniJNI.NLETrackMV_hasMVResolution(this.swigCPtr, this);
    }

    public boolean hasSingleVideo() {
        return NLEEditorJniJNI.NLETrackMV_hasSingleVideo(this.swigCPtr, this);
    }

    public NLETrackMV() {
        this(NLEEditorJniJNI.new_NLETrackMV(), true);
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

    public static NLETrackMV dynamicCast(NLENode nLENode) {
        long jNLETrackMV_dynamicCast = NLEEditorJniJNI.NLETrackMV_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLETrackMV_dynamicCast == 0) {
            return null;
        }
        return new NLETrackMV(jNLETrackMV_dynamicCast, true);
    }

    public static long getCPtr(NLETrackMV nLETrackMV) {
        if (nLETrackMV == null) {
            return 0L;
        }
        return nLETrackMV.swigCPtr;
    }

    public void addMask(NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult) {
        NLEEditorJniJNI.NLETrackMV_addMask(this.swigCPtr, this, NLEMVExternalAlgorithmResult.getCPtr(nLEMVExternalAlgorithmResult), nLEMVExternalAlgorithmResult);
    }

    public boolean removeMask(NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult) {
        return NLEEditorJniJNI.NLETrackMV_removeMask(this.swigCPtr, this, NLEMVExternalAlgorithmResult.getCPtr(nLEMVExternalAlgorithmResult), nLEMVExternalAlgorithmResult);
    }

    public void setAlgorithm(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLETrackMV_setAlgorithm(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setAlgorithmConnectedAudioSlotName(String str) {
        NLEEditorJniJNI.NLETrackMV_setAlgorithmConnectedAudioSlotName(this.swigCPtr, this, str);
    }

    public void setCustomHeight(int i) {
        NLEEditorJniJNI.NLETrackMV_setCustomHeight(this.swigCPtr, this, i);
    }

    public void setCustomWidth(int i) {
        NLEEditorJniJNI.NLETrackMV_setCustomWidth(this.swigCPtr, this, i);
    }

    public void setExtraParams(String str) {
        NLEEditorJniJNI.NLETrackMV_setExtraParams(this.swigCPtr, this, str);
    }

    public void setMV(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLETrackMV_setMV(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setMVResolution(int i) {
        NLEEditorJniJNI.NLETrackMV_setMVResolution(this.swigCPtr, this, i);
    }

    public void setSingleVideo(boolean z) {
        NLEEditorJniJNI.NLETrackMV_setSingleVideo(this.swigCPtr, this, z);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLETrackMV(long j, boolean z) {
        super(NLEEditorJniJNI.NLETrackMV_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
