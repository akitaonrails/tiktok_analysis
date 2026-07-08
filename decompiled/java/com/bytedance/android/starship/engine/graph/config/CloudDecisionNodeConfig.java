package com.bytedance.android.starship.engine.graph.config;

import X.C09CS;
import X.C09CT;
import X.EnumC587600N2w;

/* JADX INFO: loaded from: classes14.dex */
public final class CloudDecisionNodeConfig {

    @C09CT("decision_result")
    public final String decisionResult;

    @C09CT("source")
    @C09CS(CloudDecisionSourceAdapter.class)
    public final EnumC587600N2w source;

    public CloudDecisionNodeConfig(EnumC587600N2w enumC587600N2w, String str) {
        this.source = enumC587600N2w;
        this.decisionResult = str;
    }
}
