package com.bytedance.android.livesdk.chatroom.banner.data;

import X.C09CT;
import X.C1098660ehE;

/* JADX INFO: loaded from: classes18.dex */
public final class BannerDisplayParam {

    @C09CT("GuestDisplayParam")
    public final GuestDisplayParam guestDisplayParam;

    @C09CT("HostDisplayParam")
    public final C1098660ehE hostDisplayParam;

    public BannerDisplayParam() {
        this(new C1098660ehE(), new GuestDisplayParam(new ExpandParam(1, 10)));
    }

    public BannerDisplayParam(C1098660ehE c1098660ehE, GuestDisplayParam guestDisplayParam) {
        this.hostDisplayParam = c1098660ehE;
        this.guestDisplayParam = guestDisplayParam;
    }
}
