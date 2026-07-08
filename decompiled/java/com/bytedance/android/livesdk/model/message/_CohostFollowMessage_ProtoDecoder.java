package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostFollowMessage_ProtoDecoder implements C0IMD<CohostFollowMessage> {
    public static CohostFollowMessage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostFollowMessage cohostFollowMessage = new CohostFollowMessage();
        cohostFollowMessage.displayUserInfos = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            cohostFollowMessage.displayUserInfos.add(_DisplayUserInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        cohostFollowMessage.description = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    cohostFollowMessage.title = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostFollowMessage;
            }
        }
    }

    public static void LJ(CohostFollowMessage cohostFollowMessage) {
        User user;
        Text text = cohostFollowMessage.title;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = cohostFollowMessage.description;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        List<DisplayUserInfo> list = cohostFollowMessage.displayUserInfos;
        if (list == null) {
            cohostFollowMessage.displayUserInfos = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (DisplayUserInfo displayUserInfo : cohostFollowMessage.displayUserInfos) {
            if (displayUserInfo != null && (user = displayUserInfo.userData) != null) {
                _User_ProtoDecoder.LJ(user);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CohostFollowMessage cohostFollowMessage) {
        LJ(cohostFollowMessage);
    }

    @Override // X.C0IMD
    public final CohostFollowMessage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostFollowMessage cohostFollowMessage, List list) {
    }
}
