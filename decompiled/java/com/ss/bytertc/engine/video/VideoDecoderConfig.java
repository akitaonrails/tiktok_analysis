package com.ss.bytertc.engine.video;

import X.C08FF;

/* JADX INFO: loaded from: classes10.dex */
public enum VideoDecoderConfig {
    VIDEO_DECODER_CONFIG_RAW(0),
    VIDEO_DECODER_CONFIG_ENCODE(1),
    VIDEO_DECODER_CONFIG_BOTH(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static VideoDecoderConfig fromId(int i) {
        for (VideoDecoderConfig videoDecoderConfig : values()) {
            if (videoDecoderConfig.value() == i) {
                return videoDecoderConfig;
            }
        }
        return null;
    }

    public static VideoDecoderConfig valueOf(String str) {
        return (VideoDecoderConfig) C08FF.LIZ(VideoDecoderConfig.class, str);
    }

    VideoDecoderConfig(int i) {
        this.value = i;
    }
}
