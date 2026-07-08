package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEVideoFrameModel extends NLETimeSpaceNode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEVideoFrameModel(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public void clearTrack() {
        NLEEditorJniJNI.NLEVideoFrameModel_clearTrack(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEVideoFrameModel_clone = NLEEditorJniJNI.NLEVideoFrameModel_clone(this.swigCPtr, this);
        if (jNLEVideoFrameModel_clone == 0) {
            return null;
        }
        return new NLENode(jNLEVideoFrameModel_clone, true);
    }

    public float getCanvasRatio() {
        return NLEEditorJniJNI.NLEVideoFrameModel_getCanvasRatio(this.swigCPtr, this);
    }

    public NLEStyCanvas getCoverMaterial() {
        long jNLEVideoFrameModel_getCoverMaterial = NLEEditorJniJNI.NLEVideoFrameModel_getCoverMaterial(this.swigCPtr, this);
        if (jNLEVideoFrameModel_getCoverMaterial == 0) {
            return null;
        }
        return new NLEStyCanvas(jNLEVideoFrameModel_getCoverMaterial, true);
    }

    public NLEResourceNode getSnapshot() {
        long jNLEVideoFrameModel_getSnapshot = NLEEditorJniJNI.NLEVideoFrameModel_getSnapshot(this.swigCPtr, this);
        if (jNLEVideoFrameModel_getSnapshot == 0) {
            return null;
        }
        return new NLEResourceNode(jNLEVideoFrameModel_getSnapshot, true);
    }

    public VecNLETrackSPtr getTracks() {
        return new VecNLETrackSPtr(NLEEditorJniJNI.NLEVideoFrameModel_getTracks(this.swigCPtr, this), true);
    }

    public long getVideoFrameTime() {
        return NLEEditorJniJNI.NLEVideoFrameModel_getVideoFrameTime(this.swigCPtr, this);
    }

    public boolean hasCanvasRatio() {
        return NLEEditorJniJNI.NLEVideoFrameModel_hasCanvasRatio(this.swigCPtr, this);
    }

    public boolean hasVideoFrameTime() {
        return NLEEditorJniJNI.NLEVideoFrameModel_hasVideoFrameTime(this.swigCPtr, this);
    }

    public NLEVideoFrameModel() {
        this(NLEEditorJniJNI.new_NLEVideoFrameModel(), true);
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

    public static NLEVideoFrameModel dynamicCast(NLENode nLENode) {
        long jNLEVideoFrameModel_dynamicCast = NLEEditorJniJNI.NLEVideoFrameModel_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEVideoFrameModel_dynamicCast == 0) {
            return null;
        }
        return new NLEVideoFrameModel(jNLEVideoFrameModel_dynamicCast, true);
    }

    public static long getCPtr(NLEVideoFrameModel nLEVideoFrameModel) {
        if (nLEVideoFrameModel == null) {
            return 0L;
        }
        return nLEVideoFrameModel.swigCPtr;
    }

    public void addTrack(NLETrack nLETrack) {
        NLEEditorJniJNI.NLEVideoFrameModel_addTrack(this.swigCPtr, this, NLETrack.getCPtr(nLETrack), nLETrack);
    }

    public boolean removeTrack(NLETrack nLETrack) {
        return NLEEditorJniJNI.NLEVideoFrameModel_removeTrack(this.swigCPtr, this, NLETrack.getCPtr(nLETrack), nLETrack);
    }

    public void setCanvasRatio(float f) {
        NLEEditorJniJNI.NLEVideoFrameModel_setCanvasRatio(this.swigCPtr, this, f);
    }

    public void setCoverMaterial(NLEStyCanvas nLEStyCanvas) {
        NLEEditorJniJNI.NLEVideoFrameModel_setCoverMaterial(this.swigCPtr, this, NLEStyCanvas.getCPtr(nLEStyCanvas), nLEStyCanvas);
    }

    public void setSnapshot(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLEVideoFrameModel_setSnapshot(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setVideoFrameTime(long j) {
        NLEEditorJniJNI.NLEVideoFrameModel_setVideoFrameTime(this.swigCPtr, this, j);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEVideoFrameModel(long j, boolean z) {
        super(NLEEditorJniJNI.NLEVideoFrameModel_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
