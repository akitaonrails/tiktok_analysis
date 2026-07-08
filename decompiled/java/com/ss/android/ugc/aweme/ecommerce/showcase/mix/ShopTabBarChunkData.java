package com.ss.android.ugc.aweme.ecommerce.showcase.mix;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.mix.model.TabBarItemData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class ShopTabBarChunkData {

    @C09CT("bff_type")
    public final Integer bffType;

    @C09CT("hidden")
    public final Integer hidden;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("runtime")
    public final ShopRuntimeData runtime;

    @C09CT("tab_bar_style")
    public final TabBarStyle tabBarStyle;

    @C09CT("tab_data_list")
    public final List<TabBarItemData> tabList;

    public ShopTabBarChunkData(String str, Integer num, List<TabBarItemData> list, Integer num2, TabBarStyle tabBarStyle, ShopRuntimeData shopRuntimeData) {
        this.id = str;
        this.bffType = num;
        this.tabList = list;
        this.hidden = num2;
        this.tabBarStyle = tabBarStyle;
        this.runtime = shopRuntimeData;
    }
}
