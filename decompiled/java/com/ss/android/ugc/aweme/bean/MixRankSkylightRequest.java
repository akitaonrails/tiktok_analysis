package com.ss.android.ugc.aweme.bean;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes25.dex */
public final class MixRankSkylightRequest implements Serializable {

    @C09CT("biz_params")
    public final MixRankSkylightBizParams bizParams;

    @C09CT("skylight_requests_by_scene")
    public final List<MixRankSkylightSceneRequest> requestsByScene;

    public MixRankSkylightRequest() {
        this(null, null, 3, null);
    }

    public MixRankSkylightRequest(List<MixRankSkylightSceneRequest> list, MixRankSkylightBizParams mixRankSkylightBizParams) {
        this.requestsByScene = list;
        this.bizParams = mixRankSkylightBizParams;
    }

    public MixRankSkylightRequest(List list, MixRankSkylightBizParams mixRankSkylightBizParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : mixRankSkylightBizParams);
    }
}
