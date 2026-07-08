package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarStrategyTransferConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarTransferConf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class ActionBarStrategyTransferConfTypeAdapter extends TypeAdapter<ActionBarStrategyTransferConf> {
    public final Gson LIZ;

    public ActionBarStrategyTransferConfTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final ActionBarStrategyTransferConf read(C09CU c09cu) {
        c09cu.LIZIZ();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        Integer numValueOf = null;
        String strLJJJZ = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2014188430:
                        if (strLJJJJ.equals("transfer_list")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                arrayList2 = new ArrayList();
                                c09cu.LIZ();
                                while (c09cu.LJIIZILJ()) {
                                    arrayList2.add(this.LIZ.LJIIJ(ActionBarTransferConf.class).read(c09cu));
                                }
                                c09cu.LJI();
                            }
                        }
                        break;
                    case -475066973:
                        if (strLJJJJ.equals("base_state")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                arrayList = new ArrayList();
                                c09cu.LIZ();
                                while (c09cu.LJIIZILJ()) {
                                    if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                        c09cu.LJJJJJL();
                                    } else {
                                        arrayList.add(c09cu.LJJJZ());
                                    }
                                }
                                c09cu.LJI();
                            }
                        }
                        break;
                    case 17328488:
                        if (strLJJJJ.equals("config_name")) {
                            strLJJJZ = c09cu.LJJJZ();
                        }
                        break;
                    case 351608024:
                        if (strLJJJJ.equals("version")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                numValueOf = Integer.valueOf(c09cu.LJJIZ());
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        ActionBarStrategyTransferConf actionBarStrategyTransferConf = new ActionBarStrategyTransferConf(arrayList, arrayList2, numValueOf);
        actionBarStrategyTransferConf.setConfigName(strLJJJZ);
        return actionBarStrategyTransferConf;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ActionBarStrategyTransferConf actionBarStrategyTransferConf) {
        ActionBarStrategyTransferConf actionBarStrategyTransferConf2 = actionBarStrategyTransferConf;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("config_name");
        c09dl.LJJJJJ(actionBarStrategyTransferConf2.getConfigName());
        c09dl.LJIILLIIL("base_state");
        if (actionBarStrategyTransferConf2.getBaseState() == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZIZ();
            List<String> baseState = actionBarStrategyTransferConf2.getBaseState();
            if (baseState != null) {
                Iterator<String> it2 = baseState.iterator();
                while (it2.hasNext()) {
                    c09dl.LJJJJJ(it2.next());
                }
            }
            c09dl.LJI();
        }
        c09dl.LJIILLIIL("transfer_list");
        if (actionBarStrategyTransferConf2.getTransferList() == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZIZ();
            List<ActionBarTransferConf> transferList = actionBarStrategyTransferConf2.getTransferList();
            if (transferList != null) {
                Iterator<ActionBarTransferConf> it3 = transferList.iterator();
                while (it3.hasNext()) {
                    this.LIZ.LJIIJ(ActionBarTransferConf.class).write(c09dl, it3.next());
                }
            }
            c09dl.LJI();
        }
        c09dl.LJIILLIIL("version");
        c09dl.LJJJJ(actionBarStrategyTransferConf2.getVersion());
        c09dl.LJII();
    }
}
