package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class PinnedMusicList extends MusicBaseResponse implements Serializable {

    @C09CT("avalible_capicity")
    public int avalibleCapicity = 3;

    @C09CT("highlight_group")
    public MusicGroup highlightedGroup;

    @C09CT("pinned_group")
    public List<MusicGroup> musicGroups;

    @C09CT("spotlight_group")
    public MusicGroup spotlightGroup;

    public final int getAvalibleCapicity() {
        return this.avalibleCapicity;
    }

    public final MusicGroup getHighlightedGroup() {
        return this.highlightedGroup;
    }

    public final List<MusicGroup> getMusicGroups() {
        return this.musicGroups;
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

    public final void setMusicGroups(List<MusicGroup> list) {
        this.musicGroups = list;
    }

    public final void setSpotlightGroup(MusicGroup musicGroup) {
        this.spotlightGroup = musicGroup;
    }
}
