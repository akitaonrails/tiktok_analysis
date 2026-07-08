package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class NotConsumeControlsModel_OptTypeAdapter extends TypeAdapter<NotConsumeControlsModel> {
    @Override // com.google.gson.TypeAdapter
    public final NotConsumeControlsModel read(C09CU c09cu) {
        NotConsumeControlsModel notConsumeControlsModel = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            notConsumeControlsModel = new NotConsumeControlsModel(2, 5);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "not_consume_times")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        notConsumeControlsModel.notConsumeTimes = Integer.valueOf(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "not_consume_gap_day")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        notConsumeControlsModel.notConsumeGapDay = Integer.valueOf(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return notConsumeControlsModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, NotConsumeControlsModel notConsumeControlsModel) {
        NotConsumeControlsModel notConsumeControlsModel2 = notConsumeControlsModel;
        if (notConsumeControlsModel2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("not_consume_times");
        c09dl.LJJJJ(notConsumeControlsModel2.notConsumeTimes);
        c09dl.LJIILLIIL("not_consume_gap_day");
        c09dl.LJJJJ(notConsumeControlsModel2.notConsumeGapDay);
        c09dl.LJII();
    }
}
