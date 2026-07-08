package webcast.api.room;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.room.LivePodcastResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _LivePodcastResponse_ProtoDecoder implements C0IMD<LivePodcastResponse> {
    @Override // X.C0IMD
    public final void LIZ(LivePodcastResponse livePodcastResponse) {
        EntranceConditionsPopup entranceConditionsPopup;
        LivePodcastResponse.ResponseData responseData = livePodcastResponse.data;
        if (responseData != null && (entranceConditionsPopup = responseData.conditionsPopup) != null) {
            _EntranceConditionsPopup_ProtoDecoder.LJ(entranceConditionsPopup);
        }
    }

    @Override // X.C0IMD
    public final LivePodcastResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LivePodcastResponse livePodcastResponse = new LivePodcastResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    livePodcastResponse.data = _LivePodcastResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return livePodcastResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LivePodcastResponse livePodcastResponse, List list) {
    }
}
