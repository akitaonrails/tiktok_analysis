package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto;

import X.C09CT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PDPSeaHeaderConfig {

    @C09CT("da_info")
    public final Map<String, Object> daInfo;

    @C09CT("default_facade")
    public final String defaultHeaderKey;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PDPSeaHeaderConfig)) {
            return false;
        }
        PDPSeaHeaderConfig pDPSeaHeaderConfig = (PDPSeaHeaderConfig) obj;
        return Intrinsics.LJFF(this.defaultHeaderKey, pDPSeaHeaderConfig.defaultHeaderKey) && Intrinsics.LJFF(this.daInfo, pDPSeaHeaderConfig.daInfo);
    }

    public PDPSeaHeaderConfig(String str, Map<String, ? extends Object> map) {
        this.defaultHeaderKey = str;
        this.daInfo = map;
    }
}
