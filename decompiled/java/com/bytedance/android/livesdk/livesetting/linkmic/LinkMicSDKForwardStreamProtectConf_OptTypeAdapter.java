package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LinkMicSDKForwardStreamProtectConf_OptTypeAdapter extends TypeAdapter<LinkMicSDKForwardStreamProtectConf> {
    public final Gson LIZ;

    public LinkMicSDKForwardStreamProtectConf_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LinkMicSDKForwardStreamProtectConf read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkMicSDKForwardStreamProtectConf linkMicSDKForwardStreamProtectConf = new LinkMicSDKForwardStreamProtectConf(true, true, 20L, 15L, 15L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1082443900:
                        if (strLJJJJ.equals("apply_group_recharge_timer_inverval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicSDKForwardStreamProtectConf.applyRechargeTimerInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -616720892:
                        if (strLJJJJ.equals("push_more_timer_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicSDKForwardStreamProtectConf.pushMoreTimerInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -190841442:
                        if (strLJJJJ.equals("enable_push_more")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicSDKForwardStreamProtectConf.enablePushMore = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1133896159:
                        if (strLJJJJ.equals("invite_group_recharge_timer_inverval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicSDKForwardStreamProtectConf.inviteRechargeTimerInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1812682945:
                        if (strLJJJJ.equals("enable_miss_push")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicSDKForwardStreamProtectConf.enableMissPush = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return linkMicSDKForwardStreamProtectConf;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicSDKForwardStreamProtectConf linkMicSDKForwardStreamProtectConf) throws IOException {
        LinkMicSDKForwardStreamProtectConf linkMicSDKForwardStreamProtectConf2 = linkMicSDKForwardStreamProtectConf;
        if (linkMicSDKForwardStreamProtectConf2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_miss_push");
        c09dl.LJJJJJL(linkMicSDKForwardStreamProtectConf2.enableMissPush);
        c09dl.LJIILLIIL("enable_push_more");
        c09dl.LJJJJJL(linkMicSDKForwardStreamProtectConf2.enablePushMore);
        c09dl.LJIILLIIL("push_more_timer_interval");
        c09dl.LJJIZ(linkMicSDKForwardStreamProtectConf2.pushMoreTimerInterval);
        c09dl.LJIILLIIL("invite_group_recharge_timer_inverval");
        c09dl.LJJIZ(linkMicSDKForwardStreamProtectConf2.inviteRechargeTimerInterval);
        c09dl.LJIILLIIL("apply_group_recharge_timer_inverval");
        c09dl.LJJIZ(linkMicSDKForwardStreamProtectConf2.applyRechargeTimerInterval);
        c09dl.LJII();
    }
}
