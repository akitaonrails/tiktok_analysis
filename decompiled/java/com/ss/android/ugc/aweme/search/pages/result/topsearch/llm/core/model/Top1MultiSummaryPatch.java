package com.ss.android.ugc.aweme.search.pages.result.topsearch.llm.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.Top1MultiSummary;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class Top1MultiSummaryPatch {

    @C09CT("global_patch")
    public final Top1MultiSummary firstLevelFieldPatch;

    @C09CT("multi_video_patchs")
    public final List<MultiVideoPatch> multiVideoPatchList;

    public Top1MultiSummaryPatch() {
        this(null, null);
    }

    public Top1MultiSummaryPatch(Top1MultiSummary top1MultiSummary, List<MultiVideoPatch> list) {
        this.firstLevelFieldPatch = top1MultiSummary;
        this.multiVideoPatchList = list;
    }
}
