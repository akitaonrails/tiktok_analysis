package webcast.api.room;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _AnchorLevelPermission_ProtoDecoder implements C0IMD<AnchorLevelPermission> {
    public static AnchorLevelPermission LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorLevelPermission anchorLevelPermission = new AnchorLevelPermission();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        anchorLevelPermission.beauty = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        anchorLevelPermission.effects = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        anchorLevelPermission.share = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        anchorLevelPermission.moderatorSetting = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        anchorLevelPermission.commentSetting = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        anchorLevelPermission.flip = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        anchorLevelPermission.donationSticker = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        anchorLevelPermission.liveCenter = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        anchorLevelPermission.topic = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        anchorLevelPermission.voiceEffect = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        anchorLevelPermission.liveIntro = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        anchorLevelPermission.liveGoal = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        anchorLevelPermission.promote = c1516680pZS.LJIIJ();
                        break;
                    case 14:
                        anchorLevelPermission.poll = c1516680pZS.LJIIJ();
                        break;
                    case 15:
                        anchorLevelPermission.playTogether = c1516680pZS.LJIIJ();
                        break;
                    case 16:
                        anchorLevelPermission.liveBoard = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorLevelPermission;
            }
        }
    }

    @Override // X.C0IMD
    public final AnchorLevelPermission LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AnchorLevelPermission anchorLevelPermission) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorLevelPermission anchorLevelPermission, List list) {
    }
}
