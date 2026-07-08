package com.bytedance.android.livesdk.livesetting.message;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes35.dex */
public final class LiveGamePauseSeiModel_OptTypeAdapter extends TypeAdapter<LiveGamePauseSeiModel> {
    public final Gson LIZ;

    public LiveGamePauseSeiModel_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveGamePauseSeiModel read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGamePauseSeiModel liveGamePauseSeiModel = new LiveGamePauseSeiModel(false, false, 1000L, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2031256823:
                        if (strLJJJJ.equals("is_audience_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGamePauseSeiModel.setAudienceEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1829571483:
                        if (strLJJJJ.equals("im_fallback_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGamePauseSeiModel.setImFallbackEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 334194680:
                        if (strLJJJJ.equals("is_anchor_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGamePauseSeiModel.setAnchorEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 687512055:
                        if (strLJJJJ.equals("time_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGamePauseSeiModel.setTimeInterval(c09cu.LJJJ());
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
        return liveGamePauseSeiModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGamePauseSeiModel liveGamePauseSeiModel) throws IOException {
        LiveGamePauseSeiModel liveGamePauseSeiModel2 = liveGamePauseSeiModel;
        if (liveGamePauseSeiModel2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_audience_enable");
        c09dl.LJJJJJL(liveGamePauseSeiModel2.isAudienceEnable());
        c09dl.LJIILLIIL("is_anchor_enable");
        c09dl.LJJJJJL(liveGamePauseSeiModel2.isAnchorEnable());
        c09dl.LJIILLIIL("time_interval");
        c09dl.LJJIZ(liveGamePauseSeiModel2.getTimeInterval());
        c09dl.LJIILLIIL("im_fallback_enable");
        c09dl.LJJJJJL(liveGamePauseSeiModel2.getImFallbackEnable());
        c09dl.LJII();
    }
}
