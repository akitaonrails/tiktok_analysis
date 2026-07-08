package com.bytedance.android.livesdk.model.message.linker.random_linkmic_message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerRandomMatchContent_ProtoDecoder implements C0IMD<LinkerRandomMatchContent> {
    public static LinkerRandomMatchContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkerRandomMatchContent linkerRandomMatchContent = new LinkerRandomMatchContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkerRandomMatchContent.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        linkerRandomMatchContent.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        linkerRandomMatchContent.inviteType = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 4:
                        linkerRandomMatchContent.matchId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        linkerRandomMatchContent.innerChannelId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        linkerRandomMatchContent.sourceType = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        linkerRandomMatchContent.groupChannelId = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        linkerRandomMatchContent.playType = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        linkerRandomMatchContent.pairedTime = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkerRandomMatchContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkerRandomMatchContent linkerRandomMatchContent) {
        User user = linkerRandomMatchContent.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final LinkerRandomMatchContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerRandomMatchContent linkerRandomMatchContent, List list) {
    }
}
