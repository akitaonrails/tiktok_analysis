package com.ss.android.ugc.profile.business.commerce;

import X.C11NZ;
import X.C1214330hhn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes20.dex */
public interface ProfileAdvancedFeaturesOrderUpdateAPI {
    public static final C1214330hhn LIZ = C1214330hhn.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/user/setting/advance_feature/order/update/v1")
    C11NZ<BaseResponse> updateAdvancedFeaturesOrder(@InterfaceC1501050pAF("advance_feature_item_order") String str);
}
