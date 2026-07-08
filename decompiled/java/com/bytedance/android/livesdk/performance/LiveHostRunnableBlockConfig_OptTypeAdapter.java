package com.bytedance.android.livesdk.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveHostRunnableBlockConfig_OptTypeAdapter extends TypeAdapter<LiveHostRunnableBlockConfig> {
    public final Gson LIZ;

    public LiveHostRunnableBlockConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveHostRunnableBlockConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveHostRunnableBlockConfig liveHostRunnableBlockConfig = new LiveHostRunnableBlockConfig(false, 0L, null, 7, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1298848381) {
                    if (iHashCode != 1130983741) {
                        if (iHashCode == 1286305040 && strLJJJJ.equals("block_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostRunnableBlockConfig.setBlockList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("block_time_in_mills")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveHostRunnableBlockConfig.setBlockTimeInMills(c09cu.LJJJ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveHostRunnableBlockConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveHostRunnableBlockConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveHostRunnableBlockConfig liveHostRunnableBlockConfig) throws IOException {
        LiveHostRunnableBlockConfig liveHostRunnableBlockConfig2 = liveHostRunnableBlockConfig;
        if (liveHostRunnableBlockConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveHostRunnableBlockConfig2.getEnable());
        c09dl.LJIILLIIL("block_time_in_mills");
        c09dl.LJJIZ(liveHostRunnableBlockConfig2.getBlockTimeInMills());
        c09dl.LJIILLIIL("block_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveHostRunnableBlockConfig2.getBlockList(), String.class);
        c09dl.LJII();
    }
}
