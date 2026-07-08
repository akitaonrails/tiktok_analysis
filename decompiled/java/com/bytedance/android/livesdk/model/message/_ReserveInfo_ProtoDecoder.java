package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.ReserveInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ReserveInfo_ProtoDecoder implements C0IMD<ReserveInfo> {
    public static ReserveInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ReserveInfo reserveInfo = new ReserveInfo();
        reserveInfo.displayUserList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 6) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    reserveInfo.displayUserList.add(_ReserveInfo_ReserveUser_ProtoDecoder.LIZLLL(c1516680pZS));
                                }
                            } else {
                                reserveInfo.reservationAnchorCnts = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            reserveInfo.acceptAppointmentCnts = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        reserveInfo.isReservationSender = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    reserveInfo.reservationId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return reserveInfo;
            }
        }
    }

    public static void LJ(ReserveInfo reserveInfo) {
        User user;
        List<ReserveInfo.ReserveUser> list = reserveInfo.displayUserList;
        if (list == null) {
            reserveInfo.displayUserList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (ReserveInfo.ReserveUser reserveUser : reserveInfo.displayUserList) {
            if (reserveUser != null && (user = reserveUser.user) != null) {
                _User_ProtoDecoder.LJ(user);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ReserveInfo reserveInfo) {
        LJ(reserveInfo);
    }

    @Override // X.C0IMD
    public final ReserveInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ReserveInfo reserveInfo, List list) {
    }
}
