package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class MusicList extends BaseResponse {

    @C09CT("child_collections")
    public List<MusicCollectionItem> childCollections;

    @C09CT("cursor")
    public int cursor;

    @C09CT("extra_params")
    public String extraParams;

    @C09CT("from_recommend")
    public Boolean fromRecommend = Boolean.FALSE;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("is_vertical_playlist")
    public Boolean isVerticalPlaylist;

    @C09CT("music_list")
    public List<Music> items;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("music_type")
    public int mMusicType;

    @C09CT("similar_song_ids")
    public List<Long> mSimilarSongIDs;

    @C09CT("mc_info")
    public MusicCollectionItem mcInfo;

    @C09CT("radio_cursor")
    public int radioCursor;

    @C09CT("recall_info_list")
    public List<MusicRecallInfo> recallInfo;

    @C09CT("smart_extend_music_list")
    public List<SmartExtendMusicData> smartExtendMusicDataList;

    @C09CT("suggestion_id")
    public Long suggestionId;

    public int getCursor() {
        int i = this.radioCursor;
        return i > 0 ? i : this.cursor;
    }

    public Boolean getIsVerticalPlaylist() {
        Boolean bool = this.isVerticalPlaylist;
        return Boolean.valueOf(bool != null && bool.booleanValue());
    }

    public boolean isHasMore() {
        return this.hasMore == 1;
    }

    public List<MusicCollectionItem> getChildCollections() {
        return this.childCollections;
    }

    public String getExtraParams() {
        return this.extraParams;
    }

    public Boolean getFromRecommend() {
        return this.fromRecommend;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public List<Music> getItems() {
        return this.items;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public MusicCollectionItem getMcInfo() {
        return this.mcInfo;
    }

    public int getMusicType() {
        return this.mMusicType;
    }

    public int getRadioCursor() {
        return this.radioCursor;
    }

    public List<MusicRecallInfo> getRecallInfo() {
        return this.recallInfo;
    }

    public List<Long> getSimilarSongIds() {
        return this.mSimilarSongIDs;
    }

    public List<SmartExtendMusicData> getSmartExtendMusicDataList() {
        return this.smartExtendMusicDataList;
    }

    public Long getSuggestionId() {
        return this.suggestionId;
    }

    public void setChildCollections(List<MusicCollectionItem> list) {
        this.childCollections = list;
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public void setExtraParams(String str) {
        this.extraParams = str;
    }

    public void setFromRecommend(Boolean bool) {
        this.fromRecommend = bool;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z ? 1 : 0;
    }

    public void setIsVerticalPlaylist(Boolean bool) {
        this.isVerticalPlaylist = bool;
    }

    public void setItems(List<Music> list) {
        this.items = list;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setMcInfo(MusicCollectionItem musicCollectionItem) {
        this.mcInfo = musicCollectionItem;
    }

    public void setMusicType(int i) {
        this.mMusicType = i;
    }

    public void setRadioCursor(int i) {
        this.radioCursor = i;
    }

    public void setRecallInfo(List<MusicRecallInfo> list) {
        this.recallInfo = list;
    }

    public void setSmartExtendMusicDataList(List<SmartExtendMusicData> list) {
        this.smartExtendMusicDataList = list;
    }

    public void setSuggestionId(Long l) {
        this.suggestionId = l;
    }

    public void setsimilarSongIDs(List<Long> list) {
        this.mSimilarSongIDs = list;
    }
}
