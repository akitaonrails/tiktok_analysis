package com.bytedance.android.livesdk.model.message.linker.accpet_notice_message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerAcceptNoticeContent_ProtoDecoder implements C0IMD<LinkerAcceptNoticeContent> {
    public static LinkerAcceptNoticeContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkerAcceptNoticeContent linkerAcceptNoticeContent = new LinkerAcceptNoticeContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            linkerAcceptNoticeContent.toUserId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        linkerAcceptNoticeContent.fromRoomId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    linkerAcceptNoticeContent.fromUserId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkerAcceptNoticeContent;
            }
        }
    }

    @Override // X.C0IMD
    public final LinkerAcceptNoticeContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkerAcceptNoticeContent linkerAcceptNoticeContent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerAcceptNoticeContent linkerAcceptNoticeContent, List list) {
    }
}
