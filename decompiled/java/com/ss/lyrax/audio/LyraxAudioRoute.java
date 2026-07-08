package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxAudioRoute {
    ROUTE_DEFAULT(-1),
    ROUTE_HEADSET(1),
    ROUTE_EARPIECE(2),
    ROUTE_SPEAKERPHONE(3),
    ROUTE_HEADSET_BLUETOOTH(4),
    ROUTE_HEADSET_USB(5);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxAudioRoute$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxAudioRoute;

        static {
            int[] iArr = new int[LyraxAudioRoute.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxAudioRoute = iArr;
            try {
                iArr[LyraxAudioRoute.ROUTE_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioRoute[LyraxAudioRoute.ROUTE_HEADSET.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioRoute[LyraxAudioRoute.ROUTE_EARPIECE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioRoute[LyraxAudioRoute.ROUTE_SPEAKERPHONE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioRoute[LyraxAudioRoute.ROUTE_HEADSET_BLUETOOTH.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioRoute[LyraxAudioRoute.ROUTE_HEADSET_USB.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxAudioRoute[ordinal()]) {
            case 2:
                return "ROUTE_HEADSET";
            case 3:
                return "ROUTE_EARPIECE";
            case 4:
                return "ROUTE_SPEAKERPHONE";
            case 5:
                return "ROUTE_HEADSET_BLUETOOTH";
            case 6:
                return "ROUTE_HEADSET_USB";
            default:
                return "ROUTE_DEFAULT";
        }
    }

    public int value() {
        return this.value;
    }

    public static LyraxAudioRoute fromId(int i) {
        for (LyraxAudioRoute lyraxAudioRoute : values()) {
            if (lyraxAudioRoute.value() == i) {
                return lyraxAudioRoute;
            }
        }
        return ROUTE_DEFAULT;
    }

    public static LyraxAudioRoute valueOf(String str) {
        return (LyraxAudioRoute) C08FF.LIZ(LyraxAudioRoute.class, str);
    }

    LyraxAudioRoute(int i) {
        this.value = i;
    }
}
