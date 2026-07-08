package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class DisabledMatchTypesParams_OptTypeAdapter extends TypeAdapter<DisabledMatchTypesParams> {
    public final Gson LIZ;

    public DisabledMatchTypesParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final DisabledMatchTypesParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        DisabledMatchTypesParams disabledMatchTypesParams = new DisabledMatchTypesParams(null, 1, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "disabled_match_types_for_linker_mode")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    disabledMatchTypesParams.disabledMatchTypesForLinkerMode = (HashMap) this.LIZ.LJIIIZ(new TypeToken<HashMap<Integer, ArrayList<Integer>>>() { // from class: X.04XN
                    }).read(c09cu);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return disabledMatchTypesParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, DisabledMatchTypesParams disabledMatchTypesParams) {
        DisabledMatchTypesParams disabledMatchTypesParams2 = disabledMatchTypesParams;
        if (disabledMatchTypesParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("disabled_match_types_for_linker_mode");
        this.LIZ.LJIIIZ(new TypeToken<HashMap<Integer, ArrayList<Integer>>>() { // from class: X.04XO
        }).write(c09dl, disabledMatchTypesParams2.disabledMatchTypesForLinkerMode);
        c09dl.LJII();
    }
}
