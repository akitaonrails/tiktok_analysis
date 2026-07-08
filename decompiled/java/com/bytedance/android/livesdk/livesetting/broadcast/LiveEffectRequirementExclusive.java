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
@SettingsKey("live_effect_requirement_repel_with_background")
public final class LiveEffectRequirementExclusive {
    public static final LiveEffectRequirementExclusive INSTANCE = new LiveEffectRequirementExclusive();
    public static final String[] DEFAULT = {"matting", "script", "mega", "nh_inference", "gpu_render", "swapperme", "swaplive", "big_gan", "old_gan", "beauty_gan", "gender_gan", "female_gan", "face_gan", "idream", "manga", "laughgan", "biggan", "oldgan", "beautygan", "gendergan", "femalegan", "facegan", "cine_move", "video_relit"};

    private final Set<String> getPathList() {
        HashSet hashSet = new HashSet();
        C19719612Di.LJJII(hashSet, SettingsManager.INSTANCE.getStringArrayValue("live_effect_requirement_repel_with_background", DEFAULT));
        return hashSet;
    }

    public final boolean isCoexist(List<String> list) {
        return !isExclusive(list);
    }

    public final boolean isExclusive(List<String> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            if (INSTANCE.getPathList().contains(it2.next())) {
                C20441214yg.LIZ("LiveEffectRequirementExclusive");
                return true;
            }
        }
        return false;
    }
}
