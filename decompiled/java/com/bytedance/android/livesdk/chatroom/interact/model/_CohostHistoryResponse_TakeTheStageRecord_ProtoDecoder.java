package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostHistoryResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostHistoryResponse_TakeTheStageRecord_ProtoDecoder implements C0IMD<CohostHistoryResponse.TakeTheStageRecord> {
    public static CohostHistoryResponse.TakeTheStageRecord LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostHistoryResponse.TakeTheStageRecord takeTheStageRecord = new CohostHistoryResponse.TakeTheStageRecord();
        takeTheStageRecord.otherTakeTheStageInfos = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    takeTheStageRecord.otherTakeTheStageInfos.add(_CohostHistoryResponse_TakeTheStageRecord_TakeTheStageUser_ProtoDecoder.LIZLLL(c1516680pZS));
                                }
                            } else {
                                takeTheStageRecord.myTakeTheStageInfo = _CohostHistoryResponse_TakeTheStageRecord_TakeTheStageUser_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            takeTheStageRecord.historyGroupChannelId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        takeTheStageRecord.startTimestampSec = c1516680pZS.LJIIJJI();
                    }
                } else {
                    takeTheStageRecord.showdownId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return takeTheStageRecord;
            }
        }
    }

    public static void LJ(CohostHistoryResponse.TakeTheStageRecord takeTheStageRecord) {
        List<CohostHistoryResponse.TakeTheStageRecord.TakeTheStageUser> list = takeTheStageRecord.otherTakeTheStageInfos;
        if (list == null) {
            takeTheStageRecord.otherTakeTheStageInfos = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<CohostHistoryResponse.TakeTheStageRecord.TakeTheStageUser> it2 = takeTheStageRecord.otherTakeTheStageInfos.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CohostHistoryResponse.TakeTheStageRecord takeTheStageRecord) {
        LJ(takeTheStageRecord);
    }

    @Override // X.C0IMD
    public final CohostHistoryResponse.TakeTheStageRecord LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostHistoryResponse.TakeTheStageRecord takeTheStageRecord, List list) {
    }
}
