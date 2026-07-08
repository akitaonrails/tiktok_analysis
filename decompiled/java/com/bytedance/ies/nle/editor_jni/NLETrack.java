package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLETrack extends NLETimeSpaceNode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLETrack(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public void clearFilter() {
        NLEEditorJniJNI.NLETrack_clearFilter(this.swigCPtr, this);
    }

    public void clearKeyframeSlot() {
        NLEEditorJniJNI.NLETrack_clearKeyframeSlot(this.swigCPtr, this);
    }

    public void clearSlot() {
        NLEEditorJniJNI.NLETrack_clearSlot(this.swigCPtr, this);
    }

    public void clearVideoEffect() {
        NLEEditorJniJNI.NLETrack_clearVideoEffect(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLETrack_clone = NLEEditorJniJNI.NLETrack_clone(this.swigCPtr, this);
        if (jNLETrack_clone == 0) {
            return null;
        }
        return new NLENode(jNLETrack_clone, true);
    }

    public boolean getAffectedByTimeEffect() {
        return NLEEditorJniJNI.NLETrack_getAffectedByTimeEffect(this.swigCPtr, this);
    }

    public NLETrackType getExtraTrackType() {
        return NLETrackType.swigToEnum(NLEEditorJniJNI.NLETrack_getExtraTrackType(this.swigCPtr, this));
    }

    public VecNLEFilterSPtr getFilters() {
        return new VecNLEFilterSPtr(NLEEditorJniJNI.NLETrack_getFilters(this.swigCPtr, this), true);
    }

    public VecNLETrackSlotSPtr getKeyframeSlots() {
        return new VecNLETrackSlotSPtr(NLEEditorJniJNI.NLETrack_getKeyframeSlots(this.swigCPtr, this), true);
    }

    public boolean getMainTrack() {
        return NLEEditorJniJNI.NLETrack_getMainTrack(this.swigCPtr, this);
    }

    public long getMaxEnd() {
        return NLEEditorJniJNI.NLETrack_getMaxEnd(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode
    public long getMeasuredEndTime() {
        return NLEEditorJniJNI.NLETrack_getMeasuredEndTime(this.swigCPtr, this);
    }

    public long getMinStart() {
        return NLEEditorJniJNI.NLETrack_getMinStart(this.swigCPtr, this);
    }

    public NLEResType getResourceType() {
        return NLEResType.swigToEnum(NLEEditorJniJNI.NLETrack_getResourceType(this.swigCPtr, this));
    }

    public VecNLETrackSlotSPtr getSlots() {
        return new VecNLETrackSlotSPtr(NLEEditorJniJNI.NLETrack_getSlots(this.swigCPtr, this), true);
    }

    public VecNLETrackSlotSPtr getSortedSlots() {
        return new VecNLETrackSlotSPtr(NLEEditorJniJNI.NLETrack_getSortedSlots(this.swigCPtr, this), true);
    }

    public NLETimeEffect getTimeEffect() {
        long jNLETrack_getTimeEffect = NLEEditorJniJNI.NLETrack_getTimeEffect(this.swigCPtr, this);
        if (jNLETrack_getTimeEffect == 0) {
            return null;
        }
        return new NLETimeEffect(jNLETrack_getTimeEffect, true);
    }

    public int getTrackIndex() {
        return NLEEditorJniJNI.NLETrack_getTrackIndex(this.swigCPtr, this);
    }

    public NLETrackType getTrackType() {
        return NLETrackType.swigToEnum(NLEEditorJniJNI.NLETrack_getTrackType(this.swigCPtr, this));
    }

    public VecNLETrackSlotSPtr getVideoEffects() {
        return new VecNLETrackSlotSPtr(NLEEditorJniJNI.NLETrack_getVideoEffects(this.swigCPtr, this), true);
    }

    public float getVolume() {
        return NLEEditorJniJNI.NLETrack_getVolume(this.swigCPtr, this);
    }

    public boolean hasMainTrack() {
        return NLEEditorJniJNI.NLETrack_hasMainTrack(this.swigCPtr, this);
    }

    public boolean hasVolume() {
        return NLEEditorJniJNI.NLETrack_hasVolume(this.swigCPtr, this);
    }

    public boolean isAudioEnable() {
        return NLEEditorJniJNI.NLETrack_isAudioEnable(this.swigCPtr, this);
    }

    public void timeSort() {
        NLEEditorJniJNI.NLETrack_timeSort(this.swigCPtr, this);
    }

    public NLETrack() {
        this(NLEEditorJniJNI.new_NLETrack(), true);
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

    public static NLETrack dynamicCast(NLENode nLENode) {
        long jNLETrack_dynamicCast = NLEEditorJniJNI.NLETrack_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLETrack_dynamicCast == 0) {
            return null;
        }
        return new NLETrack(jNLETrack_dynamicCast, true);
    }

    public static long getCPtr(NLETrack nLETrack) {
        if (nLETrack == null) {
            return 0L;
        }
        return nLETrack.swigCPtr;
    }

    public void addFilter(NLEFilter nLEFilter) {
        NLEEditorJniJNI.NLETrack_addFilter(this.swigCPtr, this, NLEFilter.getCPtr(nLEFilter), nLEFilter);
    }

    public void addKeyframeSlot(NLETrackSlot nLETrackSlot) {
        NLEEditorJniJNI.NLETrack_addKeyframeSlot(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public void addSlot(NLETrackSlot nLETrackSlot) {
        NLEEditorJniJNI.NLETrack_addSlot(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public void addSlotAtEnd(NLETrackSlot nLETrackSlot) {
        NLEEditorJniJNI.NLETrack_addSlotAtEnd(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public void addSlotAtStart(NLETrackSlot nLETrackSlot) {
        NLEEditorJniJNI.NLETrack_addSlotAtStart(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public void addVideoEffect(NLETrackSlot nLETrackSlot) {
        NLEEditorJniJNI.NLETrack_addVideoEffect(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public NLEFilter getFilterByName(String str) {
        long jNLETrack_getFilterByName = NLEEditorJniJNI.NLETrack_getFilterByName(this.swigCPtr, this, str);
        if (jNLETrack_getFilterByName == 0) {
            return null;
        }
        return new NLEFilter(jNLETrack_getFilterByName, true);
    }

    public long getMaxEndExcludeDisabledNode(boolean z) {
        return NLEEditorJniJNI.NLETrack_getMaxEndExcludeDisabledNode(this.swigCPtr, this, z);
    }

    public float getOriginalCanvasRatio(float f) {
        return NLEEditorJniJNI.NLETrack_getOriginalCanvasRatio(this.swigCPtr, this, f);
    }

    public NLETrackSlot getSlotByIndex(int i) {
        long jNLETrack_getSlotByIndex = NLEEditorJniJNI.NLETrack_getSlotByIndex(this.swigCPtr, this, i);
        if (jNLETrack_getSlotByIndex == 0) {
            return null;
        }
        return new NLETrackSlot(jNLETrack_getSlotByIndex, true);
    }

    public NLETrackSlot getSlotByTime(long j) {
        long jNLETrack_getSlotByTime = NLEEditorJniJNI.NLETrack_getSlotByTime(this.swigCPtr, this, j);
        if (jNLETrack_getSlotByTime == 0) {
            return null;
        }
        return new NLETrackSlot(jNLETrack_getSlotByTime, true);
    }

    public int getSlotIndex(NLETrackSlot nLETrackSlot) {
        return NLEEditorJniJNI.NLETrack_getSlotIndex(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public boolean isTimelineChange(NLETrack nLETrack) {
        return NLEEditorJniJNI.NLETrack_isTimelineChange(this.swigCPtr, this, getCPtr(nLETrack), nLETrack);
    }

    public boolean removeFilter(NLEFilter nLEFilter) {
        return NLEEditorJniJNI.NLETrack_removeFilter(this.swigCPtr, this, NLEFilter.getCPtr(nLEFilter), nLEFilter);
    }

    public NLEFilter removeFilterByName(String str) {
        long jNLETrack_removeFilterByName = NLEEditorJniJNI.NLETrack_removeFilterByName(this.swigCPtr, this, str);
        if (jNLETrack_removeFilterByName == 0) {
            return null;
        }
        return new NLEFilter(jNLETrack_removeFilterByName, true);
    }

    public boolean removeKeyframeSlot(NLETrackSlot nLETrackSlot) {
        return NLEEditorJniJNI.NLETrack_removeKeyframeSlot(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public boolean removeSlot(NLETrackSlot nLETrackSlot) {
        return NLEEditorJniJNI.NLETrack_removeSlot(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public boolean removeVideoEffect(NLETrackSlot nLETrackSlot) {
        return NLEEditorJniJNI.NLETrack_removeVideoEffect(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public void setAudioEnable(boolean z) {
        NLEEditorJniJNI.NLETrack_setAudioEnable(this.swigCPtr, this, z);
    }

    public void setExtraTrackType(NLETrackType nLETrackType) {
        NLEEditorJniJNI.NLETrack_setExtraTrackType(this.swigCPtr, this, nLETrackType.swigValue());
    }

    public void setMainTrack(boolean z) {
        NLEEditorJniJNI.NLETrack_setMainTrack(this.swigCPtr, this, z);
    }

    public void setTimeEffect(NLETimeEffect nLETimeEffect) {
        NLEEditorJniJNI.NLETrack_setTimeEffect(this.swigCPtr, this, NLETimeEffect.getCPtr(nLETimeEffect), nLETimeEffect);
    }

    public void setTrackIndex(int i) {
        NLEEditorJniJNI.NLETrack_setTrackIndex(this.swigCPtr, this, i);
    }

    public void setVolume(float f) {
        NLEEditorJniJNI.NLETrack_setVolume(this.swigCPtr, this, f);
    }

    public NLETrackSlot split(long j) {
        long jNLETrack_split = NLEEditorJniJNI.NLETrack_split(this.swigCPtr, this, j);
        if (jNLETrack_split == 0) {
            return null;
        }
        return new NLETrackSlot(jNLETrack_split, true);
    }

    public PairSlotSlot splitGetBackSlotPair(long j) {
        return new PairSlotSlot(NLEEditorJniJNI.NLETrack_splitGetBackSlotPair(this.swigCPtr, this, j), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLETrack(long j, boolean z) {
        super(NLEEditorJniJNI.NLETrack_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public void addSlotAfterSlot(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        NLEEditorJniJNI.NLETrack_addSlotAfterSlot(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot, NLETrackSlot.getCPtr(nLETrackSlot2), nLETrackSlot2);
    }

    public void addSlotAtIndex(NLETrackSlot nLETrackSlot, int i) {
        NLEEditorJniJNI.NLETrack_addSlotAtIndex__SWIG_0(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot, i);
    }

    public float getEffectScale(float f, float f2) {
        return NLEEditorJniJNI.NLETrack_getEffectScale(this.swigCPtr, this, f, f2);
    }

    public float getVideoScaleAfterFixCenter(float f, float f2) {
        return NLEEditorJniJNI.NLETrack_getVideoScaleAfterFixCenter(this.swigCPtr, this, f, f2);
    }

    public boolean moveSlotToIndex(NLETrackSlot nLETrackSlot, int i) {
        return NLEEditorJniJNI.NLETrack_moveSlotToIndex__SWIG_0(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot, i);
    }

    public PairSlotSlot splitInSpecificSlot(long j, NLETrackSlot nLETrackSlot) {
        return new PairSlotSlot(NLEEditorJniJNI.NLETrack_splitInSpecificSlot(this.swigCPtr, this, j, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot), true);
    }

    public PairNLEPoint2NLEPoint splitSegCurvePointInSlot(long j, NLETrackSlot nLETrackSlot) {
        return new PairNLEPoint2NLEPoint(NLEEditorJniJNI.NLETrack_splitSegCurvePointInSlot(this.swigCPtr, this, j, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot), true);
    }

    public PairNLEPoint2NLEPoint splitSeqCurvePointInSlot(long j, NLETrackSlot nLETrackSlot) {
        return new PairNLEPoint2NLEPoint(NLEEditorJniJNI.NLETrack_splitSeqCurvePointInSlot(this.swigCPtr, this, j, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot), true);
    }

    public void updateRelativeSizeWhileGlobalCanvasChanged(float f, float f2) {
        NLEEditorJniJNI.NLETrack_updateRelativeSizeWhileGlobalCanvasChanged(this.swigCPtr, this, f, f2);
    }

    public boolean moveSlotToIndex(int i, int i2) {
        return NLEEditorJniJNI.NLETrack_moveSlotToIndex__SWIG_1(this.swigCPtr, this, i, i2);
    }

    public void addSlotAtIndex(NLETrackSlot nLETrackSlot, int i, boolean z) {
        NLEEditorJniJNI.NLETrack_addSlotAtIndex__SWIG_1(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot, i, z);
    }
}
