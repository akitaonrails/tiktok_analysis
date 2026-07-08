package com.bytedance.android.livesdk.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class BuriedFieldData_OptTypeAdapter extends TypeAdapter<BuriedFieldData> {
    public final Gson LIZ;

    public BuriedFieldData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final BuriedFieldData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        BuriedFieldData buriedFieldData = new BuriedFieldData();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "ttlive_buried_field_reduction_is_buried_field")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    buriedFieldData.isBuriedField = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "ttlive_buried_field_reduction_unburied_field_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    buriedFieldData.unBuriedFieldList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return buriedFieldData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BuriedFieldData buriedFieldData) throws IOException {
        BuriedFieldData buriedFieldData2 = buriedFieldData;
        if (buriedFieldData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("ttlive_buried_field_reduction_is_buried_field");
        c09dl.LJJJJJL(buriedFieldData2.isBuriedField);
        c09dl.LJIILLIIL("ttlive_buried_field_reduction_unburied_field_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, buriedFieldData2.unBuriedFieldList, String.class);
        c09dl.LJII();
    }
}
