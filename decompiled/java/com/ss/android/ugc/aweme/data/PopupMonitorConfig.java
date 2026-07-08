package com.ss.android.ugc.aweme.data;

import X.C09CT;
import X.C2188811AlT;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class PopupMonitorConfig {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("feed_track_page_vv")
    public final int feedTrackPageVV;

    @C09CT("ignore_activities")
    public Set<String> ignoreActivities;

    @C09CT("ignore_popups")
    public Set<String> ignorePopups;

    @C09CT("ignore_routers")
    public Set<String> ignoreRouters;

    @C09CT("is_click_enabled")
    public final boolean isClickEnabled;

    @C09CT("is_enabled")
    public final boolean isEnabled;

    @C09CT("close_days")
    public final int limitDays;

    @C09CT("only_regression")
    public final boolean onlyRegression;

    @C09CT("rule_id")
    public final String ruleId;

    @C09CT("rule_title")
    public final String ruleTitle;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopupMonitorConfig(isEnabled=");
        sbLIZ.append(this.isEnabled);
        sbLIZ.append(", isClickEnabled=");
        sbLIZ.append(this.isClickEnabled);
        sbLIZ.append(", ruleId=");
        sbLIZ.append(this.ruleId);
        sbLIZ.append(", ruleTitle=");
        sbLIZ.append(this.ruleTitle);
        sbLIZ.append(", limitDays=");
        sbLIZ.append(this.limitDays);
        sbLIZ.append(", onlyRegression=");
        sbLIZ.append(this.onlyRegression);
        sbLIZ.append(", feedTrackPageVV=");
        sbLIZ.append(this.feedTrackPageVV);
        sbLIZ.append(", ignoreActivities=");
        sbLIZ.append(this.ignoreActivities);
        sbLIZ.append(", ignoreRouters=");
        sbLIZ.append(this.ignoreRouters);
        sbLIZ.append(", ignorePopups=");
        sbLIZ.append(this.ignorePopups);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PopupMonitorConfig() {
        this(false, false, "-1", "", 7, true, 8, new LinkedHashSet(), new LinkedHashSet(), new LinkedHashSet());
    }

    public PopupMonitorConfig(boolean z, boolean z2, String str, String str2, int i, boolean z3, int i2, Set<String> set, Set<String> set2, Set<String> set3) {
        this.isEnabled = z;
        this.isClickEnabled = z2;
        this.ruleId = str;
        this.ruleTitle = str2;
        this.limitDays = i;
        this.onlyRegression = z3;
        this.feedTrackPageVV = i2;
        this.ignoreActivities = set;
        this.ignoreRouters = set2;
        this.ignorePopups = set3;
    }
}
