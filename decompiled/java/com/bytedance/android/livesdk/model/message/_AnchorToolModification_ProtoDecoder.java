package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _AnchorToolModification_ProtoDecoder implements C0IMD<AnchorToolModification> {
    public static AnchorToolModification LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorToolModification anchorToolModification = new AnchorToolModification();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        anchorToolModification.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        anchorToolModification.userId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        anchorToolModification.effectId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        anchorToolModification.name = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        anchorToolModification.resourceId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        anchorToolModification.modificationType = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        anchorToolModification.role = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        anchorToolModification.msgType = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        anchorToolModification.subType = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        anchorToolModification.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        anchorToolModification.endTime = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        anchorToolModification.duration = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        switch (iLJI) {
                            case 21:
                                anchorToolModification.tab = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 22:
                                anchorToolModification.mode = c1516680pZS.LJIIJJI();
                                break;
                            case 23:
                                anchorToolModification.from = c1516680pZS.LJIIJJI();
                                break;
                            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                anchorToolModification.value = Double.longBitsToDouble(c1516680pZS.LJIIIZ());
                                break;
                            case 25:
                                anchorToolModification.url = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 26:
                                anchorToolModification.scene = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 27:
                                anchorToolModification.status = c1516680pZS.LJIIJJI();
                                break;
                            case 28:
                                anchorToolModification.content = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            default:
                                C1516700pZU.LJ(c1516680pZS);
                                break;
                        }
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorToolModification;
            }
        }
    }

    @Override // X.C0IMD
    public final AnchorToolModification LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AnchorToolModification anchorToolModification) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorToolModification anchorToolModification, List list) {
    }
}
