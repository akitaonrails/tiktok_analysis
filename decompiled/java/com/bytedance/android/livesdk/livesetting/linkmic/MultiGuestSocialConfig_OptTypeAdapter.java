package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestSocialConfig_OptTypeAdapter extends TypeAdapter<MultiGuestSocialConfig> {
    @Override // com.google.gson.TypeAdapter
    public final MultiGuestSocialConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestSocialConfig multiGuestSocialConfig = new MultiGuestSocialConfig(120L, 500L, 10L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -715072544) {
                    if (iHashCode != -686599219) {
                        if (iHashCode == 430898897 && strLJJJJ.equals("random_match_join_timeout_second")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestSocialConfig.joinTimeOutSecond = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("random_match_auto_permit_mills")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            multiGuestSocialConfig.randomMatchAutoPermitMills = c09cu.LJJJ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("random_match_v1_timeout_second")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiGuestSocialConfig.randomMatchTimeoutSecond = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return multiGuestSocialConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestSocialConfig multiGuestSocialConfig) throws IOException {
        MultiGuestSocialConfig multiGuestSocialConfig2 = multiGuestSocialConfig;
        if (multiGuestSocialConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("random_match_v1_timeout_second");
        c09dl.LJJIZ(multiGuestSocialConfig2.randomMatchTimeoutSecond);
        c09dl.LJIILLIIL("random_match_auto_permit_mills");
        c09dl.LJJIZ(multiGuestSocialConfig2.randomMatchAutoPermitMills);
        c09dl.LJIILLIIL("random_match_join_timeout_second");
        c09dl.LJJIZ(multiGuestSocialConfig2.joinTimeOutSecond);
        c09dl.LJII();
    }
}
