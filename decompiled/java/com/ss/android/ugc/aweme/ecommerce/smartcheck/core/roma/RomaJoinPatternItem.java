package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class RomaJoinPatternItem {

    @C09CT("pattern")
    public final String pattern;

    @C09CT("patternKey")
    public final List<RomaPatternKey> patternKey;

    @C09CT("title")
    public final String title;

    public final String getPattern() {
        return this.pattern;
    }

    public final List<RomaPatternKey> getPatternKey() {
        return this.patternKey;
    }

    public final String getTitle() {
        return this.title;
    }
}
