package com.ss.android.ugc.aweme.ecommerce.compliance.manager;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ToastPerDayData {

    @C09CT("count")
    public int count;

    @C09CT("date")
    public final String date;

    @C09CT("scene_name")
    public final String sceneName;

    public ToastPerDayData(String str, String str2, int i) {
        this.sceneName = str;
        this.date = str2;
        this.count = i;
    }
}
