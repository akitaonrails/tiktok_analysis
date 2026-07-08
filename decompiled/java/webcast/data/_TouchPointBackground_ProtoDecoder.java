package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TouchPointBackground_ProtoDecoder implements C0IMD<TouchPointBackground> {
    public static TouchPointBackground LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TouchPointBackground touchPointBackground = new TouchPointBackground();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        touchPointBackground.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    touchPointBackground.color = _TouchPointColor_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return touchPointBackground;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TouchPointBackground touchPointBackground) {
        ImageModel imageModel = touchPointBackground.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final TouchPointBackground LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TouchPointBackground touchPointBackground, List list) {
    }
}
