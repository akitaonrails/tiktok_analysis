package com.bytedance.android.livesdk.replay.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Caption_ProtoDecoder implements C0IMD<Caption> {
    public static Caption LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Caption caption = new Caption();
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
                                    caption.centerY = Double.longBitsToDouble(c1516680pZS.LJIIIZ());
                                }
                            } else {
                                caption.centerX = Double.longBitsToDouble(c1516680pZS.LJIIIZ());
                            }
                        } else {
                            caption.duration = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        caption.startTime = c1516680pZS.LJIIJJI();
                    }
                } else {
                    caption.text = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return caption;
            }
        }
    }

    @Override // X.C0IMD
    public final Caption LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(Caption caption) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Caption caption, List list) {
    }
}
