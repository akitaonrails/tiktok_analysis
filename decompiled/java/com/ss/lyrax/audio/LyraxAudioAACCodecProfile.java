package com.ss.lyrax.audio;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxAudioAACCodecProfile {
    AACLC(0),
    AACHEV1(1),
    AACHEV2(2),
    AACLCADTS(3);

    public final int value;

    /* JADX INFO: renamed from: com.ss.lyrax.audio.LyraxAudioAACCodecProfile$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$audio$LyraxAudioAACCodecProfile;

        static {
            int[] iArr = new int[LyraxAudioAACCodecProfile.values().length];
            $SwitchMap$com$ss$lyrax$audio$LyraxAudioAACCodecProfile = iArr;
            try {
                iArr[LyraxAudioAACCodecProfile.AACLC.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioAACCodecProfile[LyraxAudioAACCodecProfile.AACHEV1.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioAACCodecProfile[LyraxAudioAACCodecProfile.AACHEV2.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$audio$LyraxAudioAACCodecProfile[LyraxAudioAACCodecProfile.AACLCADTS.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$audio$LyraxAudioAACCodecProfile[ordinal()];
        return i != 2 ? i != 3 ? i != 4 ? "AACLC" : "AACLCADTS" : "AACHEv2" : "AACHEv1";
    }

    public int value() {
        return this.value;
    }

    public static LyraxAudioAACCodecProfile fromId(int i) {
        for (LyraxAudioAACCodecProfile lyraxAudioAACCodecProfile : values()) {
            if (lyraxAudioAACCodecProfile.value() == i) {
                return lyraxAudioAACCodecProfile;
            }
        }
        return AACLC;
    }

    public static LyraxAudioAACCodecProfile valueOf(String str) {
        return (LyraxAudioAACCodecProfile) C08FF.LIZ(LyraxAudioAACCodecProfile.class, str);
    }

    LyraxAudioAACCodecProfile(int i) {
        this.value = i;
    }
}
