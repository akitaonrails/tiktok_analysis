package webcast.api.room;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.room.MockResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _MockResponse_GuideVideoURL_ProtoDecoder implements C0IMD<MockResponse.GuideVideoURL> {
    public static MockResponse.GuideVideoURL LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MockResponse.GuideVideoURL guideVideoURL = new MockResponse.GuideVideoURL();
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
                                    guideVideoURL.multiguestUrl = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                guideVideoURL.giftUrl = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            guideVideoURL.cohostUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        guideVideoURL.interactUrl = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    guideVideoURL.matchUrl = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guideVideoURL;
            }
        }
    }

    @Override // X.C0IMD
    public final MockResponse.GuideVideoURL LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MockResponse.GuideVideoURL guideVideoURL) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MockResponse.GuideVideoURL guideVideoURL, List list) {
    }
}
