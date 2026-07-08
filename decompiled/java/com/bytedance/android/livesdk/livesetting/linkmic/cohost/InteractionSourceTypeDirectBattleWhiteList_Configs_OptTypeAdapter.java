package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.InteractionSourceTypeDirectBattleWhiteList;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class InteractionSourceTypeDirectBattleWhiteList_Configs_OptTypeAdapter extends TypeAdapter<InteractionSourceTypeDirectBattleWhiteList.Configs> {
    public final Gson LIZ;

    public InteractionSourceTypeDirectBattleWhiteList_Configs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final InteractionSourceTypeDirectBattleWhiteList.Configs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        InteractionSourceTypeDirectBattleWhiteList.Configs configs = new InteractionSourceTypeDirectBattleWhiteList.Configs(false, null, null, null, 15, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2106177738:
                        if (strLJJJJ.equals("quick_recommend_during_cohost_white_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.quickRecommendDuringCohostWhiteList = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1374791897:
                        if (strLJJJJ.equals("quick_pair_white_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.quickPairWhiteList = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1345035927:
                        if (strLJJJJ.equals("quick_recommend_white_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.quickRecommendWhiteList = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -109284052:
                        if (strLJJJJ.equals("is_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.isEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return configs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, InteractionSourceTypeDirectBattleWhiteList.Configs configs) throws IOException {
        InteractionSourceTypeDirectBattleWhiteList.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enabled");
        c09dl.LJJJJJL(configs2.isEnabled);
        c09dl.LJIILLIIL("quick_pair_white_list");
        Gson gson = this.LIZ;
        List<Integer> list = configs2.quickPairWhiteList;
        Class cls = Integer.TYPE;
        C473040Igo.LIZLLL(gson, c09dl, list, cls);
        c09dl.LJIILLIIL("quick_recommend_white_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, configs2.quickRecommendWhiteList, cls);
        c09dl.LJIILLIIL("quick_recommend_during_cohost_white_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, configs2.quickRecommendDuringCohostWhiteList, cls);
        c09dl.LJII();
    }
}
