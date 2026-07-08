package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common._LinkerMediaChangeOperator_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerMediaChangeContent_ProtoDecoder implements C0IMD<LinkerMediaChangeContent> {
    public static LinkerMediaChangeContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkerMediaChangeContent linkerMediaChangeContent = new LinkerMediaChangeContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    if (iLJI != 7) {
                                        C1516700pZU.LJ(c1516680pZS);
                                    } else {
                                        linkerMediaChangeContent.operatorInfo = _LinkerMediaChangeOperator_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    linkerMediaChangeContent.changeScene = c1516680pZS.LJIIJ();
                                }
                            } else {
                                linkerMediaChangeContent.roomId = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        } else {
                            linkerMediaChangeContent.anchorId = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    } else {
                        linkerMediaChangeContent.toUserId = Long.valueOf(c1516680pZS.LJIIJJI());
                    }
                } else {
                    linkerMediaChangeContent.op = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkerMediaChangeContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkerMediaChangeContent linkerMediaChangeContent) {
    }

    @Override // X.C0IMD
    public final LinkerMediaChangeContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerMediaChangeContent linkerMediaChangeContent, List list) {
    }
}
