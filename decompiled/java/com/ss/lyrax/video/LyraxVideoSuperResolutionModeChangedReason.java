package com.ss.lyrax.video;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes36.dex */
public enum LyraxVideoSuperResolutionModeChangedReason {
    API_OFF(0),
    API_ON(1),
    RESOLUTION_EXCEED(2),
    OVER_USE(3),
    DEVICE_NOT_SUPPORT(4),
    DYNAMIC_CLOSE(5),
    OTHER_SETTING_DISABLED(6),
    OTHER_SETTING_ENABLED(7),
    NO_COMPONENT(8),
    STREAM_NOT_EXIST(9);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.video.LyraxVideoSuperResolutionModeChangedReason$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$video$LyraxVideoSuperResolutionModeChangedReason;

        static {
            int[] iArr = new int[LyraxVideoSuperResolutionModeChangedReason.values().length];
            $SwitchMap$com$ss$lyrax$video$LyraxVideoSuperResolutionModeChangedReason = iArr;
            try {
                iArr[LyraxVideoSuperResolutionModeChangedReason.API_OFF.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoSuperResolutionModeChangedReason[LyraxVideoSuperResolutionModeChangedReason.API_ON.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoSuperResolutionModeChangedReason[LyraxVideoSuperResolutionModeChangedReason.RESOLUTION_EXCEED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoSuperResolutionModeChangedReason[LyraxVideoSuperResolutionModeChangedReason.OVER_USE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoSuperResolutionModeChangedReason[LyraxVideoSuperResolutionModeChangedReason.DEVICE_NOT_SUPPORT.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoSuperResolutionModeChangedReason[LyraxVideoSuperResolutionModeChangedReason.DYNAMIC_CLOSE.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoSuperResolutionModeChangedReason[LyraxVideoSuperResolutionModeChangedReason.OTHER_SETTING_DISABLED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoSuperResolutionModeChangedReason[LyraxVideoSuperResolutionModeChangedReason.OTHER_SETTING_ENABLED.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoSuperResolutionModeChangedReason[LyraxVideoSuperResolutionModeChangedReason.NO_COMPONENT.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoSuperResolutionModeChangedReason[LyraxVideoSuperResolutionModeChangedReason.STREAM_NOT_EXIST.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$lyrax$video$LyraxVideoSuperResolutionModeChangedReason[ordinal()]) {
            case 2:
                return "kAPIOn";
            case 3:
                return "kResolutionExceed";
            case 4:
                return "kOverUse";
            case 5:
                return "kDeviceNotSupport";
            case 6:
                return "kDynamicClose";
            case 7:
                return "kOtherSettingDisabled";
            case 8:
                return "kOtherSettingEnabled";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "kNoComponent";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "kStreamNotExist";
            default:
                return "kAPIOff";
        }
    }

    public int value() {
        return this.value;
    }

    public static LyraxVideoSuperResolutionModeChangedReason fromId(int i) {
        switch (i) {
        }
        return API_OFF;
    }

    public static LyraxVideoSuperResolutionModeChangedReason valueOf(String str) {
        return (LyraxVideoSuperResolutionModeChangedReason) C08FF.LIZ(LyraxVideoSuperResolutionModeChangedReason.class, str);
    }

    LyraxVideoSuperResolutionModeChangedReason(int i) {
        this.value = i;
    }
}
