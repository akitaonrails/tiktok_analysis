package com.ss.android.ugc.aweme.feed.gesture;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class GestureHotfixItem implements Serializable {

    @C09CT("experiment_id")
    public final String experimentId;

    @C09CT("gesture_name")
    public final String gestureName;

    @C09CT("gesture_scene")
    public final Integer pageType;

    public GestureHotfixItem() {
        this("", null, null);
    }

    public GestureHotfixItem(String str, Integer num, String str2) {
        this.gestureName = str;
        this.pageType = num;
        this.experimentId = str2;
    }
}
