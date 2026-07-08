package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxAudioDeviceType {
    UNKNOWN(-1),
    RENDER_DEVICE(0),
    CAPTURE_DEVICE(1);

    public final int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxAudioDeviceType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceType;

        static {
            int[] iArr = new int[LyraxAudioDeviceType.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceType = iArr;
            try {
                iArr[LyraxAudioDeviceType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceType[LyraxAudioDeviceType.RENDER_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceType[LyraxAudioDeviceType.CAPTURE_DEVICE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxAudioDeviceType[ordinal()];
        return i != 1 ? i != 2 ? i == 3 ? "CAPTURE_DEVICE" : "UNKNOWN" : "RENDER_DEVICE" : "UNKNOWN";
    }

    public int value() {
        return this.value;
    }

    public static LyraxAudioDeviceType fromId(int i) {
        for (LyraxAudioDeviceType lyraxAudioDeviceType : values()) {
            if (lyraxAudioDeviceType.value() == i) {
                return lyraxAudioDeviceType;
            }
        }
        return UNKNOWN;
    }

    public static LyraxAudioDeviceType valueOf(String str) {
        return (LyraxAudioDeviceType) C08FF.LIZ(LyraxAudioDeviceType.class, str);
    }

    LyraxAudioDeviceType(int i) {
        this.value = i;
    }
}
