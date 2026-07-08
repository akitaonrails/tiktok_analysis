package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEKeyFrameTransientExtrakey {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLEKeyFrameTransientExtrakey(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLEKeyFrameTransientExtrakey() {
        this(NLEEditorJniJNI.new_NLEKeyFrameTransientExtrakey(), true);
    }

    public static String getChromaChannelIntensity() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getChromaChannelIntensity();
    }

    public static String getChromaChannelShadow() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getChromaChannelShadow();
    }

    public static String getFilterIntensity() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getFilterIntensity();
    }

    public static String getMaskCenterX() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getMaskCenterX();
    }

    public static String getMaskCenterY() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getMaskCenterY();
    }

    public static String getMaskHeight() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getMaskHeight();
    }

    public static String getMaskRotation() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getMaskRotation();
    }

    public static String getMaskRoundCorner() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getMaskRoundCorner();
    }

    public static String getMaskWidth() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getMaskWidth();
    }

    public static String getMaskfeather() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getMaskfeather();
    }

    public static String getSlotAlpha() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotAlpha();
    }

    public static String getSlotRotation() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotRotation();
    }

    public static String getSlotScale() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotScale();
    }

    public static String getSlotVolume() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotVolume();
    }

    public static String getSlotX() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotX();
    }

    public static String getSlotY() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotY();
    }

    public static String getTextBackgroundColor() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getTextBackgroundColor();
    }

    public static String getTextColor() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getTextColor();
    }

    public static String getTextOutlineColor() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getTextOutlineColor();
    }

    public static String getTextOutlineWidth() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getTextOutlineWidth();
    }

    public static String getTextShadowColor() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getTextShadowColor();
    }

    public static String getTextShadowOffsetX() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getTextShadowOffsetX();
    }

    public static String getTextShadowOffsetY() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getTextShadowOffsetY();
    }

    public static String getTextShadowSmoothing() {
        return NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getTextShadowSmoothing();
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEKeyFrameTransientExtrakey nLEKeyFrameTransientExtrakey) {
        if (nLEKeyFrameTransientExtrakey == null) {
            return 0L;
        }
        return nLEKeyFrameTransientExtrakey.swigCPtr;
    }

    public NLEKeyFrameTransientExtrakey(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
