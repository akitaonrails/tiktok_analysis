package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.PanelRefreshData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PanelRefreshData_EligibleVaultGifts_ProtoDecoder implements C0IMD<PanelRefreshData.EligibleVaultGifts> {
    public static PanelRefreshData.EligibleVaultGifts LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PanelRefreshData.EligibleVaultGifts eligibleVaultGifts = new PanelRefreshData.EligibleVaultGifts();
        eligibleVaultGifts.giftIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    eligibleVaultGifts.giftIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return eligibleVaultGifts;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PanelRefreshData.EligibleVaultGifts eligibleVaultGifts) {
        PanelRefreshData.EligibleVaultGifts eligibleVaultGifts2 = eligibleVaultGifts;
        if (eligibleVaultGifts2.giftIds == null) {
            eligibleVaultGifts2.giftIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final PanelRefreshData.EligibleVaultGifts LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PanelRefreshData.EligibleVaultGifts eligibleVaultGifts, List list) {
    }
}
