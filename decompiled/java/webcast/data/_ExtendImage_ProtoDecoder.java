package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ExtendImage_ProtoDecoder implements C0IMD<ExtendImage> {
    public static ExtendImage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ExtendImage extendImage = new ExtendImage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        extendImage.expandedImage = _ImageInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    extendImage.foldedImage = _ImageInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return extendImage;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ExtendImage extendImage) {
        ImageModel imageModel;
        ImageModel imageModel2;
        ExtendImage extendImage2 = extendImage;
        ImageInfo imageInfo = extendImage2.foldedImage;
        if (imageInfo != null && (imageModel2 = imageInfo.image) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        ImageInfo imageInfo2 = extendImage2.expandedImage;
        if (imageInfo2 != null && (imageModel = imageInfo2.image) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final ExtendImage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ExtendImage extendImage, List list) {
    }
}
