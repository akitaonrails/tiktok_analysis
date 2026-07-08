package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class CohostMatchResumeSetting_OptTypeAdapter extends TypeAdapter<CohostMatchResumeSetting> {
    @Override // com.google.gson.TypeAdapter
    public final CohostMatchResumeSetting read(C09CU c09cu) {
        CohostMatchResumeSetting cohostMatchResumeSetting = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            cohostMatchResumeSetting = new CohostMatchResumeSetting(1, 27);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable_cohost_match_resume")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        cohostMatchResumeSetting.enableMatchResume = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "max_app_exit_duration")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        cohostMatchResumeSetting.maxAppExitDuration = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return cohostMatchResumeSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CohostMatchResumeSetting cohostMatchResumeSetting) {
        CohostMatchResumeSetting cohostMatchResumeSetting2 = cohostMatchResumeSetting;
        if (cohostMatchResumeSetting2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_cohost_match_resume");
        c09dl.LJJJJ(Integer.valueOf(cohostMatchResumeSetting2.enableMatchResume));
        c09dl.LJIILLIIL("max_app_exit_duration");
        c09dl.LJJJJ(Integer.valueOf(cohostMatchResumeSetting2.maxAppExitDuration));
        c09dl.LJII();
    }
}
