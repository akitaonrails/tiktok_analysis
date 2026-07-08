package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class TabTrackerInfo {

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("extra_info")
    public final Map<String, String> extraInfo;

    public TabTrackerInfo() {
        this("", C2097608Jq.LJ());
    }

    public TabTrackerInfo(String str, Map<String, String> map) {
        this.enterFrom = str;
        this.extraInfo = map;
    }
}
