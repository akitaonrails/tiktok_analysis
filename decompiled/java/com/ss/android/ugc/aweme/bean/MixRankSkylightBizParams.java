package com.ss.android.ugc.aweme.bean;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class MixRankSkylightBizParams implements Serializable {

    @C09CT("common_biz_params")
    public final MixRankSkylightCommonBizParams commonBizParams;

    @C09CT("live_biz_params")
    public final MixRanSkylightLiveBizParams liveBizParams;

    @C09CT("story_biz_params")
    public final MixRanSkylightStoryBizParams storyBizParams;

    public MixRankSkylightBizParams() {
        this(null, null, null);
    }

    public MixRankSkylightBizParams(MixRankSkylightCommonBizParams mixRankSkylightCommonBizParams, MixRanSkylightStoryBizParams mixRanSkylightStoryBizParams, MixRanSkylightLiveBizParams mixRanSkylightLiveBizParams) {
        this.commonBizParams = mixRankSkylightCommonBizParams;
        this.storyBizParams = mixRanSkylightStoryBizParams;
        this.liveBizParams = mixRanSkylightLiveBizParams;
    }
}
