package com.ss.android.ugc.aweme.verify;

import X.C01GW;
import X.C1697810uHb;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class FeedPropPinConfig {
    public static final FeedPropPinConfig INSTANCE = new FeedPropPinConfig();
    public static final PropPinConfig DEFAULT = new PropPinConfig(C1697810uHb.LJIIJJI("homepage_hot", "homepage_friends", "homepage_follow", "homepage_topic_stem"), 1);
    public static final C01GW VALUE$delegate = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(504));
    public static final C01GW count$delegate = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(506));
    public static final C01GW allowList$delegate = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(505));

    public final List<String> getAllowList() {
        return (List) allowList$delegate.getValue();
    }

    public final int getCount() {
        return ((Number) count$delegate.getValue()).intValue();
    }

    public final PropPinConfig getVALUE() {
        return (PropPinConfig) VALUE$delegate.getValue();
    }

    public final PropPinConfig getDEFAULT() {
        return DEFAULT;
    }
}
