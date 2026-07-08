package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostActivityBadgeEnableSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class CohostActivityBadgeEnableSetting_Configs_OptTypeAdapter extends TypeAdapter<CohostActivityBadgeEnableSetting.Configs> {
    public final Gson LIZ;

    public CohostActivityBadgeEnableSetting_Configs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CohostActivityBadgeEnableSetting.Configs read(C09CU c09cu) {
        CohostActivityBadgeEnableSetting.Configs configs = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            configs = new CohostActivityBadgeEnableSetting.Configs(true, false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enabled")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        configs.enabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "support_dark_mode")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        configs.supportDarkMode = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return configs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CohostActivityBadgeEnableSetting.Configs configs) throws IOException {
        CohostActivityBadgeEnableSetting.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(configs2.enabled);
        c09dl.LJIILLIIL("support_dark_mode");
        c09dl.LJJJJJL(configs2.supportDarkMode);
        c09dl.LJII();
    }
}
