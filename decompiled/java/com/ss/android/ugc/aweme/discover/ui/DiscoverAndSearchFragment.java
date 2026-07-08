package com.ss.android.ugc.aweme.discover.ui;

import X.AbstractC1252750ihl;
import X.AnonymousClass0412;
import X.AnonymousClass1171;
import X.AnonymousClass1172;
import X.AnonymousClass1173;
import X.AnonymousClass1175;
import X.AnonymousClass1176;
import X.C004I;
import X.C01GW;
import X.C098200Yq;
import X.C0QER;
import X.C0QRA;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C10EU;
import X.C10S5;
import X.C117B;
import X.C11DI;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C12ES;
import X.C13LE;
import X.C1571350qzd;
import X.C15O7;
import X.C1602160rnK;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1765020w20;
import X.C189200o6;
import X.C18IO;
import X.C194479116v;
import X.C194483116z;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C19U1;
import X.C20533215Wg;
import X.C20642615q4;
import X.C20673215v0;
import X.C20684815ws;
import X.C21594419fC;
import X.C2187451AjH;
import X.C2200821BBo;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C343710Ddh;
import X.C418440Gaw;
import X.C426750GoL;
import X.C497820Jfg;
import X.C527310Km9;
import X.C616540OGe;
import X.C664270Q3t;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1055110dYz;
import X.InterfaceC1075600e62;
import X.InterfaceC1171660gay;
import X.InterfaceC1593550rZR;
import X.InterfaceC1620270sGX;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC19400310vB;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC469360Ias;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import X.ViewOnClickListenerC19400210vA;
import Y.ACListenerS163S0100000_29;
import Y.ACallableS18S0000100_9;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.ui.BaseDiscoverTabFragment;
import com.ss.android.ugc.aweme.discover.ui.DiscoverAndSearchFragment;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabState;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.legacy.network.viewmodel.SuggestWordsViewModel;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AFwS317S0000000_29;
import kotlin.jvm.internal.AwS157S0400000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class DiscoverAndSearchFragment extends AmeBaseFragment implements InterfaceC1620270sGX, C11DI, InterfaceC1593550rZR, InterfaceC1171660gay, C10S5, InterfaceC1055110dYz, InterfaceC1075600e62<AnonymousClass0412> {
    public static long LLJJLIIIJLLLLLLLZ = 0;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiElOiw8PiHELIOSA+Zzo6ZgElOiw8PiA+CCE3GyAtOyw7DjctLiI2JjE=";
    public C527310Km9 LL;
    public TrendsTabFragment LLILLJJLI;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public C194479116v LLIZ;
    public final lifecycleAwareLazy LLJ;
    public ViewGroup LLJI;
    public FrameLayout LLJIJIL;
    public ViewOnClickListenerC19400210vA LLJILJIL;
    public ViewOnClickListenerC19400210vA LLJILJILJ;
    public ImageView LLJILLL;
    public View LLJJ;
    public C21594419fC LLJJI;
    public C19U1 LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public C117B LLJJJ;
    public AnonymousClass1172 LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public Word LLJJJJLIIL;
    public Context LLJJL;
    public long LLILLL = -1;
    public long LLILZ = -1;
    public final AnonymousClass0412 LLIZLLLIL = new AnonymousClass0412();

    public DiscoverAndSearchFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TrendsTabViewModel.class);
        AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(c19719912DlLIZ, 88);
        this.LLJ = new lifecycleAwareLazy(this, awS573S0100000_29, new AwS157S0400000_29(this, awS573S0100000_29, c19719912DlLIZ, AFwS317S0000000_29.get$arr$(1), 2));
        this.LLJJJJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS273S0000000_29.get$arr$(34), "i18n_tab_mode", Boolean.class);
        this.LLJJJJJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS273S0000000_29.get$arr$(35), "search_enter_param", C0QER.class);
    }

    @Override // X.C11DI
    public final void cQ() {
    }

    @Override // X.C10S5, X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b5131";
    }

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
    }

    @Override // X.C10S5
    public final String pO() {
        return "MainTabPage";
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // X.InterfaceC1620270sGX
    public final void vq() {
    }

    public final boolean MR() {
        return ((Boolean) this.LLJJJJ.getValue()).booleanValue();
    }

    public final void OR() {
        if (this.LLILLL > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLILLL;
            if (jElapsedRealtime > 0) {
                C15O7.LIZIZ(new ACallableS18S0000100_9(jElapsedRealtime, 0), C20684815ws.LJFF(), null);
            }
            this.LLILLL = -1L;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        Context context = this.LLJJL;
        return context == null ? super.getContext() : context;
    }

    @Override // X.InterfaceC1593550rZR
    public final boolean LLLLIIL() {
        if (!isViewValid()) {
            return false;
        }
        OR();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        LocalBroadcastManager.LIZ(getContext()).LIZLLL(this.LLJJJ);
        C20673215v0.LJIIIIZZ(R.layout.bn9);
        C20673215v0.LJIIIIZZ(R.layout.bmy);
        this.LL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        BaseDiscoverTabFragment baseDiscoverTabFragmentLJJIJL;
        super.onPause();
        this.mStatusActive = false;
        if (this.LLILZIL) {
            OR();
            C194479116v c194479116v = this.LLIZ;
            if (c194479116v != null && (baseDiscoverTabFragmentLJJIJL = c194479116v.LJJIJL(c194479116v.LLJILJIL)) != null) {
                baseDiscoverTabFragmentLJJIJL.OR(true, true);
            }
        }
        this.LLILZLL = false;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        View decorView;
        Window window2;
        BaseDiscoverTabFragment baseDiscoverTabFragmentLJJIJL;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(DiscoverAndSearchFragment.class.getName());
        }
        super.onResume();
        AnonymousClass1172 anonymousClass1172 = this.LLJJJIL;
        if (anonymousClass1172 != null && (anonymousClass1172.LJI() instanceof AnonymousClass1176)) {
            ((AnonymousClass1176) anonymousClass1172.LJI()).LJIIJ();
        }
        C19EG activity = getActivity();
        if (activity != null && Intrinsics.LJFF(C343710Ddh.LIZ(activity).BQ2(), this)) {
            C2211631BhB.LJIIL(this, null);
        }
        if (this.LLILZIL) {
            this.LLILLL = SystemClock.elapsedRealtime();
            C194479116v c194479116v = this.LLIZ;
            if (c194479116v != null && (baseDiscoverTabFragmentLJJIJL = c194479116v.LJJIJL(c194479116v.LLJILJIL)) != null) {
                baseDiscoverTabFragmentLJJIJL.OR(false, true);
            }
        }
        if (getUserVisibleHint() && !C20642615q4.LIZIZ() && this.LLILZIL) {
            Word word = this.LLJJJJLIIL;
            TextUtils.isEmpty(word != null ? word.getWord() : null);
            this.LLILZLL = true;
        }
        C19EG activity2 = getActivity();
        if (activity2 != null && (window2 = activity2.getWindow()) != null) {
            window2.setBackgroundDrawable(null);
        }
        C19EG activity3 = getActivity();
        if (activity3 == null || (window = activity3.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setBackground(null);
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return C664270Q3t.LIZ(this);
    }

    @Override // X.InterfaceC1075600e62
    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory jl() {
        return this.LLIZLLLIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[PHI: r1
      0x0019: PHI (r1v12 java.lang.String) = (r1v0 java.lang.String), (r1v13 java.lang.String) binds: [B:10:0x0017, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void NR(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.DiscoverAndSearchFragment.NR(java.lang.String):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.LLJJL = context;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = true;
        BtmSDK.INSTANCE.registerBtmPageOnCreate(new C18IO(this, "a2270.b5131", z, z, z, (String) null, 64));
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        C2211631BhB.LJIIL(this, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        C194479116v c194479116v;
        SuggestWordsViewModel suggestWordsViewModel;
        BaseDiscoverTabFragment baseDiscoverTabFragmentLJJIJL;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/discover/ui/DiscoverAndSearchFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6hcJzByjdkkz+SHcy7MG3IGO5AytA/ECJG6zkxhuONnE0gAHY=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        boolean z2 = !z;
        this.LLILZIL = !z2;
        if (getActivity() != null && this.LLILLJJLI != null) {
            C194479116v c194479116v2 = this.LLIZ;
            if (c194479116v2 != null && (baseDiscoverTabFragmentLJJIJL = c194479116v2.LJJIJL(c194479116v2.LLJILJIL)) != null) {
                baseDiscoverTabFragmentLJJIJL.OR(z2, false);
            }
            if (this.LLILZIL) {
                this.LLILLL = SystemClock.elapsedRealtime();
            } else {
                OR();
            }
        }
        if (this.LLILZIL) {
            C10EU.LJIIIIZZ();
        }
        AnonymousClass1172 anonymousClass1172 = this.LLJJJIL;
        if (anonymousClass1172 != null) {
            if (z && (suggestWordsViewModel = (SuggestWordsViewModel) anonymousClass1172.LIZLLL.getValue()) != null) {
                suggestWordsViewModel.vQ2((C0QRA) anonymousClass1172.LJ.getValue(), new AnonymousClass1171(anonymousClass1172));
            }
            anonymousClass1172.LIZIZ = z;
            AnonymousClass1173 anonymousClass1173LJI = anonymousClass1172.LJI();
            if (anonymousClass1173LJI != null) {
                anonymousClass1173LJI.LJII(z);
            }
        }
        if (z && (c194479116v = this.LLIZ) != null) {
            int i = c194479116v.LLJILJIL;
            if (i < 0) {
                c194479116v.LLJIJIL = i;
                c194479116v.LLJILJIL = 0;
            }
            BaseDiscoverTabFragment baseDiscoverTabFragmentLJJIJL2 = c194479116v.LJJIJL(c194479116v.LLJILJIL);
            if (baseDiscoverTabFragmentLJJIJL2 != null) {
                c194479116v.LJJIJLIJ(baseDiscoverTabFragmentLJJIJL2, true);
            }
        }
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        if (!btmSDK.getPageLifecycle().LJ(this, z, null)) {
            btmSDK.getPageLifecycle().LIZ(this, z);
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(DiscoverAndSearchFragment.class);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.117B] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.116x] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById;
        super.onViewCreated(view, bundle);
        this.LLJJJ = new BroadcastReceiver() { // from class: X.117B
            public final void LIZ(Intent intent) {
                String word;
                if (Intrinsics.LJFF("android.intent.action.USER_PRESENT", intent.getAction()) && this.LIZ.getUserVisibleHint()) {
                    DiscoverAndSearchFragment discoverAndSearchFragment = this.LIZ;
                    if (discoverAndSearchFragment.mStatusActive && !discoverAndSearchFragment.LLILZLL && discoverAndSearchFragment.LLILZIL) {
                        Word word2 = discoverAndSearchFragment.LLJJJJLIIL;
                        if (word2 != null) {
                            word = word2.getWord();
                        } else {
                            word = null;
                        }
                        if (!TextUtils.isEmpty(word)) {
                            this.LIZ.getClass();
                        }
                        this.LIZ.LLILZLL = true;
                    }
                }
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                if (!C2214201BlK.LJIIJJI && intent != null) {
                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                        C2188191AkT.LIZIZ();
                    }
                }
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    LIZ(intent);
                } else {
                    C2408409cA.LIZ();
                    LIZ(intent);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        LocalBroadcastManager.LIZ(getContext()).LIZIZ(this.LLJJJ, intentFilter);
        ViewGroup viewGroup = this.LLJI;
        if (viewGroup != null) {
            this.LLJJJIL = new AnonymousClass1172(new C194483116z(viewGroup, new AnonymousClass1175() { // from class: X.116x
                @Override // X.AnonymousClass1175
                public final void LIZ() {
                }

                @Override // X.AnonymousClass1175
                public final void LIZIZ(View view2) {
                    if (ComplianceServiceProvider.LJIIJJI().LJIIIZ()) {
                        C1389890mGx c1389890mGx = new C1389890mGx(view2);
                        c1389890mGx.LJIIIZ(2131834392);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    this.LIZ.NR("");
                }

                @Override // X.AnonymousClass1175
                public final void LIZJ(Word word) {
                    this.LIZ.LLJJJJLIIL = word;
                }
            }));
            FrameLayout frameLayout = this.LLJIJIL;
            if (frameLayout != null && (viewFindViewById = frameLayout.findViewById(R.id.ylw)) != null) {
                C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33))), null, 0, null, 26);
            }
        }
        C19EG activity = getActivity();
        if (activity != null) {
            HomeTabViewModel.LLILZIL.LIZ(activity).getClass();
        }
        C194479116v c194479116v = new C194479116v(getContext(), getChildFragmentManager());
        this.LLIZ = c194479116v;
        this.LLJJI.setAdapter(c194479116v);
        this.LLIZ.notifyDataSetChanged();
        C21594419fC c21594419fC = this.LLJJI;
        final C194479116v c194479116v2 = this.LLIZ;
        c21594419fC.setOnPageChangeListener(new InterfaceC469360Ias(c194479116v2) { // from class: X.116w
            public final C194479116v LL;

            @Override // X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i) {
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageScrolled(int i, float f, int i2) {
            }

            {
                this.LL = c194479116v2;
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageSelected(int i) {
                boolean z;
                int i2 = 0;
                for (Object obj : (ArrayList) this.LL.LLJI) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        BaseDiscoverTabFragment baseDiscoverTabFragment = (BaseDiscoverTabFragment) obj;
                        if (i2 != i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        baseDiscoverTabFragment.OR(z, false);
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                C194479116v c194479116v3 = this.LL;
                c194479116v3.LLJIJIL = c194479116v3.LLJILJIL;
                c194479116v3.LLJILJIL = i;
                BaseDiscoverTabFragment baseDiscoverTabFragmentLJJIJL = c194479116v3.LJJIJL(i);
                if (baseDiscoverTabFragmentLJJIJL != null) {
                    this.LL.LJJIJLIJ(baseDiscoverTabFragmentLJJIJL, false);
                }
            }
        });
        this.LLJJI.setOffscreenPageLimit(4);
        TrendsTabFragment trendsTabFragment = new TrendsTabFragment();
        trendsTabFragment.LLJILJILJ = this;
        trendsTabFragment.LLJILLL = this;
        trendsTabFragment.setArguments(new Bundle(1));
        this.LLILLJJLI = trendsTabFragment;
        C194479116v c194479116v3 = this.LLIZ;
        ((ArrayList) c194479116v3.LLJI).add(trendsTabFragment);
        c194479116v3.notifyDataSetChanged();
        ((TrendsTabViewModel) this.LLJ.getValue()).qR2(true);
        C11EA.LJII(this, (JediViewModel) this.LLJ.getValue(), new C2217381BqS() { // from class: X.116y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((TrendsTabState) obj).getCanScrollVertically());
            }
        }, new AwS643S0100000_29(this, 186));
        C194479116v c194479116v4 = this.LLIZ;
        if (c194479116v4 != null) {
            int i = c194479116v4.LLJILJIL;
            if (i < 0) {
                c194479116v4.LLJIJIL = i;
                c194479116v4.LLJILJIL = 0;
            }
            BaseDiscoverTabFragment baseDiscoverTabFragmentLJJIJL = c194479116v4.LJJIJL(c194479116v4.LLJILJIL);
            if (baseDiscoverTabFragmentLJJIJL != null) {
                c194479116v4.LJJIJLIJ(baseDiscoverTabFragmentLJJIJL, true);
            }
        }
        View view2 = getView();
        if (view2 != null) {
            View viewFindViewById2 = view2.findViewById(R.id.iso);
            if (viewFindViewById2 != null) {
                viewFindViewById2.getLayoutParams().height = C497820Jfg.LIZJ(viewFindViewById2.getContext());
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZLLL = C20673215v0.LIZLLL(R.layout.bn9, getActivity(), viewGroup, false);
        if (viewLIZLLL != null) {
            this.LLJI = (ViewGroup) viewLIZLLL.findViewById(R.id.ydn);
            this.LLJIJIL = (FrameLayout) viewLIZLLL.findViewById(R.id.tny);
            this.LLJILJIL = (ViewOnClickListenerC19400210vA) viewLIZLLL.findViewById(R.id.ue7);
            this.LLJILJILJ = (ViewOnClickListenerC19400210vA) viewLIZLLL.findViewById(R.id.ue8);
            this.LLJILLL = (ImageView) viewLIZLLL.findViewById(R.id.bn5);
            this.LLJJ = viewLIZLLL.findViewById(R.id.tks);
            this.LLJJI = (C21594419fC) viewLIZLLL.findViewById(R.id.view_pager);
            this.LLJJIII = (C19U1) viewLIZLLL.findViewById(R.id.wya);
            this.LLJJIJI = viewLIZLLL.findViewById(R.id.wxh);
            this.LLJJIJIIJIL = viewLIZLLL.findViewById(R.id.adl);
            this.LLJJIJIL = viewLIZLLL.findViewById(R.id.mpp);
            viewLIZLLL.findViewById(R.id.ltz);
        }
        if (MR()) {
            ViewOnClickListenerC19400210vA viewOnClickListenerC19400210vA = this.LLJILJIL;
            int visibility = viewOnClickListenerC19400210vA.getVisibility();
            viewOnClickListenerC19400210vA.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, viewOnClickListenerC19400210vA);
            ViewOnClickListenerC19400210vA viewOnClickListenerC19400210vA2 = this.LLJILJILJ;
            int visibility2 = viewOnClickListenerC19400210vA2.getVisibility();
            viewOnClickListenerC19400210vA2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, viewOnClickListenerC19400210vA2);
            ViewOnClickListenerC19400210vA viewOnClickListenerC19400210vA3 = this.LLJILJILJ;
            viewOnClickListenerC19400210vA3.getClass();
            if (!C1571350qzd.LIZ.LIZ().booleanValue()) {
                C786410Ut5.LLLLLLZZ(viewOnClickListenerC19400210vA3.LLILLJJLI, 0);
                C786410Ut5.LLIL(viewOnClickListenerC19400210vA3.LL, 8);
            }
        } else {
            ViewOnClickListenerC19400210vA viewOnClickListenerC19400210vA4 = this.LLJILJILJ;
            int visibility3 = viewOnClickListenerC19400210vA4.getVisibility();
            viewOnClickListenerC19400210vA4.setVisibility(8);
            C1602160rnK.LIZIZ(visibility3, 8, viewOnClickListenerC19400210vA4);
            ViewOnClickListenerC19400210vA viewOnClickListenerC19400210vA5 = this.LLJILJIL;
            int visibility4 = viewOnClickListenerC19400210vA5.getVisibility();
            viewOnClickListenerC19400210vA5.setVisibility(0);
            C1602160rnK.LIZIZ(visibility4, 0, viewOnClickListenerC19400210vA5);
            ViewOnClickListenerC19400210vA viewOnClickListenerC19400210vA6 = this.LLJILJIL;
            viewOnClickListenerC19400210vA6.getClass();
            if (!C1571350qzd.LIZ.LIZ().booleanValue()) {
                C786410Ut5.LLLLLLZZ(viewOnClickListenerC19400210vA6.LLILLJJLI, 0);
                C786410Ut5.LLIL(viewOnClickListenerC19400210vA6.LL, 8);
            }
        }
        InterfaceC19400310vB interfaceC19400310vB = new InterfaceC19400310vB() { // from class: X.10qs
            @Override // X.InterfaceC19400310vB
            public final void LJIILJJIL() {
                this.LIZ.NR("normal_search");
            }

            @Override // X.InterfaceC19400310vB
            public final void LJIILL() {
                if (this.LIZ.getActivity() != null && ((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZIZ(this.LIZ.getActivity())) {
                    C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ);
                    c1389890mGx.LJIIJ(this.LIZ.getString(2131832497));
                    c1389890mGx.LJIIJJI();
                    return;
                }
                C20684815ws.LJIJI("qr_code_scan_enter", new Pair("discovery", "enter_from"));
                Context context = this.LIZ.getContext();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - DiscoverAndSearchFragment.LLJJLIIIJLLLLLLLZ >= 1000) {
                    DiscoverAndSearchFragment.LLJJLIIIJLLLLLLLZ = jElapsedRealtime;
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//aweme/scan");
                    smartRouteBuildRoute.withParam("finishAfterScan", false);
                    smartRouteBuildRoute.open();
                }
            }
        };
        ViewOnClickListenerC19400210vA viewOnClickListenerC19400210vA7 = this.LLJILJIL;
        if (viewOnClickListenerC19400210vA7 != null) {
            viewOnClickListenerC19400210vA7.setOnInternalClickListener(interfaceC19400310vB);
        }
        ViewOnClickListenerC19400210vA viewOnClickListenerC19400210vA8 = this.LLJILJILJ;
        if (viewOnClickListenerC19400210vA8 != null) {
            viewOnClickListenerC19400210vA8.setOnInternalClickListener(interfaceC19400310vB);
        }
        View viewFindViewById = viewLIZLLL.findViewById(R.id.f677bn3);
        C786410Ut5.Q7(this.LLJILLL, new ACListenerS163S0100000_29(this, 325));
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS163S0100000_29(this, 326), viewFindViewById);
            if (MR()) {
                C786410Ut5.LJZI(8, this.LLJILLL);
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            } else if (!MR()) {
                C786410Ut5.LJZI(0, this.LLJILLL);
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            } else {
                C786410Ut5.LJZI(8, this.LLJILLL);
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            }
            if (MR()) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLJIJIL.getLayoutParams();
                int iLIZJ = (int) C12ES.LIZJ(16.0f, getContext());
                marginLayoutParams.leftMargin = iLIZJ;
                marginLayoutParams.setMarginStart(iLIZJ);
                marginLayoutParams.setMarginEnd(0);
                C786410Ut5.a6(this.LLJIJIL, marginLayoutParams);
            }
            if (C10EU.LJIIIIZZ()) {
                View view = this.LLJJ;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
                if (this.LLJIJIL != null && getContext() != null) {
                    ViewGroup.LayoutParams layoutParams = this.LLJIJIL.getLayoutParams();
                    if (layoutParams instanceof LinearLayout.LayoutParams) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams2.rightMargin = (int) C12ES.LIZJ(16.0f, getContext());
                        layoutParams2.leftMargin = (int) C12ES.LIZJ(16.0f, getContext());
                        int iLIZJ2 = (int) C12ES.LIZJ(16.0f, getContext());
                        layoutParams2.setMarginEnd(iLIZJ2);
                        layoutParams2.setMarginStart(iLIZJ2);
                        C786410Ut5.a6(this.LLJIJIL, layoutParams);
                    }
                }
            }
            C19GS c19gs = null;
            viewLIZLLL.setBackground(null);
            View viewFindViewById2 = this.LL;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.viewpager);
                } else {
                    viewFindViewById2 = null;
                }
                this.LL = (C527310Km9) viewFindViewById2;
            }
            if (viewFindViewById2 != null) {
                viewFindViewById2.setBackground(null);
            }
            C19U1 c19u1 = this.LLJJIII;
            if (c19u1 != null) {
                c19u1.setBackground(null);
            }
            try {
                ViewTreeLifecycleOwner.set(viewLIZLLL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZLLL, this);
                viewLIZLLL.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
                C189200o6.m2constructorimpl(Unit.LIZ);
                return viewLIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZLLL;
            }
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
