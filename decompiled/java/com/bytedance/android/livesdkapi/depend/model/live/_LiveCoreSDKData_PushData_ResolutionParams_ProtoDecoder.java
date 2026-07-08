package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveCoreSDKData_PushData_ResolutionParams_ProtoDecoder implements C0IMD<LiveCoreSDKData.PushData.ResolutionParams> {
    public static LiveCoreSDKData.PushData.ResolutionParams LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveCoreSDKData.PushData.ResolutionParams resolutionParams = new LiveCoreSDKData.PushData.ResolutionParams();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        resolutionParams.width = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        resolutionParams.height = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        resolutionParams.defaultBitrate = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        resolutionParams.minBitrate = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        resolutionParams.maxBitrate = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        resolutionParams.fps = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return resolutionParams;
            }
        }
    }

    @Override // X.C0IMD
    public final LiveCoreSDKData.PushData.ResolutionParams LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LiveCoreSDKData.PushData.ResolutionParams resolutionParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveCoreSDKData.PushData.ResolutionParams resolutionParams, List list) {
    }
}
