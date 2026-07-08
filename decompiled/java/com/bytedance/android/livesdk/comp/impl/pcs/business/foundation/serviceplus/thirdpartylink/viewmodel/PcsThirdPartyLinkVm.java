package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.viewmodel;

import X.C1161920gLG;
import X.C1554960qZC;
import X.C1781590wSj;
import X.C1821550xVB;
import X.C1821570xVD;
import X.C1821640xVK;
import X.C1821650xVL;
import X.C1821680xVO;
import X.C1821830xVd;
import X.C1821840xVe;
import X.C1821860xVg;
import X.C23250099c;
import X.C351101Xx;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.thirdpartylink.PcsThirdPartyLinkData;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import webcast.api.smb.SMBThirdPartyLinkGetBySkuResponse;
import webcast.api.smb.ThirdPartyLinkInfo;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsThirdPartyLinkVm extends AssemViewModel<C1821680xVO> {
    public InterfaceC665370Q7z LL;
    public C1821570xVD LLILLJJLI;
    public final C351101Xx LLILLL = new C351101Xx();
    public C1821550xVB LLILZ;
    public C1821830xVd LLILZIL;
    public C1821840xVe LLILZLL;
    public C1821860xVg LLIZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1821680xVO(0);
    }

    public final C1781590wSj wQ2() {
        String strValueOf;
        String str;
        String string;
        String str2;
        ThirdPartyLinkInfo thirdPartyLinkInfo;
        String str3;
        Long l;
        String str4 = "";
        C1821570xVD c1821570xVDXQ2 = xQ2();
        PcsThirdPartyLinkData pcsThirdPartyLinkData = c1821570xVDXQ2 != null ? c1821570xVDXQ2.LL : null;
        try {
            strValueOf = String.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strValueOf = "";
        }
        if (pcsThirdPartyLinkData == null || (str = pcsThirdPartyLinkData.anchorId) == null) {
            str = "";
        }
        if (pcsThirdPartyLinkData == null || (l = pcsThirdPartyLinkData.roomId) == null || (string = l.toString()) == null) {
            string = "";
        }
        if (pcsThirdPartyLinkData == null || (str2 = pcsThirdPartyLinkData.showEntrance) == null) {
            str2 = "";
        }
        SMBThirdPartyLinkGetBySkuResponse.ResponseData responseData = getState().LL;
        if (responseData != null && (thirdPartyLinkInfo = responseData.linkInfo) != null && (str3 = thirdPartyLinkInfo.platformKey) != null) {
            str4 = str3;
        }
        return new C1781590wSj(strValueOf, str, string, str2, str4);
    }

    public final C1821570xVD xQ2() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        if (this.LLILLJJLI == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
            C1821570xVD c1821570xVD = null;
            if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C1821570xVD.class, null)) != null) {
                c1821570xVD = (C1821570xVD) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LLILLJJLI = c1821570xVD;
        }
        return this.LLILLJJLI;
    }

    public final void vQ2() {
        PcsThirdPartyLinkData pcsThirdPartyLinkData;
        C1821570xVD c1821570xVDXQ2 = xQ2();
        long j = (c1821570xVDXQ2 == null || (pcsThirdPartyLinkData = c1821570xVDXQ2.LL) == null) ? 0L : pcsThirdPartyLinkData.skuId;
        setState(new C1821650xVL());
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1821640xVK(this, j, null), 3);
    }
}
