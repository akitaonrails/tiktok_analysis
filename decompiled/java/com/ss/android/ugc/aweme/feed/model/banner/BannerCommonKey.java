package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BannerCommonKey implements Serializable {

    @C09CT("business_id")
    public String businessId;

    @C09CT("component_key")
    public String componentKey;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerCommonKey)) {
            return false;
        }
        BannerCommonKey bannerCommonKey = (BannerCommonKey) obj;
        return Intrinsics.LJFF(this.componentKey, bannerCommonKey.componentKey) && Intrinsics.LJFF(this.businessId, bannerCommonKey.businessId);
    }

    public BannerCommonKey() {
        this("", "");
    }

    public BannerCommonKey(String str, String str2) {
        this.componentKey = str;
        this.businessId = str2;
    }
}
