package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkerInfo;
import com.bytedance.android.livesdk.chatroom.interact.model._LinkerInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.RivalLinkmicStatus;
import com.bytedance.android.livesdk.chatroom.model.interact.RivalOptPairLinkmicStatus;
import com.bytedance.android.livesdk.chatroom.model.interact._RivalLinkmicStatus_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._RivalOptPairLinkmicStatus_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.RivalsUpdateMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _RivalsUpdateMessage_UpdatedRivals_ProtoDecoder implements C0IMD<RivalsUpdateMessage.UpdatedRivals> {
    public static RivalsUpdateMessage.UpdatedRivals LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RivalsUpdateMessage.UpdatedRivals updatedRivals = new RivalsUpdateMessage.UpdatedRivals();
        updatedRivals.linkmicStatusMap = new HashMap();
        updatedRivals.roomInfoMap = new HashMap();
        updatedRivals.optPairLinkmicStatus = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                Long lValueOf = null;
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 51) {
                            if (iLJI != 52) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                long jLIZJ2 = c1516680pZS.LIZJ();
                                RivalOptPairLinkmicStatus rivalOptPairLinkmicStatusLIZLLL = null;
                                while (true) {
                                    int iLJI2 = c1516680pZS.LJI();
                                    if (iLJI2 == -1) {
                                        break;
                                    }
                                    if (iLJI2 != 1) {
                                        if (iLJI2 == 2) {
                                            rivalOptPairLinkmicStatusLIZLLL = _RivalOptPairLinkmicStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                }
                                c1516680pZS.LJ(jLIZJ2);
                                if (lValueOf != null) {
                                    if (rivalOptPairLinkmicStatusLIZLLL != null) {
                                        updatedRivals.optPairLinkmicStatus.put(lValueOf, rivalOptPairLinkmicStatusLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        } else {
                            updatedRivals.statusText = _RivalsUpdateMessage_UpdatedRivals_StatusText_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        long jLIZJ3 = c1516680pZS.LIZJ();
                        Room roomLIZLLL = null;
                        while (true) {
                            int iLJI3 = c1516680pZS.LJI();
                            if (iLJI3 == -1) {
                                break;
                            }
                            if (iLJI3 != 1) {
                                if (iLJI3 == 2) {
                                    roomLIZLLL = _Room_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        }
                        c1516680pZS.LJ(jLIZJ3);
                        if (lValueOf != null) {
                            if (roomLIZLLL != null) {
                                updatedRivals.roomInfoMap.put(lValueOf, roomLIZLLL);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    long jLIZJ4 = c1516680pZS.LIZJ();
                    RivalLinkmicStatus rivalLinkmicStatusLIZLLL = null;
                    while (true) {
                        int iLJI4 = c1516680pZS.LJI();
                        if (iLJI4 == -1) {
                            break;
                        }
                        if (iLJI4 != 1) {
                            if (iLJI4 == 2) {
                                rivalLinkmicStatusLIZLLL = _RivalLinkmicStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    }
                    c1516680pZS.LJ(jLIZJ4);
                    if (lValueOf != null) {
                        if (rivalLinkmicStatusLIZLLL != null) {
                            updatedRivals.linkmicStatusMap.put(lValueOf, rivalLinkmicStatusLIZLLL);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return updatedRivals;
            }
        }
    }

    public static void LJ(RivalsUpdateMessage.UpdatedRivals updatedRivals) {
        Map<Long, RivalLinkmicStatus> map = updatedRivals.linkmicStatusMap;
        if (map == null) {
            updatedRivals.linkmicStatusMap = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, RivalLinkmicStatus>> it2 = updatedRivals.linkmicStatusMap.entrySet().iterator();
            while (it2.hasNext()) {
                RivalLinkmicStatus value = it2.next().getValue();
                if (value != null) {
                    LinkerInfo linkerInfo = value.linkerInfo;
                    if (linkerInfo != null) {
                        _LinkerInfo_ProtoDecoder.LJ(linkerInfo);
                    }
                    com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo optPairInfo = value.optPairInfo;
                    if (optPairInfo != null) {
                        com.bytedance.android.livesdk.chatroom.model.interact._OptPairInfo_ProtoDecoder.LJ(optPairInfo);
                    }
                }
            }
        }
        Map<Long, Room> map2 = updatedRivals.roomInfoMap;
        if (map2 == null) {
            updatedRivals.roomInfoMap = new HashMap();
        } else if (!map2.isEmpty()) {
            Iterator<Map.Entry<Long, Room>> it3 = updatedRivals.roomInfoMap.entrySet().iterator();
            while (it3.hasNext()) {
                Room value2 = it3.next().getValue();
                if (value2 != null) {
                    _Room_ProtoDecoder.LJ(value2);
                }
            }
        }
        Map<Long, RivalOptPairLinkmicStatus> map3 = updatedRivals.optPairLinkmicStatus;
        if (map3 == null) {
            updatedRivals.optPairLinkmicStatus = new HashMap();
            return;
        }
        if (map3.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, RivalOptPairLinkmicStatus>> it4 = updatedRivals.optPairLinkmicStatus.entrySet().iterator();
        while (it4.hasNext()) {
            RivalOptPairLinkmicStatus value3 = it4.next().getValue();
            if (value3 != null) {
                _RivalOptPairLinkmicStatus_ProtoDecoder.LJ(value3);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RivalsUpdateMessage.UpdatedRivals updatedRivals) {
        LJ(updatedRivals);
    }

    @Override // X.C0IMD
    public final RivalsUpdateMessage.UpdatedRivals LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RivalsUpdateMessage.UpdatedRivals updatedRivals, List list) {
    }
}
