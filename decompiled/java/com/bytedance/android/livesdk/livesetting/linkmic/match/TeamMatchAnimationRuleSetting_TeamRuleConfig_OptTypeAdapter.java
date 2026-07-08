package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.match.TeamMatchAnimationRuleSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class TeamMatchAnimationRuleSetting_TeamRuleConfig_OptTypeAdapter extends TypeAdapter<TeamMatchAnimationRuleSetting.TeamRuleConfig> {
    public final Gson LIZ;

    public TeamMatchAnimationRuleSetting_TeamRuleConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TeamMatchAnimationRuleSetting.TeamRuleConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TeamMatchAnimationRuleSetting.TeamRuleConfig teamRuleConfig = new TeamMatchAnimationRuleSetting.TeamRuleConfig(null, null, null, null, null, null, null, null, false, 511, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1690261742:
                        if (strLJJJJ.equals("red_team_image_arrays")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                teamRuleConfig.redTeamImageArrays = (List) this.LIZ.LJIIIZ(new TypeToken<List<? extends List<? extends String>>>() { // from class: X.04XD
                                }).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1321694675:
                        if (strLJJJJ.equals("gecko_channel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                teamRuleConfig.geckoChannel = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1316467858:
                        if (strLJJJJ.equals("file_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                teamRuleConfig.fileName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1024685229:
                        if (strLJJJJ.equals("blue_team_badge_arrays")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                teamRuleConfig.blueTeamBadgeArrays = (List) this.LIZ.LJIIIZ(new TypeToken<List<? extends List<? extends String>>>() { // from class: X.04XG
                                }).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -844245972:
                        if (strLJJJJ.equals("red_layer_names")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                teamRuleConfig.redLayerNames = (List) this.LIZ.LJIIIZ(new TypeToken<List<? extends List<? extends String>>>() { // from class: X.04XB
                                }).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 379854491:
                        if (strLJJJJ.equals("blue_team_image_arrays")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                teamRuleConfig.blueTeamImageArrays = (List) this.LIZ.LJIIIZ(new TypeToken<List<? extends List<? extends String>>>() { // from class: X.04XE
                                }).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 415229557:
                        if (strLJJJJ.equals("blue_layer_names")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                teamRuleConfig.blueLayerNames = (List) this.LIZ.LJIIIZ(new TypeToken<List<? extends List<? extends String>>>() { // from class: X.04XC
                                }).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1109518305:
                        if (strLJJJJ.equals("show_badge")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                teamRuleConfig.showBadge = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1200165834:
                        if (strLJJJJ.equals("red_team_badge_arrays")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                teamRuleConfig.redTeamBadgeArrays = (List) this.LIZ.LJIIIZ(new TypeToken<List<? extends List<? extends String>>>() { // from class: X.04XF
                                }).read(c09cu);
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
        return teamRuleConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TeamMatchAnimationRuleSetting.TeamRuleConfig teamRuleConfig) throws IOException {
        TeamMatchAnimationRuleSetting.TeamRuleConfig teamRuleConfig2 = teamRuleConfig;
        if (teamRuleConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("gecko_channel");
        c09dl.LJJJJJ(teamRuleConfig2.geckoChannel);
        c09dl.LJIILLIIL("file_name");
        c09dl.LJJJJJ(teamRuleConfig2.fileName);
        c09dl.LJIILLIIL("red_layer_names");
        this.LIZ.LJIIIZ(new TypeToken<List<? extends List<? extends String>>>() { // from class: X.04XH
        }).write(c09dl, teamRuleConfig2.redLayerNames);
        c09dl.LJIILLIIL("blue_layer_names");
        this.LIZ.LJIIIZ(new TypeToken<List<? extends List<? extends String>>>() { // from class: X.04XI
        }).write(c09dl, teamRuleConfig2.blueLayerNames);
        c09dl.LJIILLIIL("red_team_image_arrays");
        this.LIZ.LJIIIZ(new TypeToken<List<? extends List<? extends String>>>() { // from class: X.04XJ
        }).write(c09dl, teamRuleConfig2.redTeamImageArrays);
        c09dl.LJIILLIIL("blue_team_image_arrays");
        this.LIZ.LJIIIZ(new TypeToken<List<? extends List<? extends String>>>() { // from class: X.04XK
        }).write(c09dl, teamRuleConfig2.blueTeamImageArrays);
        c09dl.LJIILLIIL("red_team_badge_arrays");
        this.LIZ.LJIIIZ(new TypeToken<List<? extends List<? extends String>>>() { // from class: X.04XL
        }).write(c09dl, teamRuleConfig2.redTeamBadgeArrays);
        c09dl.LJIILLIIL("blue_team_badge_arrays");
        this.LIZ.LJIIIZ(new TypeToken<List<? extends List<? extends String>>>() { // from class: X.04XM
        }).write(c09dl, teamRuleConfig2.blueTeamBadgeArrays);
        c09dl.LJIILLIIL("show_badge");
        c09dl.LJJJJJL(teamRuleConfig2.showBadge);
        c09dl.LJII();
    }
}
