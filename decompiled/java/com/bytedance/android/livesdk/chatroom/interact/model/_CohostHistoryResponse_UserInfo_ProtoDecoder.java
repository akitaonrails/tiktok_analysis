package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostHistoryResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostHistoryResponse_UserInfo_ProtoDecoder implements C0IMD<CohostHistoryResponse.UserInfo> {
    public static CohostHistoryResponse.UserInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostHistoryResponse.UserInfo userInfo = new CohostHistoryResponse.UserInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        userInfo.extraInfo = _RivalExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    userInfo.room = _Room_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CohostHistoryResponse.UserInfo userInfo) {
        CohostHistoryResponse.UserInfo userInfo2 = userInfo;
        Room room = userInfo2.room;
        if (room != null) {
            _Room_ProtoDecoder.LJ(room);
        }
        RivalExtraInfo rivalExtraInfo = userInfo2.extraInfo;
        if (rivalExtraInfo != null) {
            _RivalExtraInfo_ProtoDecoder.LJ(rivalExtraInfo);
        }
    }

    @Override // X.C0IMD
    public final CohostHistoryResponse.UserInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostHistoryResponse.UserInfo userInfo, List list) {
    }
}
