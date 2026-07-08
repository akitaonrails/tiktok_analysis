package com.bytedance.android.livesdk.livesetting.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveSlotSettings_OptTypeAdapter extends TypeAdapter<LiveSlotSettings> {
    public final Gson LIZ;

    public LiveSlotSettings_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveSlotSettings read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveSlotSettings liveSlotSettings = new LiveSlotSettings(null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "biz_type_disallow")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveSlotSettings.setBizTypeDisallow(C473040Igo.LIZIZ(this.LIZ, c09cu, SlotBizTypeDisallow.class));
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveSlotSettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveSlotSettings liveSlotSettings) {
        LiveSlotSettings liveSlotSettings2 = liveSlotSettings;
        if (liveSlotSettings2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("biz_type_disallow");
        C473040Igo.LJ(this.LIZ, c09dl, liveSlotSettings2.getBizTypeDisallow(), SlotBizTypeDisallow.class);
        c09dl.LJII();
    }
}
