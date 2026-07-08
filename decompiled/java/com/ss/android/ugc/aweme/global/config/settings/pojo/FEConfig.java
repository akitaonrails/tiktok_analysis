package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class FEConfig {

    @C09CT("fallback_url")
    public String fallbackUrl;

    @C09CT("schema")
    public String schema;

    public String getFallbackUrl() throws C316660CbA {
        String str = this.fallbackUrl;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getSchema() throws C316660CbA {
        String str = this.schema;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }
}
