package com.bytedance.android.livesdk.livesetting.message;

import X.C001A;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1697810uHb;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes35.dex */
public final class LiveIMMessageTrackConfig_OptTypeAdapter extends TypeAdapter<LiveIMMessageTrackConfig> {
    public final Gson LIZ;

    public LiveIMMessageTrackConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveIMMessageTrackConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveIMMessageTrackConfig liveIMMessageTrackConfig = new LiveIMMessageTrackConfig(1.0E-4d, 1.0d, C1697810uHb.LJIIJJI(C001A.GIFT.wsMethod, C001A.DOODLE_GIFT.wsMethod, C001A.FREE_CELL_GIFT_MESSAGE.wsMethod, C001A.ASSET_MESSAGE.wsMethod, C001A.BINDING_GIFT_MESSAGE.wsMethod, C001A.TRAY_MESSAGE.wsMethod, C001A.GIFT_GLOBAL_MESSAGE.wsMethod), C1697810uHb.LJIIJJI(C001A.LINK_MIC.wsMethod, C001A.LINK_MESSAGE.wsMethod));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -629024255:
                        if (strLJJJJ.equals("anchor_ratio")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveIMMessageTrackConfig.setAnchorRatio((LiveMessageSampleType) this.LIZ.LJIIJ(LiveMessageSampleType.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -205270300:
                        if (strLJJJJ.equals("common_sampling_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveIMMessageTrackConfig.setSamplingRate(c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 338843974:
                        if (strLJJJJ.equals("allow_method_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveIMMessageTrackConfig.setAllowedMethods(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 465590389:
                        if (strLJJJJ.equals("allow_p2p_method_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveIMMessageTrackConfig.setAllowedP2PMethods(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1730335399:
                        if (strLJJJJ.equals("p2p_sampling_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveIMMessageTrackConfig.setP2pFullSampling(c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1945700880:
                        if (strLJJJJ.equals("audience_ratio")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveIMMessageTrackConfig.setAudienceRatio((LiveMessageSampleType) this.LIZ.LJIIJ(LiveMessageSampleType.class).read(c09cu));
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
        return liveIMMessageTrackConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveIMMessageTrackConfig liveIMMessageTrackConfig) throws IOException {
        LiveIMMessageTrackConfig liveIMMessageTrackConfig2 = liveIMMessageTrackConfig;
        if (liveIMMessageTrackConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("common_sampling_rate");
        c09dl.LJJIL(liveIMMessageTrackConfig2.getSamplingRate());
        c09dl.LJIILLIIL("p2p_sampling_rate");
        c09dl.LJJIL(liveIMMessageTrackConfig2.getP2pFullSampling());
        c09dl.LJIILLIIL("allow_method_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveIMMessageTrackConfig2.getAllowedMethods(), String.class);
        c09dl.LJIILLIIL("allow_p2p_method_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveIMMessageTrackConfig2.getAllowedP2PMethods(), String.class);
        c09dl.LJIILLIIL("anchor_ratio");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(LiveMessageSampleType.class);
        typeAdapterLJIIJ.write(c09dl, liveIMMessageTrackConfig2.getAnchorRatio());
        c09dl.LJIILLIIL("audience_ratio");
        typeAdapterLJIIJ.write(c09dl, liveIMMessageTrackConfig2.getAudienceRatio());
        c09dl.LJII();
    }
}
