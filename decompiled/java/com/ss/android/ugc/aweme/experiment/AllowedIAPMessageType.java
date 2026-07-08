package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class AllowedIAPMessageType {

    @C09CT("allowed_message_type_list")
    public final List<Integer> iapTypes;

    public AllowedIAPMessageType() {
        this(null, 1, null);
    }

    public AllowedIAPMessageType(List<Integer> list) {
        this.iapTypes = list;
    }

    public AllowedIAPMessageType(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
