package com.ss.android.ugc.aweme.api.resp;

import X.C09CT;
import X.C118J;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class AnchorSearchResponse extends C118J<AnchorCell> {

    @C09CT("cells")
    public List<AnchorCell> cells;

    @C09CT("enable_load_more")
    public boolean enableLoadMore;
}
