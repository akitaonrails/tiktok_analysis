package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.text.u;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_enable_slardar_exemption_setting")
public final class LiveEnableSlardarExemptionSetting {
    public static final LiveEnableSlardarExemptionSetting INSTANCE = new LiveEnableSlardarExemptionSetting();
    public static final SlardarExemptionSchema DEFAULT = new SlardarExemptionSchema();

    private final SlardarExemptionSchema getSlardarExemptionSchema() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SlardarExemptionSchema slardarExemptionSchema = DEFAULT;
        SlardarExemptionSchema slardarExemptionSchema2 = (SlardarExemptionSchema) settingsManager.getValueSafely("live_enable_slardar_exemption_setting", slardarExemptionSchema);
        return slardarExemptionSchema2 != null ? slardarExemptionSchema2 : slardarExemptionSchema;
    }

    public final boolean inExemptedList(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        ArrayList<String> arrayList = getSlardarExemptionSchema().liveSlardarEventExemptionList;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        Iterator<String> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (u.LJJIIJZLJL(str, it2.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isExempted(String str) {
        if (getSlardarExemptionSchema().liveSlardarExemptionEnabled && inExemptedList(str)) {
            return true;
        }
        return false;
    }
}
