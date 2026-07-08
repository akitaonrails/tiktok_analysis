package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.other.LiveBarrageBackgroundCacheSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveBarrageBackgroundCacheSetting_Config_OptTypeAdapter extends TypeAdapter<LiveBarrageBackgroundCacheSetting.Config> {
    public final Gson LIZ;

    public LiveBarrageBackgroundCacheSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveBarrageBackgroundCacheSetting.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveBarrageBackgroundCacheSetting.Config config = new LiveBarrageBackgroundCacheSetting.Config(1024, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -931763297) {
                    if (iHashCode != -739278590) {
                        if (iHashCode == 1878451064 && strLJJJJ.equals("live_barrage_background_preload_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.enablePreload = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("live_barrage_background_cache_length")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            config.length = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("live_barrage_background_cache_enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.enableCache = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
    public final void write(C09DL c09dl, LiveBarrageBackgroundCacheSetting.Config config) throws IOException {
        LiveBarrageBackgroundCacheSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_barrage_background_cache_length");
        c09dl.LJJJJ(Integer.valueOf(config2.length));
        c09dl.LJIILLIIL("live_barrage_background_preload_enable");
        c09dl.LJJJJJL(config2.enablePreload);
        c09dl.LJIILLIIL("live_barrage_background_cache_enable");
        c09dl.LJJJJJL(config2.enableCache);
        c09dl.LJII();
    }
}
