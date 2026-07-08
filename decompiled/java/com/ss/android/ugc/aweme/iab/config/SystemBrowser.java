package com.ss.android.ugc.aweme.iab.config;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class SystemBrowser {

    @C09CT("rules")
    public final List<SystemBrowserRule> rules;

    public SystemBrowser() {
        this(null);
    }

    public SystemBrowser(List<SystemBrowserRule> list) {
        this.rules = list;
    }
}
