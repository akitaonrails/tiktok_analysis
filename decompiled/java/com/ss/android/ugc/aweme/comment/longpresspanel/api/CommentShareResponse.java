package com.ss.android.ugc.aweme.comment.longpresspanel.api;

import X.C09CT;
import X.C0XIR;
import com.ss.android.ugc.aweme.comment.model.CommentShareInfo;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class CommentShareResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("share_info")
    public final CommentShareInfo shareInfo;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public CommentShareResponse() {
        this(null, 0, "", null);
    }

    public final CommentShareResponse checkValid() {
        if (this.statusCode == 0) {
            return this;
        }
        C0XIR c0xir = new C0XIR(this.statusCode);
        c0xir.setErrorMsg(this.statusMsg);
        c0xir.setResponse(this);
        throw c0xir;
    }

    public CommentShareResponse(CommentShareInfo commentShareInfo, int i, String str, LogPbBean logPbBean) {
        this.shareInfo = commentShareInfo;
        this.statusCode = i;
        this.statusMsg = str;
        this.logPb = logPbBean;
    }
}
