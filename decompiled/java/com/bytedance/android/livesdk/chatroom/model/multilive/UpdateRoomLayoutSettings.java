package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.multilive.UpdateSettingResponse;

/* JADX INFO: loaded from: classes.dex */
public final class UpdateRoomLayoutSettings {

    @C09CT("rtc_ext_info")
    public String rtcExtInfo;

    @C09CT("setting_message")
    public UpdateSettingResponse.SettingMessage settingMessage;

    public UpdateRoomLayoutSettings() {
        this(null, null);
    }

    public UpdateRoomLayoutSettings(String str, UpdateSettingResponse.SettingMessage settingMessage) {
        this.rtcExtInfo = str;
        this.settingMessage = settingMessage;
    }
}
