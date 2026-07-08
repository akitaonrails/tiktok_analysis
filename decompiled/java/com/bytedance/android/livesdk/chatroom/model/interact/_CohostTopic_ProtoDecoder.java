package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostTopic_ProtoDecoder implements C0IMD<CohostTopic> {
    public static CohostTopic LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostTopic cohostTopic = new CohostTopic();
        cohostTopic.rivalsAvatar = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            switch (iLJI) {
                                case 21:
                                    cohostTopic.liked = C1516700pZU.LIZ(c1516680pZS);
                                    break;
                                case 22:
                                    cohostTopic.totalHeat = c1516680pZS.LJIIJJI();
                                    break;
                                case 23:
                                    cohostTopic.totalRivals = c1516680pZS.LJIIJJI();
                                    break;
                                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                    cohostTopic.rivalsAvatar.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                                    break;
                                default:
                                    C1516700pZU.LJ(c1516680pZS);
                                    break;
                            }
                        } else {
                            cohostTopic.titleText = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        cohostTopic.titleKey = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    cohostTopic.id = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostTopic;
            }
        }
    }

    public static void LJ(CohostTopic cohostTopic) {
        List<ImageModel> list = cohostTopic.rivalsAvatar;
        if (list == null) {
            cohostTopic.rivalsAvatar = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (ImageModel imageModel : cohostTopic.rivalsAvatar) {
            if (imageModel != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CohostTopic cohostTopic) {
        LJ(cohostTopic);
    }

    @Override // X.C0IMD
    public final CohostTopic LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostTopic cohostTopic, List list) {
    }
}
