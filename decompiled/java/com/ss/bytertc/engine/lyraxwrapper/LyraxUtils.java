package com.ss.bytertc.engine.lyraxwrapper;

import X.C08FF;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.data.AudioEncodeConfig;
import com.ss.bytertc.engine.data.HumanOrientation;
import com.ss.bytertc.engine.data.Orientation;
import com.ss.bytertc.engine.data.Position;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.live.ByteRTCLowLatencyParams;
import com.ss.bytertc.engine.live.ByteRTCStreamMixingEvent;
import com.ss.bytertc.engine.live.ByteRTCTranscoderErrorCode;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import com.ss.bytertc.engine.live.MixedStreamType;
import com.ss.lyrax.audio.LyraxAudioAACCodecProfile;
import com.ss.lyrax.audio.LyraxAudioChannel;
import com.ss.lyrax.audio.LyraxAudioCodecType;
import com.ss.lyrax.audio.LyraxAudioEncoderConfig;
import com.ss.lyrax.audio.LyraxAudioSampleRate;
import com.ss.lyrax.stream.LyraxLowLatencyParams;
import com.ss.lyrax.stream.LyraxStreamIndex;
import com.ss.lyrax.transcoder.LyraxTranscoderAppdataSEIMode;
import com.ss.lyrax.transcoder.LyraxTranscoderAsrTaskMode;
import com.ss.lyrax.transcoder.LyraxTranscoderAudioCodecProfile;
import com.ss.lyrax.transcoder.LyraxTranscoderAudioCodecType;
import com.ss.lyrax.transcoder.LyraxTranscoderAudioConfig;
import com.ss.lyrax.transcoder.LyraxTranscoderEffectDescription;
import com.ss.lyrax.transcoder.LyraxTranscoderEffectParam;
import com.ss.lyrax.transcoder.LyraxTranscoderEffectType;
import com.ss.lyrax.transcoder.LyraxTranscoderFeature;
import com.ss.lyrax.transcoder.LyraxTranscoderFeaturesConfig;
import com.ss.lyrax.transcoder.LyraxTranscoderHumanOrientation;
import com.ss.lyrax.transcoder.LyraxTranscoderLayoutConfig;
import com.ss.lyrax.transcoder.LyraxTranscoderLayoutRegionAlternateImageProcessConfig;
import com.ss.lyrax.transcoder.LyraxTranscoderLayoutRegionConfig;
import com.ss.lyrax.transcoder.LyraxTranscoderLayoutRegionType;
import com.ss.lyrax.transcoder.LyraxTranscoderMediaType;
import com.ss.lyrax.transcoder.LyraxTranscoderMixingErrorCode;
import com.ss.lyrax.transcoder.LyraxTranscoderMixingEvent;
import com.ss.lyrax.transcoder.LyraxTranscoderMixingType;
import com.ss.lyrax.transcoder.LyraxTranscoderOrientation;
import com.ss.lyrax.transcoder.LyraxTranscoderParam;
import com.ss.lyrax.transcoder.LyraxTranscoderPosition;
import com.ss.lyrax.transcoder.LyraxTranscoderRenderMode;
import com.ss.lyrax.transcoder.LyraxTranscoderServerControlConfig;
import com.ss.lyrax.transcoder.LyraxTranscoderSourceCrop;
import com.ss.lyrax.transcoder.LyraxTranscoderSpatialAudioConfig;
import com.ss.lyrax.transcoder.LyraxTranscoderSyncControlConfig;
import com.ss.lyrax.transcoder.LyraxTranscoderSyncStrategy;
import com.ss.lyrax.transcoder.LyraxTranscoderVideoCodecType;
import com.ss.lyrax.transcoder.LyraxTranscoderVideoConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxUtils {

    /* JADX INFO: renamed from: com.ss.bytertc.engine.lyraxwrapper.LyraxUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$StreamIndex;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$live$MixedStreamConfig$MixedStreamRenderMode;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent;

        static {
            int[] iArr = new int[MixedStreamConfig.MixedStreamRenderMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$live$MixedStreamConfig$MixedStreamRenderMode = iArr;
            try {
                iArr[MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$MixedStreamConfig$MixedStreamRenderMode[MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_FIT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$MixedStreamConfig$MixedStreamRenderMode[MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_ADAPTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$MixedStreamConfig$MixedStreamRenderMode[MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_BOTTOM_CROP.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            int[] iArr2 = new int[StreamIndex.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$StreamIndex = iArr2;
            try {
                iArr2[StreamIndex.STREAM_INDEX_MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$StreamIndex[StreamIndex.STREAM_INDEX_2ND.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$StreamIndex[StreamIndex.STREAM_INDEX_3RD.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$StreamIndex[StreamIndex.STREAM_INDEX_4TH.ordinal()] = 4;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$StreamIndex[StreamIndex.STREAM_INDEX_5TH.ordinal()] = 5;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$StreamIndex[StreamIndex.STREAM_INDEX_6TH.ordinal()] = 6;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$StreamIndex[StreamIndex.STREAM_INDEX_7TH.ordinal()] = 7;
            } catch (NoSuchFieldError e11) {
                TryCatchGuardChecker.doCheck(e11);
            }
            int[] iArr3 = new int[LyraxTranscoderMixingErrorCode.values().length];
            $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode = iArr3;
            try {
                iArr3[LyraxTranscoderMixingErrorCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError e12) {
                TryCatchGuardChecker.doCheck(e12);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.BASE.ordinal()] = 2;
            } catch (NoSuchFieldError e13) {
                TryCatchGuardChecker.doCheck(e13);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.INVALID_PARAM.ordinal()] = 3;
            } catch (NoSuchFieldError e14) {
                TryCatchGuardChecker.doCheck(e14);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.INVALID_STATE.ordinal()] = 4;
            } catch (NoSuchFieldError e15) {
                TryCatchGuardChecker.doCheck(e15);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.INVALID_OPERATOR.ordinal()] = 5;
            } catch (NoSuchFieldError e16) {
                TryCatchGuardChecker.doCheck(e16);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.TIMEOUT.ordinal()] = 6;
            } catch (NoSuchFieldError e17) {
                TryCatchGuardChecker.doCheck(e17);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.INVALID_PARAM_BY_SERVER.ordinal()] = 7;
            } catch (NoSuchFieldError e18) {
                TryCatchGuardChecker.doCheck(e18);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.SUB_TIMEOUT_BY_SERVER.ordinal()] = 8;
            } catch (NoSuchFieldError e19) {
                TryCatchGuardChecker.doCheck(e19);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.INVALID_STATE_BY_SERVER.ordinal()] = 9;
            } catch (NoSuchFieldError e20) {
                TryCatchGuardChecker.doCheck(e20);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.AUTHENTICATION_BY_CDN.ordinal()] = 10;
            } catch (NoSuchFieldError e21) {
                TryCatchGuardChecker.doCheck(e21);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.TIMEOUT_BY_SIGNALING.ordinal()] = 11;
            } catch (NoSuchFieldError e22) {
                TryCatchGuardChecker.doCheck(e22);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.MIX_IMAGE_FAIL.ordinal()] = 12;
            } catch (NoSuchFieldError e23) {
                TryCatchGuardChecker.doCheck(e23);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.UNKNOW_ERROR_BY_SERVER.ordinal()] = 13;
            } catch (NoSuchFieldError e24) {
                TryCatchGuardChecker.doCheck(e24);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.STREAM_SYNC_WORSE.ordinal()] = 14;
            } catch (NoSuchFieldError e25) {
                TryCatchGuardChecker.doCheck(e25);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.ALTERNATE_IMAGE_SUCCEEDED.ordinal()] = 15;
            } catch (NoSuchFieldError e26) {
                TryCatchGuardChecker.doCheck(e26);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.ALTERNATE_IMAGE_FAILED.ordinal()] = 16;
            } catch (NoSuchFieldError e27) {
                TryCatchGuardChecker.doCheck(e27);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.BACKGROUND_SUCCEEDED.ordinal()] = 17;
            } catch (NoSuchFieldError e28) {
                TryCatchGuardChecker.doCheck(e28);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.BACKGROUND_FAILED.ordinal()] = 18;
            } catch (NoSuchFieldError e29) {
                TryCatchGuardChecker.doCheck(e29);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.MAX.ordinal()] = 19;
            } catch (NoSuchFieldError e30) {
                TryCatchGuardChecker.doCheck(e30);
            }
            int[] iArr4 = new int[LyraxTranscoderMixingEvent.values().length];
            $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent = iArr4;
            try {
                iArr4[LyraxTranscoderMixingEvent.STREAM_MIXING_BASE.ordinal()] = 1;
            } catch (NoSuchFieldError e31) {
                TryCatchGuardChecker.doCheck(e31);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_START.ordinal()] = 2;
            } catch (NoSuchFieldError e32) {
                TryCatchGuardChecker.doCheck(e32);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_START_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError e33) {
                TryCatchGuardChecker.doCheck(e33);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_START_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError e34) {
                TryCatchGuardChecker.doCheck(e34);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_UPDATE.ordinal()] = 5;
            } catch (NoSuchFieldError e35) {
                TryCatchGuardChecker.doCheck(e35);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_UPDATE_SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError e36) {
                TryCatchGuardChecker.doCheck(e36);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_UPDATE_FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError e37) {
                TryCatchGuardChecker.doCheck(e37);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_STOP.ordinal()] = 8;
            } catch (NoSuchFieldError e38) {
                TryCatchGuardChecker.doCheck(e38);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_STOP_SUCCESS.ordinal()] = 9;
            } catch (NoSuchFieldError e39) {
                TryCatchGuardChecker.doCheck(e39);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_STOP_FAILED.ordinal()] = 10;
            } catch (NoSuchFieldError e40) {
                TryCatchGuardChecker.doCheck(e40);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_CHANGE_MIX_TYPE.ordinal()] = 11;
            } catch (NoSuchFieldError e41) {
                TryCatchGuardChecker.doCheck(e41);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_FIRST_AUDIO_FRAME_BY_CLIENT_MIX.ordinal()] = 12;
            } catch (NoSuchFieldError e42) {
                TryCatchGuardChecker.doCheck(e42);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_FIRST_VIDEO_FRAME_BY_CLIENT_MIX.ordinal()] = 13;
            } catch (NoSuchFieldError e43) {
                TryCatchGuardChecker.doCheck(e43);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_UPDATE_TIMEOUT.ordinal()] = 14;
            } catch (NoSuchFieldError e44) {
                TryCatchGuardChecker.doCheck(e44);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_START_TIMEOUT.ordinal()] = 15;
            } catch (NoSuchFieldError e45) {
                TryCatchGuardChecker.doCheck(e45);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_REQUEST_PARAM_ERROR.ordinal()] = 16;
            } catch (NoSuchFieldError e46) {
                TryCatchGuardChecker.doCheck(e46);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_MIX_IMAGE_EVENT.ordinal()] = 17;
            } catch (NoSuchFieldError e47) {
                TryCatchGuardChecker.doCheck(e47);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_SINGLE_CHORUS_EVENT.ordinal()] = 18;
            } catch (NoSuchFieldError e48) {
                TryCatchGuardChecker.doCheck(e48);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_MAX.ordinal()] = 19;
            } catch (NoSuchFieldError e49) {
                TryCatchGuardChecker.doCheck(e49);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_ALTERNATE_IMAGE_SUCCEED.ordinal()] = 20;
            } catch (NoSuchFieldError e50) {
                TryCatchGuardChecker.doCheck(e50);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_ALTERNATE_IMAGE_FAILED.ordinal()] = 21;
            } catch (NoSuchFieldError e51) {
                TryCatchGuardChecker.doCheck(e51);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_BACKGROUND_URL_SUCCEED.ordinal()] = 22;
            } catch (NoSuchFieldError e52) {
                TryCatchGuardChecker.doCheck(e52);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_BACKGROUND_URL_FAILED.ordinal()] = 23;
            } catch (NoSuchFieldError e53) {
                TryCatchGuardChecker.doCheck(e53);
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public enum LyraxLayoutRegionType {
        LyraxLayoutRegionTypeNormal,
        LyraxLayoutRegionTypeBefore;

        public static LyraxLayoutRegionType valueOf(String str) {
            return (LyraxLayoutRegionType) C08FF.LIZ(LyraxLayoutRegionType.class, str);
        }
    }

    public static ByteRTCTranscoderErrorCode convertLyraxTranscoderMixingErrorCode(LyraxTranscoderMixingErrorCode lyraxTranscoderMixingErrorCode) {
        switch (AnonymousClass1.$SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[lyraxTranscoderMixingErrorCode.ordinal()]) {
        }
        return ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_OK;
    }

    public static ByteRTCStreamMixingEvent convertLyraxTranscoderMixingEvent(LyraxTranscoderMixingEvent lyraxTranscoderMixingEvent) {
        switch (AnonymousClass1.$SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[lyraxTranscoderMixingEvent.ordinal()]) {
        }
        return ByteRTCStreamMixingEvent.STREAM_MIXING_BASE;
    }

    public static MixedStreamType convertLyraxTranscoderMixingType(LyraxTranscoderMixingType lyraxTranscoderMixingType) {
        if (lyraxTranscoderMixingType == LyraxTranscoderMixingType.BY_SERVER) {
            return MixedStreamType.MIXED_STREAM_TYPE_BY_SERVER;
        }
        if (lyraxTranscoderMixingType == LyraxTranscoderMixingType.BY_CLIENT) {
            return MixedStreamType.MIXED_STREAM_TYPE_BY_CLIENT;
        }
        return MixedStreamType.MIXED_STREAM_TYPE_BY_SERVER;
    }

    public static LyraxTranscoderAppdataSEIMode convertMixedStreamAppdataSEIMode(MixedStreamConfig.AppdataSEIMode appdataSEIMode) {
        if (appdataSEIMode == MixedStreamConfig.AppdataSEIMode.APPDATA_SEI_ASYN_MODE) {
            return LyraxTranscoderAppdataSEIMode.ASYNC_MODE;
        }
        if (appdataSEIMode == MixedStreamConfig.AppdataSEIMode.APPDATA_SEI_SYN_MODE) {
            return LyraxTranscoderAppdataSEIMode.SYNC_MODE;
        }
        return LyraxTranscoderAppdataSEIMode.ASYNC_MODE;
    }

    public static LyraxTranscoderAudioCodecType convertMixedStreamAudioCodec(MixedStreamConfig.MixedStreamAudioConfig.MixedStreamAudioCodecType mixedStreamAudioCodecType) {
        return LyraxTranscoderAudioCodecType.AUDIOCODEC_AAC;
    }

    public static LyraxTranscoderAudioCodecProfile convertMixedStreamAudioProfile(MixedStreamConfig.MixedStreamAudioProfile mixedStreamAudioProfile) {
        if (mixedStreamAudioProfile == MixedStreamConfig.MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_LC) {
            return LyraxTranscoderAudioCodecProfile.AACPROFILE_LC;
        }
        if (mixedStreamAudioProfile == MixedStreamConfig.MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_HEV1) {
            return LyraxTranscoderAudioCodecProfile.AACPROFILE_HEV1;
        }
        if (mixedStreamAudioProfile == MixedStreamConfig.MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_HEV2) {
            return LyraxTranscoderAudioCodecProfile.AACPROFILE_HEV2;
        }
        return LyraxTranscoderAudioCodecProfile.AACPROFILE_LC;
    }

    public static LyraxTranscoderRenderMode convertMixedStreamBackGroundImageRenderMode(MixedStreamConfig.MixedStreamRenderMode mixedStreamRenderMode) {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$live$MixedStreamConfig$MixedStreamRenderMode[mixedStreamRenderMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return LyraxTranscoderRenderMode.HIDDEN;
                    }
                    return LyraxTranscoderRenderMode.BOTTOM_CROP;
                }
                return LyraxTranscoderRenderMode.ADAPTIVE;
            }
            return LyraxTranscoderRenderMode.FIT;
        }
        return LyraxTranscoderRenderMode.HIDDEN;
    }

    public static LyraxTranscoderLayoutRegionType convertMixedStreamLayoutRegionType(MixedStreamConfig.MixedStreamLayoutRegionType mixedStreamLayoutRegionType) {
        if (mixedStreamLayoutRegionType == MixedStreamConfig.MixedStreamLayoutRegionType.MIXED_STREAM_LAYOUT_REGION_TYPE_VIDEO_STREAM) {
            return LyraxTranscoderLayoutRegionType.VIDEO_STREAM;
        }
        if (mixedStreamLayoutRegionType == MixedStreamConfig.MixedStreamLayoutRegionType.MIXED_STREAM_LAYOUT_REGION_TYPE_IMAGE) {
            return LyraxTranscoderLayoutRegionType.IMAGE;
        }
        return LyraxTranscoderLayoutRegionType.VIDEO_STREAM;
    }

    public static LyraxTranscoderMediaType convertMixedStreamMediaType(MixedStreamConfig.MixedStreamMediaType mixedStreamMediaType) {
        if (mixedStreamMediaType == MixedStreamConfig.MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_AUDIO_ONLY) {
            return LyraxTranscoderMediaType.AUDIO_ONLY;
        }
        if (mixedStreamMediaType == MixedStreamConfig.MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_VIDEO_ONLY) {
            return LyraxTranscoderMediaType.VIDEO_ONLY;
        }
        if (mixedStreamMediaType == MixedStreamConfig.MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO) {
            return LyraxTranscoderMediaType.AUDIO_AND_VIDEO;
        }
        return LyraxTranscoderMediaType.AUDIO_AND_VIDEO;
    }

    public static LyraxTranscoderRenderMode convertMixedStreamRenderMode(MixedStreamConfig.MixedStreamRenderMode mixedStreamRenderMode) {
        if (mixedStreamRenderMode == MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN) {
            return LyraxTranscoderRenderMode.HIDDEN;
        }
        if (mixedStreamRenderMode == MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_FIT) {
            return LyraxTranscoderRenderMode.FIT;
        }
        if (mixedStreamRenderMode == MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_ADAPTIVE) {
            return LyraxTranscoderRenderMode.ADAPTIVE;
        }
        if (mixedStreamRenderMode == MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_BOTTOM_CROP) {
            return LyraxTranscoderRenderMode.BOTTOM_CROP;
        }
        return LyraxTranscoderRenderMode.HIDDEN;
    }

    public static LyraxTranscoderSyncStrategy convertMixedStreamSyncStrategy(MixedStreamConfig.MixedStreamSyncStrategy mixedStreamSyncStrategy) {
        if (mixedStreamSyncStrategy == MixedStreamConfig.MixedStreamSyncStrategy.MIXED_STREAM_SYNC_STRATEGY_NO_SYNC) {
            return LyraxTranscoderSyncStrategy.NO_SYNC;
        }
        if (mixedStreamSyncStrategy == MixedStreamConfig.MixedStreamSyncStrategy.MIXED_STREAM_SYNC_STRATEGY_AUDIO_PRECISE_SYNC) {
            return LyraxTranscoderSyncStrategy.AUDIO_PRECISE_SYNC;
        }
        if (mixedStreamSyncStrategy == MixedStreamConfig.MixedStreamSyncStrategy.MIXED_STREAM_SYNC_STRATEGY_SIMPLEX_MODE_SYNC) {
            return LyraxTranscoderSyncStrategy.SIMPLEX_MODE_SYNC;
        }
        return LyraxTranscoderSyncStrategy.NO_SYNC;
    }

    public static LyraxTranscoderVideoCodecType convertMixedStreamVideoCodec(MixedStreamConfig.MixedStreamVideoConfig.MixedStreamVideoCodecType mixedStreamVideoCodecType) {
        if (mixedStreamVideoCodecType == MixedStreamConfig.MixedStreamVideoConfig.MixedStreamVideoCodecType.MIXED_STREAM_VIDEO_CODEC_TYPE_H264) {
            return LyraxTranscoderVideoCodecType.H264;
        }
        if (mixedStreamVideoCodecType == MixedStreamConfig.MixedStreamVideoConfig.MixedStreamVideoCodecType.MIXED_STREAM_VIDEO_CODEC_TYPE_BYTEVC1) {
            return LyraxTranscoderVideoCodecType.H265;
        }
        return LyraxTranscoderVideoCodecType.H264;
    }

    public static LyraxStreamIndex convertStreamIndex(StreamIndex streamIndex) {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$StreamIndex[streamIndex.ordinal()]) {
        }
        return LyraxStreamIndex.kMain;
    }

    public static LyraxTranscoderParam createLyraxTranscoderParam(MixedStreamConfig mixedStreamConfig) {
        int minBitrateKBPS;
        int maxBitrateKBPS;
        LyraxTranscoderParam lyraxTranscoderParamDefaultLyraxTranscoderConfig = LyraxTranscoderParam.defaultLyraxTranscoderConfig();
        JSONObject authInfo = mixedStreamConfig.getAuthInfo();
        if (authInfo != null) {
            lyraxTranscoderParamDefaultLyraxTranscoderConfig.setAuthInfo(C786410Ut5.J3(authInfo));
        }
        lyraxTranscoderParamDefaultLyraxTranscoderConfig.setRoomId(mixedStreamConfig.getRoomID());
        lyraxTranscoderParamDefaultLyraxTranscoderConfig.setUserId(mixedStreamConfig.getUserID());
        lyraxTranscoderParamDefaultLyraxTranscoderConfig.setOrientation(mixedStreamConfig.getMixedStreamOrientation());
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(mixedStreamConfig.getPushURL());
        lyraxTranscoderParamDefaultLyraxTranscoderConfig.setPushUrls(arrayList);
        lyraxTranscoderParamDefaultLyraxTranscoderConfig.setDisableCdnForward(mixedStreamConfig.isDisableCdnForward());
        LyraxLowLatencyParams lyraxLowLatencyParams = new LyraxLowLatencyParams();
        ByteRTCLowLatencyParams lowLatencyParams = mixedStreamConfig.getLowLatencyParams();
        if (lowLatencyParams != null) {
            lyraxLowLatencyParams.setEnableLowLatencyPush(lowLatencyParams.getEnableLowLatencyPush());
            lyraxLowLatencyParams.setLlsStreamId(lowLatencyParams.getLlsStreamId());
            lyraxLowLatencyParams.setLlsStreamToken(lowLatencyParams.getLlsStreamToken());
            lyraxLowLatencyParams.setIsUsingInitialParams(lowLatencyParams.getIsUsingInitialParams());
            LyraxAudioEncoderConfig lyraxAudioEncoderConfig = new LyraxAudioEncoderConfig();
            AudioEncodeConfig llsAacEncoderConfig = lowLatencyParams.getLlsAacEncoderConfig();
            if (llsAacEncoderConfig != null) {
                lyraxAudioEncoderConfig.setCodecType(LyraxAudioCodecType.fromId(llsAacEncoderConfig.getCodecType()));
                lyraxAudioEncoderConfig.setSampleRate(LyraxAudioSampleRate.fromId(llsAacEncoderConfig.getSampleRate()));
                lyraxAudioEncoderConfig.setChannelNum(LyraxAudioChannel.fromId(llsAacEncoderConfig.getChannelNum()));
                lyraxAudioEncoderConfig.setBitrateKbps(llsAacEncoderConfig.getEncBitrate());
                lyraxAudioEncoderConfig.setAACCodecProfile(LyraxAudioAACCodecProfile.fromId(llsAacEncoderConfig.getAacCodecProfile()));
            }
            lyraxLowLatencyParams.setLlsAacEncoderConfig(lyraxAudioEncoderConfig);
            lyraxTranscoderParamDefaultLyraxTranscoderConfig.setLowLatencyParams(lyraxLowLatencyParams);
        }
        LyraxTranscoderAudioConfig lyraxTranscoderAudioConfig = new LyraxTranscoderAudioConfig();
        MixedStreamConfig.MixedStreamAudioConfig audioConfig = mixedStreamConfig.getAudioConfig();
        if (audioConfig != null) {
            lyraxTranscoderAudioConfig.setChannels(audioConfig.getChannels());
            lyraxTranscoderAudioConfig.setSampleRate(audioConfig.getSampleRate());
            lyraxTranscoderAudioConfig.setBitrateKBPS(audioConfig.getBitrate());
            lyraxTranscoderAudioConfig.setAudioCodecProfile(convertMixedStreamAudioProfile(audioConfig.getAudioProfile()));
            lyraxTranscoderAudioConfig.setAudioCodecType(LyraxTranscoderAudioCodecType.AUDIOCODEC_AAC);
            lyraxTranscoderParamDefaultLyraxTranscoderConfig.setAudioConfig(lyraxTranscoderAudioConfig);
        }
        LyraxTranscoderVideoConfig lyraxTranscoderVideoConfig = new LyraxTranscoderVideoConfig();
        MixedStreamConfig.MixedStreamVideoConfig videoConfig = mixedStreamConfig.getVideoConfig();
        if (videoConfig != null) {
            lyraxTranscoderVideoConfig.setWidth(videoConfig.getWidth());
            lyraxTranscoderVideoConfig.setHeight(videoConfig.getHeight());
            lyraxTranscoderVideoConfig.setFps(videoConfig.getFps());
            lyraxTranscoderVideoConfig.setGop(videoConfig.getGop());
            lyraxTranscoderVideoConfig.setBitrateKBPS(videoConfig.getBitrate());
            lyraxTranscoderVideoConfig.setEnableBFrame(videoConfig.getEnableBframe());
            lyraxTranscoderVideoConfig.setVideoCodecType(convertMixedStreamVideoCodec(videoConfig.getVideoCodec()));
            lyraxTranscoderVideoConfig.setUpgradeRes(mixedStreamConfig.getMixedStreamVideoConfigUpgradeWidth(), mixedStreamConfig.getMixedStreamVideoConfigUpgradeHeight());
            lyraxTranscoderVideoConfig.setRoiInfo(mixedStreamConfig.getMixedStreamVideoConfigRoiX(), mixedStreamConfig.getMixedStreamVideoConfigRoiY(), mixedStreamConfig.getMixedStreamVideoConfigRoiW(), mixedStreamConfig.getMixedStreamVideoConfigRoiH());
            if (lyraxTranscoderVideoConfig.getMinBitrateKBPS() == 0) {
                minBitrateKBPS = lyraxTranscoderVideoConfig.getBitrateKBPS();
            } else {
                minBitrateKBPS = lyraxTranscoderVideoConfig.getMinBitrateKBPS();
            }
            lyraxTranscoderVideoConfig.setMinBitrateKBPS(minBitrateKBPS);
            if (lyraxTranscoderVideoConfig.getMaxBitrateKBPS() == 0) {
                maxBitrateKBPS = lyraxTranscoderVideoConfig.getBitrateKBPS();
            } else {
                maxBitrateKBPS = lyraxTranscoderVideoConfig.getMaxBitrateKBPS();
            }
            lyraxTranscoderVideoConfig.setMaxBitrateKBPS(maxBitrateKBPS);
            lyraxTranscoderParamDefaultLyraxTranscoderConfig.setVideoConfig(lyraxTranscoderVideoConfig);
        }
        LyraxTranscoderSyncControlConfig lyraxTranscoderSyncControlConfig = new LyraxTranscoderSyncControlConfig();
        MixedStreamConfig.MixedStreamSyncControlConfig syncControlConfig = mixedStreamConfig.getSyncControlConfig();
        if (syncControlConfig != null) {
            lyraxTranscoderSyncControlConfig.setSyncStrategy(convertMixedStreamSyncStrategy(syncControlConfig.getSyncStrategy()));
            lyraxTranscoderSyncControlConfig.setMaxCacheTimeMS(syncControlConfig.getMaxCacheTimeMs());
            lyraxTranscoderSyncControlConfig.setVideoNeedSDKMix(syncControlConfig.getVideoNeedSdkMix());
            lyraxTranscoderSyncControlConfig.setBaseUserId(syncControlConfig.getBaseUserID());
            lyraxTranscoderParamDefaultLyraxTranscoderConfig.setSyncControlConfig(lyraxTranscoderSyncControlConfig);
        }
        LyraxTranscoderServerControlConfig lyraxTranscoderServerControlConfig = new LyraxTranscoderServerControlConfig();
        MixedStreamConfig.MixedStreamServerControlConfig serverControlConfig = mixedStreamConfig.getServerControlConfig();
        if (serverControlConfig != null) {
            lyraxTranscoderServerControlConfig.setEnableVolumeIndication(serverControlConfig.getEnableVolumeIndication());
            lyraxTranscoderServerControlConfig.setVolumeIndicationInterval(serverControlConfig.getVolumeIndicationInterval());
            int[] talkVolumeLevels = serverControlConfig.getTalkVolumeLevels();
            if (talkVolumeLevels != null && talkVolumeLevels.length > 0) {
                int[] iArr = new int[talkVolumeLevels.length];
                for (int i = 0; i < talkVolumeLevels.length; i++) {
                    iArr[i] = talkVolumeLevels[i];
                }
                lyraxTranscoderServerControlConfig.setTalkVolumeLevels(iArr);
            } else {
                lyraxTranscoderServerControlConfig.setTalkVolumeLevels(new int[0]);
            }
            lyraxTranscoderServerControlConfig.setAddVolumeValue(serverControlConfig.getIsAddVolumeValue());
            lyraxTranscoderServerControlConfig.setAsrTaskMode(LyraxTranscoderAsrTaskMode.fromValue(serverControlConfig.getAsrTaskMode().getValue()));
            lyraxTranscoderParamDefaultLyraxTranscoderConfig.setServerControlConfig(lyraxTranscoderServerControlConfig);
        }
        LyraxTranscoderSpatialAudioConfig lyraxTranscoderSpatialAudioConfig = new LyraxTranscoderSpatialAudioConfig();
        MixedStreamConfig.MixedStreamSpatialConfig spatialConfig = mixedStreamConfig.getSpatialConfig();
        if (spatialConfig != null) {
            lyraxTranscoderSpatialAudioConfig.setEnableSpatialRender(spatialConfig.getEnableSpatialRender());
            LyraxTranscoderPosition lyraxTranscoderPosition = new LyraxTranscoderPosition(0.0f, 0.0f, 0.0f);
            Position audienceSpatialPosition = spatialConfig.getAudienceSpatialPosition();
            if (audienceSpatialPosition != null) {
                lyraxTranscoderSpatialAudioConfig.setAudienceSpatialPosition(new LyraxTranscoderPosition(audienceSpatialPosition.x, audienceSpatialPosition.y, audienceSpatialPosition.z));
            }
            lyraxTranscoderSpatialAudioConfig.setAudienceSpatialPosition(lyraxTranscoderPosition);
            LyraxTranscoderHumanOrientation lyraxTranscoderHumanOrientation = new LyraxTranscoderHumanOrientation(new LyraxTranscoderOrientation(1.0f, 0.0f, 0.0f), new LyraxTranscoderOrientation(0.0f, 1.0f, 0.0f), new LyraxTranscoderOrientation(0.0f, 0.0f, 1.0f));
            HumanOrientation audienceSpatialOrientation = spatialConfig.getAudienceSpatialOrientation();
            if (audienceSpatialOrientation != null) {
                Orientation orientation = audienceSpatialOrientation.forward;
                if (orientation != null) {
                    lyraxTranscoderHumanOrientation.setForward(new LyraxTranscoderOrientation(orientation.x, orientation.y, orientation.z));
                }
                Orientation orientation2 = audienceSpatialOrientation.up;
                if (orientation2 != null) {
                    lyraxTranscoderHumanOrientation.setUp(new LyraxTranscoderOrientation(orientation2.x, orientation2.y, orientation2.z));
                }
                Orientation orientation3 = audienceSpatialOrientation.right;
                if (orientation3 != null) {
                    lyraxTranscoderHumanOrientation.setRight(new LyraxTranscoderOrientation(orientation3.x, orientation3.y, orientation3.z));
                }
            }
            lyraxTranscoderSpatialAudioConfig.setAudienceSpatialOrientation(lyraxTranscoderHumanOrientation);
            lyraxTranscoderParamDefaultLyraxTranscoderConfig.setSpatialAudioConfig(lyraxTranscoderSpatialAudioConfig);
        }
        LyraxTranscoderLayoutConfig lyraxTranscoderLayoutConfig = new LyraxTranscoderLayoutConfig();
        MixedStreamConfig.MixedStreamLayoutConfig layout = mixedStreamConfig.getLayout();
        if (layout != null) {
            lyraxTranscoderLayoutConfig.setBackgroundColor(layout.getBackgroundColor());
            lyraxTranscoderLayoutConfig.setBackgroundImageUrl(layout.getBackgroundImage());
            lyraxTranscoderLayoutConfig.setAppdataSEIMode(convertMixedStreamAppdataSEIMode(layout.getAppdataSEIMode()));
            lyraxTranscoderLayoutConfig.setBackgroundImageRenderMode(convertMixedStreamBackGroundImageRenderMode(layout.getBackGroundImageRenderMode()));
            lyraxTranscoderLayoutConfig.setAnimationId(mixedStreamConfig.getMixedStreamLayoutAnimationId());
            lyraxTranscoderLayoutConfig.setAnimationPath(mixedStreamConfig.getMixedStreamLayoutAnimationPath());
            lyraxTranscoderLayoutConfig.setFlashColor(mixedStreamConfig.getMixedStreamLayoutFlashColor());
            createLyrxatranscoderLayoutRegion(layout.getRegions(), lyraxTranscoderLayoutConfig, LyraxLayoutRegionType.LyraxLayoutRegionTypeNormal);
            createLyrxatranscoderLayoutRegion(layout.getBeforeRegions(), lyraxTranscoderLayoutConfig, LyraxLayoutRegionType.LyraxLayoutRegionTypeBefore);
            lyraxTranscoderLayoutConfig.setAppData(layout.getUserConfigExtraInfo());
            lyraxTranscoderLayoutConfig.setDanceVideoId(layout.getDanceVideoId());
            lyraxTranscoderLayoutConfig.setDanceVideoStartNtpTime(layout.getDanceVideoStartNtpTime());
            lyraxTranscoderParamDefaultLyraxTranscoderConfig.setLayoutConfig(lyraxTranscoderLayoutConfig);
        }
        lyraxTranscoderParamDefaultLyraxTranscoderConfig.setFeatureConfigs(createLyraxtranscoderFeatureConfigs(mixedStreamConfig.getFeatureConfigs()));
        return lyraxTranscoderParamDefaultLyraxTranscoderConfig;
    }

    public static LyraxTranscoderFeaturesConfig createLyraxtranscoderFeatureConfigs(List<MixedStreamConfig.MixedStreamFeatureConfig> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return new LyraxTranscoderFeaturesConfig(arrayList);
        }
        for (MixedStreamConfig.MixedStreamFeatureConfig mixedStreamFeatureConfig : list) {
            if (mixedStreamFeatureConfig != null) {
                arrayList.add(new LyraxTranscoderFeature(mixedStreamFeatureConfig.getFeatureName(), mixedStreamFeatureConfig.getProjectKey(), mixedStreamFeatureConfig.getOptions()));
            }
        }
        return new LyraxTranscoderFeaturesConfig(arrayList);
    }

    public static boolean checkMixedStreamConfigValid(MixedStreamConfig mixedStreamConfig, StringBuilder sb) {
        if (mixedStreamConfig == null) {
            sb.append("MixedStreamConfig is null");
            return false;
        }
        if (mixedStreamConfig.getTranscodeMessage() == null) {
            sb.append("parse transcoder json message failed");
            return false;
        }
        return true;
    }

    public static void createLyrxatranscoderLayoutRegion(MixedStreamConfig.MixedStreamLayoutRegionConfig[] mixedStreamLayoutRegionConfigArr, LyraxTranscoderLayoutConfig lyraxTranscoderLayoutConfig, LyraxLayoutRegionType lyraxLayoutRegionType) {
        if (mixedStreamLayoutRegionConfigArr != null && mixedStreamLayoutRegionConfigArr.length > 0) {
            LyraxTranscoderLayoutRegionConfig[] lyraxTranscoderLayoutRegionConfigArr = new LyraxTranscoderLayoutRegionConfig[mixedStreamLayoutRegionConfigArr.length];
            for (int i = 0; i < mixedStreamLayoutRegionConfigArr.length; i++) {
                LyraxTranscoderLayoutRegionConfig lyraxTranscoderLayoutRegionConfig = new LyraxTranscoderLayoutRegionConfig();
                lyraxTranscoderLayoutRegionConfig.setUserId(mixedStreamLayoutRegionConfigArr[i].getUserID());
                lyraxTranscoderLayoutRegionConfig.setRoomId(mixedStreamLayoutRegionConfigArr[i].getRoomID());
                lyraxTranscoderLayoutRegionConfig.setWinId(mixedStreamLayoutRegionConfigArr[i].getWinID());
                lyraxTranscoderLayoutRegionConfig.setLocationX((float) mixedStreamLayoutRegionConfigArr[i].getLocationX());
                lyraxTranscoderLayoutRegionConfig.setLocationY((float) mixedStreamLayoutRegionConfigArr[i].getLocationY());
                lyraxTranscoderLayoutRegionConfig.setWidthProportion((float) mixedStreamLayoutRegionConfigArr[i].getWidthProportion());
                lyraxTranscoderLayoutRegionConfig.setHeightProportion((float) mixedStreamLayoutRegionConfigArr[i].getHeightProportion());
                lyraxTranscoderLayoutRegionConfig.setAlpha((float) mixedStreamLayoutRegionConfigArr[i].getAlpha());
                lyraxTranscoderLayoutRegionConfig.setCornerRadius((float) mixedStreamLayoutRegionConfigArr[i].getCornerRadius());
                lyraxTranscoderLayoutRegionConfig.setzOrder(mixedStreamLayoutRegionConfigArr[i].getZOrder());
                lyraxTranscoderLayoutRegionConfig.setMediaType(convertMixedStreamMediaType(mixedStreamLayoutRegionConfigArr[i].getMediaType()));
                lyraxTranscoderLayoutRegionConfig.setRenderMode(convertMixedStreamRenderMode(mixedStreamLayoutRegionConfigArr[i].getRenderMode()));
                lyraxTranscoderLayoutRegionConfig.setLocalUser(mixedStreamLayoutRegionConfigArr[i].getIsLocalUser());
                lyraxTranscoderLayoutRegionConfig.setStreamIndex(convertStreamIndex(mixedStreamLayoutRegionConfigArr[i].getStreamIndex()));
                lyraxTranscoderLayoutRegionConfig.setRegionContentType(convertMixedStreamLayoutRegionType(mixedStreamLayoutRegionConfigArr[i].getRegionContentType()));
                lyraxTranscoderLayoutRegionConfig.setAlternateImageUrl(mixedStreamLayoutRegionConfigArr[i].getAlternateImageUrl());
                MixedStreamConfig.AlternateImageProcess alternateImageProcess = mixedStreamLayoutRegionConfigArr[i].getAlternateImageProcess();
                LyraxTranscoderLayoutRegionAlternateImageProcessConfig lyraxTranscoderLayoutRegionAlternateImageProcessConfig = new LyraxTranscoderLayoutRegionAlternateImageProcessConfig();
                if (alternateImageProcess == MixedStreamConfig.AlternateImageProcess.ALTERNATE_IMAGE_PROCESS_CONFIG) {
                    MixedStreamConfig.AlternateImageProcessConfig alternateImageProcessConfig = mixedStreamLayoutRegionConfigArr[i].getAlternateImageProcessConfig();
                    if (alternateImageProcessConfig != null) {
                        lyraxTranscoderLayoutRegionAlternateImageProcessConfig.setBlur(alternateImageProcessConfig.getBlur());
                        lyraxTranscoderLayoutRegionAlternateImageProcessConfig.setBrightness(alternateImageProcessConfig.getBrightness());
                    }
                } else if (alternateImageProcess == MixedStreamConfig.AlternateImageProcess.ALTERNATE_IMAGE_PROCESS_GAUSSIAN) {
                    lyraxTranscoderLayoutRegionAlternateImageProcessConfig.setBlur(mixedStreamLayoutRegionConfigArr[i].getAlternateImageProcessValue());
                    lyraxTranscoderLayoutRegionAlternateImageProcessConfig.setBrightness(0.0f);
                } else {
                    lyraxTranscoderLayoutRegionAlternateImageProcessConfig.setBlur(0);
                    lyraxTranscoderLayoutRegionAlternateImageProcessConfig.setBrightness(0.0f);
                }
                lyraxTranscoderLayoutRegionConfig.setAlternateImageProcessConfig(lyraxTranscoderLayoutRegionAlternateImageProcessConfig);
                Position spatialPosition = mixedStreamLayoutRegionConfigArr[i].getSpatialPosition();
                if (spatialPosition != null) {
                    lyraxTranscoderLayoutRegionConfig.setSpatialPosition(new LyraxTranscoderPosition(spatialPosition.x, spatialPosition.y, spatialPosition.z));
                }
                MixedStreamConfig.SourceCropInfo sourceCropInfo = mixedStreamLayoutRegionConfigArr[i].getSourceCropInfo();
                if (sourceCropInfo != null) {
                    LyraxTranscoderSourceCrop lyraxTranscoderSourceCrop = new LyraxTranscoderSourceCrop();
                    lyraxTranscoderSourceCrop.setLocationX(sourceCropInfo.getLocationX());
                    lyraxTranscoderSourceCrop.setLocationY(sourceCropInfo.getLocationY());
                    lyraxTranscoderSourceCrop.setWidthProportion(sourceCropInfo.getWidthProportion());
                    lyraxTranscoderSourceCrop.setHeightProportion(sourceCropInfo.getHeightProportion());
                    lyraxTranscoderLayoutRegionConfig.setSourceCrop(lyraxTranscoderSourceCrop);
                }
                lyraxTranscoderLayoutRegionConfig.setApplySpatialAudio(mixedStreamLayoutRegionConfigArr[i].getApplySpatialAudio());
                lyraxTranscoderLayoutRegionConfig.setApplySpatialReverb(mixedStreamLayoutRegionConfigArr[i].getApplySpatialReverb());
                lyraxTranscoderLayoutRegionConfigArr[i] = lyraxTranscoderLayoutRegionConfig;
                if (mixedStreamLayoutRegionConfigArr[i].getEffectDescription() != null) {
                    MixedStreamConfig.MixedStreamEffectDescription[] effectDescription = mixedStreamLayoutRegionConfigArr[i].getEffectDescription();
                    LyraxTranscoderEffectDescription[] lyraxTranscoderEffectDescriptionArr = new LyraxTranscoderEffectDescription[effectDescription.length];
                    for (int i2 = 0; i2 < effectDescription.length; i2++) {
                        LyraxTranscoderEffectType lyraxTranscoderEffectTypeFromValue = LyraxTranscoderEffectType.fromValue(effectDescription[i2].getEffectType().getValue());
                        MixedStreamConfig.MixedStreamEffectParam effectParam = effectDescription[i2].getEffectParam();
                        LyraxTranscoderEffectParam lyraxTranscoderEffectParam = new LyraxTranscoderEffectParam(effectParam.getColor(), effectParam.getThickness());
                        lyraxTranscoderEffectParam.setEnableWordMuting(effectParam.isEnableWordMuting());
                        lyraxTranscoderEffectParam.setEnableSegmentStore(effectParam.isEnableSegmentStore());
                        lyraxTranscoderEffectParam.setEnableSdkCallback(effectParam.isEnableSdkCallback());
                        lyraxTranscoderEffectParam.setEnable(effectParam.isEnable());
                        lyraxTranscoderEffectDescriptionArr[i2] = new LyraxTranscoderEffectDescription(lyraxTranscoderEffectTypeFromValue, lyraxTranscoderEffectParam);
                    }
                    lyraxTranscoderLayoutRegionConfig.setEffectDescriptions(lyraxTranscoderEffectDescriptionArr);
                }
            }
            if (lyraxLayoutRegionType == LyraxLayoutRegionType.LyraxLayoutRegionTypeBefore) {
                lyraxTranscoderLayoutConfig.setLayoutBeforeRegionConfigs(lyraxTranscoderLayoutRegionConfigArr);
            } else {
                lyraxTranscoderLayoutConfig.setLayoutRegionConfigs(lyraxTranscoderLayoutRegionConfigArr);
            }
        }
    }
}
