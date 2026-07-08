package com.bytedance.pumbaa.hybrid.governance.api.config;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class IframeConfigItem {

    @C09CT("allow_business")
    public final List<String> allowBusinessList;

    @C09CT("jsName")
    public final List<String> jsName;

    @C09CT("mainFrameAllowList")
    public final List<String> mainFrameAllowList;

    public IframeConfigItem() {
        this(null, null, null, 7, null);
    }

    public IframeConfigItem(List<String> list, List<String> list2, List<String> list3) {
        this.jsName = list;
        this.mainFrameAllowList = list2;
        this.allowBusinessList = list3;
    }

    public IframeConfigItem(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3);
    }
}
