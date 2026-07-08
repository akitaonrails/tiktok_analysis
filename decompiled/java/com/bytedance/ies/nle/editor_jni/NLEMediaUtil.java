package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEMediaUtil {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEMediaUtil(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLEMediaUtil() {
        this(NLEMediaPublicJniJNI.new_NLEMediaUtil(), true);
    }

    public static NLEAudioBeatTracking createAudioBeatTracking() {
        long jNLEMediaUtil_createAudioBeatTracking = NLEMediaPublicJniJNI.NLEMediaUtil_createAudioBeatTracking();
        if (jNLEMediaUtil_createAudioBeatTracking == 0) {
            return null;
        }
        return new NLEAudioBeatTracking(jNLEMediaUtil_createAudioBeatTracking, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMediaUtil nLEMediaUtil) {
        if (nLEMediaUtil == null) {
            return 0L;
        }
        return nLEMediaUtil.swigCPtr;
    }

    public static NLEMediaAudioInfo getMediaAudioInfo(String str) {
        long jNLEMediaUtil_getMediaAudioInfo = NLEMediaPublicJniJNI.NLEMediaUtil_getMediaAudioInfo(str);
        if (jNLEMediaUtil_getMediaAudioInfo == 0) {
            return null;
        }
        return new NLEMediaAudioInfo(jNLEMediaUtil_getMediaAudioInfo, true);
    }

    public static NLEMediaVideoInfo getMediaVideoInfo(String str) {
        long jNLEMediaUtil_getMediaVideoInfo = NLEMediaPublicJniJNI.NLEMediaUtil_getMediaVideoInfo(str);
        if (jNLEMediaUtil_getMediaVideoInfo == 0) {
            return null;
        }
        return new NLEMediaVideoInfo(jNLEMediaUtil_getMediaVideoInfo, true);
    }

    public static boolean isNewAnimation(NLEVideoAnimation nLEVideoAnimation) {
        return NLEMediaPublicJniJNI.NLEMediaUtil_isNewAnimation(NLEVideoAnimation.getCPtr(nLEVideoAnimation), nLEVideoAnimation);
    }

    public static int isStickerDynamic(String str) {
        return NLEMediaPublicJniJNI.NLEMediaUtil_isStickerDynamic(str);
    }

    public static int numberOfString(String str) {
        return NLEMediaPublicJniJNI.NLEMediaUtil_numberOfString(str);
    }

    public NLEMediaUtil(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static NLEError detachAudioStreamFile(String str, NLEModel nLEModel) {
        return NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEMediaUtil_detachAudioStreamFile__SWIG_0(str, NLEModel.getCPtr(nLEModel), nLEModel));
    }

    public static void getMediaAudioInfoAsync(String str, NLEMediaAudioInfoListener nLEMediaAudioInfoListener) {
        NLEMediaPublicJniJNI.NLEMediaUtil_getMediaAudioInfoAsync(str, NLEMediaAudioInfoListener.getCPtr(nLEMediaAudioInfoListener), nLEMediaAudioInfoListener);
    }

    public static void getMediaVideoInfoAsync(String str, NLEMediaVideoInfoListener nLEMediaVideoInfoListener) {
        NLEMediaPublicJniJNI.NLEMediaUtil_getMediaVideoInfoAsync(str, NLEMediaVideoInfoListener.getCPtr(nLEMediaVideoInfoListener), nLEMediaVideoInfoListener);
    }

    public static int operateGlobalAllowedPaths(VecString vecString, NLEAllowListOperationType nLEAllowListOperationType) {
        return NLEMediaPublicJniJNI.NLEMediaUtil_operateGlobalAllowedPaths(VecString.getCPtr(vecString), vecString, nLEAllowListOperationType.swigValue());
    }

    public static void preloadMediaInfo(VecString vecString, INLEMediaOnDone iNLEMediaOnDone) {
        NLEMediaPublicJniJNI.NLEMediaUtil_preloadMediaInfo(VecString.getCPtr(vecString), vecString, INLEMediaOnDone.getCPtr(iNLEMediaOnDone), iNLEMediaOnDone);
    }

    public static NLETrackSlot createNLESegmentTemplateWithResourceFolderPath(String str, String str2, PairIntInt pairIntInt) {
        long jNLEMediaUtil_createNLESegmentTemplateWithResourceFolderPath = NLEMediaPublicJniJNI.NLEMediaUtil_createNLESegmentTemplateWithResourceFolderPath(str, str2, PairIntInt.getCPtr(pairIntInt), pairIntInt);
        if (jNLEMediaUtil_createNLESegmentTemplateWithResourceFolderPath == 0) {
            return null;
        }
        return new NLETrackSlot(jNLEMediaUtil_createNLESegmentTemplateWithResourceFolderPath, true);
    }

    public static VecNLELoudnessDetectResult detectAudioLoudness(VecString vecString, VecLongLong vecLongLong, VecLongLong vecLongLong2) {
        return new VecNLELoudnessDetectResult(NLEMediaPublicJniJNI.NLEMediaUtil_detectAudioLoudness(VecString.getCPtr(vecString), vecString, VecLongLong.getCPtr(vecLongLong), vecLongLong, VecLongLong.getCPtr(vecLongLong2), vecLongLong2), true);
    }

    public static NLEError detachAudioStreamFile(String str, NLEModel nLEModel, int i, int i2, int i3) {
        return NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEMediaUtil_detachAudioStreamFile__SWIG_1(str, NLEModel.getCPtr(nLEModel), nLEModel, i, i2, i3));
    }
}
