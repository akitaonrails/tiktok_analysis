package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridLynxCodeCacheOptimizeSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveHybridLynxCodeCacheOptimizeSetting_CodeCacheOptimizeConfig_OptTypeAdapter extends TypeAdapter<LiveHybridLynxCodeCacheOptimizeSetting.CodeCacheOptimizeConfig> {
    public final Gson LIZ;

    public LiveHybridLynxCodeCacheOptimizeSetting_CodeCacheOptimizeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveHybridLynxCodeCacheOptimizeSetting.CodeCacheOptimizeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveHybridLynxCodeCacheOptimizeSetting.CodeCacheOptimizeConfig codeCacheOptimizeConfig = new LiveHybridLynxCodeCacheOptimizeSetting.CodeCacheOptimizeConfig(false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -409536275) {
                    if (iHashCode != 1066826230) {
                        if (iHashCode == 1322089830 && strLJJJJ.equals("short_touch_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                codeCacheOptimizeConfig.shortTouchEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("banner_enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            codeCacheOptimizeConfig.bannerEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("middle_touch_enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        codeCacheOptimizeConfig.middleTouchEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return codeCacheOptimizeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveHybridLynxCodeCacheOptimizeSetting.CodeCacheOptimizeConfig codeCacheOptimizeConfig) throws IOException {
        LiveHybridLynxCodeCacheOptimizeSetting.CodeCacheOptimizeConfig codeCacheOptimizeConfig2 = codeCacheOptimizeConfig;
        if (codeCacheOptimizeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("short_touch_enable");
        c09dl.LJJJJJL(codeCacheOptimizeConfig2.shortTouchEnable);
        c09dl.LJIILLIIL("middle_touch_enable");
        c09dl.LJJJJJL(codeCacheOptimizeConfig2.middleTouchEnable);
        c09dl.LJIILLIIL("banner_enable");
        c09dl.LJJJJJL(codeCacheOptimizeConfig2.bannerEnable);
        c09dl.LJII();
    }
}
