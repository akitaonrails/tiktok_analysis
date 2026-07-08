package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeExtraData implements Serializable {

    @C09CT("aweme")
    public final Aweme aweme;

    @C09CT("comment")
    public final Comment comment;

    @C09CT("comment_suggest_info")
    public final CommentSuggestInfo commentSuggestInfo;

    @C09CT("aweme_invalid")
    public final boolean isAwemeInvalid;

    @C09CT("message_info")
    public final NoticeMessageData messageData;

    @C09CT("nudge_info")
    public final NudgeData nudgeData;

    @C09CT("sticker_info")
    public final NewFaceStickerBean sticker;

    public NoticeExtraData() {
        this(null, false, null, null, null, null, null);
    }

    public final boolean isAwemeInvalid() {
        return this.isAwemeInvalid;
    }

    public NoticeExtraData(Comment comment, boolean z, Aweme aweme, NewFaceStickerBean newFaceStickerBean, NudgeData nudgeData, NoticeMessageData noticeMessageData, CommentSuggestInfo commentSuggestInfo) {
        this.comment = comment;
        this.isAwemeInvalid = z;
        this.aweme = aweme;
        this.sticker = newFaceStickerBean;
        this.nudgeData = nudgeData;
        this.messageData = noticeMessageData;
        this.commentSuggestInfo = commentSuggestInfo;
    }
}
