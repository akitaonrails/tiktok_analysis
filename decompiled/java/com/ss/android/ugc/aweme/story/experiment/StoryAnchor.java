package com.ss.android.ugc.aweme.story.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryAnchor implements Serializable {
    public static final int $stable = 0;

    @C09CT("icon")
    public final String icon;

    @C09CT("type")
    public final Integer type;

    public StoryAnchor(Integer num, String str) {
        this.type = num;
        this.icon = str;
    }
}
