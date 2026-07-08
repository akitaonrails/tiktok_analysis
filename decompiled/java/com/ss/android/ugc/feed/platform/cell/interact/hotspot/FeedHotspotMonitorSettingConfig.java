package com.ss.android.ugc.feed.platform.cell.interact.hotspot;

import X.C09CT;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedHotspotMonitorSettingConfig {

    @C09CT("blacklist")
    public final Set<String> blacklist;

    @C09CT("enable_click_monitor")
    public final Boolean enableClickMonitor;

    public FeedHotspotMonitorSettingConfig(Set<String> set, Boolean bool) {
        this.blacklist = set;
        this.enableClickMonitor = bool;
    }
}
