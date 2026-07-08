package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.assem.sku;

import X.C019F;
import X.C01GW;
import X.C1103300eoi;
import X.C1161920gLG;
import X.C1214580hiC;
import X.C13LE;
import X.C1554960qZC;
import X.C1555840qac;
import X.C1558520qew;
import X.C1637806bA;
import X.C1821950xVp;
import X.C1822380xWW;
import X.C1822390xWX;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C788810Uwx;
import X.C788820Uwy;
import X.C788830Uwz;
import X.C788850Ux1;
import X.C788860Ux2;
import X.EnumC1122660fJw;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC495470Jbt;
import com.bytedance.android.livesdk.comp.api.pcs.data.event.SkuRoutingLeadConversionEvent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.viewmodel.PcsServiceSkuVM;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsServiceSkuNativeFormAssem extends PcsServiceSkuAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public C1555840qac LLJI;
    public InterfaceC495470Jbt LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServiceSkuNativeFormAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/servicesku/viewmodel/PcsServiceSkuVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsServiceSkuNativeFormAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceSkuVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1214580hiC(c19719912DlLIZ), new C1822390xWX(), null, true);
        this.LLJ = C452501pT.LIZIZ(new C1822380xWW(this));
    }

    public final C1555840qac Ho() {
        if (this.LLJI == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1555840qac.class, null);
            this.LLJI = interfaceC1555100qZQLIZIZ != null ? (C1555840qac) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJI;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        InterfaceC495470Jbt interfaceC495470Jbt = this.LLJIJIL;
        if (interfaceC495470Jbt != null) {
            ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).Bc1(interfaceC495470Jbt);
        }
        super.onDestroy();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void Jo(String str) {
        String string = JSONObjectProtectorUtils.getString(new JSONObject(str), "event_name");
        if (string == null) {
            return;
        }
        switch (string.hashCode()) {
            case -1316684629:
                if (string.equals("SubmitSuccess")) {
                    DataChannelGlobal.LLILZ.FQ2(SkuRoutingLeadConversionEvent.class, EnumC1122660fJw.FORM);
                    C1821950xVp.LIZ(new C788830Uwz(new C788820Uwy(Integer.valueOf(hashCode()))));
                }
                break;
            case -1074710092:
                string.equals("ExitFormStatus");
                break;
            case -83780746:
                if (string.equals("SubmitFail")) {
                    C1821950xVp.LIZ(new C788830Uwz(new C788860Ux2(new Throwable(), "1004", Integer.valueOf(hashCode()))));
                }
                break;
            case 764230728:
                if (string.equals("RenderFinished")) {
                    C1103300eoi.LIZLLL.LIZLLL(1, "smb_viewer_form_open_count");
                    C1821950xVp.LIZ(new C788830Uwz(new C788820Uwy(null)));
                }
                break;
            case 1438635637:
                if (string.equals("SubmitResult")) {
                    C1103300eoi c1103300eoi = C1103300eoi.LIZLLL;
                    c1103300eoi.LIZLLL(1, "smb_viewer_form_send_count");
                    c1103300eoi.LIZLLL(1, "smb_viewer_form_send_count_app_session");
                    C1821950xVp.LIZ(new C788830Uwz(new C788810Uwx(0)));
                    C1821950xVp.LIZ(new C788830Uwz(new C788850Ux1("PCSForm2ResultPage", 1013, hashCode())));
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r28) {
        /*
            Method dump skipped, instruction units count: 1414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.assem.sku.PcsServiceSkuNativeFormAssem.onViewCreated(android.view.View):void");
    }
}
