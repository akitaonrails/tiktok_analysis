package com.ss.android.ugc.aweme.feed.ab;

import X.C09CT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class FeedLynxCardConfig {

    @C09CT("enable_fix_bind_reset")
    public final boolean enableFixBindReset;

    @C09CT("whitelist_for_ignore_error_code")
    public final List<Integer> whiteListForIgnoreErrorCode;

    public FeedLynxCardConfig() {
        this(false, null, 3, null);
    }

    public FeedLynxCardConfig(boolean z, List<Integer> list) {
        this.enableFixBindReset = z;
        this.whiteListForIgnoreErrorCode = list;
    }

    public FeedLynxCardConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Collections.singletonList(301) : list);
    }
}
