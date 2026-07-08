package com.bytedance.touchpoint.api.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class WatchVideoTimeContent {

    @C09CT("videos")
    public final List<WatchedVideo> videos;

    public WatchVideoTimeContent() {
        this(new ArrayList());
    }

    public WatchVideoTimeContent(List<WatchedVideo> list) {
        this.videos = list;
    }
}
