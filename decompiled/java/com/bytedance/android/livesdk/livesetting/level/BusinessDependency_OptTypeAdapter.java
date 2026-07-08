package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class BusinessDependency_OptTypeAdapter extends TypeAdapter<BusinessDependency> {
    @Override // com.google.gson.TypeAdapter
    public final BusinessDependency read(C09CU c09cu) {
        BusinessDependency businessDependency = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            businessDependency = new BusinessDependency(0);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "fans_entrance_status")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        businessDependency.fansEntranceStatus = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return businessDependency;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BusinessDependency businessDependency) {
        BusinessDependency businessDependency2 = businessDependency;
        if (businessDependency2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("fans_entrance_status");
        c09dl.LJJJJ(Integer.valueOf(businessDependency2.fansEntranceStatus));
        c09dl.LJII();
    }
}
