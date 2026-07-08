package com.ss.android.ugc.aweme.feed.gesture;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class GestureHotfix {

    @C09CT("gesture_hotfix_enable")
    public final boolean gestureHotfixEnable;

    @C09CT("gesture_hotfix_list")
    public final List<GestureHotfixItem> gestureHotfixList;

    public GestureHotfix() {
        this(false, new ArrayList());
    }

    public GestureHotfix(boolean z, List<GestureHotfixItem> list) {
        this.gestureHotfixEnable = z;
        this.gestureHotfixList = list;
    }
}
