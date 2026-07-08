package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class SlrDiamondsPreload_OptTypeAdapter extends TypeAdapter<SlrDiamondsPreload> {
    public final Gson LIZ;

    public SlrDiamondsPreload_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final SlrDiamondsPreload read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SlrDiamondsPreload slrDiamondsPreload = new SlrDiamondsPreload(null, null, null, 0, 15, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -100689769:
                        if (strLJJJJ.equals("preload_schema")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                slrDiamondsPreload.setPreloadSchema(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 329999306:
                        if (strLJJJJ.equals("preload_allow_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                slrDiamondsPreload.setPreloadAllowList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1068943999:
                        if (strLJJJJ.equals("reuse_allow_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                slrDiamondsPreload.setReuseAllowList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1344097533:
                        if (strLJJJJ.equals("expired_time_in_seconds")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                slrDiamondsPreload.setExpiredTimeInSeconds(c09cu.LJJIZ());
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
        return slrDiamondsPreload;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SlrDiamondsPreload slrDiamondsPreload) {
        SlrDiamondsPreload slrDiamondsPreload2 = slrDiamondsPreload;
        if (slrDiamondsPreload2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("preload_schema");
        c09dl.LJJJJJ(slrDiamondsPreload2.getPreloadSchema());
        c09dl.LJIILLIIL("preload_allow_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, slrDiamondsPreload2.getPreloadAllowList(), String.class);
        c09dl.LJIILLIIL("reuse_allow_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, slrDiamondsPreload2.getReuseAllowList(), String.class);
        c09dl.LJIILLIIL("expired_time_in_seconds");
        c09dl.LJJJJ(Integer.valueOf(slrDiamondsPreload2.getExpiredTimeInSeconds()));
        c09dl.LJII();
    }
}
