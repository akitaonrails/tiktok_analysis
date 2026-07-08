package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ApplogDegradeInfoList {

    @C09CT("forbidden_param")
    public final Set<String> cuttingProperties;
    public final String event;

    @C09CT("chance")
    public final float sampling;

    @C09CT("force_alog")
    public final boolean transferStorage;

    public ApplogDegradeInfoList() {
        this(0.0f, false, null, "");
    }

    public ApplogDegradeInfoList(float f, boolean z, Set<String> set, String str) {
        this.sampling = f;
        this.transferStorage = z;
        this.cuttingProperties = set;
        this.event = str;
    }
}
