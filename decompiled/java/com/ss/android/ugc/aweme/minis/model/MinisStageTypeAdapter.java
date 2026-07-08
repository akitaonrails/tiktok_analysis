package com.ss.android.ugc.aweme.minis.model;

import X.C09CU;
import X.C09DL;
import X.EnumC2192711Arl;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisStageTypeAdapter extends TypeAdapter<EnumC2192711Arl> {
    @Override // com.google.gson.TypeAdapter
    public final EnumC2192711Arl read(C09CU c09cu) {
        return EnumC2192711Arl.valueOf(c09cu.LJJJZ());
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, EnumC2192711Arl enumC2192711Arl) {
        c09dl.LJJJJJ(String.valueOf(enumC2192711Arl));
    }
}
