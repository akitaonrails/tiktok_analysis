package com.ss.android.ugc.profile.business.ur.longpress;

import X.AbstractC19484711Kz;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes12.dex */
public interface LongPressAwemeApi {
    @InterfaceC1501170pAR("/tiktok/user/top_item/create/v1/")
    AbstractC19484711Kz<BaseResponse> pinVideo(@InterfaceC1501070pAH("item_id") String str);

    @InterfaceC1501170pAR("/tiktok/user/top_item/delete/v1/")
    AbstractC19484711Kz<BaseResponse> unpinVideo(@InterfaceC1501070pAH("item_id") String str);
}
