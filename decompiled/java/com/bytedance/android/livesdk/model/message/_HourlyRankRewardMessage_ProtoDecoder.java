package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model._BorderInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HourlyRankRewardMessage_ProtoDecoder implements C0IMD<HourlyRankRewardMessage> {
    @Override // X.C0IMD
    public final void LIZ(HourlyRankRewardMessage hourlyRankRewardMessage) {
        HourlyRankRewardMessage hourlyRankRewardMessage2 = hourlyRankRewardMessage;
        CommonMessageData commonMessageData = hourlyRankRewardMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<HourlyRankRewardInfo> list = hourlyRankRewardMessage2.winners;
        if (list == null) {
            hourlyRankRewardMessage2.winners = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (HourlyRankRewardInfo hourlyRankRewardInfo : hourlyRankRewardMessage2.winners) {
            if (hourlyRankRewardInfo != null) {
                RoomNotifyMessage roomNotifyMessage = hourlyRankRewardInfo.notifyMessage;
                if (roomNotifyMessage != null) {
                    _RoomNotifyMessage_ProtoDecoder.LJ(roomNotifyMessage);
                }
                BorderInfo borderInfo = hourlyRankRewardInfo.borderInfo;
                if (borderInfo != null) {
                    _BorderInfo_ProtoDecoder.LJ(borderInfo);
                }
            }
        }
    }

    @Override // X.C0IMD
    public final HourlyRankRewardMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        HourlyRankRewardMessage hourlyRankRewardMessage = new HourlyRankRewardMessage();
        hourlyRankRewardMessage.winners = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        hourlyRankRewardMessage.winners.add(_HourlyRankRewardInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    hourlyRankRewardMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return hourlyRankRewardMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HourlyRankRewardMessage hourlyRankRewardMessage, List list) {
    }
}
