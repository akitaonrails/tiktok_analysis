package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.GiftRecord;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftRecord_ProtoDecoder implements C0IMD<GiftRecord> {
    public static GiftRecord LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftRecord giftRecord = new GiftRecord();
        giftRecord.tags = new ArrayList();
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
                                giftRecord.tags.add(C1516700pZU.LIZLLL(c1516680pZS));
                            }
                        } else {
                            giftRecord.fromUser = _GiftRecord_User_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        giftRecord.gift = _GiftRecord_Gift_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftRecord.message = _GiftRecord_Message_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftRecord;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftRecord giftRecord) {
        ImageModel imageModel;
        ImageModel imageModel2;
        GiftRecord giftRecord2 = giftRecord;
        GiftRecord.Gift gift = giftRecord2.gift;
        if (gift != null && (imageModel2 = gift.image) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        GiftRecord.User user = giftRecord2.fromUser;
        if (user != null && (imageModel = user.avatar) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        if (giftRecord2.tags == null) {
            giftRecord2.tags = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final GiftRecord LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftRecord giftRecord, List list) {
    }
}
