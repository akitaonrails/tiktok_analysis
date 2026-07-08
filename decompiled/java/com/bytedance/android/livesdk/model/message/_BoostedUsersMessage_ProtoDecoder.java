package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BoostedUsersMessage_ProtoDecoder implements C0IMD<BoostedUsersMessage> {
    @Override // X.C0IMD
    public final void LIZ(BoostedUsersMessage boostedUsersMessage) {
        BoostedUsersMessage boostedUsersMessage2 = boostedUsersMessage;
        CommonMessageData commonMessageData = boostedUsersMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<PromoteAdBoostedUsers> list = boostedUsersMessage2.promoteAds;
        if (list == null) {
            boostedUsersMessage2.promoteAds = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<PromoteAdBoostedUsers> it2 = boostedUsersMessage2.promoteAds.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final BoostedUsersMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        BoostedUsersMessage boostedUsersMessage = new BoostedUsersMessage();
        boostedUsersMessage.promoteAds = new ArrayList();
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
                                boostedUsersMessage.promoteAds.add(_PromoteAdBoostedUsers_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            boostedUsersMessage.flare = _FlareBoostedUsers_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        boostedUsersMessage.totalCnt = c1516680pZS.LJIIJJI();
                    }
                } else {
                    boostedUsersMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return boostedUsersMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BoostedUsersMessage boostedUsersMessage, List list) {
    }
}
