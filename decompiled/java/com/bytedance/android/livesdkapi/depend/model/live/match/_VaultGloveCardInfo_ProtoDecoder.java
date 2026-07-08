package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _VaultGloveCardInfo_ProtoDecoder implements C0IMD<VaultGloveCardInfo> {
    public static VaultGloveCardInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        VaultGloveCardInfo vaultGloveCardInfo = new VaultGloveCardInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        vaultGloveCardInfo.common = _CommonCardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        vaultGloveCardInfo.giftNameKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        vaultGloveCardInfo.multiple = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        vaultGloveCardInfo.multipleOther = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        vaultGloveCardInfo.criticalStrikeRateLow = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        vaultGloveCardInfo.criticalStrikeRateHigh = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return vaultGloveCardInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(VaultGloveCardInfo vaultGloveCardInfo) {
        CommonCardInfo commonCardInfo = vaultGloveCardInfo.common;
        if (commonCardInfo != null) {
            _CommonCardInfo_ProtoDecoder.LJ(commonCardInfo);
        }
    }

    @Override // X.C0IMD
    public final VaultGloveCardInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, VaultGloveCardInfo vaultGloveCardInfo, List list) {
    }
}
