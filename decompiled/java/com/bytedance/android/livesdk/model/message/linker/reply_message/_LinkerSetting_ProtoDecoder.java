package com.bytedance.android.livesdk.model.message.linker.reply_message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerSetting_ProtoDecoder implements C0IMD<LinkerSetting> {
    public static LinkerSetting LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkerSetting linkerSetting = new LinkerSetting();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkerSetting.maxMemberLimit = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        linkerSetting.linkType = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        linkerSetting.scene = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        linkerSetting.ownerUid = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        linkerSetting.ownerRoomId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        linkerSetting.vendor = (int) c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkerSetting;
            }
        }
    }

    @Override // X.C0IMD
    public final LinkerSetting LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkerSetting linkerSetting) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerSetting linkerSetting, List list) {
    }
}
