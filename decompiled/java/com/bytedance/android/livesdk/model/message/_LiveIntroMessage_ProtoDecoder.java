package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveIntroMessage_ProtoDecoder implements C0IMD<LiveIntroMessage> {
    @Override // X.C0IMD
    public final void LIZ(LiveIntroMessage liveIntroMessage) {
        LiveIntroMessage liveIntroMessage2 = liveIntroMessage;
        CommonMessageData commonMessageData = liveIntroMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        User user = liveIntroMessage2.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        List<BadgeStruct> list = liveIntroMessage2.badges;
        if (list == null) {
            liveIntroMessage2.badges = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (BadgeStruct badgeStruct : liveIntroMessage2.badges) {
            if (badgeStruct != null) {
                _BadgeStruct_ProtoDecoder.LJ(badgeStruct);
            }
        }
    }

    @Override // X.C0IMD
    public final LiveIntroMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LiveIntroMessage liveIntroMessage = new LiveIntroMessage();
        liveIntroMessage.badges = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        liveIntroMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        liveIntroMessage.id = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        liveIntroMessage.auditStatus = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        liveIntroMessage.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        liveIntroMessage.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        liveIntroMessage.introMode = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 7:
                        liveIntroMessage.badges.add(_BadgeStruct_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        liveIntroMessage.contentLanguage = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveIntroMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveIntroMessage liveIntroMessage, List list) {
    }
}
