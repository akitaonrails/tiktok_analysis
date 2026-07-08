package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("test_disable_comment_area")
public final class TestDisableCommentAreaSetting {
    public static final boolean DEFAULT = false;
    public static final TestDisableCommentAreaSetting INSTANCE = new TestDisableCommentAreaSetting();

    public final boolean getValue() {
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            return SettingsManager.INSTANCE.getBooleanValue("test_disable_comment_area", DEFAULT);
        }
        return false;
    }
}
