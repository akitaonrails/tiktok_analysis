package com.bytedance.android.livesdk.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.setting.PadAutoRotateScreenGuideSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class PadAutoRotateScreenGuideSetting_PadAutoRotateScreenGuideSettingConfig_OptTypeAdapter extends TypeAdapter<PadAutoRotateScreenGuideSetting.PadAutoRotateScreenGuideSettingConfig> {
    public final Gson LIZ;

    public PadAutoRotateScreenGuideSetting_PadAutoRotateScreenGuideSettingConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final PadAutoRotateScreenGuideSetting.PadAutoRotateScreenGuideSettingConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PadAutoRotateScreenGuideSetting.PadAutoRotateScreenGuideSettingConfig padAutoRotateScreenGuideSettingConfig = new PadAutoRotateScreenGuideSetting.PadAutoRotateScreenGuideSettingConfig(false, 1000L, 3);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1298848381) {
                    if (iHashCode != 95467907) {
                        if (iHashCode == 97320050 && strLJJJJ.equals("enter_room_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                padAutoRotateScreenGuideSettingConfig.setEnterRoomCount(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("delay")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            padAutoRotateScreenGuideSettingConfig.setDelay(c09cu.LJJJ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        padAutoRotateScreenGuideSettingConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return padAutoRotateScreenGuideSettingConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PadAutoRotateScreenGuideSetting.PadAutoRotateScreenGuideSettingConfig padAutoRotateScreenGuideSettingConfig) throws IOException {
        PadAutoRotateScreenGuideSetting.PadAutoRotateScreenGuideSettingConfig padAutoRotateScreenGuideSettingConfig2 = padAutoRotateScreenGuideSettingConfig;
        if (padAutoRotateScreenGuideSettingConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(padAutoRotateScreenGuideSettingConfig2.getEnable());
        c09dl.LJIILLIIL("delay");
        c09dl.LJJIZ(padAutoRotateScreenGuideSettingConfig2.getDelay());
        c09dl.LJIILLIIL("enter_room_count");
        c09dl.LJJJJ(Integer.valueOf(padAutoRotateScreenGuideSettingConfig2.getEnterRoomCount()));
        c09dl.LJII();
    }
}
