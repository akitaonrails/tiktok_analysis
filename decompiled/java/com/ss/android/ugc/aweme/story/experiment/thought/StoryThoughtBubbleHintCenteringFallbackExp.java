package com.ss.android.ugc.aweme.story.experiment.thought;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class StoryThoughtBubbleHintCenteringFallbackExp {
    public static final boolean DEFAULT = false;
    public static final StoryThoughtBubbleHintCenteringFallbackExp INSTANCE = new StoryThoughtBubbleHintCenteringFallbackExp();
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1979));
    public static final int $stable = 8;

    private final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }

    public final boolean fallback() {
        return getValue();
    }
}
