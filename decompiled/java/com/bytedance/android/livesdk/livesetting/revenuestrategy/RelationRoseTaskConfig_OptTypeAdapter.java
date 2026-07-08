package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class RelationRoseTaskConfig_OptTypeAdapter extends TypeAdapter<RelationRoseTaskConfig> {
    public final Gson LIZ;

    public RelationRoseTaskConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final RelationRoseTaskConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RelationRoseTaskConfig relationRoseTaskConfig = new RelationRoseTaskConfig(false, 180L, 30L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1865419481) {
                    if (iHashCode != -1298848381) {
                        if (iHashCode == 1031117388 && strLJJJJ.equals("completed_check_period")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                relationRoseTaskConfig.completedCheckPeriod = Long.valueOf(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            relationRoseTaskConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable_check_duration")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        relationRoseTaskConfig.enableCheckDuration = Long.valueOf(c09cu.LJJJ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return relationRoseTaskConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RelationRoseTaskConfig relationRoseTaskConfig) throws IOException {
        RelationRoseTaskConfig relationRoseTaskConfig2 = relationRoseTaskConfig;
        if (relationRoseTaskConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(relationRoseTaskConfig2.enable);
        c09dl.LJIILLIIL("enable_check_duration");
        c09dl.LJJJJ(relationRoseTaskConfig2.enableCheckDuration);
        c09dl.LJIILLIIL("completed_check_period");
        c09dl.LJJJJ(relationRoseTaskConfig2.completedCheckPeriod);
        c09dl.LJII();
    }
}
