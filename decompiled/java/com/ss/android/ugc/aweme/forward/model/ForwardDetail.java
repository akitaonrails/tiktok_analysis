package com.ss.android.ugc.aweme.forward.model;

import X.C09CT;
import X.C0X12;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes11.dex */
public class ForwardDetail extends BaseResponse implements C0X12 {

    @C09CT("aweme_info")
    public Aweme aweme;

    @C09CT("comment_info")
    public Comment comment;

    @C09CT("label_info")
    public String labelInfo;
    public String requestId;

    public Aweme getAweme() {
        return this.aweme;
    }

    public Comment getComment() {
        return this.comment;
    }

    public String getLabelInfo() {
        return this.labelInfo;
    }

    @Override // X.C0X12
    public String getRequestId() {
        return this.requestId;
    }

    public void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void setLabelInfo(String str) {
        this.labelInfo = str;
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        Aweme aweme = this.aweme;
        if (aweme != null) {
            aweme.setRequestId(str);
        }
        this.requestId = str;
    }
}
