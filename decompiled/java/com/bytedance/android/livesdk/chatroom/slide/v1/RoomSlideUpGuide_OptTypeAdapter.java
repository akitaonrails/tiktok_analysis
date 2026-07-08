package com.bytedance.android.livesdk.chatroom.slide.v1;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class RoomSlideUpGuide_OptTypeAdapter extends TypeAdapter<RoomSlideUpGuide> {
    public final Gson LIZ;

    public RoomSlideUpGuide_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final RoomSlideUpGuide read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RoomSlideUpGuide roomSlideUpGuide = new RoomSlideUpGuide();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1436844737:
                        if (strLJJJJ.equals("max_show_times")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                roomSlideUpGuide.maxShowTimes = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -889473228:
                        if (strLJJJJ.equals("switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                roomSlideUpGuide.switchs = C473040Igo.LIZIZ(this.LIZ, c09cu, Boolean.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 394254837:
                        if (strLJJJJ.equals("ec_switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                roomSlideUpGuide.ecSwitches = C473040Igo.LIZIZ(this.LIZ, c09cu, Boolean.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1850025594:
                        if (strLJJJJ.equals("new_play_times")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                roomSlideUpGuide.newPlayTimes = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1926545019:
                        if (strLJJJJ.equals("play_times")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                roomSlideUpGuide.playTimes = c09cu.LJJIZ();
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
        return roomSlideUpGuide;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RoomSlideUpGuide roomSlideUpGuide) {
        RoomSlideUpGuide roomSlideUpGuide2 = roomSlideUpGuide;
        if (roomSlideUpGuide2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("play_times");
        c09dl.LJJJJ(Integer.valueOf(roomSlideUpGuide2.playTimes));
        c09dl.LJIILLIIL("new_play_times");
        c09dl.LJJJJ(Integer.valueOf(roomSlideUpGuide2.newPlayTimes));
        c09dl.LJIILLIIL("max_show_times");
        c09dl.LJJJJ(Integer.valueOf(roomSlideUpGuide2.maxShowTimes));
        c09dl.LJIILLIIL("switch");
        Gson gson = this.LIZ;
        Map<String, Boolean> map = roomSlideUpGuide2.switchs;
        Class cls = Boolean.TYPE;
        C473040Igo.LJ(gson, c09dl, map, cls);
        c09dl.LJIILLIIL("ec_switch");
        C473040Igo.LJ(this.LIZ, c09dl, roomSlideUpGuide2.ecSwitches, cls);
        c09dl.LJII();
    }
}
