package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1AWY;
import X.C473040Igo;
import X.EnumC2184291AeB;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveRunnableBlockConfig_OptTypeAdapter extends TypeAdapter<LiveRunnableBlockConfig> {
    public final Gson LIZ;

    public LiveRunnableBlockConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveRunnableBlockConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRunnableBlockConfig liveRunnableBlockConfig = new LiveRunnableBlockConfig(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), EnumC2184291AeB.PARK.ordinal(), C1AWY.SINGLE.ordinal(), C1AWY.SINGLE.ordinal(), 3000L, 0L, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1649410737:
                        if (strLJJJJ.equals("thread_config_for_type_single")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRunnableBlockConfig.threadConfigForTypeSingle = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1297025542:
                        if (strLJJJJ.equals("thread_config_for_type_all")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRunnableBlockConfig.threadConfigForTypeAll = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1154764274:
                        if (strLJJJJ.equals("runnable_block_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRunnableBlockConfig.runnableBlockType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1083100452:
                        if (strLJJJJ.equals("runnable_config_for_type_single")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRunnableBlockConfig.runnableConfigForTypeSingle = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 814874853:
                        if (strLJJJJ.equals("scene_min_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRunnableBlockConfig.sceneMinInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1057349704:
                        if (strLJJJJ.equals("thread_block_once")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRunnableBlockConfig.threadBlockOnce = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1057509633:
                        if (strLJJJJ.equals("thread_block_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRunnableBlockConfig.threadBlockType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1286340117:
                        if (strLJJJJ.equals("block_mode")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRunnableBlockConfig.blockMode = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1286543167:
                        if (strLJJJJ.equals("block_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRunnableBlockConfig.blockTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1770353549:
                        if (strLJJJJ.equals("runnable_config_for_type_all")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRunnableBlockConfig.runnableConfigForTypeAll = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
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
        return liveRunnableBlockConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRunnableBlockConfig liveRunnableBlockConfig) throws IOException {
        LiveRunnableBlockConfig liveRunnableBlockConfig2 = liveRunnableBlockConfig;
        if (liveRunnableBlockConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("runnable_config_for_type_all");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveRunnableBlockConfig2.runnableConfigForTypeAll, String.class);
        c09dl.LJIILLIIL("runnable_config_for_type_single");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveRunnableBlockConfig2.runnableConfigForTypeSingle, String.class);
        c09dl.LJIILLIIL("thread_config_for_type_all");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveRunnableBlockConfig2.threadConfigForTypeAll, String.class);
        c09dl.LJIILLIIL("thread_config_for_type_single");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveRunnableBlockConfig2.threadConfigForTypeSingle, String.class);
        c09dl.LJIILLIIL("block_mode");
        c09dl.LJJJJ(Integer.valueOf(liveRunnableBlockConfig2.blockMode));
        c09dl.LJIILLIIL("runnable_block_type");
        c09dl.LJJJJ(Integer.valueOf(liveRunnableBlockConfig2.runnableBlockType));
        c09dl.LJIILLIIL("thread_block_type");
        c09dl.LJJJJ(Integer.valueOf(liveRunnableBlockConfig2.threadBlockType));
        c09dl.LJIILLIIL("block_time");
        c09dl.LJJIZ(liveRunnableBlockConfig2.blockTime);
        c09dl.LJIILLIIL("scene_min_interval");
        c09dl.LJJIZ(liveRunnableBlockConfig2.sceneMinInterval);
        c09dl.LJIILLIIL("thread_block_once");
        c09dl.LJJJJJL(liveRunnableBlockConfig2.threadBlockOnce);
        c09dl.LJII();
    }
}
