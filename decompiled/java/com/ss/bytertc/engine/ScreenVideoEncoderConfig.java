package com.ss.bytertc.engine;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes19.dex */
public class ScreenVideoEncoderConfig {
    public EncoderPreference encodePreference;
    public int frameRate;
    public int height;
    public int maxBitrate;
    public int minBitrate;
    public int width;

    public boolean isValid() {
        if (this.width <= 0 || this.height <= 0 || this.frameRate <= 0) {
            return false;
        }
        int i = this.maxBitrate;
        return i <= 0 || i >= this.minBitrate;
    }

    public ScreenVideoEncoderConfig() {
        this.maxBitrate = -1;
        this.encodePreference = EncoderPreference.MaintainFramerate;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScreenVideoEncoderConfig{width=");
        sbLIZ.append(this.width);
        sbLIZ.append("height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", frameRate=");
        sbLIZ.append(this.frameRate);
        sbLIZ.append(", maxBitrate=");
        sbLIZ.append(this.maxBitrate);
        sbLIZ.append(", minBitrate=");
        sbLIZ.append(this.minBitrate);
        sbLIZ.append(", encodePreference=");
        sbLIZ.append(this.encodePreference);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public enum CodecMode {
        CODEC_MODE_AUTO(0),
        CODEC_MODE_HARDWARE(1),
        CODEC_MODE_SOFTWARE(2);

        public int value;

        public int getValue() {
            return this.value;
        }

        public static CodecMode convertFromInt(int i) {
            return values()[i];
        }

        public static CodecMode valueOf(String str) {
            return (CodecMode) C08FF.LIZ(CodecMode.class, str);
        }

        CodecMode(int i) {
            this.value = i;
        }
    }

    public enum EncoderPreference {
        MaintainFramerate(1),
        MaintainQuality(2);

        public int value;

        public int getValue() {
            return this.value;
        }

        public static EncoderPreference convertFromInt(int i) {
            return values()[i];
        }

        public static EncoderPreference valueOf(String str) {
            return (EncoderPreference) C08FF.LIZ(EncoderPreference.class, str);
        }

        EncoderPreference(int i) {
            this.value = i;
        }
    }

    public enum VideoCodecType {
        CODEC_TYPE_AUTO(0),
        CODEC_TYPE_H264(1),
        CODEC_TYPE_BYTEVC1(2);

        public int value;

        public int getValue() {
            return this.value;
        }

        public static VideoCodecType convertFromInt(int i) {
            return values()[i];
        }

        public static VideoCodecType valueOf(String str) {
            return (VideoCodecType) C08FF.LIZ(VideoCodecType.class, str);
        }

        VideoCodecType(int i) {
            this.value = i;
        }
    }

    public ScreenVideoEncoderConfig(int i, int i2, int i3, int i4, int i5) {
        this.maxBitrate = -1;
        this.encodePreference = EncoderPreference.MaintainFramerate;
        this.width = i;
        this.height = i2;
        this.frameRate = i3;
        this.maxBitrate = i4;
        this.minBitrate = i5;
    }

    public static ScreenVideoEncoderConfig create(int i, int i2, int i3, int i4, int i5) {
        return new ScreenVideoEncoderConfig(i, i2, i3, i4, i5);
    }

    public ScreenVideoEncoderConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.maxBitrate = -1;
        this.encodePreference = EncoderPreference.MaintainFramerate;
        this.width = i;
        this.height = i2;
        this.frameRate = i3;
        this.maxBitrate = i4;
        this.minBitrate = i5;
        this.encodePreference = EncoderPreference.convertFromInt(i8);
    }
}
