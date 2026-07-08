package com.bytedance.android.livesdk.livesetting.other.subscribe;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class SubscriptionConfig_OptTypeAdapter extends TypeAdapter<SubscriptionConfig> {
    @Override // com.google.gson.TypeAdapter
    public final SubscriptionConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SubscriptionConfig subscriptionConfig = new SubscriptionConfig(0, 0, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -2056932997) {
                    if (iHashCode != 1319146309) {
                        if (iHashCode == 1486960557 && strLJJJJ.equals("live_sub_emote_enable_edit")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                subscriptionConfig.emoteEditEnable = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("live_sub_emote_enable_preview")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            subscriptionConfig.emotePreviewEnable = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("subscription_community_enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        subscriptionConfig.communityEnable = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return subscriptionConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SubscriptionConfig subscriptionConfig) {
        SubscriptionConfig subscriptionConfig2 = subscriptionConfig;
        if (subscriptionConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("subscription_community_enable");
        c09dl.LJJJJ(Integer.valueOf(subscriptionConfig2.communityEnable));
        c09dl.LJIILLIIL("live_sub_emote_enable_edit");
        c09dl.LJJJJ(Integer.valueOf(subscriptionConfig2.emoteEditEnable));
        c09dl.LJIILLIIL("live_sub_emote_enable_preview");
        c09dl.LJJJJ(Integer.valueOf(subscriptionConfig2.emotePreviewEnable));
        c09dl.LJII();
    }
}
