package com.ss.android.ugc.aweme.childhook;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class MajorComponentsAllowList {

    @C09CT("Activity")
    public final List<String> activities;

    @C09CT("BroadcastReceiver")
    public final List<String> broadcastReceivers;

    @C09CT("ContentProvider")
    public final List<String> contentProviders;

    @C09CT("LaunchActivity")
    public final String launchActivity;

    public MajorComponentsAllowList() {
        this(null, null, null, null, 15, null);
    }

    public MajorComponentsAllowList(String str, List<String> list, List<String> list2, List<String> list3) {
        this.launchActivity = str;
        this.activities = list;
        this.contentProviders = list2;
        this.broadcastReceivers = list3;
    }

    public MajorComponentsAllowList(String str, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2, (i & 8) != 0 ? C13BV.INSTANCE : list3);
    }
}
