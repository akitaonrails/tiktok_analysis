package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class OrderDetail implements Serializable {

    @C09CT("receive_jump_url")
    public final String receiveJumpUrl;

    public OrderDetail() {
        this(null);
    }

    public OrderDetail(String str) {
        this.receiveJumpUrl = str;
    }
}
