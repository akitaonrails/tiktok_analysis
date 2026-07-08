package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveWalletRechargeSchema_OptTypeAdapter extends TypeAdapter<LiveWalletRechargeSchema> {
    public final Gson LIZ;

    public LiveWalletRechargeSchema_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveWalletRechargeSchema read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveWalletRechargeSchema liveWalletRechargeSchema = new LiveWalletRechargeSchema();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2066654926:
                        if (strLJJJJ.equals("recharge_payment_success")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveWalletRechargeSchema.rechargePaymentSuccess = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1759674573:
                        if (strLJJJJ.equals("cashback_info")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveWalletRechargeSchema.cashbackInfo = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -655589925:
                        if (strLJJJJ.equals("email_notification_popup")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveWalletRechargeSchema.emailNotificationPopup = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 440806481:
                        if (strLJJJJ.equals("recharge_recommendation")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveWalletRechargeSchema.rechargeRecommendation = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 955722224:
                        if (strLJJJJ.equals("recharge_guidance")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveWalletRechargeSchema.rechargeGuidance = (LiveWalletRechargeGuidance) this.LIZ.LJIIJ(LiveWalletRechargeGuidance.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1080795695:
                        if (strLJJJJ.equals("exchange_retention_popup")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveWalletRechargeSchema.exchangeRetentionPopup = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1823395032:
                        if (strLJJJJ.equals("cancel_recharge_retention_popup")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveWalletRechargeSchema.cancelRetentionPopup = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1925236802:
                        if (strLJJJJ.equals("fundamentals_transaction_history")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveWalletRechargeSchema.transactionHistory = c09cu.LJJJZ();
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
        return liveWalletRechargeSchema;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveWalletRechargeSchema liveWalletRechargeSchema) {
        LiveWalletRechargeSchema liveWalletRechargeSchema2 = liveWalletRechargeSchema;
        if (liveWalletRechargeSchema2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("cashback_info");
        c09dl.LJJJJJ(liveWalletRechargeSchema2.cashbackInfo);
        c09dl.LJIILLIIL("recharge_payment_success");
        c09dl.LJJJJJ(liveWalletRechargeSchema2.rechargePaymentSuccess);
        c09dl.LJIILLIIL("exchange_retention_popup");
        c09dl.LJJJJJ(liveWalletRechargeSchema2.exchangeRetentionPopup);
        c09dl.LJIILLIIL("recharge_guidance");
        this.LIZ.LJIIJ(LiveWalletRechargeGuidance.class).write(c09dl, liveWalletRechargeSchema2.rechargeGuidance);
        c09dl.LJIILLIIL("fundamentals_transaction_history");
        c09dl.LJJJJJ(liveWalletRechargeSchema2.transactionHistory);
        c09dl.LJIILLIIL("email_notification_popup");
        c09dl.LJJJJJ(liveWalletRechargeSchema2.emailNotificationPopup);
        c09dl.LJIILLIIL("recharge_recommendation");
        c09dl.LJJJJJ(liveWalletRechargeSchema2.rechargeRecommendation);
        c09dl.LJIILLIIL("cancel_recharge_retention_popup");
        c09dl.LJJJJJ(liveWalletRechargeSchema2.cancelRetentionPopup);
        c09dl.LJII();
    }
}
