package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common._GroupPlayer_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _LeaveJoinGroupContent_ProtoDecoder implements C0IMD<LeaveJoinGroupContent> {
    public static LeaveJoinGroupContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LeaveJoinGroupContent leaveJoinGroupContent = new LeaveJoinGroupContent();
        leaveJoinGroupContent.linkedUserUiPositions = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                leaveJoinGroupContent.linkedUserUiPositions.add(C1516700pZU.LIZLLL(c1516680pZS));
                            }
                        } else {
                            leaveJoinGroupContent.leaveSource = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        leaveJoinGroupContent.groupChannelId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    leaveJoinGroupContent.operator = _GroupPlayer_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return leaveJoinGroupContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LeaveJoinGroupContent leaveJoinGroupContent) {
        LeaveJoinGroupContent leaveJoinGroupContent2 = leaveJoinGroupContent;
        if (leaveJoinGroupContent2.linkedUserUiPositions == null) {
            leaveJoinGroupContent2.linkedUserUiPositions = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final LeaveJoinGroupContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LeaveJoinGroupContent leaveJoinGroupContent, List list) {
    }
}
