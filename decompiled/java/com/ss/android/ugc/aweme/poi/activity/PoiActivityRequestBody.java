package com.ss.android.ugc.aweme.poi.activity;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PoiActivityRequestBody implements Serializable {

    @C09CT("requirement")
    public final List<String> requirement;

    public final List<String> getRequirement() {
        return this.requirement;
    }

    public PoiActivityRequestBody(List<String> list) {
        this.requirement = list;
    }
}
