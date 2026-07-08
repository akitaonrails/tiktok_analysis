package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RivalOptPairLinkmicStatus_ProtoDecoder implements C0IMD<RivalOptPairLinkmicStatus> {
    public static RivalOptPairLinkmicStatus LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RivalOptPairLinkmicStatus rivalOptPairLinkmicStatus = new RivalOptPairLinkmicStatus();
        rivalOptPairLinkmicStatus.requestRoomList = new ArrayList();
        rivalOptPairLinkmicStatus.isInLinkmic = new HashMap();
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
                                    rivalOptPairLinkmicStatus.requestRoomList.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                                }
                            } else {
                                long jLIZJ2 = c1516680pZS.LIZJ();
                                Long lValueOf = null;
                                Boolean boolValueOf = null;
                                while (true) {
                                    int iLJI2 = c1516680pZS.LJI();
                                    if (iLJI2 == -1) {
                                        break;
                                    }
                                    if (iLJI2 != 1) {
                                        if (iLJI2 == 2) {
                                            boolValueOf = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                                        }
                                    } else {
                                        lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                }
                                c1516680pZS.LJ(jLIZJ2);
                                if (lValueOf != null) {
                                    if (boolValueOf != null) {
                                        rivalOptPairLinkmicStatus.isInLinkmic.put(lValueOf, boolValueOf);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        } else {
                            rivalOptPairLinkmicStatus.blockReason = c1516680pZS.LJIIJ();
                        }
                    } else {
                        rivalOptPairLinkmicStatus.playType = c1516680pZS.LJIIJ();
                    }
                } else {
                    rivalOptPairLinkmicStatus.optPairInfo = _OptPairInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rivalOptPairLinkmicStatus;
            }
        }
    }

    public static void LJ(RivalOptPairLinkmicStatus rivalOptPairLinkmicStatus) {
        OptPairInfo optPairInfo = rivalOptPairLinkmicStatus.optPairInfo;
        if (optPairInfo != null) {
            _OptPairInfo_ProtoDecoder.LJ(optPairInfo);
        }
        if (rivalOptPairLinkmicStatus.isInLinkmic == null) {
            rivalOptPairLinkmicStatus.isInLinkmic = new HashMap();
        }
        if (rivalOptPairLinkmicStatus.requestRoomList == null) {
            rivalOptPairLinkmicStatus.requestRoomList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RivalOptPairLinkmicStatus rivalOptPairLinkmicStatus) {
        LJ(rivalOptPairLinkmicStatus);
    }

    @Override // X.C0IMD
    public final RivalOptPairLinkmicStatus LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RivalOptPairLinkmicStatus rivalOptPairLinkmicStatus, List list) {
    }
}
