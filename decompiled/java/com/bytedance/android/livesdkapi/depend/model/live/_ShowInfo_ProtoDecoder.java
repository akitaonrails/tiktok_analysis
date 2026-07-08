package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ShowInfo_ProtoDecoder implements C0IMD<ShowInfo> {
    public static ShowInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ShowInfo showInfo = new ShowInfo();
        showInfo.anchors = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                showInfo.showIntroduction = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            showInfo.anchors.add(_User_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        showInfo.showEndTime = c1516680pZS.LJIIJJI();
                    }
                } else {
                    showInfo.showStartTime = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return showInfo;
            }
        }
    }

    public static void LJ(ShowInfo showInfo) {
        List<User> list = showInfo.anchors;
        if (list == null) {
            showInfo.anchors = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (User user : showInfo.anchors) {
            if (user != null) {
                _User_ProtoDecoder.LJ(user);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ShowInfo showInfo) {
        LJ(showInfo);
    }

    @Override // X.C0IMD
    public final ShowInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ShowInfo showInfo, List list) {
    }
}
