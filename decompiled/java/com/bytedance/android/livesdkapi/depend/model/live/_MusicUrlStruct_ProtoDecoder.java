package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MusicUrlStruct_ProtoDecoder implements C0IMD<MusicUrlStruct> {
    public static MusicUrlStruct LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MusicUrlStruct musicUrlStruct = new MusicUrlStruct();
        musicUrlStruct.urlList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        musicUrlStruct.urlList.add(C1516700pZU.LIZLLL(c1516680pZS));
                    }
                } else {
                    musicUrlStruct.uri = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return musicUrlStruct;
            }
        }
    }

    public static void LJ(MusicUrlStruct musicUrlStruct) {
        if (musicUrlStruct.urlList == null) {
            musicUrlStruct.urlList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MusicUrlStruct musicUrlStruct) {
        LJ(musicUrlStruct);
    }

    @Override // X.C0IMD
    public final MusicUrlStruct LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MusicUrlStruct musicUrlStruct, List list) {
    }
}
