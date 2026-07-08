package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LyricStruct_ProtoDecoder implements C0IMD<LyricStruct> {
    public static LyricStruct LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LyricStruct lyricStruct = new LyricStruct();
        lyricStruct.klyricUrls = new ArrayList();
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
                                    lyricStruct.lyricStatus = c1516680pZS.LJIIJ();
                                }
                            } else {
                                lyricStruct.klyricUrls.add(C1516700pZU.LIZLLL(c1516680pZS));
                            }
                        } else {
                            lyricStruct.vid = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        lyricStruct.lyricType = c1516680pZS.LJIIJ();
                    }
                } else {
                    lyricStruct.id = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return lyricStruct;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LyricStruct lyricStruct) {
        LyricStruct lyricStruct2 = lyricStruct;
        if (lyricStruct2.klyricUrls == null) {
            lyricStruct2.klyricUrls = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final LyricStruct LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LyricStruct lyricStruct, List list) {
    }
}
