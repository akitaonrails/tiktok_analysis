package com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.api;

import X.AnonymousClass1885;
import X.C0X52;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSACardsRequest;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSACardsResponse;

/* JADX INFO: loaded from: classes33.dex */
public interface VSAApi {
    public static final AnonymousClass1885 LIZ = AnonymousClass1885.LIZ;

    @InterfaceC1501170pAR("/api/v1/mall/vsa/product/get")
    Object fetchVSAProductCards(@InterfaceC1485405rg VSACardsRequest vSACardsRequest, InterfaceC1364105Vn<? super C0X52<Response<VSACardsResponse>>> interfaceC1364105Vn);
}
