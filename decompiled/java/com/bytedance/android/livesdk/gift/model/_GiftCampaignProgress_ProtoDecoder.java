package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftCampaignProgress;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftCampaignProgress_ProtoDecoder implements C0IMD<GiftCampaignProgress> {
    public static GiftCampaignProgress LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftCampaignProgress giftCampaignProgress = new GiftCampaignProgress();
        giftCampaignProgress.campaignProgressList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    giftCampaignProgress.campaignProgressList.add(_GiftCampaignProgress_CampaignProgress_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftCampaignProgress;
            }
        }
    }

    public static void LJ(GiftCampaignProgress giftCampaignProgress) {
        List<GiftCampaignProgress.CampaignProgress> list = giftCampaignProgress.campaignProgressList;
        if (list == null) {
            giftCampaignProgress.campaignProgressList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GiftCampaignProgress.CampaignProgress campaignProgress : giftCampaignProgress.campaignProgressList) {
            if (campaignProgress != null) {
                _GiftCampaignProgress_CampaignProgress_ProtoDecoder.LJ(campaignProgress);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftCampaignProgress giftCampaignProgress) {
        LJ(giftCampaignProgress);
    }

    @Override // X.C0IMD
    public final GiftCampaignProgress LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftCampaignProgress giftCampaignProgress, List list) {
    }
}
