package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class RivalSectionConfig_OptTypeAdapter extends TypeAdapter<RivalSectionConfig> {
    public final Gson LIZ;

    public RivalSectionConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final RivalSectionConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RivalSectionConfig rivalSectionConfig = new RivalSectionConfig(-1, false, false, false, 0L, -1L, null, 1, 0L, true, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2071612657:
                        if (strLJJJJ.equals("cache_use_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rivalSectionConfig.cacheUseType = Integer.valueOf(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1956700211:
                        if (strLJJJJ.equals("preload_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rivalSectionConfig.preloadDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1941803632:
                        if (strLJJJJ.equals("preload_times")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rivalSectionConfig.preloadTimesConfig = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1005493701:
                        if (strLJJJJ.equals("preload_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rivalSectionConfig.preloadIntervalConfig = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -553250897:
                        if (strLJJJJ.equals("cache_ttl")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rivalSectionConfig.cacheTTL = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -147777106:
                        if (strLJJJJ.equals("open_last_cache")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rivalSectionConfig.openLastCache = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 96965648:
                        if (strLJJJJ.equals("extra")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rivalSectionConfig.extra = (RivalSectionExtraConfig) this.LIZ.LJIIJ(RivalSectionExtraConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 168448276:
                        if (strLJJJJ.equals("open_preload")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rivalSectionConfig.openPreload = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1100995048:
                        if (strLJJJJ.equals("reload_when_newly_fetched")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rivalSectionConfig.reloadWhenNewlyFetched = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1211778466:
                        if (strLJJJJ.equals("rival_section_value")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rivalSectionConfig.rivalSectionValue = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1773404445:
                        if (strLJJJJ.equals("open_click_preload")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rivalSectionConfig.openClickPreload = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return rivalSectionConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RivalSectionConfig rivalSectionConfig) throws IOException {
        RivalSectionConfig rivalSectionConfig2 = rivalSectionConfig;
        if (rivalSectionConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("rival_section_value");
        c09dl.LJJJJ(Integer.valueOf(rivalSectionConfig2.rivalSectionValue));
        c09dl.LJIILLIIL("open_preload");
        c09dl.LJJJJJL(rivalSectionConfig2.openPreload);
        c09dl.LJIILLIIL("open_click_preload");
        c09dl.LJJJJJL(rivalSectionConfig2.openClickPreload);
        c09dl.LJIILLIIL("open_last_cache");
        c09dl.LJJJJJL(rivalSectionConfig2.openLastCache);
        c09dl.LJIILLIIL("preload_delay");
        c09dl.LJJIZ(rivalSectionConfig2.preloadDelay);
        c09dl.LJIILLIIL("cache_ttl");
        c09dl.LJJIZ(rivalSectionConfig2.cacheTTL);
        c09dl.LJIILLIIL("cache_use_type");
        c09dl.LJJJJ(rivalSectionConfig2.cacheUseType);
        c09dl.LJIILLIIL("preload_times");
        c09dl.LJJJJ(Integer.valueOf(rivalSectionConfig2.preloadTimesConfig));
        c09dl.LJIILLIIL("preload_interval");
        c09dl.LJJIZ(rivalSectionConfig2.preloadIntervalConfig);
        c09dl.LJIILLIIL("reload_when_newly_fetched");
        c09dl.LJJJJJL(rivalSectionConfig2.reloadWhenNewlyFetched);
        c09dl.LJIILLIIL("extra");
        this.LIZ.LJIIJ(RivalSectionExtraConfig.class).write(c09dl, rivalSectionConfig2.extra);
        c09dl.LJII();
    }
}
