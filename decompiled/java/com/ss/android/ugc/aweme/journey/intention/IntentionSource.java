package com.ss.android.ugc.aweme.journey.intention;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class IntentionSource {

    @C09CT("sub_intention")
    public final String subIntention;

    @C09CT("type")
    public final String type;

    @C09CT("value")
    public final List<String> value;

    public IntentionSource() {
        this(null, null, null, 7, null);
    }

    public IntentionSource(String str, List<String> list, String str2) {
        this.type = str;
        this.value = list;
        this.subIntention = str2;
    }

    public IntentionSource(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? "" : str2);
    }
}
