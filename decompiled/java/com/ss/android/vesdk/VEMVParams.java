package com.ss.android.vesdk;

import X.C08FF;
import X.C2188811AlT;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public class VEMVParams {
    public float backVolume;
    public String bgmPath;
    public int bgmTrimIn;
    public int bgmTrimOut;
    public VESize customRenderRes;
    public String[] extraParams;
    public VESize imageResizeRatio;
    public List<VESize> imgSizes;
    public boolean isSingleVideo;
    public int[] karaokeAudioDurations;
    public String[] karaokeAudioPaths;
    public float[] karaokeAudioSpeeds;
    public int[] mvDuration;
    public String mvPath;
    public float originalVolume;
    public int resFillMode;
    public MVResolution resMV;
    public String[] resourcesFilePaths;
    public String[] resourcesTypes;

    public VEMVParams() {
        this.backVolume = 1.0f;
        this.originalVolume = 1.0f;
        this.bgmTrimIn = -1;
        this.bgmTrimOut = -1;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEMVParams{mvPath='");
        sbLIZ.append(this.mvPath);
        sbLIZ.append('\'');
        sbLIZ.append(", resourcesFilePaths=");
        sbLIZ.append(Arrays.toString(this.resourcesFilePaths));
        sbLIZ.append(", resourcesTypes=");
        sbLIZ.append(Arrays.toString(this.resourcesTypes));
        sbLIZ.append(", isSingleVideo=");
        sbLIZ.append(this.isSingleVideo);
        sbLIZ.append(", mvDuration=");
        sbLIZ.append(Arrays.toString(this.mvDuration));
        sbLIZ.append(", bgmPath='");
        sbLIZ.append(this.bgmPath);
        sbLIZ.append('\'');
        sbLIZ.append(", bgmTrimIn=");
        sbLIZ.append(this.bgmTrimIn);
        sbLIZ.append(", bgmTrimOut=");
        sbLIZ.append(this.bgmTrimOut);
        sbLIZ.append(", imgSizes=");
        sbLIZ.append(this.imgSizes);
        sbLIZ.append(", backVolume=");
        sbLIZ.append(this.backVolume);
        sbLIZ.append(", originalVolume=");
        sbLIZ.append(this.originalVolume);
        sbLIZ.append(", resMV=");
        sbLIZ.append(this.resMV);
        sbLIZ.append(", karaokeAudioPaths=");
        sbLIZ.append(Arrays.toString(this.karaokeAudioPaths));
        sbLIZ.append(", karaokeAudioDurations=");
        sbLIZ.append(Arrays.toString(this.karaokeAudioDurations));
        sbLIZ.append(", karaokeAudioSpeeds=");
        sbLIZ.append(Arrays.toString(this.karaokeAudioSpeeds));
        sbLIZ.append(", customRenderRes=");
        sbLIZ.append(this.customRenderRes);
        sbLIZ.append(", imageResizeRatio=");
        sbLIZ.append(this.imageResizeRatio);
        sbLIZ.append(", imageResFillMode=");
        sbLIZ.append(this.resFillMode);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public enum MVResolution {
        RES_RANDOM,
        RES_720P,
        RES_1080P,
        RES_2K,
        RES_720P_REVERSE,
        RES_FROM_TEMPLATE,
        RES_CUSTOM;

        public static MVResolution valueOf(String str) {
            return (MVResolution) C08FF.LIZ(MVResolution.class, str);
        }
    }

    public VEMVParams(String str, String[] strArr, String[] strArr2) {
        this.backVolume = 1.0f;
        this.originalVolume = 1.0f;
        this.mvPath = str;
        this.resourcesFilePaths = strArr;
        this.resourcesTypes = strArr2;
        this.resMV = MVResolution.RES_RANDOM;
    }

    public VEMVParams(String str, String[] strArr, String[] strArr2, MVResolution mVResolution) {
        this.backVolume = 1.0f;
        this.originalVolume = 1.0f;
        this.mvPath = str;
        this.resourcesFilePaths = strArr;
        this.resourcesTypes = strArr2;
        this.resMV = mVResolution;
    }

    public VEMVParams(String str, String[] strArr, String[] strArr2, String str2, int i, int i2) {
        this.backVolume = 1.0f;
        this.originalVolume = 1.0f;
        this.mvPath = str;
        this.resourcesFilePaths = strArr;
        this.resourcesTypes = strArr2;
        this.bgmPath = str2;
        this.bgmTrimIn = i;
        this.bgmTrimOut = i2;
        this.resMV = MVResolution.RES_RANDOM;
    }

    public VEMVParams(String str, String[] strArr, String[] strArr2, int[] iArr, String[] strArr3, int[] iArr2, float[] fArr) {
        this.backVolume = 1.0f;
        this.originalVolume = 1.0f;
        if (strArr2[0].equals("video") && iArr == null) {
            throw new VEException(-100, "Invalid params in karaoke mv mode!");
        }
        this.mvPath = str;
        this.resourcesFilePaths = strArr;
        this.resourcesTypes = strArr2;
        this.mvDuration = iArr;
        this.karaokeAudioPaths = strArr3;
        this.karaokeAudioDurations = iArr2;
        this.karaokeAudioSpeeds = fArr;
        this.resMV = MVResolution.RES_RANDOM;
        this.isSingleVideo = false;
    }

    public VEMVParams(String str, String[] strArr, String[] strArr2, String str2, int i, int i2, boolean z, int[] iArr) {
        this.backVolume = 1.0f;
        this.originalVolume = 1.0f;
        this.mvPath = str;
        this.resourcesFilePaths = strArr;
        this.resourcesTypes = strArr2;
        this.bgmPath = str2;
        this.bgmTrimIn = i;
        this.bgmTrimOut = i2;
        this.resMV = MVResolution.RES_RANDOM;
        this.isSingleVideo = z;
        this.mvDuration = iArr;
    }
}
