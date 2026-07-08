package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.InteractionSourceTypeMatchStatusMap;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class InteractionSourceTypeMatchStatusMap_Configs_OptTypeAdapter extends TypeAdapter<InteractionSourceTypeMatchStatusMap.Configs> {
    public final Gson LIZ;

    public InteractionSourceTypeMatchStatusMap_Configs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final InteractionSourceTypeMatchStatusMap.Configs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        InteractionSourceTypeMatchStatusMap.Configs configs = new InteractionSourceTypeMatchStatusMap.Configs(false, null, null, null, null, null, 63, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1974196466:
                        if (strLJJJJ.equals("inviter_from_friend_rank")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.inviterFromFriendRank = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1402858454:
                        if (strLJJJJ.equals("auto_match_inviter_quick_recommend")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.autoMatchInviterRecommend = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1203315702:
                        if (strLJJJJ.equals("inviter_from_profile")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.inviterFromProfile = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -718048596:
                        if (strLJJJJ.equals("auto_match_inviter_quick_pair")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.autoMatchInviterPair = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -708170118:
                        if (strLJJJJ.equals("solo_inviter_from_jsb")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.soloInviterFromJSB = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -109284052:
                        if (strLJJJJ.equals("is_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.isEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return configs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, InteractionSourceTypeMatchStatusMap.Configs configs) throws IOException {
        InteractionSourceTypeMatchStatusMap.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enabled");
        c09dl.LJJJJJL(configs2.isEnabled);
        c09dl.LJIILLIIL("solo_inviter_from_jsb");
        Gson gson = this.LIZ;
        List<Integer> list = configs2.soloInviterFromJSB;
        Class cls = Integer.TYPE;
        C473040Igo.LIZLLL(gson, c09dl, list, cls);
        c09dl.LJIILLIIL("auto_match_inviter_quick_pair");
        C473040Igo.LIZLLL(this.LIZ, c09dl, configs2.autoMatchInviterPair, cls);
        c09dl.LJIILLIIL("auto_match_inviter_quick_recommend");
        C473040Igo.LIZLLL(this.LIZ, c09dl, configs2.autoMatchInviterRecommend, cls);
        c09dl.LJIILLIIL("inviter_from_profile");
        C473040Igo.LIZLLL(this.LIZ, c09dl, configs2.inviterFromProfile, cls);
        c09dl.LJIILLIIL("inviter_from_friend_rank");
        C473040Igo.LIZLLL(this.LIZ, c09dl, configs2.inviterFromFriendRank, cls);
        c09dl.LJII();
    }
}
