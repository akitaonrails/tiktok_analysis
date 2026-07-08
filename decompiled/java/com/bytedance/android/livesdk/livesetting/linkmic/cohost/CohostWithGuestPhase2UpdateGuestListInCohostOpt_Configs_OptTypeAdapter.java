package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestPhase2UpdateGuestListInCohostOpt;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class CohostWithGuestPhase2UpdateGuestListInCohostOpt_Configs_OptTypeAdapter extends TypeAdapter<CohostWithGuestPhase2UpdateGuestListInCohostOpt.Configs> {
    public final Gson LIZ;

    public CohostWithGuestPhase2UpdateGuestListInCohostOpt_Configs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CohostWithGuestPhase2UpdateGuestListInCohostOpt.Configs read(C09CU c09cu) {
        CohostWithGuestPhase2UpdateGuestListInCohostOpt.Configs configs = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            configs = new CohostWithGuestPhase2UpdateGuestListInCohostOpt.Configs(2, true);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "reset_when_not_in_cohost")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        configs.resetWhenNotInCohost = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "notify_when_cohost_end")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        configs.notifyWhenCohostEnd = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return configs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CohostWithGuestPhase2UpdateGuestListInCohostOpt.Configs configs) throws IOException {
        CohostWithGuestPhase2UpdateGuestListInCohostOpt.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("reset_when_not_in_cohost");
        c09dl.LJJJJ(Integer.valueOf(configs2.resetWhenNotInCohost));
        c09dl.LJIILLIIL("notify_when_cohost_end");
        c09dl.LJJJJJL(configs2.notifyWhenCohostEnd);
        c09dl.LJII();
    }
}
