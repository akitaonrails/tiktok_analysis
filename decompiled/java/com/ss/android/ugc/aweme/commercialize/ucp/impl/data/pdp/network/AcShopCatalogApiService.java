package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.network;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.AcShopCatalogRequestDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.AcShopCatalogResponseDto;

/* JADX INFO: loaded from: classes5.dex */
public interface AcShopCatalogApiService {
    @InterfaceC1501170pAR("/api/ad/acshop/catalog/v1/")
    Object getCatalog(@InterfaceC1485405rg AcShopCatalogRequestDto acShopCatalogRequestDto, InterfaceC1364105Vn<? super AcShopCatalogResponseDto> interfaceC1364105Vn);
}
