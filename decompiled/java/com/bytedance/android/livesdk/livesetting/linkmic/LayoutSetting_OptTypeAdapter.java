package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class LayoutSetting_OptTypeAdapter extends TypeAdapter<LayoutSetting> {
    public final Gson LIZ;

    public LayoutSetting_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LayoutSetting read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LayoutSetting layoutSetting = new LayoutSetting(false, false, true, false, true, true, true, true, true, true, true, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2056492328:
                        if (strLJJJJ.equals("opt_feed_leak")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                layoutSetting.optFeedLeak = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -2056167830:
                        if (strLJJJJ.equals("opt_feed_wava")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                layoutSetting.optFeedWave = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1961971114:
                        if (strLJJJJ.equals("user_follow_v2")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                layoutSetting.followV2 = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1010146991:
                        if (strLJJJJ.equals("opt_bg")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                layoutSetting.optBg = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -436085946:
                        if (strLJJJJ.equals("use_rust_mix_stream")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                layoutSetting.useRustMixStream = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -243219244:
                        if (strLJJJJ.equals("use_avatar_cache")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                layoutSetting.useAvatarCache = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -67270288:
                        if (strLJJJJ.equals("use_voice_wave_layer")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                layoutSetting.useVoiceWaveLayer = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 859522471:
                        if (strLJJJJ.equals("opt_preview_widget")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                layoutSetting.optPreviewWidget = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1067866328:
                        if (strLJJJJ.equals("opt_ab_params")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                layoutSetting.optAbParams = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1216339495:
                        if (strLJJJJ.equals("use_mask_cache")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                layoutSetting.useMaskCache = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1583080934:
                        if (strLJJJJ.equals("opt_not_match_guest")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                layoutSetting.optNotMatchGuest = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1652558951:
                        if (strLJJJJ.equals("opt_not_match_anchor")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                layoutSetting.optNotMatchAnchor = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return layoutSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LayoutSetting layoutSetting) throws IOException {
        LayoutSetting layoutSetting2 = layoutSetting;
        if (layoutSetting2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("use_voice_wave_layer");
        c09dl.LJJJJJL(layoutSetting2.useVoiceWaveLayer);
        c09dl.LJIILLIIL("use_mask_cache");
        c09dl.LJJJJJL(layoutSetting2.useMaskCache);
        c09dl.LJIILLIIL("use_avatar_cache");
        c09dl.LJJJJJL(layoutSetting2.useAvatarCache);
        c09dl.LJIILLIIL("opt_bg");
        c09dl.LJJJJJL(layoutSetting2.optBg);
        c09dl.LJIILLIIL("user_follow_v2");
        c09dl.LJJJJJL(layoutSetting2.followV2);
        c09dl.LJIILLIIL("opt_preview_widget");
        c09dl.LJJJJJL(layoutSetting2.optPreviewWidget);
        c09dl.LJIILLIIL("opt_ab_params");
        c09dl.LJJJJJL(layoutSetting2.optAbParams);
        c09dl.LJIILLIIL("opt_feed_leak");
        c09dl.LJJJJJL(layoutSetting2.optFeedLeak);
        c09dl.LJIILLIIL("opt_feed_wava");
        c09dl.LJJJJJL(layoutSetting2.optFeedWave);
        c09dl.LJIILLIIL("opt_not_match_anchor");
        c09dl.LJJJJJL(layoutSetting2.optNotMatchAnchor);
        c09dl.LJIILLIIL("opt_not_match_guest");
        c09dl.LJJJJJL(layoutSetting2.optNotMatchGuest);
        c09dl.LJIILLIIL("use_rust_mix_stream");
        c09dl.LJJJJJL(layoutSetting2.useRustMixStream);
        c09dl.LJII();
    }
}
