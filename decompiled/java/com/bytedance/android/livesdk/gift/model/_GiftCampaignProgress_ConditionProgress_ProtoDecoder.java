package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftCampaignProgress;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftCampaignProgress_ConditionProgress_ProtoDecoder implements C0IMD<GiftCampaignProgress.ConditionProgress> {
    public static GiftCampaignProgress.ConditionProgress LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftCampaignProgress.ConditionProgress conditionProgress = new GiftCampaignProgress.ConditionProgress();
        conditionProgress.giftIds = new ArrayList();
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
                                    conditionProgress.giftIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                                }
                            } else {
                                conditionProgress.targetValue = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            conditionProgress.currentValue = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        conditionProgress.conditionText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    conditionProgress.conditionType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return conditionProgress;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftCampaignProgress.ConditionProgress conditionProgress) {
        GiftCampaignProgress.ConditionProgress conditionProgress2 = conditionProgress;
        Text text = conditionProgress2.conditionText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        if (conditionProgress2.giftIds == null) {
            conditionProgress2.giftIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final GiftCampaignProgress.ConditionProgress LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftCampaignProgress.ConditionProgress conditionProgress, List list) {
    }
}
