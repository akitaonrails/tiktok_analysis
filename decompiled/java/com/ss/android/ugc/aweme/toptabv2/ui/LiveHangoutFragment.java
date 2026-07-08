package com.ss.android.ugc.aweme.toptabv2.ui;

import X.AbstractC479160Iqg;
import X.AbstractC738140SxQ;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C09R3;
import X.C0IGQ;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1161920gLG;
import X.C1361400lX0;
import X.C1390410mHn;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C338490DOt;
import X.C439101nJ;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C477500Io0;
import X.C477860Ioa;
import X.C478550Iph;
import X.C478580Ipk;
import X.C478920IqI;
import X.C479490IrD;
import X.C479670IrV;
import X.C500260Jjc;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC479370Ir1;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC476860Imy;
import X.InterfaceC479000IqQ;
import X.InterfaceC479190Iqj;
import X.InterfaceC665370Q7z;
import X.InterfaceC724760Sbq;
import Y.AObserverS211S0100000_7;
import Y.ARunnableS107S0100000_7;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestTopLiveCenterEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TtliveHangoutEnableLiveCardAudioPlayerSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.LivePlayPullStreamEndEvent;
import com.bytedance.android.livesdkapi.TopLiveRandomMatchFragmentShowEvent;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveInteractModuleVM;
import com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS95S0110000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveHangoutFragment extends BaseFragment implements C0IGQ, InterfaceC479000IqQ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjOTHELIOSsyKjN+Zzo6ZgklPyobKSsrJjonDjctLiI2JjE=";
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public final C01GW LLILLL;
    public C1390410mHn LLILZ;
    public ViewStub LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveHangoutFragment.class, "interactionVM", "getInteractionVM()Lcom/ss/android/ugc/aweme/hangout/component/interact/viewmodel/MultiTopLiveInteractModuleVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(LiveHangoutFragment.class, "playFeedListVM", "getPlayFeedListVM()Lcom/ss/android/ugc/aweme/hangout/component/livecard/viewmodel/MultiTopLivePlayFeedListViewModel;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC479000IqQ
    public final void Jp() {
    }

    @Override // X.InterfaceC479000IqQ
    public final void Wh() {
    }

    @Override // X.C0IGQ
    public final boolean onBackPressed() {
        C477860Ioa.LJI = true;
        C479670IrV.LIZ(8, "hangout");
        return false;
    }

    public LiveHangoutFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        AssemVMLazy assemVMLazy2;
        boolean z3;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MultiTopLiveInteractModuleVM.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 540);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(236);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 541), aFwS237S0000000_7, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new AwS551S0100000_7((Fragment) this, 542), aFwS237S0000000_7, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 543), aFwS237S0000000_7, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MultiTopLivePlayFeedListViewModel.class);
        AwS551S0100000_7 awS551S0100000_72 = new AwS551S0100000_7(c19719912DlLIZ2, 544);
        AFwS237S0000000_7 aFwS237S0000000_72 = AFwS237S0000000_7.get$arr$(237);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS551S0100000_72, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 545), aFwS237S0000000_72, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
            z3 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS551S0100000_72, new AwS551S0100000_7((Fragment) this, 546), aFwS237S0000000_72, null, null, null);
            z3 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ2);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(this);
            C338490DOt c338490DOtLJIIIZ = C724750Sbp.LJIIIZ(this);
            AwS551S0100000_7 awS551S0100000_73 = new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 539);
            C451460Hn6 c451460Hn6 = new C451460Hn6(this, z);
            C451620HnM c451620HnM = new C451620HnM(this, z);
            C987103tV c987103tV = new C987103tV(this, z);
            z3 = true;
            assemVMLazy2 = new AssemVMLazy(function0LJIIJ, awS551S0100000_72, c452070Ho5, c1622206WuLJII, c338490DOtLJIIIZ, awS551S0100000_73, aFwS237S0000000_72, c451460Hn6, c451620HnM, c987103tV);
        }
        this.LLILLJJLI = assemVMLazy2;
        this.LLILLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(189));
        this.LLJ = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void NR() {
        List<AbstractC479160Iqg> list;
        if (!this.LLIZ || !this.LLIZLLLIL || (list = ((C479490IrD) PR().getState()).LL.LLILZ) == null || list.isEmpty()) {
            return;
        }
        C479670IrV.LIZ.getClass();
        System.currentTimeMillis();
    }

    public final void OR() {
        C20441214yg.LIZIZ("LiveHangoutFragment", "clearPushCard");
    }

    public final MultiTopLivePlayFeedListViewModel PR() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (MultiTopLivePlayFeedListViewModel) assemVMLazy.getValue();
    }

    public final void SR() {
        ViewGroup viewGroup;
        C20441214yg.LIZIZ("MultiTopLive", "showTopModuleLoading");
        if (this.LLILZ == null) {
            Context context = getContext();
            if (context == null) {
                return;
            }
            C1390410mHn c1390410mHn = new C1390410mHn(context, null, 6);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C439101nJ.LIZ(36), C439101nJ.LIZ(36));
            layoutParams.gravity = 17;
            C786410Ut5.V6(c1390410mHn, layoutParams);
            this.LLILZ = c1390410mHn;
        }
        View view = getView();
        if (view != null) {
            C1390410mHn c1390410mHn2 = this.LLILZ;
            if ((c1390410mHn2 == null || c1390410mHn2.getParent() == null) && (view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                viewGroup.addView(this.LLILZ);
            }
            C1390410mHn c1390410mHn3 = this.LLILZ;
            if (c1390410mHn3 != null) {
                C786410Ut5.LLLZZIL(c1390410mHn3, 0);
            }
            C1390410mHn c1390410mHn4 = this.LLILZ;
            if (c1390410mHn4 != null) {
                c1390410mHn4.LIZJ();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C20441214yg.LIZIZ("LiveHangoutFragment", "onDestroy");
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        this.LLJ = false;
        OR();
        ((ArrayList) C478550Iph.LIZIZ).clear();
        ((ArrayList) C478550Iph.LIZLLL).clear();
        ((ArrayList) C478550Iph.LJ).clear();
        C478550Iph.LJFF.clear();
        C477860Ioa.LJIILIIL();
        C478920IqI.LIZ.getClass();
        C478920IqI.LIZJ = 0L;
        C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", "MultiTopLiveDataCacheManager Card feed data fetch timestamp reset");
        DataChannelGlobal.LLILZ.zQ2(this);
        C478920IqI.LIZJ();
        C478580Ipk.LIZ("hangoutFragment#onDestroy");
        C479670IrV.LIZ.getClass();
        C479670IrV.LIZIZ = "discover";
        C479670IrV.LIZJ = "";
        C479670IrV.LIZLLL = "none";
        if (TtliveHangoutEnableLiveCardAudioPlayerSetting.INSTANCE.isEnable()) {
            PR().CQ2();
        }
        IPullStreamService iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class);
        if (iPullStreamService != null) {
            iPullStreamService.v42();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C20441214yg.LIZIZ("LiveHangoutFragment", "onDestroyView");
        if (TtliveHangoutEnableLiveCardAudioPlayerSetting.INSTANCE.isEnable()) {
            PR().CQ2();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C20441214yg.LIZIZ("LiveHangoutFragment", "onPause");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume cost: ");
        sbLIZ.append(System.currentTimeMillis() - C477500Io0.LIZIZ);
        C20441214yg.LIZIZ("LiveHangoutFragment", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C20441214yg.LIZIZ("LiveHangoutFragment", "onStop");
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onConfigurationChanged: screenWidthDp=");
        sbLIZ.append(configuration.screenWidthDp);
        sbLIZ.append(", screenHeightDp=");
        sbLIZ.append(configuration.screenHeightDp);
        sbLIZ.append(", screenLayout=");
        sbLIZ.append(configuration.screenLayout);
        C20441214yg.LIZIZ("LiveHangoutFragment", C2188811AlT.LIZIZ(sbLIZ));
        C20441214yg.LIZIZ("LiveHangoutFragment", "handleScreenSizeChange: refreshing UI for foldable screen");
        View view = getView();
        if (view != null) {
            view.requestLayout();
        }
        View view2 = getView();
        if (view2 != null) {
            HandlerHook.viewPost(view2, new ARunnableS107S0100000_7(this, 180));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IPullStreamService iPullStreamService;
        C20441214yg.LIZIZ("LiveHangoutFragment", "hangoutFragment onCreate");
        super.onCreate(bundle);
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        ((MultiTopLiveInteractModuleVM) assemVMLazy.getValue()).LL.observe(this, new AObserverS211S0100000_7(this, 30));
        PR().LLILZIL.observe(this, new AObserverS211S0100000_7(this, 31));
        DataChannelGlobal.LLILZ.BQ2(this, this, TopLiveRandomMatchFragmentShowEvent.class, new AwS586S0100000_7(this, 319));
        if (TtliveHangoutEnableLiveCardAudioPlayerSetting.INSTANCE.isEnable() && (iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)) != null) {
            iPullStreamService.XZ0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        AssemSupervisor assemSupervisorLIZJ;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList2;
        List<AbstractC479160Iqg> list;
        Object obj;
        boolean zBooleanValue = z;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/ss/android/ugc/aweme/toptabv2/ui/LiveHangoutFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(zBooleanValue)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nc4vP3iSO6rdC//LA3UZbLblenPyfNxIwvtImDKI=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            zBooleanValue = ((Boolean) obj).booleanValue();
        }
        C20441214yg.LIZIZ("LiveHangoutFragment", "onHiddenChanged hidden:" + zBooleanValue);
        super.onHiddenChanged(zBooleanValue);
        if (!zBooleanValue) {
            if (TtliveHangoutEnableLiveCardAudioPlayerSetting.INSTANCE.isEnable()) {
                PR().LLILZ = false;
            }
            C20441214yg.LIZIZ("legolas_gap", "onHiddenChanged hidden:" + zBooleanValue + ", gap:" + (System.currentTimeMillis() - 0));
            System.currentTimeMillis();
            if (this.LLIZLLLIL && (list = ((C479490IrD) PR().getState()).LL.LLILZ) != null) {
                list.isEmpty();
            }
            if ((!this.LLIZ || !this.LLIZLLLIL) && (!((ArrayList) C477500Io0.LJIIJ()).isEmpty())) {
                C20441214yg.LIZIZ("LiveHangoutFragment", "hangoutFragment onHiddenChanged(visible) init for first time not rendered with liveTab， liveTab is not null");
                System.currentTimeMillis();
                C478920IqI c478920IqI = C478920IqI.LIZ;
                EnumC479370Ir1 enumC479370Ir1 = EnumC479370Ir1.INIT;
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                MultiTopLivePlayFeedListViewModel multiTopLivePlayFeedListViewModelPR = PR();
                InterfaceC476860Imy interfaceC476860Imy = (InterfaceC476860Imy) this.LLILLL.getValue();
                AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(this, 633);
                AwS551S0100000_7 awS551S0100000_72 = new AwS551S0100000_7(this, 634);
                c478920IqI.getClass();
                C478920IqI.LJIIIIZZ(enumC479370Ir1, "landing_init", "top_module_ui_landing", lifecycleScope, multiTopLivePlayFeedListViewModelPR, interfaceC476860Imy, null, awS551S0100000_7, awS551S0100000_72);
            }
            C20441214yg.LIZIZ("MultiTopLive", "onHiddenChanged false, cost: " + (System.currentTimeMillis() - C477500Io0.LIZIZ));
            if (isAdded()) {
                AssemSupervisor assemSupervisorLIZJ2 = C724240Sb0.LIZJ(this);
                if (assemSupervisorLIZJ2 != null && (copyOnWriteArrayList2 = assemSupervisorLIZJ2.LLJILLL) != null) {
                    for (InterfaceC665370Q7z interfaceC665370Q7z : copyOnWriteArrayList2) {
                        if (interfaceC665370Q7z instanceof InterfaceC479190Iqj) {
                            ((InterfaceC479190Iqj) interfaceC665370Q7z).b7(this.LLJ);
                        }
                    }
                }
                this.LLJ = false;
                return;
            }
            return;
        }
        if (isAdded() && (assemSupervisorLIZJ = C724240Sb0.LIZJ(this)) != null && (copyOnWriteArrayList = assemSupervisorLIZJ.LLJILLL) != null) {
            for (InterfaceC665370Q7z interfaceC665370Q7z2 : copyOnWriteArrayList) {
                if (interfaceC665370Q7z2 instanceof InterfaceC479190Iqj) {
                    ((InterfaceC479190Iqj) interfaceC665370Q7z2).rg();
                }
            }
        }
        if (TtliveHangoutEnableLiveCardAudioPlayerSetting.INSTANCE.isEnable()) {
            PR().CQ2();
        }
    }

    public final void RR(String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initTopLiveAssem, source: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("LiveHangoutFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (!LiveSdkMultiGuestTopLiveCenterEnableSetting.isEnable()) {
            return;
        }
        if (isAdded() && getContext() != null && getActivity() != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("hangoutFragment initTopLiveAssem:");
            sbLIZ2.append(str);
            sbLIZ2.append(" shouldRefreshData:");
            sbLIZ2.append(z);
            C20441214yg.LIZIZ("MultiTopLive", C2188811AlT.LIZIZ(sbLIZ2));
            System.currentTimeMillis();
            C478920IqI.LIZ.getClass();
            if (C478920IqI.LJFF != null && C478920IqI.LJI != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("hangoutFragment initTopLiveAssem from source:");
                sbLIZ3.append(str);
                sbLIZ3.append(" and Pre-render data available, skipping force refresh");
                C20441214yg.LIZIZ("MultiTopLive", C2188811AlT.LIZIZ(sbLIZ3));
                z = false;
            }
            C723850SaN.LIZ(this, false, null, new AwS95S0110000_7(this, z, 3), 3);
            return;
        }
        C20441214yg.LJIIL("MultiTopLive", "Fragment not attached, skip initTopLiveAssem.");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C20441214yg.LIZIZ("LiveHangoutFragment", "hangoutFragment onViewCreated");
        if (C500260Jjc.LJJIJIIJI(C477500Io0.LJIIJ())) {
            C20441214yg.LIZIZ("MultiTopLive", "hangoutFragment onViewCreated initNativeTopLivePage by Setting config");
            C20441214yg.LIZIZ("LiveHangoutFragment", "initNativeTopLivePage");
            this.LLILZLL = true;
            C20441214yg.LIZIZ("LiveHangoutFragment", "hangoutFragment register LivePlayPullStreamEndEvent");
            DataChannelGlobal.LLILZ.EQ2(this, this, LivePlayPullStreamEndEvent.class, new AwS586S0100000_7(this, 394));
            return;
        }
        view.getContext();
        C20441214yg.LIZIZ("LiveHangoutFragment", "initTopLivePage");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C20441214yg.LIZIZ("LiveHangoutFragment", "hangoutFragment onCreateView");
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(new C1361400lX0(getActivity(), R.style.y0)), R.layout.ddi, viewGroup, false);
        if (LiveSdkMultiGuestTopLiveCenterEnableSetting.isEnable()) {
            ViewStub viewStub = (ViewStub) viewTd.findViewById(R.id.vs_multi_toplive);
            this.LLILZIL = viewStub;
            if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.ddn);
            }
            ViewStub viewStub2 = this.LLILZIL;
            if (viewStub2 != null) {
                C786410Ut5.LJLLLL(viewStub2);
            }
        }
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
