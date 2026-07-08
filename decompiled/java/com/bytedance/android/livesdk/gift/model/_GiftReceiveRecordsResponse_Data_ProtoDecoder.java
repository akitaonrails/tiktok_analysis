package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.GiftReceiveRecordsResponse;
import com.bytedance.android.livesdk.gift.model.GiftRecord;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftReceiveRecordsResponse_Data_ProtoDecoder implements C0IMD<GiftReceiveRecordsResponse.Data> {
    public static GiftReceiveRecordsResponse.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftReceiveRecordsResponse.Data data = new GiftReceiveRecordsResponse.Data();
        data.giftRecords = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 21) {
                                if (iLJI != 22) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    data.showTotalDiamonds = C1516700pZU.LIZ(c1516680pZS);
                                }
                            } else {
                                data.totalDiamonds = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            data.refTimestamp = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        data.hasNext = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    data.giftRecords.add(_GiftRecord_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    public static void LJ(GiftReceiveRecordsResponse.Data data) {
        ImageModel imageModel;
        ImageModel imageModel2;
        List<GiftRecord> list = data.giftRecords;
        if (list == null) {
            data.giftRecords = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GiftRecord giftRecord : data.giftRecords) {
            if (giftRecord != null) {
                GiftRecord.Gift gift = giftRecord.gift;
                if (gift != null && (imageModel2 = gift.image) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel2);
                }
                GiftRecord.User user = giftRecord.fromUser;
                if (user != null && (imageModel = user.avatar) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
                if (giftRecord.tags == null) {
                    giftRecord.tags = new ArrayList();
                }
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftReceiveRecordsResponse.Data data) {
        LJ(data);
    }

    @Override // X.C0IMD
    public final GiftReceiveRecordsResponse.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftReceiveRecordsResponse.Data data, List list) {
    }
}
