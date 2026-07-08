package com.ss.android.ugc.aweme.homepage.ui.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class SpecialTopicEntry {

    @C09CT("child_viewable")
    public final boolean childViewable;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("event_name")
    public final String eventName;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("landing_route")
    public final String landingRoute;

    @C09CT("landing_type")
    public final String landingType;

    public SpecialTopicEntry() {
        this(false, false, "", "", "", "");
    }

    public SpecialTopicEntry(boolean z, boolean z2, String str, String str2, String str3, String str4) {
        this.enable = z;
        this.childViewable = z2;
        this.eventName = str;
        this.iconUrl = str2;
        this.landingType = str3;
        this.landingRoute = str4;
    }
}
