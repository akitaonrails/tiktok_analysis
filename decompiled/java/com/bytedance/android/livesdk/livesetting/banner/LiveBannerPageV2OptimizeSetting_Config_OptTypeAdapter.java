package com.bytedance.android.livesdk.livesetting.banner;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.banner.LiveBannerPageV2OptimizeSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveBannerPageV2OptimizeSetting_Config_OptTypeAdapter extends TypeAdapter<LiveBannerPageV2OptimizeSetting.Config> {
    public final Gson LIZ;

    public LiveBannerPageV2OptimizeSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveBannerPageV2OptimizeSetting.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveBannerPageV2OptimizeSetting.Config config = new LiveBannerPageV2OptimizeSetting.Config(false, -1, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1298848381) {
                    if (iHashCode != 29051550) {
                        if (iHashCode == 1305598322 && strLJJJJ.equals("enable_extra_height")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.enableExtraHeight = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("cache_size")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            config.cacheSize = Integer.valueOf(c09cu.LJJIZ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
    public final void write(C09DL c09dl, LiveBannerPageV2OptimizeSetting.Config config) throws IOException {
        LiveBannerPageV2OptimizeSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(config2.enable);
        c09dl.LJIILLIIL("cache_size");
        c09dl.LJJJJ(config2.cacheSize);
        c09dl.LJIILLIIL("enable_extra_height");
        c09dl.LJJJJJL(config2.enableExtraHeight);
        c09dl.LJII();
    }
}
