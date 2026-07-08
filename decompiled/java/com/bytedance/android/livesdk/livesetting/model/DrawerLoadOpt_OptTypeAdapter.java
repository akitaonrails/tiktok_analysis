package com.bytedance.android.livesdk.livesetting.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawerLoadOpt_OptTypeAdapter extends TypeAdapter<DrawerLoadOpt> {
    public final Gson LIZ;

    public DrawerLoadOpt_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final DrawerLoadOpt read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        DrawerLoadOpt drawerLoadOpt = new DrawerLoadOpt();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1230308670:
                        if (strLJJJJ.equals(" tt_live_drawer_load_opt_delay_preload_ui_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                drawerLoadOpt.delayUIDuration = c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1202670276:
                        if (strLJJJJ.equals("tt_live_drawer_load_opt_preloading_game_data")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                drawerLoadOpt.isPreLoadingGameData = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -639276660:
                        if (strLJJJJ.equals("tt_live_drawer_load_opt_preloading_foru_ui")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                drawerLoadOpt.isPreLoadingForuUI = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -195282484:
                        if (strLJJJJ.equals("tt_live_drawer_load_opt_delay_preload_data_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                drawerLoadOpt.delayDataDuration = c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -165057374:
                        if (strLJJJJ.equals("tt_live_drawer_load_opt_preloading_foru_data")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                drawerLoadOpt.isPreLoadingForuData = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -157675354:
                        if (strLJJJJ.equals("tt_live_drawer_load_opt_preloading_game_ui")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                drawerLoadOpt.isPreLoadingGameUI = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 688631619:
                        if (strLJJJJ.equals("tt_live_drawer_load_opt_default_landing_game")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                drawerLoadOpt.isLandingGame = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return drawerLoadOpt;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, DrawerLoadOpt drawerLoadOpt) throws IOException {
        DrawerLoadOpt drawerLoadOpt2 = drawerLoadOpt;
        if (drawerLoadOpt2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("tt_live_drawer_load_opt_default_landing_game");
        c09dl.LJJJJJL(drawerLoadOpt2.isLandingGame);
        c09dl.LJIILLIIL("tt_live_drawer_load_opt_preloading_game_data");
        c09dl.LJJJJJL(drawerLoadOpt2.isPreLoadingGameData);
        c09dl.LJIILLIIL("tt_live_drawer_load_opt_preloading_foru_data");
        c09dl.LJJJJJL(drawerLoadOpt2.isPreLoadingForuData);
        c09dl.LJIILLIIL("tt_live_drawer_load_opt_preloading_game_ui");
        c09dl.LJJJJJL(drawerLoadOpt2.isPreLoadingGameUI);
        c09dl.LJIILLIIL("tt_live_drawer_load_opt_preloading_foru_ui");
        c09dl.LJJJJJL(drawerLoadOpt2.isPreLoadingForuUI);
        c09dl.LJIILLIIL("tt_live_drawer_load_opt_delay_preload_data_duration");
        c09dl.LJJIL(drawerLoadOpt2.delayDataDuration);
        c09dl.LJIILLIIL(" tt_live_drawer_load_opt_delay_preload_ui_duration");
        c09dl.LJJIL(drawerLoadOpt2.delayUIDuration);
        c09dl.LJII();
    }
}
