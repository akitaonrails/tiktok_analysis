package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_audience_transform_event_abnormal_size_fix")
public final class CoHostAudienceTransformEventAbnormalSizeBugfix {
    public static final int DEFAULT = 1;
    public static final CoHostAudienceTransformEventAbnormalSizeBugfix INSTANCE = new CoHostAudienceTransformEventAbnormalSizeBugfix();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_audience_transform_event_abnormal_size_fix", DEFAULT) > 0;
    }
}
