package com.ss.android.ugc.profile.business.commerce;

import X.C09CT;
import com.ss.android.ugc.profile.platform.business.header.advanced.AdvancedFeatureBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class ShowCaseData extends AdvancedFeatureBaseData {
    public static final int $stable = 8;

    @C09CT("showcase_schema")
    public String showCaseSchema;

    public final String getShowCaseSchema() {
        return this.showCaseSchema;
    }

    public final void setShowCaseSchema(String str) {
        this.showCaseSchema = str;
    }
}
