package com.ss.android.ugc.aweme.repo;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;

/* JADX INFO: loaded from: classes22.dex */
public final class CreateDanmakuResponse extends BaseResponse {

    @C09CT("danmaku_id")
    public final String danmakuId = "";

    @C09CT("rethink_toast")
    public final CommentRethinkPopup rethinkToast;

    public final String getDanmakuId() {
        return this.danmakuId;
    }

    public final CommentRethinkPopup getRethinkToast() {
        return this.rethinkToast;
    }
}
