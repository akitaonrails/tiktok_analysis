package webcast.api.creator;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;
import webcast.api.creator.PreScheduleStream;

/* JADX INFO: loaded from: classes.dex */
public final class _PreScheduleStream_PushStreamInfo_Quality_ProtoDecoder implements C0IMD<PreScheduleStream.PushStreamInfo.Quality> {
    public static PreScheduleStream.PushStreamInfo.Quality LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PreScheduleStream.PushStreamInfo.Quality quality = new PreScheduleStream.PushStreamInfo.Quality();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        quality.name = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        quality.sdkKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        quality.desc = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        quality.width = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        quality.height = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        quality.maxBitrate = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        quality.minBitrate = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        quality.defaultBitrate = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        quality.fps = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return quality;
            }
        }
    }

    @Override // X.C0IMD
    public final PreScheduleStream.PushStreamInfo.Quality LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PreScheduleStream.PushStreamInfo.Quality quality) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PreScheduleStream.PushStreamInfo.Quality quality, List list) {
    }
}
