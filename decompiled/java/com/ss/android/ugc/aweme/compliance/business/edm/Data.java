package com.ss.android.ugc.aweme.compliance.business.edm;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class Data {
    public static final int $stable = 0;

    @C09CT("show_consent_page")
    public final boolean showConsentPage;

    public Data() {
        this(false);
    }

    public Data(boolean z) {
        this.showConsentPage = z;
    }
}
