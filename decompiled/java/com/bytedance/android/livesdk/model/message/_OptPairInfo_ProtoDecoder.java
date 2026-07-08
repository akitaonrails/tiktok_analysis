package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.OptPairInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _OptPairInfo_ProtoDecoder implements C0IMD<OptPairInfo> {
    public static OptPairInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        OptPairInfo optPairInfo = new OptPairInfo();
        optPairInfo.displayUserList = new ArrayList();
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
                                    optPairInfo.optPairType = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                optPairInfo.expectedTimeSec = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            optPairInfo.buttonNoticeType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        optPairInfo.displayUserList.add(_OptPairInfo_OptPairUser_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    optPairInfo.mappingId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return optPairInfo;
            }
        }
    }

    public static void LJ(OptPairInfo optPairInfo) {
        User user;
        List<OptPairInfo.OptPairUser> list = optPairInfo.displayUserList;
        if (list == null) {
            optPairInfo.displayUserList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (OptPairInfo.OptPairUser optPairUser : optPairInfo.displayUserList) {
            if (optPairUser != null && (user = optPairUser.user) != null) {
                _User_ProtoDecoder.LJ(user);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(OptPairInfo optPairInfo) {
        LJ(optPairInfo);
    }

    @Override // X.C0IMD
    public final OptPairInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OptPairInfo optPairInfo, List list) {
    }
}
