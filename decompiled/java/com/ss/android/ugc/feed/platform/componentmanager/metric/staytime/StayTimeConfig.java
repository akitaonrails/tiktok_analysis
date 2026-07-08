package com.ss.android.ugc.feed.platform.componentmanager.metric.staytime;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class StayTimeConfig {

    @C09CT("allow_component_key_list")
    public final List<String> allowComponentList;

    @C09CT("allow_list")
    public final Map<String, ContainerConfigModel> containerAllowList;

    public StayTimeConfig() {
        this(new ArrayList(), null);
    }

    public StayTimeConfig(List<String> list, Map<String, ContainerConfigModel> map) {
        this.allowComponentList = list;
        this.containerAllowList = map;
    }
}
