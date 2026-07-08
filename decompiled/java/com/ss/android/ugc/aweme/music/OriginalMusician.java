package com.ss.android.ugc.aweme.music;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class OriginalMusician implements Serializable {

    @C09CT("digg_count")
    public int diggCount;

    @C09CT("highlight_music_id")
    public long highlightMusicId;

    @C09CT("main_artist_new_release_count")
    public int mainArtistNewReleaseCount;

    @C09CT("music_count")
    public int musicCount;

    @C09CT("music_cover_url")
    public UrlModel musicCoverUrl;

    @C09CT("music_qrcode_url")
    public UrlModel musicQrcodeUrl;

    @C09CT("music_used_count")
    public int musicUseCount;

    @C09CT("new_release_clip_ids")
    public List<Long> newReleaseClipIds;

    public int getDiggCount() {
        return this.diggCount;
    }

    public long getHighlightMusicId() {
        return this.highlightMusicId;
    }

    public int getMainArtistNewReleaseCount() {
        return this.mainArtistNewReleaseCount;
    }

    public int getMusicCount() {
        return this.musicCount;
    }

    public UrlModel getMusicCoverUrl() {
        return this.musicCoverUrl;
    }

    public UrlModel getMusicQrcodeUrl() {
        return this.musicQrcodeUrl;
    }

    public int getMusicUseCount() {
        return this.musicUseCount;
    }

    public List<Long> getNewReleaseClipIds() {
        return this.newReleaseClipIds;
    }

    public void setDiggCount(int i) {
        this.diggCount = i;
    }

    public void setHighlightMusicId(long j) {
        this.highlightMusicId = j;
    }

    public void setMainArtistNewReleaseCount(int i) {
        this.mainArtistNewReleaseCount = i;
    }

    public void setMusicCount(int i) {
        this.musicCount = i;
    }

    public void setMusicCoverUrl(UrlModel urlModel) {
        this.musicCoverUrl = urlModel;
    }

    public void setMusicQrcodeUrl(UrlModel urlModel) {
        this.musicQrcodeUrl = urlModel;
    }

    public void setMusicUseCount(int i) {
        this.musicUseCount = i;
    }

    public void setNewReleaseClipIds(List<Long> list) {
        this.newReleaseClipIds = list;
    }
}
