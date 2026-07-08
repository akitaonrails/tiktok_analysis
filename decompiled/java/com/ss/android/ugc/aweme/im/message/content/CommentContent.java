package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class CommentContent extends BaseContent {

    @C09CT("author_id")
    public String authorId;

    @C09CT("author_name")
    public String authorName;

    @C09CT("avatar_url")
    public UrlModel avatarUrl;

    @C09CT("aweme_author_uid")
    public String awemeAuthorUid;

    @C09CT("aweme_id")
    public String awemeId;

    @C09CT("comment_video_status")
    public int awemeStatus;

    @C09CT("aweme_type")
    public int awemeType;

    @C09CT("comment")
    public String comment;

    @C09CT("comment_id")
    public String commentId;

    @C09CT("comment_media_type")
    public int commentMediaType;

    @C09CT("comment_status")
    public int commentStatus = 1;

    @C09CT("cover_url")
    public UrlModel coverUrl;

    @C09CT("comment_image_list")
    public List<? extends UrlModel> imageList;

    @C09CT("is_reply_with_video")
    public boolean isReplyWithVideo;

    @C09CT("is_sub_comment")
    public boolean isSubComment;

    @C09CT("comment_like_count")
    public int likeCount;

    @C09CT("comment_reply_count")
    public long replyCount;

    @C09CT("reply_user_id")
    public String replyUserId;

    @C09CT("reply_user_name")
    public String replyUserName;

    @C09CT("comment_reply_aweme_id")
    public String replyWithVideoAwemeId;

    @C09CT("comment_reply_cover_url")
    public UrlModel replyWithVideoCover;

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final UrlModel getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getAwemeAuthorUid() {
        return this.awemeAuthorUid;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final int getAwemeStatus() {
        return this.awemeStatus;
    }

    public final int getAwemeType() {
        return this.awemeType;
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getCommentId() {
        return this.commentId;
    }

    public final int getCommentMediaType() {
        return this.commentMediaType;
    }

    public final int getCommentStatus() {
        return this.commentStatus;
    }

    public final UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public final List<UrlModel> getImageList() {
        return this.imageList;
    }

    public final int getLikeCount() {
        return this.likeCount;
    }

    public final long getReplyCount() {
        return this.replyCount;
    }

    public final String getReplyUserId() {
        return this.replyUserId;
    }

    public final String getReplyUserName() {
        return this.replyUserName;
    }

    public final String getReplyWithVideoAwemeId() {
        return this.replyWithVideoAwemeId;
    }

    public final UrlModel getReplyWithVideoCover() {
        return this.replyWithVideoCover;
    }

    public final boolean isReplyWithVideo() {
        return this.isReplyWithVideo;
    }

    public final boolean isSubComment() {
        return this.isSubComment;
    }

    public final void setAuthorId(String str) {
        this.authorId = str;
    }

    public final void setAuthorName(String str) {
        this.authorName = str;
    }

    public final void setAvatarUrl(UrlModel urlModel) {
        this.avatarUrl = urlModel;
    }

    public final void setAwemeAuthorUid(String str) {
        this.awemeAuthorUid = str;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setAwemeStatus(int i) {
        this.awemeStatus = i;
    }

    public final void setAwemeType(int i) {
        this.awemeType = i;
    }

    public final void setComment(String str) {
        this.comment = str;
    }

    public final void setCommentId(String str) {
        this.commentId = str;
    }

    public final void setCommentMediaType(int i) {
        this.commentMediaType = i;
    }

    public final void setCommentStatus(int i) {
        this.commentStatus = i;
    }

    public final void setCoverUrl(UrlModel urlModel) {
        this.coverUrl = urlModel;
    }

    public final void setImageList(List<? extends UrlModel> list) {
        this.imageList = list;
    }

    public final void setLikeCount(int i) {
        this.likeCount = i;
    }

    public final void setReplyCount(long j) {
        this.replyCount = j;
    }

    public final void setReplyUserId(String str) {
        this.replyUserId = str;
    }

    public final void setReplyUserName(String str) {
        this.replyUserName = str;
    }

    public final void setReplyWithVideo(boolean z) {
        this.isReplyWithVideo = z;
    }

    public final void setReplyWithVideoAwemeId(String str) {
        this.replyWithVideoAwemeId = str;
    }

    public final void setReplyWithVideoCover(UrlModel urlModel) {
        this.replyWithVideoCover = urlModel;
    }

    public final void setSubComment(boolean z) {
        this.isSubComment = z;
    }
}
