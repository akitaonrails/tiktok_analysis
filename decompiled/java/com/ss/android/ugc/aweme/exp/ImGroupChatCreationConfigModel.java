package com.ss.android.ugc.aweme.exp;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class ImGroupChatCreationConfigModel {

    @C09CT("creation_panel_config")
    public final Map<String, GroupChatCreationConfig> creationPanelConfig;

    @C09CT("entrance_config")
    public final Map<String, EntranceHeaderConfig> entranceConfig;

    public ImGroupChatCreationConfigModel() {
        this(null, null);
    }

    public ImGroupChatCreationConfigModel(Map<String, GroupChatCreationConfig> map, Map<String, EntranceHeaderConfig> map2) {
        this.creationPanelConfig = map;
        this.entranceConfig = map2;
    }
}
