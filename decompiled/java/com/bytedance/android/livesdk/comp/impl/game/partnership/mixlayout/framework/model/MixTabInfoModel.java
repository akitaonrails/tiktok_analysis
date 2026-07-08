package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class MixTabInfoModel {

    @C09CT("default_tab")
    public String defaultTab;

    @C09CT("tabs")
    public final List<MixTabModel> tabs;

    public MixTabInfoModel() {
        this(null, null, 3, null);
    }

    public MixTabInfoModel(String str) {
        this(str, null, 2, null);
    }

    public MixTabInfoModel(String str, List<MixTabModel> list) {
        this.defaultTab = str;
        this.tabs = list;
    }

    public MixTabInfoModel(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
