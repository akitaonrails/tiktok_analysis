package com.ss.android.ugc.tiktok.security.settings;

import X.C09CT;
import X.C13BV;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class PnsWebDfIdConfigModel {

    @C09CT("cct_downgrade_spark_third")
    public List<String> cctSparkThirdList;

    @C09CT("cct_downgrade_system_browser")
    public List<String> cctSystemBrowserList;

    @C09CT("spark_third_live_redirect")
    public List<String> liveRedirectList;

    @C09CT("spark_third_redirect")
    public List<String> redirectList;

    @C09CT("spark_third")
    public List<String> thirdList;

    public PnsWebDfIdConfigModel() {
        this(null, null, null, null, null, 31, null);
    }

    public PnsWebDfIdConfigModel(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this.thirdList = list;
        this.redirectList = list2;
        this.liveRedirectList = list3;
        this.cctSparkThirdList = list4;
        this.cctSystemBrowserList = list5;
    }

    public PnsWebDfIdConfigModel(List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? Collections.singletonList("335544382") : list3, (i & 8) != 0 ? C13BV.INSTANCE : list4, (i & 16) != 0 ? C13BV.INSTANCE : list5);
    }
}
