package com.bytedance.android.livesdk.model;

import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _Gift_ColorPickerInfo_ProtoEncoder implements InterfaceC1132110fZB<Gift.ColorPickerInfo> {
    public static int LIZJ(Gift.ColorPickerInfo colorPickerInfo) {
        int iLIZIZ;
        List<Gift.ColorGroup> list = colorPickerInfo.groups;
        int i = 0;
        if (list != null && !list.isEmpty()) {
            i = 0;
            for (int i2 = 0; i2 < colorPickerInfo.groups.size(); i2++) {
                Gift.ColorGroup colorGroup = (Gift.ColorGroup) ListProtector.get(colorPickerInfo.groups, i2);
                if (colorGroup == null) {
                    iLIZIZ = 0;
                } else {
                    int iLIZJ = _Gift_ColorGroup_ProtoEncoder.LIZJ(colorGroup);
                    iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(1);
                }
                i += iLIZIZ;
            }
        }
        return i;
    }

    public static void LIZIZ(C1142350fph c1142350fph, Gift.ColorPickerInfo colorPickerInfo) {
        List<Gift.ColorGroup> list = colorPickerInfo.groups;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < colorPickerInfo.groups.size(); i++) {
                Gift.ColorGroup colorGroup = (Gift.ColorGroup) ListProtector.get(colorPickerInfo.groups, i);
                if (colorGroup != null) {
                    c1142350fph.LIZLLL(1, 2);
                    c1142350fph.LJ(_Gift_ColorGroup_ProtoEncoder.LIZJ(colorGroup));
                    _Gift_ColorGroup_ProtoEncoder.LIZIZ(c1142350fph, colorGroup);
                }
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, Gift.ColorPickerInfo colorPickerInfo) {
        LIZIZ(c1142350fph, colorPickerInfo);
    }
}
