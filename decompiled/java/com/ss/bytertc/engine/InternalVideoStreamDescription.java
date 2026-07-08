package com.ss.bytertc.engine;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.VideoStreamDescription;

/* JADX INFO: loaded from: classes19.dex */
public class InternalVideoStreamDescription {
    public VideoEncoderPreference encodePreference;
    public int frameRate;
    public int height;
    public int maxKbps;
    public int minKbps;
    public int width;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.InternalVideoStreamDescription$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$CodecMode;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$EncoderPreference;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$VideoCodecType;

        static {
            int[] iArr = new int[VideoStreamDescription.EncoderPreference.values().length];
            $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$EncoderPreference = iArr;
            try {
                iArr[VideoStreamDescription.EncoderPreference.Disabled.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$EncoderPreference[VideoStreamDescription.EncoderPreference.MaintainFramerate.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$EncoderPreference[VideoStreamDescription.EncoderPreference.MaintainQuality.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$EncoderPreference[VideoStreamDescription.EncoderPreference.Balance.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            int[] iArr2 = new int[VideoStreamDescription.VideoCodecType.values().length];
            $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$VideoCodecType = iArr2;
            try {
                iArr2[VideoStreamDescription.VideoCodecType.CODEC_TYPE_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$VideoCodecType[VideoStreamDescription.VideoCodecType.CODEC_TYPE_H264.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$VideoCodecType[VideoStreamDescription.VideoCodecType.CODEC_TYPE_BYTEVC1.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            int[] iArr3 = new int[VideoStreamDescription.CodecMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$CodecMode = iArr3;
            try {
                iArr3[VideoStreamDescription.CodecMode.CODEC_MODE_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$CodecMode[VideoStreamDescription.CodecMode.CODEC_MODE_HARDWARE.ordinal()] = 2;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$CodecMode[VideoStreamDescription.CodecMode.CODEC_MODE_SOFTWARE.ordinal()] = 3;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
        }
    }

    public enum VideoCodecMode {
        VIDEO_CODEC_MODE_AUTO(0),
        VIDEO_CODEC_MODE_HARDWARE(1),
        VIDEO_CODEC_MODE_SOFTWARE(2);

        public int value;

        public int getIntValue() {
            return this.value;
        }

        public static VideoCodecMode valueOf(String str) {
            return (VideoCodecMode) C08FF.LIZ(VideoCodecMode.class, str);
        }

        VideoCodecMode(int i) {
            this.value = i;
        }
    }

    public enum VideoCodecType {
        VIDEO_CODEC_TYPE_AUTO(0),
        VIDEO_CODEC_TYPE_H264(1),
        VIDEO_CODEC_TYPE_BYTEVC1(2);

        public int value;

        public int getIntValue() {
            return this.value;
        }

        public static VideoCodecType valueOf(String str) {
            return (VideoCodecType) C08FF.LIZ(VideoCodecType.class, str);
        }

        VideoCodecType(int i) {
            this.value = i;
        }
    }

    public enum VideoEncoderPreference {
        VIDEO_ENCODER_PREFERENCE_DISABLED(0),
        VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE(1),
        VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY(2),
        VIDEO_ENCODER_PREFERENCE_BALANCE(3);

        public int value;

        public int getIntValue() {
            return this.value;
        }

        public static VideoEncoderPreference valueOf(String str) {
            return (VideoEncoderPreference) C08FF.LIZ(VideoEncoderPreference.class, str);
        }

        VideoEncoderPreference(int i) {
            this.value = i;
        }
    }

    public VideoEncoderPreference getEncoderPreference() {
        return this.encodePreference;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public int getHeight() {
        return this.height;
    }

    public int getMaxKBps() {
        return this.maxKbps;
    }

    public int getMinKBps() {
        return this.minKbps;
    }

    public int getWidth() {
        return this.width;
    }

    public InternalVideoStreamDescription(VideoStreamDescription videoStreamDescription) {
        this.encodePreference = VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        this.width = ((Integer) videoStreamDescription.videoSize.first).intValue();
        this.height = ((Integer) videoStreamDescription.videoSize.second).intValue();
        this.frameRate = videoStreamDescription.frameRate;
        this.maxKbps = videoStreamDescription.maxKbps;
        this.minKbps = videoStreamDescription.minKbps;
        this.encodePreference = ConvertEnumValue(videoStreamDescription.encodePreference);
    }

    private VideoEncoderPreference ConvertEnumValue(VideoStreamDescription.EncoderPreference encoderPreference) {
        VideoEncoderPreference videoEncoderPreference = VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$EncoderPreference[encoderPreference.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_BALANCE;
                    }
                    return videoEncoderPreference;
                }
                return VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY;
            }
            return videoEncoderPreference;
        }
        return VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_DISABLED;
    }

    private VideoCodecMode ConvertEnumValue(VideoStreamDescription.CodecMode codecMode) {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$CodecMode[codecMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return VideoCodecMode.VIDEO_CODEC_MODE_AUTO;
                }
                return VideoCodecMode.VIDEO_CODEC_MODE_SOFTWARE;
            }
            return VideoCodecMode.VIDEO_CODEC_MODE_HARDWARE;
        }
        return VideoCodecMode.VIDEO_CODEC_MODE_AUTO;
    }

    private VideoCodecType ConvertEnumValue(VideoStreamDescription.VideoCodecType videoCodecType) {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$VideoCodecType[videoCodecType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return VideoCodecType.VIDEO_CODEC_TYPE_AUTO;
                }
                return VideoCodecType.VIDEO_CODEC_TYPE_BYTEVC1;
            }
            return VideoCodecType.VIDEO_CODEC_TYPE_H264;
        }
        return VideoCodecType.VIDEO_CODEC_TYPE_AUTO;
    }
}
