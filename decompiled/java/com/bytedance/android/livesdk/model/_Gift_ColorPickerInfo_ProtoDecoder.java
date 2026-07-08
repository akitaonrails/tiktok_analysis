package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.Gift;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Gift_ColorPickerInfo_ProtoDecoder implements C0IMD<Gift.ColorPickerInfo> {
    public static Gift.ColorPickerInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Gift.ColorPickerInfo colorPickerInfo = new Gift.ColorPickerInfo();
        colorPickerInfo.groups = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    colorPickerInfo.groups.add(_Gift_ColorGroup_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return colorPickerInfo;
            }
        }
    }

    public static void LJ(Gift.ColorPickerInfo colorPickerInfo) {
        List<Gift.ColorGroup> list = colorPickerInfo.groups;
        if (list == null) {
            colorPickerInfo.groups = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (Gift.ColorGroup colorGroup : colorPickerInfo.groups) {
            if (colorGroup != null) {
                _Gift_ColorGroup_ProtoDecoder.LJ(colorGroup);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Gift.ColorPickerInfo colorPickerInfo) {
        LJ(colorPickerInfo);
    }

    @Override // X.C0IMD
    public final Gift.ColorPickerInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Gift.ColorPickerInfo colorPickerInfo, List list) {
    }
}
