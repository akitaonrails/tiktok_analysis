package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
public final class FirstRechargePolicyParams_OptTypeAdapter extends TypeAdapter<FirstRechargePolicyParams> {
    public final Gson LIZ;

    public FirstRechargePolicyParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FirstRechargePolicyParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FirstRechargePolicyParams firstRechargePolicyParams = new FirstRechargePolicyParams(null, null, null, null, null, false, null, false, null, null, null, null, null, 8191, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1963524390:
                        if (strLJJJJ.equals("exchange_policy_starling_keys")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                firstRechargePolicyParams.exchangePolicyKey = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1266136874:
                        if (strLJJJJ.equals("recharge_policy_starling_keys")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                firstRechargePolicyParams.rechargePolicyKeyList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1249414251:
                        if (strLJJJJ.equals("live_room_recharge_agreement_for_global")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                firstRechargePolicyParams.rechargePolicyUrl = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -941189402:
                        if (strLJJJJ.equals("live_room_recharge_agreement_for_region")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                firstRechargePolicyParams.reginPolicy = (List) this.LIZ.LJIIIZ(new TypeToken<List<? extends Map<String, String>>>() { // from class: X.00Vd
                                }).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -606097418:
                        if (strLJJJJ.equals("exchange_policy_template_starling_key_ex")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                firstRechargePolicyParams.exExchangeTemplate = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -537074154:
                        if (strLJJJJ.equals("is_show_recharge_rule_in_region")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                firstRechargePolicyParams.isRegionRuleShow = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -442464711:
                        if (strLJJJJ.equals("recharge_policy_urls")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                firstRechargePolicyParams.rechargePolicyUrlList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -122318235:
                        if (strLJJJJ.equals("recharge_policy_template_starling_key_us")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                firstRechargePolicyParams.usRechargeTemplate = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -23053387:
                        if (strLJJJJ.equals("exchange_policy_urls")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                firstRechargePolicyParams.exchangePolicyUrl = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -597028:
                        if (strLJJJJ.equals("exchange_policy_template_starling_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                firstRechargePolicyParams.exchangeTemplate = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1760272189:
                        if (strLJJJJ.equals("recharge_policy_starling_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                firstRechargePolicyParams.rechargePolicyKey = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1933759736:
                        if (strLJJJJ.equals("disclaimer_for_US")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                firstRechargePolicyParams.usDisclaimer = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2139910616:
                        if (strLJJJJ.equals("recharge_policy_template_starling_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                firstRechargePolicyParams.rechargeTemplate = c09cu.LJJJZ();
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
        return firstRechargePolicyParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FirstRechargePolicyParams firstRechargePolicyParams) throws IOException {
        FirstRechargePolicyParams firstRechargePolicyParams2 = firstRechargePolicyParams;
        if (firstRechargePolicyParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("recharge_policy_template_starling_key_us");
        c09dl.LJJJJJ(firstRechargePolicyParams2.usRechargeTemplate);
        c09dl.LJIILLIIL("recharge_policy_template_starling_key");
        c09dl.LJJJJJ(firstRechargePolicyParams2.rechargeTemplate);
        c09dl.LJIILLIIL("exchange_policy_template_starling_key_ex");
        c09dl.LJJJJJ(firstRechargePolicyParams2.exExchangeTemplate);
        c09dl.LJIILLIIL("exchange_policy_template_starling_key");
        c09dl.LJJJJJ(firstRechargePolicyParams2.exchangeTemplate);
        c09dl.LJIILLIIL("recharge_policy_starling_key");
        c09dl.LJJJJJ(firstRechargePolicyParams2.rechargePolicyKey);
        c09dl.LJIILLIIL("disclaimer_for_US");
        c09dl.LJJJJJL(firstRechargePolicyParams2.usDisclaimer);
        c09dl.LJIILLIIL("live_room_recharge_agreement_for_global");
        c09dl.LJJJJJ(firstRechargePolicyParams2.rechargePolicyUrl);
        c09dl.LJIILLIIL("is_show_recharge_rule_in_region");
        c09dl.LJJJJJL(firstRechargePolicyParams2.isRegionRuleShow);
        c09dl.LJIILLIIL("live_room_recharge_agreement_for_region");
        this.LIZ.LJIIIZ(new TypeToken<List<? extends Map<String, String>>>() { // from class: X.00Ve
        }).write(c09dl, firstRechargePolicyParams2.reginPolicy);
        c09dl.LJIILLIIL("exchange_policy_starling_keys");
        C473040Igo.LIZLLL(this.LIZ, c09dl, firstRechargePolicyParams2.exchangePolicyKey, String.class);
        c09dl.LJIILLIIL("exchange_policy_urls");
        C473040Igo.LIZLLL(this.LIZ, c09dl, firstRechargePolicyParams2.exchangePolicyUrl, String.class);
        c09dl.LJIILLIIL("recharge_policy_urls");
        C473040Igo.LIZLLL(this.LIZ, c09dl, firstRechargePolicyParams2.rechargePolicyUrlList, String.class);
        c09dl.LJIILLIIL("recharge_policy_starling_keys");
        C473040Igo.LIZLLL(this.LIZ, c09dl, firstRechargePolicyParams2.rechargePolicyKeyList, String.class);
        c09dl.LJII();
    }
}
