package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiGuestTopLivePushCardModel_OptTypeAdapter extends TypeAdapter<MultiGuestTopLivePushCardModel> {
    public final Gson LIZ;

    public MultiGuestTopLivePushCardModel_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MultiGuestTopLivePushCardModel read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestTopLivePushCardModel multiGuestTopLivePushCardModel = new MultiGuestTopLivePushCardModel(false, 0L, 0L, null, 15, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1427540029:
                        if (strLJJJJ.equals("delay_seconds")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestTopLivePushCardModel.delaySeconds = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestTopLivePushCardModel.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 329705030:
                        if (strLJJJJ.equals("residence_seconds")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestTopLivePushCardModel.residenceSeconds = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1197969285:
                        if (strLJJJJ.equals("not_consume_controls")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestTopLivePushCardModel.notConsumeControls = C473040Igo.LIZ(this.LIZ, c09cu, NotConsumeControlsModel.class);
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
        return multiGuestTopLivePushCardModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestTopLivePushCardModel multiGuestTopLivePushCardModel) throws IOException {
        MultiGuestTopLivePushCardModel multiGuestTopLivePushCardModel2 = multiGuestTopLivePushCardModel;
        if (multiGuestTopLivePushCardModel2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(multiGuestTopLivePushCardModel2.enable);
        c09dl.LJIILLIIL("delay_seconds");
        c09dl.LJJIZ(multiGuestTopLivePushCardModel2.delaySeconds);
        c09dl.LJIILLIIL("residence_seconds");
        c09dl.LJJIZ(multiGuestTopLivePushCardModel2.residenceSeconds);
        c09dl.LJIILLIIL("not_consume_controls");
        C473040Igo.LIZLLL(this.LIZ, c09dl, multiGuestTopLivePushCardModel2.notConsumeControls, NotConsumeControlsModel.class);
        c09dl.LJII();
    }
}
