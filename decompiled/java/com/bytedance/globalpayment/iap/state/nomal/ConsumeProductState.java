package com.bytedance.globalpayment.iap.state.nomal;

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
public final class ConsumeProductState extends AbstractC1794360wnK {
    @Override // X.AbstractC1794360wnK
    public final EnumC1794620wnk LIZJ() {
        return EnumC1794620wnk.Consume;
    }

    public class ChannelPayConsumeFinishedListener implements ConsumeIapProductListener {
        public C1793990wmj mConsumeProductMonitor;

        @Override // com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener
        public void onConsumeFinished(C1792220wjs c1792220wjs) {
            int i = c1792220wjs.LIZ;
            if (i == 0) {
                this.mConsumeProductMonitor.LJ(true, null);
                PaymentServiceManager.get().getGoogleIapExternalService().getPayloadPreferencesService().removePayload(((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LIZ, ConsumeProductState.this.LIZ.LIZLLL());
                ConsumeProductState.this.LIZ.LJIJJLI = true;
                C1794480wnW c1794480wnW = ConsumeProductState.this.LIZ;
                if (c1794480wnW.LJIJI && c1794480wnW.LJIJJLI && c1794480wnW.LJIL && !ConsumeProductState.this.LIZ.LJIJJ) {
                    ConsumeProductState.this.LIZIZ(new C1792840wks(0, 0, "pay success in ChannelPayConsumeFinishedListener"));
                    return;
                }
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("google consume product fail in ChannelPayConsumeFinishedListener: ");
            sbLIZ.append(c1792220wjs.LJ);
            C1792840wks c1792840wks = new C1792840wks(207, i, C2188811AlT.LIZIZ(sbLIZ));
            this.mConsumeProductMonitor.LJ(false, c1792840wks);
            if (ConsumeProductState.this.LIZ.LJIJJ) {
                return;
            }
            ConsumeProductState.this.LIZIZ(c1792840wks);
        }

        public ChannelPayConsumeFinishedListener(C1793990wmj c1793990wmj) {
            this.mConsumeProductMonitor = c1793990wmj;
        }
    }

    public ConsumeProductState(InterfaceC1794400wnO interfaceC1794400wnO) {
        super(interfaceC1794400wnO);
    }

    @Override // X.AbstractC1794360wnK
    public final void LIZ(C1794480wnW c1794480wnW) {
        this.LIZ = c1794480wnW;
        c1794480wnW.getClass();
        AbstractC1794600wni abstractC1794600wni = c1794480wnW.LJIIJ;
        if (abstractC1794600wni != null) {
            String str = c1794480wnW.LIZJ;
            String strLIZLLL = c1794480wnW.LIZLLL();
            C1793990wmj c1793990wmj = new C1793990wmj(this.LIZ, c1794480wnW.LJIILIIL, str, strLIZLLL, c1794480wnW.LIZ.LJII);
            c1793990wmj.LIZLLL();
            ((C1794180wn2) C1794180wn2.LIZJ()).LIZ();
            C1794520wna.LIZ(c1794480wnW.LJJ, c1794480wnW.LIZ.LJII, abstractC1794600wni.LIZ(), new ChannelPayConsumeFinishedListener(c1793990wmj));
        }
    }
}
