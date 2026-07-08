package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api;

import X.C040F;
import X.C040I;
import X.C0X52;
import X.C11NZ;
import X.C1758520vrW;
import X.C1758570vrb;
import X.C1758700vro;
import X.C1758710vrp;
import X.C1758720vrq;
import X.C1758730vrr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501240pAY;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleDealRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecommendPreloadRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecommendPreloadResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommendResponse;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public interface PdpApi {
    public static final C1758570vrb LIZ = C1758570vrb.LIZ;

    @InterfaceC1501240pAY("https://oec-api.tiktokv.com/aweme/v1/oec/creator_union/chain_collector/visit_event/report")
    C11NZ<Response<Object>> LIZ(@C040I Map<String, Object> map);

    @InterfaceC1501240pAY("/api/v1/shop/promotion_info/get")
    Object LIZIZ(@C040I PromotionInfoRequest promotionInfoRequest, InterfaceC1364105Vn<? super C1758730vrr> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/check_pop_up")
    Object LIZJ(@C040I CheckPopUpRequest checkPopUpRequest, InterfaceC1364105Vn<? super CheckPopUpResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v2/shop/bundle_info/get")
    Object LIZLLL(@C040I BundleDealRequest bundleDealRequest, InterfaceC1364105Vn<? super BundleInfoResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("api/v2/shop/sdui_pdp/get")
    C11NZ<C0X52<C1758720vrq>> getGodaV2PdpInfoRaw(@C040I Map<String, Object> map, @C040F HashMap<String, String> map2);

    @InterfaceC1501240pAY("/api/v1/shop/recommend/feed/pdp_get_preload")
    Object getProductRecommend(@C040I PdpRecommendPreloadRequest pdpRecommendPreloadRequest, @C040F HashMap<String, String> map, InterfaceC1364105Vn<? super PdpRecommendPreloadResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("api/v2/shop/sdui_pdp/batch_preload")
    C11NZ<C1758520vrW> getSDUIPdpBatchV2(@C040I Map<String, Object> map, @C040F HashMap<String, String> map2);

    @InterfaceC1501240pAY("api/v1/shop/sdui_pdp/get")
    C11NZ<C0X52<C1758710vrp>> getSDUIPdpInfoRaw(@C040I Map<String, Object> map, @C040F HashMap<String, String> map2);

    @InterfaceC1501240pAY("/api/v1/shop/recommend/same_shop/get")
    Object getShopRecommend(@C040I PdpRecommendPreloadRequest pdpRecommendPreloadRequest, @C040F HashMap<String, String> map, InterfaceC1364105Vn<? super ShopRecommendResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("api/v2/shop/sdui_pdp/get")
    Object refreshPdpGodaV2SDUI(@C040I Map<String, Object> map, @C040F HashMap<String, String> map2, InterfaceC1364105Vn<? super C0X52<C1758700vro>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("api/v1/shop/sdui_pdp/get")
    Object refreshPdpSDUI(@C040I Map<String, Object> map, @C040F HashMap<String, String> map2, InterfaceC1364105Vn<? super C1758700vro> interfaceC1364105Vn);

    @InterfaceC1501240pAY("api/v1/shop/sdui_pdp/refresh")
    Object refreshSDUIPdpInfo(@C040I Map<String, Object> map, @C040F HashMap<String, String> map2, InterfaceC1364105Vn<? super C1758700vro> interfaceC1364105Vn);

    @InterfaceC1501240pAY("api/v2/shop/sdui_pdp/refresh")
    Object refreshSDUIV2PdpInfo(@C040I Map<String, Object> map, @C040F HashMap<String, String> map2, InterfaceC1364105Vn<? super C0X52<C1758700vro>> interfaceC1364105Vn);
}
