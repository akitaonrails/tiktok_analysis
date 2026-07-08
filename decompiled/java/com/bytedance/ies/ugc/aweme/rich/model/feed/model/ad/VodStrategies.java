package com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class VodStrategies implements Serializable {

    @C09CT("super_resolution_priority")
    public final Integer superResolutionPriority;

    public VodStrategies() {
        this(null);
    }

    public VodStrategies(Integer num) {
        this.superResolutionPriority = num;
    }
}
