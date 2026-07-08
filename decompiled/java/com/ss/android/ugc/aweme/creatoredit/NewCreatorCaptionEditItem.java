package com.ss.android.ugc.aweme.creatoredit;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class NewCreatorCaptionEditItem {
    public final boolean isUnderReview;
    public final int remainingEditTimes;
    public final List<CreatorCaptionEditData> transSubtitleItem;

    public final boolean isUnderReview() {
        return this.isUnderReview;
    }

    public NewCreatorCaptionEditItem(List<CreatorCaptionEditData> list, int i, boolean z) {
        this.transSubtitleItem = list;
        this.remainingEditTimes = i;
        this.isUnderReview = z;
    }
}
