package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchStartAnimationRuleSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class MatchStartAnimationRuleSetting_RuleConfig_OptTypeAdapter extends TypeAdapter<MatchStartAnimationRuleSetting.RuleConfig> {
    public final Gson LIZ;

    public MatchStartAnimationRuleSetting_RuleConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MatchStartAnimationRuleSetting.RuleConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MatchStartAnimationRuleSetting.RuleConfig ruleConfig = new MatchStartAnimationRuleSetting.RuleConfig(null, null, null, null, null, 31, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1710173733:
                        if (strLJJJJ.equals("win_streak_array")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                ruleConfig.winStreakArray = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1321694675:
                        if (strLJJJJ.equals("gecko_channel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                ruleConfig.geckoChannel = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1316467858:
                        if (strLJJJJ.equals("file_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                ruleConfig.fileName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -586059789:
                        if (strLJJJJ.equals("avatar_array")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                ruleConfig.avatarArray = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 888178761:
                        if (strLJJJJ.equals("league_array")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                ruleConfig.leagueArray = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
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
        return ruleConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MatchStartAnimationRuleSetting.RuleConfig ruleConfig) {
        MatchStartAnimationRuleSetting.RuleConfig ruleConfig2 = ruleConfig;
        if (ruleConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("gecko_channel");
        c09dl.LJJJJJ(ruleConfig2.geckoChannel);
        c09dl.LJIILLIIL("file_name");
        c09dl.LJJJJJ(ruleConfig2.fileName);
        c09dl.LJIILLIIL("avatar_array");
        C473040Igo.LIZLLL(this.LIZ, c09dl, ruleConfig2.avatarArray, String.class);
        c09dl.LJIILLIIL("win_streak_array");
        C473040Igo.LIZLLL(this.LIZ, c09dl, ruleConfig2.winStreakArray, String.class);
        c09dl.LJIILLIIL("league_array");
        C473040Igo.LIZLLL(this.LIZ, c09dl, ruleConfig2.leagueArray, String.class);
        c09dl.LJII();
    }
}
