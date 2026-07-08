package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability;

import X.C0PSG;
import X.C0PZI;
import X.C0QER;
import X.InterfaceC494301wD;
import Y.ARunnableS110S0100000_10;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchDynamicFragmentPerformanceData;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface ISearchDynamicContentAbility extends InterfaceC494301wD {
    void Ey2(DynamicPatch dynamicPatch, Map<String, ? extends Object> map, boolean z);

    void Nz2(Throwable th, Map<String, ? extends Object> map);

    void Rf2(int i, boolean z);

    void T70(SearchLiveList searchLiveList, Exception exc);

    SearchDynamicFragmentPerformanceData WX0();

    void hw1();

    void m80(int i, SearchApiResult searchApiResult);

    void mG0(C0PSG c0psg, ARunnableS110S0100000_10 aRunnableS110S0100000_10);

    void mI1(C0QER c0qer);

    C0PZI rw2();
}
