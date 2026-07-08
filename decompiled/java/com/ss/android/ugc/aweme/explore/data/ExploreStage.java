package com.ss.android.ugc.aweme.explore.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreStage implements Serializable {

    @C09CT("duration")
    public String duration;

    @C09CT("type")
    public String type;

    public ExploreStage() {
        this("", "");
    }

    public final void setDuration(String str) {
        this.duration = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public ExploreStage(String str, String str2) {
        this.type = str;
        this.duration = str2;
    }
}
