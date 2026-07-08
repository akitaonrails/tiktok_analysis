package com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.api;

import X.C0X52;
import X.C1892100zKy;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.model.GetFypAffiliateInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.model.GetFypAffiliateInfoResponse;

/* JADX INFO: loaded from: classes29.dex */
public interface EcProductAddApi {
    public static final C1892100zKy LIZ = C1892100zKy.LIZ;

    @InterfaceC1501170pAR("/api/v1/oec/affiliate/fyp_info/get")
    Object fetchEcFypProductAddButtonData(@InterfaceC1485405rg GetFypAffiliateInfoRequest getFypAffiliateInfoRequest, InterfaceC1364105Vn<? super C0X52<Response<GetFypAffiliateInfoResponse>>> interfaceC1364105Vn);
}
