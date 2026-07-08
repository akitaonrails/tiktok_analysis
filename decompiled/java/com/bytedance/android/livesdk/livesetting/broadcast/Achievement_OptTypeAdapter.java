package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1697810uHb;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class Achievement_OptTypeAdapter extends TypeAdapter<Achievement> {
    public final Gson LIZ;

    public Achievement_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final Achievement read(C09CU c09cu) {
        Achievement achievement = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            achievement = new Achievement(C1697810uHb.LJIIJJI(40L, 90L, 500L, 1000L), C1697810uHb.LJIIJJI(900L, 10000L, 100000L, 1000000L));
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "live_end_encourage_duration_list")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        achievement.setDurationList(C473040Igo.LIZ(this.LIZ, c09cu, Long.TYPE));
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "live_end_encourage_diamond_list")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        achievement.setDiamondList(C473040Igo.LIZ(this.LIZ, c09cu, Long.TYPE));
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return achievement;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Achievement achievement) {
        Achievement achievement2 = achievement;
        if (achievement2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_end_encourage_duration_list");
        Gson gson = this.LIZ;
        List<Long> durationList = achievement2.getDurationList();
        Class cls = Long.TYPE;
        C473040Igo.LIZLLL(gson, c09dl, durationList, cls);
        c09dl.LJIILLIIL("live_end_encourage_diamond_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, achievement2.getDiamondList(), cls);
        c09dl.LJII();
    }
}
