package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LeagueScoreInfo_ProtoDecoder implements C0IMD<LeagueScoreInfo> {
    public static LeagueScoreInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LeagueScoreInfo leagueScoreInfo = new LeagueScoreInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        leagueScoreInfo.estimatedScore = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        leagueScoreInfo.isOptOut = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        leagueScoreInfo.isActivityPeriod = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        leagueScoreInfo.contentText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        leagueScoreInfo.classOptOut = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        leagueScoreInfo.contentTextOpen = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        leagueScoreInfo.matchTheme = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        leagueScoreInfo.leftIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        leagueScoreInfo.rightIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        leagueScoreInfo.rightSchemaJumpLink = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return leagueScoreInfo;
            }
        }
    }

    public static void LJ(LeagueScoreInfo leagueScoreInfo) {
        Text text = leagueScoreInfo.contentText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = leagueScoreInfo.contentTextOpen;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        ImageModel imageModel = leagueScoreInfo.leftIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = leagueScoreInfo.rightIcon;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LeagueScoreInfo leagueScoreInfo) {
        LJ(leagueScoreInfo);
    }

    @Override // X.C0IMD
    public final LeagueScoreInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LeagueScoreInfo leagueScoreInfo, List list) {
    }
}
