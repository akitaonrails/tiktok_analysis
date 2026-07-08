package webcast.api.creator;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.api.creator.PreScheduleStream;

/* JADX INFO: loaded from: classes.dex */
public final class _PreScheduleStream_PushStreamInfo_QualityList_ProtoDecoder implements C0IMD<PreScheduleStream.PushStreamInfo.QualityList> {
    public static PreScheduleStream.PushStreamInfo.QualityList LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PreScheduleStream.PushStreamInfo.QualityList qualityList = new PreScheduleStream.PushStreamInfo.QualityList();
        qualityList.qualities = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    qualityList.qualities.add(_PreScheduleStream_PushStreamInfo_Quality_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return qualityList;
            }
        }
    }

    public static void LJ(PreScheduleStream.PushStreamInfo.QualityList qualityList) {
        List<PreScheduleStream.PushStreamInfo.Quality> list = qualityList.qualities;
        if (list == null) {
            qualityList.qualities = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<PreScheduleStream.PushStreamInfo.Quality> it2 = qualityList.qualities.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PreScheduleStream.PushStreamInfo.QualityList qualityList) {
        LJ(qualityList);
    }

    @Override // X.C0IMD
    public final PreScheduleStream.PushStreamInfo.QualityList LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PreScheduleStream.PushStreamInfo.QualityList qualityList, List list) {
    }
}
