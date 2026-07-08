package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SummaryLandingPage implements Serializable {

    @C09CT("multi_video")
    public final List<MultiVideo> multiVideo;

    public SummaryLandingPage(List<MultiVideo> list) {
        this.multiVideo = list;
    }
}
