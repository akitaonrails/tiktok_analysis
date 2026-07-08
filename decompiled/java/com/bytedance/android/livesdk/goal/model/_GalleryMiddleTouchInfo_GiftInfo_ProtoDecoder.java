package com.bytedance.android.livesdk.goal.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model.GalleryMiddleTouchInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GalleryMiddleTouchInfo_GiftInfo_ProtoDecoder implements C0IMD<GalleryMiddleTouchInfo.GiftInfo> {
    public static GalleryMiddleTouchInfo.GiftInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GalleryMiddleTouchInfo.GiftInfo giftInfo = new GalleryMiddleTouchInfo.GiftInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giftInfo.giftId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    giftInfo.giftIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GalleryMiddleTouchInfo.GiftInfo giftInfo) {
        ImageModel imageModel = giftInfo.giftIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final GalleryMiddleTouchInfo.GiftInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GalleryMiddleTouchInfo.GiftInfo giftInfo, List list) {
    }
}
