package com.ss.android.ugc.aweme.verify.pi;

import X.C1713570uh1;
import X.C1714180ui0;
import X.C1714830uj3;
import X.C1714950ujF;
import X.C1714980ujI;
import X.C1715280ujm;
import X.C914170Ztf;
import X.C991740bum;
import X.InterfaceC0148002o;
import X.InterfaceC1715120ujW;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService;
import defpackage.PipoVcPiOcrConfigModel;
import defpackage.r5;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes27.dex */
public final class VerifyViewModel extends AssemViewModel<C1714830uj3> {
    public C1713570uh1 LL;
    public C1714950ujF LLILLJJLI;
    public C1714180ui0 LLILLL;
    public String LLILZ;
    public final C914170Ztf LLILZIL = new C914170Ztf(CoroutineExceptionHandler.LJJLIL, 7);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1714830uj3(0);
    }

    public final boolean vQ2() {
        VerifyDetail verifyDetailLJIIIIZZ;
        VerifyDetail verifyDetailLJIIIIZZ2;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoVcPiOcrConfigModel pipoVcPiOcrConfigModel = r5.LIZ;
        PipoVcPiOcrConfigModel pipoVcPiOcrConfigModel2 = (PipoVcPiOcrConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_vc_pi_ocr_config", PipoVcPiOcrConfigModel.class, pipoVcPiOcrConfigModel);
        if (pipoVcPiOcrConfigModel2 != null) {
            pipoVcPiOcrConfigModel = pipoVcPiOcrConfigModel2;
        }
        boolean zLJFF = Intrinsics.LJFF(pipoVcPiOcrConfigModel.enableOcr, Boolean.TRUE);
        String str = null;
        IPipoCcdcService iPipoCcdcService = (IPipoCcdcService) PluggableExtentionKt.pluggableSpi$default(IPipoCcdcService.class, false, false, false, 14, null);
        boolean z = iPipoCcdcService != null && iPipoCcdcService.LJFF("pi_verify");
        C1713570uh1 c1713570uh1 = this.LL;
        String str2 = null;
        if (c1713570uh1 != null && (verifyDetailLJIIIIZZ2 = c1713570uh1.LJIIIIZZ()) != null) {
            str = verifyDetailLJIIIIZZ2.verifyMethod;
        }
        boolean zLJFF2 = Intrinsics.LJFF(str, "ccdc-card-number");
        C1713570uh1 c1713570uh12 = this.LL;
        if (c1713570uh12 != null && (verifyDetailLJIIIIZZ = c1713570uh12.LJIIIIZZ()) != null) {
            str2 = verifyDetailLJIIIIZZ.experimentGroup;
        }
        return zLJFF && z && zLJFF2 && Intrinsics.LJFF(str2, "v1");
    }

    public final void wQ2() {
        InterfaceC1715120ujW interfaceC1715120ujW = getState().LL;
        if ((interfaceC1715120ujW instanceof C991740bum) || (interfaceC1715120ujW instanceof C1714980ujI) || Intrinsics.LJFF(interfaceC1715120ujW, C1715280ujm.LIZ)) {
            return;
        }
        setState(AFwS268S0000000_26.get$arr$(489));
    }
}
