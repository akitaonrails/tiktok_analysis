package com.ss.android.ugc.aweme.main;

import X.AbstractC1591090rVT;
import X.AbstractC1591940rWq;
import X.AbstractC738140SxQ;
import X.AnonymousClass0658;
import X.C01GW;
import X.C04R9;
import X.C08TN;
import X.C098200Yq;
import X.C0BTQ;
import X.C0C64;
import X.C0CAU;
import X.C0CM3;
import X.C0CMJ;
import X.C0CN5;
import X.C0DMM;
import X.C0PEM;
import X.C0QSJ;
import X.C0RHA;
import X.C0RUE;
import X.C0S4U;
import X.C0S78;
import X.C0SSZ;
import X.C0X35;
import X.C1022290ci3;
import X.C1058560deY;
import X.C1074300e3w;
import X.C10R5;
import X.C10RS;
import X.C1150504el;
import X.C1156604fk;
import X.C12WP;
import X.C1395900mQe;
import X.C13LE;
import X.C1440005kM;
import X.C1483410ohn;
import X.C14EU;
import X.C14K9;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1563220qmW;
import X.C1563270qmb;
import X.C1570950qyz;
import X.C1571030qz7;
import X.C1581670rGH;
import X.C1581770rGR;
import X.C1582020rGq;
import X.C1584420rKi;
import X.C1586450rNz;
import X.C1590250rU7;
import X.C1590260rU8;
import X.C1590290rUB;
import X.C1591880rWk;
import X.C1591930rWp;
import X.C1592370rXX;
import X.C1620960sHe;
import X.C1685300txQ;
import X.C1886700zCG;
import X.C189200o6;
import X.C1906380zi0;
import X.C1906490ziB;
import X.C1906580ziK;
import X.C19252910Tv;
import X.C197011126f;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C2277881EDy;
import X.C23250099c;
import X.C2419309dv;
import X.C258530ABf;
import X.C285030BFd;
import X.C285090BFj;
import X.C297720Bli;
import X.C297740Blk;
import X.C312240CLu;
import X.C343710Ddh;
import X.C452501pT;
import X.C486860J7k;
import X.C581760Mrm;
import X.C673150Qan;
import X.C680080Qly;
import X.C687700QyG;
import X.C723850SaN;
import X.C724240Sb0;
import X.C736510Sun;
import X.C740360T2k;
import X.C755980Tl6;
import X.C786410Ut5;
import X.EnumC1589930rTb;
import X.InterfaceC1055110dYz;
import X.InterfaceC1146704e9;
import X.InterfaceC1570850qyp;
import X.InterfaceC1583770rJf;
import X.InterfaceC1585190rLx;
import X.InterfaceC1586360rNq;
import X.InterfaceC1586410rNv;
import X.InterfaceC1590350rUH;
import X.InterfaceC1590360rUI;
import X.InterfaceC1593550rZR;
import X.InterfaceC1594010raB;
import X.InterfaceC1618570sDn;
import X.InterfaceC1906520ziE;
import X.InterfaceC20622815ms;
import X.InterfaceC214930199k;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import Y.ARunnableS111S0100000_11;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS128S0100000_28;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hox.Hox;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageSocialAbility;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import com.ss.android.ugc.aweme.popup.HomePageFragChangeObserver;
import com.ss.android.ugc.aweme.popup.HomePageFragChangeObserver$observeFragChange$1;
import com.ss.android.ugc.aweme.reddot.RedDotService;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.scope.MainPageFragmentScope;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
public final class MainPageFragment extends CommonPageFragment implements InterfaceC1055110dYz, InterfaceC1586360rNq, InterfaceC1586410rNv, InterfaceC1618570sDn, C0QSJ, InterfaceC1146704e9 {
    public static final C1156604fk LLJLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public static final C01GW<IUnKnownOwnershipBusinessOuterService> LLJZ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2HELIOSZigtICF9BSQlJx8yLyAKOy40JSAiPQ==";
    public final C01GW LL;
    public View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public int LLILZIL;
    public AbstractC1591090rVT LLILZLL;
    public View LLIZ;
    public TabChangeManager LLIZLLLIL;
    public ScrollSwitchStateManager LLJ;
    public HomePageDataViewModel LLJI;
    public AdHomePageDataVM LLJIJIL;
    public boolean LLJILJIL;
    public MainAnimViewModel LLJILJILJ;
    public final InterfaceC1590350rUH LLJILLL;
    public InterfaceC1590360rUI LLJJ;
    public boolean LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final boolean LLJJJ;
    public boolean LLJJJIL;
    public String LLJJJJ;
    public WeakReference<Fragment> LLJJJJJIL;
    public final C1570950qyz LLJJJJLIIL;
    public final String LLJJL;
    public volatile MainPageBusinessAbility LLJJLIIIJLLLLLLLZ;
    public volatile MainBusinessAbility LLJL;
    public MainPageSocialAbility LLJLIL;
    public InterfaceC665370Q7z LLJLILLLLZIIL;
    public C0QSJ LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MainPageFragment.class, "mainPageBusinessAbility", "getMainPageBusinessAbility()Lcom/ss/android/ugc/aweme/base/mainpagefragment/MainPageBusinessAbility;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(MainPageFragment.class, "mainBusinessAbility", "getMainBusinessAbility()Lcom/ss/android/ugc/aweme/base/MainBusinessAbility;", 0)};
        LLJLLIL = new C1156604fk();
        LLJZ = C452501pT.LIZIZ(new C1590260rU8());
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == MainPageSocialAbility.class) {
            this.LLJLIL = (MainPageSocialAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class, MainPageFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == MainPageSocialAbility.class) {
            return this.LLJLIL;
        }
        return null;
    }

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        arrayList.add(MainPageFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainPageFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == MainPageSocialAbility.class) {
            this.LLJLIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final View OR() {
        C1592370rXX c1592370rXXLIZ;
        View view = this.LLILLL;
        if (view == null) {
            return null;
        }
        return (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLLIIII() && (c1592370rXXLIZ = C1395900mQe.LIZ(view)) != null) ? c1592370rXXLIZ : view;
    }

    public final C0QSJ PR() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJLL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJLILLLLZIIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJLILLLLZIIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
        this.LLJLL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final MainBusinessAbility RR() {
        MainBusinessAbility mainBusinessAbility = this.LLJL;
        if (mainBusinessAbility == null) {
            synchronized (this) {
                mainBusinessAbility = this.LLJL;
                if (mainBusinessAbility == null) {
                    C0QSJ c0qsjPR = PR();
                    MainBusinessAbility mainBusinessAbility2 = c0qsjPR != null ? (MainBusinessAbility) c0qsjPR.getAbility(MainBusinessAbility.class) : null;
                    this.LLJL = mainBusinessAbility2;
                    return mainBusinessAbility2;
                }
            }
        }
        return mainBusinessAbility;
    }

    public final MainPageBusinessAbility SR() {
        MainPageBusinessAbility mainPageBusinessAbility = this.LLJJLIIIJLLLLLLLZ;
        if (mainPageBusinessAbility == null) {
            synchronized (this) {
                mainPageBusinessAbility = this.LLJJLIIIJLLLLLLLZ;
                if (mainPageBusinessAbility == null) {
                    C0QSJ c0qsjPR = PR();
                    MainPageBusinessAbility mainPageBusinessAbility2 = c0qsjPR != null ? (MainPageBusinessAbility) c0qsjPR.getAbility(MainPageBusinessAbility.class) : null;
                    this.LLJJLIIIJLLLLLLLZ = mainPageBusinessAbility2;
                    return mainPageBusinessAbility2;
                }
            }
        }
        return mainPageBusinessAbility;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0qyz] */
    public MainPageFragment() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1590290rUB());
        this.LL = c01gwLIZIZ;
        this.LLJILLL = ((IHomePageService) c01gwLIZIZ.getValue()).LJIJ();
        this.LLJJI = true;
        this.LLJJIII = C452501pT.LIZIZ(new C1590250rU7());
        this.LLJJIJI = C452501pT.LIZIZ(new C1571030qz7());
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 721));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 720));
        SAFHelper.LIZ.getClass();
        this.LLJJJ = SAFHelper.LJIIJ();
        this.LLJJJJLIIL = new Observer() { // from class: X.0qyz
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                boolean z;
                NoticeAbility noticeAbility;
                InterfaceC665370Q7z interfaceC665370Q7zWR;
                NoticeAbility noticeAbility2;
                C740360T2k c740360T2k = (C740360T2k) obj;
                MainPageFragment mainPageFragment = this.LL;
                if (c740360T2k.LIZ != 4 && !C1030680cva.LJIJ(c740360T2k.LIZIZ)) {
                    z = true;
                } else {
                    z = false;
                }
                mainPageFragment.LLJILJIL = z;
                MainPageFragment mainPageFragment2 = this.LL;
                if (mainPageFragment2.LLJILJIL && (interfaceC665370Q7zWR = mainPageFragment2.WR()) != null && (noticeAbility2 = (NoticeAbility) C1558520qew.LIZ(interfaceC665370Q7zWR, NoticeAbility.class, null)) != null) {
                    noticeAbility2.EF();
                }
                InterfaceC665370Q7z interfaceC665370Q7zWR2 = this.LL.WR();
                if (interfaceC665370Q7zWR2 != null && (noticeAbility = (NoticeAbility) C1558520qew.LIZ(interfaceC665370Q7zWR2, NoticeAbility.class, null)) != null) {
                    noticeAbility.Ec0(this.LL.LLJILJIL);
                }
                Aweme aweme = c740360T2k.LIZIZ;
                int i = c740360T2k.LIZ;
                MainPageFragment mainPageFragment3 = this.LL;
                C1030680cva.LJIILJJIL(aweme, i, mainPageFragment3.LLILLJJLI, mainPageFragment3.OR());
            }
        };
        this.LLJJL = "page_feed";
    }

    public final Aweme LJIIIIZZ() {
        MainActivityScope mainActivityScopeLIZJ;
        MainBusinessAbility mainBusinessAbilityLIZIZ;
        if (C297720Bli.LIZ()) {
            mainBusinessAbilityLIZIZ = RR();
        } else {
            C19EG activity = getActivity();
            if (activity == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(activity)) == null) {
                return null;
            }
            mainBusinessAbilityLIZIZ = C1058560deY.LIZIZ(mainActivityScopeLIZJ);
        }
        if (mainBusinessAbilityLIZIZ != null) {
            return mainBusinessAbilityLIZIZ.LJIIIIZZ();
        }
        return null;
    }

    public final MainPageBusinessAbility MR() {
        if (C297720Bli.LIZ()) {
            return SR();
        }
        InterfaceC665370Q7z interfaceC665370Q7zWR = WR();
        if (interfaceC665370Q7zWR != null) {
            return (MainPageBusinessAbility) C1558520qew.LIZ(interfaceC665370Q7zWR, MainPageBusinessAbility.class, null);
        }
        return null;
    }

    public final void NR() {
        if (C297740Blk.LIZ()) {
            C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 134), 3);
        } else {
            C723850SaN.LIZ(this, false, null, new C1563220qmW(this), 3);
        }
        long j = C285030BFd.LIZ;
        if (j != -1) {
            C0CN5.LIZJ(Long.valueOf(j), new ARunnableS111S0100000_11(this, 40), false);
        } else {
            C723850SaN.LIZ(this, false, null, new C0RUE(this), 3);
        }
    }

    public final void UR() {
        C19EG activity;
        View viewFindViewById;
        C19EG activity2 = getActivity();
        if (activity2 == null || Build.VERSION.SDK_INT < 35 || !C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLLIIII() || activity2.getResources().getConfiguration().orientation != 2 || (activity = getActivity()) == null || (viewFindViewById = activity.findViewById(R.id.navigationBarBackground)) == null || viewFindViewById.getVisibility() == 4) {
            return;
        }
        C786410Ut5.LJLLLLLL(4, viewFindViewById);
    }

    public final InterfaceC665370Q7z WR() {
        if (getFragmentManager() == null) {
            return null;
        }
        return C1558360qeg.LJFF(this, null);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        NavigationScene navigationScene;
        super.onDestroy();
        if (!this.LLJJJ || (navigationScene = ((InterfaceC20622815ms) getActivity()).getNavigationScene()) == null) {
            return;
        }
        Object value = this.LLJJIJIL.getValue();
        C12WP.LIZ();
        ((ArrayList) navigationScene.LLJJL).remove(value);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AbstractC1591090rVT abstractC1591090rVT;
        super.onDestroyView();
        InterfaceC1590360rUI interfaceC1590360rUI = this.LLJJ;
        if (interfaceC1590360rUI != null) {
            interfaceC1590360rUI.onDestroyView();
        }
        C197011126f c197011126fLJIIIIZZ = C197011126f.LJIIIIZZ();
        if (c197011126fLJIIIIZZ.LLILLL != null) {
            c197011126fLJIIIIZZ.LLILLL = null;
        }
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O4(false).onDestroy();
        if (((Boolean) C285090BFj.LJJIJIIJIL.getValue()).booleanValue()) {
            EventBus.LIZLLL().LJJI(this);
            ((Handler) this.LLJJIJI.getValue()).removeCallbacks((Runnable) this.LLJJIJIIJIL.getValue());
        }
        if (((Number) C258530ABf.LIZ.getValue()).intValue() == 1 && (abstractC1591090rVT = this.LLILZLL) != null) {
            abstractC1591090rVT.LJJIIZ(this);
        }
        this.LLJILLL.onDestroyView();
        RedDotService.LIZ.getClass();
        RedDotService redDotServiceLIZ = C04R9.LIZ();
        if (redDotServiceLIZ != null) {
            redDotServiceLIZ.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainPageFragment.onResume():void");
    }

    @Override // X.InterfaceC1618570sDn
    public final void Db(boolean z) {
        MainPageBusinessAbility mainPageBusinessAbilityMR = MR();
        if (mainPageBusinessAbilityMR != null) {
            mainPageBusinessAbilityMR.Db(z);
        }
    }

    public final void VR(Bundle bundle) {
        MutableLiveData<String> mutableLiveData;
        if (!isAdded()) {
            return;
        }
        String strHQ2 = Hox.LLJILJIL.LIZ(requireActivity()).HQ2(this.LLJJL);
        if (Intrinsics.LJFF(bundle.getString("fromStart", ""), "RootNode") || bundle.getBoolean(strHQ2)) {
            TabAlphaController tabAlphaControllerLIZ = C1586450rNz.LIZ();
            if (tabAlphaControllerLIZ != null) {
                tabAlphaControllerLIZ.LJ(true);
            }
            C19EG c19egRequireActivity = requireActivity();
            C2277881EDy.LIZIZ.preloadProfile(requireActivity(), this.LLJJL);
            C1440005kM.LIZ(new C0RHA(true));
            TextUtils.isEmpty(C736510Sun.LIZ);
            HomePageDataViewModel homePageDataViewModel = this.LLJI;
            if (homePageDataViewModel != null && !homePageDataViewModel.LLJILLL && LJIIIIZZ() != null && (c19egRequireActivity instanceof MainActivity)) {
                Aweme awemeLJIIIIZZ = LJIIIIZZ();
                Context context = getContext();
                IAdSceneService iAdSceneService = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
                if (iAdSceneService != null && iAdSceneService.LIZIZ() != null) {
                    C1022290ci3.LJIIJ(context, awemeLJIIIIZZ);
                }
            }
            MainAnimViewModel mainAnimViewModel = this.LLJILJILJ;
            if (mainAnimViewModel != null && (mutableLiveData = mainAnimViewModel.LLILLL) != null) {
                mutableLiveData.setValue(this.LLJJL);
            }
            MainPageBusinessAbility mainPageBusinessAbilityMR = MR();
            if (mainPageBusinessAbilityMR != null) {
                mainPageBusinessAbilityMR.OK0();
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        C1558360qeg.LIZIZ(this, null);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AbstractC1591090rVT abstractC1591090rVT;
        super.onConfigurationChanged(configuration);
        C19EG activity = getActivity();
        if (activity != null && (abstractC1591090rVT = this.LLILZLL) != null) {
            abstractC1591090rVT.LJJIIJZLJL(activity, configuration);
        }
        this.LLILZIL = 0;
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS124S0100000_24(this, 40));
        }
        AssemSupervisor assemSupervisorLIZJ = C724240Sb0.LIZJ(this);
        if (assemSupervisorLIZJ != null && (copyOnWriteArrayList = assemSupervisorLIZJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC1570850qyp) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1570850qyp) it2.next()).N5();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NavigationScene navigationScene;
        super.onCreate(bundle);
        if (this.LLJJJ && (navigationScene = ((InterfaceC20622815ms) getActivity()).getNavigationScene()) != null) {
            navigationScene.LLLIIIIL(this, (InterfaceC214930199k) this.LLJJIJIL.getValue());
        }
        C723850SaN.LIZ(this, false, null, new C1563270qmb(this), 3);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C19EG c19egRequireActivity = requireActivity();
        if (c19egRequireActivity != null && childFragmentManager != null) {
            childFragmentManager.LJZL(new C1581670rGH(c19egRequireActivity), false);
        }
        C0S78.LJ(true, AFwS213S0000000_24.get$arr$(220));
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        String strHQ2 = Hox.LLJILJIL.LIZ(getActivity()).HQ2(this.LLJJL);
        if (Intrinsics.LJFF(bundle.getString("fromStart", ""), "RootNode") || bundle.getBoolean(strHQ2)) {
            TabAlphaController tabAlphaControllerLIZ = C1586450rNz.LIZ();
            if (tabAlphaControllerLIZ != null) {
                tabAlphaControllerLIZ.LJ(false);
            }
            C581760Mrm.LIZIZ = false;
            C1150504el.LIZ().LJIILJJIL(EnumC1589930rTb.MAINPAGE_HIDE);
            C1150504el.LIZ().LJIIIIZZ = false;
            C1483410ohn.LJLJJI().LIZ();
            C755980Tl6.LIZ().LIZLLL();
            MainPageBusinessAbility mainPageBusinessAbilityMR = MR();
            if (mainPageBusinessAbilityMR != null) {
                mainPageBusinessAbilityMR.Vw();
            }
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        if (C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 2, "downgrade_main_page_on_node_show", true) == 1) {
            C0CM3 c0cm3 = new C0CM3();
            c0cm3.LIZIZ = true;
            c0cm3.LIZJ = C0CMJ.HIGH_PRIORITY.getType();
            c0cm3.LJI = new AwS425S0200000_24(this, bundle, 24);
            C312240CLu.LIZ(c0cm3);
            return;
        }
        VR(bundle);
    }

    @C14EU
    public final void onRenderFirstFrame(C1584420rKi c1584420rKi) {
        if (((Boolean) C285090BFj.LJJIJIIJIL.getValue()).booleanValue()) {
            ((Handler) this.LLJJIJI.getValue()).removeCallbacks((Runnable) this.LLJJIJIIJIL.getValue());
            if (this.LLIZ != null) {
                NR();
            }
        }
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        this.LLJILLL.LIZJ(this, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.0rJf, X.0rZn] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        Lifecycle lifecycle;
        HomeTabAbility homeTabAbilityLIZ;
        MutableLiveData<C740360T2k> mutableLiveData;
        View viewOR;
        AbstractC1591090rVT abstractC1591090rVT;
        C1591930rWp c1591930rWp;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams marginLayoutParams;
        ViewGroup viewGroup2;
        C0X35.LIZ("cold_boot_mainpage_fragment_view_created", true);
        super.onViewCreated(view, bundle);
        C08TN.LIZ().LJ("mainpage_fragment_apply_assem", false);
        if (!((Boolean) C285090BFj.LJJIJIIJIL.getValue()).booleanValue() || C0CN5.LJII()) {
            NR();
        } else {
            C786410Ut5.LJLIIL(2500L, (Handler) this.LLJJIJI.getValue(), (Runnable) this.LLJJIJIIJIL.getValue());
            EventBus.LIZLLL().LJIJJ(this);
        }
        C08TN.LIZ().LJI("mainpage_fragment_apply_assem");
        C08TN.LIZ().LJ("mainpage_fragment_assem_to_page", false);
        C10R5 c10r5 = C10R5.LJIIIIZZ;
        C10RS.LIZ().LJFF("MainPageFragment onViewCreated");
        C19EG activity = getActivity();
        this.LLJILJILJ = (MainAnimViewModel) ViewModelProviders.of(activity).get(MainAnimViewModel.class);
        this.LLIZ = view;
        this.LLILLJJLI = view.findViewById(com.zhiliaoapp.musically.R.id.ch9);
        View viewFindViewById = this.LLIZ.findViewById(com.zhiliaoapp.musically.R.id.nwe);
        if ((viewFindViewById instanceof C1591930rWp) && (c1591930rWp = (C1591930rWp) viewFindViewById) != null && C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLLIIII()) {
            ViewParent parent = c1591930rWp.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null && !(viewGroup instanceof C1592370rXX) && viewGroup.findViewById(com.zhiliaoapp.musically.R.id.wzh) == null) {
                ViewGroup.LayoutParams layoutParams = c1591930rWp.getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((FrameLayout.LayoutParams) layoutParams);
                    layoutParams2.width = -1;
                    layoutParams2.leftMargin = 0;
                    layoutParams2.rightMargin = 0;
                    marginLayoutParams = layoutParams2;
                } else {
                    marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, layoutParams.height);
                }
                int iIndexOfChild = viewGroup.indexOfChild(c1591930rWp);
                C786410Ut5.LJJJLZIJ(c1591930rWp, viewGroup);
                C1592370rXX c1592370rXX = new C1592370rXX(c1591930rWp.getContext());
                c1592370rXX.setId(com.zhiliaoapp.musically.R.id.wzh);
                viewGroup.addView(c1592370rXX, iIndexOfChild, marginLayoutParams);
                if (c1592370rXX.LLILZIL == c1591930rWp && c1591930rWp.getParent() == c1592370rXX.LLILLJJLI) {
                    c1592370rXX.LIZJ();
                    c1592370rXX.LIZ();
                } else {
                    c1592370rXX.LLILZIL = c1591930rWp;
                    ViewParent parent2 = c1591930rWp.getParent();
                    if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
                        C786410Ut5.LJJJLZIJ(c1591930rWp, viewGroup2);
                    }
                    C786410Ut5.LJJJJIZL(c1592370rXX.LLILLJJLI);
                    c1592370rXX.LLILLJJLI.addView(c1591930rWp, new FrameLayout.LayoutParams(-1, -1, 80));
                    c1592370rXX.LIZJ();
                    c1592370rXX.LIZ();
                }
                viewFindViewById = c1591930rWp;
            }
        }
        this.LLILLL = viewFindViewById;
        if (Build.VERSION.SDK_INT >= 35) {
            View viewFindViewById2 = activity.findViewById(R.id.statusBarBackground);
            if (viewFindViewById2 != null) {
                C786410Ut5.LJLLLLLL(4, viewFindViewById2);
            }
            View viewFindViewById3 = activity.findViewById(R.id.navigationBarBackground);
            if (viewFindViewById3 != null) {
                C786410Ut5.LJLLLLLL(4, viewFindViewById3);
            }
            this.LLILZ = activity.findViewById(com.zhiliaoapp.musically.R.id.gdp);
            C14K9.LJIJJ(view, new C1620960sHe(this, 1));
        }
        this.LLILZLL = C1591880rWk.LIZIZ.LJIL((AbstractC1591940rWq) this.LLILLL);
        this.LLIZLLLIL = C343710Ddh.LIZ(activity);
        this.LLJI = C680080Qly.LIZIZ(activity);
        this.LLJ = C486860J7k.LIZIZ(activity);
        this.LLJIJIL = C1074300e3w.LIZ(activity);
        this.LLJJ = ((IUnKnownOwnershipBusinessOuterService) this.LLJJIII.getValue()).LJJIIJZLJL(activity, new C1581770rGR(this));
        this.LLJILLL.LIZIZ(this, view);
        C08TN.LIZ().LJI("mainpage_fragment_assem_to_page");
        C08TN.LIZ().LJ("mainpage_fragment_init_page", false);
        boolean zLJI = MethodIDManager.LJI(71910);
        this.LLILLJJLI = this.LLIZ.findViewById(com.zhiliaoapp.musically.R.id.ch9);
        ((IHomePageService) this.LL.getValue()).LJIILL(getActivity()).YF(this.LLILZLL);
        C19EG activity2 = getActivity();
        if (activity2 != null && (abstractC1591090rVT = this.LLILZLL) != null) {
            abstractC1591090rVT.LJIIIZ(activity2, this.LLILZ);
        }
        TabAlphaController tabAlphaControllerLIZ = C1586450rNz.LIZ();
        if (tabAlphaControllerLIZ != null && ((viewOR = OR()) != null || (viewOR = this.LLILLL) != null)) {
            tabAlphaControllerLIZ.LL = viewOR;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        C08TN.LIZ().LJI("mainpage_fragment_init_page");
        C08TN.LIZ().LJ("mainpage_fragment_page_to_end", false);
        ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LIZ(this);
        C19EG activity3 = getActivity();
        if (activity3 != null) {
            DataCenter.vQ2(ViewModelProviders.of(activity3), this).yQ2("onNewIntent", new Observer() { // from class: X.0qyl
                /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0126 A[Catch: Exception -> 0x019c, TryCatch #1 {Exception -> 0x019c, blocks: (B:6:0x0011, B:10:0x0029, B:14:0x003b, B:16:0x006e, B:18:0x0074, B:19:0x0082, B:27:0x0096, B:29:0x009c, B:31:0x00a2, B:33:0x00a8, B:35:0x00ae, B:37:0x00bd, B:39:0x00cb, B:40:0x00cf, B:42:0x00d9, B:43:0x00dc, B:45:0x00e2, B:47:0x00e8, B:49:0x00fa, B:51:0x00fe, B:53:0x0104, B:58:0x0119, B:59:0x011e, B:61:0x0126, B:63:0x012c, B:65:0x013d, B:67:0x0143, B:69:0x015c, B:71:0x0164, B:72:0x0168, B:74:0x016c, B:76:0x0174, B:78:0x0180, B:80:0x0186, B:83:0x018d, B:85:0x0193, B:54:0x0109, B:56:0x010f, B:23:0x008d, B:9:0x0025, B:21:0x0087, B:7:0x001f), top: B:105:0x0011, inners: #0, #2 }] */
                @Override // androidx.lifecycle.Observer
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onChanged(java.lang.Object r14) {
                    /*
                        Method dump skipped, instruction units count: 481
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1570810qyl.onChanged(java.lang.Object):void");
                }
            }, true);
        }
        View view2 = this.LLIZ;
        if (view2 instanceof ViewGroup) {
            new WeakReference(view2);
        }
        AdHomePageDataVM adHomePageDataVM = this.LLJIJIL;
        if (adHomePageDataVM != null && (mutableLiveData = adHomePageDataVM.LLILLJJLI) != null) {
            mutableLiveData.observe(this, this.LLJJJJLIIL);
        }
        HomePageFragChangeObserver homePageFragChangeObserver = HomePageFragChangeObserver.LIZ;
        final C19EG c19egRequireActivity = requireActivity();
        homePageFragChangeObserver.getClass();
        if (c19egRequireActivity != null) {
            final Hox hoxLIZ = Hox.LLJILJIL.LIZ(c19egRequireActivity);
            ?? r10 = new InterfaceC1583770rJf() { // from class: X.0rZn
                /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
                @Override // X.InterfaceC1583770rJf
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void A4(java.lang.String r8, java.lang.String r9) {
                    /*
                        Method dump skipped, instruction units count: 213
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1593770rZn.A4(java.lang.String, java.lang.String):void");
                }
            };
            hoxLIZ.vQ2(r10);
            IMainSAFLifecycleKt.requireMainSAFLifecycle(c19egRequireActivity, null, false).getLifecycle().addObserver(new HomePageFragChangeObserver$observeFragChange$1(hoxLIZ, r10));
            MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19egRequireActivity);
            if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                homeTabAbilityLIZ.Ss2(new InterfaceC1585190rLx() { // from class: X.0qyf
                    @Override // X.InterfaceC1585190rLx
                    public final void p1(String str, String str2) throws JSONException {
                        Object c098200Yq;
                        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
                        String[] strArr = {"page_profile", "profile_fake_child", "page_camera", "page_sidebar"};
                        boolean z = true;
                        if (C13LQ.LJJIJIIJI(str, strArr) < 0 && C13LQ.LJJIJIIJI(str2, strArr) < 0) {
                            z = false;
                        }
                        String str3 = null;
                        Object obj = null;
                        if (z) {
                            C1584320rKY.LIZ.getClass();
                            C1584320rKY.LJFF = C1584320rKY.LJ;
                            C1584320rKY.LJ = null;
                            return;
                        }
                        C1584320rKY c1584320rKY = C1584320rKY.LIZ;
                        C19EG c19eg = c19egRequireActivity;
                        c1584320rKY.getClass();
                        Pair pairLIZIZ = C1584320rKY.LIZIZ(c19eg, str2);
                        if (str != null) {
                            try {
                                Fragment fragmentKi = hoxLIZ.Ki(str);
                                if (fragmentKi != null && (iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(fragmentKi)) != null) {
                                    c098200Yq = iFeedPanelPlatformAbilityLIZJ.xy2();
                                } else {
                                    c098200Yq = null;
                                }
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                                obj = c098200Yq;
                            }
                            str3 = (String) obj;
                        }
                        C1584320rKY c1584320rKY2 = C1584320rKY.LIZ;
                        String str4 = (String) pairLIZIZ.getFirst();
                        boolean zBooleanValue = ((Boolean) pairLIZIZ.getSecond()).booleanValue();
                        C19EG c19eg2 = c19egRequireActivity;
                        c1584320rKY2.getClass();
                        C1584320rKY.LIZJ(str, str2, str3, str4, zBooleanValue, c19eg2);
                    }
                });
            }
        }
        C1906380zi0 c1906380zi0 = C1906380zi0.LIZ;
        final C19EG c19egRequireActivity2 = requireActivity();
        c1906380zi0.getClass();
        if (C0BTQ.LIZ()) {
            C786410Ut5.LJJZZIII(C0CAU.LIZ, new Runnable() { // from class: X.0zi6
                public final void LIZ() {
                    HomeTabAbility homeTabAbilityLIZ2;
                    final C1906500ziC c1906500ziC = new C1906500ziC();
                    C823050WQl.LJFF().submit(new Runnable() { // from class: X.0zi7
                        public final void LIZ() {
                            try {
                                String string = C1906530ziF.LIZ().getString("bubble_jump_key", "");
                                String string2 = C1906530ziF.LIZ().getString("bubble_tab_key", "");
                                C1906530ziF.LIZ().storeString("bubble_jump_key", "");
                                C1906530ziF.LIZ().storeString("bubble_tab_key", "");
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("getSaveBubbleInfo, jumpCache = ");
                                sbLIZ.append(string);
                                sbLIZ.append(", tabCache = ");
                                sbLIZ.append(string2);
                                C2188811AlT.LIZIZ(sbLIZ);
                                ArrayList arrayList = new ArrayList();
                                if (C123100dR.LIZ(string)) {
                                    arrayList.add(C09C2.LIZ().LJII(string, C1906370zhz.class));
                                }
                                if (C123100dR.LIZ(string2)) {
                                    arrayList.add(C09C2.LIZ().LJII(string2, C1906370zhz.class));
                                }
                                if (!arrayList.isEmpty()) {
                                    c1906500ziC.invoke(arrayList);
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("getSaveBubbleInfo exception: ");
                                sbLIZ2.append(e);
                                C2188811AlT.LIZIZ(sbLIZ2);
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("BubbleStayTimeCache@3af3.getSaveBubbleInfo$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("BubbleStayTimeCache@3af3.getSaveBubbleInfo$1");
                        }
                    });
                    MainActivityScope mainActivityScopeLIZJ2 = C0S4U.LIZJ(c19egRequireActivity2);
                    if (mainActivityScopeLIZJ2 != null && (homeTabAbilityLIZ2 = C0DMM.LIZ(mainActivityScopeLIZJ2)) != null) {
                        homeTabAbilityLIZ2.Ss2(new InterfaceC1585190rLx(C1906380zi0.LIZ) { // from class: X.0zi1
                            public final C1906380zi0 LL;

                            {
                                this.LL = c1906380zi0;
                            }

                            @Override // X.InterfaceC1585190rLx
                            public final void p1(String str, String str2) throws JSONException {
                                this.LL.getClass();
                                C1584320rKY.LIZ.getClass();
                                EnumC1584360rKc enumC1584360rKcLJIIIIZZ = C1584320rKY.LJIIIIZZ(str2);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onTabChange, from:");
                                sbLIZ.append(str);
                                sbLIZ.append(", to:");
                                sbLIZ.append(str2);
                                sbLIZ.append(", tabName:");
                                String key = null;
                                if (enumC1584360rKcLJIIIIZZ != null) {
                                    key = enumC1584360rKcLJIIIIZZ.getKey();
                                }
                                sbLIZ.append(key);
                                C2188811AlT.LIZIZ(sbLIZ);
                                if (enumC1584360rKcLJIIIIZZ != null) {
                                    C1906380zi0 c1906380zi02 = C1906380zi0.LIZ;
                                    c1906380zi02.getClass();
                                    C1906370zhz c1906370zhzLIZIZ = C1906380zi0.LIZIZ(enumC1584360rKcLJIIIIZZ);
                                    if (c1906370zhzLIZIZ != null && c1906370zhzLIZIZ.LJ == EnumC1619300sEy.SWITCH_TAB && c1906370zhzLIZIZ.LIZIZ()) {
                                        EnumC1905820zh6 enumC1905820zh6 = EnumC1905820zh6.CLICK_TOOLTIPS_POSITION;
                                        c1906380zi02.getClass();
                                        C1906380zi0.LIZJ(enumC1584360rKcLJIIIIZZ, enumC1905820zh6, c1906370zhzLIZIZ);
                                    }
                                    C1906490ziB c1906490ziB = C1906380zi0.LIZJ;
                                    if (c1906490ziB != null) {
                                        C1906370zhz c1906370zhz = c1906490ziB.LIZJ;
                                        if (c1906370zhz != null && enumC1584360rKcLJIIIIZZ == c1906370zhz.LJIIIIZZ) {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("onEnterTab, tabName is monitoring jump page, ");
                                            sbLIZ2.append(enumC1584360rKcLJIIIIZZ);
                                            C2188811AlT.LIZIZ(sbLIZ2);
                                            return;
                                        }
                                        if (!c1906490ziB.LIZ.isEmpty()) {
                                            for (Map.Entry<EnumC1584360rKc, C1906370zhz> entry : c1906490ziB.LIZ.entrySet()) {
                                                if (entry.getKey() == enumC1584360rKcLJIIIIZZ) {
                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                    sbLIZ3.append("onEnterTab, monitorTabStayTimeInfo contains tabName, ");
                                                    sbLIZ3.append(enumC1584360rKcLJIIIIZZ);
                                                    C2188811AlT.LIZIZ(sbLIZ3);
                                                } else {
                                                    C1906370zhz value = entry.getValue();
                                                    Long lLIZ = value.LJIIIZ.LIZ();
                                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                    sbLIZ4.append("onEnterTab, finish recording: ");
                                                    sbLIZ4.append(enumC1584360rKcLJIIIIZZ);
                                                    sbLIZ4.append(", duration = ");
                                                    sbLIZ4.append(lLIZ);
                                                    C2188811AlT.LIZIZ(sbLIZ4);
                                                    if (lLIZ != null && lLIZ.longValue() < C0BTR.LIZ()) {
                                                        value.LJIIJ = lLIZ.longValue();
                                                        C1906380zi0 c1906380zi03 = C1906380zi0.LIZ;
                                                        String str3 = value.LIZ;
                                                        long jLongValue = lLIZ.longValue();
                                                        c1906380zi03.getClass();
                                                        C1906380zi0.LIZLLL(str3, jLongValue, value, false);
                                                    }
                                                    c1906490ziB.LIZ.remove(enumC1584360rKcLJIIIIZZ);
                                                    C1906380zi0.LIZ.getClass();
                                                    C1906380zi0.LJFF(enumC1584360rKcLJIIIIZZ);
                                                }
                                            }
                                        }
                                        if (c1906370zhzLIZIZ == null) {
                                            return;
                                        }
                                        if (c1906370zhzLIZIZ.LIZIZ()) {
                                            c1906490ziB.LIZ.put(enumC1584360rKcLJIIIIZZ, c1906370zhzLIZIZ);
                                            c1906370zhzLIZIZ.LJIIIZ.LIZLLL();
                                        } else {
                                            c1906490ziB.LIZ.remove(enumC1584360rKcLJIIIIZZ);
                                            C1906380zi0.LIZ.getClass();
                                            C1906380zi0.LJFF(enumC1584360rKcLJIIIIZZ);
                                        }
                                    }
                                }
                            }
                        });
                    }
                    final C1906380zi0 c1906380zi02 = C1906380zi0.LIZ;
                    AbstractC1906590ziL abstractC1906590ziLLIZJ = C1906580ziK.LIZJ();
                    abstractC1906590ziLLIZJ.LJIIJ().LJLLLLLL(new C09JN() { // from class: X.0zi2
                        @Override // X.C09JN
                        public final void accept(Object obj) throws JSONException {
                            C1906370zhz c1906370zhz;
                            C1C7U.LIZ("TabBubblePageLifecycleCallbackKt@fa1f.registerBubblePageCallbacks$1");
                            AbstractC1387200mCc abstractC1387200mCc = (AbstractC1387200mCc) obj;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onActivityResumed: ");
                            sbLIZ.append(abstractC1387200mCc.LIZ);
                            C2188811AlT.LIZIZ(sbLIZ);
                            if (abstractC1387200mCc.LIZ instanceof InterfaceC1711206n0) {
                                c1906380zi02.getClass();
                                C1906490ziB c1906490ziB = C1906380zi0.LIZJ;
                                if (c1906490ziB != null && (c1906370zhz = c1906490ziB.LIZJ) != null) {
                                    Long lLIZ = c1906370zhz.LJIIIZ.LIZ();
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("endRecordJumpPageStayTime: ");
                                    sbLIZ2.append(c1906370zhz.LJIIIIZZ);
                                    sbLIZ2.append(", duration = ");
                                    sbLIZ2.append(lLIZ);
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                    if (lLIZ != null && lLIZ.longValue() < C0BTR.LIZ() && c1906370zhz.LJIIIIZZ != null) {
                                        c1906370zhz.LJIIJ = lLIZ.longValue();
                                        C1906380zi0 c1906380zi03 = C1906380zi0.LIZ;
                                        String str = c1906370zhz.LIZ;
                                        long jLongValue = lLIZ.longValue();
                                        c1906380zi03.getClass();
                                        C1906380zi0.LIZLLL(str, jLongValue, c1906370zhz, false);
                                    }
                                    if (c1906490ziB.LIZIZ.contains(c1906370zhz.LIZ)) {
                                        if (!c1906370zhz.LJII) {
                                            C1906380zi0 c1906380zi04 = C1906380zi0.LIZ;
                                            EnumC1584360rKc enumC1584360rKc = c1906370zhz.LJIIIIZZ;
                                            c1906380zi04.getClass();
                                            C1906380zi0.LJFF(enumC1584360rKc);
                                        }
                                    } else {
                                        C1906380zi0 c1906380zi05 = C1906380zi0.LIZ;
                                        EnumC1584360rKc enumC1584360rKc2 = c1906370zhz.LJIIIIZZ;
                                        c1906380zi05.getClass();
                                        C1906380zi0.LJFF(enumC1584360rKc2);
                                    }
                                    C823050WQl.LJFF().submit(new ARunnableS128S0100000_28(EnumC1619300sEy.JUMP_NEW_PAGE, 1));
                                    c1906490ziB.LIZJ = null;
                                }
                            }
                            C1C7U.LIZIZ("TabBubblePageLifecycleCallbackKt@fa1f.registerBubblePageCallbacks$1");
                        }
                    });
                    abstractC1906590ziLLIZJ.LJI().LJLLLLLL(new C09JN() { // from class: X.0zi5
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1906370zhz c1906370zhz;
                            C1906480ziA c1906480ziA;
                            C1C7U.LIZ("TabBubblePageLifecycleCallbackKt@fa1f.registerBubblePageCallbacks$2");
                            AbstractC1387200mCc abstractC1387200mCc = (AbstractC1387200mCc) obj;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onActivityStopped: ");
                            sbLIZ.append(abstractC1387200mCc.LIZ);
                            C2188811AlT.LIZIZ(sbLIZ);
                            if ((abstractC1387200mCc.LIZ instanceof InterfaceC1711206n0) && C1906580ziK.LIZJ().LJIIZILJ().size() > 1) {
                                c1906380zi02.getClass();
                                C1906490ziB c1906490ziB = C1906380zi0.LIZJ;
                                if (c1906490ziB != null && (c1906370zhz = c1906490ziB.LIZJ) != null && (c1906480ziA = c1906370zhz.LJIIIZ) != null) {
                                    c1906480ziA.LIZLLL();
                                }
                            }
                            C1C7U.LIZIZ("TabBubblePageLifecycleCallbackKt@fa1f.registerBubblePageCallbacks$2");
                        }
                    });
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("BubbleMobHelper@cd07.init$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("BubbleMobHelper@cd07.init$1");
                }
            });
            LifecycleOwner lifecycleOwnerLJ = SAFExtensionKt.LJ(c19egRequireActivity2);
            if (lifecycleOwnerLJ != null && (lifecycle = lifecycleOwnerLJ.getLifecycle()) != null) {
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.bubble.mob.BubbleMobHelper$init$2
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        Iterator<InterfaceC1906520ziE> it2 = C1906380zi0.LIZLLL.iterator();
                        while (it2.hasNext()) {
                            it2.next().LIZJ(event);
                        }
                    }
                });
            }
            C1906380zi0.LIZIZ.clear();
            C1906380zi0.LIZJ = new C1906490ziB();
            ActivityStack.addAppBackGroundListener(C1906380zi0.LJ);
        }
        RedDotService.LIZ.getClass();
        RedDotService redDotServiceLIZ = C04R9.LIZ();
        if (redDotServiceLIZ != null) {
            redDotServiceLIZ.LJ(activity, bundle);
        }
        AssemSupervisor assemSupervisorLIZJ = C724240Sb0.LIZJ(this);
        if (assemSupervisorLIZJ != null && (copyOnWriteArrayList = assemSupervisorLIZJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC1570850qyp) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1570850qyp) it2.next()).bg(view);
            }
        }
        C1582020rGq.LIZIZ("stage_main_fragment_on_view_created");
        C08TN.LIZ().LJI("mainpage_fragment_page_to_end");
        C0X35.LJIIJJI("cold_boot_mainpage_fragment_view_created", true);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList arrayList;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        C0X35.LJIIJJI("measure_begin_to_fragment_create", true);
        C0X35.LIZ("measure_fragment_create_duration", true);
        C0X35.LIZ("cold_boot_mainpage_fragment_create_view", true);
        C0X35.LIZJ("cold_boot_main_resume_to_focus", "main_resume_mainpage_fragment");
        AssemSupervisor assemSupervisorLIZJ = C724240Sb0.LIZJ(this);
        C19GS c19gs = null;
        if (assemSupervisorLIZJ != null && (copyOnWriteArrayList = assemSupervisorLIZJ.LLJILLL) != null) {
            arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC1570850qyp) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1570850qyp) it2.next()).O9(viewGroup);
            }
        }
        View viewLIZ = this.LLJILLL.LIZ(this, layoutInflater);
        C0X35.LJIIJJI("cold_boot_mainpage_fragment_create_view", true);
        if (!(viewLIZ instanceof View)) {
            viewLIZ = null;
        }
        if (viewLIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZ, this);
                viewLIZ.setTag(com.zhiliaoapp.musically.R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZ;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C1886700zCG.LIZ(getActivity(), i, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // X.InterfaceC1586410rNv
    public final void t(String str, Fragment fragment, Fragment fragment2) throws Throwable {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        InterfaceC1594010raB interfaceC1594010raB;
        if (this.LLJJJ) {
            this.LLJJJJ = str;
            this.LLJJJJJIL = new WeakReference<>(fragment);
        }
        if (!this.LLJJJ) {
            this.LLJJJIL = true;
            AbstractC1591090rVT abstractC1591090rVT = this.LLILZLL;
            if (abstractC1591090rVT != null) {
                abstractC1591090rVT.LJJJZ(fragment, str);
            }
        } else if (this.LLJJJIL || C1906580ziK.LIZ()) {
            this.LLJJJIL = true;
            AbstractC1591090rVT abstractC1591090rVT2 = this.LLILZLL;
            if (abstractC1591090rVT2 != null) {
                abstractC1591090rVT2.LJJJZ(fragment, str);
            }
        }
        if ((fragment2 instanceof InterfaceC1593550rZR) || (fragment2 instanceof C0SSZ)) {
            fragment2.setUserVisibleHint(false);
        }
        if (fragment instanceof InterfaceC1593550rZR) {
            fragment.setUserVisibleHint(true);
        }
        if (C2277881EDy.LIZIZ.isI18nMyProfileFragment(fragment) && SharePrefCache.inst().getEnableProfileActivityLink().LIZ().booleanValue() && (interfaceC1594010raB = (InterfaceC1594010raB) C2419309dv.LIZ(getContext(), InterfaceC1594010raB.class)) != null) {
            interfaceC1594010raB.LIZLLL();
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new AnonymousClass0658(this, fragment, null), 2);
        AssemSupervisor assemSupervisorLIZJ = C724240Sb0.LIZJ(this);
        if (assemSupervisorLIZJ != null && (copyOnWriteArrayList = assemSupervisorLIZJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC1570850qyp) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1570850qyp) it2.next()).t(str, fragment, fragment2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0190  */
    @Override // X.InterfaceC1586360rNq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZLZ(java.lang.String r13, java.lang.String r14, boolean r15, boolean r16, android.os.Bundle r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainPageFragment.LLLZLZ(java.lang.String, java.lang.String, boolean, boolean, android.os.Bundle, java.lang.String):void");
    }
}
