package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftMessage_SponsorshipInfo_ProtoDecoder implements C0IMD<GiftMessage.SponsorshipInfo> {
    public static GiftMessage.SponsorshipInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftMessage.SponsorshipInfo sponsorshipInfo = new GiftMessage.SponsorshipInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 21) {
                    switch (iLJI) {
                        case 1:
                            sponsorshipInfo.giftId = c1516680pZS.LJIIJJI();
                            break;
                        case 2:
                            sponsorshipInfo.sponsorId = c1516680pZS.LJIIJJI();
                            break;
                        case 3:
                            sponsorshipInfo.lightGiftUp = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case 4:
                            sponsorshipInfo.unlightedGiftIcon = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            sponsorshipInfo.giftGalleryDetailPageSchemeUrl = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 6:
                            sponsorshipInfo.giftGalleryClickSponsor = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case 7:
                            sponsorshipInfo.giftTrayStyle = c1516680pZS.LJIIJ();
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    sponsorshipInfo.becomeAllSponsored = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sponsorshipInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final GiftMessage.SponsorshipInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GiftMessage.SponsorshipInfo sponsorshipInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftMessage.SponsorshipInfo sponsorshipInfo, List list) {
    }
}
