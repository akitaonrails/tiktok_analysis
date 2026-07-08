package com.ss.lyrax.transcoder;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxTranscoderAudioCodecProfile {
    AACPROFILE_LC(0),
    AACPROFILE_HEV1(1),
    AACPROFILE_HEV2(2);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.transcoder.LyraxTranscoderAudioCodecProfile$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderAudioCodecProfile;

        static {
            int[] iArr = new int[LyraxTranscoderAudioCodecProfile.values().length];
            $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderAudioCodecProfile = iArr;
            try {
                iArr[LyraxTranscoderAudioCodecProfile.AACPROFILE_LC.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderAudioCodecProfile[LyraxTranscoderAudioCodecProfile.AACPROFILE_HEV1.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderAudioCodecProfile[LyraxTranscoderAudioCodecProfile.AACPROFILE_HEV2.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderAudioCodecProfile[ordinal()];
        return i != 2 ? i != 3 ? "AACProfileLC" : "AACProfileHEv2" : "AACProfileHEv1";
    }

    public int value() {
        return this.value;
    }

    public static LyraxTranscoderAudioCodecProfile fromId(int i) {
        for (LyraxTranscoderAudioCodecProfile lyraxTranscoderAudioCodecProfile : values()) {
            if (lyraxTranscoderAudioCodecProfile.value() == i) {
                return lyraxTranscoderAudioCodecProfile;
            }
        }
        return AACPROFILE_LC;
    }

    public static LyraxTranscoderAudioCodecProfile valueOf(String str) {
        return (LyraxTranscoderAudioCodecProfile) C08FF.LIZ(LyraxTranscoderAudioCodecProfile.class, str);
    }

    LyraxTranscoderAudioCodecProfile(int i) {
        this.value = i;
    }
}
