package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftsInfo_BeaconBubbleInfo_ProtoDecoder implements C0IMD<GiftsInfo.BeaconBubbleInfo> {
    public static GiftsInfo.BeaconBubbleInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftsInfo.BeaconBubbleInfo beaconBubbleInfo = new GiftsInfo.BeaconBubbleInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            beaconBubbleInfo.liveGoalSchemaUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        beaconBubbleInfo.anchorGalleryIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    beaconBubbleInfo.liveGoalIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return beaconBubbleInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftsInfo.BeaconBubbleInfo beaconBubbleInfo) {
        GiftsInfo.BeaconBubbleInfo beaconBubbleInfo2 = beaconBubbleInfo;
        ImageModel imageModel = beaconBubbleInfo2.liveGoalIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = beaconBubbleInfo2.anchorGalleryIcon;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final GiftsInfo.BeaconBubbleInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftsInfo.BeaconBubbleInfo beaconBubbleInfo, List list) {
    }
}
