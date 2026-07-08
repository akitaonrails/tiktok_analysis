package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.fragment;

import X.C098200Yq;
import X.C0P7L;
import X.C0P9L;
import X.C0PAW;
import X.C0PRF;
import X.C0PSB;
import X.C0PSI;
import X.C0PSN;
import X.C0PSP;
import X.C0PYW;
import X.C0Q3E;
import X.C0Q9S;
import X.C0Q9U;
import X.C0QF5;
import X.C0QSJ;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1278704zR;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C15O7;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20533215Wg;
import X.C21609119hZ;
import X.C2200821BBo;
import X.C641110PCr;
import X.C644060POa;
import X.C644210POp;
import X.C644490PPr;
import X.C644560PPy;
import X.C644840PRa;
import X.C645020PRs;
import X.C653440Pk6;
import X.C660870Pw5;
import X.C664290Q3v;
import X.C665420Q8e;
import X.C673150Qan;
import X.C679340Qkm;
import X.C687700QyG;
import X.C703302op;
import X.C723850SaN;
import X.C786410Ut5;
import X.EnumC669620QOi;
import X.InterfaceC1146704e9;
import X.InterfaceC214902198i;
import X.InterfaceC644900PRg;
import X.InterfaceC649890PeN;
import X.InterfaceC687730QyJ;
import Y.ACallableS417S0100000_10;
import Y.AObserverS214S0100000_10;
import Y.ARunnableS110S0100000_10;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.df.api.survey.ISearchSurvey;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.viewmodel.FeedbackHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.research.core.vability.SearchFragmentScope;
import com.ss.android.ugc.aweme.search.pages.result.core.viewmodel.SearchResultViewModel;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.core.ability.ISearchPageStatusAbility;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ability.ISearchPageAbility;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ability.ISearchPageListAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchTabFragment extends SearchBaseFragment implements ISearchPageAbility, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ int LLJLLIL = 0;
    public C665420Q8e LLJLIL;
    public SearchStateViewModel LLJLILLLLZIIL;
    public C0P7L LLJLL;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ability.ISearchPageAbility
    public final void Qk2() {
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS110S0100000_10(this, 85));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        View view = getView();
        if (view != null) {
            C660870Pw5.LIZJ(view);
        }
        super.onDestroyView();
        EventBus.LIZLLL().LJJI(this);
        this.LLJLIL = null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void WR(SearchResultParam searchResultParam) {
        super.WR(searchResultParam);
        ISearchPageListAbility iSearchPageListAbility = (ISearchPageListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchPageListAbility.class, null);
        if (iSearchPageListAbility != null) {
            iSearchPageListAbility.f62();
        }
        if (!isViewValid()) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                C786410Ut5.LJJIZ(arguments, "search_key", searchResultParam);
                return;
            }
            return;
        }
        qS(searchResultParam);
        Context context = getContext();
        if (context != null) {
            C641110PCr.LIZIZ(context, this, searchResultParam);
        }
        rS(true);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                qS((SearchResultParam) arguments.getSerializable("search_key"));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        SearchStateViewModel searchStateViewModel = this.LLJLILLLLZIIL;
        if (searchStateViewModel != null && (mutableLiveData2 = searchStateViewModel.searchState) != null) {
            mutableLiveData2.observe(this, new AObserverS214S0100000_10(this, 108));
        }
        C723850SaN.LIZ(this, false, null, new AwS589S0100000_10(this, 343), 3);
        C19EG activity = getActivity();
        if (activity != null) {
            C679340Qkm.LIZIZ(this, activity).get(SearchGlobalViewModel.class);
        }
        this.LLIZLLLIL.add(new C645020PRs(this));
        SearchStateViewModel searchStateViewModel2 = this.LLJLILLLLZIIL;
        if (searchStateViewModel2 != null && (mutableLiveData = searchStateViewModel2.isTnsShowingMaskLayer) != null) {
            mutableLiveData.observe(this, new AObserverS214S0100000_10(this, 65));
        }
    }

    @C14EU
    public final void onSearchAfterLogin(C0PSB c0psb) {
        Boolean boolValueOf = null;
        ISearchPageStatusAbility iSearchPageStatusAbility = (ISearchPageStatusAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchPageStatusAbility.class, null);
        if (iSearchPageStatusAbility != null) {
            boolValueOf = Boolean.valueOf(iSearchPageStatusAbility.mR());
        }
        c0psb.getClass();
        if (isViewValid() && Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            rS(true);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void onShowResultsEvent(C644840PRa c644840PRa) {
        String string;
        ISearchPageListAbility iSearchPageListAbility;
        if (c644840PRa == null) {
            return;
        }
        SAFHelper sAFHelper = SAFHelper.LIZ;
        InterfaceC214902198i interfaceC214902198iF0 = F0();
        C19EG activity = getActivity();
        sAFHelper.getClass();
        Integer numLJJIJIIJI = SAFHelper.LJJIJIIJI(interfaceC214902198iF0, activity);
        String str = c644840PRa.LIZ;
        if (numLJJIJIIJI != null) {
            string = numLJJIJIIJI.toString();
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(str, string) && Intrinsics.LJFF(c644840PRa.LIZIZ, C644560PPy.LJIILIIL(this.LLJJJJ)) && (iSearchPageListAbility = (ISearchPageListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchPageListAbility.class, null)) != null) {
            iSearchPageListAbility.PP();
        }
    }

    public final void qS(SearchResultParam searchResultParam) {
        boolean z;
        String enterMethod;
        this.LLJI = searchResultParam;
        oS(searchResultParam.getKeyword());
        String sugHint = searchResultParam.getSugHint();
        if (sugHint == null) {
            sugHint = "";
        }
        this.LLJILJIL = sugHint;
        this.LLJJ = searchResultParam.getSearchFrom();
        this.LLJJJJJIL = searchResultParam.getNeedCorrect();
        String enterMethod2 = searchResultParam.getEnterMethod();
        if (enterMethod2 != null && enterMethod2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            enterMethod = "channel_unknown";
        } else {
            enterMethod = searchResultParam.getEnterMethod();
        }
        nS(enterMethod);
        if (Intrinsics.LJFF(this.LLJJIJI, "channel_unknown")) {
            C0Q3E.LIZIZ(this).fe(new C0P9L());
        }
        if (Intrinsics.LJFF(this.LLJJ, "search_sug")) {
            this.LLJJJIL = searchResultParam.getSugType();
        }
        if (C703302op.LIZ(searchResultParam.getFromSearchSubtag())) {
            this.LLJJIJIL = searchResultParam.getFromSearchSubtag();
        }
        if (C703302op.LIZ(searchResultParam.getPreSearchId())) {
            this.LLJJJ = searchResultParam.getPreSearchId();
        }
        C19EG activity = getActivity();
        if (activity != null) {
            ((SearchResultViewModel) C679340Qkm.LIZIZ(this, activity).get(SearchResultViewModel.class)).LL.postValue(searchResultParam);
        }
    }

    public final void rS(boolean z) {
        if (isViewValid() && getUserVisibleHint() && this.LLJJL) {
            if (TextUtils.isEmpty(dS())) {
                ISearchPageStatusAbility iSearchPageStatusAbility = (ISearchPageStatusAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchPageStatusAbility.class, null);
                if (iSearchPageStatusAbility != null) {
                    iSearchPageStatusAbility.mo1(new C0Q9U(C0Q9S.EMPTY, null, null, false, 14));
                    return;
                }
                return;
            }
            ISearchPageListAbility iSearchPageListAbility = (ISearchPageListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchPageListAbility.class, null);
            if (iSearchPageListAbility != null && iSearchPageListAbility.BA1() && !z) {
                C0Q3E.LIZIZ(this).fe(new C0PSN(this.LLJJJJ));
                return;
            }
            C644060POa c644060POa = C644060POa.LIZ;
            int i = this.LLJJJJ;
            SearchResultParam searchResultParam = this.LLJI;
            c644060POa.getClass();
            C644060POa.LJIIJ(i, searchResultParam);
            if (C653440Pk6.LIZLLL) {
                nS("click_more_general_list");
                SearchResultParam searchResultParam2 = this.LLJI;
                if (searchResultParam2 != null) {
                    searchResultParam2.setEnterMethod("click_more_general_list", false);
                }
            } else if (((C0PRF) C0Q3E.LIZIZ(this).Wg1().LIZJ()).LL != this.LLJJJJ && !Intrinsics.LJFF(this.LLJJIJI, "correct_word")) {
                nS("switch_tab");
                SearchResultParam searchResultParam3 = this.LLJI;
                if (searchResultParam3 != null) {
                    searchResultParam3.setEnterMethod("switch_tab", false);
                }
            }
            this.LLJIJIL = this.LLJI;
            if (TextUtils.equals(C0PSI.LIZIZ(this.LLJJJJ), EnumC669620QOi.TOP.getTabName())) {
                C644210POp.LIZ.onEventStart(this.LLJI);
            }
            ISearchPageListAbility iSearchPageListAbility2 = (ISearchPageListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchPageListAbility.class, null);
            if (iSearchPageListAbility2 != null) {
                iSearchPageListAbility2.LJJJJLI();
            }
            C644490PPr.LIZ.getClass();
            C644490PPr.LIZIZ = C644490PPr.LIZJ;
            C0P7L c0p7l = this.LLJLL;
            if (c0p7l != null) {
                c0p7l.bL1(this);
            }
            C15O7.LIZJ(new ACallableS417S0100000_10(this, 1));
            boolean z2 = C0PYW.LIZ;
            C0PYW.LJ(this.LLJILLL);
            ISearchPageListAbility iSearchPageListAbility3 = (ISearchPageListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchPageListAbility.class, null);
            if (iSearchPageListAbility3 != null) {
                iSearchPageListAbility3.d();
            }
            if (!C653440Pk6.LIZJ) {
                return;
            }
            C653440Pk6.LIZJ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/verticalsearch/nativetab/fragment/SearchTabFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzhDDRLpI72YnZMf+rOW7Ie4CdaIjDxBi4MOWtMY8gLAQClzTNxVIW8nVI+nkbas5HtGFCLop8fOJDsQobVYjMs", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        rS(false);
        if (z) {
            C0Q3E.LIZIZ(this).fe(new C0PSP(this.LLJJJJ));
            C653440Pk6.LIZLLL = false;
            SearchResultParam searchResultParam = this.LLJI;
            if (searchResultParam != null) {
                searchResultParam.setIndex(this.LLJJJJ);
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(getClass());
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iIntValue;
        C0P7L c0p7lLIZJ;
        InterfaceC644900PRg interfaceC644900PRgLJFF;
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        if (activity != null) {
            this.LLJLILLLLZIIL = (SearchStateViewModel) C679340Qkm.LIZIZ(this, activity).get(SearchStateViewModel.class);
            ISearchSurvey iSearchSurveyLIZ = C0QF5.LIZ();
            if (iSearchSurveyLIZ != null && (interfaceC644900PRgLJFF = iSearchSurveyLIZ.LJFF()) != null) {
                c0p7lLIZJ = interfaceC644900PRgLJFF.LIZJ(this, activity);
            } else {
                c0p7lLIZJ = null;
            }
            this.LLJLL = c0p7lLIZJ;
        }
        C0Q3E.LIZIZ(this).fe(new C0PAW(hS()));
        C21609119hZ c21609119hZ = (C21609119hZ) view.findViewById(R.id.t25);
        if (c21609119hZ != null) {
            c21609119hZ.setDoNotCatchException(true);
        }
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, ISearchPageAbility.class, null, getViewLifecycleOwner());
        int iIntValue2 = 0;
        C723850SaN.LIZ(this, false, null, new AwS589S0100000_10(this, 344), 3);
        EventBus.LIZLLL().LJIJJ(this);
        if (getActivity() != null) {
            SAFHelper sAFHelper = SAFHelper.LIZ;
            InterfaceC214902198i interfaceC214902198iF0 = F0();
            C19EG activity2 = getActivity();
            sAFHelper.getClass();
            Integer numLJJIJIIJI = SAFHelper.LJJIJIIJI(interfaceC214902198iF0, activity2);
            ConcurrentLinkedDeque<Pair<Integer, InterfaceC649890PeN>> concurrentLinkedDeque = C664290Q3v.LIZ;
            if (numLJJIJIIJI != null) {
                iIntValue = numLJJIJIIJI.intValue();
            } else {
                iIntValue = 0;
            }
            if (C664290Q3v.LIZIZ(iIntValue) == null) {
                if (numLJJIJIIJI != null) {
                    iIntValue2 = numLJJIJIIJI.intValue();
                }
                C664290Q3v.LIZLLL(iIntValue2, new C1278704zR());
            }
        }
        FeedbackHelper feedbackHelper = FeedbackHelper.LIZ;
        C19EG activity3 = getActivity();
        feedbackHelper.getClass();
        FeedbackHelper.LIZIZ(this, activity3);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f3d, viewGroup, false);
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
