package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class UpdateSettingResponse {

    @C09CT("data")
    public UpdateRoomLayoutSettings data;

    @C09CT("extra")
    public Extra extra;

    public static final class Extra {

        @C09CT("now")
        public long now;
    }

    public static final class SettingMessage {

        @C09CT("share_revenue_setting")
        public int shareRevenueSetting;

        @C09CT("share_revenue_setting_ratio")
        public int shareRevenueSettingRatio;

        @C09CT("share_revenue_setting_version")
        public long shareRevenueSettingVersion;

        @C09CT("update_scene")
        public int updateScene;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "UpdateSettingResponse{");
        sb.append('}');
        return sb.toString();
    }
}
