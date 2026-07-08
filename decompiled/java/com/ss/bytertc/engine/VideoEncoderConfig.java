package com.ss.bytertc.engine;

import X.C08FF;
import X.C2188811AlT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class VideoEncoderConfig {
    public VideoDegradeLevels degradeLevels;
    public EncoderPreference encodePreference;
    public int frameRate;
    public int height;
    public int maxBitrate;
    public int minBitrate;
    public List<BitRateTable> minBitrateTables;
    public List<VideoResolutionConfig> resolutionBase;
    public int width;

    public static class VideoDegradeLevels {
        public List<VideoDegradeConfig> perf = new ArrayList();

        /* JADX INFO: renamed from: net, reason: collision with root package name */
        public List<VideoDegradeConfig> f440net = new ArrayList();
    }

    public boolean isValid() {
        return true;
    }

    public VideoEncoderConfig() {
        this.maxBitrate = -1;
        this.encodePreference = EncoderPreference.MAINTAIN_FRAMERATE;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoEncoderConfig{width=");
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

    /* JADX INFO: loaded from: classes19.dex */
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

    /* JADX INFO: loaded from: classes19.dex */
    public enum EncoderPreference {
        DISABLED(0),
        MAINTAIN_FRAMERATE(1),
        MAINTAIN_QUALITY(2),
        BALANCE(3);

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

    /* JADX INFO: loaded from: classes19.dex */
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

    public VideoEncoderConfig(int i, int i2, int i3, int i4, int i5) {
        this.maxBitrate = -1;
        this.encodePreference = EncoderPreference.MAINTAIN_FRAMERATE;
        this.width = i;
        this.height = i2;
        this.frameRate = i3;
        this.maxBitrate = i4;
        this.minBitrate = i5;
    }

    public static VideoEncoderConfig create(int i, int i2, int i3, int i4, int i5) {
        return new VideoEncoderConfig(i, i2, i3, i4, i5);
    }

    public VideoEncoderConfig(int i, int i2, int i3, int i4, int i5, List<BitRateTable> list, VideoDegradeLevels videoDegradeLevels) {
        this.maxBitrate = -1;
        this.encodePreference = EncoderPreference.MAINTAIN_FRAMERATE;
        this.width = i;
        this.height = i2;
        this.frameRate = i3;
        this.maxBitrate = i4;
        this.minBitrate = i5;
        if (list != null) {
            this.minBitrateTables = list;
        }
        if (videoDegradeLevels != null) {
            this.degradeLevels = videoDegradeLevels;
        }
    }

    public VideoEncoderConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.maxBitrate = -1;
        this.encodePreference = EncoderPreference.MAINTAIN_FRAMERATE;
        this.width = i;
        this.height = i2;
        this.frameRate = i3;
        this.maxBitrate = i4;
        this.minBitrate = i5;
        this.encodePreference = EncoderPreference.convertFromInt(i8);
        List<BitRateTable> list = this.minBitrateTables;
        if (list != null) {
            this.minBitrateTables = list;
        }
        VideoDegradeLevels videoDegradeLevels = this.degradeLevels;
        if (videoDegradeLevels != null) {
            this.degradeLevels = videoDegradeLevels;
        }
    }
}
