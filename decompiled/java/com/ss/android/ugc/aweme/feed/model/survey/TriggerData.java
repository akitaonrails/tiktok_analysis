package com.ss.android.ugc.aweme.feed.model.survey;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public final class TriggerData implements Serializable {

    @C09CT("action")
    public int action;

    @C09CT("ratio")
    public float ratio;

    public TriggerData() {
        this(0, 1.0f);
    }

    public final void setAction(int i) {
        this.action = i;
    }

    public final void setRatio(float f) {
        this.ratio = f;
    }

    public TriggerData(int i, float f) {
        this.action = i;
        this.ratio = f;
    }
}
