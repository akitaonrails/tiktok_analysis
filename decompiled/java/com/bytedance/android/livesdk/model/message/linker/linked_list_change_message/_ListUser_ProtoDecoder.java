package com.bytedance.android.livesdk.model.message.linker.linked_list_change_message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ListUser_ProtoDecoder implements C0IMD<ListUser> {
    public static ListUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ListUser listUser = new ListUser();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        listUser.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        listUser.linkmicId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        listUser.linkmicIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        listUser.linkStatus = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        listUser.linkType = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        listUser.userPosition = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        listUser.silenceStatus = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        listUser.modifyTime = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        listUser.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        listUser.roleType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return listUser;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ListUser listUser) {
        User user = listUser.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final ListUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ListUser listUser, List list) {
    }
}
