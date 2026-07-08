package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftGalleryBadgeSection_ProtoDecoder implements C0IMD<GiftGalleryBadgeSection> {
    public static GiftGalleryBadgeSection LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftGalleryBadgeSection giftGalleryBadgeSection = new GiftGalleryBadgeSection();
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
                                giftGalleryBadgeSection.darkModeIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            giftGalleryBadgeSection.shouldShow = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        giftGalleryBadgeSection.displayText = _LinkMicGiftGalleryDisplayText_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftGalleryBadgeSection.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftGalleryBadgeSection;
            }
        }
    }

    public static void LJ(GiftGalleryBadgeSection giftGalleryBadgeSection) {
        ImageModel imageModel = giftGalleryBadgeSection.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = giftGalleryBadgeSection.darkModeIcon;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftGalleryBadgeSection giftGalleryBadgeSection) {
        LJ(giftGalleryBadgeSection);
    }

    @Override // X.C0IMD
    public final GiftGalleryBadgeSection LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftGalleryBadgeSection giftGalleryBadgeSection, List list) {
    }
}
