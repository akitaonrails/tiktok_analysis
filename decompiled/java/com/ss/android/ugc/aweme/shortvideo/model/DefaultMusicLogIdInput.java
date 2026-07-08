package com.ss.android.ugc.aweme.shortvideo.model;

/* JADX INFO: loaded from: classes23.dex */
public final class DefaultMusicLogIdInput extends MusicLogIdInput {
    public static final int $stable = 0;
    public final String inMusicSelectedFrom;

    @Override // com.ss.android.ugc.aweme.shortvideo.model.MusicLogIdInput
    public String musicSelectedFrom() {
        String str = this.inMusicSelectedFrom;
        return str == null ? "" : str;
    }

    public final String getInMusicSelectedFrom() {
        return this.inMusicSelectedFrom;
    }

    public DefaultMusicLogIdInput(String str) {
        this.inMusicSelectedFrom = str;
    }
}
