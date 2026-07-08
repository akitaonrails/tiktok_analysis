package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.BuriedFieldData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("ttlive_buried_field_reduction_opt")
public final class BuriedFieldReductionSetting {
    public static Boolean listIsEmpty;
    public static final BuriedFieldReductionSetting INSTANCE = new BuriedFieldReductionSetting();
    public static final BuriedFieldData DEFAULT = new BuriedFieldData();

    public final BuriedFieldData getGetValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        BuriedFieldData buriedFieldData = DEFAULT;
        BuriedFieldData buriedFieldData2 = (BuriedFieldData) settingsManager.getValueSafely("ttlive_buried_field_reduction_opt", buriedFieldData);
        return buriedFieldData2 != null ? buriedFieldData2 : buriedFieldData;
    }

    private final boolean isHasKey(String str) {
        BuriedFieldData getValue;
        List<String> list;
        List<String> list2;
        if (listIsEmpty == null) {
            listIsEmpty = Boolean.TRUE;
            BuriedFieldData getValue2 = getGetValue();
            if (getValue2 != null && (list2 = getValue2.unBuriedFieldList) != null && (!list2.isEmpty())) {
                listIsEmpty = Boolean.FALSE;
            }
        }
        if (!Intrinsics.LJFF(Boolean.FALSE, listIsEmpty) || (getValue = getGetValue()) == null || (list = getValue.unBuriedFieldList) == null) {
            return false;
        }
        return list.contains(str);
    }

    public final boolean isBuriedField(String str) {
        BuriedFieldData getValue = getGetValue();
        if (getValue == null || !getValue.isBuriedField || isHasKey(str)) {
            return false;
        }
        return true;
    }
}
