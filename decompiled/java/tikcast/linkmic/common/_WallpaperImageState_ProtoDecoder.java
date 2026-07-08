package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WallpaperImageState_ProtoDecoder implements C0IMD<WallpaperImageState> {
    public static WallpaperImageState LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WallpaperImageState wallpaperImageState = new WallpaperImageState();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    wallpaperImageState.imageUrl = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return wallpaperImageState;
            }
        }
    }

    @Override // X.C0IMD
    public final WallpaperImageState LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(WallpaperImageState wallpaperImageState) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WallpaperImageState wallpaperImageState, List list) {
    }
}
