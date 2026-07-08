package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.feed.LiveRecoInfoFeatureSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRecoInfoFeatureSetting_LiveRecoInfoFeatureConfig_OptTypeAdapter extends TypeAdapter<LiveRecoInfoFeatureSetting.LiveRecoInfoFeatureConfig> {
    public final Gson LIZ;

    public LiveRecoInfoFeatureSetting_LiveRecoInfoFeatureConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveRecoInfoFeatureSetting.LiveRecoInfoFeatureConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRecoInfoFeatureSetting.LiveRecoInfoFeatureConfig liveRecoInfoFeatureConfig = new LiveRecoInfoFeatureSetting.LiveRecoInfoFeatureConfig(false, false, new ArrayList(), new ArrayList());
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case 38369116:
                        if (strLJJJJ.equals("preview_reco_info_save_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRecoInfoFeatureConfig.setPreviewRecoInfoSaveConfigs(C473040Igo.LIZ(this.LIZ, c09cu, LiveRecoInfoFeatureSetting.RecoInfoFeatureSaveConfig.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 302486934:
                        if (strLJJJJ.equals("enable_for_preview")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRecoInfoFeatureConfig.setEnableForPreview(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1291945931:
                        if (strLJJJJ.equals("inner_flow_reco_info_save_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRecoInfoFeatureConfig.setInnerFlowRecoInfoSaveConfigs(C473040Igo.LIZ(this.LIZ, c09cu, LiveRecoInfoFeatureSetting.RecoInfoFeatureSaveConfig.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1411794153:
                        if (strLJJJJ.equals("enable_for_inner_flow")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRecoInfoFeatureConfig.setEnableForInnerFlow(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
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
        return liveRecoInfoFeatureConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRecoInfoFeatureSetting.LiveRecoInfoFeatureConfig liveRecoInfoFeatureConfig) throws IOException {
        LiveRecoInfoFeatureSetting.LiveRecoInfoFeatureConfig liveRecoInfoFeatureConfig2 = liveRecoInfoFeatureConfig;
        if (liveRecoInfoFeatureConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_for_inner_flow");
        c09dl.LJJJJJL(liveRecoInfoFeatureConfig2.getEnableForInnerFlow());
        c09dl.LJIILLIIL("enable_for_preview");
        c09dl.LJJJJJL(liveRecoInfoFeatureConfig2.getEnableForPreview());
        c09dl.LJIILLIIL("preview_reco_info_save_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveRecoInfoFeatureConfig2.getPreviewRecoInfoSaveConfigs(), LiveRecoInfoFeatureSetting.RecoInfoFeatureSaveConfig.class);
        c09dl.LJIILLIIL("inner_flow_reco_info_save_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveRecoInfoFeatureConfig2.getInnerFlowRecoInfoSaveConfigs(), LiveRecoInfoFeatureSetting.RecoInfoFeatureSaveConfig.class);
        c09dl.LJII();
    }
}
