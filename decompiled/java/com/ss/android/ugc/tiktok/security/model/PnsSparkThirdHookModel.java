package com.ss.android.ugc.tiktok.security.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class PnsSparkThirdHookModel {

    @C09CT("allowChromeList")
    public final List<String> allowChromeList;

    @C09CT("allowClientList")
    public final List<String> allowClientList;

    @C09CT("allowProviderList")
    public final List<String> allowProviderList;

    @C09CT("forbidLancetHookEnable")
    public final boolean forbidLancetHookEnable;

    @C09CT("forbidWebViewHookEnable")
    public final boolean forbidWebViewHookEnable;

    @C09CT("lancetAllowList")
    public final List<String> lancetAllowList;

    @C09CT("viewName")
    public final String viewName;

    public PnsSparkThirdHookModel() {
        this(false, null, false, null, null, null, "com.bytedance.hybrid.spark.third.container.SparkThirdWebViewInner");
    }

    public PnsSparkThirdHookModel(boolean z, List<String> list, boolean z2, List<String> list2, List<String> list3, List<String> list4, String str) {
        this.forbidLancetHookEnable = z;
        this.lancetAllowList = list;
        this.forbidWebViewHookEnable = z2;
        this.allowChromeList = list2;
        this.allowClientList = list3;
        this.allowProviderList = list4;
        this.viewName = str;
    }
}
