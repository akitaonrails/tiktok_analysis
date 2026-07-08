package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.SearchRivalsResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _SearchRivalsResponse_ResponseData_ProtoDecoder implements C0IMD<SearchRivalsResponse.ResponseData> {
    public static SearchRivalsResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SearchRivalsResponse.ResponseData responseData = new SearchRivalsResponse.ResponseData();
        responseData.rivalUserToExtraInfos = new HashMap();
        responseData.cellList = new ArrayList();
        responseData.rivalExtraInfos = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    Long lValueOf = null;
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            switch (iLJI) {
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    responseData.nextOffset = c1516680pZS.LJIIJ();
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    responseData.hasMore = C1516700pZU.LIZ(c1516680pZS);
                                    break;
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    responseData.searchId = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                default:
                                    C1516700pZU.LJ(c1516680pZS);
                                    break;
                            }
                        } else {
                            long jLIZJ2 = c1516680pZS.LIZJ();
                            RivalExtraInfo rivalExtraInfoLIZLLL = null;
                            while (true) {
                                int iLJI2 = c1516680pZS.LJI();
                                if (iLJI2 != -1) {
                                    if (iLJI2 != 1) {
                                        if (iLJI2 == 2) {
                                            rivalExtraInfoLIZLLL = _RivalExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                } else {
                                    c1516680pZS.LJ(jLIZJ2);
                                    if (lValueOf != null) {
                                        if (rivalExtraInfoLIZLLL != null) {
                                            responseData.rivalUserToExtraInfos.put(lValueOf, rivalExtraInfoLIZLLL);
                                        } else {
                                            throw new IllegalStateException("Map value must not be null!");
                                        }
                                    } else {
                                        throw new IllegalStateException("Map key must not be null!");
                                    }
                                }
                            }
                        }
                    } else {
                        long jLIZJ3 = c1516680pZS.LIZJ();
                        RivalExtraInfo rivalExtraInfoLIZLLL2 = null;
                        while (true) {
                            int iLJI3 = c1516680pZS.LJI();
                            if (iLJI3 != -1) {
                                if (iLJI3 != 1) {
                                    if (iLJI3 == 2) {
                                        rivalExtraInfoLIZLLL2 = _RivalExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ3);
                                if (lValueOf != null) {
                                    if (rivalExtraInfoLIZLLL2 != null) {
                                        responseData.rivalExtraInfos.put(lValueOf, rivalExtraInfoLIZLLL2);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    }
                } else {
                    responseData.cellList.add(_SearchRivalsResponse_Cell_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(SearchRivalsResponse.ResponseData responseData) {
        Room room;
        List<SearchRivalsResponse.Cell> list = responseData.cellList;
        if (list == null) {
            responseData.cellList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (SearchRivalsResponse.Cell cell : responseData.cellList) {
                if (cell != null && (room = cell.room) != null) {
                    _Room_ProtoDecoder.LJ(room);
                }
            }
        }
        Map<Long, RivalExtraInfo> map = responseData.rivalExtraInfos;
        if (map == null) {
            responseData.rivalExtraInfos = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, RivalExtraInfo>> it2 = responseData.rivalExtraInfos.entrySet().iterator();
            while (it2.hasNext()) {
                RivalExtraInfo value = it2.next().getValue();
                if (value != null) {
                    _RivalExtraInfo_ProtoDecoder.LJ(value);
                }
            }
        }
        Map<Long, RivalExtraInfo> map2 = responseData.rivalUserToExtraInfos;
        if (map2 == null) {
            responseData.rivalUserToExtraInfos = new HashMap();
            return;
        }
        if (map2.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, RivalExtraInfo>> it3 = responseData.rivalUserToExtraInfos.entrySet().iterator();
        while (it3.hasNext()) {
            RivalExtraInfo value2 = it3.next().getValue();
            if (value2 != null) {
                _RivalExtraInfo_ProtoDecoder.LJ(value2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SearchRivalsResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final SearchRivalsResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SearchRivalsResponse.ResponseData responseData, List list) {
    }
}
