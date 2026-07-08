package com.ss.android.ugc.aweme.ml.feature.meta;

import X.C09CT;
import com.ss.ugc.clientai.core.api.meta.FeatureGroup;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes24.dex */
public final class FeatureGroupCheck implements Serializable {

    @C09CT("all_features")
    public Set<FeatureGroup> groups;

    public FeatureGroupCheck() {
        this(new LinkedHashSet());
    }

    public FeatureGroupCheck(Set<FeatureGroup> set) {
        this.groups = set;
    }

    public final void setGroups(Set<FeatureGroup> set) {
        this.groups = set;
    }
}
