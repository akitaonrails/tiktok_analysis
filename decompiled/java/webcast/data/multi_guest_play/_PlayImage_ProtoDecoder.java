package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PlayImage_ProtoDecoder implements C0IMD<PlayImage> {
    public static PlayImage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PlayImage playImage = new PlayImage();
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
                                    playImage.imageId = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                playImage.status = c1516680pZS.LJIIJ();
                            }
                        } else {
                            playImage.type = c1516680pZS.LJIIJ();
                        }
                    } else {
                        playImage.url = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    playImage.uri = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return playImage;
            }
        }
    }

    @Override // X.C0IMD
    public final PlayImage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PlayImage playImage) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlayImage playImage, List list) {
    }
}
