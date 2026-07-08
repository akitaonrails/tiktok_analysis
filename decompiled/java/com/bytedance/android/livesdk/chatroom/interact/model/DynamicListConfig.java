package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class DynamicListConfig {

    @C09CT("list_sections")
    public List<String> listSections = new ArrayList();

    @C09CT("section_configs")
    public Map<String, SectionConfig> sectionConfigs = new LinkedHashMap();

    public static final class SectionConfig {

        @C09CT("schema")
        public String schema = "";

        @C09CT("initial_data")
        public String initialData = "";
    }
}
