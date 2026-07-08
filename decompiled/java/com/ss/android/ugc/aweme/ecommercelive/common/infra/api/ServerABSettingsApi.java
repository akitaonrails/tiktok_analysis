package com.ss.android.ugc.aweme.ecommercelive.common.infra.api;

import X.C09CS;
import X.C09CT;
import X.C21161417rY;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;

/* JADX INFO: loaded from: classes33.dex */
public interface ServerABSettingsApi {
    public static final C21161417rY LIZ = C21161417rY.LIZ;

    @InterfaceC1501160pAQ("/api/v1/oec/affiliate/ab_test/get")
    Object getABTestResultForBroadcaster(@InterfaceC1501070pAH("author_id") String str, InterfaceC1364105Vn<? super BaseResponse<AnchorABTestResult>> interfaceC1364105Vn);

    public static final class AnchorABTestResult {

        @C09CT("host_atmosphere")
        @C09CS(StringJsonAdapterFactory.class)
        public final AtmosphereConfig atmosphereConfig;

        public AnchorABTestResult(AtmosphereConfig atmosphereConfig) {
            this.atmosphereConfig = atmosphereConfig;
        }
    }

    public static final class AtmosphereConfig {

        @C09CT("anchor_hot_tag_show")
        public final Boolean canHotTagShow;

        @C09CT("anchor_under_stock_show")
        public final Boolean canLowStockShow;

        @C09CT("anchor_order_sold_show")
        public final Boolean canOrderSoldShow;

        @C09CT("anchor_barrage_show")
        public final Boolean canShowBarrage;

        @C09CT("anchor_top_sales_show")
        public final Boolean canTopSaleShow;

        public AtmosphereConfig(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
            this.canShowBarrage = bool;
            this.canHotTagShow = bool2;
            this.canTopSaleShow = bool3;
            this.canLowStockShow = bool4;
            this.canOrderSoldShow = bool5;
        }
    }
}
