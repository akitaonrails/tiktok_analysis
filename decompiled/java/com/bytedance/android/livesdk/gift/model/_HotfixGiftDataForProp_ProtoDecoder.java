package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HotfixGiftDataForProp_ProtoDecoder implements C0IMD<HotfixGiftDataForProp> {
    public static HotfixGiftDataForProp LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        HotfixGiftDataForProp hotfixGiftDataForProp = new HotfixGiftDataForProp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        hotfixGiftDataForProp.displayText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        hotfixGiftDataForProp.describe = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        hotfixGiftDataForProp.giftId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 4:
                        hotfixGiftDataForProp.groupCount = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 5:
                        hotfixGiftDataForProp.repeatCount = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 6:
                        hotfixGiftDataForProp.comboCount = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 7:
                        hotfixGiftDataForProp.msgId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return hotfixGiftDataForProp;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(HotfixGiftDataForProp hotfixGiftDataForProp) {
        Text text = hotfixGiftDataForProp.displayText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final HotfixGiftDataForProp LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HotfixGiftDataForProp hotfixGiftDataForProp, List list) {
    }
}
