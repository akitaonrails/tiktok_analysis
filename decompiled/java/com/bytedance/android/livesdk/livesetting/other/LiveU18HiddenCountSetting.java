package com.bytedance.android.livesdk.livesetting.other;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_u18_hidden_count")
public final class LiveU18HiddenCountSetting {
    public static final LiveU18HiddenCountSetting INSTANCE = new LiveU18HiddenCountSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_u18_hidden_count", true);

    public static /* synthetic */ void getValue$annotations() {
    }

    private final boolean showEngagementCountSettingFromHost() {
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        if (iHostAction != null) {
            return iHostAction.showEngagementCount();
        }
        return true;
    }

    public static final boolean getValue() {
        return value;
    }

    private final boolean hideEngagementCountSettingFromLive() {
        return value;
    }

    public final boolean showEngagementCount(Boolean bool) {
        if (!Intrinsics.LJFF(bool, Boolean.FALSE) || !hideEngagementCountSettingFromLive()) {
            return true;
        }
        return showEngagementCountSettingFromHost();
    }
}
