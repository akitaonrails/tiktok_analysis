package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class OptLiveDownloadResourceConfig_OptTypeAdapter extends TypeAdapter<OptLiveDownloadResourceConfig> {
    public final Gson LIZ;

    public OptLiveDownloadResourceConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final OptLiveDownloadResourceConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        OptLiveDownloadResourceConfig optLiveDownloadResourceConfig = new OptLiveDownloadResourceConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1473207774:
                        if (strLJJJJ.equals("enable_live_ep")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                optLiveDownloadResourceConfig.enableLiveEp = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                optLiveDownloadResourceConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -580529181:
                        if (strLJJJJ.equals("opt_filter_download")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                optLiveDownloadResourceConfig.enableOptFilterDownload = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -165863190:
                        if (strLJJJJ.equals("live_preload_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                optLiveDownloadResourceConfig.preloadSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -78249825:
                        if (strLJJJJ.equals("live_ep_cache_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                optLiveDownloadResourceConfig.cacheSize = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -37105645:
                        if (strLJJJJ.equals("used_effect_expired_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                optLiveDownloadResourceConfig.usedEffectExpiredTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 442790545:
                        if (strLJJJJ.equals("forbid_voice_preload")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                optLiveDownloadResourceConfig.forbidVoicePreload = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1283442944:
                        if (strLJJJJ.equals("enable_opt_sound_download")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                optLiveDownloadResourceConfig.enableOptSoundDownload = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return optLiveDownloadResourceConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, OptLiveDownloadResourceConfig optLiveDownloadResourceConfig) throws IOException {
        OptLiveDownloadResourceConfig optLiveDownloadResourceConfig2 = optLiveDownloadResourceConfig;
        if (optLiveDownloadResourceConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(optLiveDownloadResourceConfig2.enable);
        c09dl.LJIILLIIL("enable_live_ep");
        c09dl.LJJJJJL(optLiveDownloadResourceConfig2.enableLiveEp);
        c09dl.LJIILLIIL("live_ep_cache_size");
        c09dl.LJJIZ(optLiveDownloadResourceConfig2.cacheSize);
        c09dl.LJIILLIIL("live_preload_size");
        c09dl.LJJJJ(Integer.valueOf(optLiveDownloadResourceConfig2.preloadSize));
        c09dl.LJIILLIIL("forbid_voice_preload");
        c09dl.LJJJJJL(optLiveDownloadResourceConfig2.forbidVoicePreload);
        c09dl.LJIILLIIL("enable_opt_sound_download");
        c09dl.LJJJJJL(optLiveDownloadResourceConfig2.enableOptSoundDownload);
        c09dl.LJIILLIIL("opt_filter_download");
        c09dl.LJJJJJL(optLiveDownloadResourceConfig2.enableOptFilterDownload);
        c09dl.LJIILLIIL("used_effect_expired_time");
        c09dl.LJJIZ(optLiveDownloadResourceConfig2.usedEffectExpiredTime);
        c09dl.LJII();
    }
}
