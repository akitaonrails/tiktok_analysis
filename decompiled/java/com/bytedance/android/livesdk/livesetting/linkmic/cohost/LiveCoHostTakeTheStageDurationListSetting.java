package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C13LP;
import X.C1697810uHb;
import X.C2095008Iq;
import X.C2327809Ae;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_take_the_stage_duration_list")
public final class LiveCoHostTakeTheStageDurationListSetting {
    public static final LiveCoHostTakeTheStageDurationListSetting INSTANCE = new LiveCoHostTakeTheStageDurationListSetting();
    public static final List<Long> DEFAULT = C1697810uHb.LJIIJJI(90L, 180L, 300L);

    public final List<Long> getValue() {
        List list = (List) SettingsManager.INSTANCE.getValueSafely("live_take_the_stage_duration_list", DEFAULT);
        ArrayList arrayList = new ArrayList();
        for (Object objValueOf : list) {
            if (!(objValueOf instanceof Long)) {
                if (objValueOf instanceof Integer) {
                    objValueOf = Long.valueOf(((Number) objValueOf).intValue());
                } else if (objValueOf instanceof Double) {
                    objValueOf = Long.valueOf((long) ((Number) objValueOf).doubleValue());
                } else if (objValueOf instanceof Float) {
                    objValueOf = Long.valueOf((long) ((Number) objValueOf).floatValue());
                } else if (objValueOf instanceof Number) {
                    objValueOf = Long.valueOf(((Number) objValueOf).longValue());
                } else if (objValueOf instanceof String) {
                    String str = (String) objValueOf;
                    Object objLJIILIIL = C2095008Iq.LJIILIIL(str);
                    if (objLJIILIIL == null) {
                        Double dLJII = C2327809Ae.LJII(str);
                        if (dLJII != null) {
                            objValueOf = Long.valueOf((long) dLJII.doubleValue());
                        }
                    } else {
                        objValueOf = objLJIILIIL;
                        arrayList.add(objValueOf);
                    }
                }
            }
            if (objValueOf != null) {
                arrayList.add(objValueOf);
            }
        }
        return (arrayList.size() == list.size() && (arrayList.isEmpty() ^ true)) ? arrayList : DEFAULT;
    }

    public final long getFirstDuration() {
        Long l = (Long) C13LP.LJJJLL(getValue());
        return l != null ? l.longValue() : ((Number) ListProtector.get(DEFAULT, 0)).longValue();
    }
}
