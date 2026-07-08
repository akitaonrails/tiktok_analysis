package com.ss.lyrax.audio;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxAudioPlayerCustomSource {
    public LyraxAudioPlayerCustomSourceMode mode;
    public ILyraxAudioPlayerCustomSourceProvider provider;
    public LyraxAudioPlayerCustomSourceStreamType type;

    public LyraxAudioPlayerCustomSource() {
        this.mode = LyraxAudioPlayerCustomSourceMode.PUSH;
        this.type = LyraxAudioPlayerCustomSourceStreamType.RAW;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxAudioPlayerCustomSource{provider='");
        sbLIZ.append(this.provider);
        sbLIZ.append('\'');
        sbLIZ.append(", LyraxAudioPlayerCustomSourceMode='");
        sbLIZ.append(this.mode);
        sbLIZ.append('\'');
        sbLIZ.append(", LyraxAudioPlayerCustomSourceStreamType='");
        sbLIZ.append(this.type);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyraxAudioPlayerCustomSource(ILyraxAudioPlayerCustomSourceProvider iLyraxAudioPlayerCustomSourceProvider, LyraxAudioPlayerCustomSourceMode lyraxAudioPlayerCustomSourceMode, LyraxAudioPlayerCustomSourceStreamType lyraxAudioPlayerCustomSourceStreamType) {
        this.mode = LyraxAudioPlayerCustomSourceMode.PUSH;
        this.mode = lyraxAudioPlayerCustomSourceMode;
        this.type = lyraxAudioPlayerCustomSourceStreamType;
        this.provider = iLyraxAudioPlayerCustomSourceProvider;
    }
}
