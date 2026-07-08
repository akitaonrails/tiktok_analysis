package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkMicGiftGalleryDisplayText_ProtoDecoder implements C0IMD<LinkMicGiftGalleryDisplayText> {
    public static LinkMicGiftGalleryDisplayText LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkMicGiftGalleryDisplayText linkMicGiftGalleryDisplayText = new LinkMicGiftGalleryDisplayText();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            linkMicGiftGalleryDisplayText.darkModeColor = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        linkMicGiftGalleryDisplayText.color = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    linkMicGiftGalleryDisplayText.content = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkMicGiftGalleryDisplayText;
            }
        }
    }

    @Override // X.C0IMD
    public final LinkMicGiftGalleryDisplayText LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkMicGiftGalleryDisplayText linkMicGiftGalleryDisplayText) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkMicGiftGalleryDisplayText linkMicGiftGalleryDisplayText, List list) {
    }
}
