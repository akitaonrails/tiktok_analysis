package com.bytedance.android.livesdk.broadcast.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class BroadcastOverallScoreLevelMapping_OptTypeAdapter extends TypeAdapter<BroadcastOverallScoreLevelMapping> {
    @Override // com.google.gson.TypeAdapter
    public final BroadcastOverallScoreLevelMapping read(C09CU c09cu) {
        BroadcastOverallScoreLevelMapping broadcastOverallScoreLevelMapping = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            broadcastOverallScoreLevelMapping = new BroadcastOverallScoreLevelMapping(6.5f, 8.0f);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "low_end_device_max")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        broadcastOverallScoreLevelMapping.setLow_end_device_max((float) c09cu.LJJIL());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "medium_end_device_max")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        broadcastOverallScoreLevelMapping.setMedium_end_device_max((float) c09cu.LJJIL());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return broadcastOverallScoreLevelMapping;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BroadcastOverallScoreLevelMapping broadcastOverallScoreLevelMapping) {
        BroadcastOverallScoreLevelMapping broadcastOverallScoreLevelMapping2 = broadcastOverallScoreLevelMapping;
        if (broadcastOverallScoreLevelMapping2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("low_end_device_max");
        c09dl.LJJJJ(Float.valueOf(broadcastOverallScoreLevelMapping2.getLow_end_device_max()));
        c09dl.LJIILLIIL("medium_end_device_max");
        c09dl.LJJJJ(Float.valueOf(broadcastOverallScoreLevelMapping2.getMedium_end_device_max()));
        c09dl.LJII();
    }
}
