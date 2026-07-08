package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostInviteToSuccessDurWhitelistSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class CohostInviteToSuccessDurWhitelistSetting_Configs_OptTypeAdapter extends TypeAdapter<CohostInviteToSuccessDurWhitelistSetting.Configs> {
    public final Gson LIZ;

    public CohostInviteToSuccessDurWhitelistSetting_Configs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CohostInviteToSuccessDurWhitelistSetting.Configs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CohostInviteToSuccessDurWhitelistSetting.Configs configs = new CohostInviteToSuccessDurWhitelistSetting.Configs(0, null, 3, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "mode")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    configs.mode = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "white_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    configs.whiteList = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
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
    public final void write(C09DL c09dl, CohostInviteToSuccessDurWhitelistSetting.Configs configs) {
        CohostInviteToSuccessDurWhitelistSetting.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("mode");
        c09dl.LJJJJ(Integer.valueOf(configs2.mode));
        c09dl.LJIILLIIL("white_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, configs2.whiteList, Integer.TYPE);
        c09dl.LJII();
    }
}
