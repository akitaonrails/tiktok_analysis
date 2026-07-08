package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class SettingABTestInfo {

    @C09CT("use_new_layout_setting")
    public Boolean useNewLayoutSetting;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.useNewLayoutSetting != null) {
            sb.append(", use_new_layout_setting=");
            sb.append(this.useNewLayoutSetting);
        }
        sb.replace(0, 2, "SettingABTestInfo{");
        sb.append('}');
        return sb.toString();
    }
}
