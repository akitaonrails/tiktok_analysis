package com.ss.android.ugc.aweme.search.pages.result.livelist.core.ui;

import X.AbstractC21673619ry;
import X.AbstractC683590Qrd;
import X.C0DXR;
import X.C0PN2;
import X.C0PNQ;
import X.C13LP;
import X.C14EU;
import X.C19EG;
import X.C2188811AlT;
import X.C341940Daq;
import X.C479910Irt;
import X.C486180J4u;
import X.C643800PNa;
import X.C654500Plo;
import X.C654880PmQ;
import X.InterfaceC644520PPu;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchOriginalFragment;
import com.ss.android.ugc.aweme.search.pages.result.livelist.core.viewmodel.SearchLiveListEnterParamViewModel;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveStruct;
import java.util.List;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLiveFragment extends SearchOriginalFragment<SearchLiveStruct> implements InterfaceC644520PPu {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDHELIOSwmJDFiJSYlLSklOjt9Kyo+LGEmIWsfLC4hKy0AIDk2DjctLiI2JjE=";
    public C654500Plo LLLLLL;
    public final String LLLLLLIL = "a2270.b0371";

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String cS() {
        return "live";
    }

    @Override // X.InterfaceC644520PPu
    public final boolean sq(String str) {
        return false;
    }

    @Override // X.InterfaceC644520PPu
    public final void x(String str) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void YS() {
        String searchKeyword;
        String fromSearchSubtag;
        String preSearchId;
        if (this.LLJI == null) {
            SearchResultParam searchResultParam = new SearchResultParam();
            C654500Plo c654500Plo = this.LLLLLL;
            String str = "";
            if (c654500Plo == null || (searchKeyword = c654500Plo.getSearchKeyword()) == null) {
                searchKeyword = "";
            }
            searchResultParam.setKeyword(searchKeyword);
            C654500Plo c654500Plo2 = this.LLLLLL;
            searchResultParam.setEnterMethod(c654500Plo2 != null ? c654500Plo2.getEnterMethod() : null);
            C654500Plo c654500Plo3 = this.LLLLLL;
            if (c654500Plo3 == null || (fromSearchSubtag = c654500Plo3.getFromSearchSubtag()) == null) {
                fromSearchSubtag = "";
            }
            searchResultParam.setFromSearchSubtag(fromSearchSubtag);
            C654500Plo c654500Plo4 = this.LLLLLL;
            if (c654500Plo4 != null && (preSearchId = c654500Plo4.getPreSearchId()) != null) {
                str = preSearchId;
            }
            searchResultParam.setPreSearchId(str);
            this.LLJI = searchResultParam;
        }
        this.LLLIIIL = new C654880PmQ(this.LLJI, gS(), this, this);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void ZS() {
        C654880PmQ c654880PmQ;
        this.LLLLLJIL = new C643800PNa<C0PNQ>() { // from class: X.0PMB
            @Override // X.C643800PNa, X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
            public final void onSuccess() {
                super.onSuccess();
                T t = this.LL;
                if (((AbstractC1255880imo) t).mListQueryType == 4 && ((AbstractC1255880imo) t).isDataEmpty()) {
                    ((InterfaceC1212360hec) this.LLILLJJLI).Ng1();
                }
            }

            @Override // X.C643800PNa, X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
            public final void onFailed(Exception exc) {
                super.onFailed(exc);
                if ((exc instanceof C0PNR) && ((AbstractC1255880imo) this.LL).isDataEmpty()) {
                    ((InterfaceC1212360hec) this.LLILLJJLI).Ng1();
                }
            }
        };
        C643800PNa<?> c643800PNaCU = cU();
        C0PNQ c0pnq = new C0PNQ();
        C654500Plo c654500Plo = this.LLLLLL;
        c0pnq.LLJJIJIL = c654500Plo != null ? c654500Plo.getRoomIdList() : null;
        C654500Plo c654500Plo2 = this.LLLLLL;
        c0pnq.LLJJJ = c654500Plo2 != null ? c654500Plo2.getEnterFrom() : null;
        c643800PNaCU.LJIIJ(c0pnq);
        cU().LJIIJJI(this);
        C643800PNa<?> c643800PNaCU2 = cU();
        c643800PNaCU2.LLILZIL = this;
        T t = c643800PNaCU2.LL;
        if (t != 0) {
            ((C0PN2) t).LLJ = ZA();
        }
        AbstractC683590Qrd<SearchLiveStruct> abstractC683590QrdNS = NS();
        if (!(abstractC683590QrdNS instanceof C654880PmQ) || (c654880PmQ = (C654880PmQ) abstractC683590QrdNS) == null) {
            return;
        }
        c654880PmQ.LLILZLL = (C0PNQ) cU().LL;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final RecyclerView.LayoutManager xj0() {
        return new GridLayoutManager(getContext(), 2);
    }

    public SearchLiveFragment() {
        this.LLJILLL = 7;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String bS() {
        return this.LLLLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        SearchLiveListEnterParamViewModel searchLiveListEnterParamViewModel;
        super.onCreate(bundle);
        EventBus.LIZLLL().LJIJJ(this);
        C19EG activity = getActivity();
        C654500Plo c654500Plo = null;
        if (activity != null && (searchLiveListEnterParamViewModel = (SearchLiveListEnterParamViewModel) ViewModelProviders.of(activity).get(SearchLiveListEnterParamViewModel.class)) != null) {
            c654500Plo = searchLiveListEnterParamViewModel.LL;
        }
        this.LLLLLL = c654500Plo;
    }

    @C14EU
    public final void onRoomStatusEvent(C479910Irt c479910Irt) {
        Integer numValueOf;
        User author;
        long j = c479910Irt.LIZ;
        AbstractC683590Qrd<SearchLiveStruct> abstractC683590QrdNS = NS();
        Integer numValueOf2 = null;
        if (!(abstractC683590QrdNS instanceof C654880PmQ)) {
            abstractC683590QrdNS = null;
        }
        if (abstractC683590QrdNS != null) {
            List<SearchLiveStruct> list = abstractC683590QrdNS.mmItems;
            if (list != null) {
                int i = 0;
                for (SearchLiveStruct searchLiveStruct : list) {
                    if (searchLiveStruct.getLiveAweme() != null && (author = searchLiveStruct.getLiveAweme().getAuthor()) != null && j == C486180J4u.LIZ(author)) {
                        break;
                    } else {
                        i++;
                    }
                }
                i = -1;
                numValueOf = Integer.valueOf(i);
            } else {
                i = -1;
                numValueOf = Integer.valueOf(i);
            }
        } else {
            numValueOf = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Exit Live room, item #");
        sbLIZ.append(numValueOf);
        sbLIZ.append('/');
        AbstractC21673619ry adapter = BS().getAdapter();
        if (adapter != null) {
            numValueOf2 = Integer.valueOf(adapter.getItemCount());
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append(", AID: ");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        if (numValueOf != null && numValueOf.intValue() != -1) {
            BS().smoothScrollToPosition(numValueOf.intValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void eT(View view, Bundle bundle) {
        super.eT(view, bundle);
        final int iLIZ = C341940Daq.LIZ(8.0d);
        BS().addItemDecoration(new C0DXR(iLIZ) { // from class: X.0DXq
            public final int LLILLJJLI;
            public final int LL = 2;
            public final boolean LLILLL = true;

            {
                this.LLILLJJLI = iLIZ;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                int iLIZIZ;
                int iLIZIZ2;
                int iLIZIZ3;
                int iLIZIZ4;
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                AbstractC21673619ry adapter = recyclerView.getAdapter();
                if ((adapter instanceof AbstractC683560Qra) && ((AbstractC683560Qra) adapter).LL != null) {
                    if (childAdapterPosition == 0) {
                        return;
                    } else {
                        childAdapterPosition++;
                    }
                }
                if (!(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    return;
                }
                AbstractC214823195h abstractC214823195h = ((GridLayoutManager) recyclerView.getLayoutManager()).LLIZ;
                int iLJ = abstractC214823195h.LJ(childAdapterPosition, this.LL);
                int iLJFF = abstractC214823195h.LJFF(childAdapterPosition);
                boolean zLIZIZ = C444960Hcc.LIZIZ();
                if (this.LLILLL) {
                    int i = this.LL;
                    if (iLJFF != i) {
                        if (!zLIZIZ) {
                            int i2 = this.LLILLJJLI;
                            rect.left = i2 - ((iLJ * i2) / i);
                            rect.right = ((iLJ + 1) * i2) / i;
                            return;
                        } else {
                            int i3 = this.LLILLJJLI;
                            rect.right = i3 - ((iLJ * i3) / i);
                            rect.left = ((iLJ + 1) * i3) / i;
                            return;
                        }
                    }
                    return;
                }
                if (iLJ == 0) {
                    if (!zLIZIZ) {
                        iLIZIZ3 = this.LLILLJJLI * 2;
                    } else {
                        iLIZIZ3 = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(7.0f))) / 2.0f);
                    }
                    rect.left = iLIZIZ3;
                    if (!zLIZIZ) {
                        iLIZIZ4 = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(7.0f))) / 2.0f);
                    } else {
                        iLIZIZ4 = this.LLILLJJLI * 2;
                    }
                    rect.right = iLIZIZ4;
                    return;
                }
                if (!zLIZIZ) {
                    iLIZIZ = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(7.0f))) / 2.0f);
                } else {
                    iLIZIZ = this.LLILLJJLI * 2;
                }
                rect.left = iLIZIZ;
                if (!zLIZIZ) {
                    iLIZIZ2 = this.LLILLJJLI * 2;
                } else {
                    iLIZIZ2 = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(7.0f))) / 2.0f);
                }
                rect.right = iLIZIZ2;
            }
        });
    }

    @Override // X.InterfaceC644520PPu
    public final void rq(SearchLiveList searchLiveList, List<? extends Aweme> list, boolean z) {
        C0PNQ c0pnq;
        T t = cU().LL;
        List listLJLIL = null;
        if ((t instanceof C0PNQ) && (c0pnq = (C0PNQ) t) != null) {
            c0pnq.LJJIFFI(searchLiveList);
        }
        List<SearchLiveStruct> data = NS().getData();
        if (data != null) {
            listLJLIL = C13LP.LJLIL(searchLiveList.LJI(), data);
        }
        Pj(listLJLIL, z);
    }
}
