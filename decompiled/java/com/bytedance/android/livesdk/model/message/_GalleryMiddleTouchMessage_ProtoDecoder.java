package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.goal.model.GalleryMiddleTouchInfo;
import com.bytedance.android.livesdk.goal.model._GalleryMiddleTouchInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GalleryMiddleTouchMessage_ProtoDecoder implements C0IMD<GalleryMiddleTouchMessage> {
    public static GalleryMiddleTouchMessage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GalleryMiddleTouchMessage galleryMiddleTouchMessage = new GalleryMiddleTouchMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    galleryMiddleTouchMessage.galleryMiddleTouchInfo = _GalleryMiddleTouchInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return galleryMiddleTouchMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GalleryMiddleTouchMessage galleryMiddleTouchMessage) {
        GalleryMiddleTouchInfo galleryMiddleTouchInfo = galleryMiddleTouchMessage.galleryMiddleTouchInfo;
        if (galleryMiddleTouchInfo != null) {
            _GalleryMiddleTouchInfo_ProtoDecoder.LJ(galleryMiddleTouchInfo);
        }
    }

    @Override // X.C0IMD
    public final GalleryMiddleTouchMessage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GalleryMiddleTouchMessage galleryMiddleTouchMessage, List list) {
    }
}
