package com.bytedance.android.livesdk.livesetting.skylight;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class Config_OptTypeAdapter extends TypeAdapter<Config> {
    public final Gson LIZ;

    public Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        Config config = new Config(false, false, true, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2139866362:
                        if (strLJJJJ.equals("enable_style_v2")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.enableStyleV2 = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1465006297:
                        if (strLJJJJ.equals("enable_go_live")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.enableGoLive = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -434154672:
                        if (strLJJJJ.equals("show_follow_btn")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.showFollowBtn = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1126395542:
                        if (strLJJJJ.equals("show_title")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.showTitle = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Config config) throws IOException {
        Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_style_v2");
        c09dl.LJJJJJL(config2.enableStyleV2);
        c09dl.LJIILLIIL("enable_go_live");
        c09dl.LJJJJJL(config2.enableGoLive);
        c09dl.LJIILLIIL("show_title");
        c09dl.LJJJJJL(config2.showTitle);
        c09dl.LJIILLIIL("show_follow_btn");
        c09dl.LJJJJJL(config2.showFollowBtn);
        c09dl.LJII();
    }
}
