package com.ss.android.ugc.aweme.search.pages.result.common.tabs.core.ai;

import X.C09CT;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSmartDynamicTabConfig {

    @C09CT("model_config")
    public final SmartSceneConfig modelConfig;

    @C09CT("output_mapping")
    public final Map<String, String> outputMapping;

    public SearchSmartDynamicTabConfig() {
        this(null, new LinkedHashMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSmartDynamicTabConfig)) {
            return false;
        }
        SearchSmartDynamicTabConfig searchSmartDynamicTabConfig = (SearchSmartDynamicTabConfig) obj;
        return Intrinsics.LJFF(this.modelConfig, searchSmartDynamicTabConfig.modelConfig) && Intrinsics.LJFF(this.outputMapping, searchSmartDynamicTabConfig.outputMapping);
    }

    public SearchSmartDynamicTabConfig(SmartSceneConfig smartSceneConfig, Map<String, String> map) {
        this.modelConfig = smartSceneConfig;
        this.outputMapping = map;
    }
}
