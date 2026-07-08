package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TPTextPieceImage_ProtoDecoder implements C0IMD<TPTextPieceImage> {
    public static TPTextPieceImage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TPTextPieceImage tPTextPieceImage = new TPTextPieceImage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        tPTextPieceImage.tuxIcon = _TPTuxIcon_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    tPTextPieceImage.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return tPTextPieceImage;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TPTextPieceImage tPTextPieceImage) {
        ImageModel imageModel = tPTextPieceImage.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final TPTextPieceImage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TPTextPieceImage tPTextPieceImage, List list) {
    }
}
