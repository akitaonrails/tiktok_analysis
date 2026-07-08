package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRoomBgImageOptConfig_OptTypeAdapter extends TypeAdapter<LiveRoomBgImageOptConfig> {
    public final Gson LIZ;

    public LiveRoomBgImageOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveRoomBgImageOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRoomBgImageOptConfig liveRoomBgImageOptConfig = new LiveRoomBgImageOptConfig(false, false, false, 1.0f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1626394976:
                        if (strLJJJJ.equals("client_draw_blur_higher_12")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRoomBgImageOptConfig.clientDrawBlur = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -284910152:
                        if (strLJJJJ.equals("use_8888")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRoomBgImageOptConfig.use8888 = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1042633360:
                        if (strLJJJJ.equals("use_blurEffect")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRoomBgImageOptConfig.useBlurEffect = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2106804074:
                        if (strLJJJJ.equals("blur_radius")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRoomBgImageOptConfig.blurRadius = (float) c09cu.LJJIL();
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
        return liveRoomBgImageOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRoomBgImageOptConfig liveRoomBgImageOptConfig) throws IOException {
        LiveRoomBgImageOptConfig liveRoomBgImageOptConfig2 = liveRoomBgImageOptConfig;
        if (liveRoomBgImageOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("use_8888");
        c09dl.LJJJJJL(liveRoomBgImageOptConfig2.use8888);
        c09dl.LJIILLIIL("client_draw_blur_higher_12");
        c09dl.LJJJJJL(liveRoomBgImageOptConfig2.clientDrawBlur);
        c09dl.LJIILLIIL("use_blurEffect");
        c09dl.LJJJJJL(liveRoomBgImageOptConfig2.useBlurEffect);
        c09dl.LJIILLIIL("blur_radius");
        c09dl.LJJJJ(Float.valueOf(liveRoomBgImageOptConfig2.blurRadius));
        c09dl.LJII();
    }
}
