package com.ss.lyrax.transcoder;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxTranscoderEffectDescription {
    public LyraxTranscoderEffectParam effectParam;
    public LyraxTranscoderEffectType effectType;

    public LyraxTranscoderEffectParam getEffectParam() {
        return this.effectParam;
    }

    public LyraxTranscoderEffectType getEffectType() {
        return this.effectType;
    }

    public void setEffectParam(LyraxTranscoderEffectParam lyraxTranscoderEffectParam) {
        this.effectParam = lyraxTranscoderEffectParam;
    }

    public void setEffectType(LyraxTranscoderEffectType lyraxTranscoderEffectType) {
        this.effectType = lyraxTranscoderEffectType;
    }

    public LyraxTranscoderEffectDescription(LyraxTranscoderEffectType lyraxTranscoderEffectType, LyraxTranscoderEffectParam lyraxTranscoderEffectParam) {
        this.effectType = lyraxTranscoderEffectType;
        this.effectParam = lyraxTranscoderEffectParam;
    }
}
