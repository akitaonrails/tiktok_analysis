package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C2095008Iq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("multi_co_host_forbid_pre_join_channel")
public final class MultiCoHostForbidPreJoinChannelSetting {
    public static final MultiCoHostForbidPreJoinChannelSetting INSTANCE = new MultiCoHostForbidPreJoinChannelSetting();
    public static final String[] DEFAULT = new String[0];

    public static final List<Integer> getValue() {
        String[] stringArrayValue = SettingsManager.INSTANCE.getStringArrayValue("multi_co_host_forbid_pre_join_channel", DEFAULT);
        ArrayList arrayList = new ArrayList(stringArrayValue.length);
        for (String str : stringArrayValue) {
            arrayList.add(C2095008Iq.LJIIJJI(str));
        }
        return arrayList;
    }
}
