package com.ss.android.ugc.aweme.ecommerce.showcase.service.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public interface ShopApi {
    @InterfaceC1501170pAR("/api/shop/v1/relation/follow_and_claim")
    Object followAndClaim(@InterfaceC1485405rg FollowShopAndClaimRequest followShopAndClaimRequest, InterfaceC1364105Vn<? super Response<FollowShopAndClaimData>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/shop/v1/relation/follow_and_claim")
    Object followAndClaimWithRawJson(@InterfaceC1485405rg Map<String, Object> map, InterfaceC1364105Vn<? super Response<FollowShopAndClaimData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/shop/v1/category/info/get")
    Object getCategoryTabInfo(@InterfaceC1501070pAH("seller_id") String str, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/shop/v1/creator/info/get")
    Object getCreatorShopInfo(@InterfaceC1501070pAH("creator_uid") String str, @InterfaceC1501070pAH("ec_common_api_preload") int i, InterfaceC1364105Vn<? super Response<n>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/shop/v1/marketing_tab/info/get")
    Object getMarketingTabInfo(@InterfaceC1501070pAH("seller_id") String str, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/shop/v1/mega_sale/product/list")
    Object getMegaSaleProductList(@InterfaceC1485405rg MegaSaleProductListRequestBody megaSaleProductListRequestBody, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/shop/v1/product/list")
    Object getProductList(@InterfaceC1485405rg ProductListRequestBody productListRequestBody, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/shop/v1/product/list")
    Object getProductListResponse(@InterfaceC1485405rg ProductListRequestBody productListRequestBody, InterfaceC1364105Vn<? super Response<n>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/shop/v1/product/list")
    Object getProductListResponseJSON(@InterfaceC1485405rg n nVar, InterfaceC1364105Vn<? super n> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/shop/v1/homepage/first_screen/get")
    Object getShopFirstScreen(@InterfaceC1485405rg n nVar, InterfaceC1364105Vn<? super n> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/shop/v1/homepage/get")
    Object getShopHomepage(@InterfaceC1501070pAH("seller_id") String str, InterfaceC1364105Vn<? super Response<n>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/shop/v1/homepage/get")
    Object getShopHomepageJSON(@InterfaceC1501070pAH("seller_id") String str, @InterfaceC1501070pAH("gecko_version") Long l, @InterfaceC1501070pAH("shop_benefit_experiment") int i, InterfaceC1364105Vn<? super n> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/shop/v1/product/tab/list")
    Object getShopHomepageProductFilterList(@InterfaceC1501070pAH("seller_id") String str, @InterfaceC1501070pAH("priority_filter") String str2, @InterfaceC1501070pAH("enter_from") String str3, InterfaceC1364105Vn<? super Response<n>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/shop/v1/product/tab/list")
    Object getShopHomepageProductFilterListJSON(@InterfaceC1501070pAH("seller_id") String str, @InterfaceC1501070pAH("priority_filter") String str2, @InterfaceC1501070pAH("enter_from") String str3, @InterfaceC1501070pAH("gecko_version") Long l, InterfaceC1364105Vn<? super n> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/shop/v1/homepage/tab/list")
    Object getShopHomepageTabList(@InterfaceC1501070pAH("seller_id") String str, @InterfaceC1501070pAH("source_previous_page") String str2, @InterfaceC1501070pAH("custom_tab") String str3, InterfaceC1364105Vn<? super Response<n>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/shop/v1/homepage/tab/list")
    Object getShopHomepageTabListJSON(@InterfaceC1501070pAH("seller_id") String str, @InterfaceC1501070pAH("gecko_version") Long l, @InterfaceC1501070pAH("source_previous_page") String str2, @InterfaceC1501070pAH("custom_tab") String str3, InterfaceC1364105Vn<? super n> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/shop/v1/homepage/get_v2")
    Object getShopHomepageV2(@InterfaceC1485405rg n nVar, InterfaceC1364105Vn<? super Response<n>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/shop/v1/homepage/first_screen/prefetch")
    Object getShopPrefetch(@InterfaceC1485405rg n nVar, InterfaceC1364105Vn<? super n> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/shop/v1/share")
    Object getShopShareInfo(@InterfaceC1485405rg GetShopShareInfoRequest getShopShareInfoRequest, InterfaceC1364105Vn<? super Response<Object>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/showcase/v1/profile_tab_product/list_prefetch")
    Object getTabShowcasePrefetchProducts(@InterfaceC1485405rg ShowcaseProductRequest showcaseProductRequest, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/showcase/v1/profile_tab_product/list")
    Object getTabShowcaseProducts(@InterfaceC1485405rg ShowcaseProductRequest showcaseProductRequest, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/shop/v1/homepage/header")
    Object homepageHeader(@InterfaceC1501070pAH("seller_id") String str, InterfaceC1364105Vn<? super n> interfaceC1364105Vn);
}
