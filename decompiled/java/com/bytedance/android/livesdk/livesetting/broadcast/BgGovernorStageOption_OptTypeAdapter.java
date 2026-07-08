package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class BgGovernorStageOption_OptTypeAdapter extends TypeAdapter<BgGovernorStageOption> {
    public final Gson LIZ;

    public BgGovernorStageOption_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final BgGovernorStageOption read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        BgGovernorStageOption bgGovernorStageOption = new BgGovernorStageOption();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1609594047) {
                    if (iHashCode != -1161803523) {
                        if (iHashCode == 816162274 && strLJJJJ.equals("delay_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bgGovernorStageOption.setDelayMs(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("actions")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            bgGovernorStageOption.setActions(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enabled")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        bgGovernorStageOption.setEnabled(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return bgGovernorStageOption;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BgGovernorStageOption bgGovernorStageOption) throws IOException {
        BgGovernorStageOption bgGovernorStageOption2 = bgGovernorStageOption;
        if (bgGovernorStageOption2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(bgGovernorStageOption2.getEnabled());
        c09dl.LJIILLIIL("delay_ms");
        c09dl.LJJIZ(bgGovernorStageOption2.getDelayMs());
        c09dl.LJIILLIIL("actions");
        C473040Igo.LIZLLL(this.LIZ, c09dl, bgGovernorStageOption2.getActions(), String.class);
        c09dl.LJII();
    }
}
