package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarButtonStrategyConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarStrategyConf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class ActionBarStrategyConfTypeAdapter extends TypeAdapter<ActionBarStrategyConf> {
    public final Gson LIZ;

    public ActionBarStrategyConfTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final ActionBarStrategyConf read(C09CU c09cu) {
        c09cu.LIZIZ();
        ArrayList arrayList = null;
        Integer numValueOf = null;
        String strLJJJZ = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != 17328488) {
                    if (iHashCode != 351608024) {
                        if (iHashCode == 1691413980 && strLJJJJ.equals("action_bar_button_conf")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                arrayList = new ArrayList();
                                c09cu.LIZ();
                                while (c09cu.LJIIZILJ()) {
                                    arrayList.add(this.LIZ.LJIIJ(ActionBarButtonStrategyConf.class).read(c09cu));
                                }
                                c09cu.LJI();
                            }
                        }
                    } else if (strLJJJJ.equals("version")) {
                        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                            c09cu.LJJJJJL();
                        } else {
                            numValueOf = Integer.valueOf(c09cu.LJJIZ());
                        }
                    }
                } else if (strLJJJJ.equals("config_name")) {
                    if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                        c09cu.LJJJJJL();
                    } else {
                        strLJJJZ = c09cu.LJJJZ();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        ActionBarStrategyConf actionBarStrategyConf = new ActionBarStrategyConf(arrayList, numValueOf);
        actionBarStrategyConf.setConfigName(strLJJJZ);
        return actionBarStrategyConf;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ActionBarStrategyConf actionBarStrategyConf) {
        ActionBarStrategyConf actionBarStrategyConf2 = actionBarStrategyConf;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("config_name");
        c09dl.LJJJJJ(actionBarStrategyConf2.getConfigName());
        c09dl.LJIILLIIL("action_bar_button_conf");
        if (actionBarStrategyConf2.getActionBarButtonConf() == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZIZ();
            List<ActionBarButtonStrategyConf> actionBarButtonConf = actionBarStrategyConf2.getActionBarButtonConf();
            if (actionBarButtonConf != null) {
                Iterator<ActionBarButtonStrategyConf> it2 = actionBarButtonConf.iterator();
                while (it2.hasNext()) {
                    this.LIZ.LJIIJ(ActionBarButtonStrategyConf.class).write(c09dl, it2.next());
                }
            }
            c09dl.LJI();
        }
        c09dl.LJIILLIIL("version");
        c09dl.LJJJJ(actionBarStrategyConf2.getVersion());
        c09dl.LJII();
    }
}
