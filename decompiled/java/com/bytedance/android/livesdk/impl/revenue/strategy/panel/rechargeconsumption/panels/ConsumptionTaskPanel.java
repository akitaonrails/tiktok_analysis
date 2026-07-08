package com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.panels;

import X.C03H5;
import X.C0IJT;
import X.C0QSJ;
import X.C0ZP4;
import X.C1143850fs7;
import X.C1146870fwz;
import X.C1151190g3x;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C21538719Qz;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C464790IKn;
import X.C474500IjA;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC0148002o;
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
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.RechargeConsumptionMetaData;
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
import kotlin.jvm.internal.AwS596S0100000_17;
import webcast.data.TPActivityArea;
import webcast.data.TPConsumptionArea;
import webcast.data.TouchPointBackground;
import webcast.data.TouchPointColor;

/* JADX INFO: loaded from: classes18.dex */
public final class ConsumptionTaskPanel extends AbsTaskDetailPanel implements InterfaceC724530SbT, PanelHostAbility, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISg8JWEhLTMpJzo2ZjY4Oy4nLSI1ZzHELIOS8yJiAgZz02Ky0tOyg2KyoiOjo+ODElJiF9OCQiLCMgZgYjJzwmJTU4ICA9HCQ/Ih8yJiAg";
    public final ConsumptionTaskPanel LLJZ = this;
    public RechargePanelInputParams LLJZIJLIL;
    public volatile TouchPointAbility LLL;
    public PanelHostAbility LLLF;
    public LegalViewModel LLLFF;
    public PackageListAbility LLLFFI;
    public TouchPointAbility LLLFZ;
    public RechargeBannerViewModel LLLI;
    public InterfaceC665370Q7z LLLII;
    public C0QSJ LLLIIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ConsumptionTaskPanel.class, "touchPointAbility", "getTouchPointAbility()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/communication/TouchPointAbility;", 0);
        C13LE.LIZ.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == PanelHostAbility.class) {
            this.LLLF = (PanelHostAbility) obj;
        } else if (cls == LegalViewModel.class) {
            this.LLLFF = (LegalViewModel) obj;
        } else if (cls == PackageListAbility.class) {
            this.LLLFFI = (PackageListAbility) obj;
        } else if (cls == TouchPointAbility.class) {
            this.LLLFZ = (TouchPointAbility) obj;
        } else if (cls == RechargeBannerViewModel.class) {
            this.LLLI = (RechargeBannerViewModel) obj;
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
            return this.LLLF;
        }
        if (cls == LegalViewModel.class) {
            return this.LLLFF;
        }
        if (cls == PackageListAbility.class) {
            return this.LLLFFI;
        }
        if (cls == TouchPointAbility.class) {
            return this.LLLFZ;
        }
        if (cls == RechargeBannerViewModel.class) {
            return this.LLLI;
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

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PanelHostAbility
    public final void lW0() {
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == PanelHostAbility.class) {
            this.LLLF = null;
        } else if (cls == LegalViewModel.class) {
            this.LLLFF = null;
        } else if (cls == PackageListAbility.class) {
            this.LLLFFI = null;
        } else if (cls == TouchPointAbility.class) {
            this.LLLFZ = null;
        } else if (cls == RechargeBannerViewModel.class) {
            this.LLLI = null;
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
    public final com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility yS() {
        /*
            r4 = this;
            com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility r0 = r4.LLL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility r0 = r4.LLL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLLIIII     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLLII     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLLII = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.CampaignPanelScope> r1 = com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.CampaignPanelScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLLIIII = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility> r0 = com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility r0 = (com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLL = r0     // Catch: java.lang.Throwable -> L35
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.panels.ConsumptionTaskPanel.yS():com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility");
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PanelHostAbility
    public final RechargePanelInputParams getInputParams() {
        return this.LLJZIJLIL;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CampaignPanelScope.class}).unbindAbility(this.LLJZ, PanelHostAbility.class);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C687700QyG.LJI(this);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CampaignPanelScope.class}).bindAbility(this.LLJZ, PanelHostAbility.class);
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.panels.AbsTaskDetailPanel, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RechargePanelInputParams rechargePanelInputParams;
        RechargeConsumptionMetaData rechargeConsumptionMetaData;
        TPActivityArea tPActivityArea;
        TouchPointBackground touchPointBackground;
        View view2;
        View viewFindViewById;
        RechargeConsumptionMetaData rechargeConsumptionMetaData2;
        TPConsumptionArea tPConsumptionArea;
        View view3;
        C21538719Qz c21538719Qz;
        TouchPointColor touchPointColor;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            rechargePanelInputParams = (RechargePanelInputParams) arguments.getParcelable("KEY_INPUT_PARAMS");
        } else {
            rechargePanelInputParams = null;
        }
        this.LLJZIJLIL = rechargePanelInputParams;
        C723850SaN.LIZ(this, false, null, new AwS596S0100000_17(this, 176), 3);
        RechargePanelInputParams rechargePanelInputParams2 = this.LLJZIJLIL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_incentive_task_page_show");
        C1151190g3x.LIZJ(c474500IjALIZ, rechargePanelInputParams2, null);
        c474500IjALIZ.LIZ();
        TouchPointAbility touchPointAbilityYS = yS();
        if (touchPointAbilityYS != null && (rechargeConsumptionMetaData2 = (RechargeConsumptionMetaData) touchPointAbilityYS.nH0()) != null && (tPConsumptionArea = rechargeConsumptionMetaData2.consumptionArea) != null && (view3 = getView()) != null && (c21538719Qz = (C21538719Qz) view3.findViewById(R.id.d_z)) != null) {
            C1146870fwz.LIZIZ(c21538719Qz, tPConsumptionArea.background);
            TouchPointBackground touchPointBackground2 = tPConsumptionArea.background;
            if (touchPointBackground2 != null && (touchPointColor = touchPointBackground2.color) != null) {
                C1143850fs7 c1143850fs7 = C1143850fs7.LIZ;
                String str = touchPointColor.light;
                c1143850fs7.getClass();
                int iLIZIZ = C1143850fs7.LIZIZ(str);
                View view4 = getView();
                if (view4 != null) {
                    view4.setTag(R.id.n66, Integer.valueOf(iLIZIZ));
                }
                C464790IKn.LIZ.LJFF();
            }
            float fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(tPConsumptionArea.borderRadius));
            c21538719Qz.setTopStartRadius(fLIZIZ);
            c21538719Qz.setTopEndRadius(fLIZIZ);
        }
        TouchPointAbility touchPointAbilityYS2 = yS();
        if (touchPointAbilityYS2 != null && (rechargeConsumptionMetaData = (RechargeConsumptionMetaData) touchPointAbilityYS2.nH0()) != null && (tPActivityArea = rechargeConsumptionMetaData.activityArea) != null && (touchPointBackground = tPActivityArea.background) != null && (view2 = getView()) != null && (viewFindViewById = view2.findViewById(R.id.d_r)) != null) {
            C1146870fwz.LIZIZ(viewFindViewById, touchPointBackground);
        }
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.panels.AbsTaskDetailPanel
    public final View uS(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C786410Ut5.Td(layoutInflater, R.layout.g2f, viewGroup, false);
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.panels.AbsTaskDetailPanel
    public final View wS(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C786410Ut5.Td(layoutInflater, R.layout.g2h, viewGroup, false);
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
