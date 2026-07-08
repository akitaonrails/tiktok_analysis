package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TPClickableText_ProtoDecoder implements C0IMD<TPClickableText> {
    public static TPClickableText LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TPClickableText tPClickableText = new TPClickableText();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        tPClickableText.text = _TPText_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        tPClickableText.actionType = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        tPClickableText.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        tPClickableText.background = _TouchPointBackground_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        tPClickableText.alignment = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        tPClickableText.jsb = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return tPClickableText;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TPClickableText tPClickableText) {
        ImageModel imageModel;
        TPClickableText tPClickableText2 = tPClickableText;
        TPText tPText = tPClickableText2.text;
        if (tPText != null) {
            _TPText_ProtoDecoder.LJ(tPText);
        }
        TouchPointBackground touchPointBackground = tPClickableText2.background;
        if (touchPointBackground != null && (imageModel = touchPointBackground.image) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final TPClickableText LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TPClickableText tPClickableText, List list) {
    }
}
