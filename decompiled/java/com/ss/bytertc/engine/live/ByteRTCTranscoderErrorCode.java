package com.ss.bytertc.engine.live;

import X.C08FF;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes21.dex */
public enum ByteRTCTranscoderErrorCode {
    TRANSCODER_ERROR_OK(0),
    TRANSCODER_ERROR_BASE(1090),
    TRANSCODER_ERROR_INVALID_PARAM(1091),
    TRANSCODER_ERROR_INVALID_STATE(1092),
    TRANSCODER_ERROR_INVALID_OPERATOR(1093),
    TRANSCODER_ERROR_TIMEOUT(1094),
    TRANSCODER_ERROR_INVALID_PARAM_BY_SERVER(1095),
    TRANSCODER_ERROR_SUB_TIMEOUT_BY_SERVER(1096),
    TRANSCODER_ERROR_INVALID_STATE_BY_SERVER(1097),
    TRANSCODER_ERROR_AUTHENTICATION_BY_CDN(1098),
    TRANSCODER_ERROR_TIMEOUT_BY_SIGNALING(1099),
    TRANSCODER_ERROR_MIX_IMAGE_FAIL(1100),
    TRANSCODER_ERROR_UNKNOW_ERROR_BY_SERVER(1101),
    TRANSCODER_ERROR_STREAM_SYNC_WORSE(1102),
    TRANSCODER_ERROR_ALTERNATE_IMAGE_SUCCEEDED(1105),
    TRANSCODER_ERROR_ALTERNATE_IMAGE_FAILED(1106),
    TRANSCODER_ERROR_BACKGROUND_SUCCEEDED(1107),
    TRANSCODER_ERROR_BACKGROUND_FAILED(1108),
    TRANSCODER_ERROR_MAX(1199);

    public int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.live.ByteRTCTranscoderErrorCode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode;

        static {
            int[] iArr = new int[ByteRTCTranscoderErrorCode.values().length];
            $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode = iArr;
            try {
                iArr[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_OK.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_BASE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_INVALID_PARAM.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_INVALID_STATE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_INVALID_OPERATOR.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_TIMEOUT.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_INVALID_PARAM_BY_SERVER.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_SUB_TIMEOUT_BY_SERVER.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_INVALID_STATE_BY_SERVER.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_AUTHENTICATION_BY_CDN.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_TIMEOUT_BY_SIGNALING.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
                TryCatchGuardChecker.doCheck(e11);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_MIX_IMAGE_FAIL.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
                TryCatchGuardChecker.doCheck(e12);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_UNKNOW_ERROR_BY_SERVER.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
                TryCatchGuardChecker.doCheck(e13);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_STREAM_SYNC_WORSE.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
                TryCatchGuardChecker.doCheck(e14);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_MAX.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
                TryCatchGuardChecker.doCheck(e15);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_ALTERNATE_IMAGE_SUCCEEDED.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
                TryCatchGuardChecker.doCheck(e16);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_ALTERNATE_IMAGE_FAILED.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
                TryCatchGuardChecker.doCheck(e17);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_BACKGROUND_SUCCEEDED.ordinal()] = 18;
            } catch (NoSuchFieldError e18) {
                TryCatchGuardChecker.doCheck(e18);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_BACKGROUND_FAILED.ordinal()] = 19;
            } catch (NoSuchFieldError e19) {
                TryCatchGuardChecker.doCheck(e19);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ordinal()]) {
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
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }

    public static ByteRTCTranscoderErrorCode fromId(int i) {
        for (ByteRTCTranscoderErrorCode byteRTCTranscoderErrorCode : values()) {
            if (byteRTCTranscoderErrorCode.value() == i) {
                return byteRTCTranscoderErrorCode;
            }
        }
        return null;
    }

    public static ByteRTCTranscoderErrorCode valueOf(String str) {
        return (ByteRTCTranscoderErrorCode) C08FF.LIZ(ByteRTCTranscoderErrorCode.class, str);
    }

    ByteRTCTranscoderErrorCode(int i) {
        this.value = i;
    }
}
