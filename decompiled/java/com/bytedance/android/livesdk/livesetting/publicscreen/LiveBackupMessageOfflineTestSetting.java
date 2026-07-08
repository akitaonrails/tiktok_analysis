package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_backup_message_offline_test")
public final class LiveBackupMessageOfflineTestSetting {
    public static final boolean DEFAULT = false;
    public static final LiveBackupMessageOfflineTestSetting INSTANCE = new LiveBackupMessageOfflineTestSetting();

    public final boolean getValue() {
        return ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() && SettingsManager.INSTANCE.getBooleanValue("live_backup_message_offline_test", DEFAULT);
    }
}
