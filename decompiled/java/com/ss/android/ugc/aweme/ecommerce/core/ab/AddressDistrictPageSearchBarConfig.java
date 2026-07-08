package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressDistrictPageSearchBarConfig {

    @C09CT("enable")
    public boolean enable;

    @C09CT("template_min_version")
    public String minVersion;

    public AddressDistrictPageSearchBarConfig() {
        this(false, CardStruct.IStatusCode.DEFAULT);
    }

    public AddressDistrictPageSearchBarConfig(boolean z, String str) {
        this.enable = z;
        this.minVersion = str;
    }
}
