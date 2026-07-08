package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.GiftCampaignProgress;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftCampaignProgress_CampaignProgress_ProtoDecoder implements C0IMD<GiftCampaignProgress.CampaignProgress> {
    public static GiftCampaignProgress.CampaignProgress LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftCampaignProgress.CampaignProgress campaignProgress = new GiftCampaignProgress.CampaignProgress();
        campaignProgress.conditionProgressList = new ArrayList();
        campaignProgress.giftIds = new ArrayList();
        campaignProgress.giftIconMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        campaignProgress.activityId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        campaignProgress.activityName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        campaignProgress.activityStartTime = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        campaignProgress.activityEndTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        campaignProgress.conditionProgressList.add(_GiftCampaignProgress_ConditionProgress_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        campaignProgress.giftIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    case 7:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        ImageModel imageModelLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        imageModelLIZLLL = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (lValueOf != null) {
                                    if (imageModelLIZLLL != null) {
                                        campaignProgress.giftIconMap.put(lValueOf, imageModelLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case 8:
                        campaignProgress.activityPageUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return campaignProgress;
            }
        }
    }

    public static void LJ(GiftCampaignProgress.CampaignProgress campaignProgress) {
        List<GiftCampaignProgress.ConditionProgress> list = campaignProgress.conditionProgressList;
        if (list == null) {
            campaignProgress.conditionProgressList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (GiftCampaignProgress.ConditionProgress conditionProgress : campaignProgress.conditionProgressList) {
                if (conditionProgress != null) {
                    Text text = conditionProgress.conditionText;
                    if (text != null) {
                        _Text_ProtoDecoder.LJ(text);
                    }
                    if (conditionProgress.giftIds == null) {
                        conditionProgress.giftIds = new ArrayList();
                    }
                }
            }
        }
        if (campaignProgress.giftIds == null) {
            campaignProgress.giftIds = new ArrayList();
        }
        Map<Long, ImageModel> map = campaignProgress.giftIconMap;
        if (map == null) {
            campaignProgress.giftIconMap = new HashMap();
            return;
        }
        if (map.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, ImageModel>> it2 = campaignProgress.giftIconMap.entrySet().iterator();
        while (it2.hasNext()) {
            ImageModel value = it2.next().getValue();
            if (value != null) {
                _ImageModel_ProtoDecoder.LJ(value);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftCampaignProgress.CampaignProgress campaignProgress) {
        LJ(campaignProgress);
    }

    @Override // X.C0IMD
    public final GiftCampaignProgress.CampaignProgress LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftCampaignProgress.CampaignProgress campaignProgress, List list) {
    }
}
