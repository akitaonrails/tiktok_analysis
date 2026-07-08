package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentComposerFilter extends NLESegmentFilter {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentComposerFilter(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public void clearEffectNodeKeyValuePair() {
        NLEEditorJniJNI.NLESegmentComposerFilter_clearEffectNodeKeyValuePair(this.swigCPtr, this);
    }

    public void clearRenderCacheStrings() {
        NLEEditorJniJNI.NLESegmentComposerFilter_clearRenderCacheStrings(this.swigCPtr, this);
    }

    public void clearRenderCacheTextures() {
        NLEEditorJniJNI.NLESegmentComposerFilter_clearRenderCacheTextures(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentComposerFilter_clone = NLEEditorJniJNI.NLESegmentComposerFilter_clone(this.swigCPtr, this);
        if (jNLESegmentComposerFilter_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentComposerFilter_clone, true);
    }

    public VecNLEStringFloatPairSPtr getEffectNodeKeyValuePairs() {
        return new VecNLEStringFloatPairSPtr(NLEEditorJniJNI.NLESegmentComposerFilter_getEffectNodeKeyValuePairs(this.swigCPtr, this), true);
    }

    public VecString getEffectTags() {
        return new VecString(NLEEditorJniJNI.NLESegmentComposerFilter_getEffectTags(this.swigCPtr, this), true);
    }

    public boolean getEnableMultipleFilters() {
        return NLEEditorJniJNI.NLESegmentComposerFilter_getEnableMultipleFilters(this.swigCPtr, this);
    }

    public boolean getEnableRefactor() {
        return NLEEditorJniJNI.NLESegmentComposerFilter_getEnableRefactor(this.swigCPtr, this);
    }

    public VecString getNodePaths() {
        return new VecString(NLEEditorJniJNI.NLESegmentComposerFilter_getNodePaths(this.swigCPtr, this), true);
    }

    public VecNLEStringStringPairPairSPtr getRenderCacheStringss() {
        return new VecNLEStringStringPairPairSPtr(NLEEditorJniJNI.NLESegmentComposerFilter_getRenderCacheStringss(this.swigCPtr, this), true);
    }

    public VecNLEStringStringPairPairSPtr getRenderCacheTexturess() {
        return new VecNLEStringStringPairPairSPtr(NLEEditorJniJNI.NLESegmentComposerFilter_getRenderCacheTexturess(this.swigCPtr, this), true);
    }

    public int getStatus() {
        return NLEEditorJniJNI.NLESegmentComposerFilter_getStatus(this.swigCPtr, this);
    }

    public boolean hasEffectTags() {
        return NLEEditorJniJNI.NLESegmentComposerFilter_hasEffectTags(this.swigCPtr, this);
    }

    public boolean hasEnableMultipleFilters() {
        return NLEEditorJniJNI.NLESegmentComposerFilter_hasEnableMultipleFilters(this.swigCPtr, this);
    }

    public boolean hasEnableRefactor() {
        return NLEEditorJniJNI.NLESegmentComposerFilter_hasEnableRefactor(this.swigCPtr, this);
    }

    public boolean hasNodePaths() {
        return NLEEditorJniJNI.NLESegmentComposerFilter_hasNodePaths(this.swigCPtr, this);
    }

    public boolean hasStatus() {
        return NLEEditorJniJNI.NLESegmentComposerFilter_hasStatus(this.swigCPtr, this);
    }

    public NLESegmentComposerFilter() {
        this(NLEEditorJniJNI.new_NLESegmentComposerFilter(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLESegmentComposerFilter dynamicCast(NLENode nLENode) {
        long jNLESegmentComposerFilter_dynamicCast = NLEEditorJniJNI.NLESegmentComposerFilter_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentComposerFilter_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentComposerFilter(jNLESegmentComposerFilter_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentComposerFilter nLESegmentComposerFilter) {
        if (nLESegmentComposerFilter == null) {
            return 0L;
        }
        return nLESegmentComposerFilter.swigCPtr;
    }

    public void addEffectNodeKeyValuePair(NLEStringFloatPair nLEStringFloatPair) {
        NLEEditorJniJNI.NLESegmentComposerFilter_addEffectNodeKeyValuePair(this.swigCPtr, this, NLEStringFloatPair.getCPtr(nLEStringFloatPair), nLEStringFloatPair);
    }

    public void addRenderCacheStrings(NLEStringStringPair nLEStringStringPair) {
        NLEEditorJniJNI.NLESegmentComposerFilter_addRenderCacheStrings(this.swigCPtr, this, NLEStringStringPair.getCPtr(nLEStringStringPair), nLEStringStringPair);
    }

    public void addRenderCacheTextures(NLEStringStringPair nLEStringStringPair) {
        NLEEditorJniJNI.NLESegmentComposerFilter_addRenderCacheTextures(this.swigCPtr, this, NLEStringStringPair.getCPtr(nLEStringStringPair), nLEStringStringPair);
    }

    public boolean removeEffectNodeKeyValuePair(NLEStringFloatPair nLEStringFloatPair) {
        return NLEEditorJniJNI.NLESegmentComposerFilter_removeEffectNodeKeyValuePair(this.swigCPtr, this, NLEStringFloatPair.getCPtr(nLEStringFloatPair), nLEStringFloatPair);
    }

    public boolean removeRenderCacheStrings(NLEStringStringPair nLEStringStringPair) {
        return NLEEditorJniJNI.NLESegmentComposerFilter_removeRenderCacheStrings(this.swigCPtr, this, NLEStringStringPair.getCPtr(nLEStringStringPair), nLEStringStringPair);
    }

    public boolean removeRenderCacheTextures(NLEStringStringPair nLEStringStringPair) {
        return NLEEditorJniJNI.NLESegmentComposerFilter_removeRenderCacheTextures(this.swigCPtr, this, NLEStringStringPair.getCPtr(nLEStringStringPair), nLEStringStringPair);
    }

    public void setEffectTags(VecString vecString) {
        NLEEditorJniJNI.NLESegmentComposerFilter_setEffectTags(this.swigCPtr, this, VecString.getCPtr(vecString), vecString);
    }

    public void setEnableMultipleFilters(boolean z) {
        NLEEditorJniJNI.NLESegmentComposerFilter_setEnableMultipleFilters(this.swigCPtr, this, z);
    }

    public void setEnableRefactor(boolean z) {
        NLEEditorJniJNI.NLESegmentComposerFilter_setEnableRefactor(this.swigCPtr, this, z);
    }

    public void setNodePaths(VecString vecString) {
        NLEEditorJniJNI.NLESegmentComposerFilter_setNodePaths(this.swigCPtr, this, VecString.getCPtr(vecString), vecString);
    }

    public void setStatus(int i) {
        NLEEditorJniJNI.NLESegmentComposerFilter_setStatus(this.swigCPtr, this, i);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentComposerFilter(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentComposerFilter_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
