package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class ConfigTransToRequest implements Serializable {

    @C09CT("key_in_page_params")
    public final String keyInPageParams;

    @C09CT("key_to_request")
    public final String keyToRequest;

    public ConfigTransToRequest() {
        this(null, null);
    }

    public ConfigTransToRequest(String str, String str2) {
        this.keyInPageParams = str;
        this.keyToRequest = str2;
    }
}
