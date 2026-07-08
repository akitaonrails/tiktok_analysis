package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes36.dex */
public enum LyraxAudioStateChangeReason {
    INTERNAL(0),
    NETWORK_CONGESTION(1),
    NETWORK_RECOVERY(2),
    LOCAL_MUTED(3),
    LOCAL_UNMUTED(4),
    REMOTE_MUTED(5),
    REMOTE_UNMUTED(6),
    REMOTE_OFFLINE(7);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxAudioStateChangeReason$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxAudioStateChangeReason;

        static {
            int[] iArr = new int[LyraxAudioStateChangeReason.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxAudioStateChangeReason = iArr;
            try {
                iArr[LyraxAudioStateChangeReason.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioStateChangeReason[LyraxAudioStateChangeReason.NETWORK_CONGESTION.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioStateChangeReason[LyraxAudioStateChangeReason.NETWORK_RECOVERY.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioStateChangeReason[LyraxAudioStateChangeReason.LOCAL_MUTED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioStateChangeReason[LyraxAudioStateChangeReason.LOCAL_UNMUTED.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioStateChangeReason[LyraxAudioStateChangeReason.REMOTE_MUTED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioStateChangeReason[LyraxAudioStateChangeReason.REMOTE_UNMUTED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioStateChangeReason[LyraxAudioStateChangeReason.REMOTE_OFFLINE.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxAudioStateChangeReason[ordinal()]) {
            case 2:
                return "NETWORK_CONGESTION";
            case 3:
                return "NETWORK_RECOVERY";
            case 4:
                return "LOCAL_MUTED";
            case 5:
                return "LOCAL_UNMUTED";
            case 6:
                return "REMOTE_MUTED";
            case 7:
                return "REMOTE_UNMUTED";
            case 8:
                return "REMOTE_OFFLINE";
            default:
                return "INTERNAL";
        }
    }

    public int value() {
        return this.value;
    }

    public static LyraxAudioStateChangeReason fromId(int i) {
        for (LyraxAudioStateChangeReason lyraxAudioStateChangeReason : values()) {
            if (lyraxAudioStateChangeReason.value() == i) {
                return lyraxAudioStateChangeReason;
            }
        }
        return INTERNAL;
    }

    public static LyraxAudioStateChangeReason valueOf(String str) {
        return (LyraxAudioStateChangeReason) C08FF.LIZ(LyraxAudioStateChangeReason.class, str);
    }

    LyraxAudioStateChangeReason(int i) {
        this.value = i;
    }
}
