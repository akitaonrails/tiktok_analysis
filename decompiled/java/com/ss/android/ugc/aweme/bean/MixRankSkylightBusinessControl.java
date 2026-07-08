package com.ss.android.ugc.aweme.bean;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class MixRankSkylightBusinessControl implements Serializable {

    @C09CT("skylight_common_control_by_scene")
    public final MixRankSkylightCommonControl commonControl;

    @C09CT("skylight_story_control_by_scene")
    public final MixRankSkylightStoryBiz storyControl;

    public MixRankSkylightBusinessControl() {
        this(null, null);
    }

    public MixRankSkylightBusinessControl(MixRankSkylightCommonControl mixRankSkylightCommonControl, MixRankSkylightStoryBiz mixRankSkylightStoryBiz) {
        this.commonControl = mixRankSkylightCommonControl;
        this.storyControl = mixRankSkylightStoryBiz;
    }
}
