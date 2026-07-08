package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class ConvertStyle implements Serializable {

    @C09CT("style_list")
    public final List<ConvertStyleItem> styleList;

    public ConvertStyle() {
        this(null, 1, null);
    }

    public int hashCode() {
        return this.styleList.hashCode();
    }

    public ConvertStyle(List<ConvertStyleItem> list) {
        this.styleList = list;
    }

    public ConvertStyle(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
