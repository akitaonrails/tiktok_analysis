package com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.banner;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObjectS392S0100000_17;
import Y.AObserverS221S0100000_17;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.CampaignPanelScope;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PackageListAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.UIListContentAssem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class RechargeBannerAssem extends UIListContentAssem<RechargeBannerViewModel> implements InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public volatile PackageListAbility LLJI;
    public volatile TouchPointAbility LLJIJIL;
    public C127G LLJILJIL;
    public InterfaceC665370Q7z LLJILJILJ;
    public C0QSJ LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RechargeBannerAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/recharge/banner/RechargeBannerViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(RechargeBannerAssem.class, "selectItemAbility", "getSelectItemAbility()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/communication/PackageListAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(RechargeBannerAssem.class, "touchPointAbility", "getTouchPointAbility()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/communication/TouchPointAbility;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public RechargeBannerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RechargeBannerViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS561S0100000_17(c19719912DlLIZ, 199), AFwS254S0000000_17.get$arr$(76), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 198));
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CampaignPanelScope.class}).unbindAbility(ip(), RechargeBannerViewModel.class);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CampaignPanelScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CampaignPanelScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CampaignPanelScope.class}).bindAbility(ip(), RechargeBannerViewModel.class);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LJIIJ = false;
        c20603715jn.LIZ = 2;
        c20603715jn.LJIIIZ = "recharge_panel";
        return c20603715jn;
    }

    public final C0QSJ Lo() {
        C0QSJ c0qsj = this.LLJILLL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJILJILJ;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJILJILJ = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{CampaignPanelScope.class});
        this.LLJILLL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: No, reason: merged with bridge method [inline-methods] */
    public final RechargeBannerViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (RechargeBannerViewModel) assemVMLazy.getValue();
    }

    public final void Oo() {
        PackageListAbility packageListAbility = this.LLJI;
        if (packageListAbility == null) {
            synchronized (this) {
                packageListAbility = this.LLJI;
                if (packageListAbility == null) {
                    C0QSJ c0qsjLo = Lo();
                    if (c0qsjLo != null) {
                        packageListAbility = (PackageListAbility) c0qsjLo.getAbility(PackageListAbility.class);
                        C687700QyG.LJ(packageListAbility, PackageListAbility.class);
                    } else {
                        packageListAbility = null;
                    }
                    this.LLJI = packageListAbility;
                }
            }
        }
        MutableLiveData mutableLiveDataPV1 = packageListAbility.pV1();
        getActualLifecycleOwner();
        mutableLiveDataPV1.observe(this, new AObserverS221S0100000_17(this, 12));
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJILJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJILJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{RechargeBannerViewModel.class, new AObjectS392S0100000_17(this, 41)}, defaultViewModelProviderFactory);
                    this.LLJILJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r5) {
        /*
            r4 = this;
            super.onViewCreated(r5)
            X.15jv r3 = r4.Go()
            X.0GhM r1 = new X.0GhM
            r0 = 15
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r1.<init>(r0)
            r3.addItemDecoration(r1)
            r0 = 1
            r3.setOrientation(r0)
            java.lang.Class[] r2 = new java.lang.Class[r0]
            java.lang.Class<com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.banner.RechargeBannerCell> r0 = com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.banner.RechargeBannerCell.class
            r1 = 0
            r2[r1] = r0
            r3.LJIILJJIL(r2)
            com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.banner.RechargeBannerViewModel r0 = r4.ip()
            r0.LLILLJJLI = r1
            r0.manualListRefresh()
            com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility r0 = r4.LLJIJIL
            if (r0 != 0) goto L58
            monitor-enter(r4)
            com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility r0 = r4.LLJIJIL     // Catch: java.lang.Throwable -> L53
            if (r0 != 0) goto L51
            X.0QSJ r1 = r4.Lo()     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L4f
            java.lang.Class<com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility> r0 = com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L53
            com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility r0 = (com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility) r0     // Catch: java.lang.Throwable -> L53
        L4b:
            r4.LLJIJIL = r0     // Catch: java.lang.Throwable -> L53
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L53
            goto L56
        L4f:
            r0 = 0
            goto L4b
        L51:
            monitor-exit(r4)
            goto L58
        L53:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L56:
            if (r0 == 0) goto L8c
        L58:
            X.0g43 r1 = r0.nH0()
            com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.CampaignRechargeMetaData r1 = (com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.CampaignRechargeMetaData) r1
            if (r1 == 0) goto L8c
            com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.banner.RechargeBannerViewModel r0 = r4.ip()
            r0.manualListRefresh()
            android.view.View r2 = r4.LJJIJL()
            webcast.data.FirstRechargeModel$ActivityBanner r1 = r1.activityBanner
            if (r1 == 0) goto L8c
            webcast.data.TouchPointBackground r0 = r1.background
            X.C1146870fwz.LIZIZ(r2, r0)
            boolean r0 = r2 instanceof X.InterfaceC1080960eEg
            if (r0 == 0) goto L8c
            X.0eEg r2 = (X.InterfaceC1080960eEg) r2
            float r0 = r1.borderRadius
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            float r0 = (float) r0
            r2.setRadius(r0)
        L8c:
            r4.Oo()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.banner.RechargeBannerAssem.onViewCreated(android.view.View):void");
    }
}
