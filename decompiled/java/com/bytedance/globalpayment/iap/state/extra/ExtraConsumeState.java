package com.bytedance.globalpayment.iap.state.extra;

import X.AbstractC1794360wnK;
import X.AbstractC1794600wni;
import X.C1792220wjs;
import X.C1792840wks;
import X.C1793990wmj;
import X.C1794180wn2;
import X.C1794240wn8;
import X.C1794480wnW;
import X.C1794520wna;
import X.C1795210woh;
import X.C2188811AlT;
import X.EnumC1794620wnk;
import X.InterfaceC1794400wnO;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;

/* JADX INFO: loaded from: classes28.dex */
public final class ExtraConsumeState extends AbstractC1794360wnK {
    @Override // X.AbstractC1794360wnK
    public final EnumC1794620wnk LIZJ() {
        return EnumC1794620wnk.ExtraConsume;
    }

    public class ExtraConsumeFinishedListener implements ConsumeIapProductListener {
        public C1793990wmj mConsumeProductMonitor;

        @Override // com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener
        public void onConsumeFinished(C1792220wjs c1792220wjs) {
            int i = c1792220wjs.LIZ;
            if (i == 0) {
                PaymentServiceManager.get().getGoogleIapExternalService().getPayloadPreferencesService().removePayload(((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LIZ, ExtraConsumeState.this.LIZ.LIZLLL());
                ExtraConsumeState.this.LIZ.LJIJJLI = true;
                this.mConsumeProductMonitor.LJ(true, null);
                C1794480wnW c1794480wnW = ExtraConsumeState.this.LIZ;
                if (c1794480wnW.LJIJI && c1794480wnW.LJIJJLI && c1794480wnW.LJIL && !ExtraConsumeState.this.LIZ.LJIJJ) {
                    ExtraConsumeState.this.LIZIZ(new C1792840wks(0, 0, "extra pay success in ExtraConsumeFinishedListener."));
                    return;
                }
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ExtraConsumeState: extra channel consume product fail, ");
            sbLIZ.append(c1792220wjs.LJ);
            C1792840wks c1792840wks = new C1792840wks(207, i, C2188811AlT.LIZIZ(sbLIZ));
            this.mConsumeProductMonitor.LJ(false, c1792840wks);
            if (ExtraConsumeState.this.LIZ.LJIJJ) {
                return;
            }
            ExtraConsumeState.this.LIZIZ(c1792840wks);
        }

        public ExtraConsumeFinishedListener(C1793990wmj c1793990wmj) {
            this.mConsumeProductMonitor = c1793990wmj;
        }
    }

    public ExtraConsumeState(InterfaceC1794400wnO interfaceC1794400wnO) {
        super(interfaceC1794400wnO);
    }

    @Override // X.AbstractC1794360wnK
    public final void LIZ(C1794480wnW c1794480wnW) {
        AbstractC1794600wni abstractC1794600wni;
        boolean z;
        this.LIZ = c1794480wnW;
        c1794480wnW.getClass();
        if (!c1794480wnW.LJIJJ && (abstractC1794600wni = c1794480wnW.LJIIJ) != null) {
            C1793990wmj c1793990wmj = new C1793990wmj(this.LIZ, c1794480wnW.LJIILIIL, c1794480wnW.LIZJ, c1794480wnW.LIZLLL(), c1794480wnW.LIZ.LJII);
            c1793990wmj.LIZLLL();
            if (!c1794480wnW.LIZ.LJII && !c1794480wnW.LJIIJ.LJIIJ()) {
                z = false;
            } else {
                z = true;
            }
            ((C1794180wn2) C1794180wn2.LIZJ()).LIZ();
            C1794520wna.LIZ(c1794480wnW.LJJ, z, abstractC1794600wni.LIZ(), new ExtraConsumeFinishedListener(c1793990wmj));
        }
    }
}
