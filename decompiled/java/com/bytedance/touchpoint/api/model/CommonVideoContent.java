package com.bytedance.touchpoint.api.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class CommonVideoContent {

    @C09CT("videos")
    public final List<CommonVideo> videos;

    public CommonVideoContent() {
        this(new ArrayList());
    }

    public CommonVideoContent(List<CommonVideo> list) {
        this.videos = list;
    }
}
