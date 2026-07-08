package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class CohostSettingsUpdateMessage extends AbstractC1136060ffY {

    @C09CT("anchor_settings")
    public Map<Long, Boolean> anchorSettings;

    public CohostSettingsUpdateMessage() {
        this.type = C001A.COHOST_SETTINGS_UPDATE_MESSAGE;
        this.anchorSettings = new LinkedHashMap();
    }
}
