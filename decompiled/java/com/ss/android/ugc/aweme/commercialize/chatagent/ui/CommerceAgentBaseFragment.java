package com.ss.android.ugc.aweme.commercialize.chatagent.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C07GV;
import X.C098200Yq;
import X.C09R3;
import X.C0PHT;
import X.C0QSJ;
import X.C0ZP4;
import X.C1077030e8L;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1554610qYd;
import X.C1554890qZ5;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20279114Wn;
import X.C20279214Wo;
import X.C20279314Wp;
import X.C2217381BqS;
import X.C2217401BqU;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C634060Otw;
import X.C673150Qan;
import X.C687700QyG;
import X.C688120Qyw;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC20660615sy;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC320950Ci5;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.model.AIBotInfo;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.model.CommerceAgentEnterParams;
import com.ss.android.ugc.aweme.commercialize.chatagent.arch.scope.CommerceAgentFragmentScope;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.sug.CommerceAgentSugDataVM;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.ability.CommerceAgentScreenTypeAbility;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.ability.ICommerceAgentScreenTypeAbility;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.ability.MessageAbilityImpl;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import com.ss.android.ugc.aweme.commercialize.chatagent.otherpage.sheet.CommerceAgentSevenSheetVM;
import com.ss.android.ugc.aweme.commercialize.chatagent.startup.protocol.ICommerceAgentProcessorProtocol;
import com.ss.android.ugc.aweme.commercialize.chatagent.vm.CommerceAgentFragmentViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.log.IAdChatAgentLogService;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public abstract class CommerceAgentBaseFragment extends BaseFragment implements InterfaceC724530SbT, InterfaceC20660615sy, ICommerceAgentChatPageAbility, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final AssemVMLazy LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final AssemVMLazy LLJI;
    public CommerceAgentEnterParams LLJIJIL;
    public View LLJILJIL;
    public final C01GW LLJILJILJ;
    public boolean LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommerceAgentBaseFragment.class, "fragmentVM", "getFragmentVM()Lcom/ss/android/ugc/aweme/commercialize/chatagent/vm/CommerceAgentFragmentViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CommerceAgentBaseFragment.class, "sugVM", "getSugVM()Lcom/ss/android/ugc/aweme/commercialize/chatagent/botpage/cards/sug/CommerceAgentSugDataVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(CommerceAgentBaseFragment.class, "messageViewModel", "getMessageViewModel()Lcom/ss/android/ugc/aweme/commercialize/chatagent/botpage/vm/MessageViewModel;", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU = new C2217401BqU(CommerceAgentBaseFragment.class, "messageViewModel", "<v#0>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU2 = new C2217401BqU(CommerceAgentBaseFragment.class, "sevenSheetVM", "<v#1>", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217401BqU, c2217401BqU2};
    }

    public void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommerceAgentFragmentScope.class});
    }

    public Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommerceAgentFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    public List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommerceAgentFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public String nZ0() {
        return "full_screen";
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return false;
    }

    public void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public CommerceAgentBaseFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        AssemVMLazy assemVMLazy2;
        boolean z2;
        boolean z3;
        AssemVMLazy assemVMLazy3;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommerceAgentFragmentViewModel.class);
        AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(c19719912DlLIZ, 68);
        AFwS274S0000000_30 aFwS274S0000000_30 = AFwS274S0000000_30.get$arr$(51);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS548S0100000_4, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS574S0100000_30((HasDefaultViewModelProviderFactory) this, 28), aFwS274S0000000_30, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS548S0100000_4, new AwS574S0100000_30((Fragment) this, 29), aFwS274S0000000_30, null, null, null);
            z = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS548S0100000_4, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS574S0100000_30((HasDefaultViewModelProviderFactory) this, 21), aFwS274S0000000_30, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(CommerceAgentSugDataVM.class);
        AwS548S0100000_4 awS548S0100000_42 = new AwS548S0100000_4(c19719912DlLIZ2, 64);
        AFwS274S0000000_30 aFwS274S0000000_302 = AFwS274S0000000_30.get$arr$(47);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS548S0100000_42, new C452070Ho5(), new C1622206Wu(this, z), new C338490DOt(this, z), new AwS574S0100000_30((HasDefaultViewModelProviderFactory) this, 22), aFwS274S0000000_302, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
            z2 = true;
            z3 = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS548S0100000_42, new AwS574S0100000_30((Fragment) this, 23), aFwS274S0000000_302, null, null, null);
            z2 = true;
            z3 = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z2 = true;
            z3 = false;
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS548S0100000_42, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS574S0100000_30((HasDefaultViewModelProviderFactory) this, 24), aFwS274S0000000_302, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZLLLIL = assemVMLazy2;
        this.LLJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(61));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(MessageViewModel.class);
        AwS548S0100000_4 awS548S0100000_43 = new AwS548S0100000_4(c19719912DlLIZ3, 67);
        AFwS274S0000000_30 aFwS274S0000000_303 = AFwS274S0000000_30.get$arr$(50);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS548S0100000_43, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS574S0100000_30((HasDefaultViewModelProviderFactory) this, 25), aFwS274S0000000_303, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy3 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS548S0100000_43, new AwS574S0100000_30((Fragment) this, 26), aFwS274S0000000_303, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS548S0100000_43, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS574S0100000_30((HasDefaultViewModelProviderFactory) this, 27), aFwS274S0000000_303, new C451460Hn6(this, z3), new C451620HnM(this, z3), new C987103tV(this, z3));
        }
        this.LLJI = assemVMLazy3;
        new C0PHT(null, 511);
        new AwS548S0100000_4(this, 65);
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(60));
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return C634060Otw.LIZ(this);
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        return new C688120Qyw(requireContext(), this, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLJILLL = true;
        IScreenshotService iScreenshotService = (IScreenshotService) this.LLJ.getValue();
        if (iScreenshotService != null) {
            iScreenshotService.LIZJ(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLJILLL) {
            C07GV.LIZ(new AwS548S0100000_4(this, 66));
        }
        this.LLJILLL = false;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    public final void SR(CommerceAgentEnterParams commerceAgentEnterParams) {
        List listLIZIZ = null;
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IMessageAbility.class, null);
        if (iMessageAbility != null) {
            iMessageAbility.nn2(getContext());
            InterfaceC665370Q7z interfaceC665370Q7zLJIIJJI = C1558360qeg.LJIIJJI(this, null);
            if (interfaceC665370Q7zLJIIJJI != null) {
                listLIZIZ = C1554610qYd.LIZIZ(interfaceC665370Q7zLJIIJJI, ICommerceAgentProcessorProtocol.class, false);
            }
            C1077030e8L c1077030e8L = new C1077030e8L(this, iMessageAbility, commerceAgentEnterParams, listLIZIZ);
            List<ICommerceAgentProcessorProtocol> list = (List) c1077030e8L.LIZLLL.getValue();
            if (commerceAgentEnterParams != null && list != null) {
                for (ICommerceAgentProcessorProtocol iCommerceAgentProcessorProtocol : list) {
                    if (iCommerceAgentProcessorProtocol.jI(commerceAgentEnterParams, c1077030e8L.LIZIZ)) {
                        iCommerceAgentProcessorProtocol.N01(c1077030e8L.LIZ, commerceAgentEnterParams, c1077030e8L.LJ, c1077030e8L.LIZIZ);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [X.0CjD] */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        CommerceAgentEnterParams commerceAgentEnterParams;
        Long lValueOf;
        Integer numValueOf;
        String str;
        AssemVMLazy assemVMLazy;
        boolean z;
        AssemVMLazy assemVMLazy2;
        AIBotInfo aIBotInfo;
        AIBotInfo aIBotInfo2;
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity == null) {
            activity = new C19EG();
        }
        String str2 = null;
        C1554890qZ5 tree = C1558360qeg.LJI(activity, null).getTree();
        new WeakReference(this);
        tree.LIZLLL("source_default_key", new C20279214Wo(0), C20279214Wo.class);
        NR(AFwS273S0000000_29.get$arr$(33));
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("commerce_agent_enter_param");
        } else {
            serializable = null;
        }
        if (serializable instanceof CommerceAgentEnterParams) {
            commerceAgentEnterParams = (CommerceAgentEnterParams) serializable;
        } else {
            commerceAgentEnterParams = null;
        }
        this.LLJIJIL = commerceAgentEnterParams;
        if (commerceAgentEnterParams != null) {
            commerceAgentEnterParams.setScreenType(nZ0());
        }
        CommerceAgentEnterParams commerceAgentEnterParams2 = this.LLJIJIL;
        if (commerceAgentEnterParams2 != null && (aIBotInfo2 = commerceAgentEnterParams2.botInfo) != null) {
            lValueOf = Long.valueOf(aIBotInfo2.botId);
        } else {
            lValueOf = null;
        }
        C20279114Wn.LIZ = C20279314Wp.LIZ(C20279114Wn.LIZ, lValueOf, null, null, null, 30);
        CommerceAgentEnterParams commerceAgentEnterParams3 = this.LLJIJIL;
        if (commerceAgentEnterParams3 != null && (aIBotInfo = commerceAgentEnterParams3.botInfo) != null) {
            numValueOf = Integer.valueOf(aIBotInfo.botSource);
        } else {
            numValueOf = null;
        }
        C20279314Wp c20279314WpLIZ = C20279314Wp.LIZ(C20279114Wn.LIZ, null, numValueOf, null, null, 29);
        C20279114Wn.LIZ = c20279314WpLIZ;
        C20279314Wp c20279314WpLIZ2 = C20279314Wp.LIZ(c20279314WpLIZ, null, null, null, null, 27);
        C20279114Wn.LIZ = c20279314WpLIZ2;
        CommerceAgentEnterParams commerceAgentEnterParams4 = this.LLJIJIL;
        if (commerceAgentEnterParams4 != null) {
            str = commerceAgentEnterParams4.enterFrom;
        } else {
            str = null;
        }
        C20279314Wp c20279314WpLIZ3 = C20279314Wp.LIZ(c20279314WpLIZ2, null, null, str, null, 23);
        C20279114Wn.LIZ = c20279314WpLIZ3;
        CommerceAgentEnterParams commerceAgentEnterParams5 = this.LLJIJIL;
        if (commerceAgentEnterParams5 != null) {
            str2 = commerceAgentEnterParams5.enterMethod;
        }
        C20279114Wn.LIZ = C20279314Wp.LIZ(c20279314WpLIZ3, null, null, null, str2, 15);
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 131);
        AFwS274S0000000_30 aFwS274S0000000_30 = AFwS274S0000000_30.get$arr$(48);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 82), aFwS274S0000000_30, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS573S0100000_29((Fragment) this, 83), aFwS274S0000000_30, null, null, null);
            z = true;
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            z = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 84), aFwS274S0000000_30, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(CommerceAgentSevenSheetVM.class);
        AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18(c19719912DlLIZ2, 132);
        AFwS274S0000000_30 aFwS274S0000000_302 = AFwS274S0000000_30.get$arr$(49);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS562S0100000_182, new C452070Ho5(), new C1622206Wu(this, z), new C338490DOt(this, z), new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 85), aFwS274S0000000_302, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS562S0100000_182, new AwS573S0100000_29((Fragment) this, 86), aFwS274S0000000_302, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS562S0100000_182, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 81), aFwS274S0000000_302, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        MessageViewModel messageViewModel = (MessageViewModel) assemVMLazy.getValue();
        this.LLIZ.getValue();
        C1558520qew.LJI(this, CommerceAgentFragmentScope.class, new MessageAbilityImpl(messageViewModel, this.LLJIJIL, new InterfaceC320950Ci5() { // from class: X.0CjD
            public final ConcurrentHashMap<String, Boolean> LIZ = new ConcurrentHashMap<>();
            public final ConcurrentHashMap<String, Long> LIZIZ = new ConcurrentHashMap<>();
            public final ConcurrentHashMap<String, Long> LIZJ = new ConcurrentHashMap<>();
            public final ConcurrentHashMap<String, Long> LIZLLL = new ConcurrentHashMap<>();
            public final ConcurrentHashMap<String, Long> LJ = new ConcurrentHashMap<>();

            @Override // X.InterfaceC320950Ci5
            public final void LIZ(Message message) {
                Long lValueOf2;
                long jLongValue;
                String creativeIdStr;
                AwemeRawAd awemeRawAd;
                Long lRemove = this.LIZIZ.remove(message.uuid);
                String logExtra = null;
                if (lRemove != null) {
                    lValueOf2 = Long.valueOf(System.currentTimeMillis() - lRemove.longValue());
                } else {
                    lValueOf2 = null;
                }
                ConcurrentHashMap<String, Long> concurrentHashMap = this.LIZLLL;
                String str3 = message.uuid;
                if (lValueOf2 != null) {
                    jLongValue = lValueOf2.longValue();
                } else {
                    jLongValue = 0;
                }
                concurrentHashMap.put(str3, Long.valueOf(jLongValue));
                if (LJII(this.LIZ, LJI(message, "question_finish")) == null) {
                    Aweme aweme = C321640CjC.LIZ;
                    String str4 = C321640CjC.LIZIZ;
                    IAdChatAgentLogService iAdChatAgentLogService = (IAdChatAgentLogService) PluggableExtentionKt.pluggableSpi$default(IAdChatAgentLogService.class, false, false, false, 14, null);
                    if (iAdChatAgentLogService != null) {
                        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                            creativeIdStr = awemeRawAd.getCreativeIdStr();
                        } else {
                            creativeIdStr = null;
                            if (aweme != null) {
                            }
                            iAdChatAgentLogService.LJIIJJI(0, C321620CjA.LIZ(), lValueOf2, creativeIdStr, logExtra, str4, C321640CjC.LIZJ, message.msgId);
                        }
                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                        if (awemeRawAd2 != null) {
                            logExtra = awemeRawAd2.getLogExtra();
                        }
                        iAdChatAgentLogService.LJIIJJI(0, C321620CjA.LIZ(), lValueOf2, creativeIdStr, logExtra, str4, C321640CjC.LIZJ, message.msgId);
                    }
                }
                this.LIZ.remove(LJI(message, "question_start"));
            }

            @Override // X.InterfaceC320950Ci5
            public final void LIZIZ(Message message) {
                Long lValueOf2;
                long jLongValue;
                String creativeIdStr;
                AwemeRawAd awemeRawAd;
                Long l = this.LIZJ.get(message.replyUuid);
                String logExtra = null;
                if (l != null) {
                    lValueOf2 = Long.valueOf(System.currentTimeMillis() - l.longValue());
                } else {
                    lValueOf2 = null;
                }
                ConcurrentHashMap<String, Long> concurrentHashMap = this.LJ;
                String str3 = message.replyUuid;
                if (lValueOf2 != null) {
                    jLongValue = lValueOf2.longValue();
                } else {
                    jLongValue = 0;
                }
                concurrentHashMap.put(str3, Long.valueOf(jLongValue));
                if (LJII(this.LIZ, LJI(message, "answer_finish")) == null) {
                    Aweme aweme = C321640CjC.LIZ;
                    String str4 = C321640CjC.LIZIZ;
                    IAdChatAgentLogService iAdChatAgentLogService = (IAdChatAgentLogService) PluggableExtentionKt.pluggableSpi$default(IAdChatAgentLogService.class, false, false, false, 14, null);
                    if (iAdChatAgentLogService != null) {
                        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                            creativeIdStr = awemeRawAd.getCreativeIdStr();
                        } else {
                            creativeIdStr = null;
                            if (aweme != null) {
                            }
                            iAdChatAgentLogService.LJIIJJI(1, C321620CjA.LIZ(), lValueOf2, creativeIdStr, logExtra, str4, C321640CjC.LIZJ, message.msgId);
                        }
                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                        if (awemeRawAd2 != null) {
                            logExtra = awemeRawAd2.getLogExtra();
                        }
                        iAdChatAgentLogService.LJIIJJI(1, C321620CjA.LIZ(), lValueOf2, creativeIdStr, logExtra, str4, C321640CjC.LIZJ, message.msgId);
                    }
                }
            }

            @Override // X.InterfaceC320950Ci5
            public final void LIZJ(Message message) {
                String creativeIdStr;
                AwemeRawAd awemeRawAd;
                this.LIZJ.put(message.replyUuid, Long.valueOf(System.currentTimeMillis()));
                if (LJII(this.LIZ, LJI(message, "answer_start")) == null) {
                    Aweme aweme = C321640CjC.LIZ;
                    String str3 = C321640CjC.LIZIZ;
                    String logExtra = null;
                    IAdChatAgentLogService iAdChatAgentLogService = (IAdChatAgentLogService) PluggableExtentionKt.pluggableSpi$default(IAdChatAgentLogService.class, false, false, false, 14, null);
                    if (iAdChatAgentLogService != null) {
                        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                            creativeIdStr = awemeRawAd.getCreativeIdStr();
                        } else {
                            creativeIdStr = null;
                            if (aweme != null) {
                            }
                            iAdChatAgentLogService.LJIIL(creativeIdStr, 1, C321620CjA.LIZ(), logExtra, str3, C321640CjC.LIZJ, message.msgId);
                        }
                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                        if (awemeRawAd2 != null) {
                            logExtra = awemeRawAd2.getLogExtra();
                        }
                        iAdChatAgentLogService.LJIIL(creativeIdStr, 1, C321620CjA.LIZ(), logExtra, str3, C321640CjC.LIZJ, message.msgId);
                    }
                }
            }

            @Override // X.InterfaceC320950Ci5
            public final void LIZLLL(Message message) {
                String creativeIdStr;
                AwemeRawAd awemeRawAd;
                AtomicInteger atomicIntegerPutIfAbsent;
                this.LIZIZ.put(message.uuid, Long.valueOf(System.currentTimeMillis()));
                if (LJII(this.LIZ, LJI(message, "question_start")) == null) {
                    Aweme aweme = C321640CjC.LIZ;
                    String str3 = C321640CjC.LIZIZ;
                    ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = C321620CjA.LIZ;
                    AtomicInteger atomicInteger = concurrentHashMap.get("_global");
                    if (atomicInteger == null && (atomicIntegerPutIfAbsent = concurrentHashMap.putIfAbsent("_global", (atomicInteger = new AtomicInteger(0)))) != null) {
                        atomicInteger = atomicIntegerPutIfAbsent;
                    }
                    atomicInteger.incrementAndGet();
                    String logExtra = null;
                    IAdChatAgentLogService iAdChatAgentLogService = (IAdChatAgentLogService) PluggableExtentionKt.pluggableSpi$default(IAdChatAgentLogService.class, false, false, false, 14, null);
                    if (iAdChatAgentLogService != null) {
                        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                            creativeIdStr = awemeRawAd.getCreativeIdStr();
                        } else {
                            creativeIdStr = null;
                            if (aweme != null) {
                            }
                            iAdChatAgentLogService.LJIIL(creativeIdStr, 0, C321620CjA.LIZ(), logExtra, str3, C321640CjC.LIZJ, message.msgId);
                        }
                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                        if (awemeRawAd2 != null) {
                            logExtra = awemeRawAd2.getLogExtra();
                        }
                        iAdChatAgentLogService.LJIIL(creativeIdStr, 0, C321620CjA.LIZ(), logExtra, str3, C321640CjC.LIZJ, message.msgId);
                    }
                }
            }

            public static String LJI(Message message, String str3) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(message.uuid);
                sbLIZ.append('_');
                sbLIZ.append(str3);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public static Boolean LJII(ConcurrentHashMap concurrentHashMap, String str3) {
                if (concurrentHashMap.containsKey(str3)) {
                    return (Boolean) concurrentHashMap.get(str3);
                }
                return (Boolean) concurrentHashMap.put(str3, Boolean.TRUE);
            }

            @Override // X.InterfaceC320950Ci5
            public final void LJFF(Message message, int i, String str3) {
                LJIIIIZZ(i, message.msgId, message.replyUuid, 0L, str3);
            }

            @Override // X.InterfaceC320950Ci5
            public final void LJ(int i, String str3, String str4, String str5) {
                long jCurrentTimeMillis;
                Long l = this.LIZJ.get(str4);
                if (l != null) {
                    jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
                } else {
                    jCurrentTimeMillis = 0;
                }
                LJIIIIZZ(i, str3, str4, jCurrentTimeMillis, str5);
            }

            public final void LJIIIIZZ(int i, String str3, String str4, long j, String str5) {
                long jLongValue;
                String creativeIdStr;
                AwemeRawAd awemeRawAd;
                Long lRemove = this.LIZLLL.remove(str4);
                long jLongValue2 = 0;
                if (lRemove != null) {
                    jLongValue = lRemove.longValue();
                } else {
                    jLongValue = 0;
                }
                Long lRemove2 = this.LJ.remove(str4);
                if (lRemove2 != null) {
                    jLongValue2 = lRemove2.longValue();
                }
                if (LJII(this.LIZ, str4) == null) {
                    Aweme aweme = C321640CjC.LIZ;
                    String str6 = C321640CjC.LIZIZ;
                    String logExtra = null;
                    IAdChatAgentLogService iAdChatAgentLogService = (IAdChatAgentLogService) PluggableExtentionKt.pluggableSpi$default(IAdChatAgentLogService.class, false, false, false, 14, null);
                    if (iAdChatAgentLogService != null) {
                        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                            creativeIdStr = awemeRawAd.getCreativeIdStr();
                        } else {
                            creativeIdStr = null;
                            if (aweme != null) {
                            }
                            iAdChatAgentLogService.LJI(creativeIdStr, logExtra, str6, str3, Long.valueOf(jLongValue), Long.valueOf(jLongValue2), Long.valueOf(j), str5, Long.valueOf(i));
                        }
                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                        if (awemeRawAd2 != null) {
                            logExtra = awemeRawAd2.getLogExtra();
                        }
                        iAdChatAgentLogService.LJI(creativeIdStr, logExtra, str6, str3, Long.valueOf(jLongValue), Long.valueOf(jLongValue2), Long.valueOf(j), str5, Long.valueOf(i));
                    }
                }
            }
        }, getLifecycle(), (CommerceAgentSevenSheetVM) assemVMLazy2.getValue()), IMessageAbility.class, this, null);
        C1558520qew.LJI(this, CommerceAgentFragmentScope.class, new CommerceAgentScreenTypeAbility(0), ICommerceAgentScreenTypeAbility.class, this, null);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        SR(this.LLJIJIL);
        CommerceAgentEnterParams commerceAgentEnterParams = this.LLJIJIL;
        if (commerceAgentEnterParams != null) {
            AssemVMLazy assemVMLazy = this.LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
            ((CommerceAgentSugDataVM) assemVMLazy.getValue()).LL = commerceAgentEnterParams.commerceAgentActionBarItems;
        }
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 62), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(requireActivity()), R.layout.ak8, viewGroup, false);
        this.LLJILJIL = viewTd;
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

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
