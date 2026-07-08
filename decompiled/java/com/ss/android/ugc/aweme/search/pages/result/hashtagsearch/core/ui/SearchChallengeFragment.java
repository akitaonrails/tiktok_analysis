package com.ss.android.ugc.aweme.search.pages.result.hashtagsearch.core.ui;

import X.AbstractC683590Qrd;
import X.C0PM8;
import X.C0PN2;
import X.C0PNK;
import X.C643800PNa;
import X.C644560PPy;
import X.C656310Poj;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchOriginalFragment;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import com.ss.android.ugc.aweme.search.pages.result.hashtagsearch.core.model.SearchChallengeList;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchChallengeFragment extends SearchOriginalFragment<SearchChallenge> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmJDFiHELIOSIS4gIDEtLjw2KTcvIWEwJzcpZzo6ZhYpKD0wIAYkKCM/LSsrLAkhKSIhLCEn";
    public final String LLLLLL = "a2270.b2440";

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String cS() {
        return "tag";
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void YS() {
        this.LLLIIIL = new C656310Poj(this.LLJI, gS(), this);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void ZS() {
        this.LLLLLJIL = new C643800PNa<C0PNK>() { // from class: X.0PM9
        };
        cU().LJIIJ(new C0PN2<SearchChallenge, SearchChallengeList>() { // from class: X.0PNK
            @Override // X.C0PN2
            public final int LJIJ() {
                return 2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1255880imo
            public final boolean isHasMore() {
                T t = this.mData;
                return t != 0 && ((SearchChallengeList) t).hasMore;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0PN2, X.AbstractC666100QAu
            /* JADX INFO: renamed from: LJJI, reason: merged with bridge method [inline-methods] */
            public final void handleData(SearchChallengeList searchChallengeList) {
                super.handleData(searchChallengeList);
                List<SearchChallenge> list = searchChallengeList.challengeList;
                C642590PIj.LIZ(list);
                boolean zLIZIZ = C086I.LIZIZ(list);
                this.mIsNewDataEmpty = zLIZIZ;
                boolean z = false;
                if (!zLIZIZ) {
                    for (SearchChallenge searchChallenge : list) {
                        if (searchChallenge.getChallenge() != null) {
                            searchChallenge.getChallenge().setRequestId(this.LLJILJILJ);
                        }
                        searchChallenge.setRequestId(searchChallengeList.getRequestId());
                        searchChallenge.logPbBean = searchChallengeList.logPb;
                    }
                    int i = this.mListQueryType;
                    if (i != 1) {
                        if (i == 4) {
                            LJIIJ(list);
                            T t = this.mData;
                            SearchChallengeList searchChallengeList2 = (SearchChallengeList) t;
                            if (searchChallengeList.hasMore && ((SearchChallengeList) t).hasMore) {
                                z = true;
                            }
                            searchChallengeList2.hasMore = z;
                            ((SearchChallengeList) t).cursor = searchChallengeList.cursor;
                            return;
                        }
                        return;
                    }
                    this.mData = searchChallengeList;
                    searchChallengeList.challengeList = new ArrayList();
                    LJIL(list);
                    return;
                }
                if (this.mListQueryType == 1) {
                    this.mData = searchChallengeList;
                    LJIIL();
                }
                T t2 = this.mData;
                if (t2 != 0) {
                    ((SearchChallengeList) t2).hasMore = false;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1255880imo
            public final void loadMoreList(Object... objArr) {
                int i;
                C19EG c19eg;
                Integer num;
                String strLJIILIIL = LJIILIIL(objArr);
                if (isDataEmpty()) {
                    i = 0;
                } else {
                    i = ((SearchChallengeList) this.mData).cursor;
                }
                long j = i;
                String str = this.LLJJI;
                if (str == null) {
                    str = "";
                }
                int iIntValue = ((Integer) objArr[3]).intValue();
                String strLJIILLIIL = LJIILLIIL();
                int i2 = this.LLJILJIL;
                String str2 = this.LLJILLL;
                String str3 = this.LLJJIJIIJIL;
                Fragment fragmentLJIILJJIL = LJIILJJIL();
                WeakReference<C19EG> weakReference = this.LLIZ;
                String sugGenerateType = null;
                if (weakReference != null) {
                    c19eg = weakReference.get();
                } else {
                    c19eg = null;
                }
                String strLIZ = C0Q3Q.LIZ(c19eg, fragmentLJIILJJIL, this.LLILZ);
                if (ComplianceServiceProvider.LJI().LJJII()) {
                    num = 1;
                } else {
                    num = null;
                }
                SearchResultParam searchResultParam = this.LLILZ;
                if (searchResultParam != null) {
                    sugGenerateType = searchResultParam.getSugGenerateType();
                }
                SearchRequestParam searchRequestParam = new SearchRequestParam(strLJIILIIL, 0, str2, "", i2, iIntValue, str, str3, j, 20, strLJIILLIIL, null, null, null, null, null, "", null, null, null, null, null, null, null, null, strLIZ, null, num, sugGenerateType, null, null, null, null, null, null, null, null, null, 0, 0, 0, false, null, null, C2097608Jq.LJ());
                C644400PPi c644400PPi = new C644400PPi(this, searchRequestParam);
                c644400PPi.LLILLJJLI = searchRequestParam.LIZIZ;
                this.LLIZLLLIL = c644400PPi;
                C1BVK.LIZIZ().LIZ(this.mHandler, c644400PPi, 0);
            }

            @Override // X.AbstractC1255880imo
            public final void refreshList(Object... objArr) {
                C19EG c19eg;
                Integer num;
                String strLJIILIIL = LJIILIIL(objArr);
                int iIntValue = ((Integer) objArr[3]).intValue();
                String strLJIILLIIL = LJIILLIIL();
                int i = this.LLJILJIL;
                String str = this.LLJILLL;
                String str2 = this.LLJJIJIIJIL;
                C01GW<C669480QNu> c01gw = C669480QNu.LJ;
                String strLIZJ = C326370Cqp.LIZ().LIZJ();
                Fragment fragmentLJIILJJIL = LJIILJJIL();
                WeakReference<C19EG> weakReference = this.LLIZ;
                String sugGenerateType = null;
                if (weakReference != null) {
                    c19eg = weakReference.get();
                } else {
                    c19eg = null;
                }
                String strLIZ = C0Q3Q.LIZ(c19eg, fragmentLJIILJJIL, this.LLILZ);
                if (ComplianceServiceProvider.LJI().LJJII()) {
                    num = 1;
                } else {
                    num = null;
                }
                SearchResultParam searchResultParam = this.LLILZ;
                if (searchResultParam != null) {
                    sugGenerateType = searchResultParam.getSugGenerateType();
                }
                long j = ((C0PM7) C0Q3E.LJI().ak0().LIZJ()).LL;
                C662670Pyz.LIZ.getClass();
                SearchRequestParam searchRequestParam = new SearchRequestParam(strLJIILIIL, 0, str, "", i, iIntValue, "", str2, 0L, 20, strLJIILLIIL, null, null, null, null, null, strLIZJ, null, null, null, null, null, null, null, null, strLIZ, null, num, sugGenerateType, null, Long.valueOf(j), null, C662670Pyz.LIZ(), null, null, null, null, null, 0, 0, 0, false, null, null, C2097608Jq.LJ());
                C644400PPi c644400PPi = new C644400PPi(this, searchRequestParam);
                c644400PPi.LLILLJJLI = searchRequestParam.LIZIZ;
                this.LLIZLLLIL = c644400PPi;
                C1BVK.LIZIZ().LIZ(this.mHandler, c644400PPi, 0);
            }
        });
        cU().LJIIJJI(this);
        C643800PNa<?> c643800PNaCU = cU();
        c643800PNaCU.LLILZIL = this;
        T t = c643800PNaCU.LL;
        if (t != 0) {
            ((C0PN2) t).LLJ = ZA();
        }
    }

    public SearchChallengeFragment() {
        C644560PPy.LIZ.getClass();
        this.LLJILLL = C644560PPy.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String bS() {
        return this.LLLLLL;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, X.InterfaceC1212360hec
    public final void LLJJJIL(List<? extends SearchChallenge> list, boolean z) {
        C0PM8 c0pm8;
        C656310Poj c656310Poj;
        super.LLJJJIL(list, z);
        GlobalDoodleConfig globalDoodleConfig = this.LLL;
        if (globalDoodleConfig != null && globalDoodleConfig.getChallengeItemStyle() == 1) {
            c0pm8 = C0PM8.SHOOT;
        } else {
            c0pm8 = C0PM8.NORMAL;
        }
        if (this.LLLIIIL != null) {
            AbstractC683590Qrd<SearchChallenge> abstractC683590QrdNS = NS();
            if ((abstractC683590QrdNS instanceof C656310Poj) && (c656310Poj = (C656310Poj) abstractC683590QrdNS) != null) {
                c656310Poj.LLILZLL = c0pm8;
            }
        }
    }
}
