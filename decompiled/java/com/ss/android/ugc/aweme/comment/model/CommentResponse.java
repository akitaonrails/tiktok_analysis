package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class CommentResponse extends BaseCommentResponse {

    @C09CT("comment")
    public Comment comment;

    @C09CT("rethink_popup")
    public CommentRethinkPopup commentRethinkPopup;

    @C09CT("comment_surprise")
    public CommentSurprise commentSurprise;

    @C09CT("label_info")
    public String starFakeLabel;

    @C09CT("user_badge_info_list")
    public List<CmtUserBadgeInfoStruct> userBadgeInfoList;

    public String getStarFakeLabel() {
        return this.starFakeLabel;
    }

    public void setStarFakeLabel(String str) {
        this.starFakeLabel = str;
        this.comment.setLabelInfo(str);
    }
}
