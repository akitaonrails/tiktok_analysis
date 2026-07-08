package com.ss.android.ugc.aweme.comment.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentEventModel implements Serializable {
    public final List<String> availChannelList;
    public String chatType;
    public final String commentEnterMethod;
    public final String creationId;
    public String detailBtmPageId;
    public final boolean enterFullScreen;
    public final String enterMethod;
    public String exploreFromGroupId;
    public long exploreTabId;
    public String exploreTabName;
    public String externalShareOid;
    public String externalShareUrlUserId;
    public String fcpPanelScene;
    public int feedPosition;
    public String fromExplorePage;
    public final String fromGroupId;
    public final String fromPage;
    public String hasSuggestedReply;
    public final int hasTitle;
    public final int isEnterGraphicDetail;
    public final boolean isFromPostMode;
    public final boolean isHotPlayer;
    public final int isLongItem;
    public final String lastGroupId;
    public final String newsId;
    public final String parentTagId;
    public final String playListId;
    public final String playListIdKey;
    public final String playListType;
    public final int playLoops;
    public final float playPct;
    public final String previousPage;
    public final String requestId;
    public final String searchId;
    public final String searchResultId;
    public Integer splitPercent;
    public final String tagId;
    public boolean translationClicked;
    public final long videoDuration;
    public final String videoFrom;

    public CommentEventModel() {
        this("", "", "", "", "", "", "", "", "", "", "", "", 0L, 0, 0.0f, 0, 0, false, "", "", false, 0, false, "", "", "", false, "", 5, "", 0L, "", "", "", "", "", 0, null, null, new ArrayList());
    }

    public final int isEnterGraphicDetail() {
        return this.isEnterGraphicDetail;
    }

    public final boolean isFromPostMode() {
        return this.isFromPostMode;
    }

    public final boolean isHotPlayer() {
        return this.isHotPlayer;
    }

    public final int isLongItem() {
        return this.isLongItem;
    }

    public final void setChatType(String str) {
        this.chatType = str;
    }

    public final void setDetailBtmPageId(String str) {
        this.detailBtmPageId = str;
    }

    public final void setExploreFromGroupId(String str) {
        this.exploreFromGroupId = str;
    }

    public final void setExploreTabId(long j) {
        this.exploreTabId = j;
    }

    public final void setExploreTabName(String str) {
        this.exploreTabName = str;
    }

    public final void setExternalShareOid(String str) {
        this.externalShareOid = str;
    }

    public final void setExternalShareUrlUserId(String str) {
        this.externalShareUrlUserId = str;
    }

    public final void setFcpPanelScene(String str) {
        this.fcpPanelScene = str;
    }

    public final void setFeedPosition(int i) {
        this.feedPosition = i;
    }

    public final void setFromExplorePage(String str) {
        this.fromExplorePage = str;
    }

    public final void setHasSuggestedReply(String str) {
        this.hasSuggestedReply = str;
    }

    public final void setSplitPercent(Integer num) {
        this.splitPercent = num;
    }

    public final void setTranslationClicked(boolean z) {
        this.translationClicked = z;
    }

    public CommentEventModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, long j, int i, float f, int i2, int i3, boolean z, String str13, String str14, boolean z2, int i4, boolean z3, String str15, String str16, String str17, boolean z4, String str18, Integer num, String str19, long j2, String str20, String str21, String str22, String str23, String str24, int i5, String str25, String str26, List<String> list) {
        this.requestId = str;
        this.fromPage = str2;
        this.previousPage = str3;
        this.videoFrom = str4;
        this.playListType = str5;
        this.playListIdKey = str6;
        this.playListId = str7;
        this.searchId = str8;
        this.searchResultId = str9;
        this.fromGroupId = str10;
        this.tagId = str11;
        this.parentTagId = str12;
        this.videoDuration = j;
        this.playLoops = i;
        this.playPct = f;
        this.hasTitle = i2;
        this.isEnterGraphicDetail = i3;
        this.isFromPostMode = z;
        this.creationId = str13;
        this.newsId = str14;
        this.isHotPlayer = z2;
        this.isLongItem = i4;
        this.enterFullScreen = z3;
        this.enterMethod = str15;
        this.commentEnterMethod = str16;
        this.lastGroupId = str17;
        this.translationClicked = z4;
        this.chatType = str18;
        this.splitPercent = num;
        this.exploreFromGroupId = str19;
        this.exploreTabId = j2;
        this.exploreTabName = str20;
        this.fromExplorePage = str21;
        this.externalShareUrlUserId = str22;
        this.externalShareOid = str23;
        this.fcpPanelScene = str24;
        this.feedPosition = i5;
        this.hasSuggestedReply = str25;
        this.detailBtmPageId = str26;
        this.availChannelList = list;
    }
}
