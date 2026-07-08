package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEInvisibleWatermarkExtractor {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEInvisibleWatermarkExtractor(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void cancelExtraction() {
        NLEMediaPublicJniJNI.NLEInvisibleWatermarkExtractor_cancelExtraction(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public NLEInvisibleWatermarkExtractor(String str) {
        this(NLEMediaPublicJniJNI.new_NLEInvisibleWatermarkExtractor(str), true);
    }

    public static long getCPtr(NLEInvisibleWatermarkExtractor nLEInvisibleWatermarkExtractor) {
        if (nLEInvisibleWatermarkExtractor == null) {
            return 0L;
        }
        return nLEInvisibleWatermarkExtractor.swigCPtr;
    }

    public NLEInvisibleWatermarkExtractor(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public int startExtraction(String str, NLEInvisibleWatermarkTimeRange nLEInvisibleWatermarkTimeRange, INLEInvisibleWatermarkListener iNLEInvisibleWatermarkListener) {
        return NLEMediaPublicJniJNI.NLEInvisibleWatermarkExtractor_startExtraction(this.swigCPtr, this, str, NLEInvisibleWatermarkTimeRange.getCPtr(nLEInvisibleWatermarkTimeRange), nLEInvisibleWatermarkTimeRange, INLEInvisibleWatermarkListener.getCPtr(iNLEInvisibleWatermarkListener), iNLEInvisibleWatermarkListener);
    }
}
