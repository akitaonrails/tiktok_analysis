package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class KeyMoments implements Serializable {

    @C09CT("moments")
    public final List<SearchKeyFramePoint> moments;

    public KeyMoments() {
        this(null);
    }

    public KeyMoments(List<SearchKeyFramePoint> list) {
        this.moments = list;
    }
}
