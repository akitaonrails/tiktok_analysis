package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class CustomDotUpdateParams {

    @C09CT("basic_info_list")
    public final List<BasicInfo> basicInfoList;

    @C09CT("is_shop_tab")
    public final int isShopTab;

    @C09CT("need_merge")
    public final int needMerge;

    @C09CT("reach_cfg_list")
    public final List<ReachCfg> reachCfgList;

    @C09CT("shop_tab_position")
    public final int shopTabPosition;

    @C09CT("update_props")
    public final int updateProps;

    public CustomDotUpdateParams(int i, List<BasicInfo> list, int i2, int i3, int i4, List<ReachCfg> list2) {
        this.updateProps = i;
        this.basicInfoList = list;
        this.needMerge = i2;
        this.isShopTab = i3;
        this.shopTabPosition = i4;
        this.reachCfgList = list2;
    }
}
