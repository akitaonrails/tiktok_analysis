package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentAudioSamiFilter extends NLESegmentFilter {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentAudioSamiFilter(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentAudioSamiFilter_clone = NLEEditorJniJNI.NLESegmentAudioSamiFilter_clone(this.swigCPtr, this);
        if (jNLESegmentAudioSamiFilter_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentAudioSamiFilter_clone, true);
    }

    public boolean getEnableSNR() {
        return NLEEditorJniJNI.NLESegmentAudioSamiFilter_getEnableSNR(this.swigCPtr, this);
    }

    public String getSamiCreateConfigInfo() {
        return NLEEditorJniJNI.NLESegmentAudioSamiFilter_getSamiCreateConfigInfo(this.swigCPtr, this);
    }

    public String getSamiDenoiseLevel() {
        return NLEEditorJniJNI.NLESegmentAudioSamiFilter_getSamiDenoiseLevel(this.swigCPtr, this);
    }

    public String getSamiParam() {
        return NLEEditorJniJNI.NLESegmentAudioSamiFilter_getSamiParam(this.swigCPtr, this);
    }

    public String getSamiSnrFilePath() {
        return NLEEditorJniJNI.NLESegmentAudioSamiFilter_getSamiSnrFilePath(this.swigCPtr, this);
    }

    public String getSamiSnrThreshold() {
        return NLEEditorJniJNI.NLESegmentAudioSamiFilter_getSamiSnrThreshold(this.swigCPtr, this);
    }

    public int getSamiType() {
        return NLEEditorJniJNI.NLESegmentAudioSamiFilter_getSamiType(this.swigCPtr, this);
    }

    public boolean hasEnableSNR() {
        return NLEEditorJniJNI.NLESegmentAudioSamiFilter_hasEnableSNR(this.swigCPtr, this);
    }

    public boolean hasSamiCreateConfigInfo() {
        return NLEEditorJniJNI.NLESegmentAudioSamiFilter_hasSamiCreateConfigInfo(this.swigCPtr, this);
    }

    public boolean hasSamiDenoiseLevel() {
        return NLEEditorJniJNI.NLESegmentAudioSamiFilter_hasSamiDenoiseLevel(this.swigCPtr, this);
    }

    public boolean hasSamiParam() {
        return NLEEditorJniJNI.NLESegmentAudioSamiFilter_hasSamiParam(this.swigCPtr, this);
    }

    public boolean hasSamiSnrFilePath() {
        return NLEEditorJniJNI.NLESegmentAudioSamiFilter_hasSamiSnrFilePath(this.swigCPtr, this);
    }

    public boolean hasSamiSnrThreshold() {
        return NLEEditorJniJNI.NLESegmentAudioSamiFilter_hasSamiSnrThreshold(this.swigCPtr, this);
    }

    public boolean hasSamiType() {
        return NLEEditorJniJNI.NLESegmentAudioSamiFilter_hasSamiType(this.swigCPtr, this);
    }

    public NLESegmentAudioSamiFilter() {
        this(NLEEditorJniJNI.new_NLESegmentAudioSamiFilter(), true);
    }

    public static int getTYPE_CE_DENOISE() {
        return NLEEditorJniJNI.NLESegmentAudioSamiFilter_TYPE_CE_DENOISE_get();
    }

    public static int getTYPE_DENOISE_V2() {
        return NLEEditorJniJNI.NLESegmentAudioSamiFilter_TYPE_DENOISE_V2_get();
    }

    public static int getTYPE_DENOISE_V2_SPEECH44k() {
        return NLEEditorJniJNI.NLESegmentAudioSamiFilter_TYPE_DENOISE_V2_SPEECH44k_get();
    }

    public static int getTYPE_DENOISE_V3() {
        return NLEEditorJniJNI.NLESegmentAudioSamiFilter_TYPE_DENOISE_V3_get();
    }

    public static int getTYPE_FTGRUE_NOISE() {
        return NLEEditorJniJNI.NLESegmentAudioSamiFilter_TYPE_FTGRUE_NOISE_get();
    }

    public static int getTYPE_TCNDE_NOISE() {
        return NLEEditorJniJNI.NLESegmentAudioSamiFilter_TYPE_TCNDE_NOISE_get();
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

    public static NLESegmentAudioSamiFilter dynamicCast(NLENode nLENode) {
        long jNLESegmentAudioSamiFilter_dynamicCast = NLEEditorJniJNI.NLESegmentAudioSamiFilter_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentAudioSamiFilter_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentAudioSamiFilter(jNLESegmentAudioSamiFilter_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter) {
        if (nLESegmentAudioSamiFilter == null) {
            return 0L;
        }
        return nLESegmentAudioSamiFilter.swigCPtr;
    }

    public void setEnableSNR(boolean z) {
        NLEEditorJniJNI.NLESegmentAudioSamiFilter_setEnableSNR(this.swigCPtr, this, z);
    }

    public void setSamiCreateConfigInfo(String str) {
        NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiCreateConfigInfo(this.swigCPtr, this, str);
    }

    public void setSamiDenoiseLevel(String str) {
        NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiDenoiseLevel(this.swigCPtr, this, str);
    }

    public void setSamiParam(String str) {
        NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiParam(this.swigCPtr, this, str);
    }

    public void setSamiSnrFilePath(String str) {
        NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiSnrFilePath(this.swigCPtr, this, str);
    }

    public void setSamiSnrThreshold(String str) {
        NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiSnrThreshold(this.swigCPtr, this, str);
    }

    public void setSamiType(int i) {
        NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiType(this.swigCPtr, this, i);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentAudioSamiFilter(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentAudioSamiFilter_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
