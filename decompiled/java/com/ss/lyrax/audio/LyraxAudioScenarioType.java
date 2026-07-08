package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes35.dex */
public enum LyraxAudioScenarioType {
    MEDIA(0),
    COMMUNICATION(1),
    MUSIC(2);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxAudioScenarioType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxAudioScenarioType;

        static {
            int[] iArr = new int[LyraxAudioScenarioType.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxAudioScenarioType = iArr;
            try {
                iArr[LyraxAudioScenarioType.MEDIA.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioScenarioType[LyraxAudioScenarioType.COMMUNICATION.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioScenarioType[LyraxAudioScenarioType.MUSIC.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxAudioScenarioType[ordinal()];
        return i != 1 ? i != 2 ? i == 3 ? "MUSIC" : "MEDIA" : "COMMUNICATION" : "MEDIA";
    }

    public int value() {
        return this.value;
    }

    public static LyraxAudioScenarioType fromId(int i) {
        for (LyraxAudioScenarioType lyraxAudioScenarioType : values()) {
            if (lyraxAudioScenarioType.value() == i) {
                return lyraxAudioScenarioType;
            }
        }
        return MEDIA;
    }

    public static LyraxAudioScenarioType valueOf(String str) {
        return (LyraxAudioScenarioType) C08FF.LIZ(LyraxAudioScenarioType.class, str);
    }

    LyraxAudioScenarioType(int i) {
        this.value = i;
    }
}
