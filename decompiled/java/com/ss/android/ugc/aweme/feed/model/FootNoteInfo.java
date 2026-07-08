package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.tuc.TUCBannerData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class FootNoteInfo implements Serializable {

    @C09CT("footnote_feed_banner")
    public TUCBannerData banner;

    @C09CT("can_add_footnote")
    public Integer canAddFootNote;

    @C09CT("dedicated_footnote")
    public MainPendingFootNoteInfo mainPendingFootNote;

    @C09CT("pending_count")
    public Integer pendingNum;

    public FootNoteInfo() {
        this(0, 0, null, null);
    }

    public final void setPendingNum(Integer num) {
        this.pendingNum = num;
    }

    public FootNoteInfo(Integer num, Integer num2, TUCBannerData tUCBannerData, MainPendingFootNoteInfo mainPendingFootNoteInfo) {
        this.canAddFootNote = num;
        this.pendingNum = num2;
        this.banner = tUCBannerData;
        this.mainPendingFootNote = mainPendingFootNoteInfo;
    }
}
