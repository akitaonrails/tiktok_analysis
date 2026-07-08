package com.ss.android.ugc.aweme.feed.landscape;

import X.C019F;
import X.C01D1;
import X.C06MM;
import X.C098200Yq;
import X.C0QSJ;
import X.C0SU6;
import X.C0SUC;
import X.C1106904Up;
import X.C1336100ksC;
import X.C13LE;
import X.C1578630rBN;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20673215v0;
import X.C2187451AjH;
import X.C2189821An6;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C616540OGe;
import X.C666390QBx;
import X.C673150Qan;
import X.C687700QyG;
import X.C692760RFi;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1146704e9;
import X.InterfaceC1581960rGk;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC724760Sbq;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.top.TopStatusBarVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.scope.LandscapeFeedScope;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.feed.platform.container.scope.CommonVideoCellScope;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeFeedFragment extends AmeBaseFragment implements C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMpLCt9JCHELIOSQiLTwwKTUpZwMyJiE/Ki4jLQMpLCsVOiQrJCo9PA==";
    public final LandscapeFragmentPanel LL = new LandscapeFragmentPanel();
    public Aweme LLILLJJLI;
    public C2189821An6 LLILLL;
    public final AssemVMLazy LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LandscapeFeedFragment.class, "topStatusBarVM", "getTopStatusBarVM()Lcom/ss/android/ugc/aweme/feed/landscape/cell/assem/top/TopStatusBarVM;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{LandscapeFeedScope.class, CommonVideoCellScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LandscapeFeedScope.class);
        arrayList.add(CommonVideoCellScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LandscapeFeedScope.class);
        arrayList.add(CommonVideoCellScope.class);
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

    public LandscapeFeedFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TopStatusBarVM.class);
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(c19719912DlLIZ, 379);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(176);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS555S0100000_11, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS555S0100000_11((HasDefaultViewModelProviderFactory) this, 380), aFwS243S0000000_11, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS555S0100000_11, new AwS555S0100000_11((Fragment) this, 381), aFwS243S0000000_11, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS555S0100000_11, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS555S0100000_11((HasDefaultViewModelProviderFactory) this, 382), aFwS243S0000000_11, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZ = assemVMLazy;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.LL.setUserVisibleHint(false);
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL.onDestroyView();
        if (C692760RFi.LIZ) {
            AssemVMLazy assemVMLazy = this.LLILZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
            TopStatusBarVM topStatusBarVM = (TopStatusBarVM) assemVMLazy.getValue();
            Context context = getContext();
            if (context != null) {
                C786410Ut5.LJJIFFI(context, topStatusBarVM.LL);
                C786410Ut5.LJJIFFI(context, topStatusBarVM.LLILLJJLI);
            }
            EventBus.LIZLLL().LJJI(topStatusBarVM);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(LandscapeFeedFragment.class.getName());
        }
        this.LL.setUserVisibleHint(true);
        if (C1106904Up.LIZ()) {
            Aweme aweme = this.LLILLJJLI;
            Activity activityLIZ = C06MM.LIZ(getContext());
            if (aweme != null && activityLIZ != null) {
                if (aweme.isSubOnlyVideo() || aweme.isPaidContent) {
                    C1336100ksC.LJFF(activityLIZ);
                } else {
                    activityLIZ.getWindow().clearFlags(8192);
                }
            }
        }
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment
    public final SparseArray<InterfaceC1581960rGk> registerComponents() {
        SparseArray<InterfaceC1581960rGk> sparseArrayRegisterComponents = super.registerComponents();
        sparseArrayRegisterComponents.append(C0SU6.LIZLLL, this.LL);
        return sparseArrayRegisterComponents;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x02f4  */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttach(android.app.Activity r120) {
        /*
            Method dump skipped, instruction units count: 1203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedFragment.onAttach(android.app.Activity):void");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws Exception {
        super.onCreate(bundle);
        RootPanelComponent rootPanelComponentLIZ = C1578630rBN.LIZ(this);
        if (rootPanelComponentLIZ != null) {
            rootPanelComponentLIZ.P9(bundle);
        }
        if (C692760RFi.LIZ) {
            AssemVMLazy assemVMLazy = this.LLILZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
            TopStatusBarVM topStatusBarVM = (TopStatusBarVM) assemVMLazy.getValue();
            Context context = getContext();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_TICK");
            if (context != null) {
                C786410Ut5.LJIL(context, topStatusBarVM.LL, intentFilter, null, null);
            }
            IntentFilter intentFilter2 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            if (context != null) {
                C786410Ut5.LJIL(context, topStatusBarVM.LLILLJJLI, intentFilter2, null, null);
            }
            EventBus.LIZLLL().LJIJJ(topStatusBarVM);
        }
    }

    public static String MR(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializableExtra;
        Serializable serializableExtra2;
        Intent intent;
        Intent intent2;
        super.onViewCreated(view, bundle);
        RootPanelComponent rootPanelComponentLIZ = C1578630rBN.LIZ(this);
        if (rootPanelComponentLIZ != null) {
            rootPanelComponentLIZ.LLZLLLL(view, bundle);
        }
        this.LLILLJJLI = C666390QBx.LIZ;
        C19EG activity = getActivity();
        C2189821An6 c2189821An6 = null;
        if (activity != null && (intent2 = activity.getIntent()) != null) {
            serializableExtra = intent2.getSerializableExtra("is_pause_state");
        } else {
            serializableExtra = null;
        }
        if (serializableExtra instanceof Boolean) {
            C19EG activity2 = getActivity();
            if (activity2 != null && (intent = activity2.getIntent()) != null) {
                serializableExtra2 = intent.getSerializableExtra("is_pause_state");
            } else {
                serializableExtra2 = null;
            }
            ((Boolean) serializableExtra2).booleanValue();
        }
        C2189821An6 c2189821An62 = this.LLILLL;
        if (c2189821An62 != null) {
            LandscapeFragmentPanel landscapeFragmentPanel = this.LL;
            landscapeFragmentPanel.LLJI = c2189821An62;
            Context context = landscapeFragmentPanel.getContext();
            C2189821An6 c2189821An63 = landscapeFragmentPanel.LLJI;
            if (c2189821An63 != null) {
                c2189821An6 = c2189821An63;
            }
            C0SUC.LIZIZ(context, c2189821An6);
        }
        this.LL.setUserVisibleHint(true);
        LandscapeFragmentPanel landscapeFragmentPanel2 = this.LL;
        landscapeFragmentPanel2.LLILZIL = this.LLILLJJLI;
        landscapeFragmentPanel2.onAttach(getActivity(), this);
        this.LL.onViewCreated(view, bundle);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZJ = C20673215v0.LIZJ(R.layout.d0_, (Activity) getContext());
        C19GS c19gs = null;
        if (!(viewLIZJ instanceof View)) {
            viewLIZJ = null;
        }
        if (viewLIZJ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZJ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZJ, this);
                viewLIZJ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZJ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZJ;
    }
}
