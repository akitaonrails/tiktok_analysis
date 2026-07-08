package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestAnchorNotifyMGOnlyWhenMGFinishOptSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class CohostWithGuestAnchorNotifyMGOnlyWhenMGFinishOptSetting_Configs_OptTypeAdapter extends TypeAdapter<CohostWithGuestAnchorNotifyMGOnlyWhenMGFinishOptSetting.Configs> {
    public final Gson LIZ;

    public CohostWithGuestAnchorNotifyMGOnlyWhenMGFinishOptSetting_Configs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CohostWithGuestAnchorNotifyMGOnlyWhenMGFinishOptSetting.Configs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CohostWithGuestAnchorNotifyMGOnlyWhenMGFinishOptSetting.Configs configs = new CohostWithGuestAnchorNotifyMGOnlyWhenMGFinishOptSetting.Configs(true, true, 7000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -109284052) {
                    if (iHashCode != 742076905) {
                        if (iHashCode == 819472213 && strLJJJJ.equals("mark_mg_finish_after_session_destroy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.markMgFinishAfterSessionDestroy = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("time_out_ms")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            configs.timeOutMs = c09cu.LJJJ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("is_enabled")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        configs.isEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return configs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CohostWithGuestAnchorNotifyMGOnlyWhenMGFinishOptSetting.Configs configs) throws IOException {
        CohostWithGuestAnchorNotifyMGOnlyWhenMGFinishOptSetting.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enabled");
        c09dl.LJJJJJL(configs2.isEnabled);
        c09dl.LJIILLIIL("mark_mg_finish_after_session_destroy");
        c09dl.LJJJJJL(configs2.markMgFinishAfterSessionDestroy);
        c09dl.LJIILLIIL("time_out_ms");
        c09dl.LJJIZ(configs2.timeOutMs);
        c09dl.LJII();
    }
}
