package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakGeckoLoadStrategy;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakLevelData;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakMilestoneConf;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class StreakMilestoneConfTypeAdapter extends TypeAdapter<StreakMilestoneConf> {
    public final Gson LIZ;

    public StreakMilestoneConfTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final StreakMilestoneConf read(C09CU c09cu) {
        c09cu.LIZIZ();
        ArrayList arrayList = null;
        StreakGeckoLoadStrategy streakGeckoLoadStrategy = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -892389290) {
                    if (iHashCode != 17328488) {
                        if (iHashCode == 206610309 && strLJJJJ.equals("level_data")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                arrayList = new ArrayList();
                                c09cu.LIZ();
                                while (c09cu.LJIIZILJ()) {
                                    if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                        c09cu.LJJJJJL();
                                    } else {
                                        arrayList.add(this.LIZ.LJIIJ(StreakLevelData.class).read(c09cu));
                                    }
                                }
                                c09cu.LJI();
                            }
                        }
                    } else if (strLJJJJ.equals("config_name")) {
                        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                            c09cu.LJJJJJL();
                        } else {
                            c09cu.LJJJZ();
                        }
                    }
                } else if (strLJJJJ.equals("gecko_load_strategy")) {
                    if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                        c09cu.LJJJJJL();
                    } else {
                        streakGeckoLoadStrategy = (StreakGeckoLoadStrategy) this.LIZ.LJIIJ(StreakGeckoLoadStrategy.class).read(c09cu);
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return new StreakMilestoneConf(arrayList, streakGeckoLoadStrategy);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, StreakMilestoneConf streakMilestoneConf) {
        StreakMilestoneConf streakMilestoneConf2 = streakMilestoneConf;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("config_name");
        c09dl.LJJJJJ(streakMilestoneConf2.getConfigName());
        c09dl.LJIILLIIL("level_data");
        if (streakMilestoneConf2.getLevelDataList() == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZIZ();
            List<StreakLevelData> levelDataList = streakMilestoneConf2.getLevelDataList();
            if (levelDataList != null) {
                for (StreakLevelData streakLevelData : levelDataList) {
                    if (streakLevelData == null) {
                        c09dl.LJIJJ();
                    } else {
                        this.LIZ.LJIIJ(StreakLevelData.class).write(c09dl, streakLevelData);
                    }
                }
            }
            c09dl.LJI();
        }
        c09dl.LJIILLIIL("gecko_load_strategy");
        if (streakMilestoneConf2.getGeckoLoadStrategy() == null) {
            c09dl.LJIJJ();
        } else {
            this.LIZ.LJIIJ(StreakGeckoLoadStrategy.class).write(c09dl, streakMilestoneConf2.getGeckoLoadStrategy());
        }
        c09dl.LJII();
    }
}
