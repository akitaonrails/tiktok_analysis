package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostHistoryResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostHistoryResponse_ResponseData_ProtoDecoder implements C0IMD<CohostHistoryResponse.ResponseData> {
    public static CohostHistoryResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostHistoryResponse.ResponseData responseData = new CohostHistoryResponse.ResponseData();
        responseData.userInfos = new HashMap();
        responseData.cohostSessions = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 10) {
                            if (iLJI != 11) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                responseData.hasMore = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            responseData.oldestTimestampSec = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        CohostHistoryResponse.UserInfo userInfoLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    userInfoLIZLLL = _CohostHistoryResponse_UserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (lValueOf != null) {
                            if (userInfoLIZLLL != null) {
                                responseData.userInfos.put(lValueOf, userInfoLIZLLL);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    responseData.cohostSessions.add(_CohostHistoryResponse_CohostSession_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(CohostHistoryResponse.ResponseData responseData) {
        List<CohostHistoryResponse.CohostSession> list = responseData.cohostSessions;
        if (list == null) {
            responseData.cohostSessions = new ArrayList();
        } else if (!list.isEmpty()) {
            for (CohostHistoryResponse.CohostSession cohostSession : responseData.cohostSessions) {
                if (cohostSession != null) {
                    _CohostHistoryResponse_CohostSession_ProtoDecoder.LJ(cohostSession);
                }
            }
        }
        Map<Long, CohostHistoryResponse.UserInfo> map = responseData.userInfos;
        if (map == null) {
            responseData.userInfos = new HashMap();
            return;
        }
        if (map.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, CohostHistoryResponse.UserInfo>> it2 = responseData.userInfos.entrySet().iterator();
        while (it2.hasNext()) {
            CohostHistoryResponse.UserInfo value = it2.next().getValue();
            if (value != null) {
                Room room = value.room;
                if (room != null) {
                    _Room_ProtoDecoder.LJ(room);
                }
                RivalExtraInfo rivalExtraInfo = value.extraInfo;
                if (rivalExtraInfo != null) {
                    _RivalExtraInfo_ProtoDecoder.LJ(rivalExtraInfo);
                }
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CohostHistoryResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final CohostHistoryResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostHistoryResponse.ResponseData responseData, List list) {
    }
}
