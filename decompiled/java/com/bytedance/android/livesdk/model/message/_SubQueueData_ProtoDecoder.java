package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubQueue_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubQueueData_ProtoDecoder implements C0IMD<SubQueueData> {
    public static SubQueueData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubQueueData subQueueData = new SubQueueData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            subQueueData.currentUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        subQueueData.queue = _SubQueue_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    subQueueData.messageTypeAction = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subQueueData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SubQueueData subQueueData) {
        User user = subQueueData.currentUser;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final SubQueueData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubQueueData subQueueData, List list) {
    }
}
