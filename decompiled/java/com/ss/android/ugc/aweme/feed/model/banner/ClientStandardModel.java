package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class ClientStandardModel implements Serializable {

    @C09CT("components_condition_map")
    public final Map<String, ConditionData> componentsConditionMap;

    @C09CT("components_custom_info_map")
    public final Map<String, Map<String, Object>> componentsCustomInfoMap;

    @C09CT("components_mob_map")
    public final Map<String, Map<String, String>> componentsMobMap;

    @C09CT("components_template_map")
    public final Map<String, FcpUiTemplate> componentsTemplateMap;

    @C09CT("components_ui_map")
    public final Map<String, UIData> componentsUIMap;

    @C09CT("components_ui_type_map")
    public final Map<String, Integer> componentsUiTypeMap;

    /* JADX WARN: Multi-variable type inference failed */
    public ClientStandardModel(Map<String, ConditionData> map, Map<String, Integer> map2, Map<String, FcpUiTemplate> map3, Map<String, UIData> map4, Map<String, ? extends Map<String, String>> map5, Map<String, ? extends Map<String, ? extends Object>> map6) {
        this.componentsConditionMap = map;
        this.componentsUiTypeMap = map2;
        this.componentsTemplateMap = map3;
        this.componentsUIMap = map4;
        this.componentsMobMap = map5;
        this.componentsCustomInfoMap = map6;
    }
}
