package com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedReachResponse {

    @C09CT("reach_cfg_list")
    public final List<ReachCfg> reachConfigList;

    public FeedReachResponse(List<ReachCfg> list) {
        this.reachConfigList = list;
    }
}
