package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveWalletEmailIncentiveParams_OptTypeAdapter extends TypeAdapter<LiveWalletEmailIncentiveParams> {
    public final Gson LIZ;

    public LiveWalletEmailIncentiveParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveWalletEmailIncentiveParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveWalletEmailIncentiveParams liveWalletEmailIncentiveParams = new LiveWalletEmailIncentiveParams(false, 900L, 0, "", 10, 2, 10000L, 86400L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2125756512:
                        if (strLJJJJ.equals("after_recharge_cooldown_seconds")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveWalletEmailIncentiveParams.cooldownSeconds = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1963566841:
                        if (strLJJJJ.equals("api_call_cooldown_seconds")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveWalletEmailIncentiveParams.apiCallCooldown = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1250692576:
                        if (strLJJJJ.equals("feature_available_for_user")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveWalletEmailIncentiveParams.inExp = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -718635104:
                        if (strLJJJJ.equals("cashback_percent")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveWalletEmailIncentiveParams.cashbackPercent = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -159062103:
                        if (strLJJJJ.equals("api_timeout_millis")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveWalletEmailIncentiveParams.apiTimeoutMillis = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 804742022:
                        if (strLJJJJ.equals("cashback_max_usd")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveWalletEmailIncentiveParams.cashbackMaxUsd = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 913029590:
                        if (strLJJJJ.equals("email_incentive_max_show_times")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveWalletEmailIncentiveParams.incentivePopupMaxShowTimes = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1009509836:
                        if (strLJJJJ.equals("email_voucher_template_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveWalletEmailIncentiveParams.emailVoucherTemplateId = c09cu.LJJJZ();
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
        return liveWalletEmailIncentiveParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveWalletEmailIncentiveParams liveWalletEmailIncentiveParams) throws IOException {
        LiveWalletEmailIncentiveParams liveWalletEmailIncentiveParams2 = liveWalletEmailIncentiveParams;
        if (liveWalletEmailIncentiveParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("feature_available_for_user");
        c09dl.LJJJJJL(liveWalletEmailIncentiveParams2.inExp);
        c09dl.LJIILLIIL("api_call_cooldown_seconds");
        c09dl.LJJIZ(liveWalletEmailIncentiveParams2.apiCallCooldown);
        c09dl.LJIILLIIL("email_incentive_max_show_times");
        c09dl.LJJJJ(Integer.valueOf(liveWalletEmailIncentiveParams2.incentivePopupMaxShowTimes));
        c09dl.LJIILLIIL("email_voucher_template_id");
        c09dl.LJJJJJ(liveWalletEmailIncentiveParams2.emailVoucherTemplateId);
        c09dl.LJIILLIIL("cashback_max_usd");
        c09dl.LJJJJ(Integer.valueOf(liveWalletEmailIncentiveParams2.cashbackMaxUsd));
        c09dl.LJIILLIIL("cashback_percent");
        c09dl.LJJJJ(Integer.valueOf(liveWalletEmailIncentiveParams2.cashbackPercent));
        c09dl.LJIILLIIL("api_timeout_millis");
        c09dl.LJJIZ(liveWalletEmailIncentiveParams2.apiTimeoutMillis);
        c09dl.LJIILLIIL("after_recharge_cooldown_seconds");
        c09dl.LJJIZ(liveWalletEmailIncentiveParams2.cooldownSeconds);
        c09dl.LJII();
    }
}
