package com.ss.android.ugc.aweme.main;

import X.C01GW;
import X.C098200Yq;
import X.C09R3;
import X.C0QSJ;
import X.C0S78;
import X.C0T39;
import X.C0X35;
import X.C1017370ca7;
import X.C1389600mGU;
import X.C13LE;
import X.C13LQ;
import X.C1558360qeg;
import X.C1581140rFQ;
import X.C1593600rZW;
import X.C1593610rZX;
import X.C1594080raI;
import X.C1594090raJ;
import X.C1594100raK;
import X.C1594110raL;
import X.C1594120raM;
import X.C1602170rnL;
import X.C1606580ruS;
import X.C1607770rwN;
import X.C1617800sCY;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20673215v0;
import X.C21390118nL;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2344809Gs;
import X.C295150BhZ;
import X.C452501pT;
import X.C497820Jfg;
import X.C665430Q8f;
import X.C687700QyG;
import X.C724220Say;
import X.C728850SiR;
import X.C960203pA;
import X.InterfaceC1146704e9;
import X.InterfaceC1593530rZP;
import X.InterfaceC214918198y;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.applog.AppLog;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.base.BackRefreshStrategyAbility;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.lancet.KtSafLancet$SAFRetainedKeysViewModel;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public class MainRootFragmentBase extends SAFTikTokFragment implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiHELIOSgtICF9BSQlJx08JzEKOy40JSAiPQ0yOyA=";
    public MainActivity LLJILLL;
    public final C01GW LLJJ = C452501pT.LIZIZ(new C1594080raI(this));
    public final C724220Say LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public boolean LLJJJ;
    public final C1594110raL LLJJJIL;
    public volatile HomePageViewPagerAbility LLJJJJ;
    public volatile BackRefreshStrategyAbility LLJJJJJIL;
    public volatile MainBusinessAbility LLJJJJLIIL;
    public InterfaceC665370Q7z LLJJL;
    public C0QSJ LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MainRootFragmentBase.class, "homePageViewPagerAbilityDI", "getHomePageViewPagerAbilityDI()Lcom/ss/android/ugc/aweme/base/HomePageViewPagerAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MainRootFragmentBase.class, "backRefreshStrategyAbilityDI", "getBackRefreshStrategyAbilityDI()Lcom/ss/android/ugc/aweme/base/BackRefreshStrategyAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(MainRootFragmentBase.class, "mainBusinessAbilityDi", "getMainBusinessAbilityDi()Lcom/ss/android/ugc/aweme/base/MainBusinessAbility;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    private C0QSJ hS() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJJLIIIJLLLLLLLZ;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
        this.LLJJLIIIJLLLLLLLZ = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final BackRefreshStrategyAbility iS() {
        BackRefreshStrategyAbility backRefreshStrategyAbility = this.LLJJJJJIL;
        if (backRefreshStrategyAbility == null) {
            synchronized (this) {
                backRefreshStrategyAbility = this.LLJJJJJIL;
                if (backRefreshStrategyAbility == null) {
                    C0QSJ c0qsjHS = hS();
                    BackRefreshStrategyAbility backRefreshStrategyAbility2 = c0qsjHS != null ? (BackRefreshStrategyAbility) c0qsjHS.getAbility(BackRefreshStrategyAbility.class) : null;
                    this.LLJJJJJIL = backRefreshStrategyAbility2;
                    return backRefreshStrategyAbility2;
                }
            }
        }
        return backRefreshStrategyAbility;
    }

    public final HomePageViewPagerAbility kS() {
        HomePageViewPagerAbility homePageViewPagerAbility = this.LLJJJJ;
        if (homePageViewPagerAbility == null) {
            synchronized (this) {
                homePageViewPagerAbility = this.LLJJJJ;
                if (homePageViewPagerAbility == null) {
                    C0QSJ c0qsjHS = hS();
                    HomePageViewPagerAbility homePageViewPagerAbility2 = c0qsjHS != null ? (HomePageViewPagerAbility) c0qsjHS.getAbility(HomePageViewPagerAbility.class) : null;
                    this.LLJJJJ = homePageViewPagerAbility2;
                    return homePageViewPagerAbility2;
                }
            }
        }
        return homePageViewPagerAbility;
    }

    public final HomePageViewPagerAbility mS() {
        return (HomePageViewPagerAbility) this.LLJJIII.getValue();
    }

    public final MainActivity nS() {
        MainActivity mainActivity = this.LLJILLL;
        if (mainActivity != null) {
            return mainActivity;
        }
        return null;
    }

    public final MainBusinessAbility oS() {
        MainBusinessAbility mainBusinessAbility = this.LLJJJJLIIL;
        if (mainBusinessAbility == null) {
            synchronized (this) {
                mainBusinessAbility = this.LLJJJJLIIL;
                if (mainBusinessAbility == null) {
                    C0QSJ c0qsjHS = hS();
                    MainBusinessAbility mainBusinessAbility2 = c0qsjHS != null ? (MainBusinessAbility) c0qsjHS.getAbility(MainBusinessAbility.class) : null;
                    this.LLJJJJLIIL = mainBusinessAbility2;
                    return mainBusinessAbility2;
                }
            }
        }
        return mainBusinessAbility;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        ViewModelStore viewModelStore;
        C1606580ruS.LIZIZ(this, "onDestroy start");
        super.onDestroy();
        C1017370ca7 c1017370ca7 = nS().mCommerceActivityObserver;
        c1017370ca7.LIZJ.onDestroy();
        ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIJJLI().LIZLLL();
        ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJFF().LIZJ();
        ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJIJIIJIL().LIZIZ();
        ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIJJ().LIZIZ();
        AppLog.removeEventObserver(c1017370ca7.LIZLLL);
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        Object value = this.LLJJ.getValue();
        if (eventBusLIZLLL.LJIIJ(value)) {
            eventBusLIZLLL.LJJI(value);
        }
        if (((Boolean) C1617800sCY.LIZJ.getValue()).booleanValue()) {
            C19EG activity = getActivity();
            if (activity == null || (viewModelStore = activity.getViewModelStore()) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : viewModelStore.keys()) {
                ViewModel viewModel = viewModelStore.get(str);
                if (viewModel != null) {
                    if (C13LQ.LJJIJIIJI(viewModel.getClass(), C728850SiR.LIZ) >= 0) {
                        arrayList.add(str);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                KtSafLancet$SAFRetainedKeysViewModel ktSafLancet$SAFRetainedKeysViewModel = new KtSafLancet$SAFRetainedKeysViewModel();
                ((ArrayList) ktSafLancet$SAFRetainedKeysViewModel.LL).addAll(arrayList);
                viewModelStore.put("saf_retained_keys_when_clear_view_model", ktSafLancet$SAFRetainedKeysViewModel);
            }
            viewModelStore.clear();
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                synchronized (activity2) {
                    try {
                        C1558360qeg.LJI(activity2, null).getTree().LJFF();
                        C665430Q8f.LIZ.remove(String.valueOf(activity2.hashCode()));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            nS().contentSecurityAbility = null;
        }
        C0S78.LJ(true, new C1594100raK(this, 3));
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        C2344809Gs.LJ("MainRootFragment onPause Start");
        MainActivity mainActivityNS = nS();
        try {
            C1389600mGU.LIZIZ(mainActivityNS);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        mainActivityNS.overridePendingTransition(0, 0);
        super.onPause();
        nS().mCommerceActivityObserver.LIZJ.onPause();
        C2344809Gs.LJ("MainRootFragment onPause End");
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C2344809Gs.LJ("MainRootFragment onResume Start");
        if (qS() != null) {
            C1602170rnL.LJFF();
        }
        super.onResume();
        nS().mCommerceActivityObserver.LIZJ.onResume();
        nS().prevIsInDark = C960203pA.LIZIZ(nS());
        if (nS().mainDarkChanged) {
            nS().recreate();
        }
        C2344809Gs.LJ("MainRootFragment onResume End");
    }

    public final C1602170rnL qS() {
        return (C1602170rnL) this.LLJJIJIL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0raL] */
    public MainRootFragmentBase() {
        C724220Say c724220Say = new C724220Say();
        c724220Say.LIZIZ = true;
        this.LLJJI = c724220Say;
        aS(new C1607770rwN());
        this.LLJJIII = C452501pT.LIZIZ(new C1593600rZW(this));
        this.LLJJIJI = C452501pT.LIZIZ(new C1594090raJ(this));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new C1593610rZX(this));
        this.LLJJIJIL = C452501pT.LIZIZ(new C1594120raM(this));
        this.LLJJJ = true;
        this.LLJJJIL = new InterfaceC214918198y() { // from class: X.0raL
            @Override // X.InterfaceC214918198y
            public final void LIZ() {
                ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LLLLLLL();
            }

            @Override // X.InterfaceC214918198y
            public final void LIZIZ() {
                ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LJJLIIIJJI();
            }
        };
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onBackPressed() {
        List<InterfaceC1593530rZP> listLIZ = C1581140rFQ.LIZ(this, nS());
        if (listLIZ == null) {
            return true;
        }
        Iterator<InterfaceC1593530rZP> it2 = listLIZ.iterator();
        while (it2.hasNext()) {
            it2.next().onBackPress();
        }
        return true;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final InterfaceC214918198y U5() {
        return this.LLJJJIL;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public void LLLLIILLL(Bundle bundle) {
        String string;
        super.LLLLIILLL(bundle);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_recreate", 6);
        jSONObject.put("host", "fragment");
        if (bundle != null) {
            string = bundle.getString("extra_param_from_deeplink_return");
        } else {
            string = null;
        }
        jSONObject.put("new_intent_from", string);
        AppLogNewUtils.onEventV3("main_activity_saf_recreate_monitor", jSONObject);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        Object value = this.LLJJ.getValue();
        if (!eventBusLIZLLL.LJIIJ(value)) {
            eventBusLIZLLL.LJIJJ(value);
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (qS() != null) {
            C1602170rnL.LIZIZ();
        }
        super.onAttach(context);
        if (qS() != null) {
            C0X35.LJIIJJI("main_act_attach", true);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int layoutDirection;
        C1606580ruS.LIZIZ(this, "onConfigurationChange Start");
        super.onConfigurationChanged(configuration);
        boolean zLIZIZ = C960203pA.LIZIZ(nS());
        if (nS().prevIsInDark != zLIZIZ) {
            nS().prevIsInDark = zLIZIZ;
            nS().recreate();
            return;
        }
        nS().prevIsInDark = zLIZIZ;
        try {
            layoutDirection = nS().getResources().getConfiguration().getLayoutDirection();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            layoutDirection = -1;
        }
        C0T39.LIZIZ = layoutDirection;
        List<InterfaceC1593530rZP> listLIZ = C1581140rFQ.LIZ(this, nS());
        if (listLIZ != null) {
            Iterator<InterfaceC1593530rZP> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                it2.next().onConfigurationChanged(configuration);
            }
        }
        C1606580ruS.LIZIZ(this, "onConfigurationChange End");
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0S78.LJ(true, new C1594100raK(this, 0));
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        C0S78.LJ(true, new C1594100raK(this, 2));
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C0S78.LJ(true, new C1594100raK(this, 1));
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void onWindowFocusChanged(boolean z) {
        if (qS() != null) {
            C1602170rnL.LIZJ(z);
        }
        super.onWindowFocusChanged(z);
        boolean z2 = this.LLJJJ;
        if (z && z2) {
            this.LLJJJ = false;
        }
        C1602170rnL c1602170rnLQS = qS();
        if (c1602170rnLQS != null) {
            c1602170rnLQS.LIZ(z, z2);
        }
        List<InterfaceC1593530rZP> listLIZ = C1581140rFQ.LIZ(this, nS());
        if (listLIZ != null) {
            Iterator<InterfaceC1593530rZP> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                it2.next().onWindowFocusChanged(z, z2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int iLIZJ;
        Context context;
        View viewLIZLLL = C20673215v0.LIZLLL(R.layout.cd3, getActivity(), viewGroup, false);
        C295150BhZ.LIZ.getClass();
        boolean zLIZ = C295150BhZ.LIZ();
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            iLIZJ = C497820Jfg.LIZJ(context);
        } else {
            iLIZJ = 0;
        }
        viewLIZLLL.findViewById(R.id.sgo).setPadding(0, iLIZJ, 0, 0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MainRoot onCreateView initScope: ");
        C19GS c19gs = null;
        sbLIZ.append(C1558360qeg.LJFF(this, null));
        C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
        View view = viewLIZLLL;
        if (zLIZ) {
            C21390118nL c21390118nL = new C21390118nL(layoutInflater.getContext());
            c21390118nL.setId(R.id.tyd);
            c21390118nL.addView(viewLIZLLL);
            view = c21390118nL;
        }
        try {
            ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(view, this);
            view.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return view;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return view;
        }
    }
}
