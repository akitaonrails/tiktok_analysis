package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class BgSettingConfig_OptTypeAdapter extends TypeAdapter<BgSettingConfig> {
    public final Gson LIZ;

    public BgSettingConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final BgSettingConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        BgSettingConfig bgSettingConfig = new BgSettingConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "audience")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    bgSettingConfig.audience = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "anchor")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    bgSettingConfig.anchor = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return bgSettingConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BgSettingConfig bgSettingConfig) throws IOException {
        BgSettingConfig bgSettingConfig2 = bgSettingConfig;
        if (bgSettingConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("audience");
        c09dl.LJJJJJL(bgSettingConfig2.audience);
        c09dl.LJIILLIIL("anchor");
        c09dl.LJJJJJL(bgSettingConfig2.anchor);
        c09dl.LJII();
    }
}
