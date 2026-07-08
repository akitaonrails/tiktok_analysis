package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api;

import X.C181E;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse;

/* JADX INFO: loaded from: classes33.dex */
public interface BcToggleApi {
    public static final C181E LIZ = C181E.LIZ;

    @InterfaceC1501170pAR("/aweme/v1/oec/creator/sale_mode/get")
    Object getCreatorSaleMode(@InterfaceC1485405rg SelfSaleModeRequestBody selfSaleModeRequestBody, InterfaceC1364105Vn<? super BaseResponse<SaleMode>> interfaceC1364105Vn);
}
