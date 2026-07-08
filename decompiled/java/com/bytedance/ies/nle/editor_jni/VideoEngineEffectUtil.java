package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class VideoEngineEffectUtil {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_VideoEngineEffectUtil(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public VideoEngineEffectUtil() {
        this(NLEMediaPublicJniJNI.new_VideoEngineEffectUtil(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(VideoEngineEffectUtil videoEngineEffectUtil) {
        if (videoEngineEffectUtil == null) {
            return 0L;
        }
        return videoEngineEffectUtil.swigCPtr;
    }

    public static boolean isAllUsingNewEngine(String str) {
        return NLEMediaPublicJniJNI.VideoEngineEffectUtil_isAllUsingNewEngine(str);
    }

    public VideoEngineEffectUtil(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
