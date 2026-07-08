package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;
import webcast.data.UserSetting;

/* JADX INFO: loaded from: classes.dex */
public final class GameSettingChangeMessage extends AbstractC1136060ffY {

    @C09CT("current_user_setting")
    public Map<Long, UserSetting> currentUserSetting;

    public GameSettingChangeMessage() {
        this.type = C001A.GAME_SETTING_CHANGE_MESSAGE;
        this.currentUserSetting = new LinkedHashMap();
    }
}
