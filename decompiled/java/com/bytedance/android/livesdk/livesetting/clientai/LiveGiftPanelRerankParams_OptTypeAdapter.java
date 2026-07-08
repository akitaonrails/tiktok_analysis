package com.bytedance.android.livesdk.livesetting.clientai;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftPanelRerankParams_OptTypeAdapter extends TypeAdapter<LiveGiftPanelRerankParams> {
    @Override // com.google.gson.TypeAdapter
    public final LiveGiftPanelRerankParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGiftPanelRerankParams liveGiftPanelRerankParams = new LiveGiftPanelRerankParams(0, 300L, "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1741672495) {
                    if (iHashCode != -1298848381) {
                        if (iHashCode == -485160624 && strLJJJJ.equals("algo_package_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftPanelRerankParams.algoPkgName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveGiftPanelRerankParams.enable = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("default_for_timer")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveGiftPanelRerankParams.defaultTimer = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveGiftPanelRerankParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGiftPanelRerankParams liveGiftPanelRerankParams) throws IOException {
        LiveGiftPanelRerankParams liveGiftPanelRerankParams2 = liveGiftPanelRerankParams;
        if (liveGiftPanelRerankParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJ(Integer.valueOf(liveGiftPanelRerankParams2.enable));
        c09dl.LJIILLIIL("default_for_timer");
        c09dl.LJJIZ(liveGiftPanelRerankParams2.defaultTimer);
        c09dl.LJIILLIIL("algo_package_name");
        c09dl.LJJJJJ(liveGiftPanelRerankParams2.algoPkgName);
        c09dl.LJII();
    }
}
