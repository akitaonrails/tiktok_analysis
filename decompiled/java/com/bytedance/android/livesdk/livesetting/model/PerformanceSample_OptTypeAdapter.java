package com.bytedance.android.livesdk.livesetting.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes35.dex */
public final class PerformanceSample_OptTypeAdapter extends TypeAdapter<PerformanceSample> {
    public final Gson LIZ;

    public PerformanceSample_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final PerformanceSample read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PerformanceSample performanceSample = new PerformanceSample();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1611918519:
                        if (strLJJJJ.equals("live_performance_host_cpu_sample_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                performanceSample.hostCpuSampleRate = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -850121051:
                        if (strLJJJJ.equals("live_performance_audience_cpu_sample_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                performanceSample.audienceCpuSampleRate = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -164571284:
                        if (strLJJJJ.equals("live_performance_auidence_opt_experiment")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                performanceSample.isAudienceExperiment = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -102867978:
                        if (strLJJJJ.equals("live_performance_host_mem_sample_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                performanceSample.hostMemSampleRate = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 658929490:
                        if (strLJJJJ.equals("live_performance_audience_mem_sample_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                performanceSample.audienceMemSampleRate = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 866398878:
                        if (strLJJJJ.equals("live_performance_host_opt_experiment")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                performanceSample.isHostExperiment = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 885118889:
                        if (strLJJJJ.equals("live_performance_audience_gpu_sample_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                performanceSample.audienceGpuSampleRate = c09cu.LJJIZ();
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
        return performanceSample;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PerformanceSample performanceSample) throws IOException {
        PerformanceSample performanceSample2 = performanceSample;
        if (performanceSample2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_performance_auidence_opt_experiment");
        c09dl.LJJJJJL(performanceSample2.isAudienceExperiment);
        c09dl.LJIILLIIL("live_performance_audience_cpu_sample_rate");
        c09dl.LJJJJ(Integer.valueOf(performanceSample2.audienceCpuSampleRate));
        c09dl.LJIILLIIL("live_performance_audience_gpu_sample_rate");
        c09dl.LJJJJ(Integer.valueOf(performanceSample2.audienceGpuSampleRate));
        c09dl.LJIILLIIL("live_performance_audience_mem_sample_rate");
        c09dl.LJJJJ(Integer.valueOf(performanceSample2.audienceMemSampleRate));
        c09dl.LJIILLIIL("live_performance_host_opt_experiment");
        c09dl.LJJJJJL(performanceSample2.isHostExperiment);
        c09dl.LJIILLIIL("live_performance_host_cpu_sample_rate");
        c09dl.LJJJJ(Integer.valueOf(performanceSample2.hostCpuSampleRate));
        c09dl.LJIILLIIL("live_performance_host_mem_sample_rate");
        c09dl.LJJJJ(Integer.valueOf(performanceSample2.hostMemSampleRate));
        c09dl.LJII();
    }
}
