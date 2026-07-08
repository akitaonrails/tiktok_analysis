package com.ss.android.ugc.aweme.ecommerce.common.api;

import X.C0X52;
import X.C757410TnP;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.common.model.ProductAddToShowcaseRequest;
import com.ss.android.ugc.aweme.ecommerce.common.model.ProductAddToShowcaseResponse;
import com.ss.android.ugc.aweme.ecommerce.model.GetAnchorMotionInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.model.GetAnchorMotionInfoResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface EcVideoApi {
    public static final C757410TnP LIZ = C757410TnP.LIZ;

    @InterfaceC1501170pAR("/aweme/v1/i18nshop/showcase/add")
    Object addProductToShowcase(@InterfaceC1485405rg ProductAddToShowcaseRequest productAddToShowcaseRequest, InterfaceC1364105Vn<? super C0X52<ProductAddToShowcaseResponse>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/v1/shop/anchor_motion/get")
    Object getAnchorMotionInfo(@InterfaceC1485405rg GetAnchorMotionInfoRequest getAnchorMotionInfoRequest, InterfaceC1364105Vn<? super C0X52<Response<GetAnchorMotionInfoResponse>>> interfaceC1364105Vn);
}
