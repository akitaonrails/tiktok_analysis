package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveCoreSDKData_ProtoDecoder implements C0IMD<LiveCoreSDKData> {
    public static LiveCoreSDKData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveCoreSDKData liveCoreSDKData = new LiveCoreSDKData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        liveCoreSDKData.pushData = _LiveCoreSDKData_PushData_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    liveCoreSDKData.pullData = _LiveCoreSDKData_PullData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveCoreSDKData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveCoreSDKData liveCoreSDKData) {
        LiveCoreSDKData.Options options;
        LiveCoreSDKData liveCoreSDKData2 = liveCoreSDKData;
        LiveCoreSDKData.PullData pullData = liveCoreSDKData2.pullData;
        if (pullData != null && (options = pullData.options) != null) {
            _LiveCoreSDKData_Options_ProtoDecoder.LJ(options);
        }
        LiveCoreSDKData.PushData pushData = liveCoreSDKData2.pushData;
        if (pushData != null) {
            _LiveCoreSDKData_PushData_ProtoDecoder.LJ(pushData);
        }
    }

    @Override // X.C0IMD
    public final LiveCoreSDKData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveCoreSDKData liveCoreSDKData, List list) {
    }
}
