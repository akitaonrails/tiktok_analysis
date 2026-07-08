package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model._BorderInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WeeklyRankRewardMessage_ProtoDecoder implements C0IMD<WeeklyRankRewardMessage> {
    @Override // X.C0IMD
    public final void LIZ(WeeklyRankRewardMessage weeklyRankRewardMessage) {
        WeeklyRankRewardMessage weeklyRankRewardMessage2 = weeklyRankRewardMessage;
        BorderInfo borderInfo = weeklyRankRewardMessage2.borderInfo;
        if (borderInfo != null) {
            _BorderInfo_ProtoDecoder.LJ(borderInfo);
        }
        CommonMessageData commonMessageData = weeklyRankRewardMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        RoomNotifyMessage roomNotifyMessage = weeklyRankRewardMessage2.notifyMessage;
        if (roomNotifyMessage != null) {
            _RoomNotifyMessage_ProtoDecoder.LJ(roomNotifyMessage);
        }
    }

    @Override // X.C0IMD
    public final WeeklyRankRewardMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        WeeklyRankRewardMessage weeklyRankRewardMessage = new WeeklyRankRewardMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                weeklyRankRewardMessage.notifyMessage = _RoomNotifyMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            weeklyRankRewardMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        weeklyRankRewardMessage.borderInfo = _BorderInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    weeklyRankRewardMessage.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return weeklyRankRewardMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WeeklyRankRewardMessage weeklyRankRewardMessage, List list) {
    }
}
