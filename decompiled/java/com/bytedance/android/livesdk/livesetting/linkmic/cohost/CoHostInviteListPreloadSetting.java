package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C01GW;
import X.C13LZ;
import X.C15438062q;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_list_cache_rivals_config_android")
public final class CoHostInviteListPreloadSetting {
    public static final CoHostInviteListPreloadSetting INSTANCE = new CoHostInviteListPreloadSetting();
    public static final CoHostInviteListPreloadConfigs DEFAULT = new CoHostInviteListPreloadConfigs();
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(165));

    public final CoHostInviteListPreloadConfigs getValue() {
        return (CoHostInviteListPreloadConfigs) value$delegate.getValue();
    }

    public final long getFetchValidTimeMillis() {
        return getValue().fetchValidTime;
    }

    public final List<Integer> getRivalSectionOpenPreloadList() {
        List<RivalSectionConfig> list = getValue().rivalSectionConfigs;
        ArrayList arrayList = new ArrayList();
        for (RivalSectionConfig rivalSectionConfig : list) {
            if (rivalSectionConfig.openPreload) {
                arrayList.add(rivalSectionConfig);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((RivalSectionConfig) it2.next()).rivalSectionValue));
        }
        return arrayList2;
    }

    public final boolean isEnable() {
        return getValue().enable;
    }

    public final boolean isExperienceOptEnabled() {
        return getValue().experienceOptEnable;
    }

    public final boolean isFetchWhenCapsuleShowEnabled() {
        return getValue().fetchWhenCapsuleShow;
    }

    public final RivalSectionConfig getRivalSectionConfig(int i) {
        RivalSectionConfig next;
        Iterator<RivalSectionConfig> it2 = getValue().rivalSectionConfigs.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.rivalSectionValue == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public final boolean isCacheRefreshEnabled(int i) {
        int i2;
        RivalSectionExtraConfig rivalSectionExtraConfig;
        RivalSectionConfig rivalSectionConfig = getRivalSectionConfig(i);
        if (rivalSectionConfig == null) {
            return false;
        }
        RivalSectionExtraConfig rivalSectionExtraConfig2 = rivalSectionConfig.extra;
        if (rivalSectionExtraConfig2 != null) {
            i2 = rivalSectionExtraConfig2.refreshTimes;
        } else {
            i2 = 0;
        }
        if (C13LZ.LJ(i2, 0, 5) <= 0 || (rivalSectionExtraConfig = rivalSectionConfig.extra) == null) {
            return false;
        }
        long j = rivalSectionExtraConfig.refreshInterval;
        if ((j <= 0 || j >= 3000) && j <= 0) {
            return false;
        }
        return true;
    }

    public final boolean isMultiPreloadEnabled(int i) {
        RivalSectionConfig rivalSectionConfig = getRivalSectionConfig(i);
        if (rivalSectionConfig == null || C13LZ.LJ(rivalSectionConfig.preloadTimesConfig, 0, 5) <= 1) {
            return false;
        }
        return true;
    }
}
