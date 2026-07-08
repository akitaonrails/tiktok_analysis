package com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.service;

import X.C20225514Bx;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import X.InterfaceC2174708fZ;
import com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.model.ShopifySkuCheckoutDataInteractRequest;
import com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.model.ShopifySkuCheckoutProductDetailRequest;
import com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.model.ShopifySkuCheckoutProductDetailResponse;

/* JADX INFO: loaded from: classes31.dex */
public interface ShopifySkuCheckoutApi {
    public static final C20225514Bx LIZ = C20225514Bx.LIZ;

    @InterfaceC1501160pAQ
    @InterfaceC1501310pAf({"Content-Type: application/json", "x-tt-dataflow-id: 0x28000404", "x-tt-pns-dt-pass-id: 0x10080007", "x-metasec-network-zone: 2", "x-metasec-bypass-ttnet-features: 1"})
    Object getRaw(@InterfaceC2174708fZ String str, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/mcp")
    @InterfaceC1501310pAf({"Content-Type: application/json", "x-tt-dataflow-id: 0x28000404", "x-tt-pns-dt-pass-id: 0x10080007", "x-metasec-network-zone: 2", "x-metasec-bypass-ttnet-features: 1"})
    Object getShopifyProductDetail(@InterfaceC1485405rg ShopifySkuCheckoutProductDetailRequest shopifySkuCheckoutProductDetailRequest, InterfaceC1364105Vn<? super ShopifySkuCheckoutProductDetailResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/ad/v{version}/data_interact")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    Object postDataInteract(@InterfaceC1501060pAG("version") String str, @InterfaceC1485405rg ShopifySkuCheckoutDataInteractRequest shopifySkuCheckoutDataInteractRequest, InterfaceC1364105Vn<? super Void> interfaceC1364105Vn);
}
