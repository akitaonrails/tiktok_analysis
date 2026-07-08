package com.bytedance.android.livesdk.model.message.linker.leave_message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerLeaveContent_ProtoDecoder implements C0IMD<LinkerLeaveContent> {
    public static LinkerLeaveContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkerLeaveContent linkerLeaveContent = new LinkerLeaveContent();
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
                                linkerLeaveContent.leaveReason = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            linkerLeaveContent.sendLeaveUid = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        linkerLeaveContent.linkmic_id_str = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    linkerLeaveContent.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkerLeaveContent;
            }
        }
    }

    @Override // X.C0IMD
    public final LinkerLeaveContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkerLeaveContent linkerLeaveContent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerLeaveContent linkerLeaveContent, List list) {
    }
}
