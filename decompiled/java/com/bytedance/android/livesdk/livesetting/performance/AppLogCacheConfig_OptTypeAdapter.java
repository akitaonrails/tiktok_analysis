package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class AppLogCacheConfig_OptTypeAdapter extends TypeAdapter<AppLogCacheConfig> {
    public final Gson LIZ;

    public AppLogCacheConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final AppLogCacheConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        AppLogCacheConfig appLogCacheConfig = new AppLogCacheConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -249250188) {
                    if (iHashCode != 258330356) {
                        if (iHashCode == 1528643904 && strLJJJJ.equals("max_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                appLogCacheConfig.maxInterval = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("white_list")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            appLogCacheConfig.whiteList = (String[]) this.LIZ.LJIIJ(String[].class).read(c09cu);
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("max_count")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        appLogCacheConfig.maxCount = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return appLogCacheConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, AppLogCacheConfig appLogCacheConfig) {
        AppLogCacheConfig appLogCacheConfig2 = appLogCacheConfig;
        if (appLogCacheConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("white_list");
        this.LIZ.LJIIJ(String[].class).write(c09dl, appLogCacheConfig2.whiteList);
        c09dl.LJIILLIIL("max_count");
        c09dl.LJJJJ(Integer.valueOf(appLogCacheConfig2.maxCount));
        c09dl.LJIILLIIL("max_interval");
        c09dl.LJJJJ(Integer.valueOf(appLogCacheConfig2.maxInterval));
        c09dl.LJII();
    }
}
