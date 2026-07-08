package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class CommonRedDot {

    @C09CT("basic_type")
    public final int basicType;

    @C09CT("delivery_icon")
    public final Delivery deliveryIcon;
    public final int group;

    @C09CT("newest_notice")
    public final Notice newestNotice;

    public CommonRedDot(int i, int i2, Notice notice, Delivery delivery) {
        this.basicType = i;
        this.group = i2;
        this.newestNotice = notice;
        this.deliveryIcon = delivery;
    }
}
