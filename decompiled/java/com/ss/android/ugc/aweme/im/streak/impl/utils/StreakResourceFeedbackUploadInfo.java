package com.ss.android.ugc.aweme.im.streak.impl.utils;

import X.C09CT;
import com.ss.android.ugc.aweme.im.streak.api.StreakResDebugInfo;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakResourceFeedbackUploadInfo {

    @C09CT("is_animation_unlock_keep_last_frame")
    public final Boolean isAnimationUnlockKeepLastFrame;

    @C09CT("is_story_related_experiment_enable")
    public final Boolean isStoryRelatedExperimentEnable;

    @C09CT("provider_in_use")
    public final String providerInUse;

    @C09CT("streak_res_debug_info_list")
    public final List<StreakResDebugInfo> streakResDebugInfoList;

    public StreakResourceFeedbackUploadInfo() {
        this(null, null, null, null);
    }

    public StreakResourceFeedbackUploadInfo(String str, List<StreakResDebugInfo> list, Boolean bool, Boolean bool2) {
        this.providerInUse = str;
        this.streakResDebugInfoList = list;
        this.isStoryRelatedExperimentEnable = bool;
        this.isAnimationUnlockKeepLastFrame = bool2;
    }
}
