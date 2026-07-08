package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class AuctionActivityData {

    @C09CT("main_order_create_time")
    public long mainOrderCreateTime;

    @C09CT("main_order_payment_time")
    public long mainOrderPaymentTime;

    @C09CT("product")
    public Product product;

    @C09CT("sku")
    public Sku sku;

    @C09CT("surprise_set_name")
    public String surpriseSetName = "";

    @C09CT("user")
    public User user;
}
