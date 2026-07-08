package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import tikcast.linkmic.common.LayoutData;

/* JADX INFO: loaded from: classes.dex */
public final class UpdateLayoutResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("cross_room_layout")
        public LayoutData crossRoomLayout;
    }
}
