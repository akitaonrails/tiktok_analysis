package com.ss.android.ugc.aweme.minis.model;

import X.C09CU;
import X.C09DL;
import X.EnumC586220Myy;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes15.dex */
public final class MetaRequestSourceTypeAdapter extends TypeAdapter<EnumC586220Myy> {
    @Override // com.google.gson.TypeAdapter
    public final EnumC586220Myy read(C09CU c09cu) {
        return EnumC586220Myy.valueOf(c09cu.LJJJZ());
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, EnumC586220Myy enumC586220Myy) {
        c09dl.LJJJJJ(String.valueOf(enumC586220Myy));
    }
}
