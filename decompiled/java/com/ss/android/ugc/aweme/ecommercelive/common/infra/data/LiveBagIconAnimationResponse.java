package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class LiveBagIconAnimationResponse {

    @C09CT("live_bag_icon_animation")
    public final LiveBagIconAnimation animationData;

    @C09CT("live_bag_icon_animation_infos")
    public final List<LiveBagIconAnimation> liveBagIconAnimationInfos;

    public LiveBagIconAnimationResponse(LiveBagIconAnimation liveBagIconAnimation, List<LiveBagIconAnimation> list) {
        this.animationData = liveBagIconAnimation;
        this.liveBagIconAnimationInfos = list;
    }
}
