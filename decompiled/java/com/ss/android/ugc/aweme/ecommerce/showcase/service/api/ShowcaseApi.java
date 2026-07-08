package com.ss.android.ugc.aweme.ecommerce.showcase.service.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;

/* JADX INFO: loaded from: classes10.dex */
public interface ShowcaseApi {
    @InterfaceC1501160pAQ("/api/showcase/v1/creator_info/get")
    Object getCreatorInfo(@InterfaceC1501070pAH("creator_uid") String str, @InterfaceC1501070pAH("enter_from") String str2, InterfaceC1364105Vn<? super Response<n>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/showcase/v1/product/list")
    Object getProductList(@InterfaceC1485405rg n nVar, InterfaceC1364105Vn<? super Response<n>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/showcase/v1/product/tab/list")
    Object getProductTab(@InterfaceC1501070pAH("creator_id") String str, @InterfaceC1501070pAH("enter_from") String str2, InterfaceC1364105Vn<? super Response<n>> interfaceC1364105Vn);
}
