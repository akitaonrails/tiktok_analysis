package com.ss.lyrax.transcoder;

import X.C08FF;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxTranscoderMixingEvent {
    STREAM_MIXING_BASE(0),
    STREAM_MIXING_START(1),
    STREAM_MIXING_START_SUCCESS(2),
    STREAM_MIXING_START_FAILED(3),
    STREAM_MIXING_UPDATE(4),
    STREAM_MIXING_UPDATE_SUCCESS(5),
    STREAM_MIXING_UPDATE_FAILED(6),
    STREAM_MIXING_STOP(7),
    STREAM_MIXING_STOP_SUCCESS(8),
    STREAM_MIXING_STOP_FAILED(9),
    STREAM_MIXING_CHANGE_MIX_TYPE(10),
    STREAM_MIXING_FIRST_AUDIO_FRAME_BY_CLIENT_MIX(11),
    STREAM_MIXING_FIRST_VIDEO_FRAME_BY_CLIENT_MIX(12),
    STREAM_MIXING_UPDATE_TIMEOUT(13),
    STREAM_MIXING_START_TIMEOUT(14),
    STREAM_MIXING_REQUEST_PARAM_ERROR(15),
    STREAM_MIXING_MIX_IMAGE_EVENT(16),
    STREAM_MIXING_SINGLE_CHORUS_EVENT(17),
    STREAM_MIXING_MAX(18),
    STREAM_MIXING_ALTERNATE_IMAGE_SUCCEED(19),
    STREAM_MIXING_ALTERNATE_IMAGE_FAILED(20),
    STREAM_MIXING_BACKGROUND_URL_SUCCEED(21),
    STREAM_MIXING_BACKGROUND_URL_FAILED(22),
    STREAM_MIXING_AUDIO_PROFANITY_DETECTED_EVENT(23),
    STREAM_MIXING_AGENT_START_EVENT(24),
    STREAM_MIXING_AGENT_UPDATE_EVENT(25),
    STREAM_MIXING_AGENT_STOP_EVENT(26),
    STREAM_MIXING_AGENT_ERROR_EVENT(27);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.transcoder.LyraxTranscoderMixingEvent$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent;

        static {
            int[] iArr = new int[LyraxTranscoderMixingEvent.values().length];
            $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent = iArr;
            try {
                iArr[LyraxTranscoderMixingEvent.STREAM_MIXING_BASE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_START.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_START_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_START_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_UPDATE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_UPDATE_SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_UPDATE_FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_STOP.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_STOP_SUCCESS.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_STOP_FAILED.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_CHANGE_MIX_TYPE.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
                TryCatchGuardChecker.doCheck(e11);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_FIRST_AUDIO_FRAME_BY_CLIENT_MIX.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
                TryCatchGuardChecker.doCheck(e12);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_FIRST_VIDEO_FRAME_BY_CLIENT_MIX.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
                TryCatchGuardChecker.doCheck(e13);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_UPDATE_TIMEOUT.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
                TryCatchGuardChecker.doCheck(e14);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_START_TIMEOUT.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
                TryCatchGuardChecker.doCheck(e15);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_REQUEST_PARAM_ERROR.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
                TryCatchGuardChecker.doCheck(e16);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_MIX_IMAGE_EVENT.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
                TryCatchGuardChecker.doCheck(e17);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_SINGLE_CHORUS_EVENT.ordinal()] = 18;
            } catch (NoSuchFieldError e18) {
                TryCatchGuardChecker.doCheck(e18);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_MAX.ordinal()] = 19;
            } catch (NoSuchFieldError e19) {
                TryCatchGuardChecker.doCheck(e19);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_ALTERNATE_IMAGE_SUCCEED.ordinal()] = 20;
            } catch (NoSuchFieldError e20) {
                TryCatchGuardChecker.doCheck(e20);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_ALTERNATE_IMAGE_FAILED.ordinal()] = 21;
            } catch (NoSuchFieldError e21) {
                TryCatchGuardChecker.doCheck(e21);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_BACKGROUND_URL_SUCCEED.ordinal()] = 22;
            } catch (NoSuchFieldError e22) {
                TryCatchGuardChecker.doCheck(e22);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_BACKGROUND_URL_FAILED.ordinal()] = 23;
            } catch (NoSuchFieldError e23) {
                TryCatchGuardChecker.doCheck(e23);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_AUDIO_PROFANITY_DETECTED_EVENT.ordinal()] = 24;
            } catch (NoSuchFieldError e24) {
                TryCatchGuardChecker.doCheck(e24);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_AGENT_START_EVENT.ordinal()] = 25;
            } catch (NoSuchFieldError e25) {
                TryCatchGuardChecker.doCheck(e25);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_AGENT_UPDATE_EVENT.ordinal()] = 26;
            } catch (NoSuchFieldError e26) {
                TryCatchGuardChecker.doCheck(e26);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_AGENT_STOP_EVENT.ordinal()] = 27;
            } catch (NoSuchFieldError e27) {
                TryCatchGuardChecker.doCheck(e27);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[LyraxTranscoderMixingEvent.STREAM_MIXING_AGENT_ERROR_EVENT.ordinal()] = 28;
            } catch (NoSuchFieldError e28) {
                TryCatchGuardChecker.doCheck(e28);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderMixingEvent[ordinal()]) {
            case 1:
                return "STREAM_MIXING_BASE";
            case 2:
                return "STREAM_MIXING_START";
            case 3:
                return "STREAM_MIXING_START_SUCCESS";
            case 4:
                return "STREAM_MIXING_START_FAILED";
            case 5:
                return "STREAM_MIXING_UPDATE";
            case 6:
                return "STREAM_MIXING_UPDATE_SUCCESS";
            case 7:
                return "STREAM_MIXING_UPDATE_FAILED";
            case 8:
                return "STREAM_MIXING_STOP";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "STREAM_MIXING_STOP_SUCCESS";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "STREAM_MIXING_STOP_FAILED";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "STREAM_MIXING_CHANGE_MIX_TYPE";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "STREAM_MIXING_FIRST_AUDIO_FRAME_BY_CLIENT_MIX";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "STREAM_MIXING_FIRST_VIDEO_FRAME_BY_CLIENT_MIX";
            case 14:
                return "STREAM_MIXING_UPDATE_TIMEOUT";
            case 15:
                return "STREAM_MIXING_START_TIMEOUT";
            case 16:
                return "STREAM_MIXING_REQUEST_PARAM_ERROR";
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return "STREAM_MIXING_MIX_IMAGE_EVENT";
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return "STREAM_MIXING_SINGLE_CHORUS_EVENT";
            case 19:
                return "STREAM_MIXING_MAX";
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return "STREAM_MIXING_ALTERNATE_IMAGE_SUCCEED";
            case 21:
                return "STREAM_MIXING_ALTERNATE_IMAGE_FAILED";
            case 22:
                return "STREAM_MIXING_BACKGROUND_URL_SUCCEED";
            case 23:
                return "STREAM_MIXING_BACKGROUND_URL_FAILED";
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return "STREAM_MIXING_AUDIO_PROFANITY_DETECTED_EVENT";
            case 25:
                return "STREAM_MIXING_AGENT_START_EVENT";
            case 26:
                return "STREAM_MIXING_AGENT_UPDATE_EVENT";
            case 27:
                return "STREAM_MIXING_AGENT_STOP_EVENT";
            case 28:
                return "STREAM_MIXING_AGENT_ERROR_EVENT";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }

    public static LyraxTranscoderMixingEvent fromId(int i) {
        for (LyraxTranscoderMixingEvent lyraxTranscoderMixingEvent : values()) {
            if (lyraxTranscoderMixingEvent.value() == i) {
                return lyraxTranscoderMixingEvent;
            }
        }
        return null;
    }

    public static LyraxTranscoderMixingEvent valueOf(String str) {
        return (LyraxTranscoderMixingEvent) C08FF.LIZ(LyraxTranscoderMixingEvent.class, str);
    }

    LyraxTranscoderMixingEvent(int i) {
        this.value = i;
    }
}
