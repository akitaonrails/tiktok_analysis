package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C13BV;
import android.graphics.RectF;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes34.dex */
public final class LayoutArrayList {
    public final List<RectF> divideList;
    public final Map<String, LayoutArray> indexLayoutArrayMap;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutArrayList(Map<String, LayoutArray> map, List<? extends RectF> list) {
        this.indexLayoutArrayMap = map;
        this.divideList = list;
    }

    public LayoutArrayList(Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
