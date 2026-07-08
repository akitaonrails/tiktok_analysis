package com.bytedance.android.starship.solaria.define;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.io.Serializable;
import java.util.HashSet;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class FeatureCommonConfig implements Serializable {
    public final transient C01GW features$delegate;

    @C09CT("range")
    public int range;

    @C09CT("sub_type")
    public HashSet<String> subType;

    public FeatureCommonConfig() {
        this(0, null);
    }

    public final HashSet<String> getFeatures() {
        return (HashSet) this.features$delegate.getValue();
    }

    public final void setRange(int i) {
        this.range = i;
    }

    public final void setSubType(HashSet<String> hashSet) {
        this.subType = hashSet;
    }

    public FeatureCommonConfig(int i, HashSet<String> hashSet) {
        this.range = i;
        this.subType = hashSet;
        this.features$delegate = C452501pT.LIZIZ(new AwS561S0100000_17(this, 253));
    }
}
