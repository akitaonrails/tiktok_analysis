package com.ss.android.ugc.tiktok.security.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class BostonSensitiveCaller {

    @C09CT("routers")
    public List<String> allowedRouters;

    @C09CT("callerId")
    public String callerId;

    public BostonSensitiveCaller() {
        this("", null);
    }

    public BostonSensitiveCaller(String str, List<String> list) {
        this.callerId = str;
        this.allowedRouters = list;
    }
}
