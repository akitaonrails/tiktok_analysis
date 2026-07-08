package com.bytedance.codecx.video;

import android.media.MediaCodecInfo;

/* JADX INFO: loaded from: classes21.dex */
public class MediaCodecUtils {
    public static final int[] DECODER_COLOR_FORMATS = {19, 21, 2141391872, 2141391873, 2141391874, 2141391875, 2141391876};
    public static final int[] ENCODER_COLOR_FORMATS = {19, 21, 2141391872, 2141391876};
    public static final int[] ENCODER_COLOR_FORMATS_FOR_HISI = {21, 19};
    public static final int[] TEXTURE_COLOR_FORMATS = getTextureColorFormats();

    public static int[] getTextureColorFormats() {
        return new int[]{2130708361};
    }

    public static boolean codecSupportsType(MediaCodecInfo mediaCodecInfo, CodecXVideoCodecStandard codecXVideoCodecStandard) {
        for (String str : mediaCodecInfo.getSupportedTypes()) {
            if (codecXVideoCodecStandard.mimeType().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static Integer selectColorFormat(int[] iArr, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        for (int i : iArr) {
            for (int i2 : codecCapabilities.colorFormats) {
                if (i2 == i) {
                    return Integer.valueOf(i2);
                }
            }
        }
        return null;
    }
}
