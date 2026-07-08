package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRevenueFeatureCollectService_OptTypeAdapter extends TypeAdapter<LiveRevenueFeatureCollectService> {
    @Override // com.google.gson.TypeAdapter
    public final LiveRevenueFeatureCollectService read(C09CU c09cu) {
        LiveRevenueFeatureCollectService liveRevenueFeatureCollectService = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveRevenueFeatureCollectService = new LiveRevenueFeatureCollectService("live_revenue_feature_collect", 0);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "business_name")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveRevenueFeatureCollectService.businessName = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveRevenueFeatureCollectService.enable = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveRevenueFeatureCollectService;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRevenueFeatureCollectService liveRevenueFeatureCollectService) {
        LiveRevenueFeatureCollectService liveRevenueFeatureCollectService2 = liveRevenueFeatureCollectService;
        if (liveRevenueFeatureCollectService2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("business_name");
        c09dl.LJJJJJ(liveRevenueFeatureCollectService2.businessName);
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJ(Integer.valueOf(liveRevenueFeatureCollectService2.enable));
        c09dl.LJII();
    }
}
