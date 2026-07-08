package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C2095008Iq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_add_server_feature_setting")
public final class LiveAddServerFeatureSetting {
    public static final LiveAddServerFeatureSetting INSTANCE = new LiveAddServerFeatureSetting();
    public static final Config DEFAULT = new Config(false, new LinkedHashMap());

    public final Config getValue() {
        return (Config) SettingsManager.INSTANCE.getValueSafely("live_add_server_feature_setting", DEFAULT);
    }

    public final boolean disable() {
        return !enable();
    }

    public final boolean enable() {
        Config value = getValue();
        if (value != null) {
            return value.enable;
        }
        return false;
    }

    public final List<Integer> getFeatureIds() {
        Set<String> linkedHashSet;
        Map<String, Integer> map;
        try {
            Config value = getValue();
            if (value == null || (map = value.featureIds) == null || (linkedHashSet = map.keySet()) == null) {
                linkedHashSet = new LinkedHashSet<>();
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) it2.next());
                if (numLJIIJJI != null) {
                    arrayList.add(numLJIIJJI);
                }
            }
            return new ArrayList(arrayList);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new ArrayList();
        }
    }

    public final Config getDEFAULT() {
        return DEFAULT;
    }
}
