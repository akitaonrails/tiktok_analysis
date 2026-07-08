package webcast.api.sub;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ThirdPartyLinkDisplayInfo_ProtoDecoder implements C0IMD<ThirdPartyLinkDisplayInfo> {
    public static ThirdPartyLinkDisplayInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ThirdPartyLinkDisplayInfo thirdPartyLinkDisplayInfo = new ThirdPartyLinkDisplayInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        thirdPartyLinkDisplayInfo.serviceInfo = _ServiceInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        thirdPartyLinkDisplayInfo.skuId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        thirdPartyLinkDisplayInfo.linkId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        thirdPartyLinkDisplayInfo.targetUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        thirdPartyLinkDisplayInfo.platformName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        thirdPartyLinkDisplayInfo.iconUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        thirdPartyLinkDisplayInfo.expiresAt = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        thirdPartyLinkDisplayInfo.platformKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return thirdPartyLinkDisplayInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ThirdPartyLinkDisplayInfo thirdPartyLinkDisplayInfo) {
    }

    @Override // X.C0IMD
    public final ThirdPartyLinkDisplayInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ThirdPartyLinkDisplayInfo thirdPartyLinkDisplayInfo, List list) {
    }
}
