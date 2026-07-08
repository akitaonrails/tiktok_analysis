package com.ss.android.ugc.tiktok.security.settings;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class BostonVirtualRouterModel {

    @C09CT("name")
    public String name;

    @C09CT("routerName")
    public String routerName;

    @C09CT("routerParams")
    public Map<String, String> routerParams;

    public BostonVirtualRouterModel() {
        this("", "", null);
    }

    public BostonVirtualRouterModel(String str, String str2, Map<String, String> map) {
        this.name = str;
        this.routerName = str2;
        this.routerParams = map;
    }
}
