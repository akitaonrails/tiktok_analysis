package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.gift.model._GiftColorInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.Gift;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Gift_ColorGroup_ProtoDecoder implements C0IMD<Gift.ColorGroup> {
    public static Gift.ColorGroup LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Gift.ColorGroup colorGroup = new Gift.ColorGroup();
        colorGroup.colorInfos = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        colorGroup.colorInfos.add(_GiftColorInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    colorGroup.groupName = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return colorGroup;
            }
        }
    }

    public static void LJ(Gift.ColorGroup colorGroup) {
        List<GiftColorInfo> list = colorGroup.colorInfos;
        if (list == null) {
            colorGroup.colorInfos = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GiftColorInfo giftColorInfo : colorGroup.colorInfos) {
            if (giftColorInfo != null) {
                _GiftColorInfo_ProtoDecoder.LJ(giftColorInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Gift.ColorGroup colorGroup) {
        LJ(colorGroup);
    }

    @Override // X.C0IMD
    public final Gift.ColorGroup LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Gift.ColorGroup colorGroup, List list) {
    }
}
