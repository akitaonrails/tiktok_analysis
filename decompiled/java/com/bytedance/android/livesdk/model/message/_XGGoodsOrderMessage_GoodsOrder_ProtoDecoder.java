package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.XGGoodsOrderMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _XGGoodsOrderMessage_GoodsOrder_ProtoDecoder implements C0IMD<XGGoodsOrderMessage.GoodsOrder> {
    public static XGGoodsOrderMessage.GoodsOrder LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        XGGoodsOrderMessage.GoodsOrder goodsOrder = new XGGoodsOrderMessage.GoodsOrder();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                goodsOrder.orderId = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            goodsOrder.orderMoney = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        goodsOrder.orderNum = c1516680pZS.LJIIJJI();
                    }
                } else {
                    goodsOrder.goodsRoomOrder = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return goodsOrder;
            }
        }
    }

    @Override // X.C0IMD
    public final XGGoodsOrderMessage.GoodsOrder LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(XGGoodsOrderMessage.GoodsOrder goodsOrder) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, XGGoodsOrderMessage.GoodsOrder goodsOrder, List list) {
    }
}
