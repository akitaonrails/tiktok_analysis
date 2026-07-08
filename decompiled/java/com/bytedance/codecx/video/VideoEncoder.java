package com.bytedance.codecx.video;

import X.C08FF;
import X.C2188811AlT;
import com.bytedance.codecx.video.EglBase;
import com.bytedance.codecx.video.EglBase10;
import com.bytedance.codecx.video.EglBase14;
import com.bytedance.codecx.video.memory.CodecXVideoFrameInterface;

/* JADX INFO: loaded from: classes21.dex */
public interface VideoEncoder {

    public interface Callback {
        void onEncodedEvent(EncodeEvent encodeEvent);

        void onEncodedFrame(EncodedImage encodedImage, CodecSpecificInfo codecSpecificInfo);
    }

    public static class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();
        public final Integer high;
        public final Integer low;
        public final boolean on;

        public String toString() {
            if (!this.on) {
                return "OFF";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[ ");
            sbLIZ.append(this.low);
            sbLIZ.append(", ");
            sbLIZ.append(this.high);
            sbLIZ.append(" ]");
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ScalingSettings() {
        }

        public ScalingSettings(boolean z) {
            this.on = z;
        }

        public ScalingSettings(int i, int i2) {
            this.on = true;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }

        public ScalingSettings(boolean z, int i, int i2) {
            this.on = z;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }
    }

    CodecXVideoCodecStatus encode(CodecXVideoFrameInterface codecXVideoFrameInterface, boolean z);

    CodecXVideoCodecStatus flush();

    String getEncoderVendors();

    CodecXVideoCodecStatus initEncode(Settings settings, Callback callback);

    boolean isCacheEncoderWhenCreate();

    CodecXVideoCodecStatus release();

    CodecXVideoCodecStatus requestKeyFrame();

    CodecXVideoCodecStatus setPrivateParam(String str, String str2);

    CodecXVideoCodecStatus setRateAllocation(int i, int i2);

    public enum EncodeEvent {
        UNKNOWN(0),
        RESET(1);

        public int value;

        public int getEventValue() {
            return this.value;
        }

        public static EncodeEvent fromValue(int i) {
            if (i != 1) {
                return UNKNOWN;
            }
            return RESET;
        }

        public static EncodeEvent valueOf(String str) {
            return (EncodeEvent) C08FF.LIZ(EncodeEvent.class, str);
        }

        EncodeEvent(int i) {
            this.value = i;
        }
    }

    public enum BitrateMode {
        AUTO(0),
        VBR(1),
        CBR(2);

        public int value;

        public static BitrateMode fromValue(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return AUTO;
                    }
                    return CBR;
                }
                return VBR;
            }
            return AUTO;
        }

        public static BitrateMode valueOf(String str) {
            return (BitrateMode) C08FF.LIZ(BitrateMode.class, str);
        }

        BitrateMode(int i) {
            this.value = i;
        }
    }

    public static class CodecSpecificInfo {
        public CodecXVideoCodecStandard codec_standard;

        public CodecSpecificInfo(CodecXVideoCodecStandard codecXVideoCodecStandard) {
            this.codec_standard = codecXVideoCodecStandard;
        }
    }

    public enum EncodeMode {
        COMMON(0),
        CLOUD_GAME(1),
        CONFERENCE(2),
        LIVE(3);

        public int value;

        public static EncodeMode fromValue(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return COMMON;
                    }
                    return LIVE;
                }
                return CONFERENCE;
            }
            return CLOUD_GAME;
        }

        public static EncodeMode valueOf(String str) {
            return (EncodeMode) C08FF.LIZ(EncodeMode.class, str);
        }

        EncodeMode(int i) {
            this.value = i;
        }
    }

    public enum ScaleMode {
        AUTO(0),
        STRETCH(1),
        FIT_WITH_CROPPING(2),
        FIT_WITH_FILLING(3);

        public int value;

        public static ScaleMode fromValue(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return AUTO;
                        }
                        return FIT_WITH_FILLING;
                    }
                    return FIT_WITH_CROPPING;
                }
                return STRETCH;
            }
            return AUTO;
        }

        public static ScaleMode valueOf(String str) {
            return (ScaleMode) C08FF.LIZ(ScaleMode.class, str);
        }

        ScaleMode(int i) {
            this.value = i;
        }
    }

    public static class Settings {
        public final int bFrameNum;
        public final BitrateMode bitrateMode;
        public final boolean closeSetProfile;
        public final boolean enableAlignment;
        public final boolean enableAsyncMode;
        public final boolean enableColorSpaceSetting;
        public final boolean enableQpSetting;
        public final boolean enableROI;
        public final EncodeMode encodeMode;
        public final int height;
        public final boolean isStatisticsEnabled;
        public final int matrixId;
        public final int maxIQp;
        public final int maxQp;
        public final int minIQp;
        public final int minQp;
        public final int primaryId;
        public final int rangeId;
        public final ScaleMode scaleMode;
        public final EglBase14.Context sharedContext;
        public int targetBps;
        public final int targetFps;
        public final int targetKeyFrameIntervalMs;
        public final int temporalLayerNum;
        public final int transferId;
        public final boolean useSurfaceMode;
        public final int width;

        public Settings(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, boolean z, int i14, int i15, int i16, boolean z2, boolean z3, boolean z4, int i17, int i18, EglBase.Context context, boolean z5, boolean z6, boolean z7, boolean z8) {
            this.width = i;
            this.height = i2;
            this.scaleMode = ScaleMode.fromValue(i3);
            this.targetBps = i4;
            this.targetFps = i5;
            this.primaryId = i6;
            this.transferId = i7;
            this.matrixId = i8;
            this.rangeId = i9;
            this.maxQp = i10;
            this.minQp = i11;
            this.temporalLayerNum = i14;
            this.bitrateMode = BitrateMode.fromValue(i15);
            this.targetKeyFrameIntervalMs = i16;
            this.closeSetProfile = z2;
            this.useSurfaceMode = z3;
            this.enableAlignment = z4;
            this.maxIQp = i12;
            this.minIQp = i13;
            this.bFrameNum = i18;
            this.enableQpSetting = z;
            this.encodeMode = EncodeMode.fromValue(i17);
            if (context instanceof EglBase14.Context) {
                this.sharedContext = (EglBase14.Context) context;
            } else if (!(context instanceof EglBase10.Context) && context != null && context.getEgl14Context() != null) {
                this.sharedContext = new EglBase14.Context(context.getEgl14Context());
            } else {
                this.sharedContext = null;
            }
            this.enableAsyncMode = z5;
            this.isStatisticsEnabled = z6;
            this.enableColorSpaceSetting = z7;
            this.enableROI = z8;
        }
    }
}
