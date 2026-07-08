package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveStreamSubGoalGift_ProtoDecoder implements C0IMD<LiveStreamSubGoalGift> {
    public static LiveStreamSubGoalGift LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveStreamSubGoalGift liveStreamSubGoalGift = new LiveStreamSubGoalGift();
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
                                liveStreamSubGoalGift.type = c1516680pZS.LJIIJ();
                            }
                        } else {
                            liveStreamSubGoalGift.diamondCount = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        liveStreamSubGoalGift.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    liveStreamSubGoalGift.name = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveStreamSubGoalGift;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveStreamSubGoalGift liveStreamSubGoalGift) {
        ImageModel imageModel = liveStreamSubGoalGift.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final LiveStreamSubGoalGift LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveStreamSubGoalGift liveStreamSubGoalGift, List list) {
    }
}
