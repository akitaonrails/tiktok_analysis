package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.assem;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C019F;
import X.C06MM;
import X.C0WZX;
import X.C12953055b;
import X.C13LE;
import X.C14EU;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C1701330uNH;
import X.C1790980whs;
import X.C1808250x9j;
import X.C1822260xWK;
import X.C1823940xZ2;
import X.C1823950xZ3;
import X.C1824010xZ9;
import X.C197039127h;
import X.C19719912Dl;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C497350Jev;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.ability.IPcsServiceOptInTargetPageAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.dialog.PcsServicePlusOptinScope;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.viewmodel.PcsServicePlusOptinVM;
import com.bytedance.android.livesdk.livesetting.broadcast.subscription.SubscribeUpsellLynxUrlSetting;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsServicePlusOptinBottomAssem extends UISlotAssem implements IPcsServiceOptInTargetPageAbility, InterfaceC737790Swr {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final PcsServicePlusOptinBottomAssem LLJJI = this;
    public final AssemVMLazy LLJJIII;
    public C1822260xWK LLJJIJI;
    public C197039127h LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServicePlusOptinBottomAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/optin/viewmodel/PcsServicePlusOptinVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsServicePlusOptinBottomAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServicePlusOptinVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C12953055b(c19719912DlLIZ), new C1824010xZ9(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fz6;
    }

    public final C1822260xWK hp() {
        if (this.LLJJIJI == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1822260xWK.class, null);
            this.LLJJIJI = interfaceC1555100qZQLIZIZ != null ? (C1822260xWK) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIJI;
    }

    public final void ip() {
        String showEntrance;
        Activity activityLIZ;
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams;
        C1822260xWK c1822260xWKHp = hp();
        if (c1822260xWKHp == null || (pcsServicePlusOptinPageParams = c1822260xWKHp.LLILLJJLI) == null || (showEntrance = pcsServicePlusOptinPageParams.getShowEntrance()) == null) {
            showEntrance = "";
        }
        Context context = getContext();
        if (context == null || (activityLIZ = C06MM.LIZ(context)) == null) {
            return;
        }
        Intent intentLIZ = C497350Jev.LIZ(activityLIZ, showEntrance, true, false, false, false, 236);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLIZ, intentLIZ, "Context_startActivity_1");
        C1701330uNH.LIZ(intentLIZ, activityLIZ);
        C2204961BRm.LJIILLIIL(activityLIZ, intentLIZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSePE4qAkAHkvhoPDXzszdkRe7BLFK2FcFi1ZCJLY80Uvas4vPMowoIRipmgHaqGUNAXd3OfbtJ5bNgyV7TrllSCcw==", null));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.ability.IPcsServiceOptInTargetPageAbility
    public final String j22() {
        String showEntrance;
        String anchorId;
        String anchorId2;
        String pcsTrackContext;
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams;
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams2;
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams3;
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams4;
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams5;
        HashMap<String, String> extra;
        C1822260xWK c1822260xWKHp = hp();
        String str = (c1822260xWKHp == null || (pcsServicePlusOptinPageParams5 = c1822260xWKHp.LLILLJJLI) == null || (extra = pcsServicePlusOptinPageParams5.getExtra()) == null) ? null : extra.get("ad_ttclid");
        if (str == null) {
            str = "";
        }
        SubscribeUpsellLynxUrlSetting subscribeUpsellLynxUrlSetting = SubscribeUpsellLynxUrlSetting.INSTANCE;
        C1822260xWK c1822260xWKHp2 = hp();
        if (c1822260xWKHp2 == null || (pcsServicePlusOptinPageParams4 = c1822260xWKHp2.LLILLJJLI) == null || (showEntrance = pcsServicePlusOptinPageParams4.getShowEntrance()) == null) {
            showEntrance = "";
        }
        C1822260xWK c1822260xWKHp3 = hp();
        if (c1822260xWKHp3 == null || (pcsServicePlusOptinPageParams3 = c1822260xWKHp3.LLILLJJLI) == null || (anchorId = pcsServicePlusOptinPageParams3.getAnchorId()) == null) {
            anchorId = "";
        }
        C1822260xWK c1822260xWKHp4 = hp();
        if (c1822260xWKHp4 == null || (pcsServicePlusOptinPageParams2 = c1822260xWKHp4.LLILLJJLI) == null || (anchorId2 = pcsServicePlusOptinPageParams2.getAnchorId()) == null) {
            anchorId2 = "";
        }
        C1822260xWK c1822260xWKHp5 = hp();
        if (c1822260xWKHp5 == null || (pcsServicePlusOptinPageParams = c1822260xWKHp5.LLILLJJLI) == null || (pcsTrackContext = pcsServicePlusOptinPageParams.getPcsTrackContext()) == null) {
            pcsTrackContext = "";
        }
        return subscribeUpsellLynxUrlSetting.getSmbIndustrySelection(showEntrance, anchorId, anchorId2, true, true, pcsTrackContext, new C1823940xZ2(str));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.ability.IPcsServiceOptInTargetPageAbility
    public final String ui1() {
        String showEntrance;
        String pcsTrackContext;
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams;
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams2;
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams3;
        HashMap<String, String> extra;
        C1822260xWK c1822260xWKHp = hp();
        String str = (c1822260xWKHp == null || (pcsServicePlusOptinPageParams3 = c1822260xWKHp.LLILLJJLI) == null || (extra = pcsServicePlusOptinPageParams3.getExtra()) == null) ? null : extra.get("ad_ttclid");
        if (str == null) {
            str = "";
        }
        SubscribeUpsellLynxUrlSetting subscribeUpsellLynxUrlSetting = SubscribeUpsellLynxUrlSetting.INSTANCE;
        C1822260xWK c1822260xWKHp2 = hp();
        if (c1822260xWKHp2 == null || (pcsServicePlusOptinPageParams2 = c1822260xWKHp2.LLILLJJLI) == null || (showEntrance = pcsServicePlusOptinPageParams2.getShowEntrance()) == null) {
            showEntrance = "";
        }
        C1822260xWK c1822260xWKHp3 = hp();
        if (c1822260xWKHp3 == null || (pcsServicePlusOptinPageParams = c1822260xWKHp3.LLILLJJLI) == null || (pcsTrackContext = pcsServicePlusOptinPageParams.getPcsTrackContext()) == null) {
            pcsTrackContext = "";
        }
        return subscribeUpsellLynxUrlSetting.getSmbOptInServiceEnableSchema(showEntrance, "1", "1", pcsTrackContext, new C1823950xZ3(str));
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PcsServicePlusOptinScope.class}).unbindAbility(this.LLJJI, IPcsServiceOptInTargetPageAbility.class);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C1790980whs c1790980whs) {
        C1822260xWK c1822260xWKHp = hp();
        if (c1822260xWKHp != null) {
            c1822260xWKHp.LL.invoke();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.m02);
        this.LLJJIJIIJIL = c197039127h;
        if (c197039127h != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xYy
                {
                    super(300L);
                }

                /* JADX WARN: Removed duplicated region for block: B:62:0x00fa  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x0112  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x0119 A[PHI: r9
                  0x0119: PHI (r9v1 boolean) = (r9v0 boolean), (r9v3 boolean), (r9v3 boolean) binds: [B:67:0x0116, B:51:0x00cc, B:53:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // X.AbstractViewOnClickListenerC1637610siV
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(android.view.View r14) {
                    /*
                        Method dump skipped, instruction units count: 498
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1823900xYy.LIZ(android.view.View):void");
                }
            }, c197039127h);
        }
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0xYm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1823670xYb) obj).LLILLJJLI;
            }
        }, null, new C1808250x9j(this), 6);
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PcsServicePlusOptinScope.class}).bindAbility(this.LLJJI, IPcsServiceOptInTargetPageAbility.class);
    }
}
