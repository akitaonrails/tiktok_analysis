package com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedReachUpdateParams {

    @C09CT("reach_cfg_list")
    public final List<ReachCfg> reachCfgList;

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    @C09CT("update_props")
    public final int updateProps;

    public FeedReachUpdateParams(int i, List<ReachCfg> list, int i2) {
        this.updateProps = i;
        this.reachCfgList = list;
        this.scene = i2;
    }
}
