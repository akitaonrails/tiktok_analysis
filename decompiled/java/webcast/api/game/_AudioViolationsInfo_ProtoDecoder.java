package webcast.api.game;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AudioViolationsInfo_ProtoDecoder implements C0IMD<AudioViolationsInfo> {
    public static AudioViolationsInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AudioViolationsInfo audioViolationsInfo = new AudioViolationsInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        audioViolationsInfo.educationLink = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    audioViolationsInfo.recentPunishCount = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return audioViolationsInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final AudioViolationsInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AudioViolationsInfo audioViolationsInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AudioViolationsInfo audioViolationsInfo, List list) {
    }
}
