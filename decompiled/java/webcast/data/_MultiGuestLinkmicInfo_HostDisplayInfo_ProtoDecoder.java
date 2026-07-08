package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.data.MultiGuestLinkmicInfo;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestLinkmicInfo_HostDisplayInfo_ProtoDecoder implements C0IMD<MultiGuestLinkmicInfo.HostDisplayInfo> {
    public static MultiGuestLinkmicInfo.HostDisplayInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestLinkmicInfo.HostDisplayInfo hostDisplayInfo = new MultiGuestLinkmicInfo.HostDisplayInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    hostDisplayInfo.hostType = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                hostDisplayInfo.iconLinkUrl = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            hostDisplayInfo.hostColor = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        hostDisplayInfo.hostIconUrl = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    hostDisplayInfo.hostIconBackgroundUrl = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return hostDisplayInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final MultiGuestLinkmicInfo.HostDisplayInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MultiGuestLinkmicInfo.HostDisplayInfo hostDisplayInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestLinkmicInfo.HostDisplayInfo hostDisplayInfo, List list) {
    }
}
