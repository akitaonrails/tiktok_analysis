package com.ss.android.ugc.aweme.upvote.experiment;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class RepostTriggerOptimizeConfig {

    @C09CT("guide_repost_cep_rules")
    public final List<String> cepRules;

    @C09CT("guide_repost_clientAI_limits")
    public final boolean clientAILimits;

    @C09CT("guide_repost_restore_enable")
    public final boolean enableCache;

    @C09CT("group")
    public final int group;

    @C09CT("guide_repost_limits")
    public final int shareOrCommentLimits;

    @C09CT("guide_repost_when_looped_limits")
    public final int videoLoopLimits;

    @C09CT("guide_repost_when_video_play_times")
    public final int videoPlayTimes;

    public RepostTriggerOptimizeConfig() {
        this(0, 0, 0, false, 0, new ArrayList(), false);
    }

    public RepostTriggerOptimizeConfig(int i, int i2, int i3, boolean z, int i4, List<String> list, boolean z2) {
        this.group = i;
        this.videoLoopLimits = i2;
        this.shareOrCommentLimits = i3;
        this.clientAILimits = z;
        this.videoPlayTimes = i4;
        this.cepRules = list;
        this.enableCache = z2;
    }
}
