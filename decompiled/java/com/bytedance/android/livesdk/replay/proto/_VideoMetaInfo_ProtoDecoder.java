package com.bytedance.android.livesdk.replay.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class _VideoMetaInfo_ProtoDecoder implements C0IMD<VideoMetaInfo> {
    public static VideoMetaInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        VideoMetaInfo videoMetaInfo = new VideoMetaInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        videoMetaInfo.url = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        videoMetaInfo.height = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        videoMetaInfo.width = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        videoMetaInfo.size = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        videoMetaInfo.duration = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 6:
                        videoMetaInfo.fileId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return videoMetaInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final VideoMetaInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(VideoMetaInfo videoMetaInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, VideoMetaInfo videoMetaInfo, List list) {
    }
}
