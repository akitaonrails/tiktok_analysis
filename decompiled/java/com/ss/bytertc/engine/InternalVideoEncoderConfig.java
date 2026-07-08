package com.ss.bytertc.engine;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.VideoEncoderConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class InternalVideoEncoderConfig {
    public VideoDegradeLevels degradeLevels;
    public InternalVideoEncoderPreference encodePreference;
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
        public List<VideoDegradeConfig> f438net = new ArrayList();
    }

    /* JADX INFO: renamed from: com.ss.bytertc.engine.InternalVideoEncoderConfig$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes19.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$CodecMode;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$EncoderPreference;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$VideoCodecType;

        static {
            int[] iArr = new int[VideoEncoderConfig.EncoderPreference.values().length];
            $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$EncoderPreference = iArr;
            try {
                iArr[VideoEncoderConfig.EncoderPreference.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$EncoderPreference[VideoEncoderConfig.EncoderPreference.MAINTAIN_FRAMERATE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$EncoderPreference[VideoEncoderConfig.EncoderPreference.MAINTAIN_QUALITY.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$EncoderPreference[VideoEncoderConfig.EncoderPreference.BALANCE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            int[] iArr2 = new int[VideoEncoderConfig.VideoCodecType.values().length];
            $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$VideoCodecType = iArr2;
            try {
                iArr2[VideoEncoderConfig.VideoCodecType.CODEC_TYPE_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$VideoCodecType[VideoEncoderConfig.VideoCodecType.CODEC_TYPE_H264.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$VideoCodecType[VideoEncoderConfig.VideoCodecType.CODEC_TYPE_BYTEVC1.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            int[] iArr3 = new int[VideoEncoderConfig.CodecMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$CodecMode = iArr3;
            try {
                iArr3[VideoEncoderConfig.CodecMode.CODEC_MODE_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$CodecMode[VideoEncoderConfig.CodecMode.CODEC_MODE_HARDWARE.ordinal()] = 2;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$CodecMode[VideoEncoderConfig.CodecMode.CODEC_MODE_SOFTWARE.ordinal()] = 3;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
        }
    }

    public List<VideoDegradeConfig> getNetDegradeLevel() {
        VideoDegradeLevels videoDegradeLevels = this.degradeLevels;
        if (videoDegradeLevels != null) {
            return videoDegradeLevels.f438net;
        }
        return null;
    }

    public List<VideoDegradeConfig> getPerfDegradeLevel() {
        VideoDegradeLevels videoDegradeLevels = this.degradeLevels;
        if (videoDegradeLevels != null) {
            return videoDegradeLevels.perf;
        }
        return null;
    }

    public InternalVideoEncoderPreference getEncoderPreference() {
        return this.encodePreference;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public int getHeight() {
        return this.height;
    }

    public int getMaxKBps() {
        return this.maxBitrate;
    }

    public List<BitRateTable> getMinBitRateTables() {
        return this.minBitrateTables;
    }

    public int getMinKBps() {
        return this.minBitrate;
    }

    public List<VideoResolutionConfig> getResolutionBase() {
        return this.resolutionBase;
    }

    public int getWidth() {
        return this.width;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public enum InternalVideoCodecMode {
        VIDEO_CODEC_MODE_AUTO(0),
        VIDEO_CODEC_MODE_HARDWARE(1),
        VIDEO_CODEC_MODE_SOFTWARE(2);

        public int value;

        public int getIntValue() {
            return this.value;
        }

        public static InternalVideoCodecMode valueOf(String str) {
            return (InternalVideoCodecMode) C08FF.LIZ(InternalVideoCodecMode.class, str);
        }

        InternalVideoCodecMode(int i) {
            this.value = i;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public enum InternalVideoCodecType {
        VIDEO_CODEC_TYPE_AUTO(0),
        VIDEO_CODEC_TYPE_H264(1),
        VIDEO_CODEC_TYPE_BYTEVC1(2);

        public int value;

        public int getIntValue() {
            return this.value;
        }

        public static InternalVideoCodecType valueOf(String str) {
            return (InternalVideoCodecType) C08FF.LIZ(InternalVideoCodecType.class, str);
        }

        InternalVideoCodecType(int i) {
            this.value = i;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public enum InternalVideoEncoderPreference {
        VIDEO_ENCODER_PREFERENCE_DISABLED(0),
        VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE(1),
        VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY(2),
        VIDEO_ENCODER_PREFERENCE_BALANCE(3);

        public int value;

        public int getIntValue() {
            return this.value;
        }

        public static InternalVideoEncoderPreference valueOf(String str) {
            return (InternalVideoEncoderPreference) C08FF.LIZ(InternalVideoEncoderPreference.class, str);
        }

        InternalVideoEncoderPreference(int i) {
            this.value = i;
        }
    }

    public InternalVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig) {
        this.encodePreference = InternalVideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        this.minBitrateTables = new ArrayList();
        this.degradeLevels = null;
        this.resolutionBase = null;
        this.width = videoEncoderConfig.width;
        this.height = videoEncoderConfig.height;
        this.frameRate = videoEncoderConfig.frameRate;
        this.maxBitrate = videoEncoderConfig.maxBitrate;
        this.minBitrate = videoEncoderConfig.minBitrate;
        this.encodePreference = ConvertEnumValue(videoEncoderConfig.encodePreference);
        if (videoEncoderConfig.minBitrateTables != null) {
            this.minBitrateTables = new ArrayList(videoEncoderConfig.minBitrateTables.size());
            for (BitRateTable bitRateTable : videoEncoderConfig.minBitrateTables) {
                if (bitRateTable != null) {
                    BitRateTable bitRateTable2 = new BitRateTable();
                    bitRateTable2.pixels = bitRateTable.pixels;
                    bitRateTable2.minKbps = bitRateTable.minKbps;
                    this.minBitrateTables.add(bitRateTable2);
                }
            }
        }
        if (videoEncoderConfig.degradeLevels != null) {
            VideoDegradeLevels videoDegradeLevels = new VideoDegradeLevels();
            List<VideoDegradeConfig> list = videoEncoderConfig.degradeLevels.perf;
            if (list != null) {
                for (VideoDegradeConfig videoDegradeConfig : list) {
                    if (videoDegradeConfig != null) {
                        VideoDegradeConfig videoDegradeConfig2 = new VideoDegradeConfig();
                        videoDegradeConfig2.width = videoDegradeConfig.width;
                        videoDegradeConfig2.height = videoDegradeConfig.height;
                        videoDegradeConfig2.framerate = videoDegradeConfig.framerate;
                        videoDegradeConfig2.upThresholdKbps = videoDegradeConfig.upThresholdKbps;
                        videoDegradeConfig2.downThresholdKbps = videoDegradeConfig.downThresholdKbps;
                        videoDegradeLevels.perf.add(videoDegradeConfig2);
                    }
                }
            }
            List<VideoDegradeConfig> list2 = videoEncoderConfig.degradeLevels.f440net;
            if (list2 != null) {
                for (VideoDegradeConfig videoDegradeConfig3 : list2) {
                    if (videoDegradeConfig3 != null) {
                        VideoDegradeConfig videoDegradeConfig4 = new VideoDegradeConfig();
                        videoDegradeConfig4.width = videoDegradeConfig3.width;
                        videoDegradeConfig4.height = videoDegradeConfig3.height;
                        videoDegradeConfig4.framerate = videoDegradeConfig3.framerate;
                        videoDegradeConfig4.upThresholdKbps = videoDegradeConfig3.upThresholdKbps;
                        videoDegradeConfig4.downThresholdKbps = videoDegradeConfig3.downThresholdKbps;
                        videoDegradeLevels.f438net.add(videoDegradeConfig4);
                    }
                }
            }
            this.degradeLevels = videoDegradeLevels;
        }
        if (videoEncoderConfig.resolutionBase != null) {
            this.resolutionBase = new ArrayList(videoEncoderConfig.resolutionBase.size());
            for (VideoResolutionConfig videoResolutionConfig : videoEncoderConfig.resolutionBase) {
                if (videoResolutionConfig != null) {
                    VideoResolutionConfig videoResolutionConfig2 = new VideoResolutionConfig();
                    videoResolutionConfig2.width = videoResolutionConfig.width;
                    videoResolutionConfig2.height = videoResolutionConfig.height;
                    videoResolutionConfig2.framerate = videoResolutionConfig.framerate;
                    videoResolutionConfig2.maxKbps = videoResolutionConfig.maxKbps;
                    videoResolutionConfig2.minKbps = videoResolutionConfig.minKbps;
                    videoResolutionConfig2.defaultKbps = videoResolutionConfig.defaultKbps;
                    this.resolutionBase.add(videoResolutionConfig2);
                }
            }
        }
    }

    private InternalVideoEncoderPreference ConvertEnumValue(VideoEncoderConfig.EncoderPreference encoderPreference) {
        InternalVideoEncoderPreference internalVideoEncoderPreference = InternalVideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$EncoderPreference[encoderPreference.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return InternalVideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_BALANCE;
                    }
                    return internalVideoEncoderPreference;
                }
                return InternalVideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY;
            }
            return internalVideoEncoderPreference;
        }
        return InternalVideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_DISABLED;
    }

    private InternalVideoCodecMode ConvertEnumValue(VideoEncoderConfig.CodecMode codecMode) {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$CodecMode[codecMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return InternalVideoCodecMode.VIDEO_CODEC_MODE_AUTO;
                }
                return InternalVideoCodecMode.VIDEO_CODEC_MODE_SOFTWARE;
            }
            return InternalVideoCodecMode.VIDEO_CODEC_MODE_HARDWARE;
        }
        return InternalVideoCodecMode.VIDEO_CODEC_MODE_AUTO;
    }

    private InternalVideoCodecType ConvertEnumValue(VideoEncoderConfig.VideoCodecType videoCodecType) {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$VideoCodecType[videoCodecType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return InternalVideoCodecType.VIDEO_CODEC_TYPE_AUTO;
                }
                return InternalVideoCodecType.VIDEO_CODEC_TYPE_BYTEVC1;
            }
            return InternalVideoCodecType.VIDEO_CODEC_TYPE_H264;
        }
        return InternalVideoCodecType.VIDEO_CODEC_TYPE_AUTO;
    }
}
