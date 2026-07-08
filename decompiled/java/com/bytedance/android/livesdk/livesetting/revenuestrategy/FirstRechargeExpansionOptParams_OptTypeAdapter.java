package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class FirstRechargeExpansionOptParams_OptTypeAdapter extends TypeAdapter<FirstRechargeExpansionOptParams> {
    public final Gson LIZ;

    public FirstRechargeExpansionOptParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FirstRechargeExpansionOptParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FirstRechargeExpansionOptParams firstRechargeExpansionOptParams = new FirstRechargeExpansionOptParams(false, false, false, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -401199225:
                        if (strLJJJJ.equals("optimized_regular_recharge_panel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                firstRechargeExpansionOptParams.optimizedRegularRechargePanel = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -121786103:
                        if (strLJJJJ.equals("record_entry_panel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                firstRechargeExpansionOptParams.recordEntryPanel = (RecordEntryPanelParams) this.LIZ.LJIIJ(RecordEntryPanelParams.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1042651915:
                        if (strLJJJJ.equals("move_first_recharge_gift")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                firstRechargeExpansionOptParams.moveFirstRechargeGift = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1798441739:
                        if (strLJJJJ.equals("is_first_recharge")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                firstRechargeExpansionOptParams.isFirstRecharge = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return firstRechargeExpansionOptParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FirstRechargeExpansionOptParams firstRechargeExpansionOptParams) throws IOException {
        FirstRechargeExpansionOptParams firstRechargeExpansionOptParams2 = firstRechargeExpansionOptParams;
        if (firstRechargeExpansionOptParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("optimized_regular_recharge_panel");
        c09dl.LJJJJJL(firstRechargeExpansionOptParams2.optimizedRegularRechargePanel);
        c09dl.LJIILLIIL("move_first_recharge_gift");
        c09dl.LJJJJJL(firstRechargeExpansionOptParams2.moveFirstRechargeGift);
        c09dl.LJIILLIIL("is_first_recharge");
        c09dl.LJJJJJL(firstRechargeExpansionOptParams2.isFirstRecharge);
        c09dl.LJIILLIIL("record_entry_panel");
        this.LIZ.LJIIJ(RecordEntryPanelParams.class).write(c09dl, firstRechargeExpansionOptParams2.recordEntryPanel);
        c09dl.LJII();
    }
}
