package com.ss.android.ugc.aweme.series.vip.api;

import X.AbstractC19484711Kz;
import X.C11NZ;
import X.C1808870xAj;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.google.gson.n;

/* JADX INFO: loaded from: classes28.dex */
public final class SeriesSubscriptionAPI {
    public static final C1808870xAj LIZ = new C1808870xAj();
    public static SubscriptionRetrofitApi LIZIZ;

    public interface SubscriptionRetrofitApi {
        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/tiktok/v1/paid_content/contract/cancel")
        C11NZ<n> cancelContract(@InterfaceC1501050pAF("contract_id") String str);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/tiktok/v1/paid_content/plan/change")
        AbstractC19484711Kz<n> changePlan(@InterfaceC1501050pAF("product_info[spu_id]") String str, @InterfaceC1501050pAF("product_info[sku_id]") String str2, @InterfaceC1501050pAF("iap_info[app_store_region]") String str3, @InterfaceC1501050pAF("iap_info[risk_info]") String str4, @InterfaceC1501050pAF("iap_info[client_param]") String str5, @InterfaceC1501050pAF("et_info[enter_source]") String str6, @InterfaceC1501050pAF("et_info[enter_method]") String str7, @InterfaceC1501050pAF("et_info[extra]") String str8, @InterfaceC1501050pAF("biz_line") Integer num, @InterfaceC1501050pAF("contract_id") String str9);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/tiktok/v1/paid_content/contract/create")
        AbstractC19484711Kz<n> createContract(@InterfaceC1501050pAF("product_info[spu_id]") String str, @InterfaceC1501050pAF("product_info[sku_id]") String str2, @InterfaceC1501050pAF("iap_info[app_store_region]") String str3, @InterfaceC1501050pAF("iap_info[risk_info]") String str4, @InterfaceC1501050pAF("iap_info[client_param]") String str5, @InterfaceC1501050pAF("et_info[enter_source]") String str6, @InterfaceC1501050pAF("et_info[enter_method]") String str7, @InterfaceC1501050pAF("et_info[extra]") String str8, @InterfaceC1501050pAF("biz_line") Integer num, @InterfaceC1501050pAF("market_info[voucher_id]") String str9, @InterfaceC1501050pAF("device_time_zone") String str10);

        @InterfaceC1501160pAQ("/tiktok/v1/paid_content/order/status")
        AbstractC19484711Kz<n> getOrderStatus(@InterfaceC1501070pAH("order_id") String str, @InterfaceC1501070pAH("contract_id") String str2);

        @InterfaceC1501160pAQ("/tiktok/v1/paid_content/collection/subscription_detail")
        AbstractC19484711Kz<n> getSubscriptionDetail(@InterfaceC1501070pAH("iap_country_code") String str);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/tiktok/v1/paid_content/contract/reactivate")
        AbstractC19484711Kz<n> reactivateContract(@InterfaceC1501050pAF("contract_id") String str, @InterfaceC1501050pAF("iap_info[app_store_region]") String str2, @InterfaceC1501050pAF("iap_info[risk_info]") String str3, @InterfaceC1501050pAF("iap_info[client_param]") String str4, @InterfaceC1501050pAF("et_info[enter_source]") String str5, @InterfaceC1501050pAF("et_info[enter_method]") String str6, @InterfaceC1501050pAF("et_info[extra]") String str7);
    }
}
