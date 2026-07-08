package com.bytedance.android.livesdk.performance.strategy;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class DowngradeLegoConfig_OptTypeAdapter extends TypeAdapter<DowngradeLegoConfig> {
    public final Gson LIZ;

    public DowngradeLegoConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final DowngradeLegoConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        DowngradeLegoConfig downgradeLegoConfig = new DowngradeLegoConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                downgradeLegoConfig.strategy = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1293550028:
                        if (strLJJJJ.equals("stop_downgrade_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                downgradeLegoConfig.time = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -822093636:
                        if (strLJJJJ.equals("trigger_type_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                downgradeLegoConfig.triggerTypeList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 180674328:
                        if (strLJJJJ.equals("task_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                downgradeLegoConfig.taskList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
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
        return downgradeLegoConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, DowngradeLegoConfig downgradeLegoConfig) throws IOException {
        DowngradeLegoConfig downgradeLegoConfig2 = downgradeLegoConfig;
        if (downgradeLegoConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJ(Integer.valueOf(downgradeLegoConfig2.strategy));
        c09dl.LJIILLIIL("stop_downgrade_time");
        c09dl.LJJIZ(downgradeLegoConfig2.time);
        c09dl.LJIILLIIL("trigger_type_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, downgradeLegoConfig2.triggerTypeList, String.class);
        c09dl.LJIILLIIL("task_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, downgradeLegoConfig2.taskList, String.class);
        c09dl.LJII();
    }
}
