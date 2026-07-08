package com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.panels;

import X.C03H5;
import X.C0IPC;
import X.C0PEM;
import X.C0QSJ;
import X.C0ZP4;
import X.C1144040fsQ;
import X.C1149560g1K;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1770850wBP;
import X.C1806920x7a;
import X.C19474211Gy;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C497740JfY;
import X.C500260Jjc;
import X.C673150Qan;
import X.C687700QyG;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C963140bAe;
import X.InterfaceC0148002o;
import X.InterfaceC1094160eZy;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC737790Swr;
import X.ViewOnLayoutChangeListenerC1151610g4d;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.CampaignRechargeMetaData;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.CampaignPanelScope;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PackageListAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PanelHostAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.legal.LegalViewModel;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.banner.RechargeBannerViewModel;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
public final class CampaignRechargePanel extends LiveSheetFragment implements InterfaceC724530SbT, PanelHostAbility, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISg8JWEhLTMpJzo2ZjY4Oy4nHELIOSLSI1Zz8yJiAgZz02Ky0tOyg2ZjUtJyo/O2sPKCIjKSwrJx02Ky0tOyg2GCQiLCM=";
    public final CampaignRechargePanel LLJLLL;
    public RechargePanelInputParams LLJZ;
    public boolean LLJZIJLIL;
    public final ViewOnLayoutChangeListenerC1151610g4d LLL;
    public volatile TouchPointAbility LLLF;
    public PanelHostAbility LLLFF;
    public LegalViewModel LLLFFI;
    public PackageListAbility LLLFZ;
    public TouchPointAbility LLLI;
    public RechargeBannerViewModel LLLII;
    public InterfaceC665370Q7z LLLIIII;
    public C0QSJ LLLIIIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CampaignRechargePanel.class, "touchPointAbility", "getTouchPointAbility()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/communication/TouchPointAbility;", 0);
        C13LE.LIZ.getClass();
        LLLIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == PanelHostAbility.class) {
            this.LLLFF = (PanelHostAbility) obj;
        } else if (cls == LegalViewModel.class) {
            this.LLLFFI = (LegalViewModel) obj;
        } else if (cls == PackageListAbility.class) {
            this.LLLFZ = (PackageListAbility) obj;
        } else if (cls == TouchPointAbility.class) {
            this.LLLI = (TouchPointAbility) obj;
        } else if (cls == RechargeBannerViewModel.class) {
            this.LLLII = (RechargeBannerViewModel) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CampaignPanelScope.class, CampaignPanelScope.class});
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PanelHostAbility
    public final void closePanel() {
        close(1);
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == PanelHostAbility.class) {
            return this.LLLFF;
        }
        if (cls == LegalViewModel.class) {
            return this.LLLFFI;
        }
        if (cls == PackageListAbility.class) {
            return this.LLLFZ;
        }
        if (cls == TouchPointAbility.class) {
            return this.LLLI;
        }
        if (cls == RechargeBannerViewModel.class) {
            return this.LLLII;
        }
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

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CampaignPanelScope.class);
        arrayList.add(CampaignPanelScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CampaignPanelScope.class);
        return arrayList;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C0IPC.LIZ();
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        return true;
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PanelHostAbility
    public final void lW0() {
        this.LLJZIJLIL = true;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == PanelHostAbility.class) {
            this.LLLFF = null;
        } else if (cls == LegalViewModel.class) {
            this.LLLFFI = null;
        } else if (cls == PackageListAbility.class) {
            this.LLLFZ = null;
        } else if (cls == TouchPointAbility.class) {
            this.LLLI = null;
        } else if (cls == RechargeBannerViewModel.class) {
            this.LLLII = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility uS() {
        /*
            r4 = this;
            com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility r0 = r4.LLLF
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility r0 = r4.LLLF     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLLIIIIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLLIIII     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLLIIII = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.CampaignPanelScope> r1 = com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.CampaignPanelScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLLIIIIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility> r0 = com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility r0 = (com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLLF = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.panels.CampaignRechargePanel.uS():com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility");
    }

    public CampaignRechargePanel() {
        C963140bAe.LIZIZ();
        this.LLJLLL = this;
        this.LLL = new ViewOnLayoutChangeListenerC1151610g4d(this, 11);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        View view = getView();
        if (view != null) {
            view.removeOnLayoutChangeListener(this.LLL);
        }
        super.onDestroyView();
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PanelHostAbility
    public final RechargePanelInputParams getInputParams() {
        return this.LLJZ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        CampaignRechargeMetaData campaignRechargeMetaData;
        TouchPointAbility touchPointAbilityUS = uS();
        if (touchPointAbilityUS != null && (campaignRechargeMetaData = (CampaignRechargeMetaData) touchPointAbilityUS.nH0()) != null && campaignRechargeMetaData.panelBg != null) {
            return 0;
        }
        return C497740JfY.LIZLLL(R.attr.ezn, context);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CampaignPanelScope.class}).unbindAbility(this.LLJLLL, PanelHostAbility.class);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(3, null);
        sheetOptions.cornerRadius = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        sheetOptions.draggable = false;
        sheetOptions.cancelable = false;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C687700QyG.LJI(this);
        C500260Jjc.LJJJJJ(this, C0PEM.LIZJ, new C1144040fsQ(this, null), 2);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CampaignPanelScope.class}).bindAbility(this.LLJLLL, PanelHostAbility.class);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        InterfaceC1094160eZy.G1.LIZJ(Boolean.TRUE);
        if (C1149560g1K.LIZLLL(this.LLJZ)) {
            C1806920x7a.LIZIZ(getContext());
        }
    }

    public static boolean wS(int i, View view) {
        View viewFindViewById = view.findViewById(R.id.sw2);
        if (viewFindViewById == null) {
            return false;
        }
        float fLIZIZ = i * 0.73f;
        if (C497740JfY.LIZIZ(616.0f) <= fLIZIZ) {
            fLIZIZ = C497740JfY.LIZIZ(616.0f);
        }
        int i2 = (int) fLIZIZ;
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (layoutParams == null || layoutParams.height == i2) {
            return false;
        }
        layoutParams.height = i2;
        C786410Ut5.W5(viewFindViewById, layoutParams);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e  */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.panels.CampaignRechargePanel.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g2p, viewGroup, false);
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
