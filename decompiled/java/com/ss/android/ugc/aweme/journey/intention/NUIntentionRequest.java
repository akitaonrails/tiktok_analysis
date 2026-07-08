package com.ss.android.ugc.aweme.journey.intention;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class NUIntentionRequest {

    @C09CT("intentions")
    public final List<IntentionStruct> intentions;

    public NUIntentionRequest() {
        this(null, 1, null);
    }

    public NUIntentionRequest(List<IntentionStruct> list) {
        this.intentions = list;
    }

    public NUIntentionRequest(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
