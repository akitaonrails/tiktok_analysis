package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentAIMatting extends NLESegment {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentAIMatting(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public void clearStroke() {
        NLEEditorJniJNI.NLESegmentAIMatting_clearStroke(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentAIMatting_clone = NLEEditorJniJNI.NLESegmentAIMatting_clone(this.swigCPtr, this);
        if (jNLESegmentAIMatting_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentAIMatting_clone, true);
    }

    public long getAiMattingCilpEnd() {
        return NLEEditorJniJNI.NLESegmentAIMatting_getAiMattingCilpEnd(this.swigCPtr, this);
    }

    public long getAiMattingCilpStart() {
        return NLEEditorJniJNI.NLESegmentAIMatting_getAiMattingCilpStart(this.swigCPtr, this);
    }

    public int getArcherStrategy() {
        return NLEEditorJniJNI.NLESegmentAIMatting_getArcherStrategy(this.swigCPtr, this);
    }

    public NLEResourceNode getBlend() {
        long jNLESegmentAIMatting_getBlend = NLEEditorJniJNI.NLESegmentAIMatting_getBlend(this.swigCPtr, this);
        if (jNLESegmentAIMatting_getBlend == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentAIMatting_getBlend, true);
    }

    public int getBlendColor() {
        return NLEEditorJniJNI.NLESegmentAIMatting_getBlendColor(this.swigCPtr, this);
    }

    public NLEResourceNode getBlendCutout() {
        long jNLESegmentAIMatting_getBlendCutout = NLEEditorJniJNI.NLESegmentAIMatting_getBlendCutout(this.swigCPtr, this);
        if (jNLESegmentAIMatting_getBlendCutout == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentAIMatting_getBlendCutout, true);
    }

    public NLEResourceNode getBlendMask() {
        long jNLESegmentAIMatting_getBlendMask = NLEEditorJniJNI.NLESegmentAIMatting_getBlendMask(this.swigCPtr, this);
        if (jNLESegmentAIMatting_getBlendMask == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentAIMatting_getBlendMask, true);
    }

    public NLEMattingBlendMode getBlendMode() {
        return NLEMattingBlendMode.swigToEnum(NLEEditorJniJNI.NLESegmentAIMatting_getBlendMode(this.swigCPtr, this));
    }

    public NLECustomMattingParam getCustomMattingParam() {
        long jNLESegmentAIMatting_getCustomMattingParam = NLEEditorJniJNI.NLESegmentAIMatting_getCustomMattingParam(this.swigCPtr, this);
        if (jNLESegmentAIMatting_getCustomMattingParam == 0) {
            return null;
        }
        return new NLECustomMattingParam(jNLESegmentAIMatting_getCustomMattingParam, true);
    }

    public boolean getDisableDownSampleForBach() {
        return NLEEditorJniJNI.NLESegmentAIMatting_getDisableDownSampleForBach(this.swigCPtr, this);
    }

    public boolean getDisableSaveCacheInCompile() {
        return NLEEditorJniJNI.NLESegmentAIMatting_getDisableSaveCacheInCompile(this.swigCPtr, this);
    }

    public boolean getExportMonoCutoutRes() {
        return NLEEditorJniJNI.NLESegmentAIMatting_getExportMonoCutoutRes(this.swigCPtr, this);
    }

    public VecLongLong getInteractiveTime() {
        return new VecLongLong(NLEEditorJniJNI.NLESegmentAIMatting_getInteractiveTime(this.swigCPtr, this), true);
    }

    public String getMattingTag() {
        return NLEEditorJniJNI.NLESegmentAIMatting_getMattingTag(this.swigCPtr, this);
    }

    public int getMattingType() {
        return NLEEditorJniJNI.NLESegmentAIMatting_getMattingType(this.swigCPtr, this);
    }

    public boolean getNeedRunningMattingTask() {
        return NLEEditorJniJNI.NLESegmentAIMatting_getNeedRunningMattingTask(this.swigCPtr, this);
    }

    public NLEInteractivePenParam getPenParam() {
        long jNLESegmentAIMatting_getPenParam = NLEEditorJniJNI.NLESegmentAIMatting_getPenParam(this.swigCPtr, this);
        if (jNLESegmentAIMatting_getPenParam == 0) {
            return null;
        }
        return new NLEInteractivePenParam(jNLESegmentAIMatting_getPenParam, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResourceNode getResource() {
        long jNLESegmentAIMatting_getResource = NLEEditorJniJNI.NLESegmentAIMatting_getResource(this.swigCPtr, this);
        if (jNLESegmentAIMatting_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentAIMatting_getResource, true);
    }

    public NLEResourceNode getResourceAiMatting() {
        long jNLESegmentAIMatting_getResourceAiMatting = NLEEditorJniJNI.NLESegmentAIMatting_getResourceAiMatting(this.swigCPtr, this);
        if (jNLESegmentAIMatting_getResourceAiMatting == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentAIMatting_getResourceAiMatting, true);
    }

    public NLEResourceNode getResourceAlgorithm() {
        long jNLESegmentAIMatting_getResourceAlgorithm = NLEEditorJniJNI.NLESegmentAIMatting_getResourceAlgorithm(this.swigCPtr, this);
        if (jNLESegmentAIMatting_getResourceAlgorithm == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentAIMatting_getResourceAlgorithm, true);
    }

    public VecNLEMattingStroke getStrokes() {
        return new VecNLEMattingStroke(NLEEditorJniJNI.NLESegmentAIMatting_getStrokes(this.swigCPtr, this), true);
    }

    public String getWorkSpace() {
        return NLEEditorJniJNI.NLESegmentAIMatting_getWorkSpace(this.swigCPtr, this);
    }

    public boolean hasAiMattingCilpEnd() {
        return NLEEditorJniJNI.NLESegmentAIMatting_hasAiMattingCilpEnd(this.swigCPtr, this);
    }

    public boolean hasAiMattingCilpStart() {
        return NLEEditorJniJNI.NLESegmentAIMatting_hasAiMattingCilpStart(this.swigCPtr, this);
    }

    public boolean hasArcherStrategy() {
        return NLEEditorJniJNI.NLESegmentAIMatting_hasArcherStrategy(this.swigCPtr, this);
    }

    public boolean hasBlendColor() {
        return NLEEditorJniJNI.NLESegmentAIMatting_hasBlendColor(this.swigCPtr, this);
    }

    public boolean hasBlendMode() {
        return NLEEditorJniJNI.NLESegmentAIMatting_hasBlendMode(this.swigCPtr, this);
    }

    public boolean hasDisableDownSampleForBach() {
        return NLEEditorJniJNI.NLESegmentAIMatting_hasDisableDownSampleForBach(this.swigCPtr, this);
    }

    public boolean hasDisableSaveCacheInCompile() {
        return NLEEditorJniJNI.NLESegmentAIMatting_hasDisableSaveCacheInCompile(this.swigCPtr, this);
    }

    public boolean hasExportMonoCutoutRes() {
        return NLEEditorJniJNI.NLESegmentAIMatting_hasExportMonoCutoutRes(this.swigCPtr, this);
    }

    public boolean hasInteractiveTime() {
        return NLEEditorJniJNI.NLESegmentAIMatting_hasInteractiveTime(this.swigCPtr, this);
    }

    public boolean hasMattingTag() {
        return NLEEditorJniJNI.NLESegmentAIMatting_hasMattingTag(this.swigCPtr, this);
    }

    public boolean hasMattingType() {
        return NLEEditorJniJNI.NLESegmentAIMatting_hasMattingType(this.swigCPtr, this);
    }

    public boolean hasNeedRunningMattingTask() {
        return NLEEditorJniJNI.NLESegmentAIMatting_hasNeedRunningMattingTask(this.swigCPtr, this);
    }

    public boolean hasWorkSpace() {
        return NLEEditorJniJNI.NLESegmentAIMatting_hasWorkSpace(this.swigCPtr, this);
    }

    public String toStrokeParamJson() {
        return NLEEditorJniJNI.NLESegmentAIMatting_toStrokeParamJson(this.swigCPtr, this);
    }

    public NLESegmentAIMatting() {
        this(NLEEditorJniJNI.new_NLESegmentAIMatting(), true);
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

    public static NLESegmentAIMatting dynamicCast(NLENode nLENode) {
        long jNLESegmentAIMatting_dynamicCast = NLEEditorJniJNI.NLESegmentAIMatting_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentAIMatting_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentAIMatting(jNLESegmentAIMatting_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentAIMatting nLESegmentAIMatting) {
        if (nLESegmentAIMatting == null) {
            return 0L;
        }
        return nLESegmentAIMatting.swigCPtr;
    }

    public void addStroke(NLEMattingStroke nLEMattingStroke) {
        NLEEditorJniJNI.NLESegmentAIMatting_addStroke(this.swigCPtr, this, NLEMattingStroke.getCPtr(nLEMattingStroke), nLEMattingStroke);
    }

    public boolean removeStroke(NLEMattingStroke nLEMattingStroke) {
        return NLEEditorJniJNI.NLESegmentAIMatting_removeStroke(this.swigCPtr, this, NLEMattingStroke.getCPtr(nLEMattingStroke), nLEMattingStroke);
    }

    public void setAiMattingCilpEnd(long j) {
        NLEEditorJniJNI.NLESegmentAIMatting_setAiMattingCilpEnd(this.swigCPtr, this, j);
    }

    public void setAiMattingCilpStart(long j) {
        NLEEditorJniJNI.NLESegmentAIMatting_setAiMattingCilpStart(this.swigCPtr, this, j);
    }

    public void setArcherStrategy(int i) {
        NLEEditorJniJNI.NLESegmentAIMatting_setArcherStrategy(this.swigCPtr, this, i);
    }

    public void setBlend(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentAIMatting_setBlend(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setBlendColor(int i) {
        NLEEditorJniJNI.NLESegmentAIMatting_setBlendColor(this.swigCPtr, this, i);
    }

    public void setBlendCutout(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentAIMatting_setBlendCutout(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setBlendMask(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentAIMatting_setBlendMask(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setBlendMode(NLEMattingBlendMode nLEMattingBlendMode) {
        NLEEditorJniJNI.NLESegmentAIMatting_setBlendMode(this.swigCPtr, this, nLEMattingBlendMode.swigValue());
    }

    public void setCustomMattingParam(NLECustomMattingParam nLECustomMattingParam) {
        NLEEditorJniJNI.NLESegmentAIMatting_setCustomMattingParam(this.swigCPtr, this, NLECustomMattingParam.getCPtr(nLECustomMattingParam), nLECustomMattingParam);
    }

    public void setDisableDownSampleForBach(boolean z) {
        NLEEditorJniJNI.NLESegmentAIMatting_setDisableDownSampleForBach(this.swigCPtr, this, z);
    }

    public void setDisableSaveCacheInCompile(boolean z) {
        NLEEditorJniJNI.NLESegmentAIMatting_setDisableSaveCacheInCompile(this.swigCPtr, this, z);
    }

    public void setExportMonoCutoutRes(boolean z) {
        NLEEditorJniJNI.NLESegmentAIMatting_setExportMonoCutoutRes(this.swigCPtr, this, z);
    }

    public void setInteractiveTime(VecLongLong vecLongLong) {
        NLEEditorJniJNI.NLESegmentAIMatting_setInteractiveTime(this.swigCPtr, this, VecLongLong.getCPtr(vecLongLong), vecLongLong);
    }

    public void setMattingTag(String str) {
        NLEEditorJniJNI.NLESegmentAIMatting_setMattingTag(this.swigCPtr, this, str);
    }

    public void setMattingType(int i) {
        NLEEditorJniJNI.NLESegmentAIMatting_setMattingType(this.swigCPtr, this, i);
    }

    public void setNeedRunningMattingTask(boolean z) {
        NLEEditorJniJNI.NLESegmentAIMatting_setNeedRunningMattingTask(this.swigCPtr, this, z);
    }

    public void setPenParam(NLEInteractivePenParam nLEInteractivePenParam) {
        NLEEditorJniJNI.NLESegmentAIMatting_setPenParam(this.swigCPtr, this, NLEInteractivePenParam.getCPtr(nLEInteractivePenParam), nLEInteractivePenParam);
    }

    public void setResourceAiMatting(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentAIMatting_setResourceAiMatting(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setResourceAlgorithm(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentAIMatting_setResourceAlgorithm(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setWorkSpace(String str) {
        NLEEditorJniJNI.NLESegmentAIMatting_setWorkSpace(this.swigCPtr, this, str);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentAIMatting(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentAIMatting_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
