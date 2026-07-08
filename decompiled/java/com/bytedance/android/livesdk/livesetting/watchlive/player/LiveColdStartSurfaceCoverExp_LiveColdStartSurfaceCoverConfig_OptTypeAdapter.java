package com.bytedance.android.livesdk.livesetting.watchlive.player;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveColdStartSurfaceCoverExp;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveColdStartSurfaceCoverExp_LiveColdStartSurfaceCoverConfig_OptTypeAdapter extends TypeAdapter<LiveColdStartSurfaceCoverExp.LiveColdStartSurfaceCoverConfig> {
    public final Gson LIZ;

    public LiveColdStartSurfaceCoverExp_LiveColdStartSurfaceCoverConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveColdStartSurfaceCoverExp.LiveColdStartSurfaceCoverConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveColdStartSurfaceCoverExp.LiveColdStartSurfaceCoverConfig liveColdStartSurfaceCoverConfig = new LiveColdStartSurfaceCoverExp.LiveColdStartSurfaceCoverConfig(false, false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2001071689:
                        if (strLJJJJ.equals("reveal_on_draw_thread")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveColdStartSurfaceCoverConfig.setRevealOnDrawThread(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1423426679:
                        if (strLJJJJ.equals("reveal_on_selected")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveColdStartSurfaceCoverConfig.setRevealOnSelected(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveColdStartSurfaceCoverConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1945809007:
                        if (strLJJJJ.equals("bg_fallback_only")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveColdStartSurfaceCoverConfig.setBgFallbackOnly(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
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
        return liveColdStartSurfaceCoverConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveColdStartSurfaceCoverExp.LiveColdStartSurfaceCoverConfig liveColdStartSurfaceCoverConfig) throws IOException {
        LiveColdStartSurfaceCoverExp.LiveColdStartSurfaceCoverConfig liveColdStartSurfaceCoverConfig2 = liveColdStartSurfaceCoverConfig;
        if (liveColdStartSurfaceCoverConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveColdStartSurfaceCoverConfig2.getEnable());
        c09dl.LJIILLIIL("reveal_on_selected");
        c09dl.LJJJJJL(liveColdStartSurfaceCoverConfig2.getRevealOnSelected());
        c09dl.LJIILLIIL("reveal_on_draw_thread");
        c09dl.LJJJJJL(liveColdStartSurfaceCoverConfig2.getRevealOnDrawThread());
        c09dl.LJIILLIIL("bg_fallback_only");
        c09dl.LJJJJJL(liveColdStartSurfaceCoverConfig2.getBgFallbackOnly());
        c09dl.LJII();
    }
}
