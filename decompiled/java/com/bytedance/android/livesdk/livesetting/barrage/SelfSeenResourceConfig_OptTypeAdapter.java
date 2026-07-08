package com.bytedance.android.livesdk.livesetting.barrage;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class SelfSeenResourceConfig_OptTypeAdapter extends TypeAdapter<SelfSeenResourceConfig> {
    public final Gson LIZ;

    public SelfSeenResourceConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SelfSeenResourceConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SelfSeenResourceConfig selfSeenResourceConfig = new SelfSeenResourceConfig(null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "user_level_self_seen_barrage_config")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    selfSeenResourceConfig.userLevelRange = C473040Igo.LIZ(this.LIZ, c09cu, UserBarrageUIElementsConfig.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "fans_level_self_seen_barrage_config")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    selfSeenResourceConfig.fansLevelRange = C473040Igo.LIZ(this.LIZ, c09cu, UserBarrageUIElementsConfig.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return selfSeenResourceConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SelfSeenResourceConfig selfSeenResourceConfig) {
        SelfSeenResourceConfig selfSeenResourceConfig2 = selfSeenResourceConfig;
        if (selfSeenResourceConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("user_level_self_seen_barrage_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, selfSeenResourceConfig2.userLevelRange, UserBarrageUIElementsConfig.class);
        c09dl.LJIILLIIL("fans_level_self_seen_barrage_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, selfSeenResourceConfig2.fansLevelRange, UserBarrageUIElementsConfig.class);
        c09dl.LJII();
    }
}
