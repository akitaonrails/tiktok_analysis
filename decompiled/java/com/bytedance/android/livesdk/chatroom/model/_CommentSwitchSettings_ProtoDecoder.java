package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _CommentSwitchSettings_ProtoDecoder implements C0IMD<CommentSwitchSettings> {
    public static CommentSwitchSettings LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CommentSwitchSettings commentSwitchSettings = new CommentSwitchSettings();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        commentSwitchSettings.chat = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        commentSwitchSettings.chatSpamComments = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        commentSwitchSettings.chatL2 = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        commentSwitchSettings.chatCommunityFlagged = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        commentSwitchSettings.chatCommunityFlaggedReview = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        commentSwitchSettings.commentTray = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        commentSwitchSettings.muteDuration = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return commentSwitchSettings;
            }
        }
    }

    @Override // X.C0IMD
    public final CommentSwitchSettings LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CommentSwitchSettings commentSwitchSettings) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CommentSwitchSettings commentSwitchSettings, List list) {
    }
}
