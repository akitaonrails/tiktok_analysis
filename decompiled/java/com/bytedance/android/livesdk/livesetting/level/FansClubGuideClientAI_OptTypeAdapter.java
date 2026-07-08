package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.android.gms.common.ConnectionResult;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubGuideClientAI_OptTypeAdapter extends TypeAdapter<FansClubGuideClientAI> {
    @Override // com.google.gson.TypeAdapter
    public final FansClubGuideClientAI read(C09CU c09cu) {
        FansClubGuideClientAI fansClubGuideClientAI = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            fansClubGuideClientAI = new FansClubGuideClientAI(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "client_ai_task_timeout")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        fansClubGuideClientAI.taskTimeout = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return fansClubGuideClientAI;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClubGuideClientAI fansClubGuideClientAI) {
        FansClubGuideClientAI fansClubGuideClientAI2 = fansClubGuideClientAI;
        if (fansClubGuideClientAI2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("client_ai_task_timeout");
        c09dl.LJJJJ(Integer.valueOf(fansClubGuideClientAI2.taskTimeout));
        c09dl.LJII();
    }
}
