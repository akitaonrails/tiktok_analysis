package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoPlayerPerfOptSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes35.dex */
public final class LiveGiftVideoPlayerPerfOptSetting_LiveGiftVideoRenderOptConfig_OptTypeAdapter extends TypeAdapter<LiveGiftVideoPlayerPerfOptSetting.LiveGiftVideoRenderOptConfig> {
    public final Gson LIZ;

    public LiveGiftVideoPlayerPerfOptSetting_LiveGiftVideoRenderOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveGiftVideoPlayerPerfOptSetting.LiveGiftVideoRenderOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGiftVideoPlayerPerfOptSetting.LiveGiftVideoRenderOptConfig liveGiftVideoRenderOptConfig = new LiveGiftVideoPlayerPerfOptSetting.LiveGiftVideoRenderOptConfig(false, false, false, false, false, false, false, false, 2, 5, 60, 30, 1, 1.5f, LSPassThroughRecordSizeConfig.DEFAULT, 10000, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1903138974:
                        if (strLJJJJ.equals("player_cache_expired_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftVideoRenderOptConfig.playerCacheExpiredTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1700902170:
                        if (strLJJJJ.equals("is_reorder")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftVideoRenderOptConfig.isEnableReorder = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1655369244:
                        if (strLJJJJ.equals("player_alive_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftVideoRenderOptConfig.playerAliveDuration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1615261556:
                        if (strLJJJJ.equals("use_concurrent_map")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftVideoRenderOptConfig.useConcurrentMap = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1577251347:
                        if (strLJJJJ.equals("is_preload_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftVideoRenderOptConfig.isEnablePreloadConfig = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1452342313:
                        if (strLJJJJ.equals("player_preload_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftVideoRenderOptConfig.playerPreloadThreshold = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1208212084:
                        if (strLJJJJ.equals("is_preload_player")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftVideoRenderOptConfig.isEnablePreloadPlayer = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -916004933:
                        if (strLJJJJ.equals("config_cache_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftVideoRenderOptConfig.configCacheSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -890753033:
                        if (strLJJJJ.equals("is_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftVideoRenderOptConfig.isEnableConfig = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -834809288:
                        if (strLJJJJ.equals("is_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftVideoRenderOptConfig.isEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -514441919:
                        if (strLJJJJ.equals("config_trim_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftVideoRenderOptConfig.configCacheTrimSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -470485860:
                        if (strLJJJJ.equals("is_replay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftVideoRenderOptConfig.isEnableReplay = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 11914517:
                        if (strLJJJJ.equals("player_preload_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftVideoRenderOptConfig.playerPreloadSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 188292796:
                        if (strLJJJJ.equals("player_cache_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftVideoRenderOptConfig.playerCacheSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 375370609:
                        if (strLJJJJ.equals("is_download_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftVideoRenderOptConfig.isEnableDownloadOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1059033256:
                        if (strLJJJJ.equals("player_preload_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftVideoRenderOptConfig.playerPreloadDuration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1777240536:
                        if (strLJJJJ.equals("is_multi_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftVideoRenderOptConfig.isEnableMultiOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveGiftVideoRenderOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGiftVideoPlayerPerfOptSetting.LiveGiftVideoRenderOptConfig liveGiftVideoRenderOptConfig) throws IOException {
        LiveGiftVideoPlayerPerfOptSetting.LiveGiftVideoRenderOptConfig liveGiftVideoRenderOptConfig2 = liveGiftVideoRenderOptConfig;
        if (liveGiftVideoRenderOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enable");
        c09dl.LJJJJJL(liveGiftVideoRenderOptConfig2.isEnable);
        c09dl.LJIILLIIL("is_replay");
        c09dl.LJJJJJL(liveGiftVideoRenderOptConfig2.isEnableReplay);
        c09dl.LJIILLIIL("is_preload_config");
        c09dl.LJJJJJL(liveGiftVideoRenderOptConfig2.isEnablePreloadConfig);
        c09dl.LJIILLIIL("is_preload_player");
        c09dl.LJJJJJL(liveGiftVideoRenderOptConfig2.isEnablePreloadPlayer);
        c09dl.LJIILLIIL("is_reorder");
        c09dl.LJJJJJL(liveGiftVideoRenderOptConfig2.isEnableReorder);
        c09dl.LJIILLIIL("is_multi_opt");
        c09dl.LJJJJJL(liveGiftVideoRenderOptConfig2.isEnableMultiOpt);
        c09dl.LJIILLIIL("is_config");
        c09dl.LJJJJJL(liveGiftVideoRenderOptConfig2.isEnableConfig);
        c09dl.LJIILLIIL("is_download_opt");
        c09dl.LJJJJJL(liveGiftVideoRenderOptConfig2.isEnableDownloadOpt);
        c09dl.LJIILLIIL("player_cache_size");
        c09dl.LJJJJ(Integer.valueOf(liveGiftVideoRenderOptConfig2.playerCacheSize));
        c09dl.LJIILLIIL("player_cache_expired_time");
        c09dl.LJJJJ(Integer.valueOf(liveGiftVideoRenderOptConfig2.playerCacheExpiredTime));
        c09dl.LJIILLIIL("config_cache_size");
        c09dl.LJJJJ(Integer.valueOf(liveGiftVideoRenderOptConfig2.configCacheSize));
        c09dl.LJIILLIIL("config_trim_size");
        c09dl.LJJJJ(Integer.valueOf(liveGiftVideoRenderOptConfig2.configCacheTrimSize));
        c09dl.LJIILLIIL("player_preload_size");
        c09dl.LJJJJ(Integer.valueOf(liveGiftVideoRenderOptConfig2.playerPreloadSize));
        c09dl.LJIILLIIL("player_preload_threshold");
        c09dl.LJJJJ(Float.valueOf(liveGiftVideoRenderOptConfig2.playerPreloadThreshold));
        c09dl.LJIILLIIL("player_preload_duration");
        c09dl.LJJJJ(Integer.valueOf(liveGiftVideoRenderOptConfig2.playerPreloadDuration));
        c09dl.LJIILLIIL("player_alive_duration");
        c09dl.LJJJJ(Integer.valueOf(liveGiftVideoRenderOptConfig2.playerAliveDuration));
        c09dl.LJIILLIIL("use_concurrent_map");
        c09dl.LJJJJJL(liveGiftVideoRenderOptConfig2.useConcurrentMap);
        c09dl.LJII();
    }
}
