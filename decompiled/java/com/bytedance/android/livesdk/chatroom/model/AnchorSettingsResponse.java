package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorSettingsResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("settings")
        public RoomBasicSettings settings;

        @C09CT("user_attr_settings")
        public UserAttrSettings userAttrSettings;

        @C09CT("user_stats")
        public UserStats userStats;
    }
}
