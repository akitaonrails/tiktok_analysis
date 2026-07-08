package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveCoreSDKData_Options_ProtoDecoder implements C0IMD<LiveCoreSDKData.Options> {
    public static LiveCoreSDKData.Options LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveCoreSDKData.Options options = new LiveCoreSDKData.Options();
        options.qualityList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        options.defaultQuality = _LiveCoreSDKData_Quality_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        options.qualityList.add(_LiveCoreSDKData_Quality_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        options.defaultPreviewQuality = _LiveCoreSDKData_Quality_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        options.showQualityButton = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        options.supportLowLatency = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        options.maxDrmLenientSize = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        options.maxDrmLenientSizeBackup = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        options.forcedLowLatency = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return options;
            }
        }
    }

    public static void LJ(LiveCoreSDKData.Options options) {
        List<LiveCoreSDKData.Quality> list = options.qualityList;
        if (list == null) {
            options.qualityList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<LiveCoreSDKData.Quality> it2 = options.qualityList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveCoreSDKData.Options options) {
        LJ(options);
    }

    @Override // X.C0IMD
    public final LiveCoreSDKData.Options LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveCoreSDKData.Options options, List list) {
    }
}
