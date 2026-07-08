package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.data.RealtimeLiveCenterLopInfo;

/* JADX INFO: loaded from: classes.dex */
public final class _RealtimeLiveCenterLopInfo_FeatureGuidance_ProtoDecoder implements C0IMD<RealtimeLiveCenterLopInfo.FeatureGuidance> {
    public static RealtimeLiveCenterLopInfo.FeatureGuidance LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RealtimeLiveCenterLopInfo.FeatureGuidance featureGuidance = new RealtimeLiveCenterLopInfo.FeatureGuidance();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        featureGuidance.key = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        featureGuidance.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        featureGuidance.subtitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        featureGuidance.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        featureGuidance.jumpText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        featureGuidance.jumpSchemaUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return featureGuidance;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RealtimeLiveCenterLopInfo.FeatureGuidance featureGuidance) {
        ImageModel imageModel = featureGuidance.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final RealtimeLiveCenterLopInfo.FeatureGuidance LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RealtimeLiveCenterLopInfo.FeatureGuidance featureGuidance, List list) {
    }
}
