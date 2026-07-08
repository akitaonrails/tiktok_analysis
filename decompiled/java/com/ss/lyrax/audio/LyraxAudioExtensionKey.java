package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes36.dex */
public enum LyraxAudioExtensionKey {
    ROUTE(0),
    SYSTEMAPI(1),
    SYSTEM_ERRORCODE(2),
    CALL_PARAMETERS(3),
    IS_HARDWARE_EARMONITOR_SUPPORTED(4),
    EVENT_SESSIONID(5),
    ELAPSE(6),
    LOCATION(7),
    DEVICEID(8),
    DEVICE_NAME(9),
    MEDIA_MODE(10),
    SCENARIO(11);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxAudioExtensionKey$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxAudioExtensionKey;

        static {
            int[] iArr = new int[LyraxAudioExtensionKey.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxAudioExtensionKey = iArr;
            try {
                iArr[LyraxAudioExtensionKey.ROUTE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioExtensionKey[LyraxAudioExtensionKey.SYSTEMAPI.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioExtensionKey[LyraxAudioExtensionKey.SYSTEM_ERRORCODE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioExtensionKey[LyraxAudioExtensionKey.CALL_PARAMETERS.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioExtensionKey[LyraxAudioExtensionKey.IS_HARDWARE_EARMONITOR_SUPPORTED.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioExtensionKey[LyraxAudioExtensionKey.EVENT_SESSIONID.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioExtensionKey[LyraxAudioExtensionKey.ELAPSE.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioExtensionKey[LyraxAudioExtensionKey.LOCATION.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioExtensionKey[LyraxAudioExtensionKey.DEVICEID.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioExtensionKey[LyraxAudioExtensionKey.DEVICE_NAME.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioExtensionKey[LyraxAudioExtensionKey.MEDIA_MODE.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
                TryCatchGuardChecker.doCheck(e11);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioExtensionKey[LyraxAudioExtensionKey.SCENARIO.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
                TryCatchGuardChecker.doCheck(e12);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxAudioExtensionKey[ordinal()]) {
            case 2:
                return "SYSTEMAPI";
            case 3:
                return "SYSTEM_ERRORCODE";
            case 4:
                return "CALL_PARAMETERS";
            case 5:
                return "IS_HARDWARE_EARMONITOR_SUPPORTED";
            case 6:
                return "EVENT_SESSIONID";
            case 7:
                return "ELAPSE";
            case 8:
                return "LOCATION";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "DEVICEID";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "DEVICE_NAME";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "MEDIA_MODE";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "SCENARIO";
            default:
                return "ROUTE";
        }
    }

    public int value() {
        return this.value;
    }

    public static LyraxAudioExtensionKey fromId(int i) {
        for (LyraxAudioExtensionKey lyraxAudioExtensionKey : values()) {
            if (lyraxAudioExtensionKey.value() == i) {
                return lyraxAudioExtensionKey;
            }
        }
        return ROUTE;
    }

    public static LyraxAudioExtensionKey valueOf(String str) {
        return (LyraxAudioExtensionKey) C08FF.LIZ(LyraxAudioExtensionKey.class, str);
    }

    LyraxAudioExtensionKey(int i) {
        this.value = i;
    }
}
