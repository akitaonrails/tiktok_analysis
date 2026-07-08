package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class MatchInviterPanelLynxConfig_OptTypeAdapter extends TypeAdapter<MatchInviterPanelLynxConfig> {
    public final Gson LIZ;

    public MatchInviterPanelLynxConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MatchInviterPanelLynxConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MatchInviterPanelLynxConfig matchInviterPanelLynxConfig = new MatchInviterPanelLynxConfig(false, 1, 3, 3, true, "aweme://roma_redirect/?spark_page=live_match_panel_inner_part", false, "tiktok_live_tt_live_lynx_match_panel", false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1773273785:
                        if (strLJJJJ.equals("lynx_url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchInviterPanelLynxConfig.lynxUrl = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1609594047:
                        if (strLJJJJ.equals("enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchInviterPanelLynxConfig.enabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -879064279:
                        if (strLJJJJ.equals("two_person_default_match_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchInviterPanelLynxConfig.twoPersonDefaultMatchType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -449270942:
                        if (strLJJJJ.equals("resource_fetch_trigger_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchInviterPanelLynxConfig.resourceFetchTriggerKey = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 203987331:
                        if (strLJJJJ.equals("four_person_default_match_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchInviterPanelLynxConfig.fourPersonDefaultMatchType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 213781499:
                        if (strLJJJJ.equals("three_person_default_match_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchInviterPanelLynxConfig.threePersonDefaultMatchType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 524058937:
                        if (strLJJJJ.equals("is_team_pair_support_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchInviterPanelLynxConfig.isTeamPairSupportEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 951912930:
                        if (strLJJJJ.equals("skip_match_mode_panel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchInviterPanelLynxConfig.skipMatchModePanel = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1488404137:
                        if (strLJJJJ.equals("is_guide_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchInviterPanelLynxConfig.isGuideEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return matchInviterPanelLynxConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MatchInviterPanelLynxConfig matchInviterPanelLynxConfig) throws IOException {
        MatchInviterPanelLynxConfig matchInviterPanelLynxConfig2 = matchInviterPanelLynxConfig;
        if (matchInviterPanelLynxConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(matchInviterPanelLynxConfig2.enabled);
        c09dl.LJIILLIIL("two_person_default_match_type");
        c09dl.LJJJJ(Integer.valueOf(matchInviterPanelLynxConfig2.twoPersonDefaultMatchType));
        c09dl.LJIILLIIL("three_person_default_match_type");
        c09dl.LJJJJ(Integer.valueOf(matchInviterPanelLynxConfig2.threePersonDefaultMatchType));
        c09dl.LJIILLIIL("four_person_default_match_type");
        c09dl.LJJJJ(Integer.valueOf(matchInviterPanelLynxConfig2.fourPersonDefaultMatchType));
        c09dl.LJIILLIIL("skip_match_mode_panel");
        c09dl.LJJJJJL(matchInviterPanelLynxConfig2.skipMatchModePanel);
        c09dl.LJIILLIIL("lynx_url");
        c09dl.LJJJJJ(matchInviterPanelLynxConfig2.lynxUrl);
        c09dl.LJIILLIIL("is_team_pair_support_enabled");
        c09dl.LJJJJJL(matchInviterPanelLynxConfig2.isTeamPairSupportEnabled);
        c09dl.LJIILLIIL("resource_fetch_trigger_key");
        c09dl.LJJJJJ(matchInviterPanelLynxConfig2.resourceFetchTriggerKey);
        c09dl.LJIILLIIL("is_guide_enabled");
        c09dl.LJJJJJL(matchInviterPanelLynxConfig2.isGuideEnabled);
        c09dl.LJII();
    }
}
