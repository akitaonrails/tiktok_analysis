package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomUserSeqMessage_ProtoDecoder implements C0IMD<RoomUserSeqMessage> {
    @Override // X.C0IMD
    public final void LIZ(RoomUserSeqMessage roomUserSeqMessage) {
        User user;
        User user2;
        RoomUserSeqMessage roomUserSeqMessage2 = roomUserSeqMessage;
        CommonMessageData commonMessageData = roomUserSeqMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<Contributor> list = roomUserSeqMessage2.mContributors;
        if (list == null) {
            roomUserSeqMessage2.mContributors = new ArrayList();
        } else if (!list.isEmpty()) {
            for (Contributor contributor : roomUserSeqMessage2.mContributors) {
                if (contributor != null && (user = contributor.mUser) != null) {
                    _User_ProtoDecoder.LJ(user);
                }
            }
        }
        List<Contributor> list2 = roomUserSeqMessage2.seats;
        if (list2 == null) {
            roomUserSeqMessage2.seats = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (Contributor contributor2 : roomUserSeqMessage2.seats) {
            if (contributor2 != null && (user2 = contributor2.mUser) != null) {
                _User_ProtoDecoder.LJ(user2);
            }
        }
    }

    @Override // X.C0IMD
    public final RoomUserSeqMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RoomUserSeqMessage roomUserSeqMessage = new RoomUserSeqMessage();
        roomUserSeqMessage.mContributors = new ArrayList();
        roomUserSeqMessage.seats = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        roomUserSeqMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        roomUserSeqMessage.mContributors.add(_Contributor_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        roomUserSeqMessage.mTotal = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        roomUserSeqMessage.popStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        roomUserSeqMessage.seats.add(_Contributor_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        roomUserSeqMessage.mPopularity = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        roomUserSeqMessage.totalUser = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 8:
                        roomUserSeqMessage.anonymous = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomUserSeqMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomUserSeqMessage roomUserSeqMessage, List list) {
    }
}
