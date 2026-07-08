package com.ss.android.ugc.aweme.poi.creator;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PoiCreatorConfigRequestBody implements Serializable {

    @C09CT("requirement")
    public final List<String> requirement;

    public final List<String> getRequirement() {
        return this.requirement;
    }

    public PoiCreatorConfigRequestBody(List<String> list) {
        this.requirement = list;
    }
}
