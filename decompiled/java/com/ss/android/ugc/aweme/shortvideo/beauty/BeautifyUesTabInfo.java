package com.ss.android.ugc.aweme.shortvideo.beauty;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class BeautifyUesTabInfo {

    @C09CT("category_diy")
    public final boolean categoryDiy;

    @C09CT("category_name")
    public final String categoryName;

    @C09CT("name_array")
    public final List<String> parentNameList;

    @C09CT("value_array")
    public final List<Integer> parentValueList;

    @C09CT("tab_name")
    public final String tabName;

    public BeautifyUesTabInfo() {
        this("", "", false, new ArrayList(), new ArrayList());
    }

    public BeautifyUesTabInfo(String str, String str2, boolean z, List<String> list, List<Integer> list2) {
        this.tabName = str;
        this.categoryName = str2;
        this.categoryDiy = z;
        this.parentNameList = list;
        this.parentValueList = list2;
    }
}
