package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public final class LopDobPreload_OptTypeAdapter extends TypeAdapter<LopDobPreload> {
    public final Gson LIZ;

    public LopDobPreload_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LopDobPreload read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LopDobPreload lopDobPreload = new LopDobPreload("", new ArrayList(), new ArrayList(), 120);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -100689769:
                        if (strLJJJJ.equals("preload_schema")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                lopDobPreload.setPreloadSchema(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 329999306:
                        if (strLJJJJ.equals("preload_allow_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                lopDobPreload.setPreloadAllowList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1068943999:
                        if (strLJJJJ.equals("reuse_allow_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                lopDobPreload.setReuseAllowList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1344097533:
                        if (strLJJJJ.equals("expired_time_in_seconds")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                lopDobPreload.setExpiredTimeInSeconds(c09cu.LJJIZ());
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
        return lopDobPreload;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LopDobPreload lopDobPreload) {
        LopDobPreload lopDobPreload2 = lopDobPreload;
        if (lopDobPreload2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("preload_schema");
        c09dl.LJJJJJ(lopDobPreload2.getPreloadSchema());
        c09dl.LJIILLIIL("preload_allow_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, lopDobPreload2.getPreloadAllowList(), String.class);
        c09dl.LJIILLIIL("reuse_allow_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, lopDobPreload2.getReuseAllowList(), String.class);
        c09dl.LJIILLIIL("expired_time_in_seconds");
        c09dl.LJJJJ(Integer.valueOf(lopDobPreload2.getExpiredTimeInSeconds()));
        c09dl.LJII();
    }
}
