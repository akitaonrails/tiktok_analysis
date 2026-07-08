package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C19719612Di;
import X.C20441214yg;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_effect_requirement_repel_with_liveboards")
public final class LiveEffectRequirementExclusiveForLiveBoards {
    public static final LiveEffectRequirementExclusiveForLiveBoards INSTANCE = new LiveEffectRequirementExclusiveForLiveBoards();
    public static final String[] DEFAULT = {"matting", "GAN"};

    private final Set<String> getPathList() {
        HashSet hashSet = new HashSet();
        C19719612Di.LJJII(hashSet, SettingsManager.INSTANCE.getStringArrayValue("live_effect_requirement_repel_with_liveboards", DEFAULT));
        return hashSet;
    }

    public final boolean isExclusive(List<String> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            if (INSTANCE.getPathList().contains(it2.next())) {
                C20441214yg.LIZ("LiveEffectRequirementExclusiveForLiveBoards");
                return true;
            }
        }
        return false;
    }
}
