package com.ss.android.ugc.aweme.feed;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class AIGCInfo implements Serializable {

    @C09CT("aigc_label_type")
    public int AIGCLabelType;

    @C09CT("created_by_ai")
    public boolean createByAI;

    public AIGCInfo() {
        this(0, false);
    }

    public final int getAIGCLabelType() {
        return this.AIGCLabelType;
    }

    public final void setAIGCLabelType(int i) {
        this.AIGCLabelType = i;
    }

    public AIGCInfo(int i, boolean z) {
        this.AIGCLabelType = i;
        this.createByAI = z;
    }
}
