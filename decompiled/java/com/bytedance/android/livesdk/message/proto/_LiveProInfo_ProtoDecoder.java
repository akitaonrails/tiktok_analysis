package com.bytedance.android.livesdk.message.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveProInfo_ProtoDecoder implements C0IMD<LiveProInfo> {
    public static LiveProInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveProInfo liveProInfo = new LiveProInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        liveProInfo.isLivePro = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        liveProInfo.showBanner = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        liveProInfo.banner = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        liveProInfo.bannerStarlingKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        liveProInfo.label = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        liveProInfo.liveProType = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        liveProInfo.gamerLabel = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        liveProInfo.gamerBannerStarlingKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveProInfo;
            }
        }
    }

    public static void LJ(LiveProInfo liveProInfo) {
        ImageModel imageModel = liveProInfo.banner;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = liveProInfo.label;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        ImageModel imageModel3 = liveProInfo.gamerLabel;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveProInfo liveProInfo) {
        LJ(liveProInfo);
    }

    @Override // X.C0IMD
    public final LiveProInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveProInfo liveProInfo, List list) {
    }
}
