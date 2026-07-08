package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleLive {

    @C09CT("aweme_info")
    public final Aweme aweme;

    public SingleLive() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SingleLive) && Intrinsics.LJFF(this.aweme, ((SingleLive) obj).aweme);
    }

    public final int hashCode() {
        Aweme aweme = this.aweme;
        if (aweme == null) {
            return 0;
        }
        return aweme.hashCode();
    }

    public SingleLive(Aweme aweme) {
        this.aweme = aweme;
    }
}
