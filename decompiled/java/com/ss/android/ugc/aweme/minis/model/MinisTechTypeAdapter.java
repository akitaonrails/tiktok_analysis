package com.ss.android.ugc.aweme.minis.model;

import X.C09CU;
import X.C09DL;
import X.EnumC993010bwp;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes17.dex */
public final class MinisTechTypeAdapter extends TypeAdapter<EnumC993010bwp> {
    @Override // com.google.gson.TypeAdapter
    public final EnumC993010bwp read(C09CU c09cu) {
        return EnumC993010bwp.valueOf(c09cu.LJJJZ());
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, EnumC993010bwp enumC993010bwp) {
        c09dl.LJJJJJ(String.valueOf(enumC993010bwp));
    }
}
