package com.ss.android.ugc.aweme.liveevent;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes30.dex */
public final class LiveEventModule {
    public boolean LIZ;
    public boolean LIZIZ;

    @C09CT("is_paid_event")
    public boolean isPaidEvent;

    @C09CT("periodic_settings")
    public String periodicSettings;

    @C09CT("periodic_shows")
    public String periodicTitle;

    @C09CT("start_time")
    public long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("title")
    public String title = "";

    public final boolean LIZ() {
        String str = this.periodicSettings;
        return !(str == null || str.length() == 0);
    }
}
