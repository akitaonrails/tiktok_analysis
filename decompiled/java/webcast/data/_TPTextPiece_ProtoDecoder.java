package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TPTextPiece_ProtoDecoder implements C0IMD<TPTextPiece> {
    public static TPTextPiece LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TPTextPiece tPTextPiece = new TPTextPiece();
        tPTextPiece.clickSpan = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        tPTextPiece.type = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        tPTextPiece.format = _TPFormat_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        tPTextPiece.stringValue = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        tPTextPiece.key = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 6:
                        tPTextPiece.clickSpan.add(_TPClickableText_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        tPTextPiece.imageValue = _TPTextPieceImage_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        tPTextPiece.countdownConfig = _TPCountDownConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return tPTextPiece;
            }
        }
    }

    public static void LJ(TPTextPiece tPTextPiece) {
        ImageModel imageModel;
        ImageModel imageModel2;
        List<TPClickableText> list = tPTextPiece.clickSpan;
        if (list == null) {
            tPTextPiece.clickSpan = new ArrayList();
        } else if (!list.isEmpty()) {
            for (TPClickableText tPClickableText : tPTextPiece.clickSpan) {
                if (tPClickableText != null) {
                    TPText tPText = tPClickableText.text;
                    if (tPText != null) {
                        _TPText_ProtoDecoder.LJ(tPText);
                    }
                    TouchPointBackground touchPointBackground = tPClickableText.background;
                    if (touchPointBackground != null && (imageModel = touchPointBackground.image) != null) {
                        _ImageModel_ProtoDecoder.LJ(imageModel);
                    }
                }
            }
        }
        TPTextPieceImage tPTextPieceImage = tPTextPiece.imageValue;
        if (tPTextPieceImage != null && (imageModel2 = tPTextPieceImage.image) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TPTextPiece tPTextPiece) {
        LJ(tPTextPiece);
    }

    @Override // X.C0IMD
    public final TPTextPiece LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TPTextPiece tPTextPiece, List list) {
    }
}
