package com.bytedance.android.livesdk.model.message.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TextFormat_ProtoDecoder implements C0IMD<TextFormat> {
    public static TextFormat LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TextFormat textFormat = new TextFormat();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        textFormat.color = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        textFormat.bold = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                        break;
                    case 3:
                        textFormat.italic = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        textFormat.weight = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        textFormat.italicAngle = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 6:
                        textFormat.fontSize = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 7:
                        textFormat.useHeighLightColor = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                        break;
                    case 8:
                        textFormat.useRemoteColor = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return textFormat;
            }
        }
    }

    @Override // X.C0IMD
    public final TextFormat LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TextFormat textFormat) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TextFormat textFormat, List list) {
    }
}
