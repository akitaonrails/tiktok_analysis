package com.bytedance.android.livesdkapi.avoidance.setting;

import X.C13BV;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_message_notify_conflict_avoid_block_list")
public final class LiveConflictControlAdaptionBlockListSetting {
    public static final List<Integer> DEFAULT;
    public static final LiveConflictControlAdaptionBlockListSetting INSTANCE = new LiveConflictControlAdaptionBlockListSetting();
    public static final List<Integer> value;

    static {
        C13BV c13bv = C13BV.INSTANCE;
        DEFAULT = c13bv;
        value = (List) SettingsManager.INSTANCE.getValueSafely("live_message_notify_conflict_avoid_block_list", c13bv);
    }

    public final boolean contains(int i) {
        List<Integer> list = value;
        if (list != null) {
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().intValue() == i) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
