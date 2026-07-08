package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxAudioChannel {
    AUTO(-1),
    MONO(1),
    STEREO(2);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxAudioChannel$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxAudioChannel;

        static {
            int[] iArr = new int[LyraxAudioChannel.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxAudioChannel = iArr;
            try {
                iArr[LyraxAudioChannel.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioChannel[LyraxAudioChannel.MONO.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioChannel[LyraxAudioChannel.STEREO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxAudioChannel[ordinal()];
        return i != 1 ? i != 2 ? i == 3 ? "Stereo" : "Auto" : "Mono" : "Auto";
    }

    public int value() {
        return this.value;
    }

    public static LyraxAudioChannel fromId(int i) {
        for (LyraxAudioChannel lyraxAudioChannel : values()) {
            if (lyraxAudioChannel.value() == i) {
                return lyraxAudioChannel;
            }
        }
        return AUTO;
    }

    public static LyraxAudioChannel valueOf(String str) {
        return (LyraxAudioChannel) C08FF.LIZ(LyraxAudioChannel.class, str);
    }

    LyraxAudioChannel(int i) {
        this.value = i;
    }
}
