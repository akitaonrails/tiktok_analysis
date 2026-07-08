package com.ss.android.ugc.aweme.main.spi;

import X.AbstractC1585770rMt;
import X.C01GW;
import X.C1571020qz6;
import X.C452501pT;
import com.ss.android.ugc.aweme.search.service.ISearchIconOutService;
import com.ss.android.ugc.aweme.spi.HomeTabWrapperService;

/* JADX INFO: loaded from: classes25.dex */
public final class HomeTabWrapperServiceImpl implements HomeTabWrapperService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1571020qz6());

    @Override // com.ss.android.ugc.aweme.spi.HomeTabWrapperService
    public final AbstractC1585770rMt LIZ() {
        ISearchIconOutService iSearchIconOutService = (ISearchIconOutService) this.LIZ.getValue();
        if (iSearchIconOutService != null) {
            return iSearchIconOutService.LIZJ();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.spi.HomeTabWrapperService
    public final AbstractC1585770rMt LIZIZ() {
        ISearchIconOutService iSearchIconOutService = (ISearchIconOutService) this.LIZ.getValue();
        if (iSearchIconOutService != null) {
            return iSearchIconOutService.LIZIZ();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
