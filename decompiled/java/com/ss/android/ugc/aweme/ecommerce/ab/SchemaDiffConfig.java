package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class SchemaDiffConfig {

    @C09CT("api_list")
    public final List<String> apiList;

    @C09CT("enable")
    public final boolean isEnable;

    @C09CT("schema_list")
    public final List<String> schemaList;

    public SchemaDiffConfig() {
        this(false, new ArrayList(), new ArrayList());
    }

    public SchemaDiffConfig(boolean z, List<String> list, List<String> list2) {
        this.isEnable = z;
        this.apiList = list;
        this.schemaList = list2;
    }
}
