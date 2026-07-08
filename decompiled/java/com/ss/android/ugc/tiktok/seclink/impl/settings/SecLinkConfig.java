package com.ss.android.ugc.tiktok.seclink.impl.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class SecLinkConfig {

    @C09CT("blockList")
    public List<SecLinkConfigItem> blockList;

    @C09CT("handleOverrideUrlScenes")
    public List<String> handleOverrideUrlScenes;

    public SecLinkConfig() {
        this(null, null);
    }

    public SecLinkConfig(List<String> list, List<SecLinkConfigItem> list2) {
        this.handleOverrideUrlScenes = list;
        this.blockList = list2;
    }
}
