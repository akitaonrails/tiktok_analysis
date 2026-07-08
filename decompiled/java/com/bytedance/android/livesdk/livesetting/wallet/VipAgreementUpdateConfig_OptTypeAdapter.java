package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class VipAgreementUpdateConfig_OptTypeAdapter extends TypeAdapter<VipAgreementUpdateConfig> {
    public final Gson LIZ;

    public VipAgreementUpdateConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final VipAgreementUpdateConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        VipAgreementUpdateConfig vipAgreementUpdateConfig = new VipAgreementUpdateConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                vipAgreementUpdateConfig.isEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 3076014:
                        if (strLJJJJ.equals("date")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                vipAgreementUpdateConfig.date = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1393725787:
                        if (strLJJJJ.equals("rp_link")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                vipAgreementUpdateConfig.rewardPolicyUrl = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1489316572:
                        if (strLJJJJ.equals("vip_link")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                vipAgreementUpdateConfig.virtualItemPolicyUrl = c09cu.LJJJZ();
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
        return vipAgreementUpdateConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, VipAgreementUpdateConfig vipAgreementUpdateConfig) throws IOException {
        VipAgreementUpdateConfig vipAgreementUpdateConfig2 = vipAgreementUpdateConfig;
        if (vipAgreementUpdateConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(vipAgreementUpdateConfig2.isEnable);
        c09dl.LJIILLIIL("date");
        c09dl.LJJIZ(vipAgreementUpdateConfig2.date);
        c09dl.LJIILLIIL("vip_link");
        c09dl.LJJJJJ(vipAgreementUpdateConfig2.virtualItemPolicyUrl);
        c09dl.LJIILLIIL("rp_link");
        c09dl.LJJJJJ(vipAgreementUpdateConfig2.rewardPolicyUrl);
        c09dl.LJII();
    }
}
