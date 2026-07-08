package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class Config_OptTypeAdapter extends TypeAdapter<Config> {
    public final Gson LIZ;

    public Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        Config config = new Config(false, false, 2000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1020927695) {
                    if (iHashCode != -580983637) {
                        if (iHashCode == -193115697 && strLJJJJ.equals("live_match_half_rtt_limit")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.live_match_half_rtt_limit = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("live_match_start_time_opt")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            config.live_match_start_time_opt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("live_match_start_time_anchor_opt")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.live_match_start_time_anchor_opt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
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
        c09dl.LJIILLIIL("live_match_start_time_opt");
        c09dl.LJJJJJL(config2.live_match_start_time_opt);
        c09dl.LJIILLIIL("live_match_start_time_anchor_opt");
        c09dl.LJJJJJL(config2.live_match_start_time_anchor_opt);
        c09dl.LJIILLIIL("live_match_half_rtt_limit");
        c09dl.LJJIZ(config2.live_match_half_rtt_limit);
        c09dl.LJII();
    }
}
