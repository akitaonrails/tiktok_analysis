package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class UserProfileInitInfo implements Serializable {

    @C09CT("head_model_score")
    public double headModelScore;

    public double getHeadModelScore() {
        return this.headModelScore;
    }

    public void setHeadModelScore(double d) {
        this.headModelScore = d;
    }
}
