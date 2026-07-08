package com.ss.android.ugc.aweme.search.pages.result.topsearch.precisead.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPreciseAd implements Serializable {
    public static final int $stable = 8;

    @C09CT("aweme_info")
    public final List<Aweme> awemeCards;

    @C09CT("precise_ad_info")
    public final PreciseAdInfo preciseAdInfo;

    public SearchPreciseAd() {
        this(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchPreciseAd(PreciseAdInfo preciseAdInfo, List<? extends Aweme> list) {
        this.preciseAdInfo = preciseAdInfo;
        this.awemeCards = list;
    }
}
