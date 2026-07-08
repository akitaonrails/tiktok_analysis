package com.bytedance.android.livesdk.replay.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _TextStickerConfig_ProtoDecoder implements C0IMD<TextStickerConfig> {
    public static TextStickerConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TextStickerConfig textStickerConfig = new TextStickerConfig();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        textStickerConfig.text = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        textStickerConfig.textStyle = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        textStickerConfig.colorHex = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        textStickerConfig.centerX = Double.longBitsToDouble(c1516680pZS.LJIIIZ());
                        break;
                    case 5:
                        textStickerConfig.centerY = Double.longBitsToDouble(c1516680pZS.LJIIIZ());
                        break;
                    case 6:
                        textStickerConfig.borderColorHex = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        textStickerConfig.canvasColorHex = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return textStickerConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final TextStickerConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TextStickerConfig textStickerConfig) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TextStickerConfig textStickerConfig, List list) {
    }
}
