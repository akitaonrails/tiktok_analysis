package com.ss.android.ugc.aweme.launcershortcut.ab;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class FeedLauncherShortcutAddSettingsModelItem {

    @C09CT("extra")
    public final Map<String, Object> extra;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("schema")
    public final String schema;

    @C09CT("type")
    public final String type;

    public FeedLauncherShortcutAddSettingsModelItem() {
        this(C2097608Jq.LJ(), null, null, "unknown");
    }

    public FeedLauncherShortcutAddSettingsModelItem(Map<String, ? extends Object> map, String str, String str2, String str3) {
        this.extra = map;
        this.iconUrl = str;
        this.schema = str2;
        this.type = str3;
    }
}
