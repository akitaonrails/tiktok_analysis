package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes33.dex */
public final class LivePitayaTaskFrequentControlManager_OptTypeAdapter extends TypeAdapter<LivePitayaTaskFrequentControlManager> {
    public final Gson LIZ;

    public LivePitayaTaskFrequentControlManager_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LivePitayaTaskFrequentControlManager read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePitayaTaskFrequentControlManager livePitayaTaskFrequentControlManager = new LivePitayaTaskFrequentControlManager(false, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1023, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1458784405:
                        if (strLJJJJ.equals("enable_frequent_control_white_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePitayaTaskFrequentControlManager.enableFrequentControlWhiteList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1397834929:
                        if (strLJJJJ.equals("fps_limit_anchor")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePitayaTaskFrequentControlManager.fpsLimitAnchor = c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -244045595:
                        if (strLJJJJ.equals("fps_limit")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePitayaTaskFrequentControlManager.fpsLimit = c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -40648276:
                        if (strLJJJJ.equals("cpu_speed_limit")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePitayaTaskFrequentControlManager.cpuSpeedLimit = c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 39716008:
                        if (strLJJJJ.equals("cpu_speed_limit_anchor")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePitayaTaskFrequentControlManager.cpuSpeedLimitAnchor = c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 115773075:
                        if (strLJJJJ.equals("cpu_rate_limit")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePitayaTaskFrequentControlManager.cpuRateLimit = c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 287732279:
                        if (strLJJJJ.equals("memory_limit_anchor")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePitayaTaskFrequentControlManager.memoryLimitAnchor = c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1003930664:
                        if (strLJJJJ.equals("enable_frequent_control")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePitayaTaskFrequentControlManager.enableFrequentControl = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1025959677:
                        if (strLJJJJ.equals("memory_limit")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePitayaTaskFrequentControlManager.memoryLimit = c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1690121697:
                        if (strLJJJJ.equals("cpu_rate_limit_anchor")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePitayaTaskFrequentControlManager.cpuRateLimitAnchor = c09cu.LJJIL();
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
        return livePitayaTaskFrequentControlManager;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePitayaTaskFrequentControlManager livePitayaTaskFrequentControlManager) throws IOException {
        LivePitayaTaskFrequentControlManager livePitayaTaskFrequentControlManager2 = livePitayaTaskFrequentControlManager;
        if (livePitayaTaskFrequentControlManager2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_frequent_control");
        c09dl.LJJJJJL(livePitayaTaskFrequentControlManager2.enableFrequentControl);
        c09dl.LJIILLIIL("enable_frequent_control_white_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, livePitayaTaskFrequentControlManager2.enableFrequentControlWhiteList, String.class);
        c09dl.LJIILLIIL("fps_limit");
        c09dl.LJJIL(livePitayaTaskFrequentControlManager2.fpsLimit);
        c09dl.LJIILLIIL("cpu_rate_limit");
        c09dl.LJJIL(livePitayaTaskFrequentControlManager2.cpuRateLimit);
        c09dl.LJIILLIIL("cpu_speed_limit");
        c09dl.LJJIL(livePitayaTaskFrequentControlManager2.cpuSpeedLimit);
        c09dl.LJIILLIIL("memory_limit");
        c09dl.LJJIL(livePitayaTaskFrequentControlManager2.memoryLimit);
        c09dl.LJIILLIIL("fps_limit_anchor");
        c09dl.LJJIL(livePitayaTaskFrequentControlManager2.fpsLimitAnchor);
        c09dl.LJIILLIIL("cpu_rate_limit_anchor");
        c09dl.LJJIL(livePitayaTaskFrequentControlManager2.cpuRateLimitAnchor);
        c09dl.LJIILLIIL("cpu_speed_limit_anchor");
        c09dl.LJJIL(livePitayaTaskFrequentControlManager2.cpuSpeedLimitAnchor);
        c09dl.LJIILLIIL("memory_limit_anchor");
        c09dl.LJJIL(livePitayaTaskFrequentControlManager2.memoryLimitAnchor);
        c09dl.LJII();
    }
}
