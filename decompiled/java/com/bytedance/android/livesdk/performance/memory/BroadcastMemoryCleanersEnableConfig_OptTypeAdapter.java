package com.bytedance.android.livesdk.performance.memory;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public final class BroadcastMemoryCleanersEnableConfig_OptTypeAdapter extends TypeAdapter<BroadcastMemoryCleanersEnableConfig> {
    public final Gson LIZ;

    public BroadcastMemoryCleanersEnableConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final BroadcastMemoryCleanersEnableConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        BroadcastMemoryCleanersEnableConfig broadcastMemoryCleanersEnableConfig = new BroadcastMemoryCleanersEnableConfig(false, 0, false, 0, 0, 0, false, 0, 0, 0, 0, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -850209739:
                        if (strLJJJJ.equals("enable_notify_mem_relief")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                broadcastMemoryCleanersEnableConfig.setEnableNotifyMemRelief(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -790275679:
                        if (strLJJJJ.equals("enable_preload_after_live")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                broadcastMemoryCleanersEnableConfig.setEnablePreloadAfterLive(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -172525017:
                        if (strLJJJJ.equals("enable_clear_camera_filter_cache")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                broadcastMemoryCleanersEnableConfig.setEnableClearCameraFilterCache(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -131743537:
                        if (strLJJJJ.equals("clear_effect_channel_cache_level")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                broadcastMemoryCleanersEnableConfig.setClearEffectChannelCacheLevel(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 94452573:
                        if (strLJJJJ.equals("enable_clear_live_center_cache")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                broadcastMemoryCleanersEnableConfig.setEnableClearLiveCenterCache(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 198167707:
                        if (strLJJJJ.equals("clear_effect_aes_cache_level")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                broadcastMemoryCleanersEnableConfig.setClearEffectAesCacheLevel(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 348896295:
                        if (strLJJJJ.equals("enable_clear_multi_guest_cache")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                broadcastMemoryCleanersEnableConfig.setEnableClearMultiGuestCache(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 492184753:
                        if (strLJJJJ.equals("enable_finish_non_essential_pages")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                broadcastMemoryCleanersEnableConfig.setEnableFinishNonEssentialPages(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 863396924:
                        if (strLJJJJ.equals("clear_model_config_arbiter_cache_level")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                broadcastMemoryCleanersEnableConfig.setClearModelConfigArbiterCacheLevel(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 864053642:
                        if (strLJJJJ.equals("enable_clear_net_data_pipeline_cache")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                broadcastMemoryCleanersEnableConfig.setEnableClearNetDataPipelineCache(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1471602379:
                        if (strLJJJJ.equals("clear_sticker_view_model_cache_level")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                broadcastMemoryCleanersEnableConfig.setClearStickerViewModelCacheLevel(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1512531737:
                        if (strLJJJJ.equals("enable_clear_search_cache")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                broadcastMemoryCleanersEnableConfig.setEnableClearSearchCache(c09cu.LJJIZ());
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
        return broadcastMemoryCleanersEnableConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BroadcastMemoryCleanersEnableConfig broadcastMemoryCleanersEnableConfig) throws IOException {
        BroadcastMemoryCleanersEnableConfig broadcastMemoryCleanersEnableConfig2 = broadcastMemoryCleanersEnableConfig;
        if (broadcastMemoryCleanersEnableConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_clear_camera_filter_cache");
        c09dl.LJJJJJL(broadcastMemoryCleanersEnableConfig2.getEnableClearCameraFilterCache());
        c09dl.LJIILLIIL("enable_clear_net_data_pipeline_cache");
        c09dl.LJJJJ(Integer.valueOf(broadcastMemoryCleanersEnableConfig2.getEnableClearNetDataPipelineCache()));
        c09dl.LJIILLIIL("enable_finish_non_essential_pages");
        c09dl.LJJJJJL(broadcastMemoryCleanersEnableConfig2.getEnableFinishNonEssentialPages());
        c09dl.LJIILLIIL("enable_notify_mem_relief");
        c09dl.LJJJJ(Integer.valueOf(broadcastMemoryCleanersEnableConfig2.getEnableNotifyMemRelief()));
        c09dl.LJIILLIIL("enable_clear_search_cache");
        c09dl.LJJJJ(Integer.valueOf(broadcastMemoryCleanersEnableConfig2.getEnableClearSearchCache()));
        c09dl.LJIILLIIL("enable_clear_multi_guest_cache");
        c09dl.LJJJJ(Integer.valueOf(broadcastMemoryCleanersEnableConfig2.getEnableClearMultiGuestCache()));
        c09dl.LJIILLIIL("enable_preload_after_live");
        c09dl.LJJJJJL(broadcastMemoryCleanersEnableConfig2.getEnablePreloadAfterLive());
        c09dl.LJIILLIIL("clear_effect_aes_cache_level");
        c09dl.LJJJJ(Integer.valueOf(broadcastMemoryCleanersEnableConfig2.getClearEffectAesCacheLevel()));
        c09dl.LJIILLIIL("clear_model_config_arbiter_cache_level");
        c09dl.LJJJJ(Integer.valueOf(broadcastMemoryCleanersEnableConfig2.getClearModelConfigArbiterCacheLevel()));
        c09dl.LJIILLIIL("clear_effect_channel_cache_level");
        c09dl.LJJJJ(Integer.valueOf(broadcastMemoryCleanersEnableConfig2.getClearEffectChannelCacheLevel()));
        c09dl.LJIILLIIL("clear_sticker_view_model_cache_level");
        c09dl.LJJJJ(Integer.valueOf(broadcastMemoryCleanersEnableConfig2.getClearStickerViewModelCacheLevel()));
        c09dl.LJIILLIIL("enable_clear_live_center_cache");
        c09dl.LJJJJJL(broadcastMemoryCleanersEnableConfig2.getEnableClearLiveCenterCache());
        c09dl.LJII();
    }
}
