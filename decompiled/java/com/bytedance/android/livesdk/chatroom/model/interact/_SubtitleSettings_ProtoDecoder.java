package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class _SubtitleSettings_ProtoDecoder implements C0IMD<SubtitleSettings> {
    public static SubtitleSettings LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubtitleSettings subtitleSettings = new SubtitleSettings();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        subtitleSettings.hasRight = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        subtitleSettings.temporaryBan = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        subtitleSettings.enable = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        subtitleSettings.expireDate = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        subtitleSettings.targetLanguage = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        subtitleSettings.labelText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subtitleSettings;
            }
        }
    }

    @Override // X.C0IMD
    public final SubtitleSettings LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SubtitleSettings subtitleSettings) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubtitleSettings subtitleSettings, List list) {
    }
}
