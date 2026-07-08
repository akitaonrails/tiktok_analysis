package com.ss.android.ugc.aweme.multiapp;

import X.C15O7;
import X.C19EG;
import X.C653660PkS;
import X.C666520QCk;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.model.OptionConfigParams;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface ISearchExService {
    void LIZ(Object obj);

    boolean LIZIZ();

    void LIZJ(C653660PkS c653660PkS);

    void LIZLLL(String str, C666520QCk c666520QCk, int i);

    C15O7 LJ(Object obj, String str);

    void LJFF(C19EG c19eg);

    boolean LJI();

    List<String> LJII();

    void LJIIIIZZ(Aweme aweme, C653660PkS c653660PkS, String str);

    void LJIIIZ(C653660PkS c653660PkS);

    void LJIIJ(String str, SearchApiResult searchApiResult, C15O7<BaseResponse> c15o7, boolean z);

    boolean LJIIJJI();

    void LJIIL(boolean z);

    void LJIILIIL(SearchResultParam searchResultParam);

    void LJIILJJIL(OptionConfigParams optionConfigParams);

    boolean LJIILL();

    void LJIILLIIL();
}
