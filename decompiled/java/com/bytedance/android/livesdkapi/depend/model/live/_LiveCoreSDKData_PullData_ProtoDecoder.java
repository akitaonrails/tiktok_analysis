package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveCoreSDKData_PullData_ProtoDecoder implements C0IMD<LiveCoreSDKData.PullData> {
    public static LiveCoreSDKData.PullData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveCoreSDKData.PullData pullData = new LiveCoreSDKData.PullData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        pullData.options = _LiveCoreSDKData_Options_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    pullData.streamData = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return pullData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveCoreSDKData.PullData pullData) {
        LiveCoreSDKData.Options options = pullData.options;
        if (options != null) {
            _LiveCoreSDKData_Options_ProtoDecoder.LJ(options);
        }
    }

    @Override // X.C0IMD
    public final LiveCoreSDKData.PullData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveCoreSDKData.PullData pullData, List list) {
    }
}
