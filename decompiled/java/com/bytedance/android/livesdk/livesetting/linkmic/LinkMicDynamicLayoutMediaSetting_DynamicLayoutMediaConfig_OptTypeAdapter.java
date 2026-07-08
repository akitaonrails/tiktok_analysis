package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicDynamicLayoutMediaSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LinkMicDynamicLayoutMediaSetting_DynamicLayoutMediaConfig_OptTypeAdapter extends TypeAdapter<LinkMicDynamicLayoutMediaSetting.DynamicLayoutMediaConfig> {
    public final Gson LIZ;

    public LinkMicDynamicLayoutMediaSetting_DynamicLayoutMediaConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LinkMicDynamicLayoutMediaSetting.DynamicLayoutMediaConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkMicDynamicLayoutMediaSetting.DynamicLayoutMediaConfig dynamicLayoutMediaConfig = new LinkMicDynamicLayoutMediaSetting.DynamicLayoutMediaConfig(false, null, null, 7, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1638203170) {
                    if (iHashCode != -1298848381) {
                        if (iHashCode == 258330356 && strLJJJJ.equals("white_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                dynamicLayoutMediaConfig.whiteList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            dynamicLayoutMediaConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("black_list")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        dynamicLayoutMediaConfig.blackList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return dynamicLayoutMediaConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicDynamicLayoutMediaSetting.DynamicLayoutMediaConfig dynamicLayoutMediaConfig) throws IOException {
        LinkMicDynamicLayoutMediaSetting.DynamicLayoutMediaConfig dynamicLayoutMediaConfig2 = dynamicLayoutMediaConfig;
        if (dynamicLayoutMediaConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(dynamicLayoutMediaConfig2.enable);
        c09dl.LJIILLIIL("white_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, dynamicLayoutMediaConfig2.whiteList, String.class);
        c09dl.LJIILLIIL("black_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, dynamicLayoutMediaConfig2.blackList, String.class);
        c09dl.LJII();
    }
}
