package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.wallet.WalletEntranceBalanceShownSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes28.dex */
public final class WalletEntranceBalanceShownSetting_WalletEntranceConfig_OptTypeAdapter extends TypeAdapter<WalletEntranceBalanceShownSetting.WalletEntranceConfig> {
    public final Gson LIZ;

    public WalletEntranceBalanceShownSetting_WalletEntranceConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final WalletEntranceBalanceShownSetting.WalletEntranceConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        WalletEntranceBalanceShownSetting.WalletEntranceConfig walletEntranceConfig = new WalletEntranceBalanceShownSetting.WalletEntranceConfig(false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1058384853) {
                    if (iHashCode != -354161224) {
                        if (iHashCode == 1102422938 && strLJJJJ.equals("show_balance")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                walletEntranceConfig.setShowBalance(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("show_entrance")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            walletEntranceConfig.setShowInNavBar(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("show_b_account_balance")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        walletEntranceConfig.setShowBAccountBalance(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return walletEntranceConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, WalletEntranceBalanceShownSetting.WalletEntranceConfig walletEntranceConfig) throws IOException {
        WalletEntranceBalanceShownSetting.WalletEntranceConfig walletEntranceConfig2 = walletEntranceConfig;
        if (walletEntranceConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("show_entrance");
        c09dl.LJJJJJL(walletEntranceConfig2.getShowInNavBar());
        c09dl.LJIILLIIL("show_balance");
        c09dl.LJJJJJL(walletEntranceConfig2.getShowBalance());
        c09dl.LJIILLIIL("show_b_account_balance");
        c09dl.LJJJJJL(walletEntranceConfig2.getShowBAccountBalance());
        c09dl.LJII();
    }
}
