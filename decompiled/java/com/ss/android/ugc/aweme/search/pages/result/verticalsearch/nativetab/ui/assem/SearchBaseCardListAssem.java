package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ui.assem;

import X.C01GW;
import X.C0BRN;
import X.C0P6P;
import X.C0PS1;
import X.C0PS2;
import X.C0Q9Q;
import X.C0Q9R;
import X.C0VWN;
import X.C13BV;
import X.C1558520qew;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C644560PPy;
import X.C724240Sb0;
import X.C736680Sv4;
import X.InterfaceC1891350zJl;
import X.InterfaceC20616015lm;
import X.InterfaceC435460H5s;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS37S0100000_10;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment;
import com.ss.android.ugc.aweme.search.pages.result.photosearch.ui.cell.footer.SearchListFooterCell;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ability.ISearchPageListAbility;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.viewmodel.SearchBaseCardListViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchBaseCardListAssem extends UIListContentAssem<SearchBaseCardListViewModel> implements ISearchPageListAbility, InterfaceC20616015lm {
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 817));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 818));

    public abstract SearchBaseCardListViewModel Lo();

    public abstract void No();

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LJIIJ = true;
        c20603715jn.LIZ = 2;
        c20603715jn.LIZLLL = SearchListFooterCell.class;
        return c20603715jn;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Q9M] */
    @Override // X.InterfaceC20616015lm
    public final C0Q9Q LJIIZILJ() {
        return new C0Q9Q(Go(), new C0P6P() { // from class: X.0Q9M
            @Override // X.C0P6P
            public final void LJJIFFI() {
                this.LL.Lo().manualListRetry(EnumC323450Cm7.Next);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ability.ISearchPageListAbility
    public final boolean Am2() {
        return Lo().LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ability.ISearchPageListAbility
    public final boolean BA1() {
        return Lo().LLILLL;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final AssemListViewModel Jo() {
        return Lo();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ability.ISearchPageListAbility
    public final void LJJJJLI() {
        Go().scrollToPosition(0);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ability.ISearchPageListAbility
    public final void Lh0() {
        SearchBaseCardListViewModel searchBaseCardListViewModelLo = Lo();
        List<InterfaceC1891350zJl> listListGetAll = searchBaseCardListViewModelLo.listGetAll();
        if (listListGetAll == null) {
            listListGetAll = C13BV.INSTANCE;
        }
        for (InterfaceC1891350zJl interfaceC1891350zJl : listListGetAll) {
            if (interfaceC1891350zJl instanceof InterfaceC435460H5s) {
                ((IAwemeService) searchBaseCardListViewModelLo.LLILZLL.getValue()).LLILLL(((InterfaceC435460H5s) interfaceC1891350zJl).getAweme());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ability.ISearchPageListAbility
    public final SearchBaseFragment MK0() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI instanceof SearchBaseFragment) {
            return (SearchBaseFragment) fragmentLJI;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ability.ISearchPageListAbility
    public final void PP() {
        SearchBaseCardListViewModel searchBaseCardListViewModelLo = Lo();
        if (searchBaseCardListViewModelLo.LLILZIL.isEmpty()) {
            return;
        }
        searchBaseCardListViewModelLo.manualListLoadMore(0L);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ability.ISearchPageListAbility
    public final void d() {
        Lo().LLILZ = true;
        Lo().manualListRefresh();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ability.ISearchPageListAbility
    public final void f62() {
        Lo().LLILLL = false;
    }

    @Override // X.InterfaceC20616015lm
    public final boolean px2() {
        Lo().getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ability.ISearchPageListAbility
    public final List<InterfaceC1891350zJl> tT() {
        List listListGetAll = Lo().listGetAll();
        return listListGetAll == null ? C13BV.INSTANCE : listListGetAll;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        SearchBaseFragment searchBaseFragment;
        String str;
        String strCS;
        SearchBaseFragment searchBaseFragment2;
        super.onViewCreated(view);
        List list = (List) this.LLIZLLLIL.getValue();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Class<? extends PowerCell<? extends InterfaceC1891350zJl>> clsT2 = ((ISearchCardProtocol) it2.next()).T2();
                if (clsT2 != null) {
                    Go().LJIILJJIL(clsT2);
                }
            }
        }
        Go().setItemAnimator(null);
        ((PowerAdapter) Go().getAdapter()).LLLLII(this, SearchBaseCardListAssem.class);
        Go().LL.LLLJ(new C0Q9R() { // from class: X.0Q9L
            @Override // X.C0Q9R
            public final void LJII(C21341918fZ c21341918fZ) {
                List listListGetAll = this.LIZ.Lo().listGetAll();
                if (listListGetAll == null) {
                    listListGetAll = C13BV.INSTANCE;
                }
                if (!listListGetAll.isEmpty()) {
                    this.LIZ.Lo().getClass();
                }
            }
        });
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        if (viewOnAttachStateChangeListenerC20604515jvGo != null) {
            viewOnAttachStateChangeListenerC20604515jvGo.addOnScrollListener(new AsS37S0100000_10(viewOnAttachStateChangeListenerC20604515jvGo, 12));
        }
        No();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo2 = Go();
        if (C0BRN.LIZ()) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (!(fragmentLJI instanceof SearchBaseFragment) || (searchBaseFragment2 = (SearchBaseFragment) fragmentLJI) == null || (strCS = searchBaseFragment2.cS()) == null) {
                strCS = "";
            }
            if (C0PS2.LIZ(strCS)) {
                C0PS1.LIZ(viewOnAttachStateChangeListenerC20604515jvGo2);
            }
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if ((fragmentLJI2 instanceof SearchBaseFragment) && (searchBaseFragment = (SearchBaseFragment) fragmentLJI2) != null) {
            int i = searchBaseFragment.LLJJJJ;
            C644560PPy.LIZ.getClass();
            if (i == C644560PPy.LJIL()) {
                str = "search_user_list";
            } else if (i == C644560PPy.LJJ()) {
                str = "search_video_list";
            } else if (i == C644560PPy.LJIJ()) {
                str = "search_music_list";
            } else if (i == C644560PPy.LJIIIZ()) {
                str = "search_challenge_list";
            } else if (i == C644560PPy.LJIJJLI()) {
                str = "search_mix_feed_list";
            } else if (i != C644560PPy.LJIILJJIL()) {
                str = "";
            } else {
                str = "search_photo_list";
            }
            if (!Intrinsics.LJFF(str, "")) {
                C0VWN.LIZ(str, false).LIZIZ(Go());
            }
        }
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0Q9N
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0Q9X) obj).LL;
            }
        }, null, new AwS624S0100000_10(this, 80), 6);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0Q9O
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0Q9X) obj).LLILLL;
            }
        }, null, AFwS293S0000000_10.get$arr$(31), 6);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0Q9P
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0Q9X) obj).LLILLJJLI;
            }
        }, null, new AwS624S0100000_10(this, 81), 6);
    }
}
