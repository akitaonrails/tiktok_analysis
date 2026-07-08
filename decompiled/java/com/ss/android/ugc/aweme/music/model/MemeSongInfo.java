package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class MemeSongInfo implements Serializable {

    @C09CT("is_meme_song")
    public boolean isMemeSong;

    @C09CT("meme_song_style")
    public String memeSongStyle = "";

    @C09CT("meme_song_title")
    public String memeSongTitle = "";

    public final String getMemeSongStyle() {
        return this.memeSongStyle;
    }

    public final String getMemeSongTitle() {
        return this.memeSongTitle;
    }

    public final boolean isMemeSong() {
        return this.isMemeSong;
    }

    public final void setMemeSong(boolean z) {
        this.isMemeSong = z;
    }

    public final void setMemeSongStyle(String str) {
        this.memeSongStyle = str;
    }

    public final void setMemeSongTitle(String str) {
        this.memeSongTitle = str;
    }
}
