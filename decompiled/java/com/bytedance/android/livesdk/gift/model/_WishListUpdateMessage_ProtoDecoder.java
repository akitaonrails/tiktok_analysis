package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.WishListResponse;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WishListUpdateMessage_ProtoDecoder implements C0IMD<WishListUpdateMessage> {
    @Override // X.C0IMD
    public final void LIZ(WishListUpdateMessage wishListUpdateMessage) {
        WishListUpdateMessage wishListUpdateMessage2 = wishListUpdateMessage;
        CommonMessageData commonMessageData = wishListUpdateMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        WishListResponse.WishList wishList = wishListUpdateMessage2.list;
        if (wishList != null) {
            _WishListResponse_WishList_ProtoDecoder.LJ(wishList);
        }
    }

    @Override // X.C0IMD
    public final WishListUpdateMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        WishListUpdateMessage wishListUpdateMessage = new WishListUpdateMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        wishListUpdateMessage.list = _WishListResponse_WishList_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    wishListUpdateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return wishListUpdateMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WishListUpdateMessage wishListUpdateMessage, List list) {
    }
}
