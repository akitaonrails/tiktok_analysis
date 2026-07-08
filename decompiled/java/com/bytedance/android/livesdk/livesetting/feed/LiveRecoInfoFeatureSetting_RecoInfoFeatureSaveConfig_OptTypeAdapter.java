package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.feed.LiveRecoInfoFeatureSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRecoInfoFeatureSetting_RecoInfoFeatureSaveConfig_OptTypeAdapter extends TypeAdapter<LiveRecoInfoFeatureSetting.RecoInfoFeatureSaveConfig> {
    public final Gson LIZ;

    public LiveRecoInfoFeatureSetting_RecoInfoFeatureSaveConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRecoInfoFeatureSetting.RecoInfoFeatureSaveConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRecoInfoFeatureSetting.RecoInfoFeatureSaveConfig recoInfoFeatureSaveConfig = new LiveRecoInfoFeatureSetting.RecoInfoFeatureSaveConfig(false, null, null, 7, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1722392616) {
                    if (iHashCode != -809652818) {
                        if (iHashCode == -91798852 && strLJJJJ.equals("feature_save_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                recoInfoFeatureSaveConfig.setFeatureSaveEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("reco_info_key")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            recoInfoFeatureSaveConfig.setRecoInfoKey(c09cu.LJJJZ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("sub_feature_save_list")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        recoInfoFeatureSaveConfig.setSubFeatureSaveList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return recoInfoFeatureSaveConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRecoInfoFeatureSetting.RecoInfoFeatureSaveConfig recoInfoFeatureSaveConfig) throws IOException {
        LiveRecoInfoFeatureSetting.RecoInfoFeatureSaveConfig recoInfoFeatureSaveConfig2 = recoInfoFeatureSaveConfig;
        if (recoInfoFeatureSaveConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("feature_save_enable");
        c09dl.LJJJJJL(recoInfoFeatureSaveConfig2.getFeatureSaveEnable());
        c09dl.LJIILLIIL("reco_info_key");
        c09dl.LJJJJJ(recoInfoFeatureSaveConfig2.getRecoInfoKey());
        c09dl.LJIILLIIL("sub_feature_save_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, recoInfoFeatureSaveConfig2.getSubFeatureSaveList(), String.class);
        c09dl.LJII();
    }
}
