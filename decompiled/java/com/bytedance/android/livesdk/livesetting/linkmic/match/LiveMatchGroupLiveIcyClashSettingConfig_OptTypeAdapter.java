package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMatchGroupLiveIcyClashSettingConfig_OptTypeAdapter extends TypeAdapter<LiveMatchGroupLiveIcyClashSettingConfig> {
    public final Gson LIZ;

    public LiveMatchGroupLiveIcyClashSettingConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveMatchGroupLiveIcyClashSettingConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMatchGroupLiveIcyClashSettingConfig liveMatchGroupLiveIcyClashSettingConfig = new LiveMatchGroupLiveIcyClashSettingConfig(true, 0.75f, "aweme://roma_redirect/?spark_page=match_icy_clash_educate", "sslocal://webcast_lynxview?url=https%3A%2F%2Fsf-teko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-internal-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_match_icy_effect%2Fmain%2Ftemplate.js&enable_canvas=1&use_v8=1&enable_dynamic_v8=1");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchGroupLiveIcyClashSettingConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1443645528:
                        if (strLJJJJ.equals("education_url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchGroupLiveIcyClashSettingConfig.education_url = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1716157889:
                        if (strLJJJJ.equals("effect_url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchGroupLiveIcyClashSettingConfig.effect_url = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1880702605:
                        if (strLJJJJ.equals("effect_screen_height_percentage")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchGroupLiveIcyClashSettingConfig.effect_screen_height_percentage = (float) c09cu.LJJIL();
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
        return liveMatchGroupLiveIcyClashSettingConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchGroupLiveIcyClashSettingConfig liveMatchGroupLiveIcyClashSettingConfig) throws IOException {
        LiveMatchGroupLiveIcyClashSettingConfig liveMatchGroupLiveIcyClashSettingConfig2 = liveMatchGroupLiveIcyClashSettingConfig;
        if (liveMatchGroupLiveIcyClashSettingConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveMatchGroupLiveIcyClashSettingConfig2.enable);
        c09dl.LJIILLIIL("effect_screen_height_percentage");
        c09dl.LJJJJ(Float.valueOf(liveMatchGroupLiveIcyClashSettingConfig2.effect_screen_height_percentage));
        c09dl.LJIILLIIL("education_url");
        c09dl.LJJJJJ(liveMatchGroupLiveIcyClashSettingConfig2.education_url);
        c09dl.LJIILLIIL("effect_url");
        c09dl.LJJJJJ(liveMatchGroupLiveIcyClashSettingConfig2.effect_url);
        c09dl.LJII();
    }
}
