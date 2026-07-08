package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class CustomDotUpdateParamsV2 {

    @C09CT("bring_back_info")
    public final String bringBackInfo;

    @C09CT("reach_cfg_list")
    public final List<ReachCfg> reachCfgList;

    @C09CT("shop_tab_position")
    public final int shopTabPosition;

    @C09CT("update_props")
    public final int updateProps;

    public CustomDotUpdateParamsV2(int i, int i2, List<ReachCfg> list, String str) {
        this.updateProps = i;
        this.shopTabPosition = i2;
        this.reachCfgList = list;
        this.bringBackInfo = str;
    }
}
