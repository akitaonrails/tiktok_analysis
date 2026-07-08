package com.ss.android.ugc.aweme.component.comment;

import X.C0X9S;
import X.C1012420cS8;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.component.comment.model.PromoCodeAddNoticeRequest;

/* JADX INFO: loaded from: classes17.dex */
public interface PromoCodeApi {
    public static final C1012420cS8 LIZ = C1012420cS8.LIZ;

    @InterfaceC1501170pAR("/tiktok/v1/ad/promo_code/notice/add/")
    C0X9S<BaseResponse> addNotice(@InterfaceC1485405rg PromoCodeAddNoticeRequest promoCodeAddNoticeRequest);
}
