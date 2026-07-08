package com.bytedance.android.livesdk.livesetting.subscription;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveSubscriptionAnchorSubathonUrlConfig_OptTypeAdapter extends TypeAdapter<LiveSubscriptionAnchorSubathonUrlConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveSubscriptionAnchorSubathonUrlConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveSubscriptionAnchorSubathonUrlConfig liveSubscriptionAnchorSubathonUrlConfig = new LiveSubscriptionAnchorSubathonUrlConfig("", "", "", "", "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2037153461:
                        if (strLJJJJ.equals("subathon_faq")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorSubathonUrlConfig.setSubathonFaq(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1681781650:
                        if (strLJJJJ.equals("subathon_management")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorSubathonUrlConfig.setSubathonManagement(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1463291363:
                        if (strLJJJJ.equals("subathon_management_live")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorSubathonUrlConfig.setSubathonManagementLive(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1004242436:
                        if (strLJJJJ.equals("subathon_detail")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorSubathonUrlConfig.setSubathonDetail(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1138622304:
                        if (strLJJJJ.equals("subathon_faq_live")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorSubathonUrlConfig.setSubathonFaqLive(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1613876559:
                        if (strLJJJJ.equals("subathon_detail_live")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorSubathonUrlConfig.setSubathonDetailLive(c09cu.LJJJZ());
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
        return liveSubscriptionAnchorSubathonUrlConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveSubscriptionAnchorSubathonUrlConfig liveSubscriptionAnchorSubathonUrlConfig) {
        LiveSubscriptionAnchorSubathonUrlConfig liveSubscriptionAnchorSubathonUrlConfig2 = liveSubscriptionAnchorSubathonUrlConfig;
        if (liveSubscriptionAnchorSubathonUrlConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("subathon_management");
        c09dl.LJJJJJ(liveSubscriptionAnchorSubathonUrlConfig2.getSubathonManagement());
        c09dl.LJIILLIIL("subathon_detail");
        c09dl.LJJJJJ(liveSubscriptionAnchorSubathonUrlConfig2.getSubathonDetail());
        c09dl.LJIILLIIL("subathon_management_live");
        c09dl.LJJJJJ(liveSubscriptionAnchorSubathonUrlConfig2.getSubathonManagementLive());
        c09dl.LJIILLIIL("subathon_detail_live");
        c09dl.LJJJJJ(liveSubscriptionAnchorSubathonUrlConfig2.getSubathonDetailLive());
        c09dl.LJIILLIIL("subathon_faq");
        c09dl.LJJJJJ(liveSubscriptionAnchorSubathonUrlConfig2.getSubathonFaq());
        c09dl.LJIILLIIL("subathon_faq_live");
        c09dl.LJJJJJ(liveSubscriptionAnchorSubathonUrlConfig2.getSubathonFaqLive());
        c09dl.LJII();
    }
}
