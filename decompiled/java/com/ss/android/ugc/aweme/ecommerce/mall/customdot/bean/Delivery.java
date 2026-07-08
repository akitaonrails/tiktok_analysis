package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class Delivery {
    public final int duration;

    @C09CT("icon_url")
    public final String iconUrl;
    public final String id;

    public Delivery(String str, String str2, int i) {
        this.id = str;
        this.iconUrl = str2;
        this.duration = i;
    }
}
