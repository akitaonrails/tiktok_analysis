package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftReceivingRefactorSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftReceivingRefactorSetting_LiveGiftReceivingRefactorConfig_OptTypeAdapter extends TypeAdapter<LiveGiftReceivingRefactorSetting.LiveGiftReceivingRefactorConfig> {
    public final Gson LIZ;

    public LiveGiftReceivingRefactorSetting_LiveGiftReceivingRefactorConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveGiftReceivingRefactorSetting.LiveGiftReceivingRefactorConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGiftReceivingRefactorSetting.LiveGiftReceivingRefactorConfig liveGiftReceivingRefactorConfig = new LiveGiftReceivingRefactorSetting.LiveGiftReceivingRefactorConfig(false, true, true, true, true, true, true, true, true, true, 800, 400, 200L, 100);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2084272637:
                        if (strLJJJJ.equals("is_force_update_asset")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftReceivingRefactorConfig.isForceUpdateAsset = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1895334827:
                        if (strLJJJJ.equals("insertion_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftReceivingRefactorConfig.insertionInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1731979905:
                        if (strLJJJJ.equals("is_opt_bundle_assets")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftReceivingRefactorConfig.isOptBundleAssets = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1609323015:
                        if (strLJJJJ.equals("is_async_queue")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftReceivingRefactorConfig.isAsyncQueue = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -954756718:
                        if (strLJJJJ.equals("max_sticker_render_length")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftReceivingRefactorConfig.maxStickerRenderLength = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -834809288:
                        if (strLJJJJ.equals("is_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftReceivingRefactorConfig.isEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -454203150:
                        if (strLJJJJ.equals("is_opt_direct_show")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftReceivingRefactorConfig.isOptDirectShow = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -357680240:
                        if (strLJJJJ.equals("is_cache_thread_safe")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftReceivingRefactorConfig.isCacheThreadSafe = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -324008199:
                        if (strLJJJJ.equals("is_widget")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftReceivingRefactorConfig.isEnableWidget = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -298428998:
                        if (strLJJJJ.equals("max_music_render_length")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftReceivingRefactorConfig.maxMusicRenderLength = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -288744950:
                        if (strLJJJJ.equals("low_price_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftReceivingRefactorConfig.lowPriceThreshold = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 122913212:
                        if (strLJJJJ.equals("is_queue")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftReceivingRefactorConfig.isEnableQueue = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 766974322:
                        if (strLJJJJ.equals("is_opt_badge_process")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftReceivingRefactorConfig.isOptBadgeProcess = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 801187273:
                        if (strLJJJJ.equals("is_opt_combo_end")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftReceivingRefactorConfig.isOptComboEnd = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveGiftReceivingRefactorConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGiftReceivingRefactorSetting.LiveGiftReceivingRefactorConfig liveGiftReceivingRefactorConfig) throws IOException {
        LiveGiftReceivingRefactorSetting.LiveGiftReceivingRefactorConfig liveGiftReceivingRefactorConfig2 = liveGiftReceivingRefactorConfig;
        if (liveGiftReceivingRefactorConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enable");
        c09dl.LJJJJJL(liveGiftReceivingRefactorConfig2.isEnable);
        c09dl.LJIILLIIL("is_widget");
        c09dl.LJJJJJL(liveGiftReceivingRefactorConfig2.isEnableWidget);
        c09dl.LJIILLIIL("is_queue");
        c09dl.LJJJJJL(liveGiftReceivingRefactorConfig2.isEnableQueue);
        c09dl.LJIILLIIL("is_cache_thread_safe");
        c09dl.LJJJJJL(liveGiftReceivingRefactorConfig2.isCacheThreadSafe);
        c09dl.LJIILLIIL("is_opt_bundle_assets");
        c09dl.LJJJJJL(liveGiftReceivingRefactorConfig2.isOptBundleAssets);
        c09dl.LJIILLIIL("is_opt_badge_process");
        c09dl.LJJJJJL(liveGiftReceivingRefactorConfig2.isOptBadgeProcess);
        c09dl.LJIILLIIL("is_opt_direct_show");
        c09dl.LJJJJJL(liveGiftReceivingRefactorConfig2.isOptDirectShow);
        c09dl.LJIILLIIL("is_opt_combo_end");
        c09dl.LJJJJJL(liveGiftReceivingRefactorConfig2.isOptComboEnd);
        c09dl.LJIILLIIL("is_async_queue");
        c09dl.LJJJJJL(liveGiftReceivingRefactorConfig2.isAsyncQueue);
        c09dl.LJIILLIIL("is_force_update_asset");
        c09dl.LJJJJJL(liveGiftReceivingRefactorConfig2.isForceUpdateAsset);
        c09dl.LJIILLIIL("max_sticker_render_length");
        c09dl.LJJJJ(Integer.valueOf(liveGiftReceivingRefactorConfig2.maxStickerRenderLength));
        c09dl.LJIILLIIL("max_music_render_length");
        c09dl.LJJJJ(Integer.valueOf(liveGiftReceivingRefactorConfig2.maxMusicRenderLength));
        c09dl.LJIILLIIL("insertion_interval");
        c09dl.LJJIZ(liveGiftReceivingRefactorConfig2.insertionInterval);
        c09dl.LJIILLIIL("low_price_threshold");
        c09dl.LJJJJ(Integer.valueOf(liveGiftReceivingRefactorConfig2.lowPriceThreshold));
        c09dl.LJII();
    }
}
