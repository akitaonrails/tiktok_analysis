package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes13.dex */
public final class UnifiedModeTextData implements Serializable {
    public static final int $stable = 8;

    @C09CT("unified_mode_detail")
    public final String description;

    @C09CT("item_link_list")
    public final List<String> itemLinkList;

    @C09CT("item_list")
    public final List<String> itemList;

    @C09CT("unified_mode_title")
    public final String title;

    public UnifiedModeTextData() {
        this(null, null, null, null, 15, null);
    }

    public UnifiedModeTextData(String str, String str2, List<String> list, List<String> list2) {
        this.title = str;
        this.description = str2;
        this.itemList = list;
        this.itemLinkList = list2;
    }

    public UnifiedModeTextData(String str, String str2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? C13BV.INSTANCE : list2);
    }
}
