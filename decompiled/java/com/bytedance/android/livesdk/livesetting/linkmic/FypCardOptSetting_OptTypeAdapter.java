package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class FypCardOptSetting_OptTypeAdapter extends TypeAdapter<FypCardOptSetting> {
    public final Gson LIZ;

    public FypCardOptSetting_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FypCardOptSetting read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FypCardOptSetting fypCardOptSetting = new FypCardOptSetting(false, false, false, false, 300L, false, 6.0f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -854872680:
                        if (strLJJJJ.equals("low_performance_score")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fypCardOptSetting.lowPerformanceScore = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -641130627:
                        if (strLJJJJ.equals("preload_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fypCardOptSetting.preloadOptEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 341980190:
                        if (strLJJJJ.equals("layout_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fypCardOptSetting.layoutOptEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 363940571:
                        if (strLJJJJ.equals("low_performance_animate_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fypCardOptSetting.lowPerformanceAnimateOptEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 449594544:
                        if (strLJJJJ.equals("cache_expire_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fypCardOptSetting.cacheExpireTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1548133946:
                        if (strLJJJJ.equals("async_preload_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fypCardOptSetting.asyncPreloadOptEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1587932291:
                        if (strLJJJJ.equals("pull_preload_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fypCardOptSetting.pullPreloadOptEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return fypCardOptSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FypCardOptSetting fypCardOptSetting) throws IOException {
        FypCardOptSetting fypCardOptSetting2 = fypCardOptSetting;
        if (fypCardOptSetting2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("layout_opt");
        c09dl.LJJJJJL(fypCardOptSetting2.layoutOptEnable);
        c09dl.LJIILLIIL("preload_opt");
        c09dl.LJJJJJL(fypCardOptSetting2.preloadOptEnable);
        c09dl.LJIILLIIL("async_preload_opt");
        c09dl.LJJJJJL(fypCardOptSetting2.asyncPreloadOptEnable);
        c09dl.LJIILLIIL("pull_preload_opt");
        c09dl.LJJJJJL(fypCardOptSetting2.pullPreloadOptEnable);
        c09dl.LJIILLIIL("cache_expire_time");
        c09dl.LJJIZ(fypCardOptSetting2.cacheExpireTime);
        c09dl.LJIILLIIL("low_performance_animate_opt");
        c09dl.LJJJJJL(fypCardOptSetting2.lowPerformanceAnimateOptEnable);
        c09dl.LJIILLIIL("low_performance_score");
        c09dl.LJJJJ(Float.valueOf(fypCardOptSetting2.lowPerformanceScore));
        c09dl.LJII();
    }
}
