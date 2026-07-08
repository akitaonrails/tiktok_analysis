package com.ss.android.ugc.aweme.playerkit.configpickerimpl.data;

import X.C09CT;
import com.google.gson.k;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class ConditionConfig {

    @C09CT("client_filter_requirement")
    public Map<String, List<String>> clientFilterRequirement;

    @C09CT("config")
    public k configContent;

    @C09CT("server_filter_requirement")
    public Map<String, List<String>> serverFilterRequirement;

    public final int LIZ() {
        Map<String, List<String>> map = this.clientFilterRequirement;
        int size = map == null ? 0 : map.size();
        Map<String, List<String>> map2 = this.serverFilterRequirement;
        return size + (map2 != null ? map2.size() : 0);
    }
}
