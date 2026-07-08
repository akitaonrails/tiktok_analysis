package com.ss.android.ugc.aweme.story.experiment;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class StoryInboxLegacyNoteBubbleShowEtFixExp {
    public static final boolean DEFAULT = false;
    public static final StoryInboxLegacyNoteBubbleShowEtFixExp INSTANCE = new StoryInboxLegacyNoteBubbleShowEtFixExp();
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1977));
    public static final int $stable = 8;

    private final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }

    public final boolean fallback() {
        return getValue();
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
