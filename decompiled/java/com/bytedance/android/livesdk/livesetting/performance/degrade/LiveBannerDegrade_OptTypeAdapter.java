package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveBannerDegrade_OptTypeAdapter extends TypeAdapter<LiveBannerDegrade> {
    public final Gson LIZ;

    public LiveBannerDegrade_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveBannerDegrade read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveBannerDegrade liveBannerDegrade = new LiveBannerDegrade();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != 766946664) {
                    if (iHashCode != 1267835235) {
                        if (iHashCode == 1770596241 && strLJJJJ.equals("enable_recycle_webview")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBannerDegrade.enableRecycleWebview = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("delay_load_banner_time")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveBannerDegrade.delayLoadBannerTime = c09cu.LJJJ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable_banner")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveBannerDegrade.enableBanner = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveBannerDegrade;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveBannerDegrade liveBannerDegrade) throws IOException {
        LiveBannerDegrade liveBannerDegrade2 = liveBannerDegrade;
        if (liveBannerDegrade2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_banner");
        c09dl.LJJJJJL(liveBannerDegrade2.enableBanner);
        c09dl.LJIILLIIL("enable_recycle_webview");
        c09dl.LJJJJJL(liveBannerDegrade2.enableRecycleWebview);
        c09dl.LJIILLIIL("delay_load_banner_time");
        c09dl.LJJIZ(liveBannerDegrade2.delayLoadBannerTime);
        c09dl.LJII();
    }
}
