package com.ss.android.ugc.playerkit.model.bright;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class VideoConditions {
    public List<BaseCondition<Float>> conditions;
    public String name;

    public List<BaseCondition<Float>> getFeatureConditions() {
        return this.conditions;
    }

    public String getVideoType() {
        return this.name;
    }
}
