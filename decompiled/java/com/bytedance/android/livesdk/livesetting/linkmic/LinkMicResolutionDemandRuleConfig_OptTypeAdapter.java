package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LinkMicResolutionDemandRuleConfig_OptTypeAdapter extends TypeAdapter<LinkMicResolutionDemandRuleConfig> {
    public final Gson LIZ;

    public LinkMicResolutionDemandRuleConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LinkMicResolutionDemandRuleConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkMicResolutionDemandRuleConfig linkMicResolutionDemandRuleConfig = new LinkMicResolutionDemandRuleConfig(false, null, null, false, false, 0.0d, 63, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicResolutionDemandRuleConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1233949911:
                        if (strLJJJJ.equals("layout_white_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicResolutionDemandRuleConfig.setLayoutWhiteList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 322416255:
                        if (strLJJJJ.equals("enable_send_im")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicResolutionDemandRuleConfig.setEnableSendIm(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 946905148:
                        if (strLJJJJ.equals("enable_receive_im")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicResolutionDemandRuleConfig.setEnableReceiveIm(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1116509884:
                        if (strLJJJJ.equals("demand_trigger_ratio_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicResolutionDemandRuleConfig.setDemandTriggerRatioThreshold(c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1164483859:
                        if (strLJJJJ.equals("layout_black_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicResolutionDemandRuleConfig.setLayoutBlackList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
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
        return linkMicResolutionDemandRuleConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicResolutionDemandRuleConfig linkMicResolutionDemandRuleConfig) throws IOException {
        LinkMicResolutionDemandRuleConfig linkMicResolutionDemandRuleConfig2 = linkMicResolutionDemandRuleConfig;
        if (linkMicResolutionDemandRuleConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(linkMicResolutionDemandRuleConfig2.getEnable());
        c09dl.LJIILLIIL("layout_white_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, linkMicResolutionDemandRuleConfig2.getLayoutWhiteList(), String.class);
        c09dl.LJIILLIIL("layout_black_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, linkMicResolutionDemandRuleConfig2.getLayoutBlackList(), String.class);
        c09dl.LJIILLIIL("enable_send_im");
        c09dl.LJJJJJL(linkMicResolutionDemandRuleConfig2.getEnableSendIm());
        c09dl.LJIILLIIL("enable_receive_im");
        c09dl.LJJJJJL(linkMicResolutionDemandRuleConfig2.getEnableReceiveIm());
        c09dl.LJIILLIIL("demand_trigger_ratio_threshold");
        c09dl.LJJIL(linkMicResolutionDemandRuleConfig2.getDemandTriggerRatioThreshold());
        c09dl.LJII();
    }
}
