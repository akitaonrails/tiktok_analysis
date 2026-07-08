package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model._BorderInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HourlyRankRewardInfo_ProtoDecoder implements C0IMD<HourlyRankRewardInfo> {
    public static HourlyRankRewardInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        HourlyRankRewardInfo hourlyRankRewardInfo = new HourlyRankRewardInfo();
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
                                hourlyRankRewardInfo.borderInfo = _BorderInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            hourlyRankRewardInfo.notifyMessage = _RoomNotifyMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        hourlyRankRewardInfo.assetId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    hourlyRankRewardInfo.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return hourlyRankRewardInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(HourlyRankRewardInfo hourlyRankRewardInfo) {
        HourlyRankRewardInfo hourlyRankRewardInfo2 = hourlyRankRewardInfo;
        RoomNotifyMessage roomNotifyMessage = hourlyRankRewardInfo2.notifyMessage;
        if (roomNotifyMessage != null) {
            _RoomNotifyMessage_ProtoDecoder.LJ(roomNotifyMessage);
        }
        BorderInfo borderInfo = hourlyRankRewardInfo2.borderInfo;
        if (borderInfo != null) {
            _BorderInfo_ProtoDecoder.LJ(borderInfo);
        }
    }

    @Override // X.C0IMD
    public final HourlyRankRewardInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HourlyRankRewardInfo hourlyRankRewardInfo, List list) {
    }
}
