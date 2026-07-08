package tikcast.api.user_level;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PayGradeInfo_ProtoDecoder implements C0IMD<PayGradeInfo> {
    public static PayGradeInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PayGradeInfo payGradeInfo = new PayGradeInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        payGradeInfo.upgradeInfo = _UpgradeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    payGradeInfo.userGrade = _UserGrade_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return payGradeInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PayGradeInfo payGradeInfo) {
        UserGrade userGrade = payGradeInfo.userGrade;
        if (userGrade != null) {
            BadgeStruct badgeStruct = userGrade.defaultGradeBadge;
            if (badgeStruct != null) {
                _BadgeStruct_ProtoDecoder.LJ(badgeStruct);
            }
            BadgeStruct badgeStruct2 = userGrade.opacityBadge;
            if (badgeStruct2 != null) {
                _BadgeStruct_ProtoDecoder.LJ(badgeStruct2);
            }
        }
    }

    @Override // X.C0IMD
    public final PayGradeInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PayGradeInfo payGradeInfo, List list) {
    }
}
