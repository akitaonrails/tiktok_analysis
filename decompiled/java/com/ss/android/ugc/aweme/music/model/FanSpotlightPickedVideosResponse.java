package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class FanSpotlightPickedVideosResponse extends MusicBaseResponse implements Serializable {

    @C09CT("aweme_list")
    public List<? extends Aweme> awemeList;

    @C09CT("show_artist_pick_videos")
    public Boolean showArtistPickVideos;

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final Boolean getShowArtistPickVideos() {
        return this.showArtistPickVideos;
    }

    public final void setAwemeList(List<? extends Aweme> list) {
        this.awemeList = list;
    }

    public final void setShowArtistPickVideos(Boolean bool) {
        this.showArtistPickVideos = bool;
    }
}
