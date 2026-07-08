package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveTopTabData_OptTypeAdapter extends TypeAdapter<LiveTopTabData> {
    public final Gson LIZ;

    public LiveTopTabData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveTopTabData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveTopTabData liveTopTabData = new LiveTopTabData(true, true, true, true, true, false, 300L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1272623294:
                        if (strLJJJJ.equals("slideOpt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTopTabData.slideOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -889473228:
                        if (strLJJJJ.equals("switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTopTabData.f37switch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 112314014:
                        if (strLJJJJ.equals("clear_screen")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTopTabData.clearScreen = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 233494155:
                        if (strLJJJJ.equals("landing_tab_time_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTopTabData.landingTabTimeSecondsThreshold = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 687047667:
                        if (strLJJJJ.equals("hide_live_end_close_button")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTopTabData.hideLiveEndPageCloseBtn = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1031190608:
                        if (strLJJJJ.equals("landscapeOptRevertSwitch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTopTabData.landscapeOptRevertSwitch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1173553315:
                        if (strLJJJJ.equals("lynx_prefetch_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTopTabData.lynxPrefetchEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveTopTabData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveTopTabData liveTopTabData) throws IOException {
        LiveTopTabData liveTopTabData2 = liveTopTabData;
        if (liveTopTabData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("switch");
        c09dl.LJJJJJL(liveTopTabData2.f37switch);
        c09dl.LJIILLIIL("slideOpt");
        c09dl.LJJJJJL(liveTopTabData2.slideOpt);
        c09dl.LJIILLIIL("clear_screen");
        c09dl.LJJJJJL(liveTopTabData2.clearScreen);
        c09dl.LJIILLIIL("hide_live_end_close_button");
        c09dl.LJJJJJL(liveTopTabData2.hideLiveEndPageCloseBtn);
        c09dl.LJIILLIIL("lynx_prefetch_enable");
        c09dl.LJJJJJL(liveTopTabData2.lynxPrefetchEnable);
        c09dl.LJIILLIIL("landscapeOptRevertSwitch");
        c09dl.LJJJJJL(liveTopTabData2.landscapeOptRevertSwitch);
        c09dl.LJIILLIIL("landing_tab_time_threshold");
        c09dl.LJJIZ(liveTopTabData2.landingTabTimeSecondsThreshold);
        c09dl.LJII();
    }
}
