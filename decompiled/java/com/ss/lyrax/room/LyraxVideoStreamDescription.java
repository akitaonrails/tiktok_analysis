package com.ss.lyrax.room;

import X.C08FF;
import X.C2188811AlT;
import android.util.Pair;

/* JADX INFO: loaded from: classes19.dex */
public class LyraxVideoStreamDescription {
    public EncoderPreference encodePreference;
    public int frameRate;
    public int maxKbps;
    public int minKbps;
    public Pair<Integer, Integer> videoSize;

    public boolean isValid() {
        Pair<Integer, Integer> pair = this.videoSize;
        if (pair == null || ((Integer) pair.first).intValue() <= 0 || ((Integer) this.videoSize.second).intValue() <= 0 || this.frameRate <= 0) {
            return false;
        }
        int i = this.maxKbps;
        return i <= 0 || this.minKbps <= i;
    }

    public LyraxVideoStreamDescription() {
        this.encodePreference = EncoderPreference.MAINTAIN_FRAMERATE;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxVideoStreamDescription{videoSize=");
        sbLIZ.append(this.videoSize);
        sbLIZ.append(", frameRate=");
        sbLIZ.append(this.frameRate);
        sbLIZ.append(", maxKbps=");
        sbLIZ.append(this.maxKbps);
        sbLIZ.append(", minKbps=");
        sbLIZ.append(this.minKbps);
        sbLIZ.append(", encodePreference=");
        sbLIZ.append(this.encodePreference);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public enum CodecMode {
        AUTO(0),
        HARDWARE(1),
        SOFTWARE(2);

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

    public enum VideoCodecType {
        AUTO(0),
        H264(1),
        BYTEVC1(2);

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

    public LyraxVideoStreamDescription(int i, int i2, int i3, int i4, int i5) {
        this.encodePreference = EncoderPreference.MAINTAIN_FRAMERATE;
        this.videoSize = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        this.frameRate = i3;
        this.maxKbps = i4;
        this.minKbps = i5;
    }

    public static LyraxVideoStreamDescription create(int i, int i2, int i3, int i4, int i5) {
        return new LyraxVideoStreamDescription(i, i2, i3, i4, i5);
    }

    public LyraxVideoStreamDescription(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.encodePreference = EncoderPreference.MAINTAIN_FRAMERATE;
        this.videoSize = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        this.frameRate = i3;
        this.maxKbps = i4;
        this.minKbps = i5;
        this.encodePreference = EncoderPreference.convertFromInt(i8);
    }
}
