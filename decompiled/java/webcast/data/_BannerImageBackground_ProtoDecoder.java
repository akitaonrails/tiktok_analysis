package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BannerImageBackground_ProtoDecoder implements C0IMD<BannerImageBackground> {
    public static BannerImageBackground LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BannerImageBackground bannerImageBackground = new BannerImageBackground();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                bannerImageBackground.activeIconHeight = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            bannerImageBackground.activeIconWidth = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        bannerImageBackground.activeIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    bannerImageBackground.backgroundColor = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bannerImageBackground;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BannerImageBackground bannerImageBackground) {
        ImageModel imageModel = bannerImageBackground.activeIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final BannerImageBackground LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BannerImageBackground bannerImageBackground, List list) {
    }
}
