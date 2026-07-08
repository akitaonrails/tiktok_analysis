package com.ss.android.ugc.aweme.series.feed.tab;

import X.C1582820rI8;
import X.C279250Ax1;
import X.C789370Uxr;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.series.feed.tab.v2.DramaTopTabMainFragment;

/* JADX INFO: loaded from: classes25.dex */
public interface SeriesHomeTabAppDiffProtocol {
    public static final C1582820rI8 LIZ = C1582820rI8.LIZ;

    Class<? extends Fragment> LIZ();

    public static final class DowngradeInstance implements SeriesHomeTabAppDiffProtocol {
        @Override // com.ss.android.ugc.aweme.series.feed.tab.SeriesHomeTabAppDiffProtocol
        public final Class<? extends Fragment> LIZ() {
            if ((C789370Uxr.LIZ() & 4) != 0) {
                return DramaTopTabMainFragment.class;
            }
            C279250Ax1.LIZ.getClass();
            return !C279250Ax1.LIZ() ? SeriesHomeTabFragment.class : DramaTopTabMainFragment.class;
        }
    }
}
