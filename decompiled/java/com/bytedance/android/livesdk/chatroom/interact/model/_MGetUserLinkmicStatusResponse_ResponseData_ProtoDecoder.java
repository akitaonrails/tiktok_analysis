package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import com.bytedance.android.livesdk.chatroom.model.interact._OptPairInfo_ProtoDecoder;
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
public final class _MGetUserLinkmicStatusResponse_ResponseData_ProtoDecoder implements C0IMD<MGetUserLinkmicStatusResponse.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(MGetUserLinkmicStatusResponse.ResponseData responseData) {
        MGetUserLinkmicStatusResponse.ResponseData responseData2 = responseData;
        Map<Long, MGetUserLinkmicStatusResponse.LinkmicStatus> map = responseData2.linkmicStatusMap;
        if (map == null) {
            responseData2.linkmicStatusMap = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, MGetUserLinkmicStatusResponse.LinkmicStatus>> it2 = responseData2.linkmicStatusMap.entrySet().iterator();
            while (it2.hasNext()) {
                MGetUserLinkmicStatusResponse.LinkmicStatus value = it2.next().getValue();
                if (value != null) {
                    LinkerInfo linkerInfo = value.linkerInfo;
                    if (linkerInfo != null) {
                        _LinkerInfo_ProtoDecoder.LJ(linkerInfo);
                    }
                    OptPairInfo optPairInfo = value.optPairInfo;
                    if (optPairInfo != null) {
                        _OptPairInfo_ProtoDecoder.LJ(optPairInfo);
                    }
                }
            }
        }
        Map<Long, Room> map2 = responseData2.roomInfo;
        if (map2 == null) {
            responseData2.roomInfo = new HashMap();
        } else if (!map2.isEmpty()) {
            Iterator<Map.Entry<Long, Room>> it3 = responseData2.roomInfo.entrySet().iterator();
            while (it3.hasNext()) {
                Room value2 = it3.next().getValue();
                if (value2 != null) {
                    _Room_ProtoDecoder.LJ(value2);
                }
            }
        }
        Map<Long, MGetUserLinkmicStatusResponse.OptPairLinkmicStatus> map3 = responseData2.optPairLinkmicStatus;
        if (map3 == null) {
            responseData2.optPairLinkmicStatus = new HashMap();
        } else if (!map3.isEmpty()) {
            Iterator<Map.Entry<Long, MGetUserLinkmicStatusResponse.OptPairLinkmicStatus>> it4 = responseData2.optPairLinkmicStatus.entrySet().iterator();
            while (it4.hasNext()) {
                MGetUserLinkmicStatusResponse.OptPairLinkmicStatus value3 = it4.next().getValue();
                if (value3 != null) {
                    _MGetUserLinkmicStatusResponse_OptPairLinkmicStatus_ProtoDecoder.LJ(value3);
                }
            }
        }
        Map<Long, MGetUserLinkmicStatusResponse.RemindStatus> map4 = responseData2.userRemindStatus;
        if (map4 == null) {
            responseData2.userRemindStatus = new HashMap();
        } else if (!map4.isEmpty()) {
            Iterator<Map.Entry<Long, MGetUserLinkmicStatusResponse.RemindStatus>> it5 = responseData2.userRemindStatus.entrySet().iterator();
            while (it5.hasNext()) {
                it5.next().getValue();
            }
        }
        List<MGetUserLinkmicStatusResponse.RivalsRoom> list = responseData2.newRivalsRoom;
        if (list == null) {
            responseData2.newRivalsRoom = new ArrayList();
        } else if (!list.isEmpty()) {
            for (MGetUserLinkmicStatusResponse.RivalsRoom rivalsRoom : responseData2.newRivalsRoom) {
                if (rivalsRoom != null) {
                    _MGetUserLinkmicStatusResponse_RivalsRoom_ProtoDecoder.LJ(rivalsRoom);
                }
            }
        }
        Map<Long, RivalExtraInfo> map5 = responseData2.rivalsExtraInfo;
        if (map5 == null) {
            responseData2.rivalsExtraInfo = new HashMap();
        } else if (!map5.isEmpty()) {
            Iterator<Map.Entry<Long, RivalExtraInfo>> it6 = responseData2.rivalsExtraInfo.entrySet().iterator();
            while (it6.hasNext()) {
                RivalExtraInfo value4 = it6.next().getValue();
                if (value4 != null) {
                    _RivalExtraInfo_ProtoDecoder.LJ(value4);
                }
            }
        }
        Map<Long, MGetUserLinkmicStatusResponse.RivalsRoom> map6 = responseData2.rivalsRoomInfo;
        if (map6 == null) {
            responseData2.rivalsRoomInfo = new HashMap();
            return;
        }
        if (map6.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, MGetUserLinkmicStatusResponse.RivalsRoom>> it7 = responseData2.rivalsRoomInfo.entrySet().iterator();
        while (it7.hasNext()) {
            MGetUserLinkmicStatusResponse.RivalsRoom value5 = it7.next().getValue();
            if (value5 != null) {
                _MGetUserLinkmicStatusResponse_RivalsRoom_ProtoDecoder.LJ(value5);
            }
        }
    }

    @Override // X.C0IMD
    public final MGetUserLinkmicStatusResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MGetUserLinkmicStatusResponse.ResponseData responseData = new MGetUserLinkmicStatusResponse.ResponseData();
        responseData.rivalsRoomInfo = new HashMap();
        responseData.linkmicStatusMap = new HashMap();
        responseData.rivalsExtraInfo = new HashMap();
        responseData.roomInfo = new HashMap();
        responseData.userRemindStatus = new HashMap();
        responseData.newRivalsRoom = new ArrayList();
        responseData.optPairLinkmicStatus = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                Long lValueOf = null;
                switch (iLJI) {
                    case 1:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatusLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        linkmicStatusLIZLLL = _MGetUserLinkmicStatusResponse_LinkmicStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (lValueOf != null) {
                                    if (linkmicStatusLIZLLL != null) {
                                        responseData.linkmicStatusMap.put(lValueOf, linkmicStatusLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case 2:
                        long jLIZJ3 = c1516680pZS.LIZJ();
                        Room roomLIZLLL = null;
                        while (true) {
                            int iLJI3 = c1516680pZS.LJI();
                            if (iLJI3 != -1) {
                                if (iLJI3 != 1) {
                                    if (iLJI3 == 2) {
                                        roomLIZLLL = _Room_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ3);
                                if (lValueOf != null) {
                                    if (roomLIZLLL != null) {
                                        responseData.roomInfo.put(lValueOf, roomLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case 3:
                        responseData.statusText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        responseData.statusTextType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        long jLIZJ4 = c1516680pZS.LIZJ();
                        MGetUserLinkmicStatusResponse.OptPairLinkmicStatus optPairLinkmicStatusLIZLLL = null;
                        while (true) {
                            int iLJI4 = c1516680pZS.LJI();
                            if (iLJI4 != -1) {
                                if (iLJI4 != 1) {
                                    if (iLJI4 == 2) {
                                        optPairLinkmicStatusLIZLLL = _MGetUserLinkmicStatusResponse_OptPairLinkmicStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ4);
                                if (lValueOf != null) {
                                    if (optPairLinkmicStatusLIZLLL != null) {
                                        responseData.optPairLinkmicStatus.put(lValueOf, optPairLinkmicStatusLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case 6:
                        responseData.refreshSessionId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        long jLIZJ5 = c1516680pZS.LIZJ();
                        MGetUserLinkmicStatusResponse.RemindStatus remindStatusLIZLLL = null;
                        while (true) {
                            int iLJI5 = c1516680pZS.LJI();
                            if (iLJI5 != -1) {
                                if (iLJI5 != 1) {
                                    if (iLJI5 == 2) {
                                        remindStatusLIZLLL = _MGetUserLinkmicStatusResponse_RemindStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ5);
                                if (lValueOf != null) {
                                    if (remindStatusLIZLLL != null) {
                                        responseData.userRemindStatus.put(lValueOf, remindStatusLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case 8:
                        responseData.newRivalsRoom.add(_MGetUserLinkmicStatusResponse_RivalsRoom_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        long jLIZJ6 = c1516680pZS.LIZJ();
                        RivalExtraInfo rivalExtraInfoLIZLLL = null;
                        while (true) {
                            int iLJI6 = c1516680pZS.LJI();
                            if (iLJI6 != -1) {
                                if (iLJI6 != 1) {
                                    if (iLJI6 == 2) {
                                        rivalExtraInfoLIZLLL = _RivalExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ6);
                                if (lValueOf != null) {
                                    if (rivalExtraInfoLIZLLL != null) {
                                        responseData.rivalsExtraInfo.put(lValueOf, rivalExtraInfoLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        long jLIZJ7 = c1516680pZS.LIZJ();
                        MGetUserLinkmicStatusResponse.RivalsRoom rivalsRoomLIZLLL = null;
                        while (true) {
                            int iLJI7 = c1516680pZS.LJI();
                            if (iLJI7 != -1) {
                                if (iLJI7 != 1) {
                                    if (iLJI7 == 2) {
                                        rivalsRoomLIZLLL = _MGetUserLinkmicStatusResponse_RivalsRoom_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ7);
                                if (lValueOf != null) {
                                    if (rivalsRoomLIZLLL != null) {
                                        responseData.rivalsRoomInfo.put(lValueOf, rivalsRoomLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MGetUserLinkmicStatusResponse.ResponseData responseData, List list) {
    }
}
