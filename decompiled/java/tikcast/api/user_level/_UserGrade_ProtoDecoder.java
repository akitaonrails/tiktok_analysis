package tikcast.api.user_level;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserGrade_ProtoDecoder implements C0IMD<UserGrade> {
    public static UserGrade LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserGrade userGrade = new UserGrade();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        userGrade.nickName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        userGrade.defaultGradeBadge = _BadgeStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        userGrade.opacityBadge = _BadgeStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        userGrade.currentScore = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        userGrade.currentGrade = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        userGrade.gradeMode = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        userGrade.timeToSleep = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        userGrade.gradeScoreRule = _GradeScoreRule_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        userGrade.version = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userGrade;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UserGrade userGrade) {
        UserGrade userGrade2 = userGrade;
        BadgeStruct badgeStruct = userGrade2.defaultGradeBadge;
        if (badgeStruct != null) {
            _BadgeStruct_ProtoDecoder.LJ(badgeStruct);
        }
        BadgeStruct badgeStruct2 = userGrade2.opacityBadge;
        if (badgeStruct2 != null) {
            _BadgeStruct_ProtoDecoder.LJ(badgeStruct2);
        }
    }

    @Override // X.C0IMD
    public final UserGrade LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserGrade userGrade, List list) {
    }
}
