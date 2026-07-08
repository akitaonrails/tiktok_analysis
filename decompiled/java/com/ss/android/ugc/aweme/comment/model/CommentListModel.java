package com.ss.android.ugc.aweme.comment.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentListModel implements Serializable {
    public Boolean commentAdAreaSwitch;
    public long commentCount;
    public boolean exposedCommentUseCacheData;
    public String highlightCids;
    public boolean highlightWithoutScroll;
    public String insertCid;
    public Boolean isCommentBanned;
    public Boolean isCommentClose;
    public Boolean isCommentEnable;
    public String needPerformAccessibilityCid;
    public long outterCommentCount;
    public Long pollId;
    public int securityGuide;
    public String sessionId;
    public boolean shouldShowVideoDesc;
    public boolean showReplyWithInsert;
    public boolean showRepostGuideTooltip;
    public boolean smoothScrollToHighlightComment;
    public final List<String> highlightedWord = new ArrayList();
    public int firstRefreshCount = -1;

    public final Boolean getCommentAdAreaSwitch() {
        return this.commentAdAreaSwitch;
    }

    public final long getCommentCount() {
        return this.commentCount;
    }

    public final boolean getExposedCommentUseCacheData() {
        return this.exposedCommentUseCacheData;
    }

    public final int getFirstRefreshCount() {
        return this.firstRefreshCount;
    }

    public final String getHighlightCids() {
        return this.highlightCids;
    }

    public final boolean getHighlightWithoutScroll() {
        return this.highlightWithoutScroll;
    }

    public final List<String> getHighlightedWord() {
        return this.highlightedWord;
    }

    public final String getInsertCid() {
        return this.insertCid;
    }

    public final String getNeedPerformAccessibilityCid() {
        return this.needPerformAccessibilityCid;
    }

    public final long getOutterCommentCount() {
        return this.outterCommentCount;
    }

    public final Long getPollId() {
        return this.pollId;
    }

    public final int getSecurityGuide() {
        return this.securityGuide;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final boolean getShouldShowVideoDesc() {
        return this.shouldShowVideoDesc;
    }

    public final boolean getShowReplyWithInsert() {
        return this.showReplyWithInsert;
    }

    public final boolean getShowRepostGuideTooltip() {
        return this.showRepostGuideTooltip;
    }

    public final boolean getSmoothScrollToHighlightComment() {
        return this.smoothScrollToHighlightComment;
    }

    public final Boolean isCommentBanned() {
        return this.isCommentBanned;
    }

    public final Boolean isCommentClose() {
        return this.isCommentClose;
    }

    public final Boolean isCommentEnable() {
        return this.isCommentEnable;
    }

    public final void setCommentAdAreaSwitch(Boolean bool) {
        this.commentAdAreaSwitch = bool;
    }

    public final void setCommentBanned(Boolean bool) {
        this.isCommentBanned = bool;
    }

    public final void setCommentClose(Boolean bool) {
        this.isCommentClose = bool;
    }

    public final void setCommentCount(long j) {
        this.commentCount = j;
    }

    public final void setCommentEnable(Boolean bool) {
        this.isCommentEnable = bool;
    }

    public final void setExposedCommentUseCacheData(boolean z) {
        this.exposedCommentUseCacheData = z;
    }

    public final void setFirstRefreshCount(int i) {
        this.firstRefreshCount = i;
    }

    public final void setHighlightCids(String str) {
        this.highlightCids = str;
    }

    public final void setHighlightWithoutScroll(boolean z) {
        this.highlightWithoutScroll = z;
    }

    public final void setInsertCid(String str) {
        this.insertCid = str;
    }

    public final void setNeedPerformAccessibilityCid(String str) {
        this.needPerformAccessibilityCid = str;
    }

    public final void setOutterCommentCount(long j) {
        this.outterCommentCount = j;
    }

    public final void setPollId(Long l) {
        this.pollId = l;
    }

    public final void setSecurityGuide(int i) {
        this.securityGuide = i;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setShouldShowVideoDesc(boolean z) {
        this.shouldShowVideoDesc = z;
    }

    public final void setShowReplyWithInsert(boolean z) {
        this.showReplyWithInsert = z;
    }

    public final void setShowRepostGuideTooltip(boolean z) {
        this.showRepostGuideTooltip = z;
    }

    public final void setSmoothScrollToHighlightComment(boolean z) {
        this.smoothScrollToHighlightComment = z;
    }
}
