package com.ss.android.ugc.aweme.ecommerce.ug.perf;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class MallLandingPerfEventConfig {

    @C09CT("event")
    public final String eventName;

    @C09CT("rules")
    public final Map<String, String> rules;

    @C09CT("scenes")
    public final List<MallLandingSceneConfig> scenes;

    public MallLandingPerfEventConfig(String str, Map<String, String> map, List<MallLandingSceneConfig> list) {
        this.eventName = str;
        this.rules = map;
        this.scenes = list;
    }
}
