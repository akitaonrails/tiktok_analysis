package com.bytedance.android.livesdk.replay.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class _SpriteImageItem_ProtoDecoder implements C0IMD<SpriteImageItem> {
    public static SpriteImageItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SpriteImageItem spriteImageItem = new SpriteImageItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        spriteImageItem.url = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        spriteImageItem.spriteNum = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        spriteImageItem.imageXNum = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        spriteImageItem.imageYNum = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        spriteImageItem.imageHeight = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        spriteImageItem.imageWidth = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        spriteImageItem.fps = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return spriteImageItem;
            }
        }
    }

    @Override // X.C0IMD
    public final SpriteImageItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SpriteImageItem spriteImageItem) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SpriteImageItem spriteImageItem, List list) {
    }
}
