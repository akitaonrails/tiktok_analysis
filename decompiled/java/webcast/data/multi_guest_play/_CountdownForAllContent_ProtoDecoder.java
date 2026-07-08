package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CountdownForAllContent_ProtoDecoder implements C0IMD<CountdownForAllContent> {
    public static CountdownForAllContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CountdownForAllContent countdownForAllContent = new CountdownForAllContent();
        countdownForAllContent.playUsers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        countdownForAllContent.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        countdownForAllContent.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        countdownForAllContent.playId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        countdownForAllContent.playStatus = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        countdownForAllContent.version = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        countdownForAllContent.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        countdownForAllContent.endTime = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        countdownForAllContent.playConfig = _CountdownForAllConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        countdownForAllContent.playUsers.add(_CountdownForAllUser_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return countdownForAllContent;
            }
        }
    }

    public static void LJ(CountdownForAllContent countdownForAllContent) {
        List<CountdownForAllUser> list = countdownForAllContent.playUsers;
        if (list == null) {
            countdownForAllContent.playUsers = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (CountdownForAllUser countdownForAllUser : countdownForAllContent.playUsers) {
            if (countdownForAllUser != null) {
                User user = countdownForAllUser.user;
                if (user != null) {
                    _User_ProtoDecoder.LJ(user);
                }
                ImageModel imageModel = countdownForAllUser.avatarThumb;
                if (imageModel != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CountdownForAllContent countdownForAllContent) {
        LJ(countdownForAllContent);
    }

    @Override // X.C0IMD
    public final CountdownForAllContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CountdownForAllContent countdownForAllContent, List list) {
    }
}
