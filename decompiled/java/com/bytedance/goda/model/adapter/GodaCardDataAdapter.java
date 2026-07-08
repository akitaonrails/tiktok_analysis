package com.bytedance.goda.model.adapter;

import X.C051O;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C19719512Dh;
import com.bytedance.goda.model.dto.GodaCardData;
import com.bytedance.goda.model.dto.GodaCardDataFeature;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class GodaCardDataAdapter extends TypeAdapter<GodaCardData> {
    @Override // com.google.gson.TypeAdapter
    public final GodaCardData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() != C09D6.BEGIN_OBJECT) {
            return null;
        }
        c09cu.LIZIZ();
        Map map = null;
        GodaCardDataFeature godaCardDataFeature = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "fields")) {
                Object obj = new MapAdapter().read(c09cu);
                if (C19719512Dh.LJII(obj)) {
                    map = (Map) obj;
                } else {
                    map = null;
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "features")) {
                godaCardDataFeature = (GodaCardDataFeature) GsonProtectorUtils.fromJson(C051O.LIZ, c09cu, GodaCardDataFeature.class);
            }
        }
        GodaCardData godaCardData = new GodaCardData(map, null, godaCardDataFeature);
        c09cu.LJII();
        return godaCardData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GodaCardData godaCardData) {
        TypeAdapter typeAdapterLJIIJ;
        GodaCardData godaCardData2 = godaCardData;
        c09dl.LIZLLL();
        if (godaCardData2 != null) {
            try {
                Map<String, Object> map = godaCardData2.fields;
                if (map != null) {
                    synchronized (map) {
                        try {
                            TypeAdapter typeAdapterLJIIIZ = C051O.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends Object>>() { // from class: X.00Vw
                            });
                            if (typeAdapterLJIIIZ != null) {
                                c09dl.LJIILLIIL("fields");
                                typeAdapterLJIIIZ.write(c09dl, map);
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
                GodaCardDataFeature godaCardDataFeature = godaCardData2.features;
                if (godaCardDataFeature != null && (typeAdapterLJIIJ = C051O.LIZ.LJIIJ(GodaCardDataFeature.class)) != null) {
                    c09dl.LJIILLIIL("features");
                    typeAdapterLJIIJ.write(c09dl, godaCardDataFeature);
                }
            } catch (Exception th) {
            }
        }
        c09dl.LJII();
    }
}
