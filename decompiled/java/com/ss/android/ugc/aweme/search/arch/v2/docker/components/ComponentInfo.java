package com.ss.android.ugc.aweme.search.arch.v2.docker.components;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ComponentInfo {

    @C09CT("biz_data")
    public final BizData bizData;

    @C09CT("components")
    public final List<ComponentInfo> components;

    @C09CT("component_type")
    public final String type;

    public ComponentInfo(String str, BizData bizData, List<ComponentInfo> list) {
        this.type = str;
        this.bizData = bizData;
        this.components = list;
    }
}
