package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2097608Jq;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class TopLiveGuaranteeDataExpConfig_OptTypeAdapter extends TypeAdapter<TopLiveGuaranteeDataExpConfig> {
    public final Gson LIZ;

    public TopLiveGuaranteeDataExpConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TopLiveGuaranteeDataExpConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TopLiveGuaranteeDataExpConfig topLiveGuaranteeDataExpConfig = new TopLiveGuaranteeDataExpConfig(false, -1, C2097608Jq.LJ(), -1);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1333703108:
                        if (strLJJJJ.equals("max_wait_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLiveGuaranteeDataExpConfig.maxWaitTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLiveGuaranteeDataExpConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 788417222:
                        if (strLJJJJ.equals("immediately_follow_data_fresh_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLiveGuaranteeDataExpConfig.followFreshTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1751369118:
                        if (strLJJJJ.equals("toplive_guarantee_data_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLiveGuaranteeDataExpConfig.dataSourceList = C473040Igo.LIZIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return topLiveGuaranteeDataExpConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TopLiveGuaranteeDataExpConfig topLiveGuaranteeDataExpConfig) throws IOException {
        TopLiveGuaranteeDataExpConfig topLiveGuaranteeDataExpConfig2 = topLiveGuaranteeDataExpConfig;
        if (topLiveGuaranteeDataExpConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(topLiveGuaranteeDataExpConfig2.enable);
        c09dl.LJIILLIIL("max_wait_time");
        c09dl.LJJJJ(Integer.valueOf(topLiveGuaranteeDataExpConfig2.maxWaitTime));
        c09dl.LJIILLIIL("toplive_guarantee_data_list");
        C473040Igo.LJ(this.LIZ, c09dl, topLiveGuaranteeDataExpConfig2.dataSourceList, Integer.TYPE);
        c09dl.LJIILLIIL("immediately_follow_data_fresh_time");
        c09dl.LJJJJ(Integer.valueOf(topLiveGuaranteeDataExpConfig2.followFreshTime));
        c09dl.LJII();
    }
}
