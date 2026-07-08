package com.ss.android.ugc.aweme.ecommerce.loadretreat;

import X.C09CT;
import X.C13BV;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class EcomLoadRetreatConfigEventParams {

    @C09CT("event_name")
    public final String eventName;

    @C09CT("matchers")
    public final List<Map<String, String>> matchers;

    public EcomLoadRetreatConfigEventParams() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EcomLoadRetreatConfigEventParams(String str, List<? extends Map<String, String>> list) {
        this.eventName = str;
        this.matchers = list;
    }

    public EcomLoadRetreatConfigEventParams(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
