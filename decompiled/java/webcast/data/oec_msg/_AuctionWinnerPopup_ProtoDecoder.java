package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AuctionWinnerPopup_ProtoDecoder implements C0IMD<AuctionWinnerPopup> {
    public static AuctionWinnerPopup LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AuctionWinnerPopup auctionWinnerPopup = new AuctionWinnerPopup();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        auctionWinnerPopup.auctionId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        auctionWinnerPopup.winnerUserId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        auctionWinnerPopup.productId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        auctionWinnerPopup.notifyType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        auctionWinnerPopup.paymentExpireTimestamp = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        auctionWinnerPopup.productImg = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        auctionWinnerPopup.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return auctionWinnerPopup;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AuctionWinnerPopup auctionWinnerPopup) {
        ImageModel imageModel = auctionWinnerPopup.productImg;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final AuctionWinnerPopup LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AuctionWinnerPopup auctionWinnerPopup, List list) {
    }
}
