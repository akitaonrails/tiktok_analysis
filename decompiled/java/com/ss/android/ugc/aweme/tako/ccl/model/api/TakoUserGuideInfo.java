package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class TakoUserGuideInfo {

    @C09CT("user_guide_item_list")
    public final List<TakoUserGuideItem> itemList;

    @C09CT("type")
    public final int type;

    public TakoUserGuideInfo() {
        this(0, null, 3, null);
    }

    public TakoUserGuideInfo(int i, List<TakoUserGuideItem> list) {
        this.type = i;
        this.itemList = list;
    }

    public TakoUserGuideInfo(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
