package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class NotifyAvoidConfig_OptTypeAdapter extends TypeAdapter<NotifyAvoidConfig> {
    public final Gson LIZ;

    public NotifyAvoidConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final NotifyAvoidConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        NotifyAvoidConfig notifyAvoidConfig = new NotifyAvoidConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1883617095:
                        if (strLJJJJ.equals("com_rules")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                notifyAvoidConfig.comRules = C473040Igo.LIZ(this.LIZ, c09cu, ComNotifyAvoidRule.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -855887494:
                        if (strLJJJJ.equals("range_id_map")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                notifyAvoidConfig.rangeIdMap = C473040Igo.LIZIZ(this.LIZ, c09cu, NotifyRangeInfo.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 108873975:
                        if (strLJJJJ.equals("rules")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                notifyAvoidConfig.rules = C473040Igo.LIZ(this.LIZ, c09cu, NotifyAvoidRule.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 129017209:
                        if (strLJJJJ.equals("anim_conflict_pair")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                notifyAvoidConfig.animConflictPair = C473040Igo.LIZ(this.LIZ, c09cu, NotifyAnimConflictPair.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1417904996:
                        if (strLJJJJ.equals("avoid_pair")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                notifyAvoidConfig.avoidPair = C473040Igo.LIZ(this.LIZ, c09cu, NotifyAvoidPair.class);
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
        return notifyAvoidConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, NotifyAvoidConfig notifyAvoidConfig) {
        NotifyAvoidConfig notifyAvoidConfig2 = notifyAvoidConfig;
        if (notifyAvoidConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("anim_conflict_pair");
        C473040Igo.LIZLLL(this.LIZ, c09dl, notifyAvoidConfig2.animConflictPair, NotifyAnimConflictPair.class);
        c09dl.LJIILLIIL("avoid_pair");
        C473040Igo.LIZLLL(this.LIZ, c09dl, notifyAvoidConfig2.avoidPair, NotifyAvoidPair.class);
        c09dl.LJIILLIIL("com_rules");
        C473040Igo.LIZLLL(this.LIZ, c09dl, notifyAvoidConfig2.comRules, ComNotifyAvoidRule.class);
        c09dl.LJIILLIIL("range_id_map");
        C473040Igo.LJ(this.LIZ, c09dl, notifyAvoidConfig2.rangeIdMap, NotifyRangeInfo.class);
        c09dl.LJIILLIIL("rules");
        C473040Igo.LIZLLL(this.LIZ, c09dl, notifyAvoidConfig2.rules, NotifyAvoidRule.class);
        c09dl.LJII();
    }
}
