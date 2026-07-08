package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import com.bytedance.android.livesdk.chatroom.model.interact._OptPairInfo_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MGetUserLinkmicStatusResponse_OptPairLinkmicStatus_ProtoDecoder implements C0IMD<MGetUserLinkmicStatusResponse.OptPairLinkmicStatus> {
    public static MGetUserLinkmicStatusResponse.OptPairLinkmicStatus LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MGetUserLinkmicStatusResponse.OptPairLinkmicStatus optPairLinkmicStatus = new MGetUserLinkmicStatusResponse.OptPairLinkmicStatus();
        optPairLinkmicStatus.requestRoomList = new ArrayList();
        optPairLinkmicStatus.isInLinkmic = new HashMap();
        optPairLinkmicStatus.requestRoomListStr = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        optPairLinkmicStatus.optPairInfo = _OptPairInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        optPairLinkmicStatus.playType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        optPairLinkmicStatus.blockReason = c1516680pZS.LJIIJ();
                        break;
                    case 4:
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
                                        optPairLinkmicStatus.isInLinkmic.put(lValueOf, boolValueOf);
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
                    case 5:
                        optPairLinkmicStatus.requestRoomList.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    case 6:
                        optPairLinkmicStatus.requestRoomListStr.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        optPairLinkmicStatus.showViewButton = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return optPairLinkmicStatus;
            }
        }
    }

    public static void LJ(MGetUserLinkmicStatusResponse.OptPairLinkmicStatus optPairLinkmicStatus) {
        OptPairInfo optPairInfo = optPairLinkmicStatus.optPairInfo;
        if (optPairInfo != null) {
            _OptPairInfo_ProtoDecoder.LJ(optPairInfo);
        }
        if (optPairLinkmicStatus.isInLinkmic == null) {
            optPairLinkmicStatus.isInLinkmic = new HashMap();
        }
        if (optPairLinkmicStatus.requestRoomList == null) {
            optPairLinkmicStatus.requestRoomList = new ArrayList();
        }
        if (optPairLinkmicStatus.requestRoomListStr == null) {
            optPairLinkmicStatus.requestRoomListStr = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MGetUserLinkmicStatusResponse.OptPairLinkmicStatus optPairLinkmicStatus) {
        LJ(optPairLinkmicStatus);
    }

    @Override // X.C0IMD
    public final MGetUserLinkmicStatusResponse.OptPairLinkmicStatus LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MGetUserLinkmicStatusResponse.OptPairLinkmicStatus optPairLinkmicStatus, List list) {
    }
}
