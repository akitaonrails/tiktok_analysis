package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PodcastInfo implements Serializable {

    @C09CT("podcast_episode_cover_image")
    public PodcastUrlModel cover;

    @C09CT("podcast_episode_authors")
    public List<String> episodeAuthors;

    @C09CT("podcast_episode_id")
    public String episodeItemId;

    @C09CT("podcast_episode_title")
    public String episodeTitle;

    @C09CT("podcast_feed_title")
    public String feedTitle;

    @C09CT("podcast_episode_is_branded_content")
    public Boolean isBrandedContent;

    @C09CT("audio_is_listenable")
    public Boolean isListenable;

    @C09CT("audio_is_podcast")
    public Boolean isPodcast;

    @C09CT("is_podcast_preview")
    public Boolean isPodcastPreview;

    @C09CT("follow_display")
    public Integer isSupportFollowButton;

    @C09CT("podcast_episode_play_addr")
    public PodcastUrlModel playAddr;

    public PodcastInfo() {
        Boolean bool = Boolean.FALSE;
        this.isListenable = bool;
        this.isPodcast = bool;
        this.isSupportFollowButton = 1;
        this.isPodcastPreview = bool;
        this.episodeItemId = "";
        this.episodeAuthors = C13BV.INSTANCE;
        this.playAddr = new PodcastUrlModel();
        this.cover = new PodcastUrlModel();
        this.feedTitle = "";
        this.episodeTitle = "";
        this.isBrandedContent = bool;
    }

    public final PodcastUrlModel getCover() {
        return this.cover;
    }

    public final List<String> getEpisodeAuthors() {
        return this.episodeAuthors;
    }

    public final String getEpisodeItemId() {
        return this.episodeItemId;
    }

    public final String getEpisodeTitle() {
        return this.episodeTitle;
    }

    public final String getFeedTitle() {
        return this.feedTitle;
    }

    public final PodcastUrlModel getPlayAddr() {
        return this.playAddr;
    }

    public final Boolean isBrandedContent() {
        return this.isBrandedContent;
    }

    public final Boolean isListenable() {
        return this.isListenable;
    }

    public final Boolean isPodcast() {
        return this.isPodcast;
    }

    public final Boolean isPodcastPreview() {
        return this.isPodcastPreview;
    }

    public final Integer isSupportFollowButton() {
        return this.isSupportFollowButton;
    }
}
