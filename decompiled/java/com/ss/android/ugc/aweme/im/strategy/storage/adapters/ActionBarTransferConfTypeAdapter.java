package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarButtonStrategyConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarTransferConf;

/* JADX INFO: loaded from: classes15.dex */
public final class ActionBarTransferConfTypeAdapter extends TypeAdapter<ActionBarTransferConf> {
    public final Gson LIZ;

    public ActionBarTransferConfTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final ActionBarTransferConf read(C09CU c09cu) {
        c09cu.LIZIZ();
        String strLJJJZ = null;
        String strLJJJZ2 = null;
        ActionBarButtonStrategyConf actionBarButtonStrategyConf = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1743803661) {
                    if (iHashCode != -1432962286) {
                        if (iHashCode == 109757585 && strLJJJJ.equals("state")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                actionBarButtonStrategyConf = (ActionBarButtonStrategyConf) this.LIZ.LJIIJ(ActionBarButtonStrategyConf.class).read(c09cu);
                            }
                        }
                    } else if (strLJJJJ.equals("operation_type")) {
                        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                            c09cu.LJJJJJL();
                        } else {
                            strLJJJZ = c09cu.LJJJZ();
                        }
                    }
                } else if (strLJJJJ.equals("from_button_id")) {
                    if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                        c09cu.LJJJJJL();
                    } else {
                        strLJJJZ2 = c09cu.LJJJZ();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return new ActionBarTransferConf(strLJJJZ, strLJJJZ2, actionBarButtonStrategyConf);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ActionBarTransferConf actionBarTransferConf) {
        ActionBarTransferConf actionBarTransferConf2 = actionBarTransferConf;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("operation_type");
        c09dl.LJJJJJ(actionBarTransferConf2.action);
        c09dl.LJIILLIIL("from_button_id");
        c09dl.LJJJJJ(actionBarTransferConf2.targetButtonId);
        c09dl.LJIILLIIL("state");
        if (actionBarTransferConf2.resultButton == null) {
            c09dl.LJIJJ();
        } else {
            this.LIZ.LJIIJ(ActionBarButtonStrategyConf.class).write(c09dl, actionBarTransferConf2.resultButton);
        }
        c09dl.LJII();
    }
}
