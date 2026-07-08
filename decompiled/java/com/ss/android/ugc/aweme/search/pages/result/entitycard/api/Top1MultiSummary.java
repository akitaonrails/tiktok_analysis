package com.ss.android.ugc.aweme.search.pages.result.entitycard.api;

import X.C09CT;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.MultiVideo;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class Top1MultiSummary {

    @C09CT("multi_video")
    public final List<MultiVideo> multiVideo;

    public Top1MultiSummary() {
        this(null);
    }

    public Top1MultiSummary(List<MultiVideo> list) {
        this.multiVideo = list;
    }
}
