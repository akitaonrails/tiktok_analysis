package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ReserveContent_ProtoDecoder implements C0IMD<ReserveContent> {
    public static ReserveContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ReserveContent reserveContent = new ReserveContent();
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
                                    reserveContent.reservationAnchorCount = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                reserveContent.createdTimestamp = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            reserveContent.redDotNum = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        reserveContent.reserverRoomId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    reserveContent.reserver = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return reserveContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ReserveContent reserveContent) {
        User user = reserveContent.reserver;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final ReserveContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ReserveContent reserveContent, List list) {
    }
}
