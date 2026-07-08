package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AuctionResult_ProtoDecoder implements C0IMD<AuctionResult> {
    public static AuctionResult LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AuctionResult auctionResult = new AuctionResult();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    auctionResult.mainOrderPaymentTime = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                auctionResult.mainOrderCreateTime = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            auctionResult.productIndex = c1516680pZS.LJIIJ();
                        }
                    } else {
                        auctionResult.product = _Product_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    auctionResult.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return auctionResult;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AuctionResult auctionResult) {
        ImageModel imageModel;
        AuctionResult auctionResult2 = auctionResult;
        User user = auctionResult2.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        Product product = auctionResult2.product;
        if (product != null && (imageModel = product.cover) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final AuctionResult LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AuctionResult auctionResult, List list) {
    }
}
