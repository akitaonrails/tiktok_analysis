package com.ss.android.ugc.feed.platform.cell.component.stickermanager.gesturesafe;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes30.dex */
public final class FeedStickerSafeRuleInfo {
    public static final int $stable = 8;

    @C09CT("cover_limit_info")
    public final CoverLimitInfo coverLimitInfo;

    @C09CT("forbid_ges")
    public final ArrayList<ForbidGestureInfo> forbidGestureList;

    @C09CT("global_forbid_ges")
    public final ArrayList<String> globalForbidGesture;

    public FeedStickerSafeRuleInfo() {
        this(null, null, null);
    }

    public FeedStickerSafeRuleInfo(ArrayList<String> arrayList, CoverLimitInfo coverLimitInfo, ArrayList<ForbidGestureInfo> arrayList2) {
        this.globalForbidGesture = arrayList;
        this.coverLimitInfo = coverLimitInfo;
        this.forbidGestureList = arrayList2;
    }
}
