package com.ss.android.ugc.aweme.minis.model;

import X.C09CU;
import X.C09DL;
import X.EnumC1386420mBM;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes24.dex */
public final class MinisStatusTypeAdapter extends TypeAdapter<EnumC1386420mBM> {
    @Override // com.google.gson.TypeAdapter
    public final EnumC1386420mBM read(C09CU c09cu) {
        return EnumC1386420mBM.valueOf(c09cu.LJJJZ());
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, EnumC1386420mBM enumC1386420mBM) {
        c09dl.LJJJJJ(String.valueOf(enumC1386420mBM));
    }
}
