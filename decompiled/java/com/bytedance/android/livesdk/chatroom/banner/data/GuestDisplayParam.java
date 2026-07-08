package com.bytedance.android.livesdk.chatroom.banner.data;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class GuestDisplayParam {

    @C09CT("ExpandParam")
    public final ExpandParam expandParam;

    public GuestDisplayParam() {
        this(new ExpandParam(1, 10));
    }

    public GuestDisplayParam(ExpandParam expandParam) {
        this.expandParam = expandParam;
    }
}
