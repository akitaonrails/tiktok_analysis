package com.bytedance.helios.network.pipeline;

import X.C09CT;
import com.bytedance.helios.network.api.service.ReplaceConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class OperationConfig {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("add")
    public Map<String, String> add;

    @C09CT("remove")
    public List<String> remove;

    @C09CT("replace")
    public Map<String, ReplaceConfig> replace;

    public OperationConfig() {
        this(new LinkedHashMap(), new LinkedHashMap(), new ArrayList());
    }

    public final void LIZ(OperationConfig operationConfig) {
        if (operationConfig != null) {
            this.add.putAll(operationConfig.add);
            this.replace.putAll(operationConfig.replace);
            this.remove.addAll(operationConfig.remove);
        }
    }

    public OperationConfig(Map<String, String> map, Map<String, ReplaceConfig> map2, List<String> list) {
        this.add = map;
        this.replace = map2;
        this.remove = list;
    }
}
