package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class PhotoDetailCommentEntryExperiment {
    public static final PhotoDetailCommentEntryExperiment INSTANCE = new PhotoDetailCommentEntryExperiment();
    public static final PhotoDetailCommentEntryConfig DEFAULT = new PhotoDetailCommentEntryConfig(false, false);
    public static final C01GW config$delegate = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(242));

    private final PhotoDetailCommentEntryConfig getConfig() {
        return (PhotoDetailCommentEntryConfig) config$delegate.getValue();
    }

    public static final boolean isCommentEntryEnabled() {
        PhotoDetailCommentEntryConfig config = INSTANCE.getConfig();
        return config != null && config.addCommentEntry;
    }

    public static final boolean isRoundedInputBoxEnabled() {
        PhotoDetailCommentEntryConfig config = INSTANCE.getConfig();
        return config != null && config.roundedInputBox;
    }

    public final PhotoDetailCommentEntryConfig getDEFAULT() {
        return DEFAULT;
    }
}
