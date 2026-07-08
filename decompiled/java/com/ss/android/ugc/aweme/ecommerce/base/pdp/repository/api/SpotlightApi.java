package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api;

import X.C040I;
import X.C09CT;
import X.C0X52;
import X.C13BV;
import X.C1739740vNE;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501240pAY;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public interface SpotlightApi {
    public static final C1739740vNE LIZ = C1739740vNE.LIZ;

    @InterfaceC1501240pAY("api/v1/pdp/channel_entry/get")
    Object LIZ(@C040I SpotlightRequest spotlightRequest, InterfaceC1364105Vn<? super C0X52<Response<String>>> interfaceC1364105Vn);

    public static final class ContextProductInfo {

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public final String productId;

        @C09CT("seller_id")
        public final String sellerId;

        public ContextProductInfo() {
            this(null, null);
        }

        public ContextProductInfo(String str, String str2) {
            this.productId = str;
            this.sellerId = str2;
        }
    }

    public static final class SpotlightRequest {

        @C09CT("author_id")
        public final String authorId;

        @C09CT("batch_request_id")
        public final String batchRequestId;

        @C09CT("context_product_info_list")
        public final List<ContextProductInfo> contextProductInfoList;

        @C09CT("enter_from")
        public final String enterFrom;

        @C09CT("enter_from_info")
        public final String enterFromInfo;

        @C09CT("enter_from_merge")
        public final String enterFromMerge;

        @C09CT("first_source_page")
        public final String firstSourcePage;

        @C09CT("previous_page")
        public final String previousPage;

        @C09CT("traffic_source")
        public final Integer trafficSource;

        @C09CT("traffic_source_list")
        public final List<Integer> trafficSourceList;

        public SpotlightRequest() {
            this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }

        public SpotlightRequest(List<ContextProductInfo> list, String str, Integer num, List<Integer> list2, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.contextProductInfoList = list;
            this.batchRequestId = str;
            this.trafficSource = num;
            this.trafficSourceList = list2;
            this.enterFrom = str2;
            this.enterFromMerge = str3;
            this.previousPage = str4;
            this.authorId = str5;
            this.firstSourcePage = str6;
            this.enterFromInfo = str7;
        }

        public SpotlightRequest(List list, String str, Integer num, List list2, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? C13BV.INSTANCE : list2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) == 0 ? str7 : null);
        }
    }
}
