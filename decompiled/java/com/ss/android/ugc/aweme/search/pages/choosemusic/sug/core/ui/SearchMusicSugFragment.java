package com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.ui;

import X.C098200Yq;
import X.C0QRC;
import X.C14EU;
import X.C1659630tI1;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20600815jK;
import X.C20684815ws;
import X.C2344009Gk;
import X.C584850Mwl;
import X.C680990QnR;
import X.C681040QnW;
import X.C681100Qnc;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC681060QnY;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObserverS214S0100000_10;
import Y.ARunnableS15S1100000_10;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.choosemusic.sug.model.MusicSearchSugResponse;
import com.ss.android.ugc.aweme.choosemusic.sug.model.RecommendWordMob;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.SearchMusicBaseFragment;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.viewmodel.ChooseSearchMusicViewModel;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.viewmodel.MusicSugViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMusicSugFragment extends SearchMusicBaseFragment implements InterfaceC681060QnY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2svISA8HELIOSOyAhPDw6K2s/PCh9Kyo+LGEmIWsfLC4hKy0BPDw6KxY5LgkhKSIhLCEn";
    public ViewOnAttachStateChangeListenerC20604515jv LLILLL;
    public MusicSugViewModel LLILZ;
    public RecommendWordMob LLIZLLLIL;
    public final ArrayList<SearchSugEntity> LLILZIL = new ArrayList<>();
    public final ArrayList<InterfaceC1891350zJl> LLILZLL = new ArrayList<>();
    public String LLIZ = "";
    public final AObserverS214S0100000_10 LLJ = new AObserverS214S0100000_10(this, 34);

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv NR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rn0) : null;
            this.LLILLL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        NextLiveData<C0QRC<MusicSearchSugResponse>> nextLiveData;
        super.onDestroyView();
        MusicSugViewModel musicSugViewModel = this.LLILZ;
        if (musicSugViewModel != null && (nextLiveData = musicSugViewModel.LL) != null) {
            nextLiveData.removeObserver(this.LLJ);
        }
        this.LLILLL = null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.SearchMusicBaseFragment
    public final void MR(String str) {
        C681100Qnc state;
        boolean zLJI = MethodIDManager.LJI(72008);
        ChooseSearchMusicViewModel chooseSearchMusicViewModel = this.LLILLJJLI;
        if (chooseSearchMusicViewModel != null && (state = chooseSearchMusicViewModel.getState()) != null && state.LLILZ) {
            OR(str);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void OR(String str) {
        C681100Qnc state;
        ChooseSearchMusicViewModel chooseSearchMusicViewModel = this.LLILLJJLI;
        if (chooseSearchMusicViewModel != null && (state = chooseSearchMusicViewModel.getState()) != null && 2 == state.LL && !TextUtils.isEmpty(str)) {
            C786410Ut5.LJLIIL(150L, new BPEAHandler(), new ARunnableS15S1100000_10(this, str, 1));
        }
    }

    @C14EU
    public final void onInputClickEvent(C681040QnW c681040QnW) {
        String id;
        SearchSugEntity next;
        String queryId;
        Integer numValueOf;
        String str = this.LL;
        Iterator<SearchSugEntity> it2 = this.LLILZIL.iterator();
        do {
            id = null;
            if (it2.hasNext()) {
                next = it2.next();
            } else {
                return;
            }
        } while (!TextUtils.equals(next.content, str));
        C680990QnR c680990QnR = new C680990QnR();
        c680990QnR.LIZJ("words_source", "sug");
        c680990QnR.LIZJ("search_position", "music_create");
        Word word = next.mWord;
        if (word != null && (numValueOf = Integer.valueOf(word.getWordPosition())) != null) {
            c680990QnR.LIZJ("words_position", GsonProtectorUtils.toJson(new Gson(), numValueOf));
        }
        c680990QnR.LIZJ("impr_id", this.LLIZ);
        c680990QnR.LIZJ("raw_query", this.LL);
        c680990QnR.LIZJ("words_content", this.LL);
        RecommendWordMob recommendWordMob = this.LLIZLLLIL;
        if (recommendWordMob != null) {
            queryId = recommendWordMob.getQueryId();
        } else {
            queryId = null;
        }
        c680990QnR.LIZJ("query_id", queryId);
        Word word2 = next.mWord;
        if (word2 != null) {
            id = word2.getId();
        }
        c680990QnR.LIZJ("group_id", id);
        C20684815ws.LJIILLIIL("sug_input_click", c680990QnR.LIZ);
    }

    @Override // X.InterfaceC681060QnY
    public final void qa(int i) {
        C20600815jK.LJIILIIL(NR().getState(), i);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.SearchMusicBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        NextLiveData<C0QRC<MusicSearchSugResponse>> nextLiveData;
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        if (activity != null) {
            MusicSugViewModel musicSugViewModel = (MusicSugViewModel) C1659630tI1.LJII(view, activity, 4).get(MusicSugViewModel.class);
            this.LLILZ = musicSugViewModel;
            if (musicSugViewModel != null && (nextLiveData = musicSugViewModel.LL) != null) {
                nextLiveData.observe(activity, this.LLJ);
            }
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("key_word");
        } else {
            string = null;
        }
        this.LL = string;
        NR().setNestedScrollingEnabled(true);
        NR().setItemAnimator(null);
        NR().LJIILJJIL(SearchMusicSugCell.class, SearchMusicSugHistoryCell.class);
    }

    @Override // X.InterfaceC681060QnY
    public final void x7(int i, String str) {
        String strLIZIZ = C584850Mwl.LIZ.LIZIZ(this.LLIZ);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", "click");
        c2344009Gk.LJIIIIZZ("log_pb", strLIZIZ);
        c2344009Gk.LJIIIIZZ("sug_keyword", this.LL);
        c2344009Gk.LJIIIIZZ("search_keyword", str);
        c2344009Gk.LJIIIIZZ("search_type", "video_music");
        c2344009Gk.LIZJ(i, "order");
        C20684815ws.LJIILLIIL("search_sug", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.exb, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
