package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AccompanimentStruct_ProtoDecoder implements C0IMD<AccompanimentStruct> {
    public static AccompanimentStruct LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AccompanimentStruct accompanimentStruct = new AccompanimentStruct();
        accompanimentStruct.accompanimentUrls = new ArrayList();
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
                                    accompanimentStruct.volumeAmplitudePeak = Double.longBitsToDouble(c1516680pZS.LJIIIZ());
                                }
                            } else {
                                accompanimentStruct.volumeLoudnessLufs = Double.longBitsToDouble(c1516680pZS.LJIIIZ());
                            }
                        } else {
                            accompanimentStruct.id = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        accompanimentStruct.accompanimentUrls.add(C1516700pZU.LIZLLL(c1516680pZS));
                    }
                } else {
                    accompanimentStruct.vid = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return accompanimentStruct;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AccompanimentStruct accompanimentStruct) {
        AccompanimentStruct accompanimentStruct2 = accompanimentStruct;
        if (accompanimentStruct2.accompanimentUrls == null) {
            accompanimentStruct2.accompanimentUrls = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final AccompanimentStruct LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AccompanimentStruct accompanimentStruct, List list) {
    }
}
