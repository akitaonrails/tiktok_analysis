package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BannerCollapseInfo_ProtoDecoder implements C0IMD<BannerCollapseInfo> {
    public static BannerCollapseInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BannerCollapseInfo bannerCollapseInfo = new BannerCollapseInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        bannerCollapseInfo.title = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        bannerCollapseInfo.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        bannerCollapseInfo.enabled = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        bannerCollapseInfo.backgroundColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        bannerCollapseInfo.collapseHeight = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 6:
                        bannerCollapseInfo.verticalLineColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bannerCollapseInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BannerCollapseInfo bannerCollapseInfo) {
        BannerCollapseInfo bannerCollapseInfo2 = bannerCollapseInfo;
        Text text = bannerCollapseInfo2.title;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        ImageModel imageModel = bannerCollapseInfo2.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final BannerCollapseInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BannerCollapseInfo bannerCollapseInfo, List list) {
    }
}
