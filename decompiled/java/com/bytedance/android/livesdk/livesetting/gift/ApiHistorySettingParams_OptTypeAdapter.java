package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ApiHistorySettingParams_OptTypeAdapter extends TypeAdapter<ApiHistorySettingParams> {
    public final Gson LIZ;

    public ApiHistorySettingParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final ApiHistorySettingParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ApiHistorySettingParams apiHistorySettingParams = new ApiHistorySettingParams(false, null, 3, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enabled")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    apiHistorySettingParams.enabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "allowlist")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    apiHistorySettingParams.allowlist = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return apiHistorySettingParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ApiHistorySettingParams apiHistorySettingParams) throws IOException {
        ApiHistorySettingParams apiHistorySettingParams2 = apiHistorySettingParams;
        if (apiHistorySettingParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(apiHistorySettingParams2.enabled);
        c09dl.LJIILLIIL("allowlist");
        C473040Igo.LIZLLL(this.LIZ, c09dl, apiHistorySettingParams2.allowlist, String.class);
        c09dl.LJII();
    }
}
