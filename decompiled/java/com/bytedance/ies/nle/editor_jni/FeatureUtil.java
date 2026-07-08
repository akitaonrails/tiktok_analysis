package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class FeatureUtil {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLETemplateJNI.delete_FeatureUtil(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public static VecPairStrInt getAllFeatureAndIndexList() {
        return new VecPairStrInt(NLETemplateJNI.FeatureUtil_getAllFeatureAndIndexList(), true);
    }

    public FeatureUtil() {
        this(NLETemplateJNI.new_FeatureUtil(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(FeatureUtil featureUtil) {
        if (featureUtil == null) {
            return 0L;
        }
        return featureUtil.swigCPtr;
    }

    public FeatureUtil(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static void addFeatureForNode(String str, NLENode nLENode) {
        NLETemplateJNI.FeatureUtil_addFeatureForNode(str, NLENode.getCPtr(nLENode), nLENode);
    }
}
