package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveQuizContainerOpt_OptTypeAdapter extends TypeAdapter<LiveQuizContainerOpt> {
    public final Gson LIZ;

    public LiveQuizContainerOpt_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveQuizContainerOpt read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveQuizContainerOpt liveQuizContainerOpt = new LiveQuizContainerOpt(false, null, new ArrayList(), new ArrayList(), true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -100689769:
                        if (strLJJJJ.equals("preload_schema")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveQuizContainerOpt.preloadSchema = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 329999306:
                        if (strLJJJJ.equals("preload_allow_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveQuizContainerOpt.preloadAllowList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1068943999:
                        if (strLJJJJ.equals("reuse_allow_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveQuizContainerOpt.reuseAllowList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1308176501:
                        if (strLJJJJ.equals("downgrade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveQuizContainerOpt.downgrade = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1435758100:
                        if (strLJJJJ.equals("ignore_failed_preload")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveQuizContainerOpt.ignoreFailedPreload = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveQuizContainerOpt;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveQuizContainerOpt liveQuizContainerOpt) throws IOException {
        LiveQuizContainerOpt liveQuizContainerOpt2 = liveQuizContainerOpt;
        if (liveQuizContainerOpt2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("downgrade");
        c09dl.LJJJJJL(liveQuizContainerOpt2.downgrade);
        c09dl.LJIILLIIL("preload_schema");
        c09dl.LJJJJJ(liveQuizContainerOpt2.preloadSchema);
        c09dl.LJIILLIIL("reuse_allow_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveQuizContainerOpt2.reuseAllowList, String.class);
        c09dl.LJIILLIIL("preload_allow_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveQuizContainerOpt2.preloadAllowList, String.class);
        c09dl.LJIILLIIL("ignore_failed_preload");
        c09dl.LJJJJJL(liveQuizContainerOpt2.ignoreFailedPreload);
        c09dl.LJII();
    }
}
