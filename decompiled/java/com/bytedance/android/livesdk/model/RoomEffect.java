package com.bytedance.android.livesdk.model;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class RoomEffect {

    @C09CT("resource_id")
    public String id;

    public RoomEffect() {
        this("", null);
    }

    public RoomEffect(String str, RoomSticker roomSticker) {
        this.id = str;
    }
}
