package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftListByCreatorResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftListByCreatorResponse_Data_ProtoDecoder implements C0IMD<GiftListByCreatorResponse.Data> {
    public static GiftListByCreatorResponse.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftListByCreatorResponse.Data data = new GiftListByCreatorResponse.Data();
        data.pages = new ArrayList();
        data.recommendationActivities = new ArrayList();
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
                                data.recommendationActivities.add(_GiftActivityCreator_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            data.activity = _GiftActivityCreator_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        data.pages.add(_GiftPageByCreator_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    data.giftsInfo = _GiftsInfoByCreator_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    public static void LJ(GiftListByCreatorResponse.Data data) {
        GiftsInfoByCreator giftsInfoByCreator = data.giftsInfo;
        if (giftsInfoByCreator != null) {
            if (giftsInfoByCreator.giftBoxIds == null) {
                giftsInfoByCreator.giftBoxIds = new ArrayList();
            }
            GiftPanelCardletByCreator giftPanelCardletByCreator = giftsInfoByCreator.liveGoalCardlet;
            if (giftPanelCardletByCreator != null) {
                _GiftPanelCardletByCreator_ProtoDecoder.LJ(giftPanelCardletByCreator);
            }
        }
        List<GiftPageByCreator> list = data.pages;
        if (list == null) {
            data.pages = new ArrayList();
        } else if (!list.isEmpty()) {
            for (GiftPageByCreator giftPageByCreator : data.pages) {
                if (giftPageByCreator != null) {
                    _GiftPageByCreator_ProtoDecoder.LJ(giftPageByCreator);
                }
            }
        }
        GiftActivityCreator giftActivityCreator = data.activity;
        if (giftActivityCreator != null) {
            _GiftActivityCreator_ProtoDecoder.LJ(giftActivityCreator);
        }
        List<GiftActivityCreator> list2 = data.recommendationActivities;
        if (list2 == null) {
            data.recommendationActivities = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (GiftActivityCreator giftActivityCreator2 : data.recommendationActivities) {
            if (giftActivityCreator2 != null) {
                _GiftActivityCreator_ProtoDecoder.LJ(giftActivityCreator2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftListByCreatorResponse.Data data) {
        LJ(data);
    }

    @Override // X.C0IMD
    public final GiftListByCreatorResponse.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftListByCreatorResponse.Data data, List list) {
    }
}
