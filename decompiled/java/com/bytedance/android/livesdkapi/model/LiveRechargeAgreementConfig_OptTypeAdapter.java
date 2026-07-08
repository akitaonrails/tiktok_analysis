package com.bytedance.android.livesdkapi.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdkapi.model.LiveRechargeAgreementConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveRechargeAgreementConfig_OptTypeAdapter extends TypeAdapter<LiveRechargeAgreementConfig> {
    public final Gson LIZ;

    public LiveRechargeAgreementConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveRechargeAgreementConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRechargeAgreementConfig liveRechargeAgreementConfig = new LiveRechargeAgreementConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1582978368:
                        if (strLJJJJ.equals("is_show_recharge_rule_in_US")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRechargeAgreementConfig.isShowRechargeLawInUS = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1249414251:
                        if (strLJJJJ.equals("live_room_recharge_agreement_for_global")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRechargeAgreementConfig.agreementForGlobal = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -941189402:
                        if (strLJJJJ.equals("live_room_recharge_agreement_for_region")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRechargeAgreementConfig.agreementsForRegion = C473040Igo.LIZ(this.LIZ, c09cu, LiveRechargeAgreementConfig.AgreementForRegion.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -845299003:
                        if (strLJJJJ.equals("is_show_recharge_rule_in_global")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRechargeAgreementConfig.isShowRechargeLawInGlobal = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -537074154:
                        if (strLJJJJ.equals("is_show_recharge_rule_in_region")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRechargeAgreementConfig.isShowRechargeLawInRegion = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 388987796:
                        if (strLJJJJ.equals("frozen_coins_policy_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRechargeAgreementConfig.isFrozenCoinsPolicyEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1282741206:
                        if (strLJJJJ.equals("retention_task_policy_body")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRechargeAgreementConfig.retentionTaskPolicyBody = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1283033646:
                        if (strLJJJJ.equals("retention_task_policy_link")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRechargeAgreementConfig.retentionTaskPolicyLink = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1283085503:
                        if (strLJJJJ.equals("retention_task_policy_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRechargeAgreementConfig.retentionTaskPolicyName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1709883852:
                        if (strLJJJJ.equals("live_room_recharge_vip_key_frozen_coins")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRechargeAgreementConfig.lawNameKeyForFrozenCoins = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1968399967:
                        if (strLJJJJ.equals("live_room_recharge_agreement_frozen_coins")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRechargeAgreementConfig.agreementKeyForFrozenCoins = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2028598094:
                        if (strLJJJJ.equals("frozen_coins_policy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRechargeAgreementConfig.frozenCoinsPolicyUrl = c09cu.LJJJZ();
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
        return liveRechargeAgreementConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRechargeAgreementConfig liveRechargeAgreementConfig) throws IOException {
        LiveRechargeAgreementConfig liveRechargeAgreementConfig2 = liveRechargeAgreementConfig;
        if (liveRechargeAgreementConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_show_recharge_rule_in_global");
        c09dl.LJJJJJL(liveRechargeAgreementConfig2.isShowRechargeLawInGlobal);
        c09dl.LJIILLIIL("is_show_recharge_rule_in_US");
        c09dl.LJJJJJL(liveRechargeAgreementConfig2.isShowRechargeLawInUS);
        c09dl.LJIILLIIL("live_room_recharge_agreement_for_global");
        c09dl.LJJJJJ(liveRechargeAgreementConfig2.agreementForGlobal);
        c09dl.LJIILLIIL("is_show_recharge_rule_in_region");
        c09dl.LJJJJJL(liveRechargeAgreementConfig2.isShowRechargeLawInRegion);
        c09dl.LJIILLIIL("live_room_recharge_agreement_for_region");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveRechargeAgreementConfig2.agreementsForRegion, LiveRechargeAgreementConfig.AgreementForRegion.class);
        c09dl.LJIILLIIL("frozen_coins_policy_enable");
        c09dl.LJJJJJL(liveRechargeAgreementConfig2.isFrozenCoinsPolicyEnable);
        c09dl.LJIILLIIL("frozen_coins_policy");
        c09dl.LJJJJJ(liveRechargeAgreementConfig2.frozenCoinsPolicyUrl);
        c09dl.LJIILLIIL("live_room_recharge_agreement_frozen_coins");
        c09dl.LJJJJJ(liveRechargeAgreementConfig2.agreementKeyForFrozenCoins);
        c09dl.LJIILLIIL("live_room_recharge_vip_key_frozen_coins");
        c09dl.LJJJJJ(liveRechargeAgreementConfig2.lawNameKeyForFrozenCoins);
        c09dl.LJIILLIIL("retention_task_policy_body");
        c09dl.LJJJJJ(liveRechargeAgreementConfig2.retentionTaskPolicyBody);
        c09dl.LJIILLIIL("retention_task_policy_name");
        c09dl.LJJJJJ(liveRechargeAgreementConfig2.retentionTaskPolicyName);
        c09dl.LJIILLIIL("retention_task_policy_link");
        c09dl.LJJJJJ(liveRechargeAgreementConfig2.retentionTaskPolicyLink);
        c09dl.LJII();
    }
}
