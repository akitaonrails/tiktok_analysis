package com.ss.android.ugc.aweme.ecommerce.mall.mixhome;

import X.C040I;
import X.C040J;
import X.C080U;
import X.C0X52;
import X.C11NZ;
import X.C1515820pY4;
import X.C1515870pY9;
import X.C15O7;
import X.C1771330wCB;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501260pAa;
import X.InterfaceC1501310pAf;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2177008fw;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.service.video.RecommendItemsResponse;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallPageDTO;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public interface ShopMallApiWithPreload {
    public static final C1771330wCB LIZ = C1771330wCB.LIZ;

    @InterfaceC1501240pAY("api/v1/recommend/items/details")
    Object LIZ(@C040I n nVar, InterfaceC1364105Vn<? super C0X52<Response<RecommendItemsResponse>>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("api/v1/mall/homepage/bff/get")
    @InterfaceC1501310pAf({"scene:ttmall_homepage"})
    Object getShopBffData(@InterfaceC2174808fa List<C080U> list, @C040I n nVar, @InterfaceC1501260pAa Map<String, String> map, InterfaceC1364105Vn<? super C0X52<Response<n>>> interfaceC1364105Vn);

    @C040J
    @InterfaceC1501240pAY("api/v1/mall/homepage/bff/stream/get")
    @InterfaceC1501310pAf({"scene:ttmall_homepage"})
    C15O7<C1515820pY4<C1515870pY9<ECMixMallPageDTO>>> getShopBffStreamData(@InterfaceC2174808fa List<C080U> list, @C040I n nVar, @InterfaceC1501260pAa Map<String, String> map, @InterfaceC2177008fw Object obj);

    @C040J
    @InterfaceC1501240pAY("api/v1/mall/homepage/bff/stream/get")
    @InterfaceC1501310pAf({"scene:ttmall_homepage"})
    Object getShopBffStreamDataSuspend(@InterfaceC2174808fa List<C080U> list, @C040I n nVar, @InterfaceC1501260pAa Map<String, String> map, @InterfaceC2177008fw Object obj, InterfaceC1364105Vn<? super C1515820pY4<C1515870pY9<ECMixMallPageDTO>>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("api/v1/mall/homepage_feed/bff/get")
    @InterfaceC1501310pAf({"scene:ttmall_homepage"})
    Object getShopFeedBffData(@InterfaceC2174808fa List<C080U> list, @C040I n nVar, InterfaceC1364105Vn<? super C0X52<Response<n>>> interfaceC1364105Vn);

    @InterfaceC1501240pAY
    @InterfaceC1501310pAf({"scene:ttmall_homepage"})
    C11NZ<C0X52<Response<n>>> getShopMainDataPreload(@InterfaceC2174708fZ String str, @C040I n nVar, @InterfaceC1501260pAa Map<String, String> map, @InterfaceC2177008fw Object obj);

    @InterfaceC1501240pAY("api/v1/shop/recommend/impression/write")
    @InterfaceC1501310pAf({"scene:ttmall_homepage"})
    Object reportImpression(@C040I n nVar, InterfaceC1364105Vn<? super C0X52<Response<Map<String, Object>>>> interfaceC1364105Vn);
}
