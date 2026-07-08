package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class EcOSPCombinedSkuCheckoutTestData {

    @C09CT("source_page_type_allow_list")
    public final List<String> allowList;

    @C09CT("source_page_type_block_list")
    public final List<String> blockList;

    @C09CT("cache_timeout_hour")
    public final Long cacheDuration;

    @C09CT("enable")
    public final Boolean enable;

    public EcOSPCombinedSkuCheckoutTestData() {
        this(Boolean.FALSE, 0L, null, null);
    }

    public EcOSPCombinedSkuCheckoutTestData(Boolean bool, Long l, List<String> list, List<String> list2) {
        this.enable = bool;
        this.cacheDuration = l;
        this.allowList = list;
        this.blockList = list2;
    }
}
