package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostReplyTimeOutSetting;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_timeout_strategy")
public final class LiveCoHosTimeoutStrategy {
    public static final HashMap<String, Object> DEFAULT;
    public static final LiveCoHosTimeoutStrategy INSTANCE = new LiveCoHosTimeoutStrategy();

    static {
        MtCoHostInviteTimeOutSetting mtCoHostInviteTimeOutSetting = MtCoHostInviteTimeOutSetting.INSTANCE;
        MtCoHostReplyTimeOutSetting mtCoHostReplyTimeOutSetting = MtCoHostReplyTimeOutSetting.INSTANCE;
        DEFAULT = C2097608Jq.LJI(new Pair("inviter_timeout", Integer.valueOf(mtCoHostInviteTimeOutSetting.getValue())), new Pair("invitee_timeout", Integer.valueOf(mtCoHostReplyTimeOutSetting.getValue())), new Pair("apply_timeout", Integer.valueOf(mtCoHostInviteTimeOutSetting.getValue())), new Pair("handler_timeout", Integer.valueOf(mtCoHostReplyTimeOutSetting.getValue())));
    }

    public final Map<String, Object> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        HashMap<String, Object> map = DEFAULT;
        Map<String, Object> map2 = (Map) settingsManager.getValueSafely("live_cohost_timeout_strategy", map);
        return map2 != null ? map2 : map;
    }
}
