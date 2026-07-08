package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class SessionStartMatchRule {

    @C09CT("adobe_session")
    public final String adobeSessionRule;

    @C09CT("ga_session")
    public final String gaSessionRule;

    public SessionStartMatchRule() {
        this("^https://www.google-analytics.com/g/collect.*[?&]_ss=1.*(?:&|$)", "^(https://cdn1.adoberesources.net/alloy/[\\d.]+/alloy.min.js$)|(https://assets.adobedtm.com/extensions/[a-zA-Z0-9]+/AppMeasurement.min.js$)");
    }

    public SessionStartMatchRule(String str, String str2) {
        this.gaSessionRule = str;
        this.adobeSessionRule = str2;
    }
}
