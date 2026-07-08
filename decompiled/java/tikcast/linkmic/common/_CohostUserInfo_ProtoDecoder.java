package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostUserInfo_ProtoDecoder implements C0IMD<CohostUserInfo> {
    public static CohostUserInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostUserInfo cohostUserInfo = new CohostUserInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        cohostUserInfo.permissionType = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        cohostUserInfo.sourceType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        cohostUserInfo.isLowVersion = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        cohostUserInfo.bestTeammateUid = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        cohostUserInfo.hasTopicPerm = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        cohostUserInfo.streamConfig = _CohostStreamConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        cohostUserInfo.inDifferentInviteTypeControlGroup = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        cohostUserInfo.cohostMode = _CohostUserInfo_CohostMode_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        cohostUserInfo.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        cohostUserInfo.displayId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        cohostUserInfo.avatarThumb = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        cohostUserInfo.followStatus = c1516680pZS.LJIIJJI();
                        break;
                    case 15:
                        cohostUserInfo.userIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        cohostUserInfo.isEnigma = C1516700pZU.LIZ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostUserInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CohostUserInfo cohostUserInfo) {
        ImageModel imageModel = cohostUserInfo.avatarThumb;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final CohostUserInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostUserInfo cohostUserInfo, List list) {
    }
}
