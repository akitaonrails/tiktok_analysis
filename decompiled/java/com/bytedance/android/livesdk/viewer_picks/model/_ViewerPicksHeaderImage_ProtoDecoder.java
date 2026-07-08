package com.bytedance.android.livesdk.viewer_picks.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ViewerPicksHeaderImage_ProtoDecoder implements C0IMD<ViewerPicksHeaderImage> {
    public static ViewerPicksHeaderImage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ViewerPicksHeaderImage viewerPicksHeaderImage = new ViewerPicksHeaderImage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        viewerPicksHeaderImage.schemaUrl = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    viewerPicksHeaderImage.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return viewerPicksHeaderImage;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ViewerPicksHeaderImage viewerPicksHeaderImage) {
        ImageModel imageModel = viewerPicksHeaderImage.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final ViewerPicksHeaderImage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ViewerPicksHeaderImage viewerPicksHeaderImage, List list) {
    }
}
