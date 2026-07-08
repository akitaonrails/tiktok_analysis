package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkGetSettingResult_ProtoDecoder implements C0IMD<LinkGetSettingResult> {
    @Override // X.C0IMD
    public final void LIZ(LinkGetSettingResult linkGetSettingResult) {
    }

    @Override // X.C0IMD
    public final LinkGetSettingResult LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkGetSettingResult linkGetSettingResult = new LinkGetSettingResult();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    linkGetSettingResult.settings = _AnchorLinkmicUserSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkGetSettingResult;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkGetSettingResult linkGetSettingResult, List list) {
    }
}
