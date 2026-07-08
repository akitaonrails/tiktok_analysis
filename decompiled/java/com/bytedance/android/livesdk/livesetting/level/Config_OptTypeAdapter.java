package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class Config_OptTypeAdapter extends TypeAdapter<Config> {
    public final Gson LIZ;

    public Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        Config config = new Config(true, true, true, true, null, null, 600L, 60L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1961080280:
                        if (strLJJJJ.equals("expire_points_message_switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.expirePointSwitch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1636596909:
                        if (strLJJJJ.equals("new_fans_claim_webp_resource_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.newFansClaimWebpResConfig = C473040Igo.LIZ(this.LIZ, c09cu, FansClaimResConfig.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1426683138:
                        if (strLJJJJ.equals("first_claim_message_switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.firstTimeClaimMessage = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -379422863:
                        if (strLJJJJ.equals("new_claim_animation_switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.newClaimAnimationSwitch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -25103242:
                        if (strLJJJJ.equals("new_join_complete_task_message_switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.newJoinCompleteTaskSwitch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 764413823:
                        if (strLJJJJ.equals("system_message_block_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.systemMessageBlockInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1184409074:
                        if (strLJJJJ.equals("fans_claim_webp_resource_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.fansClaimWebpResConfig = C473040Igo.LIZ(this.LIZ, c09cu, FansClaimResConfig.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1608710281:
                        if (strLJJJJ.equals("points_expire_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.pointsExpireInterval = c09cu.LJJJ();
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
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Config config) throws IOException {
        Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("first_claim_message_switch");
        c09dl.LJJJJJL(config2.firstTimeClaimMessage);
        c09dl.LJIILLIIL("new_join_complete_task_message_switch");
        c09dl.LJJJJJL(config2.newJoinCompleteTaskSwitch);
        c09dl.LJIILLIIL("expire_points_message_switch");
        c09dl.LJJJJJL(config2.expirePointSwitch);
        c09dl.LJIILLIIL("new_claim_animation_switch");
        c09dl.LJJJJJL(config2.newClaimAnimationSwitch);
        c09dl.LJIILLIIL("fans_claim_webp_resource_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, config2.fansClaimWebpResConfig, FansClaimResConfig.class);
        c09dl.LJIILLIIL("new_fans_claim_webp_resource_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, config2.newFansClaimWebpResConfig, FansClaimResConfig.class);
        c09dl.LJIILLIIL("points_expire_interval");
        c09dl.LJJIZ(config2.pointsExpireInterval);
        c09dl.LJIILLIIL("system_message_block_interval");
        c09dl.LJJIZ(config2.systemMessageBlockInterval);
        c09dl.LJII();
    }
}
