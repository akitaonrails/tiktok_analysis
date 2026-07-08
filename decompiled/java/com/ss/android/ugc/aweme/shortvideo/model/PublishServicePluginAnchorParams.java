package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class PublishServicePluginAnchorParams {

    @C09CT("minis_infos")
    public final Map<String, Object> minisInfos;

    @C09CT("plugin_infos")
    public final List<Map<String, Object>> pluginInfos;

    /* JADX WARN: Multi-variable type inference failed */
    public PublishServicePluginAnchorParams(List<? extends Map<String, ? extends Object>> list, Map<String, ? extends Object> map) {
        this.pluginInfos = list;
        this.minisInfos = map;
    }
}
