package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.viewmodel;

import X.C09JN;
import X.C1106750euH;
import X.C1554960qZC;
import X.C1808280x9m;
import X.C1822230xWH;
import X.C1822260xWK;
import X.C1823660xYa;
import X.C1823670xYb;
import X.C1823690xYd;
import X.C1823740xYi;
import X.C2097608Jq;
import X.C518720KVy;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1823810xYp;
import X.InterfaceC518730KVz;
import X.InterfaceC665370Q7z;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.viewmodel.PcsServicePlusOptinVM;
import com.bytedance.android.livesdk.livesetting.broadcast.pcs.LivePcsOnboardingPerfOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.subscription.SubscribeUpsellLynxUrlSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsServicePlusOptinVM extends AssemViewModel<C1823670xYb> {
    public final InterfaceC518730KVz LL;
    public final InterfaceC1823810xYp LLILLJJLI;
    public InterfaceC665370Q7z LLILLL;
    public C1822260xWK LLILZ;
    public int LLILZIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1823670xYb(0);
    }

    public final String vQ2() {
        String showEntrance;
        String anchorId;
        String anchorId2;
        String pcsTrackContext;
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams;
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams2;
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams3;
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams4;
        SubscribeUpsellLynxUrlSetting subscribeUpsellLynxUrlSetting = SubscribeUpsellLynxUrlSetting.INSTANCE;
        C1822260xWK c1822260xWKWQ2 = wQ2();
        if (c1822260xWKWQ2 == null || (pcsServicePlusOptinPageParams4 = c1822260xWKWQ2.LLILLJJLI) == null || (showEntrance = pcsServicePlusOptinPageParams4.getShowEntrance()) == null) {
            showEntrance = "";
        }
        C1822260xWK c1822260xWKWQ22 = wQ2();
        if (c1822260xWKWQ22 == null || (pcsServicePlusOptinPageParams3 = c1822260xWKWQ22.LLILLJJLI) == null || (anchorId = pcsServicePlusOptinPageParams3.getAnchorId()) == null) {
            anchorId = "";
        }
        C1822260xWK c1822260xWKWQ23 = wQ2();
        if (c1822260xWKWQ23 == null || (pcsServicePlusOptinPageParams2 = c1822260xWKWQ23.LLILLJJLI) == null || (anchorId2 = pcsServicePlusOptinPageParams2.getAnchorId()) == null) {
            anchorId2 = "";
        }
        C1822260xWK c1822260xWKWQ24 = wQ2();
        if (c1822260xWKWQ24 == null || (pcsServicePlusOptinPageParams = c1822260xWKWQ24.LLILLJJLI) == null || (pcsTrackContext = pcsServicePlusOptinPageParams.getPcsTrackContext()) == null) {
            pcsTrackContext = "";
        }
        return subscribeUpsellLynxUrlSetting.getSmbIndustryBlockPage(showEntrance, anchorId, anchorId2, true, true, null, pcsTrackContext, "");
    }

    public final C1822260xWK wQ2() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        if (this.LLILZ == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLL;
            C1822260xWK c1822260xWK = null;
            if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C1822260xWK.class, null)) != null) {
                c1822260xWK = (C1822260xWK) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LLILZ = c1822260xWK;
        }
        return this.LLILZ;
    }

    public final void xQ2(String str) {
        setState(new C1823660xYa());
        if (LivePcsOnboardingPerfOptSetting.INSTANCE.enabledFrontPrefetch()) {
            C1106750euH c1106750euH = C1106750euH.LIZ;
            C1106750euH.LIZ.LJI("/webcast/sub/smb/qualification/", C2097608Jq.LJ(), SMBOptInQualificationResponse.ResponseData.class, new C1823690xYd(this), new C1823740xYi(this, str), 1000L);
            return;
        }
        yQ2(str);
    }

    public final void yQ2(String str) {
        C1808280x9m.LJFF(this.LL.getSmbQualification().LJL(this.LLILLJJLI.LIZIZ()).LJJJLZIJ(this.LLILLJJLI.LIZ()), str, "/sub/smb/qualification/", null, 12).LJJLL(new C09JN() { // from class: X.0xYY
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PcsServicePlusOptinVM@665b.requestOptinQualificationInternal$1");
                PcsServicePlusOptinVM pcsServicePlusOptinVM = this.LL;
                SMBOptInQualificationResponse.ResponseData responseData = (SMBOptInQualificationResponse.ResponseData) ((BaseResponse) obj).data;
                pcsServicePlusOptinVM.getClass();
                pcsServicePlusOptinVM.setState(new C1823700xYe(responseData));
                C1C7U.LIZIZ("PcsServicePlusOptinVM@665b.requestOptinQualificationInternal$1");
            }
        }, new C09JN() { // from class: X.0xYZ
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PcsServicePlusOptinVM@665b.requestOptinQualificationInternal$2");
                PcsServicePlusOptinVM pcsServicePlusOptinVM = this.LL;
                pcsServicePlusOptinVM.getClass();
                pcsServicePlusOptinVM.setState(new C1823710xYf((Throwable) obj));
                C1C7U.LIZIZ("PcsServicePlusOptinVM@665b.requestOptinQualificationInternal$2");
            }
        });
    }

    public PcsServicePlusOptinVM(C518720KVy c518720KVy, C1822230xWH c1822230xWH) {
        this.LL = c518720KVy;
        this.LLILLJJLI = c1822230xWH;
    }
}
