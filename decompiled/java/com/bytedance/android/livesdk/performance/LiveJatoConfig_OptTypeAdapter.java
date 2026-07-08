package com.bytedance.android.livesdk.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveJatoConfig_OptTypeAdapter extends TypeAdapter<LiveJatoConfig> {
    public final Gson LIZ;

    public LiveJatoConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveJatoConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveJatoConfig liveJatoConfig = new LiveJatoConfig(false, false, false, false, false, false, false, false, false, 3, Mp4ScreenVideoLoadTimeout.CONTROL);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveJatoConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1238234410:
                        if (strLJJJJ.equals("cpu_boost_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveJatoConfig.setCpuBoostEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1062756768:
                        if (strLJJJJ.equals("live_page_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveJatoConfig.setLivePageEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -129755816:
                        if (strLJJJJ.equals("thread_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveJatoConfig.setThreadEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 254257775:
                        if (strLJJJJ.equals("render_thread_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveJatoConfig.setRenderThreadEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 517701921:
                        if (strLJJJJ.equals("bind_core_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveJatoConfig.setBindCoreEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 664938054:
                        if (strLJJJJ.equals("gc_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveJatoConfig.setGcEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1412721364:
                        if (strLJJJJ.equals("duration_seconds")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveJatoConfig.setDurationSeconds(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1516762985:
                        if (strLJJJJ.equals("live_preview_page_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveJatoConfig.setLivePreviewPageEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1552405997:
                        if (strLJJJJ.equals("jit_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveJatoConfig.setJitEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1810215530:
                        if (strLJJJJ.equals("debounce_interval_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveJatoConfig.setDebounceIntervalMs(c09cu.LJJJ());
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
        return liveJatoConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveJatoConfig liveJatoConfig) throws IOException {
        LiveJatoConfig liveJatoConfig2 = liveJatoConfig;
        if (liveJatoConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveJatoConfig2.getEnable());
        c09dl.LJIILLIIL("live_preview_page_enable");
        c09dl.LJJJJJL(liveJatoConfig2.getLivePreviewPageEnable());
        c09dl.LJIILLIIL("live_page_enable");
        c09dl.LJJJJJL(liveJatoConfig2.getLivePageEnable());
        c09dl.LJIILLIIL("gc_enable");
        c09dl.LJJJJJL(liveJatoConfig2.getGcEnable());
        c09dl.LJIILLIIL("jit_enable");
        c09dl.LJJJJJL(liveJatoConfig2.getJitEnable());
        c09dl.LJIILLIIL("cpu_boost_enable");
        c09dl.LJJJJJL(liveJatoConfig2.getCpuBoostEnable());
        c09dl.LJIILLIIL("bind_core_enable");
        c09dl.LJJJJJL(liveJatoConfig2.getBindCoreEnable());
        c09dl.LJIILLIIL("render_thread_enable");
        c09dl.LJJJJJL(liveJatoConfig2.getRenderThreadEnable());
        c09dl.LJIILLIIL("thread_enable");
        c09dl.LJJJJJL(liveJatoConfig2.getThreadEnable());
        c09dl.LJIILLIIL("duration_seconds");
        c09dl.LJJJJ(Integer.valueOf(liveJatoConfig2.getDurationSeconds()));
        c09dl.LJIILLIIL("debounce_interval_ms");
        c09dl.LJJIZ(liveJatoConfig2.getDebounceIntervalMs());
        c09dl.LJII();
    }
}
