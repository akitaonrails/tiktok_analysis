package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftRandomEffectInfo_ProtoDecoder implements C0IMD<GiftRandomEffectInfo> {
    public static GiftRandomEffectInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftRandomEffectInfo giftRandomEffectInfo = new GiftRandomEffectInfo();
        giftRandomEffectInfo.effectIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    giftRandomEffectInfo.randomGiftBubble = _RandomGiftBubble_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                giftRandomEffectInfo.audienceKey = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            giftRandomEffectInfo.hostKey = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        giftRandomEffectInfo.effectIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    giftRandomEffectInfo.randomGiftPanelBanner = _RandomGiftPanelBanner_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftRandomEffectInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftRandomEffectInfo giftRandomEffectInfo) {
        ImageModel imageModel;
        GiftRandomEffectInfo giftRandomEffectInfo2 = giftRandomEffectInfo;
        RandomGiftPanelBanner randomGiftPanelBanner = giftRandomEffectInfo2.randomGiftPanelBanner;
        if (randomGiftPanelBanner != null) {
            ImageModel imageModel2 = randomGiftPanelBanner.shadingImage;
            if (imageModel2 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
            ImageModel imageModel3 = randomGiftPanelBanner.leftIcon;
            if (imageModel3 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel3);
            }
            if (randomGiftPanelBanner.bgColors == null) {
                randomGiftPanelBanner.bgColors = new ArrayList();
            }
        }
        if (giftRandomEffectInfo2.effectIds == null) {
            giftRandomEffectInfo2.effectIds = new ArrayList();
        }
        RandomGiftBubble randomGiftBubble = giftRandomEffectInfo2.randomGiftBubble;
        if (randomGiftBubble != null && (imageModel = randomGiftBubble.image) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final GiftRandomEffectInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftRandomEffectInfo giftRandomEffectInfo, List list) {
    }
}
