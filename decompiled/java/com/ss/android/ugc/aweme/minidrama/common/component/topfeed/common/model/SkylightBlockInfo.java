package com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model;

import X.C09CT;
import com.ss.android.ugc.aweme.minidrama.tab.v2.navbar.NavItem;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class SkylightBlockInfo {

    @C09CT("card_style")
    public final Integer cardStyle;

    @C09CT("history_list")
    public final List<SkylightCommonItem> historyList;

    @C09CT("nav_list")
    public final List<NavItem> navList;

    @C09CT("scene_list")
    public final List<SeriesCenterCenterScene> sceneList;

    @C09CT("trending_list")
    public final List<SkylightCommonItem> trendingList;

    public SkylightBlockInfo(Integer num, List<SkylightCommonItem> list, List<SkylightCommonItem> list2, List<SeriesCenterCenterScene> list3, List<NavItem> list4) {
        this.cardStyle = num;
        this.historyList = list;
        this.trendingList = list2;
        this.sceneList = list3;
        this.navList = list4;
    }
}
