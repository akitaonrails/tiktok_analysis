package com.ss.android.ugc.aweme.tablet.impl.experiment;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class TabletsScanLoginModel {

    @C09CT("host")
    public final String host;
    public final Map<String, String> urls;

    public TabletsScanLoginModel() {
        this("", C2097608Jq.LJ());
    }

    public TabletsScanLoginModel(String str, Map<String, String> map) {
        this.host = str;
        this.urls = map;
    }
}
