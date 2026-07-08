package webcast.data.multi_guest_social_data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Video_ProtoDecoder implements C0IMD<Video> {
    public static Video LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Video video = new Video();
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
                                    video.height = c1516680pZS.LJIIJ();
                                }
                            } else {
                                video.width = c1516680pZS.LJIIJ();
                            }
                        } else {
                            video.duration = Double.longBitsToDouble(c1516680pZS.LJIIIZ());
                        }
                    } else {
                        video.url = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    video.vid = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return video;
            }
        }
    }

    @Override // X.C0IMD
    public final Video LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(Video video) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Video video, List list) {
    }
}
