package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TabItem {

    @C09CT("btm_data")
    public BTMModel btmData;

    @C09CT("channel_tag")
    public String channelTag;

    @C09CT("dark_icon")
    public TabIcon darkIcon;

    @C09CT("icon")
    public TabIcon icon;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public Integer id;

    @C09CT("name")
    public String name;

    @C09CT("name_en")
    public String nameEn;

    @C09CT("personal_tab_pool_id")
    public String personalTabPoolId;

    public TabItem() {
        this(null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabItem)) {
            return false;
        }
        TabItem tabItem = (TabItem) obj;
        return Intrinsics.LJFF(this.id, tabItem.id) && Intrinsics.LJFF(this.name, tabItem.name) && Intrinsics.LJFF(this.nameEn, tabItem.nameEn) && Intrinsics.LJFF(this.icon, tabItem.icon) && Intrinsics.LJFF(this.darkIcon, tabItem.darkIcon) && Intrinsics.LJFF(this.btmData, tabItem.btmData) && Intrinsics.LJFF(this.channelTag, tabItem.channelTag) && Intrinsics.LJFF(this.personalTabPoolId, tabItem.personalTabPoolId);
    }

    public TabItem(Integer num, String str, String str2, TabIcon tabIcon, TabIcon tabIcon2, BTMModel bTMModel, String str3, String str4) {
        this.id = num;
        this.name = str;
        this.nameEn = str2;
        this.icon = tabIcon;
        this.darkIcon = tabIcon2;
        this.btmData = bTMModel;
        this.channelTag = str3;
        this.personalTabPoolId = str4;
    }
}
