package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes15.dex */
public final class LiveKaraokeAccompany_OptTypeAdapter extends TypeAdapter<LiveKaraokeAccompany> {
    @Override // com.google.gson.TypeAdapter
    public final LiveKaraokeAccompany read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveKaraokeAccompany liveKaraokeAccompany = new LiveKaraokeAccompany(1.0f, 0.0f, 0.5f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != 107876) {
                    if (iHashCode != 108114) {
                        if (iHashCode == 1544803905 && strLJJJJ.equals("default")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveKaraokeAccompany.f26default = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("min")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveKaraokeAccompany.min = (float) c09cu.LJJIL();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("max")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveKaraokeAccompany.max = (float) c09cu.LJJIL();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveKaraokeAccompany;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveKaraokeAccompany liveKaraokeAccompany) {
        LiveKaraokeAccompany liveKaraokeAccompany2 = liveKaraokeAccompany;
        if (liveKaraokeAccompany2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("max");
        c09dl.LJJJJ(Float.valueOf(liveKaraokeAccompany2.max));
        c09dl.LJIILLIIL("min");
        c09dl.LJJJJ(Float.valueOf(liveKaraokeAccompany2.min));
        c09dl.LJIILLIIL("default");
        c09dl.LJJJJ(Float.valueOf(liveKaraokeAccompany2.f26default));
        c09dl.LJII();
    }
}
