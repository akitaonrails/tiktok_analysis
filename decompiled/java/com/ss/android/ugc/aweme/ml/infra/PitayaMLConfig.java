package com.ss.android.ugc.aweme.ml.infra;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class PitayaMLConfig {

    @C09CT("business_name")
    public String businessName;

    @C09CT("enabled_fetcher")
    public boolean enabledFetcher;

    public String toString() {
        return super.toString();
    }

    public final String getBusinessName() {
        return this.businessName;
    }

    public final boolean getEnabledFetcher() {
        return this.enabledFetcher;
    }

    public final void setBusinessName(String str) {
        this.businessName = str;
    }

    public final void setEnabledFetcher(boolean z) {
        this.enabledFetcher = z;
    }
}
