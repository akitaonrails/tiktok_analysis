package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class RelevantClip implements Serializable {

    @C09CT("enable_skip_button")
    public final Boolean enableSkipButton;

    @C09CT("revelant_times")
    public final List<Float> relevantTimes;

    public RelevantClip() {
        this(Boolean.FALSE, null);
    }

    public RelevantClip(Boolean bool, List<Float> list) {
        this.enableSkipButton = bool;
        this.relevantTimes = list;
    }
}
