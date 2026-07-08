package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveCoreSDKData_Quality_ProtoDecoder implements C0IMD<LiveCoreSDKData.Quality> {
    public static LiveCoreSDKData.Quality LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveCoreSDKData.Quality quality = new LiveCoreSDKData.Quality();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 5) {
                            if (iLJI != 6) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                quality.iconType = c1516680pZS.LJIIJ();
                            }
                        } else {
                            quality.level = c1516680pZS.LJIIJ();
                        }
                    } else {
                        quality.sdkKey = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    quality.name = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return quality;
            }
        }
    }

    @Override // X.C0IMD
    public final LiveCoreSDKData.Quality LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LiveCoreSDKData.Quality quality) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveCoreSDKData.Quality quality, List list) {
    }
}
