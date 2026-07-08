package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LinkMicPlayOptConfig_OptTypeAdapter extends TypeAdapter<LinkMicPlayOptConfig> {
    public final Gson LIZ;

    public LinkMicPlayOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LinkMicPlayOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkMicPlayOptConfig linkMicPlayOptConfig = new LinkMicPlayOptConfig(1, 1, 10000L, false, 15000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1864096651:
                        if (strLJJJJ.equals("mutex_finish_delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicPlayOptConfig.mutexFinishDelayTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1845436883:
                        if (strLJJJJ.equals("code_tech_switch_for_mutual_exclusion")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicPlayOptConfig.codeTechSwitchForMutualExclusion = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -746680602:
                        if (strLJJJJ.equals("code_tech_switch_for_live_show")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicPlayOptConfig.codeTechSwitchForLiveShow = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -131626193:
                        if (strLJJJJ.equals("force_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicPlayOptConfig.isForceDelay = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1356588279:
                        if (strLJJJJ.equals("entity_show_setting_page_time_out")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicPlayOptConfig.entityShowSettingPageTimeOut = c09cu.LJJJ();
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
        return linkMicPlayOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicPlayOptConfig linkMicPlayOptConfig) throws IOException {
        LinkMicPlayOptConfig linkMicPlayOptConfig2 = linkMicPlayOptConfig;
        if (linkMicPlayOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("code_tech_switch_for_live_show");
        c09dl.LJJJJ(Integer.valueOf(linkMicPlayOptConfig2.codeTechSwitchForLiveShow));
        c09dl.LJIILLIIL("code_tech_switch_for_mutual_exclusion");
        c09dl.LJJJJ(Integer.valueOf(linkMicPlayOptConfig2.codeTechSwitchForMutualExclusion));
        c09dl.LJIILLIIL("mutex_finish_delay_time");
        c09dl.LJJIZ(linkMicPlayOptConfig2.mutexFinishDelayTime);
        c09dl.LJIILLIIL("force_delay");
        c09dl.LJJJJJL(linkMicPlayOptConfig2.isForceDelay);
        c09dl.LJIILLIIL("entity_show_setting_page_time_out");
        c09dl.LJJIZ(linkMicPlayOptConfig2.entityShowSettingPageTimeOut);
        c09dl.LJII();
    }
}
