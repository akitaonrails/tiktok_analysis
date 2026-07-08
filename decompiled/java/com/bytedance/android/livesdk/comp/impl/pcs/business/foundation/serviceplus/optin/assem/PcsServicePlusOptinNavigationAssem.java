package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.assem;

import X.C1554960qZC;
import X.C1558520qew;
import X.C1822260xWK;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionFAQMap;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionFAQSetting;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsServicePlusOptinNavigationAssem extends UISlotAssem {
    public C1822260xWK LLJJI;
    public LiveIconView LLJJIII;
    public LiveIconView LLJJIJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fz9;
    }

    public final C1822260xWK hp() {
        if (this.LLJJI == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1822260xWK.class, null);
            this.LLJJI = interfaceC1555100qZQLIZIZ != null ? (C1822260xWK) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJI;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIII = (LiveIconView) view.findViewById(R.id.ppf);
        this.LLJJIJI = (LiveIconView) view.findViewById(R.id.pph);
        LiveIconView liveIconView = this.LLJJIII;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0xYT
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Function0<Unit> function0;
                    C1822260xWK c1822260xWKHp = this.LL.hp();
                    if (c1822260xWKHp != null && (function0 = c1822260xWKHp.LL) != null) {
                        function0.invoke();
                    }
                }
            });
        }
        LiveIconView liveIconView2 = this.LLJJIJI;
        if (liveIconView2 != null) {
            C786410Ut5.g8(liveIconView2, new View.OnClickListener() { // from class: X.0xYS
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String showEntrance;
                    String anchorId;
                    String anchorId2;
                    PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams;
                    PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams2;
                    PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams3;
                    LiveSubscriptionFAQMap value = LiveSubscriptionFAQSetting.INSTANCE.getValue();
                    C1822260xWK c1822260xWKHp = this.LL.hp();
                    if (c1822260xWKHp == null || (pcsServicePlusOptinPageParams3 = c1822260xWKHp.LLILLJJLI) == null || (showEntrance = pcsServicePlusOptinPageParams3.getShowEntrance()) == null) {
                        showEntrance = "";
                    }
                    C1822260xWK c1822260xWKHp2 = this.LL.hp();
                    if (c1822260xWKHp2 == null || (pcsServicePlusOptinPageParams2 = c1822260xWKHp2.LLILLJJLI) == null || (anchorId = pcsServicePlusOptinPageParams2.getAnchorId()) == null) {
                        anchorId = "";
                    }
                    C1822260xWK c1822260xWKHp3 = this.LL.hp();
                    if (c1822260xWKHp3 == null || (pcsServicePlusOptinPageParams = c1822260xWKHp3.LLILLJJLI) == null || (anchorId2 = pcsServicePlusOptinPageParams.getAnchorId()) == null) {
                        anchorId2 = "";
                    }
                    String smbOptinFaq = value.getSmbOptinFaq(showEntrance, anchorId, anchorId2, false, "service_term_page", false, true);
                    Context context = this.LL.getContext();
                    if (context != null) {
                        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, smbOptinFaq, null);
                    }
                }
            });
        }
    }
}
