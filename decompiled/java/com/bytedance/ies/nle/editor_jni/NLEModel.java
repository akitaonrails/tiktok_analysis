package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEModel extends NLETimeSpaceNode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEModel(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public void clearTrack() {
        NLEEditorJniJNI.NLEModel_clearTrack(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEModel_clone = NLEEditorJniJNI.NLEModel_clone(this.swigCPtr, this);
        if (jNLEModel_clone == 0) {
            return null;
        }
        return new NLENode(jNLEModel_clone, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void copyValueNotMappedToStage() {
        NLEEditorJniJNI.NLEModel_copyValueNotMappedToStage(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public NLENode deepClone() {
        long jNLEModel_deepClone__SWIG_1 = NLEEditorJniJNI.NLEModel_deepClone__SWIG_1(this.swigCPtr, this);
        if (jNLEModel_deepClone__SWIG_1 == 0) {
            return null;
        }
        return new NLENode(jNLEModel_deepClone__SWIG_1, true);
    }

    public void genNLEModelId() {
        NLEEditorJniJNI.NLEModel_genNLEModelId(this.swigCPtr, this);
    }

    public String getAlignMode() {
        return NLEEditorJniJNI.NLEModel_getAlignMode(this.swigCPtr, this);
    }

    public VecNLEResourceNodeSPtr getAllResources() {
        return new VecNLEResourceNodeSPtr(NLEEditorJniJNI.NLEModel_getAllResources(this.swigCPtr, this), true);
    }

    public float getCanvasRatio() {
        return NLEEditorJniJNI.NLEModel_getCanvasRatio(this.swigCPtr, this);
    }

    public NLEVideoFrameModel getCover() {
        long jNLEModel_getCover = NLEEditorJniJNI.NLEModel_getCover(this.swigCPtr, this);
        if (jNLEModel_getCover == 0) {
            return null;
        }
        return new NLEVideoFrameModel(jNLEModel_getCover, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode
    public long getDuration() {
        return NLEEditorJniJNI.NLEModel_getDuration(this.swigCPtr, this);
    }

    public int getEffectLayerMax() {
        return NLEEditorJniJNI.NLEModel_getEffectLayerMax(this.swigCPtr, this);
    }

    public int getLayerMax() {
        return NLEEditorJniJNI.NLEModel_getLayerMax(this.swigCPtr, this);
    }

    public NLETrack getMainTrack() {
        long jNLEModel_getMainTrack__SWIG_1 = NLEEditorJniJNI.NLEModel_getMainTrack__SWIG_1(this.swigCPtr, this);
        if (jNLEModel_getMainTrack__SWIG_1 == 0) {
            return null;
        }
        return new NLETrack(jNLEModel_getMainTrack__SWIG_1, true);
    }

    public long getMaxTargetEnd() {
        return NLEEditorJniJNI.NLEModel_getMaxTargetEnd__SWIG_1(this.swigCPtr, this);
    }

    public long getMaxTargetEndWithoutTimeEffect() {
        return NLEEditorJniJNI.NLEModel_getMaxTargetEndWithoutTimeEffect(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode
    public long getMeasuredEndTime() {
        return NLEEditorJniJNI.NLEModel_getMeasuredEndTime(this.swigCPtr, this);
    }

    public long getMinTargetStart() {
        return NLEEditorJniJNI.NLEModel_getMinTargetStart(this.swigCPtr, this);
    }

    public long getNLEModelId() {
        return NLEEditorJniJNI.NLEModel_getNLEModelId(this.swigCPtr, this);
    }

    public NLERenderSetting getRenderSetting() {
        long jNLEModel_getRenderSetting = NLEEditorJniJNI.NLEModel_getRenderSetting(this.swigCPtr, this);
        if (jNLEModel_getRenderSetting == 0) {
            return null;
        }
        return new NLERenderSetting(jNLEModel_getRenderSetting, true);
    }

    public NLETrackDurationType getSequenceDurationType() {
        return NLETrackDurationType.swigToEnum(NLEEditorJniJNI.NLEModel_getSequenceDurationType(this.swigCPtr, this));
    }

    public NLESetting getSetting() {
        long jNLEModel_getSetting = NLEEditorJniJNI.NLEModel_getSetting(this.swigCPtr, this);
        if (jNLEModel_getSetting == 0) {
            return null;
        }
        return new NLESetting(jNLEModel_getSetting, true);
    }

    public VecNLETrackSPtr getSortedTracks() {
        return new VecNLETrackSPtr(NLEEditorJniJNI.NLEModel_getSortedTracks(this.swigCPtr, this), true);
    }

    public VecNLETrackSPtr getSortedTracksWithNoNoneTrack() {
        return new VecNLETrackSPtr(NLEEditorJniJNI.NLEModel_getSortedTracksWithNoNoneTrack(this.swigCPtr, this), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode
    public long getStartTime() {
        return NLEEditorJniJNI.NLEModel_getStartTime(this.swigCPtr, this);
    }

    public long getThousandFps() {
        return NLEEditorJniJNI.NLEModel_getThousandFps(this.swigCPtr, this);
    }

    public VecNLETrackSPtr getTracks() {
        return new VecNLETrackSPtr(NLEEditorJniJNI.NLEModel_getTracks(this.swigCPtr, this), true);
    }

    public NLEModel getWorkingObjet() {
        long jNLEModel_getWorkingObjet = NLEEditorJniJNI.NLEModel_getWorkingObjet(this.swigCPtr, this);
        if (jNLEModel_getWorkingObjet == 0) {
            return null;
        }
        return new NLEModel(jNLEModel_getWorkingObjet, true);
    }

    public boolean hasAlignMode() {
        return NLEEditorJniJNI.NLEModel_hasAlignMode(this.swigCPtr, this);
    }

    public boolean hasCanvasRatio() {
        return NLEEditorJniJNI.NLEModel_hasCanvasRatio(this.swigCPtr, this);
    }

    public boolean hasSequenceDurationType() {
        return NLEEditorJniJNI.NLEModel_hasSequenceDurationType(this.swigCPtr, this);
    }

    public boolean hasThousandFps() {
        return NLEEditorJniJNI.NLEModel_hasThousandFps(this.swigCPtr, this);
    }

    public void resetDefaultTimeEffect() {
        NLEEditorJniJNI.NLEModel_resetDefaultTimeEffect(this.swigCPtr, this);
    }

    public NLEModel() {
        this(NLEEditorJniJNI.new_NLEModel(), true);
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

    public static NLEModel dynamicCast(NLENode nLENode) {
        long jNLEModel_dynamicCast = NLEEditorJniJNI.NLEModel_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEModel_dynamicCast == 0) {
            return null;
        }
        return new NLEModel(jNLEModel_dynamicCast, true);
    }

    public static long getCPtr(NLEModel nLEModel) {
        if (nLEModel == null) {
            return 0L;
        }
        return nLEModel.swigCPtr;
    }

    public void addTrack(NLETrack nLETrack) {
        NLEEditorJniJNI.NLEModel_addTrack(this.swigCPtr, this, NLETrack.getCPtr(nLETrack), nLETrack);
    }

    public NLEError applyPatch(NLEModel nLEModel) {
        return NLEError.swigToEnum(NLEEditorJniJNI.NLEModel_applyPatch(this.swigCPtr, this, getCPtr(nLEModel), nLEModel));
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public NLENode deepClone(boolean z) {
        long jNLEModel_deepClone__SWIG_0 = NLEEditorJniJNI.NLEModel_deepClone__SWIG_0(this.swigCPtr, this, z);
        if (jNLEModel_deepClone__SWIG_0 == 0) {
            return null;
        }
        return new NLENode(jNLEModel_deepClone__SWIG_0, true);
    }

    public NLETrack getFirstTrackWithType(NLETrackType nLETrackType) {
        long jNLEModel_getFirstTrackWithType = NLEEditorJniJNI.NLEModel_getFirstTrackWithType(this.swigCPtr, this, nLETrackType.swigValue());
        if (jNLEModel_getFirstTrackWithType == 0) {
            return null;
        }
        return new NLETrack(jNLEModel_getFirstTrackWithType, true);
    }

    public NLETrack getMainTrack(boolean z) {
        long jNLEModel_getMainTrack__SWIG_0 = NLEEditorJniJNI.NLEModel_getMainTrack__SWIG_0(this.swigCPtr, this, z);
        if (jNLEModel_getMainTrack__SWIG_0 == 0) {
            return null;
        }
        return new NLETrack(jNLEModel_getMainTrack__SWIG_0, true);
    }

    public long getMaxTargetEnd(VecNLETrackType vecNLETrackType) {
        return NLEEditorJniJNI.NLEModel_getMaxTargetEnd__SWIG_0(this.swigCPtr, this, VecNLETrackType.getCPtr(vecNLETrackType), vecNLETrackType);
    }

    public long getMaxTargetEndExcludeDisabledNode(boolean z) {
        return NLEEditorJniJNI.NLEModel_getMaxTargetEndExcludeDisabledNode(this.swigCPtr, this, z);
    }

    public NLEMatrix getRawNLEMatrix(NLETimeSpaceNode nLETimeSpaceNode) {
        long jNLEModel_getRawNLEMatrix__SWIG_1 = NLEEditorJniJNI.NLEModel_getRawNLEMatrix__SWIG_1(this.swigCPtr, this, NLETimeSpaceNode.getCPtr(nLETimeSpaceNode), nLETimeSpaceNode);
        if (jNLEModel_getRawNLEMatrix__SWIG_1 == 0) {
            return null;
        }
        return new NLEMatrix(jNLEModel_getRawNLEMatrix__SWIG_1, true);
    }

    public NLETrack getTrackBySlot(NLETrackSlot nLETrackSlot) {
        long jNLEModel_getTrackBySlot = NLEEditorJniJNI.NLEModel_getTrackBySlot(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
        if (jNLEModel_getTrackBySlot == 0) {
            return null;
        }
        return new NLETrack(jNLEModel_getTrackBySlot, true);
    }

    public VecNLETrackSPtr getTracksWithTypes(VecNLETrackType vecNLETrackType) {
        return new VecNLETrackSPtr(NLEEditorJniJNI.NLEModel_getTracksWithTypes(this.swigCPtr, this, VecNLETrackType.getCPtr(vecNLETrackType), vecNLETrackType), true);
    }

    public boolean removeTrack(NLETrack nLETrack) {
        return NLEEditorJniJNI.NLEModel_removeTrack(this.swigCPtr, this, NLETrack.getCPtr(nLETrack), nLETrack);
    }

    public void setAlignMode(String str) {
        NLEEditorJniJNI.NLEModel_setAlignMode(this.swigCPtr, this, str);
    }

    public void setCanvasRatio(float f) {
        NLEEditorJniJNI.NLEModel_setCanvasRatio(this.swigCPtr, this, f);
    }

    public void setCover(NLEVideoFrameModel nLEVideoFrameModel) {
        NLEEditorJniJNI.NLEModel_setCover(this.swigCPtr, this, NLEVideoFrameModel.getCPtr(nLEVideoFrameModel), nLEVideoFrameModel);
    }

    public void setRenderSetting(NLERenderSetting nLERenderSetting) {
        NLEEditorJniJNI.NLEModel_setRenderSetting(this.swigCPtr, this, NLERenderSetting.getCPtr(nLERenderSetting), nLERenderSetting);
    }

    public void setSequenceDurationType(NLETrackDurationType nLETrackDurationType) {
        NLEEditorJniJNI.NLEModel_setSequenceDurationType(this.swigCPtr, this, nLETrackDurationType.swigValue());
    }

    public void setSetting(NLESetting nLESetting) {
        NLEEditorJniJNI.NLEModel_setSetting(this.swigCPtr, this, NLESetting.getCPtr(nLESetting), nLESetting);
    }

    public void setThousandFps(long j) {
        NLEEditorJniJNI.NLEModel_setThousandFps(this.swigCPtr, this, j);
    }

    public void setWorkingObject(NLEModel nLEModel) {
        NLEEditorJniJNI.NLEModel_setWorkingObject(this.swigCPtr, this, getCPtr(nLEModel), nLEModel);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEError unapplyPatch(NLEModel nLEModel) {
        return NLEError.swigToEnum(NLEEditorJniJNI.NLEModel_unapplyPatch(this.swigCPtr, this, getCPtr(nLEModel), nLEModel));
    }

    public NLEModel(long j, boolean z) {
        super(NLEEditorJniJNI.NLEModel_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public NLEMatrix getRawNLEMatrix(NLETimeSpaceNode nLETimeSpaceNode, boolean z) {
        long jNLEModel_getRawNLEMatrix__SWIG_0 = NLEEditorJniJNI.NLEModel_getRawNLEMatrix__SWIG_0(this.swigCPtr, this, NLETimeSpaceNode.getCPtr(nLETimeSpaceNode), nLETimeSpaceNode, z);
        if (jNLEModel_getRawNLEMatrix__SWIG_0 == 0) {
            return null;
        }
        return new NLEMatrix(jNLEModel_getRawNLEMatrix__SWIG_0, true);
    }

    public void setRewind(boolean z, VecNLETrackType vecNLETrackType) {
        NLEEditorJniJNI.NLEModel_setRewind(this.swigCPtr, this, z, VecNLETrackType.getCPtr(vecNLETrackType), vecNLETrackType);
    }

    public void updateRelativeSizeWhileGlobalCanvasChanged(float f, float f2) {
        NLEEditorJniJNI.NLEModel_updateRelativeSizeWhileGlobalCanvasChanged(this.swigCPtr, this, f, f2);
    }
}
