package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class BlackCheckConfig_OptTypeAdapter extends TypeAdapter<BlackCheckConfig> {
    public final Gson LIZ;

    public BlackCheckConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final BlackCheckConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        BlackCheckConfig blackCheckConfig = new BlackCheckConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1731213569:
                        if (strLJJJJ.equals("device_lag_fps_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                blackCheckConfig.setDeviceLagFpsThreshold(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                blackCheckConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1248645207:
                        if (strLJJJJ.equals("permission_bitrate_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                blackCheckConfig.setPermissionBitrateThreshold(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1044935374:
                        if (strLJJJJ.equals("capture_black_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                blackCheckConfig.setCaptureBlackThreshold(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -919279834:
                        if (strLJJJJ.equals("device_lag_fps_sample_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                blackCheckConfig.setDeviceLagFpsSampleCounts(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -832926038:
                        if (strLJJJJ.equals("permission_sample_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                blackCheckConfig.setPermissionSampleCounts(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -311164514:
                        if (strLJJJJ.equals("permission_unexpected_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                blackCheckConfig.setPermissionUnexpectedRate((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -191690846:
                        if (strLJJJJ.equals("device_lag_fps_unexpected_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                blackCheckConfig.setDeviceLagFpsUnexpectedRate((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -49901549:
                        if (strLJJJJ.equals("capture_black_sample_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                blackCheckConfig.setCaptureBlackSampleCounts(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 804002709:
                        if (strLJJJJ.equals("capture_black_unexpected_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                blackCheckConfig.setCaptureBlackUnexpectedRate((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1655561765:
                        if (strLJJJJ.equals("permission_fps_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                blackCheckConfig.setPermissionFpsThreshold(c09cu.LJJIZ());
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
        return blackCheckConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BlackCheckConfig blackCheckConfig) throws IOException {
        BlackCheckConfig blackCheckConfig2 = blackCheckConfig;
        if (blackCheckConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(blackCheckConfig2.getEnable());
        c09dl.LJIILLIIL("device_lag_fps_unexpected_rate");
        c09dl.LJJJJ(Float.valueOf(blackCheckConfig2.getDeviceLagFpsUnexpectedRate()));
        c09dl.LJIILLIIL("device_lag_fps_sample_count");
        c09dl.LJJJJ(Integer.valueOf(blackCheckConfig2.getDeviceLagFpsSampleCounts()));
        c09dl.LJIILLIIL("device_lag_fps_threshold");
        c09dl.LJJJJ(Integer.valueOf(blackCheckConfig2.getDeviceLagFpsThreshold()));
        c09dl.LJIILLIIL("permission_unexpected_rate");
        c09dl.LJJJJ(Float.valueOf(blackCheckConfig2.getPermissionUnexpectedRate()));
        c09dl.LJIILLIIL("permission_sample_count");
        c09dl.LJJJJ(Integer.valueOf(blackCheckConfig2.getPermissionSampleCounts()));
        c09dl.LJIILLIIL("permission_fps_threshold");
        c09dl.LJJJJ(Integer.valueOf(blackCheckConfig2.getPermissionFpsThreshold()));
        c09dl.LJIILLIIL("permission_bitrate_threshold");
        c09dl.LJJIZ(blackCheckConfig2.getPermissionBitrateThreshold());
        c09dl.LJIILLIIL("capture_black_unexpected_rate");
        c09dl.LJJJJ(Float.valueOf(blackCheckConfig2.getCaptureBlackUnexpectedRate()));
        c09dl.LJIILLIIL("capture_black_sample_count");
        c09dl.LJJJJ(Integer.valueOf(blackCheckConfig2.getCaptureBlackSampleCounts()));
        c09dl.LJIILLIIL("capture_black_threshold");
        c09dl.LJJIZ(blackCheckConfig2.getCaptureBlackThreshold());
        c09dl.LJII();
    }
}
