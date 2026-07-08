package com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C036E;
import X.C07H0;
import X.C098200Yq;
import X.C0BR4;
import X.C0CSC;
import X.C0H62;
import X.C0P7Z;
import X.C0P9D;
import X.C0P9L;
import X.C0PO5;
import X.C0PR4;
import X.C0PRI;
import X.C0PRW;
import X.C0PS3;
import X.C0PS4;
import X.C0PSC;
import X.C0PSG;
import X.C0PSI;
import X.C0PSN;
import X.C0PSP;
import X.C0PYW;
import X.C0PYX;
import X.C0PYZ;
import X.C0PZI;
import X.C0Q3E;
import X.C0Q3Q;
import X.C0Q94;
import X.C0QER;
import X.C0QF5;
import X.C0QJY;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XQ7;
import X.C1150504el;
import X.C1278704zR;
import X.C1390410mHn;
import X.C14EU;
import X.C1685300txQ;
import X.C189200o6;
import X.C1935507i5;
import X.C19EG;
import X.C19GS;
import X.C1AGP;
import X.C21609119hZ;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2344509Gp;
import X.C288060BQu;
import X.C301140BrE;
import X.C326370Cqp;
import X.C584850Mwl;
import X.C616540OGe;
import X.C640270P9l;
import X.C640870PBt;
import X.C641110PCr;
import X.C644060POa;
import X.C644490PPr;
import X.C644910PRh;
import X.C645020PRs;
import X.C646000PVm;
import X.C646820PYq;
import X.C646830PYr;
import X.C646850PYt;
import X.C649290PdP;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C653440Pk6;
import X.C660870Pw5;
import X.C661350Pwr;
import X.C664000Q2s;
import X.C664030Q2v;
import X.C664290Q3v;
import X.C665590Q8v;
import X.C666750QDh;
import X.C669480QNu;
import X.C679340Qkm;
import X.C686820Qwq;
import X.C690340R6a;
import X.C723850SaN;
import X.C7771031t;
import X.C7840034k;
import X.C786410Ut5;
import X.EnumC642100PGm;
import X.EnumC648990Pcv;
import X.InterfaceC214902198i;
import X.InterfaceC643870PNh;
import X.InterfaceC644920PRi;
import X.InterfaceC644960PRm;
import X.InterfaceC645000PRq;
import X.InterfaceC649890PeN;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.AObserverS214S0100000_10;
import Y.ARunnableS110S0100000_10;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.FeedbackContents;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchSurveyConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.df.api.survey.ISearchSurvey;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchEnterViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.viewmodel.FeedbackHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.model.OptionConfigParams;
import com.ss.android.ugc.aweme.search.pages.result.common.statusview.viewmodel.SearchNetworkStandardStatusVM;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel.SurveyViewModel;
import com.ss.android.ugc.aweme.search.pages.result.core.viewmodel.SearchResultViewModel;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class DynamicSearchFragment extends SearchBaseFragment implements InterfaceC643870PNh, C0PYZ {
    public C21609119hZ LLJLIL;
    public C1390410mHn LLJLILLLLZIIL;
    public SearchStartViewModel LLJLL;
    public boolean LLJLLL;
    public SearchStateViewModel LLJZ;
    public SearchEnterViewModel LLJZIJLIL;
    public SurveyViewModel LLL;
    public InterfaceC644920PRi LLLF;
    public InterfaceC644960PRm LLLFF;
    public C0PZI LLLFZ;
    public ViewGroup LLLI;
    public SearchNetworkStandardStatusVM LLLIIL;
    public boolean LLJLLIL = true;
    public final C01GW LLLFFI = C1935507i5.LIZ(new AwS554S0100000_10(this, 428));
    public C646830PYr LLLII = new C646830PYr(C036E.LIZ.LIZIZ(), C686820Qwq.LIZ());
    public final C646820PYq LLLIIII = new C0H62() { // from class: X.0PYq
        @Override // X.C0H62
        public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
            if (C0N7B.LIZ[c0o0l2.ordinal()] == 1) {
                if (c0o0l != C0O0L.AVAILABLE) {
                    C1524805y2.LIZIZ(0L, new AwS554S0100000_10(this.LL, 429));
                    return;
                }
                return;
            }
            C1524805y2.LIZIZ(0L, new AwS554S0100000_10(this.LL, 430));
        }
    };
    public final C646850PYt LLLIIIIL = new C0CSC() { // from class: X.0PYt
        @Override // X.C0CSC
        public final void LIZ(EnumC325100Com enumC325100Com) {
            C1524805y2.LIZIZ(0L, new AwS411S0200000_10(this.LIZ, enumC325100Com, 34));
        }
    };
    public final ARunnableS110S0100000_10 LLLIIIL = new ARunnableS110S0100000_10(this, 57);

    public abstract boolean BS();

    @Override // X.InterfaceC643870PNh
    public final void Ft(SearchApiResult searchApiResult) {
    }

    @Override // X.InterfaceC643870PNh
    public final void Md(SearchApiResult searchApiResult) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final Object SR(View view, String str) {
        return null;
    }

    @Override // X.InterfaceC643870PNh
    public final void XF(DynamicPatch dynamicPatch, String str) {
    }

    @Override // X.InterfaceC643870PNh
    public final int a1() {
        return -1;
    }

    @Override // X.InterfaceC643870PNh
    public final void mN() {
    }

    @Override // X.InterfaceC643870PNh
    public final void mn(SearchApiResult searchApiResult) {
    }

    @Override // X.InterfaceC643870PNh
    public final void nv(SearchApiResult searchApiResult) {
    }

    @C14EU
    public final void onWebViewActivityCloseEvent(C7771031t c7771031t) {
    }

    @Override // X.InterfaceC643870PNh
    public final void qs() {
    }

    @Override // X.InterfaceC643870PNh
    public final void vw(GlobalDoodleConfig globalDoodleConfig) {
    }

    @Override // X.InterfaceC643870PNh
    public final void yD(SearchApiResult searchApiResult) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        if (r1.equals("search_sug") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x011b, code lost:
    
        if (r1.equals("search_sug") == false) goto L84;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:83:0x00f8. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068 A[PHI: r7
      0x0068: PHI (r7v7 java.lang.String) = (r7v6 java.lang.String), (r7v8 java.lang.String) binds: [B:45:0x0085, B:32:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ff A[PHI: r4
      0x00ff: PHI (r4v4 java.lang.String) = (r4v0 java.lang.String), (r4v2 java.lang.String), (r4v3 java.lang.String), (r4v5 java.lang.String) binds: [B:96:0x011b, B:94:0x0115, B:91:0x010d, B:85:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String HS() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment.HS():java.lang.String");
    }

    public final void LJIIL() {
        C1390410mHn c1390410mHn = this.LLJLILLLLZIIL;
        if (c1390410mHn != null && c1390410mHn.LLIZLLLIL) {
            c1390410mHn.LIZLLL();
        }
        C21609119hZ c21609119hZ = this.LLJLIL;
        if (c21609119hZ == null) {
            c21609119hZ = null;
        }
        c21609119hZ.setRefreshing(false);
    }

    @Override // X.InterfaceC643870PNh
    public final WeakReference<Fragment> Lf() {
        return new WeakReference<>(this);
    }

    @Override // X.InterfaceC643870PNh
    public final void Lh() {
        InterfaceC644960PRm interfaceC644960PRm = this.LLLFF;
        if (interfaceC644960PRm != null) {
            interfaceC644960PRm.LIZJ(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final Object MR() {
        return this.LLLFFI.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[PHI: r11
      0x006c: PHI (r11v1 long) = (r11v0 long), (r11v3 long) binds: [B:26:0x0069, B:21:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchDynamicFragmentPerformanceData WX0() {
        /*
            r15 = this;
            boolean r0 = X.C0PYW.LIZ
            int r0 = r15.LLJILLL
            java.util.Map r3 = X.C0PYW.LIZJ(r0)
            X.0PZI r2 = r15.LLLFZ
            boolean r0 = r2 instanceof X.C649290PdP
            r1 = 0
            if (r0 == 0) goto L17
            X.0PdP r2 = (X.C649290PdP) r2
            if (r2 == 0) goto L17
            java.util.Map r1 = r2.LJIIJ()
        L17:
            com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchDynamicFragmentPerformanceData r4 = new com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchDynamicFragmentPerformanceData
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
            java.lang.String r0 = "searchTimestamp"
            java.lang.Object r0 = r3.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L75
            long r5 = r0.longValue()
        L29:
            java.lang.String r0 = "requestStartTimestamp"
            java.lang.Object r0 = r3.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L72
            long r7 = r0.longValue()
        L37:
            java.lang.String r0 = "requestEndTimestamp"
            java.lang.Object r0 = r3.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L6f
            long r9 = r0.longValue()
        L45:
            if (r1 == 0) goto L67
            java.lang.String r0 = "loadStartTimestamp"
            java.lang.Object r0 = r1.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L67
            long r11 = r0.longValue()
        L55:
            java.lang.String r0 = "loadEndTimestamp"
            java.lang.Object r0 = r1.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L6c
            long r13 = r0.longValue()
        L63:
            r4.<init>(r5, r7, r9, r11, r13)
            return r4
        L67:
            r11 = -1
            if (r1 == 0) goto L6c
            goto L55
        L6c:
            r13 = -1
            goto L63
        L6f:
            r9 = -1
            goto L45
        L72:
            r7 = -1
            goto L37
        L75:
            r5 = -1
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment.WX0():com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchDynamicFragmentPerformanceData");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    /* JADX INFO: renamed from: aS */
    public final C0Q94 MR() {
        return (C0Q94) this.LLLFFI.getValue();
    }

    @Override // X.InterfaceC643870PNh
    public final WeakReference<C19EG> lR() {
        return new WeakReference<>(getActivity());
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C036E.LIZ.LIZLLL(this.LLLIIII);
        ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).removeNetworkChangeObserver(this.LLLIIIIL);
        View view = getView();
        if (view != null) {
            HandlerHook.viewRemoveCallbacks(view, this.LLLIIIL);
        }
        super.onDestroy();
    }

    public final void uS() throws Throwable {
        SearchStateViewModel searchStateViewModel = this.LLJZ;
        if (searchStateViewModel != null) {
            searchStateViewModel.setIsRefreshingData(false);
        }
        C653440Pk6.LIZIZ = false;
        C646000PVm c646000PVm = C650950Pg5.Companion;
        C19EG activity = getActivity();
        c646000PVm.getClass();
        C0PS4 c0ps4LJFF = C646000PVm.LJFF(this, activity);
        if (c0ps4LJFF != null) {
            c0ps4LJFF.setLastShowingPageIndex(this.LLJJJJ);
        }
        C0Q3E.LIZIZ(this).fe(new C0PSN(this.LLJJJJ));
        this.LLJJJJLIIL = false;
    }

    public final void zS() {
        if (this.LLJJJJLIIL) {
            C1390410mHn c1390410mHn = this.LLJLILLLLZIIL;
            if (c1390410mHn != null) {
                c1390410mHn.LIZJ();
                return;
            }
            return;
        }
        C21609119hZ c21609119hZ = this.LLJLIL;
        if (c21609119hZ == null) {
            c21609119hZ = null;
        }
        c21609119hZ.setRefreshing(true);
    }

    @Override // X.InterfaceC643870PNh
    public final C0P9D ZA() {
        return gS();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        ViewGroup viewGroup;
        View view = getView();
        if (view != null) {
            C660870Pw5.LIZJ(view);
        }
        ViewGroup viewGroup2 = this.LLLI;
        if (viewGroup2 != null) {
            C786410Ut5.LJJJJI(viewGroup2);
        }
        ViewGroup viewGroup3 = this.LLLI;
        if (viewGroup3 != null && viewGroup3.getParent() != null) {
            ViewGroup viewGroup4 = this.LLLI;
            if ((viewGroup4 != null ? viewGroup4.getParent() : null) instanceof ViewGroup) {
                ViewGroup viewGroup5 = this.LLLI;
                ViewParent parent = viewGroup5 != null ? viewGroup5.getParent() : null;
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(this.LLLI, viewGroup);
                }
            }
        }
        super.onDestroyView();
        EventBus.LIZLLL().LJJI(this);
        C0PZI c0pzi = this.LLLFZ;
        View viewLIZIZ = c0pzi != null ? c0pzi.LIZIZ() : null;
        if (!(viewLIZIZ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) viewLIZIZ) == null) {
            return;
        }
        boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C0PZI c0pzi = this.LLLFZ;
        if (c0pzi != null) {
            c0pzi.sendEvent("onLynxVerticalSearchDisappeared", new JSONObject());
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        SystemClock.uptimeMillis();
        C0PZI c0pzi = this.LLLFZ;
        if (c0pzi != null) {
            c0pzi.sendEvent("onLynxVerticalSearchAppeared", new JSONObject());
        }
    }

    public void yS() {
        C0PZI c0pziWS = wS(requireContext(), this);
        this.LLLFZ = c0pziWS;
        ViewGroup viewGroup = this.LLLI;
        if (viewGroup != null && c0pziWS != null) {
            c0pziWS.LIZ(0, new ViewGroup.LayoutParams(-1, -1), viewGroup);
        }
        ViewGroup viewGroup2 = this.LLLI;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(0, viewGroup2);
        }
    }

    @Override // X.InterfaceC643870PNh
    public final SearchResultParam I() {
        return this.LLJIJIL;
    }

    private final void rS(GlobalDoodleConfig globalDoodleConfig) {
        boolean z;
        SurveyViewModel surveyViewModel;
        NextLiveData<SearchSurveyConfig> nextLiveData;
        if (globalDoodleConfig != null) {
            SearchSurveyConfig surveyConfig = globalDoodleConfig.getSurveyConfig();
            if (surveyConfig != null && (surveyViewModel = this.LLL) != null && (nextLiveData = surveyViewModel.LLILLJJLI) != null) {
                nextLiveData.postValue(surveyConfig);
            }
            boolean z2 = false;
            if (!Intrinsics.LJFF(globalDoodleConfig.getSearchChannel(), "tiktok_mall") && !Intrinsics.LJFF(globalDoodleConfig.getSearchChannel(), "tiktok_ecom")) {
                z = false;
            } else {
                z = true;
            }
            this.LLJLLL = z;
            if (globalDoodleConfig.getDisplayFilterBar() == 1) {
                z2 = true;
            }
            l6(z2);
            this.LLILZIL.setFeedbackSurvey(globalDoodleConfig.getFeedbackSurvey());
            this.LLILZIL.feelGoodToken.clear();
            HashMap<String, Object> feelGood = globalDoodleConfig.getFeelGood();
            if (feelGood != null) {
                this.LLILZIL.feelGoodToken.putAll(feelGood);
            }
            ISearchContextAbility iSearchContextAbilityLIZIZ = C0Q3E.LIZIZ(this);
            List<FeedbackContents> feedbackSurvey = globalDoodleConfig.getFeedbackSurvey();
            HashMap<String, Object> feelGood2 = globalDoodleConfig.getFeelGood();
            if (feelGood2 == null) {
                feelGood2 = new HashMap<>();
            }
            iSearchContextAbilityLIZIZ.fe(new C0PR4(feelGood2, feedbackSurvey));
        }
    }

    @Override // X.InterfaceC643870PNh
    public final void Dl(boolean z) {
        this.LLJJJJLIIL = z;
    }

    public final void FS(SearchResultParam searchResultParam) {
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
            this.LLILZIL.setRecentRequestSearchSourceUnknown(true);
            C0Q3E.LIZIZ(this).fe(new C0P9L());
        }
        if (Intrinsics.LJFF(this.LLJJ, "search_sug")) {
            this.LLJJJIL = searchResultParam.getSugType();
        }
        C19EG activity = getActivity();
        if (activity != null) {
            ((SearchResultViewModel) C679340Qkm.LIZIZ(this, activity).get(SearchResultViewModel.class)).LL.postValue(searchResultParam);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void JS(boolean r7) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment.JS(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void WR(SearchResultParam searchResultParam) {
        super.WR(searchResultParam);
        this.LLJLLIL = true;
        if (!isViewValid()) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                C786410Ut5.LJJIZ(arguments, "search_key", searchResultParam);
                return;
            }
            return;
        }
        FS(searchResultParam);
        C641110PCr.LIZIZ(requireContext(), this, searchResultParam);
        JS(false);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void hideLoadingBall(C7840034k c7840034k) {
        if ((Intrinsics.LJFF(c7840034k.LIZ, "vertical-sounds") || Intrinsics.LJFF(c7840034k.LIZ, "vertical-shopping") || Intrinsics.LJFF(c7840034k.LIZ, "vertical-poi")) && isViewValid()) {
            LJIIL();
        }
    }

    @Override // X.InterfaceC643870PNh
    public final void l6(boolean z) {
        SearchStartViewModel searchStartViewModel;
        com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<Boolean> nextLiveDataAQ2;
        com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<Boolean> nextLiveDataVQ2;
        com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<Boolean> nextLiveDataVQ22;
        com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<Boolean> nextLiveDataVQ23;
        if (C288060BQu.LIZ && NR()) {
            SearchResultParam searchResultParam = this.LLJI;
            if ((searchResultParam == null || searchResultParam.getFilterOption() == null) && (searchStartViewModel = this.LLJLL) != null && (nextLiveDataAQ2 = searchStartViewModel.AQ2()) != null) {
                nextLiveDataAQ2.setValue(Boolean.FALSE);
            }
            if (z) {
                if (!this.LLJLLL) {
                    C665590Q8v c665590Q8v = C665590Q8v.LIZ;
                    OptionConfigParams optionConfigParamsLIZ = ((C0Q94) this.LLLFFI.getValue()).LIZ();
                    c665590Q8v.getClass();
                    if (!C665590Q8v.LIZ(optionConfigParamsLIZ)) {
                        SearchStartViewModel searchStartViewModel2 = this.LLJLL;
                        if (searchStartViewModel2 != null && (nextLiveDataVQ23 = searchStartViewModel2.vQ2()) != null) {
                            nextLiveDataVQ23.setValue(Boolean.FALSE);
                        }
                        this.LLILLL = false;
                        return;
                    }
                }
                SearchStartViewModel searchStartViewModel3 = this.LLJLL;
                if (searchStartViewModel3 != null && (nextLiveDataVQ22 = searchStartViewModel3.vQ2()) != null) {
                    nextLiveDataVQ22.setValue(Boolean.TRUE);
                }
                this.LLILLL = true;
                return;
            }
            SearchStartViewModel searchStartViewModel4 = this.LLJLL;
            if (searchStartViewModel4 != null && (nextLiveDataVQ2 = searchStartViewModel4.vQ2()) != null) {
                nextLiveDataVQ2.setValue(Boolean.FALSE);
            }
            this.LLILLL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final void mS(boolean z) {
        super.mS(z);
        InterfaceC644920PRi interfaceC644920PRi = this.LLLF;
        if (interfaceC644920PRi != null) {
            interfaceC644920PRi.xb2(z, this, this.LLLFZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NextLiveData nextLiveData;
        MutableLiveData<Integer> mutableLiveData;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            FS((SearchResultParam) arguments.getSerializable("search_key"));
        }
        SearchStateViewModel searchStateViewModel = this.LLJZ;
        if (searchStateViewModel != null && (mutableLiveData = searchStateViewModel.searchState) != null) {
            mutableLiveData.observe(this, new AObserverS214S0100000_10(this, 146));
        }
        C19EG activity = getActivity();
        if (activity != null) {
            this.LLJLL = (SearchStartViewModel) C679340Qkm.LIZIZ(this, activity).get(SearchStartViewModel.class);
            SearchGlobalViewModel searchGlobalViewModel = (SearchGlobalViewModel) C679340Qkm.LIZIZ(this, activity).get(SearchGlobalViewModel.class);
            if (searchGlobalViewModel != null && (nextLiveData = searchGlobalViewModel.LLILZLL) != null) {
                nextLiveData.observe(this, new AObserverS214S0100000_10(this, 40));
            }
        }
        if (this.LLILZ == null) {
            ((C0Q94) this.LLLFFI.getValue()).LIZJ();
        }
        this.LLIZLLLIL.add(new C645020PRs(this));
        this.LLLIIL = C0P7Z.LIZ(this);
        C036E.LIZ.LIZ(this.LLLIIII);
        ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).observerNetworkChange(this.LLLIIIIL);
        C723850SaN.LIZ(this, false, null, new AwS585S0100000_6(this, 151), 3);
    }

    @C14EU
    public final void onFeedbackSubmitSuccess(C0PS3 c0ps3) {
        Boolean boolValueOf;
        NextLiveData<Boolean> nextLiveData;
        NextLiveData<Boolean> nextLiveData2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFeedbackSubmitSuccess, vm: ");
        sbLIZ.append(this.LLL);
        sbLIZ.append(", observer: ");
        SurveyViewModel surveyViewModel = this.LLL;
        if (surveyViewModel != null && (nextLiveData2 = surveyViewModel.LL) != null) {
            boolValueOf = Boolean.valueOf(nextLiveData2.hasObservers());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        SurveyViewModel surveyViewModel2 = this.LLL;
        if (surveyViewModel2 != null && (nextLiveData = surveyViewModel2.LL) != null) {
            nextLiveData.postValue(Boolean.TRUE);
        }
    }

    public JSONObject qS(C0QER c0qer) throws Throwable {
        String groupId;
        boolean z;
        boolean z2;
        int i;
        int filterBy;
        int sortType;
        String enterSearchFrom;
        int i2;
        String sugType;
        String sugGenerateType;
        String str;
        String str2;
        String sugUserId;
        String queryState;
        String bubbleType;
        String isBubbleClick;
        String bubbleTextType;
        Object objObtainLogData;
        C664030Q2v c664030Q2v;
        C664000Q2s c664000Q2s;
        String strIsFromComment;
        C0PSG filterOption;
        C0PSG filterOption2;
        C0PSG filterOption3;
        boolean z3;
        C664030Q2v c664030Q2v2;
        Object objObtainLogData2 = null;
        if (c0qer != null) {
            groupId = c0qer.getGroupId();
        } else {
            groupId = null;
        }
        int i3 = 1;
        if (groupId != null && !a0.LJJJIL(groupId)) {
            z = false;
        } else {
            z = true;
        }
        String str3 = "";
        if (z) {
            C650950Pg5.Companion.getClass();
            C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(this, this);
            if (c650960Pg6LJII != null && (c664030Q2v2 = c650960Pg6LJII.searchVideoModel) != null) {
                groupId = c664030Q2v2.groupId;
            } else {
                groupId = null;
            }
            if (groupId != null && groupId.length() != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                groupId = "";
            }
        }
        C0Q3E.LIZIZ(this).Wg1().LIZJ();
        C646000PVm c646000PVm = C650950Pg5.Companion;
        c646000PVm.getClass();
        C646000PVm.LJIIIZ(this, this);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("keyword", dS());
            String str4 = this.LLJILJIL;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("tag_text", str4);
            jSONObject.put("search_source", this.LLJJIJI);
            jSONObject.put("search_time", System.currentTimeMillis());
            jSONObject.put("query_correct_type", this.LLJJJJJIL);
            SearchResultParam searchResultParam = this.LLJI;
            if (searchResultParam == null || (filterOption3 = searchResultParam.getFilterOption()) == null || filterOption3.isDefaultOption()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_filter_search", i);
            SearchResultParam searchResultParam2 = this.LLJI;
            if (searchResultParam2 != null && (filterOption2 = searchResultParam2.getFilterOption()) != null) {
                filterBy = filterOption2.getFilterBy();
            } else {
                filterBy = 0;
            }
            jSONObject.put("filter_by", filterBy);
            SearchResultParam searchResultParam3 = this.LLJI;
            if (searchResultParam3 != null && (filterOption = searchResultParam3.getFilterOption()) != null) {
                sortType = filterOption.getSortType();
            } else {
                sortType = 0;
            }
            jSONObject.put("sort_type", sortType);
            C01GW<C669480QNu> c01gw = C669480QNu.LJ;
            jSONObject.put("search_context", C326370Cqp.LIZ().LIZJ());
            if (c0qer != null) {
                enterSearchFrom = c0qer.getEnterSearchFrom();
            } else {
                enterSearchFrom = null;
            }
            jSONObject.put("enter_from", enterSearchFrom);
            jSONObject.put("group_id", groupId);
            jSONObject.put("current_uid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            C19EG activity = getActivity();
            c646000PVm.getClass();
            C0PS4 c0ps4LJFF = C646000PVm.LJFF(this, activity);
            if (c0ps4LJFF != null) {
                i2 = c0ps4LJFF.lastShowingPageIndex;
            } else {
                i2 = -1;
            }
            if (i2 != -1 && i2 != this.LLJJJJ) {
                String strLIZIZ = C0PSI.LIZIZ(i2);
                if (Intrinsics.LJFF(strLIZIZ, "general_search")) {
                    strLIZIZ = "general";
                }
                jSONObject.put("from_search_subtab", strLIZIZ);
            }
            jSONObject.put("enter_method", this.LLJJIJI);
            C644490PPr.LIZ.getClass();
            jSONObject.put("last_search_id", C644490PPr.LIZJ);
            SearchResultParam searchResultParam4 = this.LLJI;
            if (searchResultParam4 != null) {
                sugType = searchResultParam4.getSugType();
            } else {
                sugType = null;
            }
            jSONObject.put("sug_type", sugType);
            SearchResultParam searchResultParam5 = this.LLJI;
            if (searchResultParam5 != null) {
                sugGenerateType = searchResultParam5.getSugGenerateType();
            } else {
                sugGenerateType = null;
            }
            jSONObject.put("sug_generate_type", sugGenerateType);
            C0QJY c0qjy = C0QJY.LIZ;
            C19EG activity2 = getActivity();
            c0qjy.getClass();
            jSONObject.put("sug_session_id", C0QJY.LIZ(this, activity2));
            boolean z4 = C0PYW.LIZ;
            jSONObject.put("is_first_search", C0PYW.LIZ);
            jSONObject.put("launch_time", C1150504el.LIZ().LJJII);
            c646000PVm.getClass();
            C650960Pg6 c650960Pg6LJII2 = C646000PVm.LJII(this, this);
            if (c650960Pg6LJII2 != null && (c664000Q2s = c650960Pg6LJII2.searchCommonModel) != null && (strIsFromComment = c664000Q2s.isFromComment()) != null) {
                str3 = strIsFromComment;
            }
            jSONObject.put("is_from_comment", str3);
            c646000PVm.getClass();
            C650960Pg6 c650960Pg6LJII3 = C646000PVm.LJII(this, this);
            if (c650960Pg6LJII3 != null && (c664030Q2v = c650960Pg6LJII3.searchVideoModel) != null) {
                str = c664030Q2v.groupId;
            } else {
                str = null;
            }
            jSONObject.put("lastFromGroupId", str);
            SearchStartViewModel searchStartViewModel = this.LLJLL;
            if (searchStartViewModel != null && searchStartViewModel.LLILZIL) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("from_middle_back_from_result", str2);
            SearchResultParam searchResultParam6 = this.LLJI;
            if (searchResultParam6 != null) {
                sugUserId = searchResultParam6.getSugUserId();
            } else {
                sugUserId = null;
            }
            jSONObject.put("sug_creator_id", sugUserId);
            SearchResultParam searchResultParam7 = this.LLJI;
            if (searchResultParam7 != null) {
                queryState = searchResultParam7.getQueryState();
            } else {
                queryState = null;
            }
            jSONObject.put("sug_query_state", queryState);
            SearchResultParam searchResultParam8 = this.LLJI;
            if (searchResultParam8 != null) {
                bubbleType = searchResultParam8.getBubbleType();
            } else {
                bubbleType = null;
            }
            jSONObject.put("bubble_type", bubbleType);
            SearchResultParam searchResultParam9 = this.LLJI;
            if (searchResultParam9 != null) {
                isBubbleClick = searchResultParam9.getIsBubbleClick();
            } else {
                isBubbleClick = null;
            }
            jSONObject.put("is_bubble_click", isBubbleClick);
            SearchResultParam searchResultParam10 = this.LLJI;
            if (searchResultParam10 != null) {
                bubbleTextType = searchResultParam10.getBubbleTextType();
            } else {
                bubbleTextType = null;
            }
            jSONObject.put("bubble_text_type", bubbleTextType);
            C0QER c0qer2 = C640270P9l.LIZ(this, getActivity()).LL;
            if (c0qer2 == null) {
                objObtainLogData = null;
            } else {
                objObtainLogData = c0qer2.obtainLogData("is_from_video");
            }
            jSONObject.put("is_from_video", objObtainLogData);
            C0QER c0qer3 = C640270P9l.LIZ(this, getActivity()).LL;
            if (c0qer3 != null) {
                objObtainLogData2 = c0qer3.obtainLogData("is_from_photo");
            }
            jSONObject.put("is_from_photo", objObtainLogData2);
            jSONObject.put("personal_context_info", C0Q3Q.LIZ(getActivity(), this, this.LLJI));
            if (!C666750QDh.LIZ()) {
                i3 = 0;
            }
            jSONObject.put("is_hide_engagement_data", i3);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void recordViewDrawEnd(C0PYX c0pyx) {
        String str;
        C644910PRh c644910PRhLJII;
        InterfaceC649890PeN interfaceC649890PeNLIZ = C664290Q3v.LIZ();
        if (interfaceC649890PeNLIZ == null || (c644910PRhLJII = interfaceC649890PeNLIZ.LJII(this.LLJJJJ)) == null || (str = c644910PRhLJII.LIZ) == null) {
            str = "";
        }
        C644060POa c644060POa = C644060POa.LIZ;
        SearchResultParam searchResultParam = this.LLJI;
        c644060POa.getClass();
        C0PO5 c0po5LJII = C644060POa.LJII(searchResultParam);
        c0po5LJII.LJIL(c0pyx.LIZLLL);
        Intrinsics.LJFF(c0po5LJII, C640870PBt.LIZ);
        c0po5LJII.LIZIZ(c0pyx.LIZJ);
        c0po5LJII.LJII(str);
        c0po5LJII.LJI = c0pyx.LIZ;
        c0po5LJII.LIZLLL = c0pyx.LJ;
        c0po5LJII.LJJJLZIJ = true;
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS110S0100000_10(c0po5LJII, 58));
        }
    }

    public final void sS(LogPbBean logPbBean) {
        String imprId;
        int iIntValue;
        if (logPbBean != null && (imprId = logPbBean.getImprId()) != null) {
            SAFHelper sAFHelper = SAFHelper.LIZ;
            InterfaceC214902198i interfaceC214902198iF0 = F0();
            C19EG activity = getActivity();
            sAFHelper.getClass();
            Integer numLJJIJIIJI = SAFHelper.LJJIJIIJI(interfaceC214902198iF0, activity);
            ConcurrentLinkedDeque<Pair<Integer, InterfaceC649890PeN>> concurrentLinkedDeque = C664290Q3v.LIZ;
            int iIntValue2 = 0;
            if (numLJJIJIIJI != null) {
                iIntValue = numLJJIJIIJI.intValue();
            } else {
                iIntValue = 0;
            }
            InterfaceC649890PeN interfaceC649890PeNLIZIZ = C664290Q3v.LIZIZ(iIntValue);
            InterfaceC649890PeN interfaceC649890PeN = interfaceC649890PeNLIZIZ;
            if (interfaceC649890PeNLIZIZ == null) {
                C1278704zR c1278704zR = new C1278704zR();
                if (numLJJIJIIJI != null) {
                    iIntValue2 = numLJJIJIIJI.intValue();
                }
                C664290Q3v.LIZLLL(iIntValue2, c1278704zR);
                interfaceC649890PeN = c1278704zR;
            }
            int i = this.LLJJJJ;
            C644910PRh c644910PRh = new C644910PRh();
            c644910PRh.LIZ = imprId;
            c644910PRh.LIZIZ = dS();
            interfaceC649890PeN.LJI(i, c644910PRh);
            C0PRW c0prw = this.LLILZIL;
            c0prw.setSearchId(imprId);
            c0prw.setSearchKeyword(dS());
            C0Q3E.LIZIZ(this).fe(new C0PRI(dS(), imprId, null, null, null, null, 0, null, false, 508));
            C0PSC.LIZ.getClass();
            C0PSC.LIZIZ(imprId);
            C644490PPr c644490PPr = C644490PPr.LIZ;
            String str = this.LLILZIL.searchId;
            c644490PPr.getClass();
            C644490PPr.LIZJ = str;
            C584850Mwl.LIZ.LJI(imprId, logPbBean);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void setRequestSuccessConfig(C2344509Gp c2344509Gp) throws Throwable {
        rS(c2344509Gp.LIZ);
        sS(c2344509Gp.LIZIZ);
        uS();
        Lh();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/common/core/ui/fragment/DynamicSearchFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzhDDRLpI72YnZMf+rOTrgB6IgwXYfZLQfz62aabjulGvOwJE7aJU4xepEHHrKwpNz+dEcn+3cCgOgH", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        JS(true);
        if (z) {
            C650950Pg5.Companion.getClass();
            C0PS4 c0ps4LJFF = C646000PVm.LJFF(this, this);
            if (c0ps4LJFF != null) {
                c0ps4LJFF.setSearchLastShowPageIndex(this.LLJJJJ);
            }
            C0Q3E.LIZIZ(this).fe(new C0PSP(this.LLJJJJ));
            C653440Pk6.LIZLLL = false;
            C653440Pk6.LJIIIIZZ = false;
            SearchResultParam searchResultParam = this.LLJI;
            if (searchResultParam != null) {
                searchResultParam.setIndex(this.LLJJJJ);
            }
            SystemClock.uptimeMillis();
        }
    }

    public final void uf2(Throwable th) {
        C644060POa c644060POa = C644060POa.LIZ;
        SearchResultParam searchResultParam = this.LLJIJIL;
        c644060POa.getClass();
        C0PO5 c0po5LJII = C644060POa.LJII(searchResultParam);
        c0po5LJII.LJIILIIL();
        c0po5LJII.LJIL(1);
        c0po5LJII.LJ(th.getMessage());
        c0po5LJII.LJIJI(th);
        c0po5LJII.LIZLLL();
    }

    public final void ES(int i, SearchApiResult searchApiResult) {
        String imprId;
        String searchChannel;
        String newSource;
        LJIIL();
        C01GW<C669480QNu> c01gw = C669480QNu.LJ;
        C669480QNu c669480QNuLIZ = C326370Cqp.LIZ();
        String strDS = dS();
        LogPbBean logPbBean = searchApiResult.logPb;
        if (logPbBean == null || (imprId = logPbBean.getImprId()) == null) {
            imprId = "";
        }
        GlobalDoodleConfig globalDoodleConfig = searchApiResult.globalDoodleConfig;
        Long lValueOf = null;
        if (globalDoodleConfig != null) {
            searchChannel = globalDoodleConfig.getSearchChannel();
        } else {
            searchChannel = null;
        }
        GlobalDoodleConfig globalDoodleConfig2 = searchApiResult.globalDoodleConfig;
        if (globalDoodleConfig2 != null) {
            newSource = globalDoodleConfig2.getNewSource();
        } else {
            newSource = null;
        }
        BaseResponse.ServerTimeExtra serverTimeExtra = searchApiResult.extra;
        if (serverTimeExtra != null) {
            lValueOf = Long.valueOf(serverTimeExtra.now);
        }
        c669480QNuLIZ.LJIJJLI(new LastSearch(strDS, imprId, searchChannel, newSource, lValueOf, 0L));
        rS(searchApiResult.globalDoodleConfig);
        sS(searchApiResult.logPb);
        uS();
        C644060POa c644060POa = C644060POa.LIZ;
        SearchResultParam searchResultParam = this.LLJIJIL;
        c644060POa.getClass();
        C0PO5 c0po5LJII = C644060POa.LJII(searchResultParam);
        c0po5LJII.LIZIZ(i);
        c0po5LJII.LJIILIIL();
        c0po5LJII.LJII(searchApiResult.getRequestId());
        c0po5LJII.LJIJ(searchApiResult);
        c0po5LJII.LJIL(0);
        c0po5LJII.LIZLLL();
        Lh();
    }

    public void GS(int i, C0PSG c0psg) throws Throwable {
        C0PSG filterOption;
        C0PYW.LIZJ++;
        int i2 = this.LLJILLL;
        if (i2 >= 0) {
            C0PYW.LJI.put(i2, Long.valueOf(System.currentTimeMillis()));
        }
        this.LLJIJIL = this.LLJI;
        C0QER c0qer = null;
        if (c0psg == null) {
            this.LLILZ = null;
            ((C0Q94) this.LLLFFI.getValue()).LIZJ();
        }
        SearchResultParam searchResultParam = this.LLJI;
        boolean z = true;
        if (searchResultParam != null && searchResultParam.getIsFilterFromSchema()) {
            SearchResultParam searchResultParam2 = this.LLJI;
            if (searchResultParam2 != null) {
                filterOption = searchResultParam2.getFilterOption();
            } else {
                filterOption = null;
            }
            this.LLILZ = filterOption;
            if (filterOption != null) {
                filterOption.setFromSchema(true);
            }
            SearchResultParam searchResultParam3 = this.LLJI;
            if (searchResultParam3 != null) {
                searchResultParam3.setIsFilterFromSchema(false);
            }
        }
        SearchResultParam searchResultParam4 = this.LLJI;
        if (searchResultParam4 != null) {
            searchResultParam4.setFilterOption(c0psg);
        }
        SearchStateViewModel searchStateViewModel = this.LLJZ;
        if (searchStateViewModel != null) {
            searchStateViewModel.setIsRefreshingData(true);
        }
        nS(HS());
        C644490PPr.LIZ.getClass();
        C644490PPr.LIZIZ = C644490PPr.LIZJ;
        SearchEnterViewModel searchEnterViewModel = this.LLJZIJLIL;
        if (searchEnterViewModel != null) {
            c0qer = searchEnterViewModel.LL;
        }
        JSONObject jSONObjectQS = qS(c0qer);
        if (c0psg == null) {
            z = false;
        }
        jSONObjectQS.put("is_filter_search", z);
        C0PZI c0pzi = this.LLLFZ;
        if (c0pzi != null) {
            c0pzi.sendEvent("changeSearchParams", jSONObjectQS);
        }
        if (BS()) {
            C644060POa c644060POa = C644060POa.LIZ;
            SearchResultParam searchResultParam5 = this.LLJIJIL;
            c644060POa.getClass();
            C644060POa.LJII(searchResultParam5).LJIILJJIL();
        }
        C0PYW.LIZ = false;
        InterfaceC644920PRi interfaceC644920PRi = this.LLLF;
        if (interfaceC644920PRi != null) {
            interfaceC644920PRi.kD2();
        }
        SearchNetworkStandardStatusVM searchNetworkStandardStatusVM = this.LLLIIL;
        if (searchNetworkStandardStatusVM != null) {
            searchNetworkStandardStatusVM.LL = EnumC642100PGm.NORMAL;
        }
    }

    public final void Rf2(int i, boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_network_connected", z);
        jSONObject.put("network_state", i);
        C0PZI c0pzi = this.LLLFZ;
        if (c0pzi != null) {
            c0pzi.sendEvent("networkStateDidChange", jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        InterfaceC645000PRq interfaceC645000PRqLJ;
        InterfaceC644920PRi interfaceC644920PRiLIZ;
        InterfaceC644960PRm interfaceC644960PRmLIZIZ;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        SparkContext sparkContext;
        super.onViewCreated(view, bundle);
        C21609119hZ c21609119hZ = (C21609119hZ) view.findViewById(R.id.t25);
        this.LLJLIL = c21609119hZ;
        InterfaceC644960PRm interfaceC644960PRm = null;
        if (c21609119hZ == null) {
            c21609119hZ = null;
        }
        c21609119hZ.setEnabled(false);
        this.LLJLILLLLZIIL = (C1390410mHn) view.findViewById(R.id.u82);
        yS();
        SearchResultParam searchResultParam = this.LLJI;
        if (searchResultParam != null) {
            WR(searchResultParam);
        }
        EventBus.LIZLLL().LJIJJ(this);
        C19EG activity = getActivity();
        if (activity != null) {
            this.LLJZIJLIL = (SearchEnterViewModel) C679340Qkm.LIZIZ(this, activity).get(SearchEnterViewModel.class);
            this.LLL = (SurveyViewModel) C679340Qkm.LIZIZ(this, activity).get(SurveyViewModel.class);
            this.LLJZ = (SearchStateViewModel) C679340Qkm.LIZIZ(this, activity).get(SearchStateViewModel.class);
        }
        FeedbackHelper feedbackHelper = FeedbackHelper.LIZ;
        C19EG activity2 = getActivity();
        feedbackHelper.getClass();
        FeedbackHelper.LIZIZ(this, activity2);
        nS(HS());
        C0PZI c0pzi = this.LLLFZ;
        if (c0pzi != null) {
            View viewLIZIZ = c0pzi.LIZIZ();
            if ((viewLIZIZ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) viewLIZIZ) != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null) {
                C1AGP.LIZ.getClass();
                C1AGP.LIZIZ(sparkContext, "vertical_search");
            }
        }
        if (C301140BrE.LIZ()) {
            C690340R6a.LIZ();
        }
        C0PZI c0pzi2 = this.LLLFZ;
        if (c0pzi2 != null) {
            rL(c0pzi2);
        }
        getActivity();
        try {
            if (C036E.LIZ.LIZIZ()) {
                zS();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (C0BR4.LIZ()) {
            ISearchSurvey iSearchSurveyLIZ = C0QF5.LIZ();
            if (iSearchSurveyLIZ != null) {
                interfaceC645000PRqLJ = iSearchSurveyLIZ.LJ();
                if (interfaceC645000PRqLJ != null && (interfaceC644920PRiLIZ = interfaceC645000PRqLJ.LIZ()) != null) {
                    interfaceC644920PRiLIZ.KC1(this);
                }
                this.LLLF = interfaceC644920PRiLIZ;
                if (interfaceC645000PRqLJ != null && (interfaceC644960PRmLIZIZ = interfaceC645000PRqLJ.LIZIZ()) != null) {
                    interfaceC644960PRmLIZIZ.LIZIZ(this.LLLF);
                    interfaceC644960PRm = interfaceC644960PRmLIZIZ;
                }
                this.LLLFF = interfaceC644960PRm;
            } else {
                interfaceC645000PRqLJ = null;
            }
            interfaceC644920PRiLIZ = null;
            this.LLLF = interfaceC644920PRiLIZ;
            if (interfaceC645000PRqLJ != null) {
                interfaceC644960PRmLIZIZ.LIZIZ(this.LLLF);
                interfaceC644960PRm = interfaceC644960PRmLIZIZ;
            }
            this.LLLFF = interfaceC644960PRm;
        }
        boolean zLIZIZ = C036E.LIZ.LIZIZ();
        int iLIZ = C686820Qwq.LIZ();
        this.LLLII = new C646830PYr(zLIZIZ, iLIZ);
        Rf2(iLIZ, zLIZIZ);
    }

    public C0PZI wS(Context context, LifecycleOwner lifecycleOwner) {
        return new C649290PdP(this, C661350Pwr.LIZIZ(context, F0()), this, (EnumC648990Pcv) null, 24);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        C19GS c19gs;
        if (!C07H0.LIZ()) {
            viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(getContext()), R.layout.ex3, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.ex3, viewGroup, false);
        }
        this.LLLI = (ViewGroup) viewTd.findViewById(R.id.gdh);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
