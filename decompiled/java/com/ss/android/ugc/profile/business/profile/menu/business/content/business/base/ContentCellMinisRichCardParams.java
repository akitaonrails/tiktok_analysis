package com.ss.android.ugc.profile.business.profile.menu.business.content.business.base;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class ContentCellMinisRichCardParams implements Serializable {
    public static final int $stable = 8;

    @C09CT("minis_client_key_list")
    public final List<String> minisClientKeyList;

    @C09CT("minis_list")
    public final List<Map<String, Object>> minisList;

    @C09CT("minis_type_list")
    public final List<String> minisTypeList;

    public ContentCellMinisRichCardParams() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContentCellMinisRichCardParams(List<String> list, List<String> list2, List<? extends Map<String, ? extends Object>> list3) {
        this.minisClientKeyList = list;
        this.minisTypeList = list2;
        this.minisList = list3;
    }

    public ContentCellMinisRichCardParams(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3);
    }
}
