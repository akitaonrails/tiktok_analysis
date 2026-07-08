package com.ss.lyrax.transcoder;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxTranscoderEffectType {
    LYRAX_TRANSCODER_EFFECT_TYPE_NONE(0),
    LYRAX_TRANSCODER_EFFECT_TYPE_BORDER(1),
    LYRAX_TRANSCODER_EFFECT_TYPE_ASR_WORD_MUTING(2);

    public int effectType;

    public int getValue() {
        return this.effectType;
    }

    public static LyraxTranscoderEffectType fromValue(int i) {
        for (LyraxTranscoderEffectType lyraxTranscoderEffectType : values()) {
            if (lyraxTranscoderEffectType.getValue() == i) {
                return lyraxTranscoderEffectType;
            }
        }
        return LYRAX_TRANSCODER_EFFECT_TYPE_NONE;
    }

    public static LyraxTranscoderEffectType valueOf(String str) {
        return (LyraxTranscoderEffectType) C08FF.LIZ(LyraxTranscoderEffectType.class, str);
    }

    LyraxTranscoderEffectType(int i) {
        this.effectType = i;
    }
}
