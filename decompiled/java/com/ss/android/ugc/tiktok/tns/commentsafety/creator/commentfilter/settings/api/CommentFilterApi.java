package com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.settings.api;

import X.C11NZ;
import X.C20573415eu;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes32.dex */
public interface CommentFilterApi {
    public static final C20573415eu LIZ = C20573415eu.LIZ;

    @InterfaceC1501170pAR("/tiktok/v1/comment/filter/trigger/")
    C11NZ<BaseResponse> triggerSyncServerCommentFilter();
}
