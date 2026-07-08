package com.ss.android.ugc.aweme.im.frequencycontrol.impl.exp;

import X.C09CT;
import X.C13BV;
import X.EnumC1502105uN;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class FrequencyDestroySettingsData {

    @C09CT("business_scope_list")
    public final List<EnumC1502105uN> businessScopeList;

    public FrequencyDestroySettingsData() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FrequencyDestroySettingsData(List<? extends EnumC1502105uN> list) {
        this.businessScopeList = list;
    }

    public FrequencyDestroySettingsData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
