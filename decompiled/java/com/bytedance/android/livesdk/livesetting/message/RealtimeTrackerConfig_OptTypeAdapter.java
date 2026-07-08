package com.bytedance.android.livesdk.livesetting.message;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public final class RealtimeTrackerConfig_OptTypeAdapter extends TypeAdapter<RealtimeTrackerConfig> {
    public final Gson LIZ;

    public RealtimeTrackerConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final RealtimeTrackerConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RealtimeTrackerConfig realtimeTrackerConfig = new RealtimeTrackerConfig(false, LSPassThroughRecordSizeConfig.DEFAULT, new ArrayList(), "", "", 30);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1887937787:
                        if (strLJJJJ.equals("log_sample")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeTrackerConfig.setLogSample(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1788700750:
                        if (strLJJJJ.equals("methods_group")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeTrackerConfig.setMethodsGroup(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeTrackerConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -982041323:
                        if (strLJJJJ.equals("record_scenes")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeTrackerConfig.setRecordScenes(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -166503568:
                        if (strLJJJJ.equals("report_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeTrackerConfig.setReportInterval(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1490066168:
                        if (strLJJJJ.equals("methods_group_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeTrackerConfig.setMethodsGroupName(c09cu.LJJJZ());
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
        return realtimeTrackerConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RealtimeTrackerConfig realtimeTrackerConfig) throws IOException {
        RealtimeTrackerConfig realtimeTrackerConfig2 = realtimeTrackerConfig;
        if (realtimeTrackerConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(realtimeTrackerConfig2.getEnable());
        c09dl.LJIILLIIL("log_sample");
        c09dl.LJJJJ(Integer.valueOf(realtimeTrackerConfig2.getLogSample()));
        c09dl.LJIILLIIL("record_scenes");
        C473040Igo.LIZLLL(this.LIZ, c09dl, realtimeTrackerConfig2.getRecordScenes(), String.class);
        c09dl.LJIILLIIL("methods_group_name");
        c09dl.LJJJJJ(realtimeTrackerConfig2.getMethodsGroupName());
        c09dl.LJIILLIIL("methods_group");
        c09dl.LJJJJJ(realtimeTrackerConfig2.getMethodsGroup());
        c09dl.LJIILLIIL("report_interval");
        c09dl.LJJJJ(Integer.valueOf(realtimeTrackerConfig2.getReportInterval()));
        c09dl.LJII();
    }
}
