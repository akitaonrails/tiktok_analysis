package com.ss.android.ugc.aweme.ecommerce.ug.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class XOpenHookConfigModel {

    @C09CT("btm_page_code_list")
    public final List<String> btmPageCodeList;

    @C09CT("schema_allow_list")
    public final List<String> schemaAllowList;

    public XOpenHookConfigModel() {
        this(null, null);
    }

    public XOpenHookConfigModel(List<String> list, List<String> list2) {
        this.btmPageCodeList = list;
        this.schemaAllowList = list2;
    }
}
