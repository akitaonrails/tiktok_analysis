package com.ss.android.ugc.aweme.music.search;

import X.C09CT;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicBaseResponse;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchPinnedMusicList extends MusicBaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("avalible_capicity")
    public int avalibleCapicity = 3;

    @C09CT("highlight_group")
    public MusicGroup highlightedGroup;

    @C09CT("highlight_music")
    public Music highlightedMusic;

    @C09CT("pinned_group")
    public List<MusicGroup> musicGroups;

    @C09CT("music")
    public List<Music> musicList;

    @C09CT("spotlight_group")
    public MusicGroup spotlightGroup;

    public final int getAvalibleCapicity() {
        return this.avalibleCapicity;
    }

    public final MusicGroup getHighlightedGroup() {
        return this.highlightedGroup;
    }

    public final Music getHighlightedMusic() {
        return this.highlightedMusic;
    }

    public final List<MusicGroup> getMusicGroups() {
        return this.musicGroups;
    }

    public final List<Music> getMusicList() {
        return this.musicList;
    }

    public final MusicGroup getSpotlightGroup() {
        return this.spotlightGroup;
    }

    public final void setAvalibleCapicity(int i) {
        this.avalibleCapicity = i;
    }

    public final void setHighlightedGroup(MusicGroup musicGroup) {
        this.highlightedGroup = musicGroup;
    }

    public final void setHighlightedMusic(Music music) {
        this.highlightedMusic = music;
    }

    public final void setMusicGroups(List<MusicGroup> list) {
        this.musicGroups = list;
    }

    public final void setMusicList(List<Music> list) {
        this.musicList = list;
    }

    public final void setSpotlightGroup(MusicGroup musicGroup) {
        this.spotlightGroup = musicGroup;
    }
}
