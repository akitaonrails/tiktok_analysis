package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.shopbag.api;

import X.C0X52;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimationRequestBody;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimationResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes30.dex */
public interface BagAnimationApi {
    @InterfaceC1501170pAR("/aweme/v1/oec/live/bag/icon/animation")
    Object getBagIconAnimationData(@InterfaceC1485405rg LiveBagIconAnimationRequestBody liveBagIconAnimationRequestBody, InterfaceC1364105Vn<? super C0X52<Response<LiveBagIconAnimationResponse>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/aweme/v1/oec/live/bag/icon/animation")
    Object getBagIconAnimationData(@InterfaceC1485405rg Map<String, String> map, InterfaceC1364105Vn<? super C0X52<Response<LiveBagIconAnimationResponse>>> interfaceC1364105Vn);
}
