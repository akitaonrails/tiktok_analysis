package com.ss.android.ugc.aweme.iab.config;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SystemBrowserRule {

    @C09CT("domain")
    public final List<String> domain;

    @C09CT("first_path")
    public final List<String> firstPath;

    public SystemBrowserRule() {
        this(null, null);
    }

    public SystemBrowserRule(List<String> list, List<String> list2) {
        this.domain = list;
        this.firstPath = list2;
    }
}
