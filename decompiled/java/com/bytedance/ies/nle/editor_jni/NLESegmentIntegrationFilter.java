package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentIntegrationFilter extends NLESegmentFilter {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentIntegrationFilter(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public void clearEffectKeyValuePair() {
        NLEEditorJniJNI.NLESegmentIntegrationFilter_clearEffectKeyValuePair(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentIntegrationFilter_clone = NLEEditorJniJNI.NLESegmentIntegrationFilter_clone(this.swigCPtr, this);
        if (jNLESegmentIntegrationFilter_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentIntegrationFilter_clone, true);
    }

    public VecNLEStringFloatPairSPtr getEffectKeyValuePairs() {
        return new VecNLEStringFloatPairSPtr(NLEEditorJniJNI.NLESegmentIntegrationFilter_getEffectKeyValuePairs(this.swigCPtr, this), true);
    }

    public String toEffectJsonString() {
        return NLEEditorJniJNI.NLESegmentIntegrationFilter_toEffectJsonString(this.swigCPtr, this);
    }

    public NLESegmentIntegrationFilter() {
        this(NLEEditorJniJNI.new_NLESegmentIntegrationFilter(), true);
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

    public static NLESegmentIntegrationFilter dynamicCast(NLENode nLENode) {
        long jNLESegmentIntegrationFilter_dynamicCast = NLEEditorJniJNI.NLESegmentIntegrationFilter_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentIntegrationFilter_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentIntegrationFilter(jNLESegmentIntegrationFilter_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentIntegrationFilter nLESegmentIntegrationFilter) {
        if (nLESegmentIntegrationFilter == null) {
            return 0L;
        }
        return nLESegmentIntegrationFilter.swigCPtr;
    }

    public void addEffectKeyValuePair(NLEStringFloatPair nLEStringFloatPair) {
        NLEEditorJniJNI.NLESegmentIntegrationFilter_addEffectKeyValuePair(this.swigCPtr, this, NLEStringFloatPair.getCPtr(nLEStringFloatPair), nLEStringFloatPair);
    }

    public boolean removeEffectKeyValuePair(NLEStringFloatPair nLEStringFloatPair) {
        return NLEEditorJniJNI.NLESegmentIntegrationFilter_removeEffectKeyValuePair(this.swigCPtr, this, NLEStringFloatPair.getCPtr(nLEStringFloatPair), nLEStringFloatPair);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentIntegrationFilter(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentIntegrationFilter_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
