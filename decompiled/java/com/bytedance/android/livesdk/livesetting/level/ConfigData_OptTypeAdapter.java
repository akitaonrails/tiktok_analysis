package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ConfigData_OptTypeAdapter extends TypeAdapter<ConfigData> {
    public final Gson LIZ;

    public ConfigData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final ConfigData read(C09CU c09cu) {
        ConfigData configData = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            configData = new ConfigData(new ArrayList(), 0);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "live_entrance_guidance")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        configData.configs = C473040Igo.LIZ(this.LIZ, c09cu, GuidanceConfig.class);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "live_fans_entrance_refactor")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        configData.entranceRefactor = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return configData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ConfigData configData) {
        ConfigData configData2 = configData;
        if (configData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_entrance_guidance");
        C473040Igo.LIZLLL(this.LIZ, c09dl, configData2.configs, GuidanceConfig.class);
        c09dl.LJIILLIIL("live_fans_entrance_refactor");
        c09dl.LJJJJ(Integer.valueOf(configData2.entranceRefactor));
        c09dl.LJII();
    }
}
