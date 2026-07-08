package com.ss.android.ugc.aweme.comment.model;

import X.AnonymousClass0957;
import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class CommentItemList extends BaseCommentResponse implements CommentJsonRawData {

    @C09CT("alias_comment_deleted")
    public boolean aliasCommentDeleted;

    @C09CT("comment_show_under_post_cid")
    public String commentShowUnderPostCid;

    @C09CT("comment_surprise")
    public CommentSurprise commentSurprise;

    @C09CT("cursor")
    public long cursor;

    @C09CT("dislike_filter_all")
    public boolean dislikeFilterAll;

    @C09CT("filtered_comments_count")
    public int filteredCommentsCount;

    @C09CT("filtered_comments_view_type")
    public int filteredCommentsViewType;

    @C09CT("fold_comment_cursor")
    public long foldCommentCursor;

    @C09CT("has_filtered_comments")
    public int hasFilteredComments;

    @C09CT("has_fold_comment")
    public boolean hasFoldComment;

    @C09CT("has_more")
    public boolean hasMore;
    public boolean hitPreRequest;

    @C09CT("hot_comment_resp")
    public boolean hotCommentResp;
    public boolean isFriendsV3Cache;
    public boolean isPreload;

    @C09CT("comments")
    public List<Comment> items;
    public AnonymousClass0957<CommentItemList> lazySplitItemsParseTask;

    @C09CT("new_insert_ids")
    public String newInsertIds;

    @C09CT("poll_info")
    public PollInfo pollInfo;
    public String preRequestMethod;

    @C09CT("reply_style")
    public int replyStyle;

    @C09CT("security_guide")
    public int securityGuide;

    @C09CT("top_gifts")
    public List<CommentGiftStruct> topGiftList;

    @C09CT("total")
    public long total;
    public String rootCid = "";
    public String jsonData = "";
    public String preloadTriggerMethod = "";

    public boolean hasFilteredComments() {
        return this.hasFilteredComments == 1;
    }

    public CommentItemList mockEmptyCommentResponse() {
        this.items = new ArrayList();
        this.cursor = 0L;
        this.total = 0L;
        this.replyStyle = 2;
        this.hasMore = false;
        this.newInsertIds = "";
        this.topGiftList = null;
        this.hasFilteredComments = 0;
        this.hasFoldComment = false;
        this.foldCommentCursor = 0L;
        this.aliasCommentDeleted = false;
        this.securityGuide = 0;
        this.filteredCommentsCount = 0;
        this.filteredCommentsViewType = 0;
        this.commentSurprise = null;
        return this;
    }

    public boolean getAliasCommentDeleted() {
        return this.aliasCommentDeleted;
    }

    public String getCommentShowUnderPostCid() {
        return this.commentShowUnderPostCid;
    }

    public CommentSurprise getCommentSurprise() {
        return this.commentSurprise;
    }

    public long getCursor() {
        return this.cursor;
    }

    public boolean getDislikeFilterAll() {
        return this.dislikeFilterAll;
    }

    public int getFilteredCommentsCount() {
        return this.filteredCommentsCount;
    }

    public int getFilteredCommentsViewType() {
        return this.filteredCommentsViewType;
    }

    public long getFoldCommentCursor() {
        return this.foldCommentCursor;
    }

    public boolean getHitPreRequest() {
        return this.hitPreRequest;
    }

    public List<Comment> getItems() {
        return this.items;
    }

    public String getNewInsertIds() {
        return this.newInsertIds;
    }

    public PollInfo getPollInfo() {
        return this.pollInfo;
    }

    public String getPreRequestMethod() {
        return this.preRequestMethod;
    }

    public String getPreloadTriggerMethod() {
        return this.preloadTriggerMethod;
    }

    public int getReplyStyle() {
        return this.replyStyle;
    }

    public String getRootCid() {
        return this.rootCid;
    }

    public int getSecurityGuide() {
        return this.securityGuide;
    }

    public List<CommentGiftStruct> getTopGiftList() {
        return this.topGiftList;
    }

    public long getTotal() {
        return this.total;
    }

    public boolean isFriendsV3Cache() {
        return this.isFriendsV3Cache;
    }

    public boolean isHasFoldComment() {
        return this.hasFoldComment;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public boolean isHotCommentResp() {
        return this.hotCommentResp;
    }

    public boolean isPreload() {
        return this.isPreload;
    }

    public void setAliasCommentDeleted(boolean z) {
        this.aliasCommentDeleted = z;
    }

    public void setCommentShowUnderPostCid(String str) {
        this.commentShowUnderPostCid = str;
    }

    public void setCommentSurprise(CommentSurprise commentSurprise) {
        this.commentSurprise = commentSurprise;
    }

    public void setCursor(long j) {
        this.cursor = j;
    }

    public void setDislikeFilterAll(boolean z) {
        this.dislikeFilterAll = z;
    }

    public void setFilteredCommentsCount(int i) {
        this.filteredCommentsCount = i;
    }

    public void setFilteredCommentsViewType(int i) {
        this.filteredCommentsViewType = i;
    }

    public void setFoldCommentCursor(long j) {
        this.foldCommentCursor = j;
    }

    public void setFriendsV3Cache(boolean z) {
        this.isFriendsV3Cache = z;
    }

    public void setHasFilteredComments(int i) {
        this.hasFilteredComments = i;
    }

    public void setHasFoldComment(boolean z) {
        this.hasFoldComment = z;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setHitPreRequest(boolean z) {
        this.hitPreRequest = z;
    }

    public void setHotCommentResp(boolean z) {
        this.hotCommentResp = z;
    }

    public void setItems(List<Comment> list) {
        this.items = list;
    }

    @Override // com.ss.android.ugc.aweme.comment.model.CommentJsonRawData
    public void setJsonData(String str) {
        this.jsonData = str;
    }

    public void setNewInsertIds(String str) {
        this.newInsertIds = str;
    }

    public void setPollInfo(PollInfo pollInfo) {
        this.pollInfo = pollInfo;
    }

    public void setPreRequestMethod(String str) {
        this.preRequestMethod = str;
    }

    public void setPreload(boolean z) {
        this.isPreload = z;
    }

    public void setPreloadTriggerMethod(String str) {
        this.preloadTriggerMethod = str;
    }

    public void setReplyStyle(int i) {
        this.replyStyle = i;
    }

    public void setRootCid(String str) {
        this.rootCid = str;
    }

    public void setSecurityGuide(int i) {
        this.securityGuide = i;
    }

    public void setTopGiftList(List<CommentGiftStruct> list) {
        this.topGiftList = list;
    }

    public void setTotal(long j) {
        this.total = j;
    }
}
