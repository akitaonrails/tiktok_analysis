package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes36.dex */
public enum LyraxAudioDeviceEventType {
    UNKNOWN(-1),
    START(4),
    STOP(5),
    ROUTE_CHANGED(19),
    INTERRUPTION_BEGIN(20),
    INTERRUPTION_END(21),
    MEDIA_SERVER_TERMINATED(22),
    MEDIA_SERVER_RESET(23),
    RESTART(24),
    UPDATE_EARMONITOR(41),
    ANDROID_RECORD_CALLBACK(42),
    DEVICE_OCCUPIED(44),
    DEVICE_UNOCCUPIED(45),
    CAPTURE_SILENCE(46),
    CAPTURE_SILENCE_DISAPPEAR(47),
    RUNNING(100);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxAudioDeviceEventType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceEventType;

        static {
            int[] iArr = new int[LyraxAudioDeviceEventType.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceEventType = iArr;
            try {
                iArr[LyraxAudioDeviceEventType.START.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceEventType[LyraxAudioDeviceEventType.STOP.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceEventType[LyraxAudioDeviceEventType.ROUTE_CHANGED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceEventType[LyraxAudioDeviceEventType.INTERRUPTION_BEGIN.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceEventType[LyraxAudioDeviceEventType.INTERRUPTION_END.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceEventType[LyraxAudioDeviceEventType.MEDIA_SERVER_TERMINATED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceEventType[LyraxAudioDeviceEventType.MEDIA_SERVER_RESET.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceEventType[LyraxAudioDeviceEventType.RESTART.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceEventType[LyraxAudioDeviceEventType.UPDATE_EARMONITOR.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceEventType[LyraxAudioDeviceEventType.ANDROID_RECORD_CALLBACK.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceEventType[LyraxAudioDeviceEventType.DEVICE_OCCUPIED.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
                TryCatchGuardChecker.doCheck(e11);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceEventType[LyraxAudioDeviceEventType.DEVICE_UNOCCUPIED.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
                TryCatchGuardChecker.doCheck(e12);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceEventType[LyraxAudioDeviceEventType.CAPTURE_SILENCE.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
                TryCatchGuardChecker.doCheck(e13);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceEventType[LyraxAudioDeviceEventType.CAPTURE_SILENCE_DISAPPEAR.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
                TryCatchGuardChecker.doCheck(e14);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceEventType[LyraxAudioDeviceEventType.RUNNING.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
                TryCatchGuardChecker.doCheck(e15);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceEventType[ordinal()]) {
            case 1:
                return "START";
            case 2:
                return "STOP";
            case 3:
                return "ROUTE_CHANGED";
            case 4:
                return "INTERRUPTION_BEGIN";
            case 5:
                return "INTERRUPTION_END";
            case 6:
                return "MEDIA_SERVER_TERMINATED";
            case 7:
                return "MEDIA_SERVER_RESET";
            case 8:
                return "RESTART";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "UPDATE_EARMONITOR";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "ANDROID_RECORD_CALLBACK";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "DEVICE_OCCUPIED";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "DEVICE_UNOCCUPIED";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "CAPTURE_SILENCE";
            case 14:
                return "CAPTURE_SILENCE_DISAPPEAR";
            case 15:
                return "RUNNING";
            default:
                return "UNKNOWN";
        }
    }

    public int value() {
        return this.value;
    }

    public static LyraxAudioDeviceEventType fromId(int i) {
        for (LyraxAudioDeviceEventType lyraxAudioDeviceEventType : values()) {
            if (lyraxAudioDeviceEventType.value() == i) {
                return lyraxAudioDeviceEventType;
            }
        }
        return UNKNOWN;
    }

    public static LyraxAudioDeviceEventType valueOf(String str) {
        return (LyraxAudioDeviceEventType) C08FF.LIZ(LyraxAudioDeviceEventType.class, str);
    }

    LyraxAudioDeviceEventType(int i) {
        this.value = i;
    }
}
