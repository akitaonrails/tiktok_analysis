package com.ss.android.ugc.aweme.search.pages.reinforceinterest.repo;

import X.C324570Cnv;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501300pAe;

/* JADX INFO: loaded from: classes5.dex */
public interface ISearchReinforceInterestApi {
    public static final C324570Cnv LIZ = C324570Cnv.LIZ;

    @InterfaceC1501240pAY("/aweme/v1/search/interest/")
    @InterfaceC1501300pAe
    Object getInterestPoint(@InterfaceC1501100pAK("exit_words") String str, InterfaceC1364105Vn<? super InterestPointResponse> interfaceC1364105Vn);
}
