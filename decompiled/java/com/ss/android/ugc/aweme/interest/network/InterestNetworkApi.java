package com.ss.android.ugc.aweme.interest.network;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public interface InterestNetworkApi {
    @InterfaceC1501240pAY("aweme/v1/user/interest/select/")
    @InterfaceC1501300pAe
    Object postLatestInterestTags(@InterfaceC1501050pAF("selectedInterestList") String str, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
