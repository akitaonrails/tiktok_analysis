package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.RankUpdate;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdk.rank.model._ClassInfo_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RankUpdate_ProtoDecoder implements C0IMD<RankUpdate> {
    public static RankUpdate LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RankUpdate rankUpdate = new RankUpdate();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        rankUpdate.rankType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        rankUpdate.ownRank = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        rankUpdate.defaultContent = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                    case 5:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 6:
                        rankUpdate.countdown = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        rankUpdate.animationInfo = _RankAnimationInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        rankUpdate.belongType = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        rankUpdate.requestFirstShowType = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        rankUpdate.supportedVersion = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        rankUpdate.owneronrank = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        rankUpdate.entranceicon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        rankUpdate.affiliatedInfo = _RankUpdate_AffiliatedInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        rankUpdate.classInfo = _ClassInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        rankUpdate.currentScore = c1516680pZS.LJIIJJI();
                        break;
                    case 16:
                        rankUpdate.listSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rankUpdate;
            }
        }
    }

    public static void LJ(RankUpdate rankUpdate) {
        Text text = rankUpdate.defaultContent;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        RankAnimationInfo rankAnimationInfo = rankUpdate.animationInfo;
        if (rankAnimationInfo != null) {
            _RankAnimationInfo_ProtoDecoder.LJ(rankAnimationInfo);
        }
        ImageModel imageModel = rankUpdate.entranceicon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        RankUpdate.AffiliatedInfo affiliatedInfo = rankUpdate.affiliatedInfo;
        if (affiliatedInfo != null) {
            _RankUpdate_AffiliatedInfo_ProtoDecoder.LJ(affiliatedInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RankUpdate rankUpdate) {
        LJ(rankUpdate);
    }

    @Override // X.C0IMD
    public final RankUpdate LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RankUpdate rankUpdate, List list) {
    }
}
