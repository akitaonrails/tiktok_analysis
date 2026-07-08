package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class SettingConfig_OptTypeAdapter extends TypeAdapter<SettingConfig> {
    public final Gson LIZ;

    public SettingConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final SettingConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SettingConfig settingConfig = new SettingConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -328873958:
                        if (strLJJJJ.equals("public_screen_status_sample")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingConfig.countSimple = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -257793935:
                        if (strLJJJJ.equals("public_screen_status_upload")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingConfig.uploadCountAndStatus = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1840625155:
                        if (strLJJJJ.equals("public_screen_perf_sample")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingConfig.perfSimple = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1911705178:
                        if (strLJJJJ.equals("public_screen_perf_upload")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingConfig.uploadPerf = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return settingConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SettingConfig settingConfig) throws IOException {
        SettingConfig settingConfig2 = settingConfig;
        if (settingConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("public_screen_status_upload");
        c09dl.LJJJJJL(settingConfig2.uploadCountAndStatus);
        c09dl.LJIILLIIL("public_screen_status_sample");
        c09dl.LJJJJ(Integer.valueOf(settingConfig2.countSimple));
        c09dl.LJIILLIIL("public_screen_perf_upload");
        c09dl.LJJJJJL(settingConfig2.uploadPerf);
        c09dl.LJIILLIIL("public_screen_perf_sample");
        c09dl.LJJJJ(Integer.valueOf(settingConfig2.perfSimple));
        c09dl.LJII();
    }
}
