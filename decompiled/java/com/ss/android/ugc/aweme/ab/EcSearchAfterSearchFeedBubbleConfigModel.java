package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchAfterSearchFeedBubbleConfigModel {

    @C09CT("bubble_request_interval_seconds")
    public final long bubbleRequestIntervalSeconds;

    @C09CT("ec_search_query_valid_cache_seconds")
    public final long ecSearchQueryValidCacheSeconds;

    @C09CT("ecom_intent_enter_method")
    public final List<String> ecomIntentEnterMethodList;

    @C09CT("enable")
    public final int enable;

    @C09CT("ensure_shop_tab_before_request_control_get")
    public final int ensureShopTabBeforeRequestControlGet;

    @C09CT("new_word_request_directly")
    public final int newWordRequestDirectly;

    public EcSearchAfterSearchFeedBubbleConfigModel() {
        this(0, 0L, 0L, 0, null, 0, 63, null);
    }

    public EcSearchAfterSearchFeedBubbleConfigModel(int i, long j, long j2, int i2, List<String> list, int i3) {
        this.enable = i;
        this.bubbleRequestIntervalSeconds = j;
        this.ecSearchQueryValidCacheSeconds = j2;
        this.newWordRequestDirectly = i2;
        this.ecomIntentEnterMethodList = list;
        this.ensureShopTabBeforeRequestControlGet = i3;
    }

    public EcSearchAfterSearchFeedBubbleConfigModel(int i, long j, long j2, int i2, List list, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 300L : j, (i4 & 4) != 0 ? 1209600L : j2, (i4 & 8) == 0 ? i2 : 0, (i4 & 16) != 0 ? C13BV.INSTANCE : list, (i4 & 32) != 0 ? 1 : i3);
    }
}
