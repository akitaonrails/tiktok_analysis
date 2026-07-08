package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_live_playbook_cover_schema_tech_swtich")
public final class LinkMicPlaybookCoverSchemaSetting {
    public static final int DEFAULT = 1;
    public static final LinkMicPlaybookCoverSchemaSetting INSTANCE = new LinkMicPlaybookCoverSchemaSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_live_playbook_cover_schema_tech_swtich", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
