package com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class PreloadActionConfig_OptTypeAdapter extends TypeAdapter<PreloadActionConfig> {
    public final Gson LIZ;

    public PreloadActionConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final PreloadActionConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PreloadActionConfig preloadActionConfig = new PreloadActionConfig(0, "", "", "", "", "", 0, Boolean.FALSE, 0, 1, "", Boolean.FALSE, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1601816882:
                        if (strLJJJJ.equals("expired_second")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadActionConfig.expiredSecond = Integer.valueOf(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1141690108:
                        if (strLJJJJ.equals("access_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadActionConfig.accessKey = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -907987547:
                        if (strLJJJJ.equals("scheme")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadActionConfig.scheme = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -810883302:
                        if (strLJJJJ.equals("volume")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadActionConfig.volume = Integer.valueOf(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -129771418:
                        if (strLJJJJ.equals("force_fetch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadActionConfig.forceFetch = (Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -97285837:
                        if (strLJJJJ.equals("biz_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadActionConfig.bizKey = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 162945678:
                        if (strLJJJJ.equals("pending_load")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadActionConfig.pendingLoad = (Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 514400689:
                        if (strLJJJJ.equals("cache_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadActionConfig.cacheDuration = Integer.valueOf(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 661782568:
                        if (strLJJJJ.equals("action_combine_value")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadActionConfig.actionCombineValue = Integer.valueOf(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 738950403:
                        if (strLJJJJ.equals("channel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadActionConfig.channel = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 967303978:
                        if (strLJJJJ.equals("api_path")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadActionConfig.apiPath = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1134923833:
                        if (strLJJJJ.equals("scheme_unique_path")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadActionConfig.schemeUniquePath = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1247839575:
                        if (strLJJJJ.equals("enable_pending_js_task")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadActionConfig.enablePendingJsTask = Integer.valueOf(c09cu.LJJIZ());
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
        return preloadActionConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PreloadActionConfig preloadActionConfig) {
        PreloadActionConfig preloadActionConfig2 = preloadActionConfig;
        if (preloadActionConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("action_combine_value");
        c09dl.LJJJJ(preloadActionConfig2.actionCombineValue);
        c09dl.LJIILLIIL("access_key");
        c09dl.LJJJJJ(preloadActionConfig2.accessKey);
        c09dl.LJIILLIIL("channel");
        c09dl.LJJJJJ(preloadActionConfig2.channel);
        c09dl.LJIILLIIL("biz_key");
        c09dl.LJJJJJ(preloadActionConfig2.bizKey);
        c09dl.LJIILLIIL("scheme");
        c09dl.LJJJJJ(preloadActionConfig2.scheme);
        c09dl.LJIILLIIL("scheme_unique_path");
        c09dl.LJJJJJ(preloadActionConfig2.schemeUniquePath);
        c09dl.LJIILLIIL("expired_second");
        c09dl.LJJJJ(preloadActionConfig2.expiredSecond);
        c09dl.LJIILLIIL("pending_load");
        c09dl.LJJJ(preloadActionConfig2.pendingLoad);
        c09dl.LJIILLIIL("enable_pending_js_task");
        c09dl.LJJJJ(preloadActionConfig2.enablePendingJsTask);
        c09dl.LJIILLIIL("volume");
        c09dl.LJJJJ(preloadActionConfig2.volume);
        c09dl.LJIILLIIL("api_path");
        c09dl.LJJJJJ(preloadActionConfig2.apiPath);
        c09dl.LJIILLIIL("force_fetch");
        c09dl.LJJJ(preloadActionConfig2.forceFetch);
        c09dl.LJIILLIIL("cache_duration");
        c09dl.LJJJJ(preloadActionConfig2.cacheDuration);
        c09dl.LJII();
    }
}
