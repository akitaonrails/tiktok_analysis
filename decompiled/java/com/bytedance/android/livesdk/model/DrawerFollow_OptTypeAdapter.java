package com.bytedance.android.livesdk.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawerFollow_OptTypeAdapter extends TypeAdapter<DrawerFollow> {
    public final Gson LIZ;

    public DrawerFollow_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final DrawerFollow read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        DrawerFollow drawerFollow = new DrawerFollow();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -999502978:
                        if (strLJJJJ.equals("tt_live_drawer_load_entrances")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                drawerFollow.unFollowEntrances = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 219771290:
                        if (strLJJJJ.equals("drawer_following_live_style")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                drawerFollow.drawerFollowStyle = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 248811925:
                        if (strLJJJJ.equals("drawer_game_entrance")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                drawerFollow.drawerGameEntrance = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 291191474:
                        if (strLJJJJ.equals("drawer_following_entrance")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                drawerFollow.drawerFollowEntrance = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1723724453:
                        if (strLJJJJ.equals("tt_live_drawer_load_entrance_show_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                drawerFollow.entranceShowTime = c09cu.LJJIZ();
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
        return drawerFollow;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, DrawerFollow drawerFollow) throws IOException {
        DrawerFollow drawerFollow2 = drawerFollow;
        if (drawerFollow2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("drawer_following_live_style");
        c09dl.LJJJJ(Integer.valueOf(drawerFollow2.drawerFollowStyle));
        c09dl.LJIILLIIL("drawer_following_entrance");
        c09dl.LJJJJJL(drawerFollow2.drawerFollowEntrance);
        c09dl.LJIILLIIL("drawer_game_entrance");
        c09dl.LJJJJJL(drawerFollow2.drawerGameEntrance);
        c09dl.LJIILLIIL("tt_live_drawer_load_entrance_show_time");
        c09dl.LJJJJ(Integer.valueOf(drawerFollow2.entranceShowTime));
        c09dl.LJIILLIIL("tt_live_drawer_load_entrances");
        C473040Igo.LIZLLL(this.LIZ, c09dl, drawerFollow2.unFollowEntrances, String.class);
        c09dl.LJII();
    }
}
