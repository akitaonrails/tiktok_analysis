package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.performance.LiveAppLogCommonParamsMergeExp;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveAppLogCommonParamsMergeExp_CommonParamsMergeConfig_OptTypeAdapter extends TypeAdapter<LiveAppLogCommonParamsMergeExp.CommonParamsMergeConfig> {
    public final Gson LIZ;

    public LiveAppLogCommonParamsMergeExp_CommonParamsMergeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveAppLogCommonParamsMergeExp.CommonParamsMergeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveAppLogCommonParamsMergeExp.CommonParamsMergeConfig commonParamsMergeConfig = new LiveAppLogCommonParamsMergeExp.CommonParamsMergeConfig(false, null, null, 7, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1298848381) {
                    if (iHashCode != -858559433) {
                        if (iHashCode == -4926262 && strLJJJJ.equals("merge_event_black_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                commonParamsMergeConfig.setMergeEventBlackList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("common_params_list_room")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            commonParamsMergeConfig.setCommonParamsRoom(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        commonParamsMergeConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return commonParamsMergeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveAppLogCommonParamsMergeExp.CommonParamsMergeConfig commonParamsMergeConfig) throws IOException {
        LiveAppLogCommonParamsMergeExp.CommonParamsMergeConfig commonParamsMergeConfig2 = commonParamsMergeConfig;
        if (commonParamsMergeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(commonParamsMergeConfig2.getEnable());
        c09dl.LJIILLIIL("merge_event_black_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, commonParamsMergeConfig2.getMergeEventBlackList(), String.class);
        c09dl.LJIILLIIL("common_params_list_room");
        C473040Igo.LIZLLL(this.LIZ, c09dl, commonParamsMergeConfig2.getCommonParamsRoom(), String.class);
        c09dl.LJII();
    }
}
