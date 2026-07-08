package com.ss.android.ugc.aweme.ogc.news.anchor.consumer.repo;

import X.C040I;
import X.C09CT;
import X.C1066770drn;
import X.C11NZ;
import X.InterfaceC1501240pAY;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes17.dex */
public interface NewsAnchorStatusApi {
    public static final C1066770drn LIZ = C1066770drn.LIZ;

    @InterfaceC1501240pAY("tiktok/v1/news/toast/mark_shown")
    C11NZ<BaseResponse> LIZ(@C040I MarkShowRequest markShowRequest);

    public static final class MarkShowRequest {

        @C09CT("anchor_id")
        public final String anchorId;

        @C09CT("toast_type")
        public final String type;

        public MarkShowRequest(String str, String str2) {
            this.anchorId = str;
            this.type = str2;
        }
    }
}
