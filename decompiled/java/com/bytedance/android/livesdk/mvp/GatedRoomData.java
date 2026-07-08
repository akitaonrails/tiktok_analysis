package com.bytedance.android.livesdk.mvp;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes8.dex */
public final class GatedRoomData {

    @C09CT("description")
    public final String description;

    @C09CT("detail_url")
    public final String detailUrl;

    @C09CT("event_name")
    public final String eventName;

    @C09CT("owner")
    public final User owner;

    public GatedRoomData() {
        this(null, null, null, null);
    }

    public GatedRoomData(String str, String str2, String str3, User user) {
        this.eventName = str;
        this.description = str2;
        this.detailUrl = str3;
        this.owner = user;
    }
}
