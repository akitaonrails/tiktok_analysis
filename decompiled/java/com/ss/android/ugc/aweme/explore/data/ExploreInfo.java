package com.ss.android.ugc.aweme.explore.data;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreInfo implements Serializable {

    @C09CT("stage")
    public List<ExploreStage> stage;

    public ExploreInfo() {
        this(null);
    }

    public ExploreInfo(List<ExploreStage> list) {
        this.stage = list;
    }

    public final void setStage(List<ExploreStage> list) {
        this.stage = list;
    }
}
