package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.wallet.LiveGoogleABSCashierURLSetting;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveGoogleABSCashierURLSetting_LiveGoogleABSCashierURLs_OptTypeAdapter extends TypeAdapter<LiveGoogleABSCashierURLSetting.LiveGoogleABSCashierURLs> {
    @Override // com.google.gson.TypeAdapter
    public final LiveGoogleABSCashierURLSetting.LiveGoogleABSCashierURLs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGoogleABSCashierURLSetting.LiveGoogleABSCashierURLs liveGoogleABSCashierURLs = new LiveGoogleABSCashierURLSetting.LiveGoogleABSCashierURLs("sslocal://webcast_webview_popup?url=https%3A%2F%2Finapp.tiktokv.com%2Fwallet%2Fcashier%2Fabs&hide_nav_bar=1&height=90%25&radius=8&request_page=live_detail", "sslocal://webcast_webview_popup?url=https%3A%2F%2Finapp.tiktokv.com%2Fwallet%2Fcashier%2Fabs&hide_nav_bar=1&height=90%25&show_mask=1&mask_bg_color=00000050&radius=8&request_page=my_profile", "sslocal://webcast_webview?url=https%3A%2F%2Fsupport.google.com%2Fgoogleplay%2Fanswer%2F11174377&hide_nav_bar=1");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1953156670) {
                    if (iHashCode != -996320770) {
                        if (iHashCode == 460714352 && strLJJJJ.equals("google_abs_help_center_url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGoogleABSCashierURLs.googleABSHelpCenterUrl = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("live_room_url")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveGoogleABSCashierURLs.liveRoomCashierUrl = c09cu.LJJJZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("balance_page_url")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveGoogleABSCashierURLs.balancePageCashierUrl = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveGoogleABSCashierURLs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGoogleABSCashierURLSetting.LiveGoogleABSCashierURLs liveGoogleABSCashierURLs) {
        LiveGoogleABSCashierURLSetting.LiveGoogleABSCashierURLs liveGoogleABSCashierURLs2 = liveGoogleABSCashierURLs;
        if (liveGoogleABSCashierURLs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_room_url");
        c09dl.LJJJJJ(liveGoogleABSCashierURLs2.liveRoomCashierUrl);
        c09dl.LJIILLIIL("balance_page_url");
        c09dl.LJJJJJ(liveGoogleABSCashierURLs2.balancePageCashierUrl);
        c09dl.LJIILLIIL("google_abs_help_center_url");
        c09dl.LJJJJJ(liveGoogleABSCashierURLs2.googleABSHelpCenterUrl);
        c09dl.LJII();
    }
}
