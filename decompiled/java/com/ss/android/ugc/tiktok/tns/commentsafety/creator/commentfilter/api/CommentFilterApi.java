package com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.api;

import X.C100C;
import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.network.model.BaseResponse;

/* JADX INFO: loaded from: classes29.dex */
public final class CommentFilterApi {
    public static final CommentFilterApi LIZ = new CommentFilterApi();
    public static final API LIZIZ = (API) C100C.LIZ.LIZLLL().LIZJ(API.class);

    public interface API {
        @InterfaceC1501160pAQ("/aweme/v2/comment/filter/get_words/")
        C11NZ<Words> getCommentFilterKeywords();

        @InterfaceC1501170pAR("/aweme/v2/comment/filter/update_words/")
        C11NZ<BaseResponse> setCommentFilterKeywords(@InterfaceC1501070pAH("words") String str);

        @InterfaceC1501170pAR("/tiktok/v1/comment/filter/trigger/")
        C11NZ<BaseResponse> triggerSyncServerCommentFilter();
    }
}
