package com.ss.android.ugc.aweme.search.performance.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.model.LynxDisplayImageUrl;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchImageWikiRawData implements Serializable {
    public static final int $stable = 8;

    @C09CT("display")
    public LynxDisplayImageUrl displayImageUrl;

    public final LynxDisplayImageUrl getDisplayImageUrl() {
        return this.displayImageUrl;
    }

    public final void setDisplayImageUrl(LynxDisplayImageUrl lynxDisplayImageUrl) {
        this.displayImageUrl = lynxDisplayImageUrl;
    }
}
