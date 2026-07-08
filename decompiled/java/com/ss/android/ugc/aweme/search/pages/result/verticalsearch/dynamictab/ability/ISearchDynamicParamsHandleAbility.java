package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability;

import X.C0PSG;
import X.C0QER;
import X.InterfaceC494301wD;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment;

/* JADX INFO: loaded from: classes11.dex */
public interface ISearchDynamicParamsHandleAbility extends InterfaceC494301wD {
    void Mg0(int i, SearchApiResult searchApiResult);

    void NP2(C0QER c0qer);

    <D> SearchRequestParam ZX1(BaseSearchDynamicTabFragment<D> baseSearchDynamicTabFragment, C0PSG c0psg, String str, boolean z, String str2);

    void jF1(GlobalDoodleConfig globalDoodleConfig, LogPbBean logPbBean);

    String sb1();

    void uf2(Throwable th);
}
