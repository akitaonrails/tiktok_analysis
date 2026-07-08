package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestUserTypeCheckSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class CohostWithGuestUserTypeCheckSetting_Configs_OptTypeAdapter extends TypeAdapter<CohostWithGuestUserTypeCheckSetting.Configs> {
    public final Gson LIZ;

    public CohostWithGuestUserTypeCheckSetting_Configs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CohostWithGuestUserTypeCheckSetting.Configs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CohostWithGuestUserTypeCheckSetting.Configs configs = new CohostWithGuestUserTypeCheckSetting.Configs(null, false, 3, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "additional_host_types")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    configs.additionalHostTypes = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "should_check_anchor_ab")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    configs.shouldCheckAnchorAB = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return configs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CohostWithGuestUserTypeCheckSetting.Configs configs) throws IOException {
        CohostWithGuestUserTypeCheckSetting.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("additional_host_types");
        C473040Igo.LIZLLL(this.LIZ, c09dl, configs2.additionalHostTypes, Integer.TYPE);
        c09dl.LJIILLIIL("should_check_anchor_ab");
        c09dl.LJJJJJL(configs2.shouldCheckAnchorAB);
        c09dl.LJII();
    }
}
