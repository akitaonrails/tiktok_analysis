package com.bytedance.geckox.gson;

import X.C09CU;
import X.C09DL;
import X.EnumC797980VSa;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes24.dex */
public final class AccessTypeAdapter extends TypeAdapter<EnumC797980VSa> {
    @Override // com.google.gson.TypeAdapter
    public final EnumC797980VSa read(C09CU c09cu) throws IOException {
        int iLJJIZ;
        if (c09cu != null) {
            iLJJIZ = c09cu.LJJIZ();
        } else {
            iLJJIZ = 0;
        }
        for (EnumC797980VSa enumC797980VSa : EnumC797980VSa.values()) {
            if (enumC797980VSa.getNumber() == iLJJIZ) {
                return enumC797980VSa;
            }
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, EnumC797980VSa enumC797980VSa) throws IOException {
        EnumC797980VSa enumC797980VSa2 = enumC797980VSa;
        if (enumC797980VSa2 == null) {
            if (c09dl != null) {
                c09dl.LJJIZ(0L);
            }
        } else {
            if (c09dl == null) {
                return;
            }
            c09dl.LJJJJ(Integer.valueOf(enumC797980VSa2.getNumber()));
        }
    }
}
