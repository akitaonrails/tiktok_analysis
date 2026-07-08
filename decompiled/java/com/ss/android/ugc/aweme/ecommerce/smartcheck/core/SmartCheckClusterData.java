package com.ss.android.ugc.aweme.ecommerce.smartcheck.core;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class SmartCheckClusterData {

    @C09CT("allowed_list")
    public final Map<String, List<String>> allowedList;

    @C09CT("enable")
    public final boolean enable;

    public SmartCheckClusterData() {
        this(false, new LinkedHashMap());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SmartCheckClusterData(boolean z, Map<String, ? extends List<String>> map) {
        this.enable = z;
        this.allowedList = map;
    }
}
