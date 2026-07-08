package com.ss.android.ugc.aweme.resource;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class CategoryData {

    @C09CT("app_id")
    public final int appId;

    @C09CT("category_id")
    public final long categoryId;

    @C09CT("data_infos")
    public final DataListInfo dataInfos;

    @C09CT("icon_uri")
    public final String iconUri;

    @C09CT("name")
    public final String name;

    @C09CT("region_key")
    public final String regionKey;

    public CategoryData() {
        this(0, "", 0L, "", "", null);
    }

    public CategoryData(int i, String str, long j, String str2, String str3, DataListInfo dataListInfo) {
        this.appId = i;
        this.regionKey = str;
        this.categoryId = j;
        this.name = str2;
        this.iconUri = str3;
        this.dataInfos = dataListInfo;
    }
}
