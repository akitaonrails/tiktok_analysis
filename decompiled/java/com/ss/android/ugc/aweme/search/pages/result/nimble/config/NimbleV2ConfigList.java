package com.ss.android.ugc.aweme.search.pages.result.nimble.config;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class NimbleV2ConfigList {

    @C09CT("container_template_list")
    public final List<NimbleV2ConfigData> containerTemplateList;

    @C09CT("template_list")
    public final List<NimbleV2ConfigData> templateList;

    public NimbleV2ConfigList() {
        this(null, null, 3, null);
    }

    public NimbleV2ConfigList(List<NimbleV2ConfigData> list, List<NimbleV2ConfigData> list2) {
        this.templateList = list;
        this.containerTemplateList = list2;
    }

    public NimbleV2ConfigList(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
