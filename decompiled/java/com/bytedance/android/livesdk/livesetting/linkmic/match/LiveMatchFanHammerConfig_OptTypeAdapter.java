package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveMatchFanHammerConfig_OptTypeAdapter extends TypeAdapter<LiveMatchFanHammerConfig> {
    public final Gson LIZ;

    public LiveMatchFanHammerConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveMatchFanHammerConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMatchFanHammerConfig liveMatchFanHammerConfig = new LiveMatchFanHammerConfig(false, "aweme://roma_redirect/?spark_page=live_match_fans_hammer_effect", "aweme://roma_redirect/?spark_page=live_match_items_upgrade", 3L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchFanHammerConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1275788921:
                        if (strLJJJJ.equals("upgrade_guide_schema")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchFanHammerConfig.upgradeGuideSchema = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -539298919:
                        if (strLJJJJ.equals("container_ready_timeout_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchFanHammerConfig.containerReadyTimeoutInSecond = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 427282121:
                        if (strLJJJJ.equals("lynx_schema")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchFanHammerConfig.lynxSchema = c09cu.LJJJZ();
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
        return liveMatchFanHammerConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchFanHammerConfig liveMatchFanHammerConfig) throws IOException {
        LiveMatchFanHammerConfig liveMatchFanHammerConfig2 = liveMatchFanHammerConfig;
        if (liveMatchFanHammerConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveMatchFanHammerConfig2.enable);
        c09dl.LJIILLIIL("lynx_schema");
        c09dl.LJJJJJ(liveMatchFanHammerConfig2.lynxSchema);
        c09dl.LJIILLIIL("upgrade_guide_schema");
        c09dl.LJJJJJ(liveMatchFanHammerConfig2.upgradeGuideSchema);
        c09dl.LJIILLIIL("container_ready_timeout_sec");
        c09dl.LJJIZ(liveMatchFanHammerConfig2.containerReadyTimeoutInSecond);
        c09dl.LJII();
    }
}
