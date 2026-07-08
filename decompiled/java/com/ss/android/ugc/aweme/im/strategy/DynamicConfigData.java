package com.ss.android.ugc.aweme.im.strategy;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final class DynamicConfigData {

    @C09CT("configuration")
    public final Map<String, String> configuration;

    public DynamicConfigData() {
        this(null);
    }

    public DynamicConfigData(Map<String, String> map) {
        this.configuration = map;
    }
}
