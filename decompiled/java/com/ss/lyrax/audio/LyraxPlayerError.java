package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes36.dex */
public enum LyraxPlayerError {
    OK(0),
    FORMAT_NOT_SUPPORT(1),
    INVALID_PATH(2),
    INVALID_STATE(3),
    INVALID_POSITION(4),
    INVALID_VOLUME(5),
    INVALID_PITCH(6),
    INVALID_AUDIO_TRACK_INDEX(7),
    INVALID_PLAYBACK_SPEED(8),
    INVALID_EFFECT_ID(9);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxPlayerError$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxPlayerError;

        static {
            int[] iArr = new int[LyraxPlayerError.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxPlayerError = iArr;
            try {
                iArr[LyraxPlayerError.OK.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxPlayerError[LyraxPlayerError.FORMAT_NOT_SUPPORT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxPlayerError[LyraxPlayerError.INVALID_PATH.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxPlayerError[LyraxPlayerError.INVALID_STATE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxPlayerError[LyraxPlayerError.INVALID_POSITION.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxPlayerError[LyraxPlayerError.INVALID_VOLUME.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxPlayerError[LyraxPlayerError.INVALID_PITCH.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxPlayerError[LyraxPlayerError.INVALID_AUDIO_TRACK_INDEX.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxPlayerError[LyraxPlayerError.INVALID_PLAYBACK_SPEED.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxPlayerError[LyraxPlayerError.INVALID_EFFECT_ID.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxPlayerError[ordinal()]) {
            case 2:
                return "FORMAT_NOT_SUPPORT";
            case 3:
                return "INVALID_PATH";
            case 4:
                return "INVALID_STATE";
            case 5:
                return "INVALID_POSITION";
            case 6:
                return "INVALID_VOLUME";
            case 7:
                return "INVALID_PITCH";
            case 8:
                return "INVALID_AUDIO_TRACK_INDEX";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "INVALID_PLAYBACK_SPEED";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "INVALID_EFFECT_ID";
            default:
                return "OK";
        }
    }

    public int value() {
        return this.value;
    }

    public static LyraxPlayerError fromId(int i) {
        for (LyraxPlayerError lyraxPlayerError : values()) {
            if (lyraxPlayerError.value() == i) {
                return lyraxPlayerError;
            }
        }
        return OK;
    }

    public static LyraxPlayerError valueOf(String str) {
        return (LyraxPlayerError) C08FF.LIZ(LyraxPlayerError.class, str);
    }

    LyraxPlayerError(int i) {
        this.value = i;
    }
}
