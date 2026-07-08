package com.ss.lyrax.transcoder;

import X.C08FF;

/* JADX INFO: loaded from: classes17.dex */
public enum LyraxTranscoderAsrTaskMode {
    Lyrax_TRANSCODER_ASR_TASK_MODE_DEFAULT(0),
    Lyrax_TRANSCODER_ASR_TASK_MODE_AI_EXPLANATION(1);

    public int taskMode;

    public int getValue() {
        return this.taskMode;
    }

    public static LyraxTranscoderAsrTaskMode fromValue(int i) {
        for (LyraxTranscoderAsrTaskMode lyraxTranscoderAsrTaskMode : values()) {
            if (lyraxTranscoderAsrTaskMode.getValue() == i) {
                return lyraxTranscoderAsrTaskMode;
            }
        }
        return Lyrax_TRANSCODER_ASR_TASK_MODE_DEFAULT;
    }

    public static LyraxTranscoderAsrTaskMode valueOf(String str) {
        return (LyraxTranscoderAsrTaskMode) C08FF.LIZ(LyraxTranscoderAsrTaskMode.class, str);
    }

    LyraxTranscoderAsrTaskMode(int i) {
        this.taskMode = i;
    }
}
