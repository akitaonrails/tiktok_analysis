package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class MultiGuestFollowBackGuideConfig_OptTypeAdapter extends TypeAdapter<MultiGuestFollowBackGuideConfig> {
    public final Gson LIZ;

    public MultiGuestFollowBackGuideConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiGuestFollowBackGuideConfig read(C09CU c09cu) {
        MultiGuestFollowBackGuideConfig multiGuestFollowBackGuideConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            multiGuestFollowBackGuideConfig = new MultiGuestFollowBackGuideConfig(false, 0);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable_manage_panel_follow_opt")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiGuestFollowBackGuideConfig.enableManagePanelFollowOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "host_panel_follow_button_style")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiGuestFollowBackGuideConfig.followButtonStyle = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return multiGuestFollowBackGuideConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestFollowBackGuideConfig multiGuestFollowBackGuideConfig) throws IOException {
        MultiGuestFollowBackGuideConfig multiGuestFollowBackGuideConfig2 = multiGuestFollowBackGuideConfig;
        if (multiGuestFollowBackGuideConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_manage_panel_follow_opt");
        c09dl.LJJJJJL(multiGuestFollowBackGuideConfig2.enableManagePanelFollowOpt);
        c09dl.LJIILLIIL("host_panel_follow_button_style");
        c09dl.LJJJJ(Integer.valueOf(multiGuestFollowBackGuideConfig2.followButtonStyle));
        c09dl.LJII();
    }
}
