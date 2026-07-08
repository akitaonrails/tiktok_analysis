package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FeedStrategyPlatformFeatures implements Serializable {

    @C09CT("int_features")
    public List<FeedStrategyPlatformFeature> intFeatures = new ArrayList();

    @C09CT("float_features")
    public List<FeedStrategyPlatformFeature> floatFeatures = new ArrayList();

    @C09CT("string_features")
    public List<FeedStrategyPlatformFeature> stringFeatures = new ArrayList();

    @C09CT("bool_features")
    public List<FeedStrategyPlatformFeature> boolFeatures = new ArrayList();
}
