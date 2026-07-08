package com.bytedance.android.livesdk.chatroom.slide.v1;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveAnimationDegrade_OptTypeAdapter extends TypeAdapter<LiveAnimationDegrade> {
    public final Gson LIZ;

    public LiveAnimationDegrade_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveAnimationDegrade read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveAnimationDegrade liveAnimationDegrade = new LiveAnimationDegrade(true, true, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1355524800) {
                    if (iHashCode != 748406846) {
                        if (iHashCode == 1971770645 && strLJJJJ.equals("enable_mini_toplive")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAnimationDegrade.enableMiniTopLives = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable_entrance_anim")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveAnimationDegrade.enableEntranceAnim = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable_guide")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveAnimationDegrade.enableGuide = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveAnimationDegrade;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveAnimationDegrade liveAnimationDegrade) throws IOException {
        LiveAnimationDegrade liveAnimationDegrade2 = liveAnimationDegrade;
        if (liveAnimationDegrade2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_guide");
        c09dl.LJJJJJL(liveAnimationDegrade2.enableGuide);
        c09dl.LJIILLIIL("enable_mini_toplive");
        c09dl.LJJJJJL(liveAnimationDegrade2.enableMiniTopLives);
        c09dl.LJIILLIIL("enable_entrance_anim");
        c09dl.LJJJJJL(liveAnimationDegrade2.enableEntranceAnim);
        c09dl.LJII();
    }
}
