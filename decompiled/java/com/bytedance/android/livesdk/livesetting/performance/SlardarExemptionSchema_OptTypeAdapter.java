package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class SlardarExemptionSchema_OptTypeAdapter extends TypeAdapter<SlardarExemptionSchema> {
    public final Gson LIZ;

    public SlardarExemptionSchema_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SlardarExemptionSchema read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SlardarExemptionSchema slardarExemptionSchema = new SlardarExemptionSchema();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "live_slardar_exemption_enabled")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    slardarExemptionSchema.liveSlardarExemptionEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "live_slardar_event_exemption_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    slardarExemptionSchema.liveSlardarEventExemptionList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return slardarExemptionSchema;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SlardarExemptionSchema slardarExemptionSchema) throws IOException {
        SlardarExemptionSchema slardarExemptionSchema2 = slardarExemptionSchema;
        if (slardarExemptionSchema2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_slardar_exemption_enabled");
        c09dl.LJJJJJL(slardarExemptionSchema2.liveSlardarExemptionEnabled);
        c09dl.LJIILLIIL("live_slardar_event_exemption_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, slardarExemptionSchema2.liveSlardarEventExemptionList, String.class);
        c09dl.LJII();
    }
}
