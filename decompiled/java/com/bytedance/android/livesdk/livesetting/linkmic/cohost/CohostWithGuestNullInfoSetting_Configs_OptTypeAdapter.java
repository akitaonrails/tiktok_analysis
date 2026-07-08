package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestNullInfoSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class CohostWithGuestNullInfoSetting_Configs_OptTypeAdapter extends TypeAdapter<CohostWithGuestNullInfoSetting.Configs> {
    public final Gson LIZ;

    public CohostWithGuestNullInfoSetting_Configs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CohostWithGuestNullInfoSetting.Configs read(C09CU c09cu) {
        CohostWithGuestNullInfoSetting.Configs configs = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            configs = new CohostWithGuestNullInfoSetting.Configs(true);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "disable_click_when_no_nickname")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        configs.disableClickWhenNoNickname = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
    public final void write(C09DL c09dl, CohostWithGuestNullInfoSetting.Configs configs) throws IOException {
        CohostWithGuestNullInfoSetting.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("disable_click_when_no_nickname");
        c09dl.LJJJJJL(configs2.disableClickWhenNoNickname);
        c09dl.LJII();
    }
}
