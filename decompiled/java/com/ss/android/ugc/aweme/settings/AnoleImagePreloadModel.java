package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleImagePreloadModel {

    @C09CT("component_type_list")
    public final List<String> componentTypeListList;

    @C09CT("enable")
    public final boolean enable;

    public AnoleImagePreloadModel() {
        this(false, null);
    }

    public AnoleImagePreloadModel(boolean z, List<String> list) {
        this.enable = z;
        this.componentTypeListList = list;
    }
}
