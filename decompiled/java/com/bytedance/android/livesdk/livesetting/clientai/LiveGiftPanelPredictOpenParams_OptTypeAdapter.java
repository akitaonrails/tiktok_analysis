package com.bytedance.android.livesdk.livesetting.clientai;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftPanelPredictOpenParams_OptTypeAdapter extends TypeAdapter<LiveGiftPanelPredictOpenParams> {
    public final Gson LIZ;

    public LiveGiftPanelPredictOpenParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveGiftPanelPredictOpenParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGiftPanelPredictOpenParams liveGiftPanelPredictOpenParams = new LiveGiftPanelPredictOpenParams(false, 30L, "gift_panel_predict_open", 12, -1L, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1733231085:
                        if (strLJJJJ.equals("icon_preload_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftPanelPredictOpenParams.preloadCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1446402365:
                        if (strLJJJJ.equals("default_predict_time_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftPanelPredictOpenParams.defaultPredictTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftPanelPredictOpenParams.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -485160624:
                        if (strLJJJJ.equals("algo_package_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftPanelPredictOpenParams.algoPkgName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 304234378:
                        if (strLJJJJ.equals("room_enter_delay_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftPanelPredictOpenParams.roomEnterDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 541088847:
                        if (strLJJJJ.equals("is_training")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftPanelPredictOpenParams.isTraining = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveGiftPanelPredictOpenParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGiftPanelPredictOpenParams liveGiftPanelPredictOpenParams) throws IOException {
        LiveGiftPanelPredictOpenParams liveGiftPanelPredictOpenParams2 = liveGiftPanelPredictOpenParams;
        if (liveGiftPanelPredictOpenParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveGiftPanelPredictOpenParams2.enable);
        c09dl.LJIILLIIL("room_enter_delay_sec");
        c09dl.LJJIZ(liveGiftPanelPredictOpenParams2.roomEnterDelay);
        c09dl.LJIILLIIL("algo_package_name");
        c09dl.LJJJJJ(liveGiftPanelPredictOpenParams2.algoPkgName);
        c09dl.LJIILLIIL("icon_preload_count");
        c09dl.LJJJJ(Integer.valueOf(liveGiftPanelPredictOpenParams2.preloadCount));
        c09dl.LJIILLIIL("default_predict_time_sec");
        c09dl.LJJIZ(liveGiftPanelPredictOpenParams2.defaultPredictTime);
        c09dl.LJIILLIIL("is_training");
        c09dl.LJJJJJL(liveGiftPanelPredictOpenParams2.isTraining);
        c09dl.LJII();
    }
}
