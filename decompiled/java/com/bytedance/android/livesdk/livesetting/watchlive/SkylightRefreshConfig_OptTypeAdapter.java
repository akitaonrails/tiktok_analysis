package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class SkylightRefreshConfig_OptTypeAdapter extends TypeAdapter<SkylightRefreshConfig> {
    public final Gson LIZ;

    public SkylightRefreshConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final SkylightRefreshConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SkylightRefreshConfig skylightRefreshConfig = new SkylightRefreshConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1790097420:
                        if (strLJJJJ.equals("enable_follow_manual_refresh")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightRefreshConfig.enableFollowManualRefresh = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1574515809:
                        if (strLJJJJ.equals("interval_follow_auto_refresh")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightRefreshConfig.intervalFollowSecond = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1390263971:
                        if (strLJJJJ.equals("enable_follow_auto_refresh")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightRefreshConfig.enableFollowAutoRefresh = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -407959098:
                        if (strLJJJJ.equals("follow_refresh_sampling_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightRefreshConfig.followRefreshSamplingRate = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 655775555:
                        if (strLJJJJ.equals("interval_toplive_auto_refresh")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightRefreshConfig.intervalTopliveSecond = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1732134364:
                        if (strLJJJJ.equals("enable_toplive_manual_refresh")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightRefreshConfig.enableTopliveManualRefresh = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2072615237:
                        if (strLJJJJ.equals("enable_toplive_auto_refresh")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightRefreshConfig.enableTopliveAutoRefresh = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return skylightRefreshConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SkylightRefreshConfig skylightRefreshConfig) throws IOException {
        SkylightRefreshConfig skylightRefreshConfig2 = skylightRefreshConfig;
        if (skylightRefreshConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_follow_manual_refresh");
        c09dl.LJJJJJL(skylightRefreshConfig2.enableFollowManualRefresh);
        c09dl.LJIILLIIL("enable_follow_auto_refresh");
        c09dl.LJJJJJL(skylightRefreshConfig2.enableFollowAutoRefresh);
        c09dl.LJIILLIIL("interval_follow_auto_refresh");
        c09dl.LJJIZ(skylightRefreshConfig2.intervalFollowSecond);
        c09dl.LJIILLIIL("follow_refresh_sampling_rate");
        c09dl.LJJJJ(Float.valueOf(skylightRefreshConfig2.followRefreshSamplingRate));
        c09dl.LJIILLIIL("enable_toplive_manual_refresh");
        c09dl.LJJJJJL(skylightRefreshConfig2.enableTopliveManualRefresh);
        c09dl.LJIILLIIL("enable_toplive_auto_refresh");
        c09dl.LJJJJJL(skylightRefreshConfig2.enableTopliveAutoRefresh);
        c09dl.LJIILLIIL("interval_toplive_auto_refresh");
        c09dl.LJJIZ(skylightRefreshConfig2.intervalTopliveSecond);
        c09dl.LJII();
    }
}
