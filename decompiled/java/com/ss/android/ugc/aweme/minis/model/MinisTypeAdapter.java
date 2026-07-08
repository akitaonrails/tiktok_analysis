package com.ss.android.ugc.aweme.minis.model;

import X.C09CU;
import X.C09DL;
import X.EnumC1379020lzQ;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes24.dex */
public final class MinisTypeAdapter extends TypeAdapter<EnumC1379020lzQ> {
    @Override // com.google.gson.TypeAdapter
    public final EnumC1379020lzQ read(C09CU c09cu) {
        return EnumC1379020lzQ.valueOf(c09cu.LJJJZ());
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, EnumC1379020lzQ enumC1379020lzQ) {
        c09dl.LJJJJJ(String.valueOf(enumC1379020lzQ));
    }
}
