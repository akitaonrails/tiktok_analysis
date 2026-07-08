package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C13BV;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_room_enter_message_avoid_capsule_types")
public final class LiveRoomEnterMessageAvoidCapsuleTypesSetting {
    public static final LiveRoomEnterMessageAvoidCapsuleTypesSetting INSTANCE = new LiveRoomEnterMessageAvoidCapsuleTypesSetting();
    public static final List<Double> DEFAULT = C13BV.INSTANCE;

    public final List<Double> getValue() {
        return (List) SettingsManager.INSTANCE.getValueSafely("live_room_enter_message_avoid_capsule_types", DEFAULT);
    }

    public final boolean contains(int i) {
        List<Double> value = getValue();
        if (value != null) {
            Iterator<Double> it2 = value.iterator();
            while (it2.hasNext()) {
                if (it2.next().doubleValue() == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
