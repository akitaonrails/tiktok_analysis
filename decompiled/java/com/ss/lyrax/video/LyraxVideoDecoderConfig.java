package com.ss.lyrax.video;

import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoDecoderConfig {
    public List<LyraxVideoCodecConfig> codecConfigs;
    public LyraxVideoDecoderOutputType outputType;

    public int getDecoderOutputType() {
        LyraxVideoDecoderOutputType lyraxVideoDecoderOutputType = this.outputType;
        if (lyraxVideoDecoderOutputType != null) {
            return lyraxVideoDecoderOutputType.value();
        }
        return -1;
    }

    public List<LyraxVideoCodecConfig> getCodecConfigs() {
        return this.codecConfigs;
    }

    public LyraxVideoDecoderConfig(LyraxVideoDecoderOutputType lyraxVideoDecoderOutputType, List<LyraxVideoCodecConfig> list) {
        this.outputType = lyraxVideoDecoderOutputType;
        this.codecConfigs = list;
    }
}
