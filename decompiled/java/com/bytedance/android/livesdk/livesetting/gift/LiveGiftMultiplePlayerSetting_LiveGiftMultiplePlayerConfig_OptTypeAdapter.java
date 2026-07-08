package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1697810uHb;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftMultiplePlayerSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftMultiplePlayerSetting_LiveGiftMultiplePlayerConfig_OptTypeAdapter extends TypeAdapter<LiveGiftMultiplePlayerSetting.LiveGiftMultiplePlayerConfig> {
    public final Gson LIZ;

    public LiveGiftMultiplePlayerSetting_LiveGiftMultiplePlayerConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveGiftMultiplePlayerSetting.LiveGiftMultiplePlayerConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGiftMultiplePlayerSetting.LiveGiftMultiplePlayerConfig liveGiftMultiplePlayerConfig = new LiveGiftMultiplePlayerSetting.LiveGiftMultiplePlayerConfig(true, false, false, 2, 50, "assets_batch", C1697810uHb.LJIIJJI("h264", "480p"));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2125641763:
                        if (strLJJJJ.equals("player_preload_threshold_percent")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftMultiplePlayerConfig.playerPreloadThresholdPercent = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1011946118:
                        if (strLJJJJ.equals("player_version")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftMultiplePlayerConfig.playerVersion = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -834809288:
                        if (strLJJJJ.equals("is_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftMultiplePlayerConfig.isEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -308591957:
                        if (strLJJJJ.equals("support_video_format")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftMultiplePlayerConfig.supportVideoFormats = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -621235:
                        if (strLJJJJ.equals("is_enable_player_log")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftMultiplePlayerConfig.isEnablePlayerLog = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1363371057:
                        if (strLJJJJ.equals("batch_resources_cache_dir")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftMultiplePlayerConfig.batchResourcesCacheDir = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1631054886:
                        if (strLJJJJ.equals("is_enable_mock_videos")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftMultiplePlayerConfig.isEnableMockVideos = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveGiftMultiplePlayerConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGiftMultiplePlayerSetting.LiveGiftMultiplePlayerConfig liveGiftMultiplePlayerConfig) throws IOException {
        LiveGiftMultiplePlayerSetting.LiveGiftMultiplePlayerConfig liveGiftMultiplePlayerConfig2 = liveGiftMultiplePlayerConfig;
        if (liveGiftMultiplePlayerConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enable");
        c09dl.LJJJJJL(liveGiftMultiplePlayerConfig2.isEnable);
        c09dl.LJIILLIIL("is_enable_player_log");
        c09dl.LJJJJJL(liveGiftMultiplePlayerConfig2.isEnablePlayerLog);
        c09dl.LJIILLIIL("is_enable_mock_videos");
        c09dl.LJJJJJL(liveGiftMultiplePlayerConfig2.isEnableMockVideos);
        c09dl.LJIILLIIL("player_version");
        c09dl.LJJJJ(Integer.valueOf(liveGiftMultiplePlayerConfig2.playerVersion));
        c09dl.LJIILLIIL("player_preload_threshold_percent");
        c09dl.LJJJJ(Integer.valueOf(liveGiftMultiplePlayerConfig2.playerPreloadThresholdPercent));
        c09dl.LJIILLIIL("batch_resources_cache_dir");
        c09dl.LJJJJJ(liveGiftMultiplePlayerConfig2.batchResourcesCacheDir);
        c09dl.LJIILLIIL("support_video_format");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveGiftMultiplePlayerConfig2.supportVideoFormats, String.class);
        c09dl.LJII();
    }
}
