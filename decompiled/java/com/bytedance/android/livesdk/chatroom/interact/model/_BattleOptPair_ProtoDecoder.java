package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import com.bytedance.android.livesdk.chatroom.model.interact._OptPairInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleOptPair_ProtoDecoder implements C0IMD<BattleOptPair> {
    public static BattleOptPair LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleOptPair battleOptPair = new BattleOptPair();
        battleOptPair.requestRoomList = new ArrayList();
        battleOptPair.rivalTeamRoomList = new ArrayList();
        battleOptPair.isInLinkmic = new HashMap();
        battleOptPair.selfTeamRoomList = new ArrayList();
        battleOptPair.requestRoomListStr = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        battleOptPair.optPairInfo = _OptPairInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        battleOptPair.selfTeamRoomList.add(_Room_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        battleOptPair.rivalTeamRoomList.add(_Room_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        battleOptPair.playType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        battleOptPair.inviteBlockReason = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        Boolean boolValueOf = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        boolValueOf = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (lValueOf != null) {
                                    if (boolValueOf != null) {
                                        battleOptPair.isInLinkmic.put(lValueOf, boolValueOf);
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
                    case 7:
                        battleOptPair.requestRoomList.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    case 8:
                        battleOptPair.requestRoomListStr.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        battleOptPair.showViewButton = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleOptPair;
            }
        }
    }

    public static void LJ(BattleOptPair battleOptPair) {
        OptPairInfo optPairInfo = battleOptPair.optPairInfo;
        if (optPairInfo != null) {
            _OptPairInfo_ProtoDecoder.LJ(optPairInfo);
        }
        List<Room> list = battleOptPair.selfTeamRoomList;
        if (list == null) {
            battleOptPair.selfTeamRoomList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (Room room : battleOptPair.selfTeamRoomList) {
                if (room != null) {
                    _Room_ProtoDecoder.LJ(room);
                }
            }
        }
        List<Room> list2 = battleOptPair.rivalTeamRoomList;
        if (list2 == null) {
            battleOptPair.rivalTeamRoomList = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (Room room2 : battleOptPair.rivalTeamRoomList) {
                if (room2 != null) {
                    _Room_ProtoDecoder.LJ(room2);
                }
            }
        }
        if (battleOptPair.isInLinkmic == null) {
            battleOptPair.isInLinkmic = new HashMap();
        }
        if (battleOptPair.requestRoomList == null) {
            battleOptPair.requestRoomList = new ArrayList();
        }
        if (battleOptPair.requestRoomListStr == null) {
            battleOptPair.requestRoomListStr = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleOptPair battleOptPair) {
        LJ(battleOptPair);
    }

    @Override // X.C0IMD
    public final BattleOptPair LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleOptPair battleOptPair, List list) {
    }
}
