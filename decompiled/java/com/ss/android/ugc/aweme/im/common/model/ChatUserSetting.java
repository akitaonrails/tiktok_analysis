package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class ChatUserSetting implements Serializable {

    @C09CT("chat_set")
    public final int chatSet;

    @C09CT("chat_settings_panel")
    public final int chatSettingsPanel;

    @C09CT("chat_user_type")
    public final int chatUserType;

    public ChatUserSetting(int i, int i2, int i3) {
        this.chatSet = i;
        this.chatSettingsPanel = i2;
        this.chatUserType = i3;
    }
}
