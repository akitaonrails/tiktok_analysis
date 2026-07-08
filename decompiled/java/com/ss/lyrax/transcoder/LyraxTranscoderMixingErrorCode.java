package com.ss.lyrax.transcoder;

import X.C08FF;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxTranscoderMixingErrorCode {
    OK(0),
    BASE(1090),
    INVALID_PARAM(1091),
    INVALID_STATE(1092),
    INVALID_OPERATOR(1093),
    TIMEOUT(1094),
    INVALID_PARAM_BY_SERVER(1095),
    SUB_TIMEOUT_BY_SERVER(1096),
    INVALID_STATE_BY_SERVER(1097),
    AUTHENTICATION_BY_CDN(1098),
    TIMEOUT_BY_SIGNALING(1099),
    MIX_IMAGE_FAIL(1100),
    UNKNOW_ERROR_BY_SERVER(1101),
    STREAM_SYNC_WORSE(1102),
    ALTERNATE_IMAGE_SUCCEEDED(1105),
    ALTERNATE_IMAGE_FAILED(1106),
    BACKGROUND_SUCCEEDED(1107),
    BACKGROUND_FAILED(1108),
    AGENT_INVALID_STATE_BY_SERVER(1109),
    AGENT_ASR_ERROR(1110),
    AGENT_LLM_ERROR(1111),
    AGENT_TTS_ERROR(1112),
    AGENT_DIGITAL_HUMAN_ERROR(1113),
    AGENT_OTHER_ERROR(1130),
    MAX(1199);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.transcoder.LyraxTranscoderMixingErrorCode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode;

        static {
            int[] iArr = new int[LyraxTranscoderMixingErrorCode.values().length];
            $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode = iArr;
            try {
                iArr[LyraxTranscoderMixingErrorCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.BASE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.INVALID_PARAM.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.INVALID_STATE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.INVALID_OPERATOR.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.TIMEOUT.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.INVALID_PARAM_BY_SERVER.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.SUB_TIMEOUT_BY_SERVER.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.INVALID_STATE_BY_SERVER.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.AUTHENTICATION_BY_CDN.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.TIMEOUT_BY_SIGNALING.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
                TryCatchGuardChecker.doCheck(e11);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.MIX_IMAGE_FAIL.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
                TryCatchGuardChecker.doCheck(e12);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.UNKNOW_ERROR_BY_SERVER.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
                TryCatchGuardChecker.doCheck(e13);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.STREAM_SYNC_WORSE.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
                TryCatchGuardChecker.doCheck(e14);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.MAX.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
                TryCatchGuardChecker.doCheck(e15);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.ALTERNATE_IMAGE_SUCCEEDED.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
                TryCatchGuardChecker.doCheck(e16);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.ALTERNATE_IMAGE_FAILED.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
                TryCatchGuardChecker.doCheck(e17);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.BACKGROUND_SUCCEEDED.ordinal()] = 18;
            } catch (NoSuchFieldError e18) {
                TryCatchGuardChecker.doCheck(e18);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.BACKGROUND_FAILED.ordinal()] = 19;
            } catch (NoSuchFieldError e19) {
                TryCatchGuardChecker.doCheck(e19);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.AGENT_INVALID_STATE_BY_SERVER.ordinal()] = 20;
            } catch (NoSuchFieldError e20) {
                TryCatchGuardChecker.doCheck(e20);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.AGENT_ASR_ERROR.ordinal()] = 21;
            } catch (NoSuchFieldError e21) {
                TryCatchGuardChecker.doCheck(e21);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.AGENT_LLM_ERROR.ordinal()] = 22;
            } catch (NoSuchFieldError e22) {
                TryCatchGuardChecker.doCheck(e22);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.AGENT_TTS_ERROR.ordinal()] = 23;
            } catch (NoSuchFieldError e23) {
                TryCatchGuardChecker.doCheck(e23);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.AGENT_DIGITAL_HUMAN_ERROR.ordinal()] = 24;
            } catch (NoSuchFieldError e24) {
                TryCatchGuardChecker.doCheck(e24);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[LyraxTranscoderMixingErrorCode.AGENT_OTHER_ERROR.ordinal()] = 25;
            } catch (NoSuchFieldError e25) {
                TryCatchGuardChecker.doCheck(e25);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingErrorCode[ordinal()]) {
            case 1:
                return "TRANSCODER_ERROR_OK";
            case 2:
                return "TRANSCODER_ERROR_BASE";
            case 3:
                return "TRANSCODER_ERROR_INVALID_PARAM";
            case 4:
                return "TRANSCODER_ERROR_INVALID_STATE";
            case 5:
                return "TRANSCODER_ERROR_INVALID_OPERATOR";
            case 6:
                return "TRANSCODER_ERROR_TIMEOUT";
            case 7:
                return "TRANSCODER_ERROR_INVALID_PARAM_BY_SERVER";
            case 8:
                return "TRANSCODER_ERROR_SUB_TIMEOUT_BY_SERVER";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "TRANSCODER_ERROR_INVALID_STATE_BY_SERVER";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "TRANSCODER_ERROR_AUTHENTICATION_BY_CDN";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "TRANSCODER_ERROR_TIMEOUT_BY_SIGNALING";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "TRANSCODER_ERROR_MIX_IMAGE_FAIL";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "TRANSCODER_ERROR_UNKNOW_ERROR_BY_SERVER";
            case 14:
                return "TRANSCODER_ERROR_STREAM_SYNC_WORSE";
            case 15:
                return "TRANSCODER_ERROR_MAX";
            case 16:
                return "TRANSCODER_ERROR_ALTERNATE_IMAGE_SUCCEEDED";
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return "TRANSCODER_ERROR_ALTERNATE_IMAGE_FAILED";
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return "TRANSCODER_ERROR_BACKGROUND_SUCCEEDED";
            case 19:
                return "TRANSCODER_ERROR_BACKGROUND_FAILED";
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return "TRANSCODER_ERROR_AGENT_INVALID_STATE_BY_SERVER";
            case 21:
                return "TRANSCODER_ERROR_AGENT_ASR_ERROR";
            case 22:
                return "TRANSCODER_ERROR_AGENT_LLM_ERROR";
            case 23:
                return "TRANSCODER_ERROR_AGENT_TTS_ERROR";
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return "TRANSCODER_ERROR_AGENT_DIGITAL_HUMAN_ERROR";
            case 25:
                return "TRANSCODER_ERROR_AGENT_OTHER_ERROR";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }

    public static LyraxTranscoderMixingErrorCode fromId(int i) {
        for (LyraxTranscoderMixingErrorCode lyraxTranscoderMixingErrorCode : values()) {
            if (lyraxTranscoderMixingErrorCode.value() == i) {
                return lyraxTranscoderMixingErrorCode;
            }
        }
        return OK;
    }

    public static LyraxTranscoderMixingErrorCode valueOf(String str) {
        return (LyraxTranscoderMixingErrorCode) C08FF.LIZ(LyraxTranscoderMixingErrorCode.class, str);
    }

    LyraxTranscoderMixingErrorCode(int i) {
        this.value = i;
    }
}
