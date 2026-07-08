package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class IconCfg {

    @C09CT("basic_info_list")
    public final List<BasicInfo> basicInfoList;
    public final Long duration;

    @C09CT("icon_url")
    public final String iconUrl;

    public IconCfg(String str, Long l, List<BasicInfo> list) {
        this.iconUrl = str;
        this.duration = l;
        this.basicInfoList = list;
    }
}
