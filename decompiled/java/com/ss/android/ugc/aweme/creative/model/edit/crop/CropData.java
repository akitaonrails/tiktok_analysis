package com.ss.android.ugc.aweme.creative.model.edit.crop;

import X.C09CT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class CropData implements Serializable {

    @C09CT("buttonRotation")
    public final float buttonRotation;

    @C09CT("cropMatrix")
    public final String cropMatrix;

    @C09CT("cropMode")
    public final int cropMode;

    @C09CT("frameRotation")
    public final float frameRotation;

    @C09CT("frameScale")
    public final float frameScale;

    @C09CT("frameTranslateX")
    public final float frameTranslateX;

    @C09CT("frameTranslateY")
    public final float frameTranslateY;

    @C09CT("isPhotoCropped")
    public final boolean isPhotoCropped;

    @C09CT("leftBottomX")
    public final float leftBottomX;

    @C09CT("leftBottomY")
    public final float leftBottomY;

    @C09CT("leftTopX")
    public final float leftTopX;

    @C09CT("leftTopY")
    public final float leftTopY;

    @C09CT("mirrorX")
    public final boolean mirrorX;

    @C09CT("ratio")
    public final float ratio;

    @C09CT("rightBottomX")
    public final float rightBottomX;

    @C09CT("rightBottomY")
    public final float rightBottomY;

    @C09CT("rightTopX")
    public final float rightTopX;

    @C09CT("rightTopY")
    public final float rightTopY;

    @C09CT("sliderRotation")
    public final float sliderRotation;

    public CropData() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, null, 0.0f, 0.0f, false, false);
    }

    public static /* synthetic */ CropData copy$default(CropData cropData, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i, String str, float f14, float f15, boolean z, boolean z2, int i2, Object obj) {
        float f16 = f2;
        float f18 = f;
        float f19 = f8;
        float f20 = f7;
        float f21 = f6;
        float f22 = f5;
        float f23 = f4;
        float f24 = f3;
        int i3 = i;
        float f25 = f13;
        float f26 = f12;
        float f27 = f11;
        float f28 = f10;
        float f29 = f9;
        boolean z3 = z;
        float f30 = f15;
        float f31 = f14;
        boolean z4 = z2;
        String str2 = str;
        if ((i2 & 1) != 0) {
            f18 = cropData.leftTopX;
        }
        if ((i2 & 2) != 0) {
            f16 = cropData.leftTopY;
        }
        if ((i2 & 4) != 0) {
            f24 = cropData.rightTopX;
        }
        if ((i2 & 8) != 0) {
            f23 = cropData.rightTopY;
        }
        if ((i2 & 16) != 0) {
            f22 = cropData.leftBottomX;
        }
        if ((i2 & 32) != 0) {
            f21 = cropData.leftBottomY;
        }
        if ((i2 & 64) != 0) {
            f20 = cropData.rightBottomX;
        }
        if ((i2 & 128) != 0) {
            f19 = cropData.rightBottomY;
        }
        if ((i2 & 256) != 0) {
            f29 = cropData.frameScale;
        }
        if ((i2 & 512) != 0) {
            f28 = cropData.frameTranslateX;
        }
        if ((i2 & 1024) != 0) {
            f27 = cropData.frameTranslateY;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            f26 = cropData.frameRotation;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            f25 = cropData.ratio;
        }
        if ((i2 & 8192) != 0) {
            i3 = cropData.cropMode;
        }
        if ((i2 & 16384) != 0) {
            str2 = cropData.cropMatrix;
        }
        if ((32768 & i2) != 0) {
            f31 = cropData.sliderRotation;
        }
        if ((65536 & i2) != 0) {
            f30 = cropData.buttonRotation;
        }
        if ((131072 & i2) != 0) {
            z3 = cropData.isPhotoCropped;
        }
        if ((i2 & 262144) != 0) {
            z4 = cropData.mirrorX;
        }
        float f32 = f20;
        return cropData.copy(f18, f16, f24, f23, f22, f21, f32, f19, f29, f28, f27, f26, f25, i3, str2, f31, f30, z3, z4);
    }

    public final CropData copy(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i, String str, float f14, float f15, boolean z, boolean z2) {
        return new CropData(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, i, str, f14, f15, z, z2);
    }

    public String toString() {
        return "CropData(leftTopX=" + this.leftTopX + ", leftTopY=" + this.leftTopY + ", rightTopX=" + this.rightTopX + ", rightTopY=" + this.rightTopY + ", leftBottomX=" + this.leftBottomX + ", leftBottomY=" + this.leftBottomY + ", rightBottomX=" + this.rightBottomX + ", rightBottomY=" + this.rightBottomY + ", frameScale=" + this.frameScale + ", frameTranslateX=" + this.frameTranslateX + ", frameTranslateY=" + this.frameTranslateY + ", frameRotation=" + this.frameRotation + ", ratio=" + this.ratio + ", cropMode=" + this.cropMode + ", cropMatrix=" + this.cropMatrix + ", sliderRotation=" + this.sliderRotation + ", buttonRotation=" + this.buttonRotation + ", isPhotoCropped=" + this.isPhotoCropped + ", mirrorX=" + this.mirrorX + ')';
    }

    public final boolean isPhotoCropped() {
        return this.isPhotoCropped;
    }

    public CropData(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i, String str, float f14, float f15, boolean z, boolean z2) {
        this.leftTopX = f;
        this.leftTopY = f2;
        this.rightTopX = f3;
        this.rightTopY = f4;
        this.leftBottomX = f5;
        this.leftBottomY = f6;
        this.rightBottomX = f7;
        this.rightBottomY = f8;
        this.frameScale = f9;
        this.frameTranslateX = f10;
        this.frameTranslateY = f11;
        this.frameRotation = f12;
        this.ratio = f13;
        this.cropMode = i;
        this.cropMatrix = str;
        this.sliderRotation = f14;
        this.buttonRotation = f15;
        this.isPhotoCropped = z;
        this.mirrorX = z2;
    }
}
