package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleUserInfo_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AwardCardNotice_ProtoDecoder implements C0IMD<AwardCardNotice> {
    public static AwardCardNotice LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AwardCardNotice awardCardNotice = new AwardCardNotice();
        awardCardNotice.awardedUsers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        awardCardNotice.awardedUsers.add(_BattleUserInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    awardCardNotice.displayContent = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return awardCardNotice;
            }
        }
    }

    public static void LJ(AwardCardNotice awardCardNotice) {
        Text text = awardCardNotice.displayContent;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        List<BattleUserInfo> list = awardCardNotice.awardedUsers;
        if (list == null) {
            awardCardNotice.awardedUsers = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (BattleUserInfo battleUserInfo : awardCardNotice.awardedUsers) {
            if (battleUserInfo != null) {
                _BattleUserInfo_ProtoDecoder.LJ(battleUserInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AwardCardNotice awardCardNotice) {
        LJ(awardCardNotice);
    }

    @Override // X.C0IMD
    public final AwardCardNotice LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AwardCardNotice awardCardNotice, List list) {
    }
}
