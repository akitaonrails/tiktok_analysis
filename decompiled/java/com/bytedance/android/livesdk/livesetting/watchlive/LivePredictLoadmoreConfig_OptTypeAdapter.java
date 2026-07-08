package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePredictLoadmoreConfig_OptTypeAdapter extends TypeAdapter<LivePredictLoadmoreConfig> {
    public final Gson LIZ;

    public LivePredictLoadmoreConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePredictLoadmoreConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePredictLoadmoreConfig livePredictLoadmoreConfig = new LivePredictLoadmoreConfig(false, 3, 2000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1519064686) {
                    if (iHashCode != -1333703108) {
                        if (iHashCode == -1298848381 && strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePredictLoadmoreConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("max_wait_time")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            livePredictLoadmoreConfig.maxWaitTime = c09cu.LJJJ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("left_room_threhold")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        livePredictLoadmoreConfig.leftRoomThrehold = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return livePredictLoadmoreConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePredictLoadmoreConfig livePredictLoadmoreConfig) throws IOException {
        LivePredictLoadmoreConfig livePredictLoadmoreConfig2 = livePredictLoadmoreConfig;
        if (livePredictLoadmoreConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(livePredictLoadmoreConfig2.enable);
        c09dl.LJIILLIIL("left_room_threhold");
        c09dl.LJJJJ(Integer.valueOf(livePredictLoadmoreConfig2.leftRoomThrehold));
        c09dl.LJIILLIIL("max_wait_time");
        c09dl.LJJIZ(livePredictLoadmoreConfig2.maxWaitTime);
        c09dl.LJII();
    }
}
