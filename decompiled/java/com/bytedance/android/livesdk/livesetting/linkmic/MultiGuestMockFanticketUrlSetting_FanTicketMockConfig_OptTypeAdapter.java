package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestMockFanticketUrlSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestMockFanticketUrlSetting_FanTicketMockConfig_OptTypeAdapter extends TypeAdapter<MultiGuestMockFanticketUrlSetting.FanTicketMockConfig> {
    public final Gson LIZ;

    public MultiGuestMockFanticketUrlSetting_FanTicketMockConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiGuestMockFanticketUrlSetting.FanTicketMockConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestMockFanticketUrlSetting.FanTicketMockConfig fanTicketMockConfig = new MultiGuestMockFanticketUrlSetting.FanTicketMockConfig(false, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "isEnable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    fanTicketMockConfig.isEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "iconUrl")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    fanTicketMockConfig.iconUrl = c09cu.LJJJZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return fanTicketMockConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestMockFanticketUrlSetting.FanTicketMockConfig fanTicketMockConfig) throws IOException {
        MultiGuestMockFanticketUrlSetting.FanTicketMockConfig fanTicketMockConfig2 = fanTicketMockConfig;
        if (fanTicketMockConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("isEnable");
        c09dl.LJJJJJL(fanTicketMockConfig2.isEnable);
        c09dl.LJIILLIIL("iconUrl");
        c09dl.LJJJJJ(fanTicketMockConfig2.iconUrl);
        c09dl.LJII();
    }
}
