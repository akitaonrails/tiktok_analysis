package com.ss.android.ugc.aweme.configuration.models;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.configuration.filters.base.FilterAbilityModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class NUAbilityNode {

    @C09CT("desc")
    public final String desc;

    @C09CT("fallback_result")
    public final String fallbackResult;

    @C09CT("filters")
    public final List<FilterAbilityModel> filters;

    @C09CT("functions")
    public final List<NUFunctionModel> functions;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("target_link")
    public final List<String> targetLink;

    @C09CT("triggers")
    public final List<String> triggers;

    public NUAbilityNode() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public NUAbilityNode(String str, String str2, String str3, List<FilterAbilityModel> list, List<String> list2, List<String> list3, List<NUFunctionModel> list4) {
        this.id = str;
        this.desc = str2;
        this.fallbackResult = str3;
        this.filters = list;
        this.triggers = list2;
        this.targetLink = list3;
        this.functions = list4;
    }

    public NUAbilityNode(String str, String str2, String str3, List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : str3, (i & 8) != 0 ? C13BV.INSTANCE : list, (i & 16) != 0 ? C13BV.INSTANCE : list2, (i & 32) != 0 ? C13BV.INSTANCE : list3, (i & 64) != 0 ? C13BV.INSTANCE : list4);
    }
}
