package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.replay.proto._VideoMetaInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveFragmentDetail_ProtoDecoder implements C0IMD<LiveFragmentDetail> {
    public static LiveFragmentDetail LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveFragmentDetail liveFragmentDetail = new LiveFragmentDetail();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 34) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    liveFragmentDetail.mp4VideoMetaInfo = _VideoMetaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveFragmentDetail;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveFragmentDetail liveFragmentDetail) {
    }

    @Override // X.C0IMD
    public final LiveFragmentDetail LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveFragmentDetail liveFragmentDetail, List list) {
    }
}
