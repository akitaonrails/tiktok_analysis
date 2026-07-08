package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PopupWindowInfo_ProtoDecoder implements C0IMD<PopupWindowInfo> {
    public static PopupWindowInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PopupWindowInfo popupWindowInfo = new PopupWindowInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    popupWindowInfo.auctionWinnerPopup = _AuctionWinnerPopup_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return popupWindowInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PopupWindowInfo popupWindowInfo) {
        ImageModel imageModel;
        AuctionWinnerPopup auctionWinnerPopup = popupWindowInfo.auctionWinnerPopup;
        if (auctionWinnerPopup != null && (imageModel = auctionWinnerPopup.productImg) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final PopupWindowInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PopupWindowInfo popupWindowInfo, List list) {
    }
}
