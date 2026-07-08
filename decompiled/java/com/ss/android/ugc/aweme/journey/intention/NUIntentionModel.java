package com.ss.android.ugc.aweme.journey.intention;

import X.C09CT;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class NUIntentionModel {

    @C09CT("intentions")
    public final Map<String, List<IntentionSource>> intentions;

    public NUIntentionModel() {
        this(C2097608Jq.LJ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NUIntentionModel(Map<String, ? extends List<IntentionSource>> map) {
        this.intentions = map;
    }
}
