package com.ss.android.ugc.aweme.series.innerfeed.activity;

import X.C2189821An6;
import X.C786410Ut5;
import android.os.Bundle;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment;
import com.ss.android.ugc.aweme.series.innerfeed.fragment.SeriesInnerFeedFragment;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesInnerFeedSafRootFragment extends DetailSafRootFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2slJyE2OiMpLCHELIOSt9KSY4IDk6PDxiGiohISA/ACE9LTcKLCo3GyQqGyA8PAM+KCg+LSs4";

    @Override // com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment
    public final boolean wS() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment
    public final DetailFragment kS(Bundle bundle, C2189821An6 c2189821An6) {
        SeriesInnerFeedFragment seriesInnerFeedFragment = new SeriesInnerFeedFragment();
        C786410Ut5.LJJIZ(bundle, "feed_param", c2189821An6);
        seriesInnerFeedFragment.setArguments(bundle);
        return seriesInnerFeedFragment;
    }
}
