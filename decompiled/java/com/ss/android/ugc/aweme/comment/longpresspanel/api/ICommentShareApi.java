package com.ss.android.ugc.aweme.comment.longpresspanel.api;

import X.C2235208pK;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes4.dex */
public interface ICommentShareApi {
    public static final C2235208pK LIZ = C2235208pK.LIZ;

    @InterfaceC1501160pAQ("tiktok/v1/comment/share")
    Object requestCommentShareInfo(@InterfaceC1501070pAH("aweme_id") String str, @InterfaceC1501070pAH("comment_id") String str2, InterfaceC1364105Vn<? super CommentShareResponse> interfaceC1364105Vn);
}
