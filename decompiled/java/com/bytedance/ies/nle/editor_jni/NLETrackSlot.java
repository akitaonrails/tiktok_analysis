package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLETrackSlot extends NLETimeSpaceNode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLETrackSlot(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public void adjustKeyFrame() {
        NLEEditorJniJNI.NLETrackSlot_adjustKeyFrame__SWIG_2(this.swigCPtr, this);
    }

    public void adjustSwingKeyframeForAllType() {
        NLEEditorJniJNI.NLETrackSlot_adjustSwingKeyframeForAllType__SWIG_2(this.swigCPtr, this);
    }

    public boolean canKeyFrameAddedForTextSticker() {
        return NLEEditorJniJNI.NLETrackSlot_canKeyFrameAddedForTextSticker(this.swigCPtr, this);
    }

    public void clearChromaChannel() {
        NLEEditorJniJNI.NLETrackSlot_clearChromaChannel(this.swigCPtr, this);
    }

    public void clearFilter() {
        NLEEditorJniJNI.NLETrackSlot_clearFilter(this.swigCPtr, this);
    }

    public void clearKeyframe() {
        NLEEditorJniJNI.NLETrackSlot_clearKeyframe(this.swigCPtr, this);
    }

    public void clearKeyframeValue() {
        NLEEditorJniJNI.NLETrackSlot_clearKeyframeValue(this.swigCPtr, this);
    }

    public void clearMask() {
        NLEEditorJniJNI.NLETrackSlot_clearMask(this.swigCPtr, this);
    }

    public void clearNoiceReduction() {
        NLEEditorJniJNI.NLETrackSlot_clearNoiceReduction(this.swigCPtr, this);
    }

    public void clearSwingKeyframe() {
        NLEEditorJniJNI.NLETrackSlot_clearSwingKeyframe(this.swigCPtr, this);
    }

    public void clearVideoAnim() {
        NLEEditorJniJNI.NLETrackSlot_clearVideoAnim(this.swigCPtr, this);
    }

    public void clearVideoEffect() {
        NLEEditorJniJNI.NLETrackSlot_clearVideoEffect(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLETrackSlot_clone = NLEEditorJniJNI.NLETrackSlot_clone(this.swigCPtr, this);
        if (jNLETrackSlot_clone == 0) {
            return null;
        }
        return new NLENode(jNLETrackSlot_clone, true);
    }

    public boolean convertSlotKeyframe2SwingKeyframe() {
        return NLEEditorJniJNI.NLETrackSlot_convertSlotKeyframe2SwingKeyframe(this.swigCPtr, this);
    }

    public NLETrackSlot createKeyframe() {
        long jNLETrackSlot_createKeyframe = NLEEditorJniJNI.NLETrackSlot_createKeyframe(this.swigCPtr, this);
        if (jNLETrackSlot_createKeyframe == 0) {
            return null;
        }
        return new NLETrackSlot(jNLETrackSlot_createKeyframe, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public NLENode deepClone() {
        long jNLETrackSlot_deepClone__SWIG_1 = NLEEditorJniJNI.NLETrackSlot_deepClone__SWIG_1(this.swigCPtr, this);
        if (jNLETrackSlot_deepClone__SWIG_1 == 0) {
            return null;
        }
        return new NLENode(jNLETrackSlot_deepClone__SWIG_1, true);
    }

    public NLEAIMatting getAIMatting() {
        long jNLETrackSlot_getAIMatting = NLEEditorJniJNI.NLETrackSlot_getAIMatting(this.swigCPtr, this);
        if (jNLETrackSlot_getAIMatting == 0) {
            return null;
        }
        return new NLEAIMatting(jNLETrackSlot_getAIMatting, true);
    }

    public NLEAlphaSplitType getAlphaSplitType() {
        return NLEAlphaSplitType.swigToEnum(NLEEditorJniJNI.NLETrackSlot_getAlphaSplitType(this.swigCPtr, this));
    }

    public NLEFilter getAudioFilter() {
        long jNLETrackSlot_getAudioFilter = NLEEditorJniJNI.NLETrackSlot_getAudioFilter(this.swigCPtr, this);
        if (jNLETrackSlot_getAudioFilter == 0) {
            return null;
        }
        return new NLEFilter(jNLETrackSlot_getAudioFilter, true);
    }

    public NLEAutoFillFrame getAutoFillFrame() {
        long jNLETrackSlot_getAutoFillFrame = NLEEditorJniJNI.NLETrackSlot_getAutoFillFrame(this.swigCPtr, this);
        if (jNLETrackSlot_getAutoFillFrame == 0) {
            return null;
        }
        return new NLEAutoFillFrame(jNLETrackSlot_getAutoFillFrame, true);
    }

    public VecNLEChromaChannelSPtr getChromaChannels() {
        return new VecNLEChromaChannelSPtr(NLEEditorJniJNI.NLETrackSlot_getChromaChannels(this.swigCPtr, this), true);
    }

    public NLESegmentTransition getEndTransition() {
        long jNLETrackSlot_getEndTransition = NLEEditorJniJNI.NLETrackSlot_getEndTransition(this.swigCPtr, this);
        if (jNLETrackSlot_getEndTransition == 0) {
            return null;
        }
        return new NLESegmentTransition(jNLETrackSlot_getEndTransition, true);
    }

    public VecNLEFilterSPtr getFilters() {
        return new VecNLEFilterSPtr(NLEEditorJniJNI.NLETrackSlot_getFilters(this.swigCPtr, this), true);
    }

    public boolean getIgnoreUserSetEndTime() {
        return NLEEditorJniJNI.NLETrackSlot_getIgnoreUserSetEndTime(this.swigCPtr, this);
    }

    public NLEKeyframeGraphType getKeyframeGraphType() {
        return NLEKeyframeGraphType.swigToEnum(NLEEditorJniJNI.NLETrackSlot_getKeyframeGraphType(this.swigCPtr, this));
    }

    public VecNLEKeyframeGraphValue getKeyframeValues() {
        return new VecNLEKeyframeGraphValue(NLEEditorJniJNI.NLETrackSlot_getKeyframeValues(this.swigCPtr, this), true);
    }

    public VecNLETrackSlotSPtr getKeyframes() {
        return new VecNLETrackSlotSPtr(NLEEditorJniJNI.NLETrackSlot_getKeyframes(this.swigCPtr, this), true);
    }

    public VecString getKeyframesUUIDList() {
        return new VecString(NLEEditorJniJNI.NLETrackSlot_getKeyframesUUIDList(this.swigCPtr, this), true);
    }

    public NLESegment getMainSegment() {
        long jNLETrackSlot_getMainSegment = NLEEditorJniJNI.NLETrackSlot_getMainSegment(this.swigCPtr, this);
        if (jNLETrackSlot_getMainSegment == 0) {
            return null;
        }
        return new NLESegment(jNLETrackSlot_getMainSegment, true);
    }

    public VecNLEMaskSPtr getMasks() {
        return new VecNLEMaskSPtr(NLEEditorJniJNI.NLETrackSlot_getMasks(this.swigCPtr, this), true);
    }

    public VecNLENoiseReductionSPtr getNoiceReductions() {
        return new VecNLENoiseReductionSPtr(NLEEditorJniJNI.NLETrackSlot_getNoiceReductions(this.swigCPtr, this), true);
    }

    public NLEResourceNode getPinAlgorithmFile() {
        long jNLETrackSlot_getPinAlgorithmFile = NLEEditorJniJNI.NLETrackSlot_getPinAlgorithmFile(this.swigCPtr, this);
        if (jNLETrackSlot_getPinAlgorithmFile == 0) {
            return null;
        }
        return new NLEResourceNode(jNLETrackSlot_getPinAlgorithmFile, true);
    }

    public NLEResourceNode getPinMappingAlgorithmFile() {
        long jNLETrackSlot_getPinMappingAlgorithmFile = NLEEditorJniJNI.NLETrackSlot_getPinMappingAlgorithmFile(this.swigCPtr, this);
        if (jNLETrackSlot_getPinMappingAlgorithmFile == 0) {
            return null;
        }
        return new NLEResourceNode(jNLETrackSlot_getPinMappingAlgorithmFile, true);
    }

    public NLETrackSlot getRenderProxy() {
        long jNLETrackSlot_getRenderProxy = NLEEditorJniJNI.NLETrackSlot_getRenderProxy(this.swigCPtr, this);
        if (jNLETrackSlot_getRenderProxy == 0) {
            return null;
        }
        return new NLETrackSlot(jNLETrackSlot_getRenderProxy, true);
    }

    public long getSlotRealStartTime() {
        return NLEEditorJniJNI.NLETrackSlot_getSlotRealStartTime(this.swigCPtr, this);
    }

    public VecNLETrackSlotSPtr getSortKeyframe() {
        return new VecNLETrackSlotSPtr(NLEEditorJniJNI.NLETrackSlot_getSortKeyframe(this.swigCPtr, this), true);
    }

    public NLESegmentMask getStencilMask() {
        long jNLETrackSlot_getStencilMask = NLEEditorJniJNI.NLETrackSlot_getStencilMask(this.swigCPtr, this);
        if (jNLETrackSlot_getStencilMask == 0) {
            return null;
        }
        return new NLESegmentMask(jNLETrackSlot_getStencilMask, true);
    }

    public VecNLEKeyframe getSwingKeyframes() {
        return new VecNLEKeyframe(NLEEditorJniJNI.NLETrackSlot_getSwingKeyframes(this.swigCPtr, this), true);
    }

    public VecNLEVideoAnimationSPtr getVideoAnims() {
        return new VecNLEVideoAnimationSPtr(NLEEditorJniJNI.NLETrackSlot_getVideoAnims(this.swigCPtr, this), true);
    }

    public VecNLEVideoEffectSPtr getVideoEffects() {
        return new VecNLEVideoEffectSPtr(NLEEditorJniJNI.NLETrackSlot_getVideoEffects(this.swigCPtr, this), true);
    }

    public boolean hasIgnoreUserSetEndTime() {
        return NLEEditorJniJNI.NLETrackSlot_hasIgnoreUserSetEndTime(this.swigCPtr, this);
    }

    public boolean hasKeyframeGraphType() {
        return NLEEditorJniJNI.NLETrackSlot_hasKeyframeGraphType(this.swigCPtr, this);
    }

    public boolean hasKeyframesUUIDList() {
        return NLEEditorJniJNI.NLETrackSlot_hasKeyframesUUIDList(this.swigCPtr, this);
    }

    public boolean removeAllSlotKeyframes() {
        return NLEEditorJniJNI.NLETrackSlot_removeAllSlotKeyframes(this.swigCPtr, this);
    }

    public boolean removeAllSwingKeyframes() {
        return NLEEditorJniJNI.NLETrackSlot_removeAllSwingKeyframes(this.swigCPtr, this);
    }

    public NLETrackSlot() {
        this(NLEEditorJniJNI.new_NLETrackSlot(), true);
    }

    public static String getKEYFRAME_TIMERANGE_KEY() {
        return NLEEditorJniJNI.NLETrackSlot_KEYFRAME_TIMERANGE_KEY_get();
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

    public static NLETrackSlot dynamicCast(NLENode nLENode) {
        long jNLETrackSlot_dynamicCast = NLEEditorJniJNI.NLETrackSlot_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLETrackSlot_dynamicCast == 0) {
            return null;
        }
        return new NLETrackSlot(jNLETrackSlot_dynamicCast, true);
    }

    public static long getCPtr(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot == null) {
            return 0L;
        }
        return nLETrackSlot.swigCPtr;
    }

    public void addChromaChannel(NLEChromaChannel nLEChromaChannel) {
        NLEEditorJniJNI.NLETrackSlot_addChromaChannel(this.swigCPtr, this, NLEChromaChannel.getCPtr(nLEChromaChannel), nLEChromaChannel);
    }

    public void addFilter(NLEFilter nLEFilter) {
        NLEEditorJniJNI.NLETrackSlot_addFilter(this.swigCPtr, this, NLEFilter.getCPtr(nLEFilter), nLEFilter);
    }

    public void addKeyframe(NLETrackSlot nLETrackSlot) {
        NLEEditorJniJNI.NLETrackSlot_addKeyframe(this.swigCPtr, this, getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public void addKeyframeValue(NLEKeyframeGraphValue nLEKeyframeGraphValue) {
        NLEEditorJniJNI.NLETrackSlot_addKeyframeValue(this.swigCPtr, this, NLEKeyframeGraphValue.getCPtr(nLEKeyframeGraphValue), nLEKeyframeGraphValue);
    }

    public void addMask(NLEMask nLEMask) {
        NLEEditorJniJNI.NLETrackSlot_addMask(this.swigCPtr, this, NLEMask.getCPtr(nLEMask), nLEMask);
    }

    public void addNoiceReduction(NLENoiseReduction nLENoiseReduction) {
        NLEEditorJniJNI.NLETrackSlot_addNoiceReduction(this.swigCPtr, this, NLENoiseReduction.getCPtr(nLENoiseReduction), nLENoiseReduction);
    }

    public void addSwingKeyframe(NLEKeyframe nLEKeyframe) {
        NLEEditorJniJNI.NLETrackSlot_addSwingKeyframe(this.swigCPtr, this, NLEKeyframe.getCPtr(nLEKeyframe), nLEKeyframe);
    }

    public void addVideoAnim(NLEVideoAnimation nLEVideoAnimation) {
        NLEEditorJniJNI.NLETrackSlot_addVideoAnim(this.swigCPtr, this, NLEVideoAnimation.getCPtr(nLEVideoAnimation), nLEVideoAnimation);
    }

    public void addVideoEffect(NLEVideoEffect nLEVideoEffect) {
        NLEEditorJniJNI.NLETrackSlot_addVideoEffect(this.swigCPtr, this, NLEVideoEffect.getCPtr(nLEVideoEffect), nLEVideoEffect);
    }

    public void adjustKeyFrame(long j) {
        NLEEditorJniJNI.NLETrackSlot_adjustKeyFrame__SWIG_1(this.swigCPtr, this, j);
    }

    public void adjustSwingKeyframeForAllType(long j) {
        NLEEditorJniJNI.NLETrackSlot_adjustSwingKeyframeForAllType__SWIG_1(this.swigCPtr, this, j);
    }

    public void adjustSwingKeyframeForType(NLEKeyframeType nLEKeyframeType) {
        NLEEditorJniJNI.NLETrackSlot_adjustSwingKeyframeForType__SWIG_2(this.swigCPtr, this, nLEKeyframeType.swigValue());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public NLENode deepClone(boolean z) {
        long jNLETrackSlot_deepClone__SWIG_0 = NLEEditorJniJNI.NLETrackSlot_deepClone__SWIG_0(this.swigCPtr, this, z);
        if (jNLETrackSlot_deepClone__SWIG_0 == 0) {
            return null;
        }
        return new NLENode(jNLETrackSlot_deepClone__SWIG_0, true);
    }

    public NLEFilter getFilterByName(String str) {
        long jNLETrackSlot_getFilterByName = NLEEditorJniJNI.NLETrackSlot_getFilterByName(this.swigCPtr, this, str);
        if (jNLETrackSlot_getFilterByName == 0) {
            return null;
        }
        return new NLEFilter(jNLETrackSlot_getFilterByName, true);
    }

    public String getStaticMaskParamsForTime(long j) {
        return NLEEditorJniJNI.NLETrackSlot_getStaticMaskParamsForTime(this.swigCPtr, this, j);
    }

    public void refreshAllSwingKeyframePropertyToSlotAtTime(long j) {
        NLEEditorJniJNI.NLETrackSlot_refreshAllSwingKeyframePropertyToSlotAtTime(this.swigCPtr, this, j);
    }

    public boolean removeChromaChannel(NLEChromaChannel nLEChromaChannel) {
        return NLEEditorJniJNI.NLETrackSlot_removeChromaChannel(this.swigCPtr, this, NLEChromaChannel.getCPtr(nLEChromaChannel), nLEChromaChannel);
    }

    public boolean removeFilter(NLEFilter nLEFilter) {
        return NLEEditorJniJNI.NLETrackSlot_removeFilter(this.swigCPtr, this, NLEFilter.getCPtr(nLEFilter), nLEFilter);
    }

    public NLEFilter removeFilterByName(String str) {
        long jNLETrackSlot_removeFilterByName = NLEEditorJniJNI.NLETrackSlot_removeFilterByName(this.swigCPtr, this, str);
        if (jNLETrackSlot_removeFilterByName == 0) {
            return null;
        }
        return new NLEFilter(jNLETrackSlot_removeFilterByName, true);
    }

    public boolean removeKeyframe(NLETrackSlot nLETrackSlot) {
        return NLEEditorJniJNI.NLETrackSlot_removeKeyframe__SWIG_0(this.swigCPtr, this, getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public boolean removeKeyframeValue(NLEKeyframeGraphValue nLEKeyframeGraphValue) {
        return NLEEditorJniJNI.NLETrackSlot_removeKeyframeValue(this.swigCPtr, this, NLEKeyframeGraphValue.getCPtr(nLEKeyframeGraphValue), nLEKeyframeGraphValue);
    }

    public boolean removeMask(NLEMask nLEMask) {
        return NLEEditorJniJNI.NLETrackSlot_removeMask(this.swigCPtr, this, NLEMask.getCPtr(nLEMask), nLEMask);
    }

    public boolean removeNoiceReduction(NLENoiseReduction nLENoiseReduction) {
        return NLEEditorJniJNI.NLETrackSlot_removeNoiceReduction(this.swigCPtr, this, NLENoiseReduction.getCPtr(nLENoiseReduction), nLENoiseReduction);
    }

    public boolean removeSwingKeyframe(NLEKeyframe nLEKeyframe) {
        return NLEEditorJniJNI.NLETrackSlot_removeSwingKeyframe(this.swigCPtr, this, NLEKeyframe.getCPtr(nLEKeyframe), nLEKeyframe);
    }

    public boolean removeSwingKeyframeOfType(NLEKeyframeType nLEKeyframeType) {
        return NLEEditorJniJNI.NLETrackSlot_removeSwingKeyframeOfType__SWIG_1(this.swigCPtr, this, nLEKeyframeType.swigValue());
    }

    public boolean removeVideoAnim(NLEVideoAnimation nLEVideoAnimation) {
        return NLEEditorJniJNI.NLETrackSlot_removeVideoAnim(this.swigCPtr, this, NLEVideoAnimation.getCPtr(nLEVideoAnimation), nLEVideoAnimation);
    }

    public boolean removeVideoEffect(NLEVideoEffect nLEVideoEffect) {
        return NLEEditorJniJNI.NLETrackSlot_removeVideoEffect(this.swigCPtr, this, NLEVideoEffect.getCPtr(nLEVideoEffect), nLEVideoEffect);
    }

    public void setAIMatting(NLEAIMatting nLEAIMatting) {
        NLEEditorJniJNI.NLETrackSlot_setAIMatting(this.swigCPtr, this, NLEAIMatting.getCPtr(nLEAIMatting), nLEAIMatting);
    }

    public void setAudioFilter(NLEFilter nLEFilter) {
        NLEEditorJniJNI.NLETrackSlot_setAudioFilter(this.swigCPtr, this, NLEFilter.getCPtr(nLEFilter), nLEFilter);
    }

    public void setAutoFillFrame(NLEAutoFillFrame nLEAutoFillFrame) {
        NLEEditorJniJNI.NLETrackSlot_setAutoFillFrame(this.swigCPtr, this, NLEAutoFillFrame.getCPtr(nLEAutoFillFrame), nLEAutoFillFrame);
    }

    public void setEndTransition(NLESegmentTransition nLESegmentTransition) {
        NLEEditorJniJNI.NLETrackSlot_setEndTransition(this.swigCPtr, this, NLESegmentTransition.getCPtr(nLESegmentTransition), nLESegmentTransition);
    }

    public void setIgnoreUserSetEndTime(boolean z) {
        NLEEditorJniJNI.NLETrackSlot_setIgnoreUserSetEndTime(this.swigCPtr, this, z);
    }

    public void setKeyframeGraphType(NLEKeyframeGraphType nLEKeyframeGraphType) {
        NLEEditorJniJNI.NLETrackSlot_setKeyframeGraphType(this.swigCPtr, this, nLEKeyframeGraphType.swigValue());
    }

    public void setKeyframesUUIDList(VecString vecString) {
        NLEEditorJniJNI.NLETrackSlot_setKeyframesUUIDList(this.swigCPtr, this, VecString.getCPtr(vecString), vecString);
    }

    public void setMainSegment(NLESegment nLESegment) {
        NLEEditorJniJNI.NLETrackSlot_setMainSegment(this.swigCPtr, this, NLESegment.getCPtr(nLESegment), nLESegment);
    }

    public void setPinAlgorithmFile(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLETrackSlot_setPinAlgorithmFile(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setPinMappingAlgorithmFile(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLETrackSlot_setPinMappingAlgorithmFile(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setRenderProxy(NLETrackSlot nLETrackSlot) {
        NLEEditorJniJNI.NLETrackSlot_setRenderProxy(this.swigCPtr, this, getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public void setStencilMask(NLESegmentMask nLESegmentMask) {
        NLEEditorJniJNI.NLETrackSlot_setStencilMask(this.swigCPtr, this, NLESegmentMask.getCPtr(nLESegmentMask), nLESegmentMask);
    }

    public void setWorkingObject(NLETrackSlot nLETrackSlot) {
        NLEEditorJniJNI.NLETrackSlot_setWorkingObject(this.swigCPtr, this, getCPtr(nLETrackSlot), nLETrackSlot);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public MapStrSwingKeyFramesPtr swingKeyframesOfType(NLEKeyframeType nLEKeyframeType) {
        return new MapStrSwingKeyFramesPtr(NLEEditorJniJNI.NLETrackSlot_swingKeyframesOfType(this.swigCPtr, this, nLEKeyframeType.swigValue()), true);
    }

    public NLETrackSlot syncEffectResource(NLETrackSlot nLETrackSlot) {
        long jNLETrackSlot_syncEffectResource = NLEEditorJniJNI.NLETrackSlot_syncEffectResource(this.swigCPtr, this, getCPtr(nLETrackSlot), nLETrackSlot);
        if (jNLETrackSlot_syncEffectResource == 0) {
            return null;
        }
        return new NLETrackSlot(jNLETrackSlot_syncEffectResource, true);
    }

    public NLETrackSlot updateKeyframe(NLETrackSlot nLETrackSlot) {
        long jNLETrackSlot_updateKeyframe = NLEEditorJniJNI.NLETrackSlot_updateKeyframe(this.swigCPtr, this, getCPtr(nLETrackSlot), nLETrackSlot);
        if (jNLETrackSlot_updateKeyframe == 0) {
            return null;
        }
        return new NLETrackSlot(jNLETrackSlot_updateKeyframe, true);
    }

    public NLETrackSlot(long j, boolean z) {
        super(NLEEditorJniJNI.NLETrackSlot_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public void addOrUpdateSwingKeyframeForAllTypes(long j, long j2) {
        NLEEditorJniJNI.NLETrackSlot_addOrUpdateSwingKeyframeForAllTypes__SWIG_1(this.swigCPtr, this, j, j2);
    }

    public void adjustKeyFrame(long j, NLETrackSlot nLETrackSlot) {
        NLEEditorJniJNI.NLETrackSlot_adjustKeyFrame__SWIG_0(this.swigCPtr, this, j, getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public void adjustSwingKeyframeForAllType(long j, NLETrackSlot nLETrackSlot) {
        NLEEditorJniJNI.NLETrackSlot_adjustSwingKeyframeForAllType__SWIG_0(this.swigCPtr, this, j, getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public void adjustSwingKeyframeForType(NLEKeyframeType nLEKeyframeType, long j) {
        NLEEditorJniJNI.NLETrackSlot_adjustSwingKeyframeForType__SWIG_1(this.swigCPtr, this, nLEKeyframeType.swigValue(), j);
    }

    public long getNearestTimeOfAllSwingKeyframes(long j, long j2) {
        return NLEEditorJniJNI.NLETrackSlot_getNearestTimeOfAllSwingKeyframes(this.swigCPtr, this, j, j2);
    }

    public NLETrackSlot keyframeAtTime(long j, long j2) {
        long jNLETrackSlot_keyframeAtTime = NLEEditorJniJNI.NLETrackSlot_keyframeAtTime(this.swigCPtr, this, j, j2);
        if (jNLETrackSlot_keyframeAtTime == 0) {
            return null;
        }
        return new NLETrackSlot(jNLETrackSlot_keyframeAtTime, true);
    }

    public void refreshSwingKeyframePropertyToSlotAtTime(NLEKeyframeType nLEKeyframeType, long j) {
        NLEEditorJniJNI.NLETrackSlot_refreshSwingKeyframePropertyToSlotAtTime(this.swigCPtr, this, nLEKeyframeType.swigValue(), j);
    }

    public boolean removeAllSwingKeyframesAtTime(long j, long j2) {
        return NLEEditorJniJNI.NLETrackSlot_removeAllSwingKeyframesAtTime(this.swigCPtr, this, j, j2);
    }

    public boolean removeKeyframe(long j, long j2) {
        return NLEEditorJniJNI.NLETrackSlot_removeKeyframe__SWIG_1(this.swigCPtr, this, j, j2);
    }

    public VecNLEKeyframe swingKeyframesAtTime(long j, long j2) {
        return new VecNLEKeyframe(NLEEditorJniJNI.NLETrackSlot_swingKeyframesAtTime(this.swigCPtr, this, j, j2), true);
    }

    public NLEKeyframe swingKeyframesOfTypeAndName(NLEKeyframeType nLEKeyframeType, String str) {
        long jNLETrackSlot_swingKeyframesOfTypeAndName = NLEEditorJniJNI.NLETrackSlot_swingKeyframesOfTypeAndName(this.swigCPtr, this, nLEKeyframeType.swigValue(), str);
        if (jNLETrackSlot_swingKeyframesOfTypeAndName == 0) {
            return null;
        }
        return new NLEKeyframe(jNLETrackSlot_swingKeyframesOfTypeAndName, true);
    }

    public String addOrUpdateKeyframe(long j, long j2, boolean z) {
        return NLEEditorJniJNI.NLETrackSlot_addOrUpdateKeyframe(this.swigCPtr, this, j, j2, z);
    }

    public void addOrUpdateSwingKeyframeForAllTypes(long j, long j2, boolean z) {
        NLEEditorJniJNI.NLETrackSlot_addOrUpdateSwingKeyframeForAllTypes__SWIG_0(this.swigCPtr, this, j, j2, z);
    }

    public void addOrUpdateSwingKeyframeOfType(NLEKeyframeType nLEKeyframeType, long j, long j2) {
        NLEEditorJniJNI.NLETrackSlot_addOrUpdateSwingKeyframeOfType__SWIG_1(this.swigCPtr, this, nLEKeyframeType.swigValue(), j, j2);
    }

    public void addOrUpdateSwingKeyframeOfTypes(SWIGTYPE_p_std__vectorT_cut__model__NLEKeyframeType_t sWIGTYPE_p_std__vectorT_cut__model__NLEKeyframeType_t, long j, long j2) {
        NLEEditorJniJNI.NLETrackSlot_addOrUpdateSwingKeyframeOfTypes__SWIG_1(this.swigCPtr, this, SWIGTYPE_p_std__vectorT_cut__model__NLEKeyframeType_t.getCPtr(sWIGTYPE_p_std__vectorT_cut__model__NLEKeyframeType_t), j, j2);
    }

    public void adjustSwingKeyframeForType(NLEKeyframeType nLEKeyframeType, long j, NLETrackSlot nLETrackSlot) {
        NLEEditorJniJNI.NLETrackSlot_adjustSwingKeyframeForType__SWIG_0(this.swigCPtr, this, nLEKeyframeType.swigValue(), j, getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public VecNLEKeyframe createSwingKeyframesForAllTypesAtTime(long j, long j2, long j3) {
        return new VecNLEKeyframe(NLEEditorJniJNI.NLETrackSlot_createSwingKeyframesForAllTypesAtTime__SWIG_1(this.swigCPtr, this, j, j2, j3), true);
    }

    public boolean removeSwingKeyframeOfType(NLEKeyframeType nLEKeyframeType, long j, long j2) {
        return NLEEditorJniJNI.NLETrackSlot_removeSwingKeyframeOfType__SWIG_0(this.swigCPtr, this, nLEKeyframeType.swigValue(), j, j2);
    }

    public MapStrSwingKeyFramesPtr swingKeyframesOfTypeAtTime(NLEKeyframeType nLEKeyframeType, long j, long j2) {
        return new MapStrSwingKeyFramesPtr(NLEEditorJniJNI.NLETrackSlot_swingKeyframesOfTypeAtTime(this.swigCPtr, this, nLEKeyframeType.swigValue(), j, j2), true);
    }

    public void addOrUpdateSwingKeyframeOfType(NLEKeyframeType nLEKeyframeType, long j, long j2, boolean z) {
        NLEEditorJniJNI.NLETrackSlot_addOrUpdateSwingKeyframeOfType__SWIG_0(this.swigCPtr, this, nLEKeyframeType.swigValue(), j, j2, z);
    }

    public void addOrUpdateSwingKeyframeOfTypes(SWIGTYPE_p_std__vectorT_cut__model__NLEKeyframeType_t sWIGTYPE_p_std__vectorT_cut__model__NLEKeyframeType_t, long j, long j2, boolean z) {
        NLEEditorJniJNI.NLETrackSlot_addOrUpdateSwingKeyframeOfTypes__SWIG_0(this.swigCPtr, this, SWIGTYPE_p_std__vectorT_cut__model__NLEKeyframeType_t.getCPtr(sWIGTYPE_p_std__vectorT_cut__model__NLEKeyframeType_t), j, j2, z);
    }

    public VecNLEKeyframe createSwingKeyframesForAllTypesAtTime(long j, long j2, long j3, boolean z) {
        return new VecNLEKeyframe(NLEEditorJniJNI.NLETrackSlot_createSwingKeyframesForAllTypesAtTime__SWIG_0(this.swigCPtr, this, j, j2, j3, z), true);
    }

    public VecNLEKeyframe createSwingKeyframesForTypeAtTime(NLEKeyframeType nLEKeyframeType, long j, long j2, long j3) {
        return new VecNLEKeyframe(NLEEditorJniJNI.NLETrackSlot_createSwingKeyframesForTypeAtTime__SWIG_1(this.swigCPtr, this, nLEKeyframeType.swigValue(), j, j2, j3), true);
    }

    public NLEKeyframe swingKeyframeOfTypeAtTime(NLEKeyframeType nLEKeyframeType, String str, long j, long j2) {
        long jNLETrackSlot_swingKeyframeOfTypeAtTime = NLEEditorJniJNI.NLETrackSlot_swingKeyframeOfTypeAtTime(this.swigCPtr, this, nLEKeyframeType.swigValue(), str, j, j2);
        if (jNLETrackSlot_swingKeyframeOfTypeAtTime == 0) {
            return null;
        }
        return new NLEKeyframe(jNLETrackSlot_swingKeyframeOfTypeAtTime, true);
    }

    public VecNLEKeyframe createSwingKeyframesForTypeAtTime(NLEKeyframeType nLEKeyframeType, long j, long j2, long j3, boolean z) {
        return new VecNLEKeyframe(NLEEditorJniJNI.NLETrackSlot_createSwingKeyframesForTypeAtTime__SWIG_0(this.swigCPtr, this, nLEKeyframeType.swigValue(), j, j2, j3, z), true);
    }
}
