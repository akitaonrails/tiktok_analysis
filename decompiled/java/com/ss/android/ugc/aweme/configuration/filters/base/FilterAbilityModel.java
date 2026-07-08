package com.ss.android.ugc.aweme.configuration.filters.base;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class FilterAbilityModel {

    @C09CT("name")
    public final String name;

    @C09CT("operator")
    public final String operator;

    @C09CT("result")
    public final String result;

    @C09CT("sub_filters")
    public final List<List<FilterAbilityModel>> subFilters;

    @C09CT("value")
    public final String value;

    public FilterAbilityModel() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FilterAbilityModel(String str, String str2, String str3, String str4, List<? extends List<FilterAbilityModel>> list) {
        this.name = str;
        this.operator = str2;
        this.value = str3;
        this.result = str4;
        this.subFilters = list;
    }

    public FilterAbilityModel(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? C13BV.INSTANCE : list);
    }
}
