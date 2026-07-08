package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class StrippedMusicInfoStruct implements Serializable {

    @C09CT("stripped_music_list")
    public List<StrippedMusicInfo> strippedMusicList = C13BV.INSTANCE;

    public final List<StrippedMusicInfo> getStrippedMusicList() {
        return this.strippedMusicList;
    }

    public final void setStrippedMusicList(List<StrippedMusicInfo> list) {
        this.strippedMusicList = list;
    }
}
