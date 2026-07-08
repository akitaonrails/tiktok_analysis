package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiGuestHangoutPageData_OptTypeAdapter extends TypeAdapter<MultiGuestHangoutPageData> {
    public final Gson LIZ;

    public MultiGuestHangoutPageData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiGuestHangoutPageData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestHangoutPageData multiGuestHangoutPageData = new MultiGuestHangoutPageData(null, null, 3, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "interaction_module_array")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    multiGuestHangoutPageData.interactionModuleArray = C473040Igo.LIZ(this.LIZ, c09cu, InteractionModule.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "tab_module_array")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    multiGuestHangoutPageData.tabModuleArray = C473040Igo.LIZ(this.LIZ, c09cu, TabModule.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return multiGuestHangoutPageData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestHangoutPageData multiGuestHangoutPageData) {
        MultiGuestHangoutPageData multiGuestHangoutPageData2 = multiGuestHangoutPageData;
        if (multiGuestHangoutPageData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("interaction_module_array");
        C473040Igo.LIZLLL(this.LIZ, c09dl, multiGuestHangoutPageData2.interactionModuleArray, InteractionModule.class);
        c09dl.LJIILLIIL("tab_module_array");
        C473040Igo.LIZLLL(this.LIZ, c09dl, multiGuestHangoutPageData2.tabModuleArray, TabModule.class);
        c09dl.LJII();
    }
}
