package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes36.dex */
public enum LyraxAudioOptionKey {
    UNKNOWN(-1),
    LOCAL_VOLUME(0),
    ENABLE_LOCAL_AUDIO(1),
    ENABLE_HANDS_FREE_EAR_MONITOR(3),
    ENABLE_AUDIO_SESSION_DEACTIVE(5),
    UI_AEC_OPTION(9),
    ENABLE_HW_EAR_MONITOR(15),
    SET_HW_EAR_MONITOR_EFFECT(16),
    SET_HW_EAR_MONITOR_EQUALIZER(17),
    SET_HW_EAR_MONITOR_VOLUME(24),
    ANDROID_RECORD_MEDIA_MODE_MIC_SOURCE(25),
    SET_SW_EAR_MONITOR_VOLUME(35),
    ENABLE_LOUNDNORM(38),
    ENABLE_SW_EAR_MONITOR(41),
    ENABLE_EXTERNAL_SOUNDCARD(43),
    UI_AGC_OPTION(57),
    SET_SERVER_CONFIGURE(110),
    SET_AUDIO_INPUT_MIX_SPECIFY_SRC_DRIVE_MIX(112),
    ENABLE_AUDIO_CODEC_SWITCH_FLUSH(113),
    AUDIO_ENCODER_COMPLEXITY_LEVEL(114),
    ENABLE_RENDER_PERFORMANCE_OPTIMIZE(115),
    STOP_RENDER_PROCESS_DELAY_MS(116),
    ENABLE_APM(122);

    public final int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxAudioOptionKey$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey;

        static {
            int[] iArr = new int[LyraxAudioOptionKey.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey = iArr;
            try {
                iArr[LyraxAudioOptionKey.LOCAL_VOLUME.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[LyraxAudioOptionKey.ENABLE_LOCAL_AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[LyraxAudioOptionKey.ENABLE_HANDS_FREE_EAR_MONITOR.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[LyraxAudioOptionKey.ENABLE_AUDIO_SESSION_DEACTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[LyraxAudioOptionKey.UI_AEC_OPTION.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[LyraxAudioOptionKey.ENABLE_HW_EAR_MONITOR.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[LyraxAudioOptionKey.SET_HW_EAR_MONITOR_EFFECT.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[LyraxAudioOptionKey.SET_HW_EAR_MONITOR_EQUALIZER.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[LyraxAudioOptionKey.SET_HW_EAR_MONITOR_VOLUME.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[LyraxAudioOptionKey.ANDROID_RECORD_MEDIA_MODE_MIC_SOURCE.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[LyraxAudioOptionKey.SET_SW_EAR_MONITOR_VOLUME.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
                TryCatchGuardChecker.doCheck(e11);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[LyraxAudioOptionKey.ENABLE_LOUNDNORM.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
                TryCatchGuardChecker.doCheck(e12);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[LyraxAudioOptionKey.ENABLE_SW_EAR_MONITOR.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
                TryCatchGuardChecker.doCheck(e13);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[LyraxAudioOptionKey.ENABLE_EXTERNAL_SOUNDCARD.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
                TryCatchGuardChecker.doCheck(e14);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[LyraxAudioOptionKey.UI_AGC_OPTION.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
                TryCatchGuardChecker.doCheck(e15);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[LyraxAudioOptionKey.SET_SERVER_CONFIGURE.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
                TryCatchGuardChecker.doCheck(e16);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[LyraxAudioOptionKey.SET_AUDIO_INPUT_MIX_SPECIFY_SRC_DRIVE_MIX.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
                TryCatchGuardChecker.doCheck(e17);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[LyraxAudioOptionKey.ENABLE_AUDIO_CODEC_SWITCH_FLUSH.ordinal()] = 18;
            } catch (NoSuchFieldError e18) {
                TryCatchGuardChecker.doCheck(e18);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[LyraxAudioOptionKey.AUDIO_ENCODER_COMPLEXITY_LEVEL.ordinal()] = 19;
            } catch (NoSuchFieldError e19) {
                TryCatchGuardChecker.doCheck(e19);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[LyraxAudioOptionKey.ENABLE_RENDER_PERFORMANCE_OPTIMIZE.ordinal()] = 20;
            } catch (NoSuchFieldError e20) {
                TryCatchGuardChecker.doCheck(e20);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[LyraxAudioOptionKey.STOP_RENDER_PROCESS_DELAY_MS.ordinal()] = 21;
            } catch (NoSuchFieldError e21) {
                TryCatchGuardChecker.doCheck(e21);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[LyraxAudioOptionKey.ENABLE_APM.ordinal()] = 22;
            } catch (NoSuchFieldError e22) {
                TryCatchGuardChecker.doCheck(e22);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxAudioOptionKey[ordinal()]) {
            case 1:
                return "LOCAL_VOLUME";
            case 2:
                return "ENABLE_LOCAL_AUDIO";
            case 3:
                return "ENABLE_HANDS_FREE_EAR_MONITOR";
            case 4:
                return "ENABLE_AUDIO_SESSION_DEACTIVE";
            case 5:
                return "UI_AEC_OPTION";
            case 6:
                return "ENABLE_HW_EAR_MONITOR";
            case 7:
                return "SET_HW_EAR_MONITOR_EFFECT";
            case 8:
                return "SET_HW_EAR_MONITOR_EQUALIZER";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "SET_HW_EAR_MONITOR_VOLUME";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "ANDROID_RECORD_MEDIA_MODE_MIC_SOURCE";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "SET_SW_EAR_MONITOR_VOLUME";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "ENABLE_LOUNDNORM";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "ENABLE_SW_EAR_MONITOR";
            case 14:
                return "ENABLE_EXTERNAL_SOUNDCARD";
            case 15:
                return "UI_AGC_OPTION";
            case 16:
                return "SET_SERVER_CONFIGURE";
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return "SET_AUDIO_INPUT_MIX_SPECIFY_SRC_DRIVE_MIX";
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return "ENABLE_AUDIO_CODEC_SWITCH_FLUSH";
            case 19:
                return "AUDIO_ENCODER_COMPLEXITY_LEVEL";
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return "ENABLE_RENDER_PERFORMANCE_OPTIMIZE";
            case 21:
                return "STOP_RENDER_PROCESS_DELAY_MS";
            case 22:
                return "ENABLE_APM";
            default:
                return "UNKNOWN";
        }
    }

    public int value() {
        return this.value;
    }

    public static LyraxAudioOptionKey fromId(int i) {
        for (LyraxAudioOptionKey lyraxAudioOptionKey : values()) {
            if (lyraxAudioOptionKey.value() == i) {
                return lyraxAudioOptionKey;
            }
        }
        return UNKNOWN;
    }

    public static LyraxAudioOptionKey valueOf(String str) {
        return (LyraxAudioOptionKey) C08FF.LIZ(LyraxAudioOptionKey.class, str);
    }

    LyraxAudioOptionKey(int i) {
        this.value = i;
    }
}
