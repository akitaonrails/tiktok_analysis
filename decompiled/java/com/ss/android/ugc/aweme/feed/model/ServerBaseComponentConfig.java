package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class ServerBaseComponentConfig implements Serializable {

    @C09CT("global_ranked_components")
    public List<GlobalComponentData> globalRankedComponents;

    @C09CT("server_base_component_config_hash")
    public String serverBaseComponentConfigHash;

    public ServerBaseComponentConfig() {
        this(null, null, 3, null);
    }

    public ServerBaseComponentConfig(List<GlobalComponentData> list, String str) {
        this.globalRankedComponents = list;
        this.serverBaseComponentConfigHash = str;
    }

    public ServerBaseComponentConfig(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : str);
    }
}
