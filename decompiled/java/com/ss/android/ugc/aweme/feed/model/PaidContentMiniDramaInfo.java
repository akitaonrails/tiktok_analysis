package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class PaidContentMiniDramaInfo implements Serializable {

    @C09CT("cta_display_config")
    public CtaDisplayConfig ctaDisplayConfig;

    @C09CT("episode_num_in_list")
    public Integer episodeNumInList;

    @C09CT("inner_feed_panel_desc")
    public String innerFeedPanelDesc;

    @C09CT("inner_feed_panel_free_tag_text")
    public String innerFeedPanelFreeTagText;

    @C09CT("inner_feed_panel_title")
    public String innerFeedPanelTitle;

    @C09CT("is_highlight")
    public Boolean isHighLight;

    @C09CT("is_inner_feed_recommend_video")
    public Boolean isInnerFeedRecommendVideo;

    @C09CT("is_jump_last_watch")
    public Boolean isJumpLastWatch;

    @C09CT("is_last_watch")
    public Boolean isLastWatch;

    @C09CT("jump_episode_video_id")
    public String jumpEpisodeVideoId;

    @C09CT("jump_episode_video_offset_ms")
    public Long jumpEpisodeVideoOffsetMs;

    @C09CT("log_extra")
    public Map<String, String> logExtra;

    @C09CT("pine_drama_card_type")
    public String pineDramaCardType;

    @C09CT("series_video_type")
    public String seriesVideoType;

    @C09CT("video_cnt_in_list")
    public Integer videoCountInList;

    @C09CT("video_title_prefix")
    public String videoTitlePrefix;

    @C09CT("video_title_prefix_for_episodes")
    public String videoTitlePrefixForEpisodes;

    @C09CT("video_total_nums")
    public Integer videoTotalNums;

    public final CtaDisplayConfig getCtaDisplayConfig() {
        return this.ctaDisplayConfig;
    }

    public final Integer getEpisodeNumInList() {
        return this.episodeNumInList;
    }

    public final String getInnerFeedPanelDesc() {
        return this.innerFeedPanelDesc;
    }

    public final String getInnerFeedPanelFreeTagText() {
        return this.innerFeedPanelFreeTagText;
    }

    public final String getInnerFeedPanelTitle() {
        return this.innerFeedPanelTitle;
    }

    public final String getJumpEpisodeVideoId() {
        return this.jumpEpisodeVideoId;
    }

    public final Long getJumpEpisodeVideoOffsetMs() {
        return this.jumpEpisodeVideoOffsetMs;
    }

    public final Map<String, String> getLogExtra() {
        return this.logExtra;
    }

    public final String getPineDramaCardType() {
        return this.pineDramaCardType;
    }

    public final String getSeriesVideoType() {
        return this.seriesVideoType;
    }

    public final Integer getVideoCountInList() {
        return this.videoCountInList;
    }

    public final String getVideoTitlePrefix() {
        return this.videoTitlePrefix;
    }

    public final String getVideoTitlePrefixForEpisodes() {
        return this.videoTitlePrefixForEpisodes;
    }

    public final Integer getVideoTotalNums() {
        return this.videoTotalNums;
    }

    public final Boolean isHighLight() {
        return this.isHighLight;
    }

    public final Boolean isInnerFeedRecommendVideo() {
        return this.isInnerFeedRecommendVideo;
    }

    public final Boolean isJumpLastWatch() {
        return this.isJumpLastWatch;
    }

    public final Boolean isLastWatch() {
        return this.isLastWatch;
    }

    public final void setCtaDisplayConfig(CtaDisplayConfig ctaDisplayConfig) {
        this.ctaDisplayConfig = ctaDisplayConfig;
    }

    public final void setEpisodeNumInList(Integer num) {
        this.episodeNumInList = num;
    }

    public final void setHighLight(Boolean bool) {
        this.isHighLight = bool;
    }

    public final void setInnerFeedPanelDesc(String str) {
        this.innerFeedPanelDesc = str;
    }

    public final void setInnerFeedPanelFreeTagText(String str) {
        this.innerFeedPanelFreeTagText = str;
    }

    public final void setInnerFeedPanelTitle(String str) {
        this.innerFeedPanelTitle = str;
    }

    public final void setInnerFeedRecommendVideo(Boolean bool) {
        this.isInnerFeedRecommendVideo = bool;
    }

    public final void setJumpEpisodeVideoId(String str) {
        this.jumpEpisodeVideoId = str;
    }

    public final void setJumpEpisodeVideoOffsetMs(Long l) {
        this.jumpEpisodeVideoOffsetMs = l;
    }

    public final void setJumpLastWatch(Boolean bool) {
        this.isJumpLastWatch = bool;
    }

    public final void setLastWatch(Boolean bool) {
        this.isLastWatch = bool;
    }

    public final void setLogExtra(Map<String, String> map) {
        this.logExtra = map;
    }

    public final void setPineDramaCardType(String str) {
        this.pineDramaCardType = str;
    }

    public final void setSeriesVideoType(String str) {
        this.seriesVideoType = str;
    }

    public final void setVideoCountInList(Integer num) {
        this.videoCountInList = num;
    }

    public final void setVideoTitlePrefix(String str) {
        this.videoTitlePrefix = str;
    }

    public final void setVideoTitlePrefixForEpisodes(String str) {
        this.videoTitlePrefixForEpisodes = str;
    }

    public final void setVideoTotalNums(Integer num) {
        this.videoTotalNums = num;
    }
}
