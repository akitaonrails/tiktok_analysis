package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveGameDrawLoadOptModel_OptTypeAdapter extends TypeAdapter<LiveGameDrawLoadOptModel> {
    public final Gson LIZ;

    public LiveGameDrawLoadOptModel_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveGameDrawLoadOptModel read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGameDrawLoadOptModel liveGameDrawLoadOptModel = new LiveGameDrawLoadOptModel(false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1314029033) {
                    if (iHashCode != -412873826) {
                        if (iHashCode == 1671835431 && strLJJJJ.equals("horizontal_canvas_stable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGameDrawLoadOptModel.setHorizontalCanvasStable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("loading_stable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveGameDrawLoadOptModel.setLoadingStable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("gaussian_hide_timing_opt")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveGameDrawLoadOptModel.setGaussianHideTimingOpt(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveGameDrawLoadOptModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGameDrawLoadOptModel liveGameDrawLoadOptModel) throws IOException {
        LiveGameDrawLoadOptModel liveGameDrawLoadOptModel2 = liveGameDrawLoadOptModel;
        if (liveGameDrawLoadOptModel2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("horizontal_canvas_stable");
        c09dl.LJJJJJL(liveGameDrawLoadOptModel2.getHorizontalCanvasStable());
        c09dl.LJIILLIIL("loading_stable");
        c09dl.LJJJJJL(liveGameDrawLoadOptModel2.getLoadingStable());
        c09dl.LJIILLIIL("gaussian_hide_timing_opt");
        c09dl.LJJJJJL(liveGameDrawLoadOptModel2.getGaussianHideTimingOpt());
        c09dl.LJII();
    }
}
