package com.ss.android.ugc.aweme.shoutouts.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes24.dex */
public final class ShoutoutsOrder {

    @C09CT("video_info")
    public final Aweme aweme;

    @C09CT("order_id")
    public final String orderId;

    public ShoutoutsOrder(String str, Aweme aweme) {
        this.orderId = str;
        this.aweme = aweme;
    }
}
