package com.ss.android.ugc.aweme.setting.serverpush.compose.unlogin;

import X.C03H5;
import X.C098200Yq;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C11JF;
import X.C11NZ;
import X.C11S5;
import X.C13LE;
import X.C14X7;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719212De;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20308114dD;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C452070Ho5;
import X.C616540OGe;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C824390WVp;
import X.C824420WVs;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ARunnableS34S1100000_30;
import Y.AfS199S0100000_30;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.ss.android.ugc.aweme.setting.serverpush.model.NotificationSettings;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS42S0010000_30;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.AwS644S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class PushSettingsUnLoginComposeFragment extends AmeBaseFragment implements InterfaceC724530SbT {
    public static final C14X7 LLILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6JiJiOiohPiA+OTogIGsvJiIjHELIOSJzYpZzo9JCorICF9GDA/IRw2PDElJyggHSsAJig6JgYjJD88OyAKOy40JSAiPQ==";
    public final List<Function2<InterfaceC1680500tpg, Integer, Unit>> LL = new ArrayList();
    public final AssemVMLazy LLILLJJLI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.14X7] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PushSettingsUnLoginComposeFragment.class, "pushSettingsUnLoginVM", "getPushSettingsUnLoginVM()Lcom/ss/android/ugc/aweme/setting/serverpush/compose/unlogin/PushSettingsUnLoginVM;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILLL = new Object() { // from class: X.14X7
        };
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

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final PushSettingsUnLoginVM OR() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        return (PushSettingsUnLoginVM) assemVMLazy.getValue();
    }

    public PushSettingsUnLoginComposeFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PushSettingsUnLoginVM.class);
        this.LLILLJJLI = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS562S0100000_18(c19719912DlLIZ, 2221), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2222), AFwS274S0000000_30.get$arr$(77));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(PushSettingsUnLoginComposeFragment.class.getName());
        }
        super.onResume();
        PushSettingsUnLoginVM pushSettingsUnLoginVMOR = OR();
        Context contextRequireContext = requireContext();
        boolean zLIZJ = C824390WVp.LIZJ(contextRequireContext);
        pushSettingsUnLoginVMOR.setState(new AwS42S0010000_30(zLIZJ, 5));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, zLIZJ ? "on" : "off");
        C20684815ws.LJIILLIIL("notifications_show", c2344009Gk.LIZ);
        pushSettingsUnLoginVMOR.LLILLJJLI = PushSettingsUnLoginVM.LLILZLL;
        pushSettingsUnLoginVMOR.withState(new AwS609S0100000_30(pushSettingsUnLoginVMOR, 353));
        if (TextUtils.isEmpty(((Keva) pushSettingsUnLoginVMOR.LL.getValue()).getString("need_sync_channel_push_logout", "")) || !C824390WVp.LIZJ(contextRequireContext)) {
            return;
        }
        String string = ((Keva) pushSettingsUnLoginVMOR.LL.getValue()).getString("need_sync_channel_push_logout", "");
        for (String str : C1697810uHb.LJIIJJI("recommend_video_push", "other_channel")) {
            if (TextUtils.equals(str, string) && C824420WVs.LIZ(string)) {
                ARunnableS34S1100000_30 aRunnableS34S1100000_30 = new ARunnableS34S1100000_30(pushSettingsUnLoginVMOR, str, 12);
                C11JF c11jf = pushSettingsUnLoginVMOR.LLILZ;
                if (c11jf == null || c11jf.isDisposed()) {
                    aRunnableS34S1100000_30.run();
                } else {
                    ((ArrayList) pushSettingsUnLoginVMOR.LLILLL).add(aRunnableS34S1100000_30);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ArrayList) this.LL).add(new C19719212De(1137831604, new AwS644S0100000_30(this, 14), true));
        ((ArrayList) this.LL).add(new C19719212De(-2125893091, new AwS644S0100000_30(this, 15), true));
        ((ArrayList) this.LL).add(new C19719212De(1753747388, new AwS644S0100000_30(this, 16), true));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void MR(X.InterfaceC1680500tpg r10, int r11) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.serverpush.compose.unlogin.PushSettingsUnLoginComposeFragment.MR(X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void NR(X.InterfaceC1680500tpg r19, int r20) {
        /*
            r18 = this;
            r0 = 1206661874(0x47ec32f2, float:120933.89)
            r1 = r19
            X.13ZC r15 = r1.LJIIJ(r0)
            r3 = r20
            r0 = r3 & 6
            r1 = 2
            r4 = r18
            if (r0 != 0) goto L71
            boolean r0 = r15.LJII(r4)
            if (r0 == 0) goto L6f
            r0 = 4
        L19:
            r0 = r0 | r3
        L1a:
            r0 = r0 & 3
            if (r0 != r1) goto L36
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L36
            r15.LIZJ()
        L27:
            X.13Ys r2 = r15.LJJJJZI()
            if (r2 == 0) goto L35
            kotlin.jvm.internal.AwS183S0101000_30 r1 = new kotlin.jvm.internal.AwS183S0101000_30
            r0 = 2
            r1.<init>(r4, r3, r0)
            r2.LIZLLL = r1
        L35:
            return
        L36:
            r5 = 0
            r8 = 0
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            boolean r0 = r15.LJII(r4)
            java.lang.Object r14 = r15.LJJ()
            if (r0 != 0) goto L51
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r14 != r0) goto L5b
        L51:
            kotlin.jvm.internal.AwS609S0100000_30 r14 = new kotlin.jvm.internal.AwS609S0100000_30
            r0 = 84
            r14.<init>(r4, r0)
            r15.LJJIJIIJI(r14)
        L5b:
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            r15.LJJJJL(r8)
            r17 = 511(0x1ff, float:7.16E-43)
            r6 = r5
            r7 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r8
            r13 = r5
            r16 = r8
            X.C636400Oxi.LIZ(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L27
        L6f:
            r0 = 2
            goto L19
        L71:
            r0 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.serverpush.compose.unlogin.PushSettingsUnLoginComposeFragment.NR(X.0tpg, int):void");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        PushSettingsUnLoginVM pushSettingsUnLoginVMOR = OR();
        InterfaceC420801kM interfaceC420801kMLJJZ = C11NZ.LJJJJI(new Callable() { // from class: X.10bh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("PushSettingsUnLoginVM@2a0b.requestUnLoginPushSettings$1");
                NotificationSettings notificationSettingsLJFF = PushSettingsApiManager.LJFF();
                C1C7U.LIZIZ("PushSettingsUnLoginVM@2a0b.requestUnLoginPushSettings$1");
                return notificationSettingsLJFF;
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new AfS199S0100000_30(pushSettingsUnLoginVMOR, 1), new AfS199S0100000_30(pushSettingsUnLoginVMOR, 3), new C20308114dD(pushSettingsUnLoginVMOR, 1));
        pushSettingsUnLoginVMOR.LLILZ = (C11JF) interfaceC420801kMLJJZ;
        pushSettingsUnLoginVMOR.disposeOnClear(interfaceC420801kMLJJZ);
        C736680Sv4.LJIIIIZZ(this, OR(), new C2217381BqS() { // from class: X.14X9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C14XB) obj).LLILZ;
            }
        }, null, new AwS632S0100000_18(this, 194), 6);
        C736680Sv4.LJIIIIZZ(this, OR(), new C2217381BqS() { // from class: X.14XA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C14XB) obj).LLILZIL;
            }
        }, null, new AwS642S0100000_28(this, 36), 6);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setFitsSystemWindows(true);
        composeView.setContent(new C19719212De(976720529, new AwS455S0200000_19(composeView, this, 19), true));
        try {
            ViewTreeLifecycleOwner.set(composeView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(composeView, this);
            composeView.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return composeView;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return composeView;
        }
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
