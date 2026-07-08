package com.ss.lyrax.transcoder;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxTranscoderAudioCodecType {
    AUDIOCODEC_AAC(0),
    AUDIOCODEC_OPUS(1);

    public int value;

    /* JADX INFO: renamed from: com.ss.lyrax.transcoder.LyraxTranscoderAudioCodecType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderAudioCodecType;

        static {
            int[] iArr = new int[LyraxTranscoderAudioCodecType.values().length];
            $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderAudioCodecType = iArr;
            try {
                iArr[LyraxTranscoderAudioCodecType.AUDIOCODEC_AAC.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderAudioCodecType[LyraxTranscoderAudioCodecType.AUDIOCODEC_OPUS.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return AnonymousClass1.$SwitchMap$com$ss$lyrax$transcoder$LyraxTranscoderAudioCodecType[ordinal()] != 2 ? "AudioCodecAAC" : "AudioCodecOPUS";
    }

    public int value() {
        return this.value;
    }

    public static LyraxTranscoderAudioCodecType fromId(int i) {
        for (LyraxTranscoderAudioCodecType lyraxTranscoderAudioCodecType : values()) {
            if (lyraxTranscoderAudioCodecType.value() == i) {
                return lyraxTranscoderAudioCodecType;
            }
        }
        return AUDIOCODEC_AAC;
    }

    public static LyraxTranscoderAudioCodecType valueOf(String str) {
        return (LyraxTranscoderAudioCodecType) C08FF.LIZ(LyraxTranscoderAudioCodecType.class, str);
    }

    LyraxTranscoderAudioCodecType(int i) {
        this.value = i;
    }
}
