package com.ss.android.ugc.aweme.legacy;

import X.C04TD;
import X.C1ER1;
import X.C629650Omp;
import X.C654670Pm5;
import X.C654690Pm7;
import com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;

/* JADX INFO: loaded from: classes10.dex */
public class SearchResultStatisticsImpl implements ISearchResultStatistics {
    public final ISearchResultStatistics LIZ = C1ER1.LIZIZ.LJJLIIJ();

    public static ISearchResultStatistics LIZLLL() {
        Object objLIZ = C04TD.LIZ(ISearchResultStatistics.class, false);
        if (objLIZ != null) {
            return (ISearchResultStatistics) objLIZ;
        }
        if (C04TD.H1 == null) {
            synchronized (ISearchResultStatistics.class) {
                if (C04TD.H1 == null) {
                    C04TD.H1 = new SearchResultStatisticsImpl();
                }
            }
        }
        return C04TD.H1;
    }

    @Override // com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    public final void LIZ(C654670Pm5 c654670Pm5) {
        this.LIZ.LIZ(c654670Pm5);
    }

    @Override // com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    public final void LIZIZ(C654690Pm7 c654690Pm7) {
        this.LIZ.LIZIZ(c654690Pm7);
    }

    @Override // com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    public final void LIZJ(C629650Omp c629650Omp) {
        this.LIZ.LIZJ(c629650Omp);
    }
}
