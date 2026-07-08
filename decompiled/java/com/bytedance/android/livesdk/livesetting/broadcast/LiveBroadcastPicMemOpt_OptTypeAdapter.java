package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class LiveBroadcastPicMemOpt_OptTypeAdapter extends TypeAdapter<LiveBroadcastPicMemOpt> {
    public final Gson LIZ;

    public LiveBroadcastPicMemOpt_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveBroadcastPicMemOpt read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveBroadcastPicMemOpt liveBroadcastPicMemOpt = new LiveBroadcastPicMemOpt();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1646867447:
                        if (strLJJJJ.equals("delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBroadcastPicMemOpt.delayTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBroadcastPicMemOpt.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1296262992:
                        if (strLJJJJ.equals("fit_sticker_panel_image_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBroadcastPicMemOpt.fitStickerPanelImageSize = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1139879802:
                        if (strLJJJJ.equals("opt_gecko_webp_animation_cache")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBroadcastPicMemOpt.optGeckoWebPAnimationCache = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 162966732:
                        if (strLJJJJ.equals("fit_effect_panel_icon_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBroadcastPicMemOpt.fitEffectPanelIconSize = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 567688822:
                        if (strLJJJJ.equals("fresco_load_pic_enable_insample")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBroadcastPicMemOpt.frescoLoadPicEnableInSample = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1668908288:
                        if (strLJJJJ.equals("forbid_preload_invalid_gecko")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBroadcastPicMemOpt.forbidPreloadInvalidGecko = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveBroadcastPicMemOpt;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveBroadcastPicMemOpt liveBroadcastPicMemOpt) throws IOException {
        LiveBroadcastPicMemOpt liveBroadcastPicMemOpt2 = liveBroadcastPicMemOpt;
        if (liveBroadcastPicMemOpt2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveBroadcastPicMemOpt2.enable);
        c09dl.LJIILLIIL("fit_effect_panel_icon_size");
        c09dl.LJJJJJL(liveBroadcastPicMemOpt2.fitEffectPanelIconSize);
        c09dl.LJIILLIIL("fresco_load_pic_enable_insample");
        c09dl.LJJJJJL(liveBroadcastPicMemOpt2.frescoLoadPicEnableInSample);
        c09dl.LJIILLIIL("forbid_preload_invalid_gecko");
        c09dl.LJJJJJL(liveBroadcastPicMemOpt2.forbidPreloadInvalidGecko);
        c09dl.LJIILLIIL("fit_sticker_panel_image_size");
        c09dl.LJJJJJL(liveBroadcastPicMemOpt2.fitStickerPanelImageSize);
        c09dl.LJIILLIIL("opt_gecko_webp_animation_cache");
        c09dl.LJJJJJL(liveBroadcastPicMemOpt2.optGeckoWebPAnimationCache);
        c09dl.LJIILLIIL("delay_time");
        c09dl.LJJIZ(liveBroadcastPicMemOpt2.delayTime);
        c09dl.LJII();
    }
}
