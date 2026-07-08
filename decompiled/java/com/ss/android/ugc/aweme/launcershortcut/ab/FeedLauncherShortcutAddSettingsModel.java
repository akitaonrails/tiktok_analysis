package com.ss.android.ugc.aweme.launcershortcut.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class FeedLauncherShortcutAddSettingsModel {

    @C09CT("config")
    public final List<FeedLauncherShortcutAddSettingsModelItem> config;

    public FeedLauncherShortcutAddSettingsModel() {
        this(null, 1, null);
    }

    public FeedLauncherShortcutAddSettingsModel(List<FeedLauncherShortcutAddSettingsModelItem> list) {
        this.config = list;
    }

    public FeedLauncherShortcutAddSettingsModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
