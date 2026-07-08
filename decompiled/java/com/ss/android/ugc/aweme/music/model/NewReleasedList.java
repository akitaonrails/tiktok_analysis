package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class NewReleasedList extends MusicBaseResponse implements Serializable {

    @C09CT("groups")
    public List<MusicGroup> newReleasedMusicGroups;

    @C09CT("musics")
    public List<? extends Music> newReleasedMusicList;

    public final List<MusicGroup> getNewReleasedMusicGroups() {
        return this.newReleasedMusicGroups;
    }

    public final List<Music> getNewReleasedMusicList() {
        return this.newReleasedMusicList;
    }

    public final void setNewReleasedMusicGroups(List<MusicGroup> list) {
        this.newReleasedMusicGroups = list;
    }

    public final void setNewReleasedMusicList(List<? extends Music> list) {
        this.newReleasedMusicList = list;
    }
}
