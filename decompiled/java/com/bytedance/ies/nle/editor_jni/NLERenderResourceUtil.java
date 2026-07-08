package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes23.dex */
public class NLERenderResourceUtil {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                throw new UnsupportedOperationException("C++ destructor does not have public access");
            }
            this.swigCPtr = 0L;
        }
    }

    public static void convertTrackKeyframesToSlotKeyframes(NLEModel nLEModel) {
        NLEMediaPublicJniJNI.NLERenderResourceUtil_convertTrackKeyframesToSlotKeyframes(NLEModel.getCPtr(nLEModel), nLEModel);
    }

    public static long getCPtr(NLERenderResourceUtil nLERenderResourceUtil) {
        if (nLERenderResourceUtil == null) {
            return 0L;
        }
        return nLERenderResourceUtil.swigCPtr;
    }

    public static VecString getUnpreparedNecessaryResources(NLEModel nLEModel) {
        return new VecString(NLEMediaPublicJniJNI.NLERenderResourceUtil_getUnpreparedNecessaryResources(NLEModel.getCPtr(nLEModel), nLEModel), true);
    }

    public static VecString getUnpreparedUnnecessaryResources(NLEModel nLEModel) {
        return new VecString(NLEMediaPublicJniJNI.NLERenderResourceUtil_getUnpreparedUnnecessaryResources(NLEModel.getCPtr(nLEModel), nLEModel), true);
    }

    public NLERenderResourceUtil(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static void setUnnecessaryNLEResourceByTime(NLEModel nLEModel, long j) {
        NLEMediaPublicJniJNI.NLERenderResourceUtil_setUnnecessaryNLEResourceByTime(NLEModel.getCPtr(nLEModel), nLEModel, j);
    }

    public static void setNLEResourceNecessary(NLEModel nLEModel, long j, long j2) {
        NLEMediaPublicJniJNI.NLERenderResourceUtil_setNLEResourceNecessary(NLEModel.getCPtr(nLEModel), nLEModel, j, j2);
    }
}
